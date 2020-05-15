package p000;

/* renamed from: cba */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cba {

    /* renamed from: a */
    private final String f6379a;

    /* renamed from: b */
    private final caz f6380b;

    /* renamed from: c */
    private caz f6381c;

    /* renamed from: d */
    private boolean f6382d = false;

    public cba(String str) {
        caz caz = new caz();
        this.f6380b = caz;
        this.f6381c = caz;
        cbb.m3883b(str);
        this.f6379a = str;
    }

    /* renamed from: a */
    public final void mo3643a() {
        this.f6382d = true;
    }

    public final String toString() {
        boolean z = this.f6382d;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f6379a);
        sb.append('{');
        String str = "";
        for (caz caz = this.f6380b.f6370c; caz != null; caz = caz.f6370c) {
            if (!z || caz.f6369b != null) {
                sb.append(str);
                String str2 = caz.f6368a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                sb.append(caz.f6369b);
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo3644a(String str) {
        mo3645a(str, "0");
    }

    /* renamed from: a */
    public final void mo3645a(String str, Object obj) {
        caz caz = new caz();
        this.f6381c.f6370c = caz;
        this.f6381c = caz;
        caz.f6369b = obj;
        cbb.m3883b(str);
        caz.f6368a = str;
    }

    /* renamed from: a */
    public final void mo3646a(String str, boolean z) {
        mo3645a(str, String.valueOf(z));
    }
}
