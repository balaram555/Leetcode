# Write your MySQL query statement below
select distinct author_id as id from Views where author_id IN(select distinct viewer_id from Views)
ORDER BY id;