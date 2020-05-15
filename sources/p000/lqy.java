package p000;

import java.util.regex.Pattern;

/* renamed from: lqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lqy {

    /* renamed from: a */
    public static final Pattern f26616a = Pattern.compile("^.*\\S.*$");

    /* renamed from: b */
    public static final Pattern f26617b = Pattern.compile(".");

    /* renamed from: c */
    public static final String f26618c;

    /* renamed from: d */
    public static final Pattern f26619d;

    /* renamed from: e */
    public static final Pattern f26620e = Pattern.compile("^(\\d{4})(?:[\\s]*|[-]?)(\\d{4,6}?)(?:[\\s]*|[-]?)(\\d{4,5})(?:[\\s]*|[-]?)(\\d{0,4})$");

    /* renamed from: f */
    public static final String f26621f;

    /* renamed from: g */
    public static final Pattern f26622g;

    /* renamed from: h */
    public static final String f26623h;

    /* renamed from: i */
    public static final Pattern f26624i;

    /* renamed from: j */
    public static final Pattern f26625j;

    static {
        String format = String.format(".*(?<LastFourDigits>\\d{4})%s", "");
        f26618c = format;
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 2);
        sb.append('^');
        sb.append(format);
        sb.append('$');
        f26619d = Pattern.compile(sb.toString());
        String format2 = String.format("(0?[1-9]%s|1[0-2]%s)", "", "");
        f26621f = format2;
        StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 8);
        sb2.append("^\\D*");
        sb2.append(format2);
        sb2.append("\\D*$");
        f26622g = Pattern.compile(sb2.toString());
        String format3 = String.format("((?:\\d{4}%s)|(?:\\d{2}%s))(?<=(\\d{2}))", "", "");
        f26623h = format3;
        StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 8);
        sb3.append("^\\D*");
        sb3.append(format3);
        sb3.append("\\D*$");
        f26624i = Pattern.compile(sb3.toString());
        String str = f26621f;
        String str2 = f26623h;
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str2).length());
        sb4.append("^\\D*");
        sb4.append(str);
        sb4.append("\\D*");
        sb4.append(str2);
        sb4.append("\\D*$");
        f26625j = Pattern.compile(sb4.toString());
    }

    /* renamed from: a */
    public static String m19549a(int i) {
        if (i >= 10) {
            return String.format("(0?[1-9]%s|1[0-2]%s)", "", m19557c(String.valueOf(i)));
        }
        return String.format("(0?[1-9]%s|1[0-2]%s)", m19557c(String.valueOf(i)), "");
    }

    /* renamed from: b */
    public static String m19554b(int i) {
        String str;
        String valueOf = String.valueOf(i);
        int i2 = i % 100;
        if (i2 < 10) {
            String valueOf2 = String.valueOf(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 1);
            sb.append('0');
            sb.append(valueOf2);
            str = sb.toString();
        } else {
            str = String.valueOf(i2);
        }
        return String.format("((?:\\d{4}%s)|(?:\\d{2}%s))(?<=(\\d{2}))", m19557c(valueOf), m19557c(str));
    }

    /* renamed from: c */
    private static String m19557c(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5);
        sb.append("(?<!");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m19550a(CharSequence charSequence) {
        return String.format("%s •••• ${LastFourDigits}", charSequence);
    }

    /* renamed from: a */
    public static Pattern m19551a() {
        StringBuilder sb = new StringBuilder(19);
        sb.append("^\\d{0,5}$");
        return Pattern.compile(sb.toString());
    }

    /* renamed from: a */
    public static Pattern m19552a(String str) {
        String format = String.format(".*(?<LastFourDigits>\\d{4})%s", m19557c(str));
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 2);
        sb.append('^');
        sb.append(format);
        sb.append('$');
        return Pattern.compile(sb.toString());
    }

    /* renamed from: b */
    public static Pattern m19555b() {
        StringBuilder sb = new StringBuilder(18);
        sb.append("^.{0,5}$");
        return Pattern.compile(sb.toString());
    }

    /* renamed from: b */
    public static Pattern m19556b(String str) {
        StringBuilder sb = new StringBuilder("^");
        m19553a(str, 5, sb, 0);
        return Pattern.compile(sb.toString(), 2);
    }

    /* renamed from: a */
    private static void m19553a(String str, int i, StringBuilder sb, int i2) {
        if (i > 0 && i2 < str.length()) {
            int codePointAt = Character.codePointAt(str, i2);
            sb.append("($|");
            sb.append(Pattern.quote(new String(Character.toChars(codePointAt))));
            m19553a(str, i - 1, sb, i2 + Character.charCount(codePointAt));
            sb.append(')');
            return;
        }
        sb.append('$');
    }
}
