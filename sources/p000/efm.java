package p000;

import java.util.concurrent.Future;

/* renamed from: efm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class efm extends dwu implements dqm {

    /* renamed from: a */
    private doh f14837a;

    public efm() {
        super("DownloadSyncOperation", "download sync", new Object[0]);
    }

    /* renamed from: a */
    public final Future mo9446a() {
        tjq a = dwq.m9673q().mo10053a((doh) null, 10);
        if (a == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("efm", "a", 44, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[DownloadSyncOperation] No gcm message in feature store.");
            return dps.f13792a;
        }
        try {
            bxqs bxqs = (bxqs) bxvk.m124016a(bxqs.f164423c, a.mo26593c(), bxus.m123744c());
            new Object[1][0] = bxqs;
            dwq.m9681y();
            doh b = dof.m8924b(bxqs.f164426b);
            this.f14837a = b;
            if (b == null) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                bnsl2.mo68432a("efm", "a", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("[DownloadSyncOperation] Invalid account in gcm message.  account=%s", dof.m8923a(bxqs.f164426b));
                return dps.f13792a;
            }
            dwt w = dwq.m9679w();
            doh doh = this.f14837a;
            bxqt bxqt = bxqs.f164425a;
            w.mo9814a(doh, bxqt != null ? bxqt : bxqt.f164428a, this, dwq.m9667k(), dqy.m9123a("DownloadSyncOperation"));
            return this;
        } catch (bxwf e) {
            bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
            bnsl3.mo68437a(e);
            bnsl3.mo68432a("efm", "a", 56, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("[DownloadSyncOperation] Could not deserialize gcmMessage in feature store.");
            return dps.f13792a;
        }
    }

    /* renamed from: a */
    public final void mo9477a(int i) {
        super.mo9477a(i);
        dwq.m9649F().mo9384a(1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9478a(Object obj) {
        bxiz bxiz = (bxiz) obj;
        doh doh = this.f14837a;
        bxii[] bxiiArr = (bxii[]) bxiz.f163594c.toArray(new bxii[0]);
        bxwc bxwc = bxiz.f163593b;
        bxjd bxjd = bxiz.f163592a;
        if (bxjd == null) {
            bxjd = bxjd.f163616c;
        }
        bxik bxik = bxjd.f163619b;
        if (bxik == null) {
            bxik = bxik.f163530b;
        }
        efc.m10292a(doh, bxiiArr, bxwc, bxik, 5);
        dwq.m9649F().mo9384a(2);
    }
}
