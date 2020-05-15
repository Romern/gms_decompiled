package p000;

import java.lang.Character;
import java.text.Collator;
import java.text.RuleBasedCollator;
import java.util.Locale;

/* renamed from: alts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alts {

    /* renamed from: a */
    private static final Object f74256a = new Object();

    /* renamed from: b */
    private static Locale f74257b;

    /* renamed from: c */
    private static RuleBasedCollator f74258c;

    /* renamed from: a */
    public static String m61839a(String str) {
        RuleBasedCollator ruleBasedCollator;
        synchronized (f74256a) {
            Locale locale = Locale.getDefault();
            if (!locale.equals(f74257b)) {
                f74257b = locale;
                RuleBasedCollator ruleBasedCollator2 = (RuleBasedCollator) Collator.getInstance(locale);
                f74258c = ruleBasedCollator2;
                ruleBasedCollator2.setStrength(0);
                f74258c.setDecomposition(1);
            }
            ruleBasedCollator = f74258c;
        }
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                break;
            } else if (!Character.isLetterOrDigit(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                int i2 = 0;
                for (char c : charArray) {
                    if (Character.isLetterOrDigit(c)) {
                        charArray[i2] = c;
                        i2++;
                    }
                }
                str = new String(charArray, 0, i2);
            } else {
                i++;
            }
        }
        String d = srv.m36164d(ruleBasedCollator.getCollationKey(str).toByteArray());
        return d.substring(0, d.length() - 2);
    }

    /* renamed from: b */
    public static boolean m61841b(Character.UnicodeBlock unicodeBlock) {
        return Character.UnicodeBlock.KATAKANA.equals(unicodeBlock) || Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS.equals(unicodeBlock) || Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS.equals(unicodeBlock) || Character.UnicodeBlock.HIRAGANA.equals(unicodeBlock);
    }

    /* renamed from: a */
    public static boolean m61840a(Character.UnicodeBlock unicodeBlock) {
        return Character.UnicodeBlock.HANGUL_SYLLABLES.equals(unicodeBlock) || Character.UnicodeBlock.HANGUL_JAMO.equals(unicodeBlock) || Character.UnicodeBlock.HANGUL_COMPATIBILITY_JAMO.equals(unicodeBlock);
    }
}
