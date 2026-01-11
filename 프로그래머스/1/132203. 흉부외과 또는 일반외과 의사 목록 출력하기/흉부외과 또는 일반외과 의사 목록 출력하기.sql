-- 코드를 입력하세요
SELECT DR_NAME,	DR_ID,	MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d')
from doctor
where mcdp_cd in ('cs', 'gs')
order by hire_ymd desc, dr_name asc
;