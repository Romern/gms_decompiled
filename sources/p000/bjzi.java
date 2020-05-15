package p000;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bjzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjzi {

    /* renamed from: a */
    private static final BigInteger f123668a = new BigInteger("97");

    /* renamed from: b */
    private static final Pattern f123669b = Pattern.compile("[^\\d]");

    /* renamed from: c */
    private static final int[] f123670c = {10, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

    /* renamed from: d */
    private static final int[] f123671d = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: e */
    private static final int[] f123672e = {1, 2, 1, 2, 1, 2, 1};

    /* renamed from: f */
    private static final int[] f123673f = {2, 7, 6, 5, 4, 3, 2};

    /* renamed from: g */
    private static final char[] f123674g = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};

    /* renamed from: h */
    private static final int[] f123675h = {2, 1, 2, 1, 2, 1, 2};

    /* renamed from: i */
    private static final int[] f123676i = {7, 9, 10, 5, 8, 4, 2};

    /* renamed from: j */
    private static final int[] f123677j = {8, 7, 6, 5, 4, 3, 2, 10, 1};

    /* renamed from: k */
    private static final int[] f123678k = {128, 64, 32, 16, 8, 4, 2};

    /* renamed from: l */
    private static final int[] f123679l = {8, 7, 6, 5, 4, 3, 2};

    /* renamed from: m */
    private static final int[] f123680m = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2};

    /* renamed from: n */
    private static final Pattern f123681n = Pattern.compile("\\d{6}");

    /* renamed from: o */
    private static final Pattern f123682o = Pattern.compile("^[A-Z&]{3,4}\\d{6}[A-Z0-9]{2}[A0-9]{1}$");

    /* renamed from: p */
    private static final Pattern f123683p = Pattern.compile("^[A-Z]{4}\\d{6}[A-Z0-9]{2}[A0-9]{1}$");

    /* renamed from: q */
    private static final SimpleDateFormat f123684q;

    /* renamed from: r */
    private static final int[] f123685r = {9, 8, 7, 6, 5, 4, 3, 2};

    /* renamed from: s */
    private static final int[] f123686s = {2, 3, 4, 5, 6, 7, 8, 9};

    /* renamed from: t */
    private static final int[] f123687t = {9, 8, 7, 6, 5, 4, 3, 2};

    /* renamed from: u */
    private static final int[] f123688u = {2, 1, 2, 1, 2, 1, 2, 1, 2};

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd", Locale.US);
        f123684q = simpleDateFormat;
        simpleDateFormat.setLenient(false);
    }

    /* renamed from: a */
    public static String m104971a(CharSequence charSequence) {
        if (charSequence != null) {
            return f123669b.matcher(charSequence).replaceAll("");
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m104973b(String str) {
        if (str.length() != 11) {
            return false;
        }
        int[] x = m104995x(str);
        int i = x[0];
        int i2 = x[1];
        int i3 = x[2];
        int i4 = x[3];
        int i5 = x[4];
        int i6 = x[5];
        int i7 = x[6];
        int i8 = x[7];
        int i9 = x[8];
        int i10 = 11 - ((((((((((i * 10) + (i2 * 9)) + (i3 * 8)) + (i4 * 7)) + (i5 * 6)) + (i6 * 5)) + (i7 * 4)) + (i8 * 3)) + (i9 + i9)) % 11);
        if (i10 >= 10) {
            i10 = 0;
        }
        int i11 = 11 - (((((((((((i * 11) + (i2 * 10)) + (i3 * 9)) + (i4 * 8)) + (i5 * 7)) + (i6 * 6)) + (i7 * 5)) + (i8 * 4)) + (i9 * 3)) + (i10 + i10)) % 11);
        if (i11 >= 10) {
            i11 = 0;
        }
        return i10 == x[9] && i11 == x[10];
    }

    /* renamed from: c */
    public static boolean m104974c(String str) {
        int length = str.length();
        if (length < 5 || length > 34) {
            return false;
        }
        String upperCase = str.toUpperCase(Locale.US);
        String valueOf = String.valueOf(upperCase.substring(4));
        String valueOf2 = String.valueOf(upperCase.substring(0, 4));
        String str2 = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str2.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                sb.append(charAt - '7');
            } else if (charAt < '0' || charAt > '9') {
                return false;
            } else {
                sb.append(charAt - '0');
            }
        }
        if (new BigInteger(sb.toString()).mod(f123668a).intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m104975d(String str) {
        int length = str.length();
        int i = 5;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (!Character.isDigit(charAt)) {
                return false;
            }
            int numericValue = Character.getNumericValue(charAt);
            if (i == 0) {
                i = 10;
            }
            i = (((i + i) % 11) + numericValue) % 10;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m104976e(String str) {
        if (str.length() == 24) {
            try {
                if (97 - new BigInteger(String.valueOf(str.substring(0, 22)).concat("00")).mod(f123668a).intValue() == Integer.parseInt(str.substring(22))) {
                    return true;
                }
                return false;
            } catch (NumberFormatException e) {
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m104977f(String str) {
        if (str.length() >= 11) {
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                i += ((str.charAt(i2) - '0') - f123671d[i2]) * f123670c[i2];
            }
            if (i % 89 == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m104978g(String str) {
        if (str.length() >= 9) {
            String substring = str.substring(str.length() - 8);
            if (bjyv.m104933a(bjyv.m104934a(substring.substring(0, 7), f123672e, true) + 4, 10, true, false) == substring.charAt(7)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m104979h(String str) {
        if (str.length() >= 9) {
            int parseInt = Integer.parseInt(str.substring(str.length() - 9));
            if (((parseInt / 100) % 97) + (parseInt % 100) == 97) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m104980i(String str) {
        if (str.length() >= 9) {
            String substring = str.substring(str.length() - 9);
            int i = 10;
            for (int i2 = 0; i2 < 8; i2++) {
                int charAt = i + (substring.charAt(i2) - '0');
                if (charAt > 10) {
                    charAt %= 10;
                }
                i = (charAt + charAt) % 11;
            }
            if (bjyv.m104933a(i, 11, true, false) == substring.charAt(8)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m104981j(String str) {
        if (str.length() >= 8) {
            String substring = str.substring(str.length() - 8);
            if (bjyv.m104933a(bjyv.m104934a(substring.substring(0, 7), f123673f, false), 11, true, true) == substring.charAt(7)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m104982k(String str) {
        if (str.length() < 9) {
            return false;
        }
        String substring = str.substring(str.length() - 9);
        if (Character.isDigit(substring.charAt(0))) {
            if (f123674g[Integer.parseInt(substring.substring(0, 8)) % 23] != substring.charAt(8)) {
                return false;
            }
        } else if (Character.isDigit(substring.charAt(8))) {
            if (bjyv.m104933a(bjyv.m104934a(substring.substring(1, 8), f123675h, true), 10, true, false) != substring.charAt(8)) {
                return false;
            }
        } else if (substring.charAt(0) != 'N' || ((char) ((10 - (bjyv.m104934a(substring.substring(1, 8), f123675h, true) % 10)) + 64)) == substring.charAt(8)) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static boolean m104983l(String str) {
        if (str.length() >= 8) {
            String substring = str.substring(str.length() - 8);
            if (bjyv.m104933a(bjyv.m104934a(substring.substring(0, 7), f123676i, false), 11, true, true) == substring.charAt(7)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m104984m(String str) {
        if (str.length() < 9) {
            return false;
        }
        String substring = str.substring(str.length() - 9);
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, 0, 42);
        return hashSet.contains(Integer.valueOf(bjyv.m104934a(substring, f123677j, false) % 97));
    }

    /* renamed from: n */
    public static boolean m104985n(String str) {
        if (str.length() >= 8) {
            String substring = str.substring(str.length() - 8);
            if (substring.charAt(7) == bjyv.m104933a(bjyv.m104934a(substring.substring(0, 7), f123678k, false), 11, false, false)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m104986o(String str) {
        if (str.length() >= 11) {
            String substring = str.substring(str.length() - 11);
            int i = 10;
            for (int i2 = 0; i2 < 10; i2++) {
                int charAt = (i + (substring.charAt(i2) - '0')) % 10;
                if (charAt == 0) {
                    charAt = 10;
                }
                i = (charAt + charAt) % 11;
            }
            if ((11 - i) % 10 == substring.charAt(10) - '0') {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public static boolean m104987p(String str) {
        if (str.length() < 8) {
            return false;
        }
        char c = 'W';
        if (str.length() == 9) {
            int a = (bjyv.m104934a(str.substring(0, 7), f123679l, false) + ((str.charAt(8) - '@') * 9)) % 23;
            if (a != 0) {
                c = (char) (a + 64);
            }
            if (str.charAt(7) != c) {
                return false;
            }
        } else if (str.length() != 8 || !Character.isDigit(str.charAt(1))) {
            return true;
        } else {
            int a2 = bjyv.m104934a(str.substring(0, 7), f123679l, false) % 23;
            if (a2 != 0) {
                c = (char) (a2 + 64);
            }
            if (str.charAt(7) != c) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: q */
    public static boolean m104988q(String str) {
        if (str.length() < 11 || bjyv.m104933a(bjyv.m104934a(str.substring(0, 10), f123680m, true), 10, true, false) != str.charAt(10)) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m104989r(String str) {
        if (str.length() >= 8) {
            int parseInt = Integer.parseInt(str.substring(str.length() - 8));
            if ((parseInt / 100) % 89 == parseInt % 100) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public static boolean m104990s(String str) {
        if (str.length() < 12) {
            return false;
        }
        if (!f123682o.matcher(str).matches() && !f123683p.matcher(str).matches()) {
            return false;
        }
        Matcher matcher = f123681n.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            f123684q.parse(matcher.group());
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /* renamed from: t */
    public static boolean m104991t(String str) {
        if (str.length() >= 12) {
            String substring = str.substring(str.length() - 12);
            if (substring.charAt(8) == bjyv.m104933a(bjyv.m104934a(substring.substring(0, 8), f123685r, false), 11, false, false)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    public static boolean m104992u(String str) {
        if (str.length() < 9) {
            return false;
        }
        if (bjyv.m104933a(bjyv.m104934a(str.substring(0, 8), f123686s, false), 11, false, false) == str.charAt(8) || bjyv.m104933a(bjyv.m104934a(str.substring(0, 8), f123687t, false), 11, true, false) == str.charAt(8)) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public static boolean m104993v(String str) {
        if (str.length() >= 12) {
            String substring = str.substring(str.length() - 12);
            if (bjyv.m104933a(bjyv.m104934a(substring.substring(0, 9), f123688u, true), 10, true, false) == substring.charAt(9)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m104994w(String str) {
        int i = 0;
        boolean z = false;
        for (int length = str.length() - 1; length >= 0; length--) {
            int parseInt = Integer.parseInt(str.substring(length, length + 1));
            if (z && (parseInt = parseInt + parseInt) > 9) {
                parseInt -= 9;
            }
            i += parseInt;
            z = !z;
        }
        if (i % 10 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private static int[] m104995x(String str) {
        int[] iArr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            iArr[i] = Character.getNumericValue(str.charAt(i));
        }
        return iArr;
    }

    /* renamed from: a */
    public static boolean m104972a(String str) {
        if (str.length() != 14) {
            return false;
        }
        int[] x = m104995x(str);
        int i = x[0];
        int i2 = x[1];
        int i3 = x[2];
        int i4 = x[3];
        int i5 = x[4];
        int i6 = x[5];
        int i7 = x[6];
        int i8 = x[7];
        int i9 = x[8];
        int i10 = x[9];
        int i11 = x[10];
        int i12 = x[11];
        int i13 = x[12];
        int i14 = (((((((((((((i * 5) + (i2 * 4)) + (i3 * 3)) + (i4 + i4)) + (i5 * 9)) + (i6 * 8)) + (i7 * 7)) + (i8 * 6)) + (i9 * 5)) + (i10 * 4)) + (i11 * 3)) + (i12 + i12)) + i13) % 11;
        if (i14 != 0 && (i14 != 1 || i13 != 0)) {
            return false;
        }
        int i15 = x[13];
        int i16 = ((((((((((((((i * 6) + (i2 * 5)) + (i3 * 4)) + (i4 * 3)) + (i5 + i5)) + (i6 * 9)) + (i7 * 8)) + (i8 * 7)) + (i9 * 6)) + (i10 * 5)) + (i11 * 4)) + (i12 * 3)) + (i13 + i13)) + i15) % 11;
        return i16 == 0 || (i16 == 1 && i15 == 0);
    }
}
