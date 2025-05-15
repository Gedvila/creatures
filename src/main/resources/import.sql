INSERT INTO tb_element (name) VALUES ('Medo');
INSERT INTO tb_element (name) VALUES ('Morte');
INSERT INTO tb_element (name) VALUES ('Conhecimento');
INSERT INTO tb_element (name) VALUES ('Energia');
INSERT INTO tb_element (name) VALUES ('Sangue');

// Tempestuoso
INSERT INTO tb_creatures (name,vd,element_id,dt,mental_damage,nex_immunity) VALUES ('Tempestuoso',360,4,40,'8d8',null);
UPDATE tb_creatures SET health=950, ballistic_res=20, cutting_res=20, piercing_res=20, impact_res=0, blood_res=0, energy_res=20, knowledge_res=0, death_res=0, immunity='Condições de paralisia', vulnerability='Conhecimento' WHERE id = 1;
UPDATE tb_creatures SET strength=4, agility=5, intellect=2, presence=5, vitality=4 WHERE id = 1;
UPDATE tb_creatures SET creature_defense=56, fortitude=20, reflex=30, will=25 WHERE id = 1;
INSERT INTO tb_skills(creatures_id,name,description) VALUES (1,'Aura Radioativa','Qualquer ser que comece seu turno em alcance curto do tempestuoso sofre 2d20+20 pontos de dano de Energia (Fortitude DT 40 reduz à metade).');
INSERT INTO tb_skills(creatures_id,name,description) VALUES (1,'Espectro Radioativo','O tempestuoso manifesta um espectro de radiação à sua volta, que atua como uma extensão de seu corpo físico. Todos os ataques e habilidades corpo a corpo do tempestuoso podem ser feitos em alcance curto.');
INSERT INTO tb_actions(creatures_id,action_type,name,description,attack_quantity,damage,damage_type,attack_bonus) VALUES (1,'PADRÃO','Agredir','As garras radioativas do tempestuoso podem atingir alvos em alcance curto, mesmo sendo ataques corpo a corpo.',2,'4d20+20','Energia',40);
INSERT INTO tb_actions(creatures_id,action_type,name,description) VALUES (1,'LIVRE','Raio de Energia Radioativa','Quando acerta dois ataques de garras radioativas em um mesmo ser, o tempestuoso faz com que um raio de energia radioativa seja projetado deste ser em direção a outro alvo em alcance médio. Este alvo sofre 4d20+20 pontos de dano de Energia (Reflexos DT 40 reduz à metade).');
INSERT INTO tb_actions(creatures_id,action_type,name,description) VALUES (1,'COMPLETA','Expandir em Radiação','O tempestuoso concentra energia radioativa em volta de si para depois expandi-la como uma explosão de Energia. Cada ser em alcance longo sofre 10d20+20 pontos de dano de Energia (Reflexos DT 40 reduz à metade). O próprio tempestuoso perde 100 PV quando usa esta habilidade.');

// Zumbi de Sangue
INSERT INTO tb_creatures (name,vd,element_id) VALUES ('Zumbi de Sangue',20,5);
UPDATE tb_creatures SET dt=40, mental_damage='2d6', nex_immunity=25 WHERE id = 2;
UPDATE tb_creatures SET health=950, ballistic_res=5, cutting_res=0, piercing_res=5, impact_res=5, blood_res=10, energy_res=20, knowledge_res=0, death_res=0, vulnerability='Morte' WHERE id = 2;
UPDATE tb_creatures SET strength=2, agility=2, intellect=0, presence=1, vitality=2 WHERE id = 2;
UPDATE tb_creatures SET creature_defense=15, fortitude=5, reflex=5, will=5 WHERE id = 2;
INSERT INTO tb_actions(creatures_id,action_type,name,description,attack_quantity,damage,damage_type,attack_bonus) VALUES (2,'PADRÃO','Agredir','Ataca com as garras de sangue',2,'1d6+5','Corte',5);

