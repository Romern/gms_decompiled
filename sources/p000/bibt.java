package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: bibt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bibt {

    /* renamed from: b */
    public static chtv f120160b;

    /* renamed from: c */
    public static chtv f120161c;

    /* renamed from: d */
    private static chtv f120162d;

    /* renamed from: a */
    public final shl f120163a;

    public bibt(shl shl) {
        this.f120163a = shl;
    }

    /* renamed from: a */
    public final bvtw mo64509a(ClientContext clientContext, bvtv bvtv, long j) {
        if (f120162d == null) {
            f120162d = chtv.m149566a(chtu.UNARY, "userlocation.SemanticLocationService/GetPersonalPlaces", ciie.m150370a(bvtv.f157621d), ciie.m150370a(bvtw.f157626b));
        }
        return (bvtw) this.f120163a.mo25553a(f120162d, clientContext, bvtv, j, TimeUnit.MILLISECONDS);
    }
}
