package p000;

import java.util.Arrays;

/* renamed from: bwau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwau {

    /* renamed from: a */
    private final String f158679a;

    /* renamed from: b */
    private final bwat f158680b;

    /* renamed from: c */
    private bwat f158681c;

    private bwau(String str) {
        bwat bwat = new bwat();
        this.f158680b = bwat;
        this.f158681c = bwat;
        sdo.m34959a((Object) str);
        this.f158679a = str;
    }

    /* renamed from: a */
    public static bwau m121665a(Object obj) {
        return new bwau(obj.getClass().getSimpleName());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.String, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f158679a);
        sb.append('{');
        bwat bwat = this.f158680b.f158678c;
        String str = "";
        while (bwat != null) {
            Object obj = bwat.f158677b;
            sb.append(str);
            String str2 = bwat.f158676a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            bwat = bwat.f158678c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo73415a(String str, Object obj) {
        bwat bwat = new bwat();
        this.f158681c.f158678c = bwat;
        this.f158681c = bwat;
        bwat.f158677b = obj;
        sdo.m34959a((Object) str);
        bwat.f158676a = str;
    }
}
