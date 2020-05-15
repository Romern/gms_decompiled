package p000;

import android.content.Context;

/* renamed from: aasq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aasq {

    /* renamed from: a */
    private final Context f56521a;

    public aasq(Context context) {
        this.f56521a = context;
    }

    /* renamed from: a */
    public final boolean mo31746a(aasm aasm) {
        if (aasm.mo31720e() || aasm.mo31722f() || aasm.mo31727j() || aasm.mo31728k() || aasm.mo31734q() || aasm.mo31729l() || aasm.mo31724h() || aasm.mo31723g() || aasm.mo31732o()) {
            return true;
        }
        if (aasm.mo31730m()) {
            return aass.m46943a(aasm.f56499i, this.f56521a);
        }
        if (!aasm.mo31731n() || !aasm.mo31739u()) {
            return false;
        }
        return new abab(this.f56521a).mo31963a(aasm.mo31740v());
    }
}
