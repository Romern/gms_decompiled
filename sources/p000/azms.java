package p000;

import android.os.Build;

/* renamed from: azms */
final /* synthetic */ class azms implements Runnable {

    /* renamed from: a */
    private final azmx f99660a;

    /* renamed from: b */
    private final String f99661b;

    public azms(azmx azmx, String str) {
        this.f99660a = azmx;
        this.f99661b = str;
    }

    public final void run() {
        azmx azmx = this.f99660a;
        String str = this.f99661b;
        new Object[1][0] = str;
        int i = Build.VERSION.SDK_INT;
        azmx.f99667a.evaluateJavascript(str, null);
    }
}
