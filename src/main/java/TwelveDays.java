class TwelveDays {

    public String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth",
            "ninth", "tenth", "eleventh", "twelfth"};

    public String[] gifts = {"a Partridge in a Pear Tree.",
            "two Turtle Doves, ",
            "three French Hens, ",
            "four Calling Birds, ",
            "five Gold Rings, ",
            "six Geese-a-Laying, ",
            "seven Swans-a-Swimming, ",
            "eight Maids-a-Milking, ",
            "nine Ladies Dancing, ",
            "ten Lords-a-Leaping, ",
            "eleven Pipers Piping, ",
            "twelve Drummers Drumming, "};


    String verse(int verseNumber) {
        String verse = "On the " + days[verseNumber - 1] + " day of Christmas my true love gave to me: ";
        if (verseNumber == 1)
            return verse + gifts[0] + "\n";
        else {
            for (int i = verseNumber - 1; i > 0; i--) {
                verse = verse + gifts[i];
            }
            verse = verse + ("and " + gifts[0] + "\n");
        }
        return verse;
    }

    String verses(int startVerse, int endVerse) {
        String music = "";
        for (int i = startVerse; i < endVerse; i++)
            music = music + (verse(i) + "\n");
        music = music + verse(endVerse);
        return music;
    }

    String sing() {
        return verses(1, 12);
    }
}
