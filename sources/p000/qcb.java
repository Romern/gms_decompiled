package p000;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.checkin.CheckinApiChimeraService;
import com.google.android.gms.checkin.CheckinChimeraService;

/* renamed from: qcb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qcb implements qfa {

    /* renamed from: a */
    public Bundle f40910a;

    /* renamed from: b */
    public final boolean f40911b;

    /* renamed from: c */
    public final Bundle f40912c;

    /* renamed from: d */
    private final CheckinApiChimeraService f40913d;

    /* renamed from: e */
    private final sjn f40914e;

    /* renamed from: f */
    private final rnt f40915f;

    /* renamed from: g */
    private final qcq f40916g;

    /* renamed from: h */
    private boolean f40917h;

    public qcb() {
    }

    /* renamed from: a */
    public final void mo23899a() {
        Bundle bundle = this.f40912c;
        if (bundle != null) {
            sdo.m34959a(bundle);
            this.f40910a = bundle;
        }
        this.f40916g.f40933a.add(this);
        qdg.m31918a("CheckinApi:start", Integer.valueOf(this.f40915f.hashCode()), Long.valueOf(SystemClock.elapsedRealtime()));
        CheckinChimeraService.m22357b(this.f40913d);
    }

    public qcb(CheckinApiChimeraService checkinApiChimeraService, sjn sjn, rnt rnt, Bundle bundle, boolean z) {
        qcq a = qcq.m31858a();
        this.f40917h = false;
        this.f40913d = checkinApiChimeraService;
        this.f40914e = sjn;
        this.f40915f = rnt;
        this.f40912c = bundle;
        this.f40911b = z;
        this.f40916g = a;
    }

    /* renamed from: a */
    public final synchronized void mo23900a(int i) {
        if (this.f40917h) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("dispatchResult is called more than once : ");
            sb.append(i);
            Log.e("CheckinApiRequest", sb.toString());
        } else {
            this.f40914e.mo25649a(new qcp(this.f40915f, i));
        }
        this.f40917h = true;
    }

    /* renamed from: a */
    public final void mo23901a(boolean z) {
        mo23900a(!z ? 21041 : 21021);
    }
}
