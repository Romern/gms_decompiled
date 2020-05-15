package p000;

import android.widget.Toast;

/* renamed from: amrk */
final /* synthetic */ class amrk implements Runnable {

    /* renamed from: a */
    private final amrl f75803a;

    /* renamed from: b */
    private final String f75804b;

    public amrk(amrl amrl, String str) {
        this.f75803a = amrl;
        this.f75804b = str;
    }

    public final void run() {
        amrl amrl = this.f75803a;
        Toast.makeText(amrl.f75805a, this.f75804b, 0).show();
    }
}
