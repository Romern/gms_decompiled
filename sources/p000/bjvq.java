package p000;

import android.widget.Toast;

/* renamed from: bjvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjvq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f123396a;

    /* renamed from: b */
    final /* synthetic */ bjvu f123397b;

    public bjvq(bjvu bjvu, String str) {
        this.f123397b = bjvu;
        this.f123396a = str;
    }

    public final void run() {
        Toast.makeText(this.f123397b.f123430a, String.format("Overriding client id with %s", this.f123396a), 0).show();
    }
}
