INSERT INTO public.doc_type (id, code, "name") VALUES(1, '03', 'Свидетельство о рождении');
INSERT INTO public.doc_type (id, code, "name") VALUES(2, '07', 'Военный билет');
INSERT INTO public.doc_type (id, code, "name") VALUES(3, '08', 'Временное удостоверение, выданное взамен военного билета');
INSERT INTO public.doc_type (id, code, "name") VALUES(4, '10', 'Паспорт иностранного гражданина');
INSERT INTO public.doc_type (id, code, "name") VALUES(5, '12', 'Вид на жительство в РФ');
INSERT INTO public.doc_type (id, code, "name") VALUES(6, '13', 'Удостоверение беженца');
INSERT INTO public.doc_type (id, code, "name") VALUES(7, '21', 'Паспорт гражданина РФ');
INSERT INTO public.doc_type (id, code, "name") VALUES(8, '22', 'Загранпаспорт гражданина РФ');
INSERT INTO public.doc_type (id, code, "name") VALUES(9, '91', 'Иные документы');

INSERT INTO public.persons (id, birth_date, email, first_name, gender, last_name, middle_name) VALUES(1, '2000-12-12', 'iip@mail.ru', 'Иван', 1, 'Иванов', 'Петрович');
INSERT INTO public.persons (id, birth_date, email, first_name, gender, last_name, middle_name) VALUES(2, '1999-11-12', 'pki@mail.ru', 'Петр', 1, 'Кошкин', 'Иванович');

INSERT INTO public.documents (id, description, numeral, series, title, person_id, type_code) VALUES(1, NULL, '54545', '4545', 'Военник', 1, '07');
INSERT INTO public.documents (id, description, numeral, series, title, person_id, type_code) VALUES(2, NULL, '444', '111', 'Загранпаспорт', 2, '22');

INSERT INTO public.clients (id, "password", person) VALUES(1, '123', 1);
INSERT INTO public.clients (id, "password", person) VALUES(2, '321', 2);


