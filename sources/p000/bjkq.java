package p000;

import android.widget.Toast;

/* renamed from: bjkq */
final /* synthetic */ class bjkq implements Runnable {

    /* renamed from: a */
    private final bjku f122863a;

    public bjkq(bjku bjku) {
        this.f122863a = bjku;
    }

    public final void run() {
        Toast.makeText(this.f122863a.f122894a, String.format("Overriding client id with %s", null), 0).show();
    }
}
