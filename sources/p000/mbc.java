package p000;

/* renamed from: mbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mbc extends mbd {

    /* renamed from: a */
    public final int f33374a;

    public mbc(String str, int i) {
        super(str);
        this.f33374a = i;
    }

    /* renamed from: a */
    public final int mo19815a() {
        return -3;
    }

    /* renamed from: b */
    public final int mo19816b() {
        return 8;
    }

    public final String toString() {
        String exc = super.toString();
        int i = this.f33374a;
        String valueOf = String.valueOf(i != 0 ? ltp.m24384b(i) : "null");
        StringBuilder sb = new StringBuilder(String.valueOf(exc).length() + 20 + String.valueOf(valueOf).length());
        sb.append(exc);
        sb.append("\n\terror auth code : ");
        sb.append(valueOf);
        return sb.toString();
    }
}
