package p000;

import android.view.View;

/* renamed from: biyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class biyw implements biyz {

    /* renamed from: a */
    final /* synthetic */ int f122349a;

    public biyw(int i) {
        this.f122349a = i;
    }

    /* renamed from: a */
    public final void mo64893a(View view) {
        view.setSystemUiVisibility((this.f122349a ^ -1) & view.getSystemUiVisibility());
    }
}
