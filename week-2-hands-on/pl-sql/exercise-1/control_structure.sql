DECLARE
    v_number NUMBER := 15;
    v_grade CHAR(1) := 'B';
    v_counter NUMBER := 1;
    v_sum NUMBER := 0;
BEGIN
    DBMS_OUTPUT.PUT_LINE('=== Control Structures Demo ===');
    
    -- IF-ELSE Structure
    DBMS_OUTPUT.PUT_LINE('1. IF-ELSE Structure:');
    IF v_number > 10 THEN
        DBMS_OUTPUT.PUT_LINE('Number ' || v_number || ' is greater than 10');
    ELSIF v_number = 10 THEN
        DBMS_OUTPUT.PUT_LINE('Number is exactly 10');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Number is less than 10');
    END IF;
    
    -- CASE Structure
    DBMS_OUTPUT.PUT_LINE('2. CASE Structure:');
    CASE v_grade
        WHEN 'A' THEN DBMS_OUTPUT.PUT_LINE('Excellent!');
        WHEN 'B' THEN DBMS_OUTPUT.PUT_LINE('Good job!');
        WHEN 'C' THEN DBMS_OUTPUT.PUT_LINE('Average performance');
        ELSE DBMS_OUTPUT.PUT_LINE('Needs improvement');
    END CASE;
    
    -- FOR Loop
    DBMS_OUTPUT.PUT_LINE('3. FOR Loop (1 to 5):');
    FOR i IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE('Iteration: ' || i);
    END LOOP;
    
    -- WHILE Loop
    DBMS_OUTPUT.PUT_LINE('4. WHILE Loop (sum first 3 numbers):');
    WHILE v_counter <= 3 LOOP
        v_sum := v_sum + v_counter;
        DBMS_OUTPUT.PUT_LINE('Adding ' || v_counter || ', Sum: ' || v_sum);
        v_counter := v_counter + 1;
    END LOOP;
    
    -- Basic LOOP with EXIT
    DBMS_OUTPUT.PUT_LINE('5. Basic LOOP with EXIT:');
    v_counter := 1;
    LOOP
        DBMS_OUTPUT.PUT_LINE('Loop iteration: ' || v_counter);
        v_counter := v_counter + 1;
        EXIT WHEN v_counter > 3;
    END LOOP;
    
END;
/