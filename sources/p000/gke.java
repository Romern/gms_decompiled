package p000;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* renamed from: gke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class gke extends Service {

    /* renamed from: a */
    private gkd f18387a;

    public final IBinder onBind(Intent intent) {
        return this.f18387a.getIBinder();
    }

    public final void onCreate() {
        super.onCreate();
        this.f18387a = new gkd(this);
    }
}
