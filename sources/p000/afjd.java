package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: afjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afjd {

    /* renamed from: b */
    public static final int f64289b = ((int) cfeo.m138877h());

    /* renamed from: c */
    public static chtv f64290c;

    /* renamed from: d */
    public static chtv f64291d;

    /* renamed from: e */
    public static chtv f64292e;

    /* renamed from: f */
    public static chtv f64293f;

    /* renamed from: g */
    public static chtv f64294g;

    /* renamed from: h */
    private static chtv f64295h;

    /* renamed from: a */
    public final shl f64296a;

    public afjd(shl shl) {
        this.f64296a = shl;
    }

    /* renamed from: a */
    public final cblg mo34896a(ClientContext clientContext, cblf cblf) {
        if (f64295h == null) {
            f64295h = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.Registration/RegisterRefresh", ciie.m150370a(cblf.f177482m), ciie.m150370a(cblg.f177496f));
        }
        return (cblg) this.f64296a.mo25553a(f64295h, clientContext, cblf, (long) f64289b, TimeUnit.MILLISECONDS);
    }
}
