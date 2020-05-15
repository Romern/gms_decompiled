package p000;

import android.app.AutomaticZenRule;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* renamed from: vqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vqy {

    /* renamed from: a */
    private final Context f49829a;

    public vqy(Context context) {
        this.f49829a = context;
    }

    /* renamed from: a */
    public final void mo28755a(boolean z) {
        Intent startIntent = IntentOperation.getStartIntent(this.f49829a, "com.google.android.location.settings.CarDndNotifierIntentOperation", "com.google.android.location.internal.CAR_DND_ACTION");
        if (startIntent != null) {
            startIntent.putExtra("car_dnd_key", z);
            StringBuilder sb = new StringBuilder(28);
            sb.append("Sending DnD broadcast: ");
            sb.append(z);
            Log.i("CAR.DRIVINGMODE", sb.toString());
            this.f49829a.startService(startIntent);
        }
    }

    /* renamed from: b */
    public final boolean mo28757b() {
        int i = Build.VERSION.SDK_INT;
        if (mo28756a()) {
            vuk.m41322a();
            sex a = sex.m35104a(this.f49829a);
            if (a != null) {
                ComponentName componentName = new ComponentName(this.f49829a.getPackageName(), "com.google.android.location.settings.DrivingConditionProvider");
                try {
                    for (AutomaticZenRule automaticZenRule : a.mo25454f().values()) {
                        if (componentName.equals(automaticZenRule.getOwner()) && automaticZenRule.isEnabled()) {
                            return true;
                        }
                    }
                } catch (SecurityException e) {
                    Log.w("CAR.DRIVINGMODE", "Getting zen rules failed", e);
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo28756a() {
        int i = Build.VERSION.SDK_INT;
        vuk.m41322a();
        sex a = sex.m35104a(this.f49829a);
        return a != null && a.mo25455g();
    }
}
