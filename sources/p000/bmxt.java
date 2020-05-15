package p000;

import java.util.Arrays;

/* renamed from: bmxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmxt {

    /* renamed from: a */
    private final String f131183a;

    /* renamed from: b */
    private final bmxs f131184b;

    /* renamed from: c */
    private bmxs f131185c;

    /* renamed from: d */
    private boolean f131186d = false;

    public bmxt(String str) {
        bmxs bmxs = new bmxs();
        this.f131184b = bmxs;
        this.f131185c = bmxs;
        bmxy.m108581a(str);
        this.f131183a = str;
    }

    /* renamed from: b */
    private final bmxs m108554b() {
        bmxs bmxs = new bmxs();
        this.f131185c.f131182c = bmxs;
        this.f131185c = bmxs;
        return bmxs;
    }

    /* renamed from: a */
    public final void mo66880a() {
        this.f131186d = true;
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
        boolean z = this.f131186d;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f131183a);
        sb.append('{');
        String str = "";
        for (bmxs bmxs = this.f131184b.f131182c; bmxs != null; bmxs = bmxs.f131182c) {
            Object obj = bmxs.f131181b;
            if (!z || obj != null) {
                sb.append(str);
                String str2 = bmxs.f131180a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj != null && obj.getClass().isArray()) {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                } else {
                    sb.append(obj);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo66881a(Object obj) {
        m108554b().f131181b = obj;
    }

    /* renamed from: a */
    public final void mo66882a(String str, double d) {
        mo66885a(str, String.valueOf(d));
    }

    /* renamed from: a */
    public final void mo66883a(String str, int i) {
        mo66885a(str, String.valueOf(i));
    }

    /* renamed from: a */
    public final void mo66884a(String str, long j) {
        mo66885a(str, String.valueOf(j));
    }

    /* renamed from: a */
    public final void mo66885a(String str, Object obj) {
        bmxs b = m108554b();
        b.f131181b = obj;
        bmxy.m108581a(str);
        b.f131180a = str;
    }

    /* renamed from: a */
    public final void mo66886a(String str, boolean z) {
        mo66885a(str, String.valueOf(z));
    }
}
