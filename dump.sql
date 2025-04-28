--
-- PostgreSQL database dump
--

-- Dumped from database version 13.8
-- Dumped by pg_dump version 13.8

-- Started on 2025-04-28 11:35:54 UTC

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 3 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: -
--

-- CREATE SCHEMA public;


--
-- TOC entry 3001 (class 0 OID 0)
-- Dependencies: 3
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 200 (class 1259 OID 24660)
-- Name: tb_produto; Type: TABLE; Schema: public; Owner: -
--

CREATE TABLE public.tb_produto (
    id uuid NOT NULL,
    categoria character varying(15) NOT NULL,
    data_criacao timestamp without time zone NOT NULL,
    nome_produto character varying(20) NOT NULL,
    quantidade integer NOT NULL,
    valor double precision
);


--
-- TOC entry 2995 (class 0 OID 24660)
-- Dependencies: 200
-- Data for Name: tb_produto; Type: TABLE DATA; Schema: public; Owner: -
--

INSERT INTO public.tb_produto VALUES ('d3e783dd-024e-4d7e-9a68-3020780b3f6a', 'eletronic', '2025-04-26 11:56:46.248944', 'TV plasma', 100, 3400);
INSERT INTO public.tb_produto VALUES ('ef0f8906-0cbe-4d21-ae32-7628659cdf24', 'eletronic', '2025-04-26 20:32:23.952579', 'Geladeira', 4000, 4000);
INSERT INTO public.tb_produto VALUES ('ac0e246f-3ff0-4789-a54e-e7dc53283c41', 'Eletro', '2025-04-27 01:37:10.479975', 'Forno Eletrico', 88, 230);
INSERT INTO public.tb_produto VALUES ('3a4bf5bc-d22d-4903-ae17-0ef2836053a6', 'eletronic', '2025-04-26 11:56:06.156667', 'Notebook Samsung', 100, 6000);


--
-- TOC entry 2864 (class 2606 OID 24664)
-- Name: tb_produto tb_produto_pkey; Type: CONSTRAINT; Schema: public; Owner: -
--

ALTER TABLE ONLY public.tb_produto
    ADD CONSTRAINT tb_produto_pkey PRIMARY KEY (id);


-- Completed on 2025-04-28 11:35:59 UTC

--
-- PostgreSQL database dump complete
--

