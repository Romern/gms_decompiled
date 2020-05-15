package p000;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bnsu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnsu implements bnsv {

    /* renamed from: a */
    private static final Set f132112a = new HashSet(Arrays.asList(Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Float.class, Double.class));

    /* renamed from: b */
    private final String f132113b;

    /* renamed from: c */
    private final String f132114c;

    /* renamed from: d */
    private final StringBuilder f132115d;

    /* renamed from: e */
    private boolean f132116e = false;

    public bnsu(String str, String str2, StringBuilder sb) {
        this.f132113b = str;
        this.f132114c = str2;
        this.f132115d = sb;
    }

    /* renamed from: a */
    private static int m110340a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt == '\"' || charAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public final void mo68469a() {
        if (this.f132116e) {
            this.f132115d.append(this.f132114c);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.String, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    /* renamed from: a */
    public final void mo68470a(String str, Object obj) {
        char c = ' ';
        if (this.f132116e) {
            this.f132115d.append(' ');
        } else {
            if (this.f132115d.length() > 0) {
                StringBuilder sb = this.f132115d;
                if (sb.length() > 1000 || this.f132115d.indexOf("\n") != -1) {
                    c = 10;
                }
                sb.append(c);
            }
            this.f132115d.append(this.f132113b);
            this.f132116e = true;
        }
        StringBuilder sb2 = this.f132115d;
        sb2.append(str);
        sb2.append('=');
        if (obj == null) {
            this.f132115d.append(true);
        } else if (f132112a.contains(obj.getClass())) {
            this.f132115d.append(obj);
        } else {
            this.f132115d.append('\"');
            StringBuilder sb3 = this.f132115d;
            String obj2 = obj.toString();
            int i = 0;
            while (true) {
                int a = m110340a(obj2, i);
                if (a != -1) {
                    sb3.append((CharSequence) obj2, i, a);
                    i = a + 1;
                    char charAt = obj2.charAt(a);
                    if (charAt == 9) {
                        charAt = 't';
                    } else if (charAt == 10) {
                        charAt = 'n';
                    } else if (charAt == 13) {
                        charAt = 'r';
                    } else if (!(charAt == '\"' || charAt == '\\')) {
                        sb3.append(65533);
                    }
                    sb3.append("\\");
                    sb3.append(charAt);
                } else {
                    sb3.append((CharSequence) obj2, i, obj2.length());
                    this.f132115d.append('\"');
                    return;
                }
            }
        }
    }
}
