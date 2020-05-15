package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;

/* renamed from: agiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agiv {

    /* renamed from: a */
    private final agiu f65647a;

    public agiv(agiu agiu) {
        sdo.m34959a(agiu);
        this.f65647a = agiu;
    }

    /* renamed from: a */
    public static boolean m54326a(Context context) {
        ActivityInfo receiverInfo;
        sdo.m34959a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
        }
    }

    /* renamed from: a */
    public final void mo35475a(Context context, Intent intent) {
        String str;
        agje a = agje.m54353a(context);
        agid E = a.mo35497E();
        if (intent == null) {
            E.f65567f.mo35435a("Receiver called with null intent");
            return;
        }
        boolean z = a.f65690f.f65291a;
        String action = intent.getAction();
        if (z) {
            E.f65572k.mo35436a("Device receiver got", action);
        } else {
            E.f65572k.mo35436a("Local receiver got", action);
        }
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent intent2 = new Intent();
            if (z) {
                str = "com.google.android.gms.measurement.PackageMeasurementService";
            } else {
                str = "com.google.android.gms.measurement.AppMeasurementService";
            }
            Intent className = intent2.setClassName(context, str);
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            E.f65572k.mo35435a("Starting wakeful intent.");
            this.f65647a.mo35474b(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            E.f65567f.mo35435a("Install Referrer Broadcasts are deprecated");
        }
    }
}
