package p000;

import com.google.android.gms.signin.activity.ConsentChimeraActivity;

/* renamed from: aqly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqly implements bqfp {

    /* renamed from: a */
    final /* synthetic */ long f86351a;

    /* renamed from: b */
    final /* synthetic */ ConsentChimeraActivity f86352b;

    public aqly(ConsentChimeraActivity consentChimeraActivity, long j) {
        this.f86352b = consentChimeraActivity;
        this.f86351a = j;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        bmxv bmxv = (bmxv) obj;
        ConsentChimeraActivity consentChimeraActivity = this.f86352b;
        consentChimeraActivity.mo58974a(this.f86351a, consentChimeraActivity.f107666j, true);
        if (bmxv.mo66813a()) {
            this.f86352b.f107666j = ((Integer) bmxv.mo66814b()).intValue();
            this.f86352b.mo58977e();
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        ConsentChimeraActivity consentChimeraActivity = this.f86352b;
        consentChimeraActivity.mo58974a(this.f86351a, consentChimeraActivity.f107666j, false);
        this.f86352b.mo58973a(4, "");
    }
}
