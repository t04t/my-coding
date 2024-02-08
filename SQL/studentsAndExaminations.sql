--https://leetcode.com/problems/students-and-examinations/?envType=study-plan-v2&envId=top-sql-50
SELECT s.student_id, s.student_name, sub.subject_name, COUNT (ex.student_id) AS attended_exams
FROM Students s
CROSS JOIN Subjects sub
LEFT OUTER JOIN Examinations ex ON s.student_id = ex.student_id
AND sub.subject_name = ex.subject_name
GROUP BY s.student_id, s.student_name, sub.subject_name
ORDER BY s.student_id, sub.subject_name