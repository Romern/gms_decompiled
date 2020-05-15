package p000;

import com.google.android.gms.contextmanager.ContextData;
import java.util.Collection;

/* renamed from: dre */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dre implements drb {

    /* renamed from: a */
    private static dre f13863a;

    /* renamed from: c */
    public static synchronized dre m9137c() {
        dre dre;
        synchronized (dre.class) {
            if (f13863a == null) {
                f13863a = new dre();
            }
            dre = f13863a;
        }
        return dre;
    }

    /* renamed from: a */
    public final doh mo9471a() {
        return null;
    }

    /* renamed from: b */
    public final boolean mo9474b() {
        return true;
    }

    /* renamed from: a */
    public final void mo9472a(doh doh, ContextData contextData) {
        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
        bnsl.mo68432a("dre", "a", 40, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("[ContextManagerFEServerConsumer] Deliver is currently unsupported.");
    }

    /* renamed from: a */
    public final void mo9473a(doh doh, Collection collection, dpv dpv, dqb dqb) {
        dwt w = dwq.m9679w();
        drv k = dwq.m9667k();
        dwq.m9672p().mo10040a(collection, 2, dwq.m9665i().mo20505a(), dwq.m9652a(doh, "ContextManagerFEServerConsumer"));
        drd drd = new drd(doh, collection, dpv, dqb, dqy.m9123a("ContextManagerFEServer#writeBatch+callback"));
        dqx a = dqy.m9123a("ContextManagerFEServer#writeBatch");
        if (doh.mo9338b()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dwt", "a", 140, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[NetworkManager] Cannot use an anonymous account for writeBatch RPC.");
            dwt.m9709a(drd, k, a);
            return;
        }
        a.mo9467f();
        new dxk(w.f14313a, doh, collection, drd, k).mo9516a(a);
    }
}
