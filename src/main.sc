require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        script:
            jsapi.startSession()
        q!: $regex</start>
        a: Привет! Это бот для одного маленького лингвистического, кхм-кхм, эксперимента. Вам будет предложено семь предложений на русском языке. Вам нужно будет оценить их семантическую приемлемость по шкале от 1 (совсем неприемлемо) до 7 (абсолютно приемлемо).
        buttons:
            "Начать" -> /State1

    state: State1
        a: Родителей не обрадовал вид Бори: он был весь измазан, на нём не было чего-то чистого.
        buttons:
            "1" -> /State2
            "2" -> /State2
            "3" -> /State2
            "4" -> /State2
            "5" -> /State2
            "6" -> /State2
            "7" -> /State2
    
    state: State2
        a: Для решения этой проблемы не нашлось каких-то безопасных путей.
        buttons:
            "1" -> /State3
            "2" -> /State3
            "3" -> /State3
            "4" -> /State3
            "5" -> /State3
            "6" -> /State3
            "7" -> /State3
    
    state: State3
        a: Приехав в город, мы не стали совершать какие-то дорогие покупки, а принялись изучать местные музеи.
        buttons:
            "1" -> /State4
            "2" -> /State4
            "3" -> /State4
            "4" -> /State4
            "5" -> /State4
            "6" -> /State4
            "7" -> /State4
    
    state: State4
        a: Эта художница делает ставку на естественные изгибы: в её работах не бывает каких-то прямых линий.
        buttons:
            "1" -> /State5
            "2" -> /State5
            "3" -> /State5
            "4" -> /State5
            "5" -> /State5
            "6" -> /State5
            "7" -> /State5
    
    state: State5
        a: В нашем маршрутном листе не содержалось каких-то опасных мест.
        buttons:
            "1" -> /State6
            "2" -> /State6
            "3" -> /State6
            "4" -> /State6
            "5" -> /State6
            "6" -> /State6
            "7" -> /State6
    
    state: State6
        a: Аюна очень удивилась опрятности дочери: среди её вещей не было чего-то грязного.
        buttons:
            "1" -> /State7
            "2" -> /State7
            "3" -> /State7
            "4" -> /State7
            "5" -> /State7
            "6" -> /State7
            "7" -> /State7
    
    state: State7
        a: В ранних конструктивистских проектах не предполагалось каких-то кривых линий.
        buttons:
            "1" -> /Final
            "2" -> /Final
            "3" -> /Final
            "4" -> /Final
            "5" -> /Final
            "6" -> /Final
            "7" -> /Final
    
    state: Final
        a: Спасибо за вашу помощь! Всего доброго!
        script:
            jsapi.stopsession()