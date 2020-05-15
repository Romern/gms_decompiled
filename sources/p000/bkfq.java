package p000;

import android.view.View;

/* renamed from: bkfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkfq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f124158a;

    public bkfq(View view) {
        this.f124158a = view;
    }

    public final void run() {
        this.f124158a.requestFocus();
    }
}
