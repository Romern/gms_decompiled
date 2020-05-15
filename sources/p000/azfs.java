package p000;

import android.content.Intent;
import com.google.android.libraries.matchstick.net.SilentRegisterIntentOperation;

/* renamed from: azfs */
public final /* synthetic */ class azfs implements Runnable {

    /* renamed from: a */
    private final SilentRegisterIntentOperation f99245a;

    /* renamed from: b */
    private final Intent f99246b;

    public azfs(SilentRegisterIntentOperation silentRegisterIntentOperation, Intent intent) {
        this.f99245a = silentRegisterIntentOperation;
        this.f99246b = intent;
    }

    public final void run() {
        SilentRegisterIntentOperation silentRegisterIntentOperation = this.f99245a;
        Intent intent = this.f99246b;
        silentRegisterIntentOperation.mo60393e(intent);
        silentRegisterIntentOperation.mo60388b(intent);
        silentRegisterIntentOperation.mo60391c(intent);
        if (cfcy.m138709b()) {
            azqf.m86130a(silentRegisterIntentOperation.f111106c);
            if (!azqf.m86150c(silentRegisterIntentOperation.f111107d)) {
                silentRegisterIntentOperation.mo60386a("com.google.android.gms.matchstick.ui.EntryActivity", -1);
            }
        }
    }
}
