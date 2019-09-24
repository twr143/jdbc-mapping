CREATE OR REPLACE FUNCTION sp_test(nm varchar) RETURNS INTEGER AS $$
DECLARE
BEGIN
  return count(*) from city where name ilike '%'||nm||'%';
END;
$$ LANGUAGE plpgsql;

