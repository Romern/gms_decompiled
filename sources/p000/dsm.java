package p000;

import android.app.PendingIntent;
import com.google.android.contextmanager.fence.FencePendingIntentCache$FencePendingIntentItem;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: dsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dsm extends drx {

    /* renamed from: c */
    private final tmo f13944c;

    /* renamed from: d */
    private final ContextManagerClientInfo f13945d;

    /* renamed from: e */
    private final drc f13946e;

    public dsm(tmo tmo, ContextManagerClientInfo contextManagerClientInfo, drc drc) {
        super("UnregisterListenerOperation");
        this.f13944c = tmo;
        this.f13945d = contextManagerClientInfo;
        this.f13946e = drc;
    }

    /* renamed from: a */
    private final void m9233a(int i) {
        int i2;
        drn.m9163a(this.f13944c, i);
        dpf G = dwq.m9650G();
        ContextManagerClientInfo contextManagerClientInfo = this.f13945d;
        if (this.f13946e.f13852a == null) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        bxvd a = dpf.m9018a(contextManagerClientInfo, 7, i);
        bxvd da = bxgs.f163294c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxgs bxgs = (bxgs) da.f164949b;
        bxgs.f163297b = i2 - 1;
        bxgs.f163296a |= 1;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bxgc bxgc = (bxgc) a.f164949b;
        bxgs bxgs2 = (bxgs) da.mo74062i();
        bxgc bxgc2 = bxgc.f163222o;
        bxgs2.getClass();
        bxgc.f163233j = bxgs2;
        bxgc.f163224a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        G.mo9374a((bxgc) a.mo74062i());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        dvx r = dwq.m9674r();
        if (!this.f13945d.mo18067b()) {
            m9233a(7504);
            return;
        }
        r.mo9722a(this.f13945d.mo18066a(), this.f13946e);
        if (this.f13946e.f13852a != null) {
            dtl E = dwq.m9648E();
            PendingIntent pendingIntent = this.f13946e.f13852a;
            E.mo9565e();
            dtx dtx = E.f13991b.f14002e;
            if (dtx.f14019f != null) {
                dtt dtt = (dtt) dtx.f14016c.get(pendingIntent);
                if (!(dtt == null || dtt.f14012d == null)) {
                    dtt.f14012d = null;
                    if (dtt.mo9589c()) {
                        dtx.f14016c.remove(dtt.f14009a);
                        dtx.f14017d.remove(dtt.f14010b);
                        dtx.f14019f.mo25067b(new FencePendingIntentCache$FencePendingIntentItem(dtt.f14010b, dtt.f14009a));
                        srn srn = dss.f13961a;
                    }
                }
            } else {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dtx", "a", 289, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[FencePendingIntentCache]Could not removeListener pendingIntent=%s. Cache is null.", pendingIntent);
            }
            dwq.m9648E().mo9564d();
        }
        m9233a(0);
    }
}
