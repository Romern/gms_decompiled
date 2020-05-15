package p000;

import android.os.IBinder;

/* renamed from: nnp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nnp implements IBinder.DeathRecipient {

    /* renamed from: a */
    final /* synthetic */ int f36107a;

    /* renamed from: b */
    final /* synthetic */ noj f36108b;

    /* renamed from: c */
    final /* synthetic */ nrl f36109c;

    public nnp(noj noj, nrl nrl, int i) {
        this.f36108b = noj;
        this.f36109c = nrl;
        this.f36107a = i;
    }

    public final void binderDied() {
        String str;
        this.f36108b.mo21272a(this.f36109c.f12819a);
        noj noj = this.f36108b;
        int i = this.f36107a;
        bpdh bpdh = bpdh.CAR_CONNECTION_LISTENER_BINDER_DIED;
        if (ccql.m131267b()) {
            String[] packagesForUid = noj.f36219f.getPackageManager().getPackagesForUid(i);
            if (packagesForUid != null) {
                str = packagesForUid[0];
            } else {
                str = "unknown";
            }
            bnsi c = noj.f36155b.mo68388c();
            c.mo68432a("noj", "a", 4485, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("Binder died: %s", str);
            noj.f36168M.mo20858a(bpdi.CAR_SERVICE, bpdh, str);
        }
    }
}
