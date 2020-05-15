package p000;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;

/* renamed from: ataj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ataj {

    /* renamed from: a */
    public static final srn f89949a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: b */
    public boolean f89950b = false;

    /* renamed from: c */
    public final boolean f89951c;

    /* renamed from: d */
    private final SensorEventListener f89952d = new atai(this, "WearableOffBodyDetector", "tapandpay");

    public ataj(boolean z, SensorManager sensorManager) {
        Sensor sensor;
        this.f89951c = z;
        if (sensorManager != null) {
            int i = Build.VERSION.SDK_INT;
            sensor = sensorManager.getDefaultSensor(34, true);
        } else {
            sensor = null;
        }
        if (sensor == null) {
            bnsl bnsl = (bnsl) f89949a.mo68387b();
            bnsl.mo68432a("ataj", "<init>", 57, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable retrieve off body sensor. Sensor is null.");
            return;
        }
        sensorManager.registerListener(this.f89952d, sensor, 0, 0);
    }

    /* renamed from: a */
    public final boolean mo49733a() {
        bnsl a = f89949a.mo26019b(aske.m74275a());
        a.mo68432a("ataj", "a", 30, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68435a("shouldAllowPayments() state. offBodyExperiment=true, isWearable=%b, isOnBody=%b", this.f89951c, this.f89950b);
        if (this.f89951c) {
            return this.f89950b;
        }
        return true;
    }
}
