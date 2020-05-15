package p000;

import android.view.View;

/* renamed from: fca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class fca extends fby {
    /* renamed from: a */
    public final void mo10557a(fem fem) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo10583a(bsul bsul);

    /* access modifiers changed from: protected */
    /* renamed from: aV */
    public final View mo10640aV() {
        return getView();
    }

    /* renamed from: c */
    public final fek mo10624c() {
        return new fek(getClass().getName(), getFragmentManager().saveFragmentInstanceState(this));
    }

    /* renamed from: a */
    public final boolean mo10558a(epq epq) {
        bsxn bsxn = epq.f15491a.f147583d;
        if (bsxn == null) {
            bsxn = bsxn.f147586d;
        }
        if (bsxn.equals(mo10584aU())) {
            return mo10583a(epq.mo10395b());
        }
        return false;
    }
}
