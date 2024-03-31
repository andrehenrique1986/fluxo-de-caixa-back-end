package br.com.fluxodecaixa.application;

import br.com.fluxodecaixa.domain.en.enTipoCategoria;
import br.com.fluxodecaixa.domain.en.enTipoCusto;
import br.com.fluxodecaixa.domain.en.enTipoFluxo;
import br.com.fluxodecaixa.domain.en.enTipoFormaPagamento;
import br.com.fluxodecaixa.domain.en.enTipoSubcategoria;

public class TesteEnums {
    public static void main(String[] args) {
    	System.out.println("Testando os Enums !!!!!");
        // Iterar sobre os valores do enum enTipoCategoria
        for (enTipoCategoria tipoCategoria : enTipoCategoria.values()) {
        	System.out.println("");
            System.out.println("Categoria: " + tipoCategoria.getNumero()+ " - " + tipoCategoria.getDescricao());
            
            
            // Iterar sobre as subcategorias da categoria atual
            for (Object subcategoria : tipoCategoria.getSubcategorias()) {
                if (subcategoria instanceof enTipoSubcategoria) {
                	
                    System.out.println("   - Subcategoria: " + ((enTipoSubcategoria) subcategoria).getNumero() + " - " + ((enTipoSubcategoria) subcategoria).getDescricao());
                }
            }
        }
        System.out.println("");
        for (enTipoFluxo tipoFluxo : enTipoFluxo.values()) {
        	System.out.println("Fluxo: " + tipoFluxo.getNumero() + " - " + tipoFluxo.getDescricao());
        }
        
        System.out.println("");
        for (enTipoCusto tipoCusto : enTipoCusto.values()) {
        	System.out.println("Custo: " + tipoCusto.getNumero() + " - " + tipoCusto.getDescricao());
        }
        
        System.out.println("");
        for (enTipoFormaPagamento tipoFormaPagamento : enTipoFormaPagamento.values()) {
        	System.out.println("Forma de Pagamento: " + tipoFormaPagamento.getNumero() + " - " + tipoFormaPagamento.getDescricao());
        }
    }
}
