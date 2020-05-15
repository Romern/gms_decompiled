package p000;

import android.os.Bundle;

/* renamed from: bjzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjzk extends bjzn {

    /* renamed from: a */
    public Bundle f123692a = Bundle.EMPTY;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65662a(Bundle bundle) {
        super.mo65662a(bundle);
        this.f123692a = bundle.getBundle("validateAppAnalyticsResultData");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("validateAppAnalyticsResultData", this.f123692a);
    }
}
