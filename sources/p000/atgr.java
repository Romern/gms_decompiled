package p000;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: atgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atgr extends brez {

    /* renamed from: m */
    private static final srn f90308m = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: n */
    private String f90309n;

    public atgr(Context context, brhc brhc, Executor executor, atfo atfo, atgo atgo) {
        super(context, brhc, executor, atfo, atgo);
    }

    /* renamed from: a */
    public final boolean mo49968a() {
        try {
            String a = atxv.m76523a().mo50308a(atxt.FELICA, 30, TimeUnit.SECONDS);
            this.f90309n = a;
            if (a != null) {
                return true;
            }
            ((bnsl) f90308m.mo68387b()).mo68405a("FeliCa access reservation timed out");
            return false;
        } catch (InterruptedException e) {
            bnsl bnsl = (bnsl) f90308m.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Interrupted while reserving FeliCa access");
            return false;
        }
    }

    /* renamed from: b */
    public final void mo49969b() {
        atxv.m76523a().mo50309a(atxt.FELICA, this.f90309n);
        this.f90309n = null;
    }
}
