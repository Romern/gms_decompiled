package p000;

/* renamed from: bmzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmzl implements bmzi {

    /* renamed from: a */
    volatile bmzi f131270a;

    /* renamed from: b */
    volatile boolean f131271b;

    /* renamed from: c */
    Object f131272c;

    public bmzl(bmzi bmzi) {
        bmxy.m108581a(bmzi);
        this.f131270a = bmzi;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        if (!this.f131271b) {
            synchronized (this) {
                if (!this.f131271b) {
                    Object a = this.f131270a.mo6606a();
                    this.f131272c = a;
                    this.f131271b = true;
                    this.f131270a = null;
                    return a;
                }
            }
        }
        return this.f131272c;
    }

    public final String toString() {
        Object obj = this.f131270a;
        if (obj == null) {
            String valueOf = String.valueOf(this.f131272c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
