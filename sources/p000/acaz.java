package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: acaz */
final /* synthetic */ class acaz implements Callable {

    /* renamed from: a */
    private final acbb f59409a;

    /* renamed from: b */
    private final bxqj f59410b;

    public acaz(acbb acbb, bxqj bxqj) {
        this.f59409a = acbb;
        this.f59410b = bxqj;
    }

    public final Object call() {
        acbb acbb = this.f59409a;
        bxqj bxqj = this.f59410b;
        ClientContext a = acbb.mo32601a(acbb.f59413a);
        adym adym = acbb.f59414b;
        if (adym.f62907c == null) {
            adym.f62907c = chtv.m149566a(chtu.UNARY, "footprints.oneplatform.FootprintsService/Write", ciie.m150370a(bxqj.f164389e), ciie.m150370a(bxqk.f164396a));
        }
        return (bxqk) adym.f62911a.mo25553a(adym.f62907c, a, bxqj, 10000, TimeUnit.MILLISECONDS);
    }
}
