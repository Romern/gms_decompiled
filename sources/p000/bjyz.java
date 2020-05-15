package p000;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bjyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjyz {

    /* renamed from: a */
    private static final Pattern f123662a = Pattern.compile("0+");

    /* renamed from: a */
    public static String m104951a(CharSequence charSequence) {
        return charSequence != null ? bjzi.m104971a(charSequence) : "";
    }

    /* renamed from: a */
    public static String m104952a(CharSequence charSequence, String str, boolean z) {
        if (charSequence == null) {
            return null;
        }
        String charSequence2 = charSequence.toString();
        int length = charSequence2.length() - 1;
        int i = 0;
        if (z) {
            if (charSequence2.startsWith(str)) {
                i = str.length();
            }
        } else if (charSequence2.endsWith(str)) {
            length -= str.length();
        }
        Matcher matcher = f123662a.matcher(charSequence2);
        if (!matcher.find(i) || matcher.start() != i) {
            length = i;
        } else if (matcher.end() != length + 1) {
            length = matcher.end();
        }
        return charSequence2.substring(length);
    }

    /* renamed from: a */
    public static String m104953a(String str, int i) {
        return str != null ? str.substring(0, Math.min(str.length(), i)) : "";
    }

    /* renamed from: a */
    public static String m104954a(String str, List list, int i, String str2) {
        int min = Math.min(list.size() - 1, i);
        int intValue = ((Integer) list.get(min)).intValue();
        int length = str.length();
        if (length <= intValue) {
            return str;
        }
        int i2 = length - intValue;
        String substring = str.substring(0, i2);
        String substring2 = str.substring(i2);
        String a = m104954a(substring, list, min + 1, str2);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + String.valueOf(str2).length() + String.valueOf(substring2).length());
        sb.append(a);
        sb.append(str2);
        sb.append(substring2);
        return sb.toString();
    }

    /* renamed from: a */
    public static String[] m104955a(CharSequence charSequence, Pattern pattern) {
        String[] strArr = new String[2];
        String str = null;
        if (pattern != null) {
            String[] split = pattern.split(charSequence, 2);
            strArr[0] = m104951a(split[0]);
            if (split.length == 2) {
                str = m104951a(split[1]);
            }
            strArr[1] = str;
        } else {
            strArr[0] = m104951a(charSequence);
            strArr[1] = null;
        }
        return strArr;
    }
}
