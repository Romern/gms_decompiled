package p000;

import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: njz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class njz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bisf f35875a;

    /* renamed from: b */
    final /* synthetic */ boolean f35876b;

    /* renamed from: c */
    final /* synthetic */ nkq f35877c;

    public njz(nkq nkq, bisf bisf, boolean z) {
        this.f35877c = nkq;
        this.f35875a = bisf;
        this.f35876b = z;
    }

    public final void run() {
        bisf bisf = bisf.STATUS_UNSOLICITED_MESSAGE;
        int ordinal = this.f35875a.ordinal();
        if (ordinal == 1) {
            nkq nkq = this.f35877c;
            bnsn bnsn = nkq.f35898a;
            nyh nyh = nkq.f35903e;
            nyh.f36938n = this.f35876b;
            if (nyh.f36939o && (!ccpm.m131129b() || this.f35877c.f35912n.mo21350t() != 2)) {
                if (!ccpm.m131133f()) {
                    this.f35877c.f35902d.mo21864f();
                } else {
                    this.f35877c.f35902d.mo21854a(2);
                }
                this.f35877c.f35903e.f36939o = false;
            }
            this.f35877c.f35903e.mo21836c(202);
        } else if (ordinal != 11) {
            bnsi b = nkq.f35898a.mo68387b();
            b.mo68432a("njz", "run", 309, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68420a("BluetoothPairingResponse with wrong status: %s", this.f35875a);
        } else {
            bnsn bnsn2 = nkq.f35898a;
            nyh nyh2 = this.f35877c.f35903e;
            if (nyh2.f36939o) {
                nyh2.f36939o = false;
            }
            nyh2.mo21836c(ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR);
            this.f35877c.mo20963a(njy.f35874a);
        }
    }
}
