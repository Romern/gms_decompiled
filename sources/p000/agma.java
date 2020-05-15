package p000;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: agma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agma {

    /* renamed from: a */
    final /* synthetic */ agmb f65918a;

    public agma(agmb agmb) {
        this.f65918a = agmb;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35649a(long j, boolean z) {
        this.f65918a.mo35241h();
        this.f65918a.mo35652o();
        if (this.f65918a.mo35539w().mo35466a(j)) {
            this.f65918a.mo35539w().f65628m.mo35456a(true);
        }
        this.f65918a.mo35539w().f65632q.mo35459a(j);
        if (this.f65918a.mo35539w().f65628m.mo35457a()) {
            mo35650b(j, z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo35650b(long j, boolean z) {
        this.f65918a.mo35241h();
        if (this.f65918a.f65756y.mo35513q()) {
            this.f65918a.mo35539w().f65632q.mo35459a(j);
            this.f65918a.mo35497E().f65572k.mo35436a("Session started, time", Long.valueOf(this.f65918a.mo35534A().mo20506b()));
            Long valueOf = Long.valueOf(j / 1000);
            this.f65918a.mo35239f().mo35573a("auto", "_sid", valueOf, j);
            this.f65918a.mo35539w().f65628m.mo35456a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f65918a.mo35538v().mo35314a(aghn.f65483ai) && z) {
                bundle.putLong("_aib", 1);
            }
            this.f65918a.mo35239f().mo35567a("auto", "_s", j, bundle);
            if (cfit.m139801b() && this.f65918a.mo35538v().mo35314a(aghn.f65486al)) {
                String a = this.f65918a.mo35539w().f65637v.mo35462a();
                if (!TextUtils.isEmpty(a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a);
                    this.f65918a.mo35239f().mo35567a("auto", "_ssr", j, bundle2);
                }
            }
        }
    }
}
