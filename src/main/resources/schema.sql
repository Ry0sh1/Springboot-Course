CREATE TABLE IF NOT EXISTS Content(
                                      id SERIAL PRIMARY KEY,
                                      title VARCHAR(50) NOT NULL,
                                      description TEXT,
                                      status VARCHAR(20) NOT NULL,
                                      content_type VARCHAR(50) NOT NULL,
                                      date_created TIMESTAMP NOT NULL,
                                      date_updated TIMESTAMP,
                                      url VARCHAR(255)
);

/*
INSERT INTO Content(
                    title,
                    desc,
                    status,
                    content_type,
                    date_created)
VALUES (
        'Title'
        ,'Description',
        'IDEA',
        'COURSE',
        CURRENT_TIMESTAMP);
*/
