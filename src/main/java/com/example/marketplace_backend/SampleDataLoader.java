package com.example.marketplace_backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SampleDataLoader {

    private ShoeRepository shoeRepository;

    @Autowired
    public SampleDataLoader(ShoeRepository shoeRepository){ this.shoeRepository = shoeRepository;}

    @PostConstruct
    public void loadSampleData(){
        shoeRepository.saveAll(List.of(
                new Shoe("Zapatillas veganas Manimal Black", "0 animales muertos para producir estas zapatillas veganas hechas con materiales vegetales, reciclados y sostenibles, hechas a mano de forma ética en Portugal y con un embalaje de cero residuos con una bolsa de yute de regalo.", "BEFLAMBOYANT", 36, 129.95, "https://cdn.shopify.com/s/files/1/0511/6592/1467/products/vegan-shoes-beflamboyant-manimal-black-side-view_1024x1024@2x.jpg?v=1637142787"),
                new Shoe("UX-68 Zapatos veganos de leopardo", "0 animales muertos para producir estas zapatillas veganas hechas con materiales vegetales, reciclados y sostenibles, hechas a mano de forma ética en Portugal y con un embalaje de cero residuos con una bolsa de yute de regalo.", "BEFLAMBOYANT", 37, 129.95, "https://cdn.shopify.com/s/files/1/0511/6592/1467/products/vegan-shoes-beflamboyant-ux68-leopard-side-view_1024x1024@2x.jpg?v=1643442921"),
                new Shoe("UX-68 Zapatos veganos de color caramelo", "0 animales muertos para producir estas zapatillas veganas hechas con materiales vegetales, reciclados y sostenibles, hechas a mano de forma ética en Portugal y con un embalaje de cero residuos con una bolsa de yute de regalo.", "BEFLAMBOYANT", 39, 129.95, "https://cdn.shopify.com/s/files/1/0511/6592/1467/products/vegan-sneakers-caramel-side_1024x1024@2x.jpg?v=1644169671"),
                new Shoe("Sisto Fume – Olive", "The Sisto Fume is part of our cooler weather collection. A style that is ideal for comfort in the house and around the barrio when the temperatures come down.. Constructed with acrylic blend uppers and a slightly thicker lining for warmth. 100% made in Spain.", "MAIANS", 38, 99.00, "https://www.maiansfootwear.com/wp-content/uploads/2021/10/8271-35-106_lateral.jpg"),
                new Shoe("Sisto Perforado – Navy", "The Sisto Fume is part of our cooler weather collection. A style that is ideal for comfort in the house and around the barrio when the temperatures come down.. Constructed with acrylic blend uppers and a slightly thicker lining for warmth. 100% made in Spain.", "MAIANS", 36, 129.00, "https://cdn.shopify.com/s/files/1/0511/6592/1467/products/vegan-shoes-beflamboyant-ux68-leopard-side-view_1024x1024@2x.jpg?v=1643442921"),
                new Shoe("Sisto Perforado – Ice", "The Sisto Fume is part of our cooler weather collection. A style that is ideal for comfort in the house and around the barrio when the temperatures come down.. Constructed with acrylic blend uppers and a slightly thicker lining for warmth. 100% made in Spain.", "MAIANS", 39, 129.00, "https://www.maiansfootwear.com/wp-content/uploads/2021/06/2071-05-010_Lateral.jpg"),
                new Shoe("Zapatillas Veganas de Algodón Reciclado Negro//Shanti", "Zapatillas Cuvier están fabricadas con tejido de algodón reciclado. La plantilla ergonómica extraíble de PU reciclado y la suela solo cosida al corte le aporta máxima flexibilidad, comodidad y reciclabilidad a este modelo atemporal hecho a mano bajo pedido en nuestro propio taller de Elche.", "VESICA PISCIS", 38, 79.00, "https://vesicapiscisfootwear.com/2418-large_default/xzapatillas-veganas-de-algodon-reciclado-negroshanti.jpg.pagespeed.ic.SfBCyanEPN.webp"),
                new Shoe("Zapatillas recicladas de plástico del mar", "Zapatillas Cuvier están fabricadas con tejido de algodón reciclado. La plantilla ergonómica extraíble de PU reciclado y la suela solo cosida al corte le aporta máxima flexibilidad, comodidad y reciclabilidad a este modelo atemporal hecho a mano bajo pedido en nuestro propio taller de Elche.", "VESICA PISCIS", 39, 77.00, "https://vesicapiscisfootwear.com/1398-large_default/xzapatillas-veganas-de-algodon-y-poliester-reciclado-palmer.jpg.pagespeed.ic.-CKopLVG34.webp"),
                new Shoe("Botines veganos de algodón reciclado kaki", "El botín Pitágoras está fabricado con tejido de algodón reciclado. La plantilla ergonómica extraíble de PU reciclado y la suela solo cosida al corte le aporta máxima flexibilidad, comodidad y reciclabilidad a este modelo atemporal hecho a mano bajo pedido en nuestro propio taller de Elche.", "VESICA PISCIS", 38, 79.00, "https://vesicapiscisfootwear.com/1344-large_default/xbotines-veganos-de-algodon-reciclado-kaki.jpg.pagespeed.ic.xy8L45VWZf.webp")
        ));
    }
}
