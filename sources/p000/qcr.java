package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.checkin.CheckinApiChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: qcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qcr extends qfk implements sjr {

    /* renamed from: a */
    private final CheckinApiChimeraService f40934a;

    /* renamed from: b */
    private final sjn f40935b;

    /* renamed from: c */
    private final qev f40936c = ((qev) qev.f41093a.mo24026b());

    public qcr(CheckinApiChimeraService checkinApiChimeraService, sjn sjn) {
        this.f40934a = checkinApiChimeraService;
        this.f40935b = sjn;
    }

    /* renamed from: b */
    private final void m31860b(Bundle bundle) {
        sdo.m34959a(bundle);
        sdo.m34959a((Object) bundle.getString("com.google.android.gms.checkin.CHECKIN_SOURCE_PACKAGE"));
        spn.m35872c(this.f40934a, bmxx.m108578b(bundle.getString("com.google.android.gms.checkin.CHECKIN_SOURCE_PACKAGE")));
    }

    /* renamed from: a */
    private static Bundle m31859a(Bundle bundle) {
        qcg qcg;
        if (spn.m35869b()) {
            qcg = qcf.m31843a();
        } else {
            qcg = qcg.m31845b();
        }
        return qcg.mo23911a(bundle);
    }

    /* renamed from: b */
    public final void mo23917b(rnt rnt) {
        this.f40935b.mo25649a(new qdm(this.f40934a, rnt));
    }

    /* renamed from: a */
    public final void mo23913a(qfi qfi) {
        this.f40935b.mo25649a(new qdk(this.f40934a, qfi));
    }

    /* renamed from: b */
    public final void mo23918b(rnt rnt, Bundle bundle) {
        m31860b(bundle);
        if (cdci.m132554t()) {
            CheckinApiChimeraService checkinApiChimeraService = this.f40934a;
            checkinApiChimeraService.startService(qga.m32113a(checkinApiChimeraService.getContainerService(), m31859a(bundle)));
            rnt.mo11797a(new Status(21021));
            return;
        }
        new qcb(this.f40934a, this.f40935b, rnt, m31859a(bundle), false).mo23899a();
    }

    /* renamed from: a */
    public final void mo23914a(rnt rnt) {
        if (!cdci.m132554t()) {
            new qcb(this.f40934a, this.f40935b, rnt, null, true).mo23899a();
        } else if (!((qfe) qfe.f41114a.mo24026b()).f41117c.get()) {
            rnt.mo11797a(new Status(21042));
        } else {
            this.f40936c.mo23996a(new qew(rnt), 0);
        }
    }

    /* renamed from: a */
    public final void mo23915a(rnt rnt, Account account) {
        this.f40935b.mo25649a(new qdl(this.f40934a, rnt, account));
    }

    /* renamed from: a */
    public final void mo23916a(rnt rnt, Bundle bundle) {
        m31860b(bundle);
        if (cdci.m132554t()) {
            this.f40936c.mo23996a(new qew(rnt), SystemClock.elapsedRealtime());
            CheckinApiChimeraService checkinApiChimeraService = this.f40934a;
            checkinApiChimeraService.startService(qga.m32113a(checkinApiChimeraService.getContainerService(), m31859a(bundle)));
            return;
        }
        new qcb(this.f40934a, this.f40935b, rnt, m31859a(bundle), true).mo23899a();
    }
}
