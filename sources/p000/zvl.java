package p000;

/* renamed from: zvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class zvl {

    /* renamed from: a */
    protected final String f56028a;

    /* renamed from: b */
    protected final String f56029b;

    /* renamed from: c */
    private final rjx f56030c;

    static {
        zvt.m46581a();
    }

    protected zvl(rjx rjx, String str, String str2) {
        this.f56030c = rjx;
        this.f56028a = str;
        this.f56029b = str2;
    }

    /* renamed from: a */
    public final aucb mo31538a(String str, int i, bxxc bxxc) {
        StringBuilder sb = new StringBuilder(str.length() + 12);
        sb.append(str);
        sb.append(i);
        sb.append("/");
        return mo31539a(sb.toString(), bxxc);
    }

    /* renamed from: a */
    public final aucb mo31539a(String str, bxxc bxxc) {
        rjx rjx = this.f56030c;
        String str2 = this.f56029b;
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f56028a);
        return rjx.mo24694a(str2, valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2), bxxc.serializeToBytes());
    }
}
