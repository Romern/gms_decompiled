package p000;

/* renamed from: chwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chwx {

    /* renamed from: a */
    public final chsn f189430a;

    /* renamed from: b */
    public chsu f189431b;

    /* renamed from: c */
    public chsw f189432c;

    /* renamed from: d */
    final /* synthetic */ chxc f189433d;

    public chwx(chxc chxc, chsn chsn) {
        this.f189433d = chxc;
        this.f189430a = chsn;
        chsw a = chxc.f189435a.mo85622a(chxc.f189436b);
        this.f189432c = a;
        if (a != null) {
            this.f189431b = a.mo85597a(chsn);
            return;
        }
        String str = chxc.f189436b;
        StringBuilder sb = new StringBuilder(str.length() + 182);
        sb.append("Could not find policy '");
        sb.append(str);
        sb.append("'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        throw new IllegalStateException(sb.toString());
    }
}
