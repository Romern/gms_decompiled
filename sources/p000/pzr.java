package p000;

import android.os.Bundle;

/* renamed from: pzr */
final /* synthetic */ class pzr implements aubq {

    /* renamed from: a */
    private final pzv f40753a;

    public pzr(pzv pzv) {
        this.f40753a = pzv;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        pzv pzv = this.f40753a;
        if (aucb.mo50384b()) {
            pzv.mo23831b().edit().putBoolean("googlecast-isEnabled", ((Bundle) aucb.mo50386d()).getBoolean("googlecast-isEnabled")).apply();
            svm svm = pzv.f40757a;
            if (svm != null) {
                svm.setChecked(pzv.mo23830a("googlecast-isEnabled", true));
            }
        }
    }
}
