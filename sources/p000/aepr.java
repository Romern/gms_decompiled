package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: aepr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aepr {

    /* renamed from: b */
    public static final int f63608b = ((int) cezv.m138513h());

    /* renamed from: c */
    public static chtv f63609c;

    /* renamed from: d */
    private static chtv f63610d;

    /* renamed from: e */
    private static chtv f63611e;

    /* renamed from: a */
    public final shl f63612a;

    public aepr(shl shl) {
        this.f63612a = shl;
    }

    /* renamed from: a */
    public final buoo mo34440a(ClientContext clientContext, buon buon) {
        if (f63610d == null) {
            f63610d = chtv.m149566a(chtu.UNARY, "google.internal.android.location.quake.v1.QuakeApiService/NodeOnline", ciie.m150370a(buon.f154553e), ciie.m150370a(buoo.f154559e));
        }
        return (buoo) this.f63612a.mo25553a(f63610d, clientContext, buon, (long) f63608b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final buos mo34441a(ClientContext clientContext, buor buor) {
        if (f63611e == null) {
            f63611e = chtv.m149566a(chtu.UNARY, "google.internal.android.location.quake.v1.QuakeApiService/NodeTriggering", ciie.m150370a(buor.f154576d), ciie.m150370a(buos.f154581b));
        }
        return (buos) this.f63612a.mo25553a(f63611e, clientContext, buor, (long) f63608b, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public final void mo34442a() {
        this.f63612a.mo25561g();
    }
}
