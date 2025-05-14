INSERT INTO tb_element (name) VALUES ('Medo');
INSERT INTO tb_element (name) VALUES ('Morte');
INSERT INTO tb_element (name) VALUES ('Conhecimento');
INSERT INTO tb_element (name) VALUES ('Energia');
INSERT INTO tb_element (name) VALUES ('Sangue');

// Tempestuoso
INSERT INTO tb_creatures (name,vd,element_id) VALUES ('Tempestuoso',360,4);
INSERT INTO tb_disturbing (creatures_id,dt,mental_damage,nex_immunity) VALUES (1,40,'8d8',null);
INSERT INTO tb_health (creatures_id,health,ballistic_res,cutting_res,piercing_res,impact_res,blood_res,energy_res,knowledge_res,death_res,immunity,vulnerability) VALUES (1,950,20,20,20,0,0,20,0,0,'Condições de paralisia','Conhecimento');
INSERT INTO tb_attributes (creatures_id,strength,agility,intellect,presence,vitality) VALUES (1,4,5,2,5,4);
INSERT INTO tb_defense (creatures_id,creature_defense,fortitude,reflex,will) VALUES (1,56,20,30,25);
INSERT INTO tb_skills(creatures_id,name,description) VALUES (1,'Aura Radioativa','Qualquer ser que comece seu turno em alcance curto do tempestuoso sofre 2d20+20 pontos de dano de Energia (Fortitude DT 40 reduz à metade).');
INSERT INTO tb_skills(creatures_id,name,description) VALUES (1,'Espectro Radioativo','O tempestuoso manifesta um espectro de radiação à sua volta, que atua como uma extensão de seu corpo físico. Todos os ataques e habilidades corpo a corpo do tempestuoso podem ser feitos em alcance curto.');
INSERT INTO tb_actions(creatures_id,action_type,name,description,attack_quantity,damage,damage_type,attack_bonus) VALUES (1,'PADRÃO','Agredir','As garras radioativas do tempestuoso podem atingir alvos em alcance curto, mesmo sendo ataques corpo a corpo.',2,'4d20+20','Energia',40);
INSERT INTO tb_actions(creatures_id,action_type,name,description) VALUES (1,'LIVRE','Raio de Energia Radioativa','Quando acerta dois ataques de garras radioativas em um mesmo ser, o tempestuoso faz com que um raio de energia radioativa seja projetado deste ser em direção a outro alvo em alcance médio. Este alvo sofre 4d20+20 pontos de dano de Energia (Reflexos DT 40 reduz à metade).');
INSERT INTO tb_actions(creatures_id,action_type,name,description) VALUES (1,'COMPLETA','Expandir em Radiação','O tempestuoso concentra energia radioativa em volta de si para depois expandi-la como uma explosão de Energia. Cada ser em alcance longo sofre 10d20+20 pontos de dano de Energia (Reflexos DT 40 reduz à metade). O próprio tempestuoso perde 100 PV quando usa esta habilidade.');

// Zumbi de Sangue
INSERT INTO tb_creatures (name,vd,element_id) VALUES ('Zumbi de Sangue',20,5);
INSERT INTO tb_disturbing (creatures_id,dt,mental_damage,nex_immunity) VALUES (2,40,'2d6',25);
INSERT INTO tb_health (creatures_id,health,ballistic_res,cutting_res,piercing_res,impact_res,blood_res,energy_res,knowledge_res,death_res,vulnerability) VALUES (2,950,5,0,5,5,10,20,0,0,'Morte');
INSERT INTO tb_attributes (creatures_id,strength,agility,intellect,presence,vitality) VALUES (2,2,2,0,1,2);
INSERT INTO tb_defense (creatures_id,creature_defense,fortitude,reflex,will) VALUES (2,15,5,5,5);
INSERT INTO tb_actions(creatures_id,action_type,name,description,attack_quantity,damage,damage_type,attack_bonus) VALUES (2,'PADRÃO','Agredir','Ataca com as garras de sangue',2,'1d6+5','Corte',5);

