-- https://leetcode.com/problems/employee-bonus/description/?envType=study-plan-v2&envId=top-sql-50
SELECT e.name, b.bonus
FROM Employee e
LEFT OUTER JOIN Bonus b ON e.empId = b.empId
WHERE b.bonus IS NULL OR b.bonus < 1000