package p000;

import android.view.View;

/* renamed from: awhh */
final /* synthetic */ class awhh implements Runnable {

    /* renamed from: a */
    private final View f94359a;

    /* renamed from: b */
    private final int f94360b;

    public awhh(View view, int i) {
        this.f94359a = view;
        this.f94360b = i;
    }

    public final void run() {
        View view = this.f94359a;
        bkfr.m105567a(view, view.getContext().getString(this.f94360b));
    }
}
