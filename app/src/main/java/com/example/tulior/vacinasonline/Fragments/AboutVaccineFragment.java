package com.example.tulior.vacinasonline.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.example.tulior.vacinasonline.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AboutVaccineFragment extends android.support.v4.app.Fragment {

    ExpandableListView expListView;
    ExpandableListAdapter listAdapter;

    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View baseView = inflater.inflate(R.layout.fragment_about_vaccine, container, false);

        expListView = baseView.findViewById(R.id.lvExp);

        setHasOptionsMenu(true);

        prepareListData();

        listAdapter = new com.example.tulior.vacinasonline.Adapters.ExpandableListAdapter(getActivity(), listDataHeader, listDataChild);

        expListView.setAdapter(listAdapter);

        return baseView;
    }

    @Override
    public void onPrepareOptionsMenu(Menu menu) {
        menu.clear();
    }

    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Hepatite B");
        listDataHeader.add("Poliomelite");
        listDataHeader.add("Gripe");
        listDataHeader.add("Febre Amarela");
        listDataHeader.add("HPV");
        listDataHeader.add("Vacina Tríplice-viral");
        listDataHeader.add("Vacina contra Pneumonia");

        // Adding child data
        List<String> hepatiteB = new ArrayList<String>();
        hepatiteB.add("Uma infecção grave do fígado causada pelo vírus da hepatite B, que pode ser facilmente prevenida por meio de vacina.");

        List<String> poliomelite = new ArrayList<String>();
        poliomelite.add("A poliomielite é uma doença infecto-contagiosa aguda, causada por um vírus que vive no intestino, denominado Poliovírus.");

        List<String> gripe = new ArrayList<String>();
        gripe.add("A gripe é uma infecção viral que afeta especialmente as vias aéreas e o pulmão. ");

        List<String> febreAmarela = new ArrayList<String>();
        febreAmarela.add("A febre amarela é transmitida pelo mesmo mosquito transmissor da dengue, o Aedes aegypti. A doença tem como principais sintomas febre, dor de cabeça, calafrios, náuseas, vômito, dores no corpo, icterícia (pele e olhos amarelados) e hemorragias. Se a febre amarela não for tratada, pode levar a morte.");

        List<String> hpv = new ArrayList<String>();
        hpv.add("A vacina existe tanto para homens quanto para mulheres e previne os quatros principais tipos do Papilomavírus Humano - o HPV. Segundo o Ministério da Saúde, 137 mil novos casos de HPV são registrados por ano no Brasil. O vírus, transmitido durante a relação sexual, é responsável por 90% dos casos de câncer de colo do útero, além de provocar tumores de vulva, pênis, boca, ânus e pele.");

        List<String> tripliceViral = new ArrayList<String>();
        tripliceViral.add("Para sarampo, caxumba e rubéola\n" +
                "Causado por um vírus, o sarampo é caracterizado por manchas vermelhas no corpo. A transmissão ocorre por via respiratória. De acordo com dados do Ministério da Saúde, a mortalidade entre crianças saudáveis é mínima, ficando abaixo de 0,2% dos casos. Nos adultos, essa doença é pouco observada, mas como a forma de contágio é simples, os adultos devem ser imunizados para proteger as crianças com quem convivem.\n" +
                "Conhecida por deixar o pescoço inchado, a caxumba também tem transmissão por via respiratória. Mesmo que seja mais comum em crianças, a caxumba apresenta casos mais graves em adultos, podendo causar meningite, encefalite, surdez, inflamação nos testículos ou dos ovários, e mais raramente no pâncreas.\n");

        List<String> pneumonia = new ArrayList<String>();
        pneumonia.add("A vacina é indicada para pessoas com mais de 60 anos em situações de maior risco, ou seja, idosos que vivem instituições fechadas, como casas de repouso, ou hospitais. O idoso deve tomar uma dose de reforço a cada cinco anos. A campanha da vacinação ocorre nos meses de abril e maio.");

        listDataChild.put(listDataHeader.get(0), hepatiteB); // Header, Child data
        listDataChild.put(listDataHeader.get(1), poliomelite);
        listDataChild.put(listDataHeader.get(2), gripe);


        listDataChild.put(listDataHeader.get(3), febreAmarela); // Header, Child data
        listDataChild.put(listDataHeader.get(4), hpv);
        listDataChild.put(listDataHeader.get(5), tripliceViral);
        listDataChild.put(listDataHeader.get(6), pneumonia);
    }
}
