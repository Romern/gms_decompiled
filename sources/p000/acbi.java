package p000;

/* renamed from: acbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class acbi {

    /* renamed from: a */
    public int f59436a;

    /* renamed from: b */
    public int f59437b;

    /* renamed from: c */
    private final char[] f59438c;

    public acbi(String str) {
        this.f59438c = str.toCharArray();
    }

    /* renamed from: a */
    protected static boolean m48813a(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: b */
    public final void mo32609b() {
        this.f59437b = this.f59436a;
    }

    /* renamed from: c */
    public final acbh mo32610c() {
        int i = this.f59437b;
        return new acbh(i, new String(this.f59438c, i, this.f59436a - i));
    }

    /* renamed from: d */
    public final void mo32611d() {
        mo32612e();
        this.f59436a++;
    }

    /* renamed from: e */
    public final char mo32612e() {
        return this.f59438c[this.f59436a];
    }

    /* renamed from: f */
    public final void mo32613f() {
        while (!mo32608a() && Character.isWhitespace(mo32612e())) {
            mo32611d();
        }
    }

    /* renamed from: a */
    public final acbg mo32606a(String str) {
        return mo32607a(str, this.f59436a);
    }

    /* renamed from: a */
    public final acbg mo32607a(String str, int i) {
        return new acbg(i, new String(this.f59438c), str);
    }

    /* renamed from: a */
    public final boolean mo32608a() {
        return this.f59436a == this.f59438c.length;
    }
}
