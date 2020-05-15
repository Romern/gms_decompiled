package p000;

import android.content.Intent;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;

/* renamed from: azfq */
public final /* synthetic */ class azfq implements Runnable {

    /* renamed from: a */
    private final SilentRegisterIntentOperation f99241a;

    /* renamed from: b */
    private final Intent f99242b;

    public azfq(SilentRegisterIntentOperation silentRegisterIntentOperation, Intent intent) {
        this.f99241a = silentRegisterIntentOperation;
        this.f99242b = intent;
    }

    public final void run() {
        SilentRegisterIntentOperation silentRegisterIntentOperation = this.f99241a;
        Intent intent = this.f99242b;
        silentRegisterIntentOperation.mo60393e(intent);
        silentRegisterIntentOperation.mo60388b(intent);
        silentRegisterIntentOperation.mo60383a(intent);
    }
}
