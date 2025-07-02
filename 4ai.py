import asyncio
import json
import pandas as pd
from crawl4ai import AsyncWebCrawler, CrawlerRunConfig, CacheMode
from crawl4ai.extraction_strategy import JsonCssExtractionStrategy

async def main():
    # 1. Định nghĩa schema như ví dụ trước
    schema = {
        "name": "BooksToScrape",
        "baseSelector": "article.product_pod",
        "fields": [
            {"name": "title", "selector": "h3 > a", "type": "attribute", "attribute": "title"},
            {"name": "detail_page", "selector": "h3 > a", "type": "attribute", "attribute": "href"},
            {"name": "price", "selector": "p.price_color", "type": "text"},
            {"name": "availability", "selector": "p.instock.availability", "type": "text", "transforms": ["strip"]},
            {"name": "rating", "selector": "p.star-rating", "type": "regex", "pattern": "star-rating (\\w+)"}
        ]
    }

    # 2. Chạy crawler
    async with AsyncWebCrawler() as crawler:
        result = await crawler.arun(
            url="https://books.toscrape.com/",
            config=CrawlerRunConfig(
                cache_mode=CacheMode.BYPASS,
                extraction_strategy=JsonCssExtractionStrategy(schema)
            )
        )

        # 3. Parse JSON về Python list of dicts
        data = json.loads(result.extracted_content)

        # 4. Chuyển sang DataFrame và xuất CSV
        df = pd.DataFrame(data)
        df.to_csv("books.csv", index=False, encoding="utf-8-sig")
        print("Đã lưu file books.csv với", len(df), "dòng.")

if __name__ == "__main__":
    asyncio.run(main())
