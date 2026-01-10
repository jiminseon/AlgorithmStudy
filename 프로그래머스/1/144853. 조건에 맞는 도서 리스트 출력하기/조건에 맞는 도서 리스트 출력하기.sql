-- 코드를 입력하세요
SELECT book_id, date_format(published_date, '20%y-%m-%d')
from book
where category = "인문"
and published_date like "2021%"
;