package ru.startandroid.develop.historyguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView EraRecycler;
    eraAdapter EraAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<era> eraList = new ArrayList<>();
        eraList.add(new era(1, "background_img", "Период Киевской\nРуси", "IX век", "XII век", "#B8860B", "Ки́евская Русь, или Древнеру́сское госуда́рство, или Дре́вняя Русь — средневековое государство в Северо-Восточной Европе, оформившееся в IX веке в результате объединения ряда восточнославянских и финно-угорских племён под властью князей династии Рюриковичей. В период наивысшего расцвета Киевская Русь занимала территорию от притоков Вислы на западе до Волго-Окского междуречья на востоке, от Белого моря на севере до причерноморских русских эксклавов на юге. К середине XII века вступила в состояние феодальной раздробленности и фактически распалась на полтора десятка княжеств, управляемых разными ветвями династии Рюриковичей."));
        eraList.add(new era(2, "background_img2", "Период Феодальной\nраздробленности", "XII век", "XV век", "#DEB887", "Эпоху XII—XVI веков принято называть удельным периодом или (по обозначению советской марксистской историографии) феодальной раздробленностью. Рубежом распада считается 1132 — год смерти последнего могущественного киевского князя Мстислава Великого."));
        eraList.add(new era(3, "background_img3", "Период единого\nРусского государства", "XV век", "XVIII век", "#C0C0C0", "Ру́сское (централизо́ванное) госуда́рство — государство конца XV — начала XVIII веков, сложившееся в результате объединения северо-восточных русских княжеств в конце XV века, в эпоху правления великого князя московского Ивана III. Территория Русского государства в 1500, 1600 и 1700."));
        eraList.add(new era(4, "background_img4", "Период \n Российской империи", "Начало\nXVIII век", "Начало XX век", "#DEB887","Образование Российской Империи случилось 22 октября 1721 года по старому стилю или 2 ноября. Именно в этот день последний российский царь Петр 1 Великий объявил себя императором российским. Случилось это, как одно из следствий северной войны, после которой сенат просил Петра 1 принять титул Императора страны. Государство получило название «Российская Империя». Ее столицей стал город Санкт-Петербург. За все время столица только на 2 года (с 1728 по 1730 гг.) переносилась в Москву."));
        eraList.add(new era(5, "background_img5", "Советский период", "Начало\nXX", "Конец XX", "#FF4500", "Период времени в котрый установился новый государственный порядок, страна была втянута в новый мировой конфликт, произошел резкий технологический рывок, а также случилась конфронтация с Западом."));
        eraList.add(new era(6, "background_img6", "Период новейшей \n истории", "Конец\nXX", "По сей день", "#4682B4", "Период, когда распался СССР и образовался СНГ. Ослабленной России после распада СССР предстояло много всего, от развития экономики до наращивания военного потенциала страны. "));

        setEraRecycler(eraList);

    }

    public void goBackToMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openAboutUs(View view) {
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    public void openLikeCart(View view) {
        Intent intent = new Intent(this, DatePage.class);
        startActivity(intent);
    }

    public void StartNewActivity(View v) {
        Intent intent = new Intent(this, DatePage.class);
        startActivity(intent);
    }

    private void setEraRecycler(List<era> eraList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        EraRecycler = findViewById(R.id.dataRecycler);
        EraRecycler.setLayoutManager(layoutManager);

        EraAdapter = new eraAdapter(this, eraList);
        EraRecycler.setAdapter(EraAdapter);
    }
}