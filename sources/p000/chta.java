package p000;

/* renamed from: chta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class chta {
    /* renamed from: a */
    public static chta m149516a(String str, int i) {
        if (chte.f189119b != null) {
            return chte.f189119b.mo85630a(str, i);
        }
        throw new chtd("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    /* renamed from: b */
    public abstract chsz mo85581b();
}
