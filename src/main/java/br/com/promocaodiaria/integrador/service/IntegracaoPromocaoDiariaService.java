package br.com.promocaodiaria.integrador.service;

import br.com.promocaodiaria.integrador.pg.model.ProdutoPromoDiaria;

public interface IntegracaoPromocaoDiariaService {

	public Response adicionarProduto(ProdutoPromoDiaria produtoPromoDiaria);
	public Response editarProduto(ProdutoPromoDiaria produtoPromoDiaria);
	public Response baixaEstoque(ProdutoPromoDiaria produto);
	public boolean adicionarListaProdutos();
}
