package p000;

import com.felicanetworks.mfc.mfi.CardDeleteEventCallback;

/* renamed from: cikm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cikm implements CardDeleteEventCallback {

    /* renamed from: a */
    private final brep f190531a;

    public cikm(brep brep) {
        this.f190531a = brep;
    }

    public final void onError(int i, String str) {
        this.f190531a.mo49931a(new bres(bret.m113947a(i, str)));
    }

    public final void onSuccess() {
        srn srn = atgf.f90279a;
        this.f190531a.mo49932a((Object) null);
    }
}
