package p000;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* renamed from: addh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class addh extends Service {

    /* renamed from: a */
    private Binder f61432a;

    public addh() {
        adzj adzj = adzl.f62962b;
        stz stz = new stz("EnhancedIntentService");
        int i = adzr.f62966a;
        adzj.mo25876a(stz);
        new Object();
    }

    public abstract void handleIntent(Intent intent);

    public final synchronized IBinder onBind(Intent intent) {
        if (this.f61432a == null) {
            this.f61432a = new addg();
        }
        return this.f61432a;
    }

    public final void onDestroy() {
        throw null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        throw null;
    }
}
