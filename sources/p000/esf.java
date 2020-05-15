package p000;

import android.content.Context;
import com.google.android.gms.accountsettings.p007mg.poc.model.repository.RepositoryDatabase;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: esf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class esf implements cayy {

    /* renamed from: a */
    private final cijl f15603a;

    /* renamed from: b */
    private final cijl f15604b;

    public esf(cijl cijl, cijl cijl2) {
        this.f15603a = cijl;
        this.f15604b = cijl2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        Context b = ((epb) this.f15603a).mo6445a();
        C0008af afVar = (C0008af) ((cayz) this.f15604b).f176439a;
        eqz eqz = new eqz();
        RepositoryDatabase a = RepositoryDatabase.m4960a(b);
        bqgj a2 = snp.m35702a(9);
        if (a2 instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) a2).setRejectedExecutionHandler(new ese());
        }
        bmzi a3 = bmzn.m108681a((bmzi) new esd(b));
        esx a4 = esx.m11109a();
        fgc.m11649a(afVar, new esc(a, a2, a3));
        esb esb = new esb(eqz, a2, a.mo6323k(), a.mo6324l(), a.mo6325m(), a3, a4);
        cazf.m127593a(esb, "Cannot return null from a non-@Nullable @Provides method");
        return esb;
    }
}
