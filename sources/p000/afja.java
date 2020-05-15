package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: afja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afja {

    /* renamed from: b */
    public static final int f64278b = ((int) cfeo.m138877h());

    /* renamed from: c */
    public static chtv f64279c;

    /* renamed from: d */
    public static chtv f64280d;

    /* renamed from: e */
    public static chtv f64281e;

    /* renamed from: f */
    public static chtv f64282f;

    /* renamed from: g */
    private static chtv f64283g;

    /* renamed from: a */
    public final shl f64284a;

    public afja(shl shl) {
        this.f64284a = shl;
    }

    /* renamed from: a */
    public final cbgu mo34895a(ClientContext clientContext, cbgt cbgt) {
        if (f64283g == null) {
            f64283g = chtv.m149566a(chtu.UNARY, "google.internal.communications.instantmessaging.v1.Matchstick/SendMatchstickMessage", ciie.m150370a(cbgt.f177082e), ciie.m150370a(cbgu.f177088b));
        }
        return (cbgu) this.f64284a.mo25553a(f64283g, clientContext, cbgt, (long) f64278b, TimeUnit.MILLISECONDS);
    }
}
