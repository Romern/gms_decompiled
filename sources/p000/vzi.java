package p000;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;

/* renamed from: vzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vzi implements vzl {

    /* renamed from: a */
    final /* synthetic */ Bundle f50283a;

    /* renamed from: b */
    final /* synthetic */ vzm f50284b;

    public vzi(vzm vzm, Bundle bundle) {
        this.f50284b = vzm;
        this.f50283a = bundle;
    }

    /* renamed from: a */
    public final int mo28995a() {
        return 1;
    }

    /* renamed from: b */
    public final void mo28996b() {
        afcq afcq = this.f50284b.f50290c;
        Bundle bundle = this.f50283a;
        try {
            Bundle bundle2 = new Bundle();
            afgt.m53061a(bundle, bundle2);
            afcq.f64184b.mo34818a(bundle2);
            afgt.m53061a(bundle2, bundle);
            afcq.f64185c = (View) vzs.m41641a(afcq.f64184b.mo34823f());
            afcq.f64183a.removeAllViews();
            afcq.f64183a.addView(afcq.f64185c);
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }
}
