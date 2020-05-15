package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: jek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jek implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ View f22286a;

    public jek(View view) {
        this.f22286a = view;
    }

    public final boolean onPreDraw() {
        View view = this.f22286a;
        view.setSystemUiVisibility(view.getSystemUiVisibility() | 5634);
        return true;
    }
}
