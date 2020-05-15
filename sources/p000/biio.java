package p000;

import android.view.View;

/* renamed from: biio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class biio implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f120677a;

    public biio(Runnable runnable) {
        this.f120677a = runnable;
    }

    public void onClick(View view) {
        this.f120677a.run();
    }
}
