package p000;

import java.lang.Character;

/* renamed from: kqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kqz {
    /* renamed from: a */
    public static boolean m18380a(String str) {
        if (str.isEmpty()) {
            return false;
        }
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            Character.UnicodeScript of = Character.UnicodeScript.of(codePointAt);
            if (of != Character.UnicodeScript.HAN && of != Character.UnicodeScript.HIRAGANA && of != Character.UnicodeScript.KATAKANA && of != Character.UnicodeScript.BOPOMOFO && of != Character.UnicodeScript.HANGUL) {
                return false;
            }
            i += Character.charCount(codePointAt);
        }
        return true;
    }
}
