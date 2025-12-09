SELECT r.name, s.bonus
FROM Employee r
LEFT JOIN Bonus s
    ON r.empId = s.empId
WHERE s.bonus < 1000 OR s.bonus IS NULL;
