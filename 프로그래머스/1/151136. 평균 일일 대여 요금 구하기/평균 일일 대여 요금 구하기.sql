-- 코드를 입력하세요
SELECT round(avg(a.daily_fee),0) as 'AVERAGE_FEE'
from CAR_RENTAL_COMPANY_CAR a
where a.car_type = 'SUV'
;