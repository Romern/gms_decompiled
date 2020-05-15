package p000;

import android.os.Build;

/* renamed from: bema */
public final /* synthetic */ class bema implements bqer {

    /* renamed from: a */
    private final beno f111811a;

    public bema(beno beno) {
        this.f111811a = beno;
    }

    /* renamed from: a */
    public final bqeu mo60793a(bqes bqes, Object obj) {
        beno beno = this.f111811a;
        bemk bemk = (bemk) obj;
        String str = beno.f111884a;
        Object[] objArr = beno.f111885b;
        bemk.mo60800a();
        bemj bemj = new bemj(bemk, objArr, str);
        int i = Build.VERSION.SDK_INT;
        bene bene = new bene(bemj);
        bemk.f111830b.execute(bljx.m107269a(bene));
        bmxy.m108581a(bene);
        return bqeu.m112717a(bene, bqfb.INSTANCE);
    }
}
