package com.example.finalproject;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;


public class MainActivity extends AppCompatActivity {
    private LinearLayout btn;
    private TextView phrase_line;
    private TextInputLayout Phrase;
    private String str_line = new String();
    private String str_text = " ";
    private String str_sub = new String();
    final Letter[] letters = new Letter[26];

    final Letter[] numbers = new Letter[10];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        letters[0] = new Letter();
        letters[0].Intialize("a", "A");
        letters[0].Adjective[0] = new Word();letters[0].Adjective[1] = new Word();letters[0].Adjective[2] = new Word();letters[0].Adjective[3] = new Word();
        letters[0].Fill_adj("адский", "абсолютный", "Абхазко-адыгейский", "Авиахимический");
        letters[0].Noun[0] = new Word();letters[0].Noun[1] = new Word();letters[0].Noun[2] = new Word();letters[0].Noun[3] = new Word();
        letters[0].Fill_n("аборт", "авангард", "Аббат", "Абсурд");
        letters[0].Verb[0] = new Word();letters[0].Verb[1] = new Word();letters[0].Verb[2] = new Word();letters[0].Verb[3] = new Word();
        letters[0].Fill_v("аплодировал", "агитировал", "Агрессировал", "Адаптировал");
        letters[1] = new Letter();
        letters[1].Intialize("b", "B");
        letters[1].Adjective[0] = new Word();letters[1].Adjective[1] = new Word();letters[1].Adjective[2] = new Word();letters[1].Adjective[3] = new Word();
        letters[1].Fill_adj("багровый", "багетный", "Бразильский", "Базовый");
        letters[1].Noun[0] = new Word();letters[1].Noun[1] = new Word();letters[1].Noun[2] = new Word();letters[1].Noun[3] = new Word();
        letters[1].Fill_n("боров", "бог", "Байкал", "Байден");
        letters[1].Verb[0] = new Word();letters[1].Verb[1] = new Word();letters[1].Verb[2] = new Word();letters[1].Verb[3] = new Word();
        letters[1].Fill_v("берет", "бреет", "Баюкает", "Бережет");
        letters[2] = new Letter();
        letters[2].Intialize("c", "C");
        letters[2].Adjective[0] = new Word();letters[2].Adjective[1] = new Word();letters[2].Adjective[2] = new Word();letters[2].Adjective[3] = new Word();
        letters[2].Fill_adj("цветной", "царский", "Цветущий", "Целый");
        letters[2].Noun[0] = new Word();letters[2].Noun[1] = new Word();letters[2].Noun[2] = new Word();letters[2].Noun[3] = new Word();
        letters[2].Fill_n("цирк", "цель", "Цинник", "Царь");
        letters[2].Verb[0] = new Word();letters[2].Verb[1] = new Word();letters[2].Verb[2] = new Word();letters[2].Verb[3] = new Word();
        letters[2].Fill_v("целит", "цветет", "Царит", "Ценил");
        letters[3] = new Letter();
        letters[3].Intialize("d", "D");
        letters[3].Adjective[0] = new Word();letters[3].Adjective[1] = new Word();letters[3].Adjective[2] = new Word();letters[3].Adjective[3] = new Word();
        letters[3].Fill_adj("дикий", "давний", "Далекий", "Двуликий");
        letters[3].Noun[0] = new Word();letters[3].Noun[1] = new Word();letters[3].Noun[2] = new Word();letters[3].Noun[3] = new Word();
        letters[3].Fill_n("даун", "дед", "Дарвин", "Даб-степ");
        letters[3].Verb[0] = new Word();letters[3].Verb[1] = new Word();letters[3].Verb[2] = new Word();letters[3].Verb[3] = new Word();
        letters[3].Fill_v("делит", "дает", "Дарит", "Двигает");
        letters[4] = new Letter();
        letters[4].Intialize("e", "E");
        letters[4].Adjective[0] = new Word();letters[4].Adjective[1] = new Word();letters[4].Adjective[2] = new Word();letters[4].Adjective[3] = new Word();
        letters[4].Fill_adj("еврейский", "единый", "Еловый", "Естественный");
        letters[4].Noun[0] = new Word();letters[4].Noun[1] = new Word();letters[4].Noun[2] = new Word();letters[4].Noun[3] = new Word();
        letters[4].Fill_n("евреи", "евнух", "Ева", "Егор");
        letters[4].Verb[0] = new Word();letters[4].Verb[1] = new Word();letters[4].Verb[2] = new Word();letters[4].Verb[3] = new Word();
        letters[4].Fill_v("едет", "ест", "Елозит", "Единил");
        letters[5] = new Letter();
        letters[5].Intialize("f", "F");
        letters[5].Adjective[0] = new Word();letters[5].Adjective[1] = new Word();letters[5].Adjective[2] = new Word();letters[5].Adjective[3] = new Word();
        letters[5].Fill_adj("фиолетовый", "фоновый", "Фруктовый", "Фановый");
        letters[5].Noun[0] = new Word();letters[5].Noun[1] = new Word();letters[5].Noun[2] = new Word();letters[5].Noun[3] = new Word();
        letters[5].Fill_n("фонк", "фаза", "Фано", "Фараон");
        letters[5].Verb[0] = new Word();letters[5].Verb[1] = new Word();letters[5].Verb[2] = new Word();letters[5].Verb[3] = new Word();
        letters[5].Fill_v("фонит", "фантазирует о", "Фигурирует", "Флиртует с");
        letters[6] = new Letter();
        letters[6].Intialize("g", "G");
        letters[6].Adjective[0] = new Word();letters[6].Adjective[1] = new Word();letters[6].Adjective[2] = new Word();letters[6].Adjective[3] = new Word();
        letters[6].Fill_adj("гонимый", "годный", "Гексагональный", "Грозный");
        letters[6].Noun[0] = new Word();letters[6].Noun[1] = new Word();letters[6].Noun[2] = new Word();letters[6].Noun[3] = new Word();
        letters[6].Fill_n("гитара", "гвоздь", "Гаусс", "Гитлер");
        letters[6].Verb[0] = new Word();letters[6].Verb[1] = new Word();letters[6].Verb[2] = new Word();letters[6].Verb[3] = new Word();
        letters[6].Fill_v("гадает по", "гонит", "Гаснет", "");
        letters[7] = new Letter();
        letters[7].Intialize("h", "H");
        letters[7].Adjective[0] = new Word();letters[7].Adjective[1] = new Word();letters[7].Adjective[2] = new Word();letters[7].Adjective[3] = new Word();
        letters[7].Fill_adj("халтурный", "хаотичный", "Хилый", "Хваленный");
        letters[7].Noun[0] = new Word();letters[7].Noun[1] = new Word();letters[7].Noun[2] = new Word();letters[7].Noun[3] = new Word();
        letters[7].Fill_n("холокост", "хохол", "Хмели-Сунели", "Халимов");
        letters[7].Verb[0] = new Word();letters[7].Verb[1] = new Word();letters[7].Verb[2] = new Word();letters[7].Verb[3] = new Word();
        letters[7].Fill_v("хоронит", "хранит", "Хлопает", "Холит");
        letters[8] = new Letter();
        letters[8].Intialize("i", "I");
        letters[8].Adjective[0] = new Word();letters[8].Adjective[1] = new Word();letters[8].Adjective[2] = new Word();letters[8].Adjective[3] = new Word();
        letters[8].Fill_adj("игривый", "иной", "Изнуренный", "Индийский");
        letters[8].Noun[0] = new Word();letters[8].Noun[1] = new Word();letters[8].Noun[2] = new Word();letters[8].Noun[3] = new Word();
        letters[8].Fill_n("иглы", "иврит", "Иван-Чай", "Игги Поп");
        letters[8].Verb[0] = new Word();letters[8].Verb[1] = new Word();letters[8].Verb[2] = new Word();letters[8].Verb[3] = new Word();
        letters[8].Fill_v("изгнал", "измельчил", "Измылил", "Изогнул");
        letters[9] = new Letter();
        letters[9].Intialize("j", "J");
        letters[9].Adjective[0] = new Word();letters[9].Adjective[1] = new Word();letters[9].Adjective[2] = new Word();letters[9].Adjective[3] = new Word();
        letters[9].Fill_adj("жирный", "жадный", "Жестокий", "Жалкий");
        letters[9].Noun[0] = new Word();letters[9].Noun[1] = new Word();letters[9].Noun[2] = new Word();letters[9].Noun[3] = new Word();
        letters[9].Fill_n("женщина", "жид", "Животное", "Жириновский");
        letters[9].Verb[0] = new Word();letters[9].Verb[1] = new Word();letters[9].Verb[2] = new Word();letters[9].Verb[3] = new Word();
        letters[9].Fill_v("жарит", "жалит", "Жмет", "Жаждет");
        letters[10] = new Letter();
        letters[10].Intialize("k", "K");
        letters[10].Adjective[0] = new Word();letters[10].Adjective[1] = new Word();letters[10].Adjective[2] = new Word();letters[10].Adjective[3] = new Word();
        letters[10].Fill_adj("кривой", "китовый", "Коньюнктурный", "Кварцевый");
        letters[10].Noun[0] = new Word();letters[10].Noun[1] = new Word();letters[10].Noun[2] = new Word();letters[10].Noun[3] = new Word();
        letters[10].Fill_n("кот", "кинббал", "Корнеплод", "Кант");
        letters[10].Verb[0] = new Word();letters[10].Verb[1] = new Word();letters[10].Verb[2] = new Word();letters[10].Verb[3] = new Word();
        letters[10].Fill_v("крутит", "качает", "Колит", "Кинул");
        letters[11] = new Letter();
        letters[11].Intialize("l", "L");
        letters[11].Adjective[0] = new Word();letters[11].Adjective[1] = new Word();letters[11].Adjective[2] = new Word();letters[11].Adjective[3] = new Word();
        letters[11].Fill_adj("лживый", "ловкий", "Литой", "Лучший");
        letters[11].Noun[0] = new Word();letters[11].Noun[1] = new Word();letters[11].Noun[2] = new Word();letters[11].Noun[3] = new Word();
        letters[11].Fill_n("лох", "лесник", "Лил", "Лунгрен");
        letters[11].Verb[0] = new Word();letters[11].Verb[1] = new Word();letters[11].Verb[2] = new Word();letters[11].Verb[3] = new Word();
        letters[11].Fill_v("лижет", "лежит", "Ложит", "Лупит");
        letters[12] = new Letter();
        letters[12].Intialize("m", "M");
        letters[12].Adjective[0] = new Word();letters[12].Adjective[1] = new Word();letters[12].Adjective[2] = new Word();letters[12].Adjective[3] = new Word();
        letters[12].Fill_adj("малый", "магический", "Малодушный", "Манящий");
        letters[12].Noun[0] = new Word();letters[12].Noun[1] = new Word();letters[12].Noun[2] = new Word();letters[12].Noun[3] = new Word();
        letters[12].Fill_n("метал", "маньяк", "Меченый", "Морген");
        letters[12].Verb[0] = new Word();letters[12].Verb[1] = new Word();letters[12].Verb[2] = new Word();letters[12].Verb[3] = new Word();
        letters[12].Fill_v("манит", "мочет", "Меняет", "Моет");
        letters[13] = new Letter();
        letters[13].Intialize("n", "N");
        letters[13].Adjective[0] = new Word();letters[13].Adjective[1] = new Word();letters[13].Adjective[2] = new Word();letters[13].Adjective[3] = new Word();
        letters[13].Fill_adj("настойчивый", "неряшливый", "Ненужный", "Навеянный");
        letters[13].Noun[0] = new Word();letters[13].Noun[1] = new Word();letters[13].Noun[2] = new Word();letters[13].Noun[3] = new Word();
        letters[13].Fill_n("негр", "нацизм", "Нуждики", "Никита");
        letters[13].Verb[0] = new Word();letters[13].Verb[1] = new Word();letters[13].Verb[2] = new Word();letters[13].Verb[3] = new Word();
        letters[13].Fill_v("настваляет", "наводит", "Ненавидит", "Навеявает");
        letters[14] = new Letter();
        letters[14].Intialize("o", "O");
        letters[14].Adjective[0] = new Word();letters[14].Adjective[1] = new Word();letters[14].Adjective[2] = new Word();letters[14].Adjective[3] = new Word();
        letters[14].Fill_adj("обвисший", "орущий", "Отличный", "Обоженный");
        letters[14].Noun[0] = new Word();letters[14].Noun[1] = new Word();letters[14].Noun[2] = new Word();letters[14].Noun[3] = new Word();
        letters[14].Fill_n("отвал", "обед", "Обломов", "Овощь");
        letters[14].Verb[0] = new Word();letters[14].Verb[1] = new Word();letters[14].Verb[2] = new Word();letters[14].Verb[3] = new Word();
        letters[14].Fill_v("обгладал", "обидел", "Обаял", "Обрезал");
        letters[15] = new Letter();
        letters[15].Intialize("p", "P");
        letters[15].Adjective[0] = new Word();letters[15].Adjective[1] = new Word();letters[15].Adjective[2] = new Word();letters[15].Adjective[3] = new Word();
        letters[15].Fill_adj("пьяный", "пористый", "Прыткий", "Потный");
        letters[15].Noun[0] = new Word();letters[15].Noun[1] = new Word();letters[15].Noun[2] = new Word();letters[15].Noun[3] = new Word();
        letters[15].Fill_n("падре", "пилот", "Пыня", "Примус");
        letters[15].Verb[0] = new Word();letters[15].Verb[1] = new Word();letters[15].Verb[2] = new Word();letters[15].Verb[3] = new Word();
        letters[15].Fill_v("побил", "послал", "Подорвал", "Поджег");
        letters[16] = new Letter();
        letters[16].Intialize("q", "Q");
        letters[16].Adjective[0] = new Word();letters[16].Adjective[1] = new Word();letters[16].Adjective[2] = new Word();letters[16].Adjective[3] = new Word();
        letters[16].Fill_adj("четвертичный", "черный", "Человечный", "Чистый");
        letters[16].Noun[0] = new Word();letters[16].Noun[1] = new Word();letters[16].Noun[2] = new Word();letters[16].Noun[3] = new Word();
        letters[16].Fill_n("черт", "черкес", "Черчилль", "Че Геварра");
        letters[16].Verb[0] = new Word();letters[16].Verb[1] = new Word();letters[16].Verb[2] = new Word();letters[16].Verb[3] = new Word();
        letters[16].Fill_v("чарует", "чертит", "Чешет", "Чинит");
        letters[17] = new Letter();
        letters[17].Intialize("r", "R");
        letters[17].Adjective[0] = new Word();letters[17].Adjective[1] = new Word();letters[17].Adjective[2] = new Word();letters[17].Adjective[3] = new Word();
        letters[17].Fill_adj("репетативный", "родной", "Радужный", "Разваленный");
        letters[17].Noun[0] = new Word();letters[17].Noun[1] = new Word();letters[17].Noun[2] = new Word();letters[17].Noun[3] = new Word();
        letters[17].Fill_n("рок", "растение", "Робот", "Раб");
        letters[17].Verb[0] = new Word();letters[17].Verb[1] = new Word();letters[17].Verb[2] = new Word();letters[17].Verb[3] = new Word();
        letters[17].Fill_v("репетирует с", "рубит", "Растет", "Роняет");
        letters[18] = new Letter();
        letters[18].Intialize("s", "S");
        letters[18].Adjective[0] = new Word();letters[18].Adjective[1] = new Word();letters[18].Adjective[2] = new Word();letters[18].Adjective[3] = new Word();
        letters[18].Fill_adj("съеденный", "сытый", "Слитый", "Саморазрушенный");
        letters[18].Noun[0] = new Word();letters[18].Noun[1] = new Word();letters[18].Noun[2] = new Word();letters[18].Noun[3] = new Word();
        letters[18].Fill_n("сало", "сон", "Соль", "Санбой");
        letters[18].Verb[0] = new Word();letters[18].Verb[1] = new Word();letters[18].Verb[2] = new Word();letters[18].Verb[3] = new Word();
        letters[18].Fill_v("съел", "сдал", "Сбросил", "Свил");
        letters[19] = new Letter();
        letters[19].Intialize("t", "T");
        letters[19].Adjective[0] = new Word();letters[19].Adjective[1] = new Word();letters[19].Adjective[2] = new Word();letters[19].Adjective[3] = new Word();
        letters[19].Fill_adj("тупой", "третий", "Талантливый", "Таинственный");
        letters[19].Noun[0] = new Word();letters[19].Noun[1] = new Word();letters[19].Noun[2] = new Word();letters[19].Noun[3] = new Word();
        letters[19].Fill_n("труп", "тело", "Таджик", "Татар");
        letters[19].Verb[0] = new Word();letters[19].Verb[1] = new Word();letters[19].Verb[2] = new Word();letters[19].Verb[3] = new Word();
        letters[19].Fill_v("тронул", "трепал", "Тыкал", "Трясет");
        letters[20] = new Letter();
        letters[20].Intialize("u", "U");
        letters[20].Adjective[0] = new Word();letters[20].Adjective[1] = new Word();letters[20].Adjective[2] = new Word();letters[20].Adjective[3] = new Word();
        letters[20].Fill_adj("убитый", "убойный", "Уродливый", "Ущербный");
        letters[20].Noun[0] = new Word();letters[20].Noun[1] = new Word();letters[20].Noun[2] = new Word();letters[20].Noun[3] = new Word();
        letters[20].Fill_n("удав", "урод", "Узда", "Узбек");
        letters[20].Verb[0] = new Word();letters[20].Verb[1] = new Word();letters[20].Verb[2] = new Word();letters[20].Verb[3] = new Word();
        letters[20].Fill_v("убил", "учил", "Успокоил", "Угнал");
        letters[21] = new Letter();
        letters[21].Intialize("v", "V");
        letters[21].Adjective[0] = new Word();letters[21].Adjective[1] = new Word();letters[21].Adjective[2] = new Word();letters[21].Adjective[3] = new Word();
        letters[21].Fill_adj("вольный", "витой", "Верующий", "Вонючий");
        letters[21].Noun[0] = new Word();letters[21].Noun[1] = new Word();letters[21].Noun[2] = new Word();letters[21].Noun[3] = new Word();
        letters[21].Fill_n("верующий", "вирус", "Ваганыч", "Вассерман");
        letters[21].Verb[0] = new Word();letters[21].Verb[1] = new Word();letters[21].Verb[2] = new Word();letters[21].Verb[3] = new Word();
        letters[21].Fill_v("видел", "выбрал", "Выделил", "Вырастил");
        letters[22] = new Letter();
        letters[22].Intialize("w", "W");
        letters[22].Adjective[0] = new Word();letters[22].Adjective[1] = new Word();letters[22].Adjective[2] = new Word();letters[22].Adjective[3] = new Word();
        letters[22].Fill_adj("юбилейный", "юркий", "Юный", "Южный");
        letters[22].Noun[0] = new Word();letters[22].Noun[1] = new Word();letters[22].Noun[2] = new Word();letters[22].Noun[3] = new Word();
        letters[22].Fill_n("юрист", "юнец", "Юмореска", "Юра");
        letters[22].Verb[0] = new Word();letters[22].Verb[1] = new Word();letters[22].Verb[2] = new Word();letters[22].Verb[3] = new Word();
        letters[22].Fill_v("юстировал", "юродил", "Юлил", "Юморил");
        letters[23] = new Letter();
        letters[23].Intialize("x", "X");
        letters[23].Adjective[0] = new Word();letters[23].Adjective[1] = new Word();letters[23].Adjective[2] = new Word();letters[23].Adjective[3] = new Word();
        letters[23].Fill_adj("цепочный", "ценный", "Центральный", "Церковный");
        letters[23].Noun[0] = new Word();letters[23].Noun[1] = new Word();letters[23].Noun[2] = new Word();letters[23].Noun[3] = new Word();
        letters[23].Fill_n("Цинник", "Цель", "Царь", "Цицерон");
        letters[23].Verb[0] = new Word();letters[23].Verb[1] = new Word();letters[23].Verb[2] = new Word();letters[23].Verb[3] = new Word();
        letters[23].Fill_v("целил", "ценил", "Цедил", "Цапал");
        letters[24] = new Letter();
        letters[24].Intialize("y", "Y");
        letters[24].Adjective[0] = new Word();letters[24].Adjective[1] = new Word();letters[24].Adjective[2] = new Word();letters[24].Adjective[3] = new Word();
        letters[24].Fill_adj("яровой", "ясный", "Явственный", "Яркий");
        letters[24].Noun[0] = new Word();letters[24].Noun[1] = new Word();letters[24].Noun[2] = new Word();letters[24].Noun[3] = new Word();
        letters[24].Fill_n("яд", "ядро", "Язык", "Яйцо");
        letters[24].Verb[0] = new Word();letters[24].Verb[1] = new Word();letters[24].Verb[2] = new Word();letters[24].Verb[3] = new Word();
        letters[24].Fill_v("язвил", "явил", "Яснил", "Ябедничал");
        letters[25] = new Letter();
        letters[25].Intialize("z", "Z");
        letters[25].Adjective[0] = new Word();letters[25].Adjective[1] = new Word();letters[25].Adjective[2] = new Word();letters[25].Adjective[3] = new Word();
        letters[25].Fill_adj("забитый", "зримый", "Замужний", "Звонкий");
        letters[25].Noun[0] = new Word();letters[25].Noun[1] = new Word();letters[25].Noun[2] = new Word();letters[25].Noun[3] = new Word();
        letters[25].Fill_n("задрот", "злодей", "Зил", "Зонд");
        letters[25].Verb[0] = new Word();letters[25].Verb[1] = new Word();letters[25].Verb[2] = new Word();letters[25].Verb[3] = new Word();
        letters[25].Fill_v("зарезал", "зализал", "Забил", "Задел");
        numbers[0] = new Letter();
        numbers[0].Intialize("0", "0");
        numbers[1] = new Letter();
        numbers[1].Intialize("1", "1");
        numbers[2] = new Letter();
        numbers[2].Intialize("2", "2");
        numbers[3] = new Letter();
        numbers[3].Intialize("3", "3");
        numbers[4] = new Letter();
        numbers[4].Intialize("4", "4");
        numbers[5] = new Letter();
        numbers[5].Intialize("5", "5");
        numbers[6] = new Letter();
        numbers[6].Intialize("6", "6");
        numbers[7] = new Letter();
        numbers[7].Intialize("7", "7");
        numbers[8] = new Letter();
        numbers[8].Intialize("8", "8");
        numbers[9] = new Letter();
        numbers[9].Intialize("9", "9");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btn = findViewById(R.id.functional_layout);
        this.phrase_line = findViewById(R.id.phrase_view);
        this.Phrase = findViewById(R.id.InputLayout_1);
        this.btn.setOnClickListener(view -> phrase_line.setText(Organizize(Phrase, letters, numbers,str_text,str_line,str_sub)));
    }

    private String Organizize(TextInputLayout text1, Letter[] letter, Letter[] number,String text,String line,String sub) {
        line = String.valueOf(text1.getEditText().getText());
        int line_l = line.length() - (line.length() % 4);
        for (int i = 1; i < line_l; i += 4) {
            sub = line.substring(i - 1, i + 3);
            text = text + Reread_adj(sub.substring(0, 1), letter, number) + Reread_n(sub.substring(1, 2), letters, numbers) + Reread_v(sub.substring(2, 3), letters, numbers) + Reread_n(sub.substring(3), letters, numbers);
        }
        if ((line.length() % 4) == 1) {
            text = text + Reread_n(line.substring(line.length() - 1), letters, numbers);
        } else if ((line.length() % 4) == 2) {
            text = text + Reread_adj(line.substring(line.length() - 2, line.length() - 1), letters, numbers) + Reread_n(line.substring(line.length() - 1), letters, numbers);
        } else if ((line.length() % 4) == 3) {
            text = text + Reread_n(line.substring(line.length() - 3, line.length() - 2), letters, numbers) + Reread_v(line.substring(line.length() - 2, line.length() - 1), letters, numbers) + Reread_n(line.substring(line.length() - 1), letters, numbers);
        }

        return text;
    }

    private String Reread_adj(String a, Letter[] letter, Letter[] number) {
        String word_line = new String("");
        for (int i = 0; i <= (letter.length-1); i++) {
            if (a.equals(letter[i].Value1)) {
                word_line = " " + letter[i].Adjective[(int) (Math.random() * 2)].Name + " ";
            } else if (a.equals(letter[i].Value2)) {
                word_line = " " + letter[i].Adjective[(int) (Math.random() * 2 + 2)].Name + " ";
            } else if ((i < 10) && (a.equals(number[i].Value1))) {
                word_line = a;
            }
        }
        return word_line;
    }

    private String Reread_n(String a, Letter[] letters, Letter[] numbers) {
        String word_line = new String("");
        for (int i = 0; i <= (letters.length-1); i++) {
            if (a.equals(letters[i].Value1)) {
                word_line = " " + letters[i].Noun[(int) (Math.random() * 2)].Name + " ";
            } else if (a.equals(letters[i].Value2)) {
                word_line = " " + letters[i].Noun[(int) (Math.random() * 2 + 2)].Name + " ";
            } else if ((i < 10) && (a.equals(numbers[i].Value1))) {
                word_line = a;
            }
        }
        return word_line;
    }

    private String Reread_v(String a, Letter[] letters, Letter[] numbers) {
        String word_line = new String("");
        for (int i = 0; i <= (letters.length-1); i++) {
            if (a.equals(letters[i].Value1)) {
                word_line = " " + letters[i].Verb[(int) (Math.random() * 2)].Name + " ";
            } else if (a.equals(letters[i].Value2)) {
                word_line = " " + letters[i].Verb[(int) (Math.random() * 2 + 2)].Name + " ";
            } else if ((i < 10) && (a.equals(numbers[i].Value1))) {
                word_line = a;
            }
        }
        return word_line;
    }

}