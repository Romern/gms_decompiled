package p000;

import android.content.Intent;

/* renamed from: wdm */
final /* synthetic */ class wdm implements Runnable {

    /* renamed from: a */
    private final wdn f50553a;

    /* renamed from: b */
    private final Intent f50554b;

    public wdm(wdn wdn, Intent intent) {
        this.f50553a = wdn;
        this.f50554b = intent;
    }

    public final void run() {
        wdn wdn = this.f50553a;
        wdn.f50555a.startActivity(this.f50554b);
        wdn.f50555a.finish();
    }
}
