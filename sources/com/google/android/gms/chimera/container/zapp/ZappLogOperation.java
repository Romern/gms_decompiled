package com.google.android.gms.chimera.container.zapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ZappLogOperation extends IntentOperation {

    /* renamed from: a */
    private static final Intent f29990a = new Intent("com.google.android.finsky.BIND_PLAY_MODULE_SERVICE").setPackage("com.android.vending");

    public final void onHandleIntent(Intent intent) {
        end end;
        ArrayList<Bundle> parcelableArrayListExtra = intent.getParcelableArrayListExtra("events");
        if (parcelableArrayListExtra != null) {
            enh enh = new enh();
            if (!bindService(f29990a, enh, 1)) {
                Log.e("ZappLogOperation", "Unable to bind to Phonesky");
                return;
            }
            try {
                IBinder a = enh.mo10316a();
                if (a != null) {
                    IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.finsky.zapp.protocol.IPlayModuleService");
                    end = !(queryLocalInterface instanceof end) ? new end(a) : (end) queryLocalInterface;
                } else {
                    end = null;
                }
                if (end == null) {
                    Log.e("ZappLogOperation", "Unable to connect to Phonesky");
                    try {
                        unbindService(enh);
                    } catch (IllegalStateException e) {
                    }
                } else {
                    try {
                        for (Bundle bundle : parcelableArrayListExtra) {
                            end.mo10314a(getPackageName(), bundle);
                        }
                        try {
                            unbindService(enh);
                        } catch (IllegalStateException e2) {
                        }
                    } catch (Exception e3) {
                        String valueOf = String.valueOf(e3.getMessage());
                        Log.e("ZappLogOperation", valueOf.length() == 0 ? new String("onModuleEvent() failed: ") : "onModuleEvent() failed: ".concat(valueOf));
                        try {
                            unbindService(enh);
                        } catch (IllegalStateException e4) {
                        }
                    }
                }
            } catch (InterruptedException e5) {
                Thread.currentThread().interrupt();
                try {
                    unbindService(enh);
                } catch (IllegalStateException e6) {
                }
            } catch (Throwable th) {
                try {
                    unbindService(enh);
                } catch (IllegalStateException e7) {
                }
                throw th;
            }
        }
    }
}
