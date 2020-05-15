package p000;

import android.content.Context;
import android.util.SparseArray;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.Collection;
import java.util.Set;

/* renamed from: dwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dwt extends dwm {

    /* renamed from: a */
    public final Context f14313a;

    /* renamed from: b */
    public final dxa f14314b = new dxa();

    /* renamed from: c */
    public final SparseArray f14315c = new SparseArray();

    public dwt(Context context) {
        this.f14313a = context;
    }

    /* renamed from: a */
    public static void m9709a(dwu dwu, dqb dqb, dqx dqx) {
        if (dwu != null) {
            dqb.mo9435a(new dws(dwu), dqx);
        }
    }

    /* renamed from: b */
    public final void mo9818b(doh doh, Collection collection, dwu dwu, dqb dqb, dqx dqx) {
        dqx.mo9467f();
        new dxh(this.f14313a, doh, collection, dwu, dqb).mo9516a(dqx);
    }

    /* renamed from: c */
    public final void mo9819c(doh doh, Collection collection, dwu dwu, dqb dqb, dqx dqx) {
        if (doh.mo9338b()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dwt", "c", 245, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[NetworkManager] Cannot use an anonymous account for reportFenceResults RPC.");
            m9709a(dwu, dqb, dqx);
            return;
        }
        dqx.mo9467f();
        new dxj(this.f14313a, doh, collection, dwu, dqb).mo9516a(dqx);
    }

    /* renamed from: a */
    public final void mo9814a(doh doh, bxqt bxqt, dwu dwu, dqb dqb, dqx dqx) {
        dqx.mo9467f();
        if (doh.mo9338b()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dwt", "a", (int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[NetworkManager] Cannot use an anonymous account for readFootprintsContext RPC.");
            m9709a(dwu, dqb, dqx);
            return;
        }
        new dxg(this.f14313a, doh, bxqt, dwu, dqb).mo9516a(dqx);
    }

    /* renamed from: a */
    public final void mo9815a(doh doh, Collection collection, dwu dwu, dqb dqb, dqx dqx) {
        if (doh.mo9338b()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dwt", "a", 140, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[NetworkManager] Cannot use an anonymous account for writeBatch RPC.");
            m9709a(dwu, dqb, dqx);
            return;
        }
        dqx.mo9467f();
        new dxk(this.f14313a, doh, collection, dwu, dqb).mo9516a(dqx);
    }

    /* renamed from: a */
    public final void mo9816a(doh doh, Set set, dwu dwu, dqb dqb, dqx dqx) {
        if (doh.mo9338b()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dwt", "a", 121, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[NetworkManager] Cannot use an anonymous account for writeInterestRecord RPC.");
            m9709a(dwu, dqb, dqx);
            return;
        }
        dqx.mo9467f();
        new dxl(this.f14313a, doh, set, dwu, dqb).mo9516a(dqx);
    }

    /* renamed from: a */
    public final void mo9817a(doh doh, tnj tnj, dwu dwu, dqb dqb, dqx dqx) {
        if (doh.mo9338b()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dwt", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[NetworkManager] Cannot use an anonymous account for registerDevice RPC.");
            m9709a(dwu, dqb, dqx);
            return;
        }
        dqx.mo9467f();
        new dxi(this.f14313a, doh, tnj, dwu, dqb).mo9516a(dqx);
    }
}
