package p000;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;

/* renamed from: emz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class emz extends emt {

    /* renamed from: b */
    private static final Intent f15318b = new Intent("com.google.android.finsky.BIND_PLAY_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    private final emy f15319a;

    public emz(emy emy) {
        this.f15319a = emy;
    }

    /* renamed from: a */
    public static void m10743a(Context context, enh enh) {
        try {
            context.unbindService(enh);
        } catch (IllegalStateException e) {
        }
    }

    /* renamed from: b */
    public final end mo10313b(Context context, enh enh) {
        end end = null;
        if (context.bindService(f15318b, enh, 1)) {
            try {
                IBinder a = enh.mo10316a();
                if (a != null) {
                    IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.finsky.zapp.protocol.IPlayModuleService");
                    end = !(queryLocalInterface instanceof end) ? new end(a) : (end) queryLocalInterface;
                }
            } catch (InterruptedException e) {
                Thread.interrupted();
            }
            if (end == null) {
                m10743a(context, enh);
                Log.e("ZappPhoneskyConn", "Unable to connect to Phonesky");
            }
            return end;
        }
        Log.e("ZappPhoneskyConn", "Unable to bind to Phonesky");
        return null;
    }

    /* renamed from: a */
    public final void mo10312a(Context context, int i, String str) {
        emy emy = this.f15319a;
        if (emy != null) {
            emy.mo10311b(context, i, str);
        }
    }
}
