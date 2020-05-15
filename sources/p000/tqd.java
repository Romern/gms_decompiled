package p000;

import com.google.android.gms.chromesync.ChromeSyncState;

/* renamed from: tqd */
final /* synthetic */ class tqd implements C0038ax {

    /* renamed from: a */
    private final tqe f46477a;

    public tqd(tqe tqe) {
        this.f46477a = tqe;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        tqe tqe = this.f46477a;
        tql tql = (tql) obj;
        boolean z = true;
        if (tql.mo26737c() == 1) {
            tqe.f46479b = Boolean.valueOf(((ChromeSyncState) tql.mo26735a()).f30010a);
            if (((ChromeSyncState) tql.mo26735a()).f30011b != 4) {
                z = false;
            }
            tqe.f46480c = Boolean.valueOf(z);
            tqe.mo26717a();
        }
    }
}
