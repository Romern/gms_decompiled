package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: akhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akhj {

    /* renamed from: b */
    public static chtv f71994b;

    /* renamed from: c */
    public static chtv f71995c;

    /* renamed from: d */
    private static chtv f71996d;

    /* renamed from: a */
    public final shl f71997a;

    public akhj(shl shl) {
        this.f71997a = shl;
    }

    /* renamed from: a */
    public final bvkg mo39447a(ClientContext clientContext, bvkf bvkf) {
        if (f71996d == null) {
            f71996d = chtv.m149566a(chtu.UNARY, "location.nearby.sharing.v1.NearbySharingService/UpdateDevice", ciie.m150370a(bvkf.f156404c), ciie.m150370a(bvkg.f156408c));
        }
        return (bvkg) this.f71997a.mo25553a(f71996d, clientContext, bvkf, 10000, TimeUnit.MILLISECONDS);
    }
}
