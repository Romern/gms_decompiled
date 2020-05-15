package p000;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: axub */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axub implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ axud f96362a;

    public axub(axud axud) {
        this.f96362a = axud;
    }

    public final boolean handleMessage(Message message) {
        if (message == null) {
            return true;
        }
        Intent intent = (Intent) message.obj;
        if (intent != null && intent.hasExtra("status")) {
            String stringExtra = intent.getStringExtra("status");
            if (Log.isLoggable("CloudSync", 3)) {
                String valueOf = String.valueOf(stringExtra);
                Log.d("CloudSync", valueOf.length() == 0 ? new String("Gcm connection state: ") : "Gcm connection state: ".concat(valueOf));
            }
            if (!"1".equals(stringExtra)) {
                return true;
            }
            if (Log.isLoggable("CloudSync", 3)) {
                Log.d("CloudSync", "Already connected to GCM.");
            }
            this.f96362a.mo53567f();
            return true;
        } else if (!Log.isLoggable("CloudSync", 3)) {
            return true;
        } else {
            Log.d("CloudSync", "No GCM status found in the response.");
            return true;
        }
    }
}
