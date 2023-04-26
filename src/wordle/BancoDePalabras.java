/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author poppe
 */
public class BancoDePalabras {
    private ArrayList<String> banco;
    private Random rmd;
    public BancoDePalabras(){
        rmd = new Random();
        banco = new ArrayList<>();
        banco.add("abuela");
        banco.add("actriz");
        banco.add("acceso");
        banco.add("agente");
        banco.add("agonia");
        banco.add("aldeas");
        banco.add("alerta");
        banco.add("altura");
        banco.add("amigas");
        banco.add("aparte");
        banco.add("armada");
        banco.add("asalto");
        banco.add("ataque");
        banco.add("aunque");
        banco.add("avance");
        banco.add("avisar");
        banco.add("azucar");
        banco.add("balcon");
        banco.add("barbas");
        banco.add("basado");
        banco.add("bebida");
        banco.add("besado");
        banco.add("biblia");
        banco.add("bistec");
        banco.add("blanca");
        banco.add("bloque");
        banco.add("bolita");
        banco.add("bondad");
        banco.add("bonita");
        banco.add("borrar");
        banco.add("bosque");
        banco.add("brillo");
        banco.add("bromas");
        banco.add("brotes");
        banco.add("brusca");
        banco.add("brutal");
        banco.add("buenas");
        banco.add("buenos");
        banco.add("buscan");
        banco.add("basico");
        banco.add("cabeza");
        banco.add("cambia");
        banco.add("cascos");
        banco.add("casita");
        banco.add("causar");
        banco.add("callar");
        banco.add("calles");
        banco.add("calmar");
        banco.add("cegado");
        banco.add("celosa");
        banco.add("danzas");
        banco.add("debajo");
        banco.add("debido");
        banco.add("dioses");
        banco.add("discos");
        banco.add("dormir");
        banco.add("dramas");
        banco.add("dulces");
        banco.add("dudaba");
        banco.add("dureza");
        banco.add("empezo");
        banco.add("empujo");
        banco.add("encaje");
        banco.add("encima");
        banco.add("enfria");
        banco.add("enlazo");
        banco.add("entera");
        banco.add("entero");
        banco.add("europa");
        banco.add("evitar");
        banco.add("evocar");
        banco.add("exacta");
        banco.add("exacto");
        banco.add("famosa");
        banco.add("fatiga");
        banco.add("fervor");
        banco.add("fiebre");
        banco.add("fiesta");
        banco.add("figura");
        banco.add("filtro");
        banco.add("fingir");
        banco.add("flecha");
        banco.add("flotar");
        banco.add("fluido");
        banco.add("fresas");
        banco.add("frutas");
        banco.add("fragil");
        banco.add("fuegos");
        banco.add("fuente");
        banco.add("fuerte");
        banco.add("futura");
        banco.add("ganado");
        banco.add("garras");
        banco.add("gloria");
        banco.add("granos");
        banco.add("graves");
        banco.add("gritar");
        banco.add("hablan");
        banco.add("habran");
        banco.add("habria");
        banco.add("hacian");
        banco.add("hallar");
        banco.add("hechas");
        banco.add("hechos");
        banco.add("helada");
        banco.add("helado");
        banco.add("herido");
        banco.add("hierro");
        banco.add("huecos");
        banco.add("huelen");
        banco.add("huella");
        banco.add("huesos");
        banco.add("huevos");
        banco.add("ignora");
        banco.add("imagen");
        banco.add("imitar");
        banco.add("indica");
        banco.add("indice");
        banco.add("inerte");
        banco.add("infiel");
        banco.add("ingles");
        banco.add("inicio");
        banco.add("invita");
        banco.add("jardin");
        banco.add("jarron");
        banco.add("juegan");
        banco.add("juegos");
        banco.add("juicio");
        banco.add("juntas");
        banco.add("justas");
        banco.add("juzgan");
        banco.add("labios");
        banco.add("lanzar");
        banco.add("largos");
        banco.add("lleven");
        banco.add("llorar");
        banco.add("lluvia");
        banco.add("lograr");
        banco.add("luchar");
        banco.add("lustre");
        banco.add("madera");
        banco.add("maduro");
        banco.add("maleza");
        banco.add("marcha");
        banco.add("marina");
        banco.add("medida");
        banco.add("mision");
        banco.add("montar");
        banco.add("morada");
        banco.add("mortal");
        banco.add("musica");
        banco.add("nacida");
        banco.add("nativa");
        banco.add("negaba");
        banco.add("nervio");
        banco.add("neutro");
        banco.add("nietos");
        banco.add("ningun");
        banco.add("nobles");
        banco.add("noches");
        banco.add("nombre");
        banco.add("normal");
        banco.add("numero");
        banco.add("objeto");
        banco.add("obrera");
        banco.add("octava");
        banco.add("ocupan");
        banco.add("ocurre");
        banco.add("olvido");
        banco.add("omitir");
        banco.add("origen");
        banco.add("orilla");
        banco.add("oscura");
        banco.add("olfato");
        banco.add("olores");
        banco.add("padres");
        banco.add("pagado");
        banco.add("parece");
        banco.add("parque");
        banco.add("parten");
        banco.add("pelota");
        banco.add("pensar");
        banco.add("perdon");
        banco.add("perfil");
        banco.add("pescar");
        banco.add("piedad");
        banco.add("piedra");
        banco.add("pienso");
        banco.add("pierna");
        banco.add("piezas");
        banco.add("pobres");
        banco.add("plumas");
        banco.add("poemas");
        banco.add("porque");
        banco.add("poseer");
        banco.add("puerta");
        banco.add("puntos");
        banco.add("quedan");
        banco.add("quejas");
        banco.add("quemar");
        banco.add("querer");
        banco.add("quiere");
        banco.add("quieta");
        banco.add("quinto");
        banco.add("rasgos");
        banco.add("recibo");
        banco.add("regala");
        banco.add("reposo");
        banco.add("retuvo");
        banco.add("revela");
        banco.add("riesgo");
        banco.add("ritual");
        banco.add("romper");
        banco.add("rompia");
        banco.add("rostro");
        banco.add("ruinas");
        banco.add("rutina");
        banco.add("sabios");
        banco.add("saciar");
        banco.add("salida");
        banco.add("saludo");
        banco.add("sangre");
        banco.add("santos");
        banco.add("sector");
        banco.add("segura");
        banco.add("semana");
        banco.add("sentir");
        banco.add("separo");
        banco.add("sesion");
        banco.add("sonido");
        banco.add("soplar");
        banco.add("subido");
        banco.add("sufrir");
        banco.add("sujeto");
        banco.add("supone");
        banco.add("surgio");
        banco.add("tareas");
        banco.add("teclas");
        banco.add("tejado");
        banco.add("templo");
        banco.add("tengan");
        banco.add("tercer");
        banco.add("terror");
        banco.add("tesoro");
        banco.add("tienda");
        banco.add("tierra");
        banco.add("tocado");
        banco.add("torres");
        banco.add("traste");
        banco.add("tratan");
        banco.add("tratos");
        banco.add("trenes");
        banco.add("trigos");
        banco.add("trueno");
        banco.add("unidad");
        banco.add("unirse");
        banco.add("usando");
        banco.add("vacias");
        banco.add("varias");
        banco.add("vencer");
        banco.add("verano");
        banco.add("verdes");
        banco.add("viajes");
        banco.add("vicios");
        banco.add("viejas");
        banco.add("viendo");
        banco.add("violin");
        banco.add("virtud");
        banco.add("vision");
        banco.add("visual");
        banco.add("vuelta");
    }
    
    public int size(){
        return banco.size();
    }
    
    public String palabraClave(){
        return banco.get(rmd.nextInt(banco.size()));
    }
    
    public boolean existe(String palabra){
        return banco.contains(palabra);
    }
}
