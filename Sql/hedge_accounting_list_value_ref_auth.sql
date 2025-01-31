create table if not exists hedge_accounting_list_value_ref_auth(
authorizer_id bigint not null,
accounting_list_value_cat_code varchar(255) null,
accounting_list_value_sub_cat_code varchar(255) null,
code_owner varchar(255) null,
code_verifier varchar(255) null,
code_completion_team varchar(255) null,
email_group varchar(255) null,
ref_data_id bigint null,
sequence Integer null,
modular_data varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint hedge_accounting_list_value_ref_auth_pk primary key(authorizer_id));