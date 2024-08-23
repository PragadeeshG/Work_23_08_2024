create table if not exists hedge_accounting_list_value_category(
accounting_list_value_cat_code varchar(255) not null,
accounting_list_value_cat_name varchar(255) null,
accounting_list_value_cat_description varchar(255) null,
accounting_list_value_cat_definition varchar(255) null,
authorizer_id bigint null,
owner varchar(255) null,
ps_ids varchar(255) null,
service_name_id bigint null,
creation_date varchar(255) null,
modified_date varchar(255) null,
constraint hedge_accounting_list_value_category_pk primary key(accounting_list_value_cat_code));