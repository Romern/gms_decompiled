package p000;

import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: acba */
final /* synthetic */ class acba implements Callable {

    /* renamed from: a */
    private final acbb f59411a;

    /* renamed from: b */
    private final bxpg f59412b;

    public acba(acbb acbb, bxpg bxpg) {
        this.f59411a = acbb;
        this.f59412b = bxpg;
    }

    public final Object call() {
        acbb acbb = this.f59411a;
        bxpg bxpg = this.f59412b;
        ClientContext a = acbb.mo32601a(acbb.f59413a);
        adym adym = acbb.f59414b;
        if (adym.f62910f == null) {
            adym.f62910f = chtv.m149566a(chtu.UNARY, "footprints.oneplatform.FootprintsService/GetDeletions", ciie.m150370a(bxpg.f164258g), ciie.m150370a(bxpj.f164274e));
        }
        return (bxpj) adym.f62911a.mo25553a(adym.f62910f, a, bxpg, 10000, TimeUnit.MILLISECONDS);
    }
}
