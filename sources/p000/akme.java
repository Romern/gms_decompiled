package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.netrec.module.NetRecChimeraGcmTaskService;

/* renamed from: akme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akme {

    /* renamed from: a */
    private final aeat f72246a;

    public akme(Context context) {
        this.f72246a = aeat.m51532a(context);
    }

    /* renamed from: a */
    public final void mo39553a() {
        mo39554a("rapid_refresh_scores_task", (int) cfpd.f185332a.mo6606a().mo82427K(), (int) cfpd.f185332a.mo6606a().mo82426J());
    }

    /* renamed from: b */
    public final void mo39555b() {
        mo39554a("refresh_scores_task", (int) cfpd.f185332a.mo6606a().mo82432P(), (int) cfpd.f185332a.mo6606a().mo82431O());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39554a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        int i3 = eoa.f15378a;
        aebi a = NetRecChimeraGcmTaskService.m67641a("ScoreRefreshTask", new Bundle());
        a.f63099k = str;
        a.mo34004a((long) i, (long) i2);
        a.mo34027b(0);
        a.f63102n = true;
        if (cfpj.f185389a.mo6606a().mo82463a() && i > 0) {
            aebn aebn = new aebn();
            aebn.f63074a = 0;
            aebn.f63075b = i >> 1;
            aebn.f63076c = i2 / 2;
            a.f63106r = aebn.mo34011a();
        }
        NetRecChimeraGcmTaskService.m67642a(this.f72246a, a.mo33974b());
    }
}
