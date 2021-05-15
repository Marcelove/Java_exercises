import java.util.ArrayList;
import java.util.List;

public class Asics {

	public static void main(String[] args){

		List<String> listaOriginal = new ArrayList<>();
        listaOriginal.add("G");
        listaOriginal.add("e");
        listaOriginal.add("e");
        listaOriginal.add("k");
        listaOriginal.add("s");


		System.out.println(listaOriginal);

		List<String> listaCorrigida = new ArrayList<>();


		for(String um: listaOriginal) {

			if(!listaCorrigida.contains(um)){

				listaCorrigida.add(um);
			}
		}

		System.out.println(listaCorrigida);

		List<Integer> listaOriginal2 = new ArrayList<>();
        listaOriginal2.add(1);
        listaOriginal2.add(10);
        listaOriginal2.add(2);
        listaOriginal2.add(2);
        listaOriginal2.add(10);
        listaOriginal2.add(3);
        listaOriginal2.add(3);
        listaOriginal2.add(3);
        listaOriginal2.add(3);
        listaOriginal2.add(4);
        listaOriginal2.add(5);
        listaOriginal2.add(5);


        //[1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5]


		System.out.println(listaOriginal2);

		List<Integer> listaCorrigida2 = new ArrayList<>();


		for(Integer um: listaOriginal2) {

			if(!listaCorrigida2.contains(um)){

				listaCorrigida2.add(um);
			}
		}

		System.out.println(listaCorrigida2);
	}
}