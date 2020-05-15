package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.thunderbird.util.locationsettings.LocationSettingsResetIntentOperation;

/* renamed from: auhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auhu {

    /* renamed from: a */
    private static auhu f91841a = null;

    /* renamed from: b */
    private int f91842b = 0;

    /* renamed from: c */
    private PendingIntent f91843c = null;

    /* renamed from: d */
    private auhv f91844d = null;

    /* renamed from: a */
    public static synchronized auhu m77081a() {
        auhu auhu;
        synchronized (auhu.class) {
            if (f91841a == null) {
                f91841a = new auhu();
            }
            auhu = f91841a;
        }
        return auhu;
    }

    /* renamed from: c */
    private final void m77083c(Context context) {
        boolean z;
        int i;
        boolean z2 = true;
        if (this.f91843c != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108600b(z);
        if (this.f91844d == null) {
            z2 = false;
        }
        bmxy.m108600b(z2);
        if (auho.m77070a()) {
            Log.d("Thunderbird", "resetting location settings");
        }
        auhv a = auhv.m77087a(context);
        if (a.f91846b && !this.f91844d.f91846b) {
            try {
                ((WifiManager) context.getApplicationContext().getSystemService("wifi")).setWifiEnabled(false);
            } catch (SecurityException e) {
                Log.w("Thunderbird", "cannot disable wifi - lost permission", e);
            }
        }
        if (!m77082b()) {
            if (a.f91848d == 3 && (i = this.f91844d.f91848d) != 3) {
                try {
                    aeri.m52430a(context, i, aerk.ALLOWED);
                } catch (SecurityException e2) {
                    Log.w("Thunderbird", "cannot disable location - lost permission", e2);
                }
            }
            if (a.f91847c && !this.f91844d.f91847c) {
                try {
                    aeri.m52432a(context, false, aerk.ALLOWED, 9, new int[0]);
                } catch (SecurityException e3) {
                    Log.w("Thunderbird", "cannot unconfirm nlp opt in - lost permission", e3);
                }
            }
        }
        new skc(context).mo25668a(this.f91843c);
        this.f91843c.cancel();
        this.f91843c = null;
        this.f91844d = null;
    }

    /* renamed from: b */
    public static boolean m77082b() {
        int i = Build.VERSION.SDK_INT;
        return cgyq.f188062a.mo6606a().mo84777u();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0103, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010f, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo50541a(Context context) {
        Context context2 = context;
        synchronized (this) {
            if (cgyq.m147649g()) {
                int i = this.f91842b;
                this.f91842b = i + 1;
                if (i <= 0) {
                    auhv a = auhv.m77087a(context);
                    if (auho.m77070a()) {
                        String valueOf = String.valueOf(a);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                        sb.append("ensuring location settings on, current state - ");
                        sb.append(valueOf);
                        Log.d("Thunderbird", sb.toString());
                    }
                    Intent startIntent = IntentOperation.getStartIntent(context2, LocationSettingsResetIntentOperation.class, "thunderbird.intent.action.LOCATION_SETTINGS_RESET");
                    bmxy.m108581a(startIntent);
                    startIntent.putExtra("wifi_scanning_enabled", a.f91845a);
                    startIntent.putExtra("wifi_enabled", a.f91846b);
                    startIntent.putExtra("opted_into_nlp", a.f91847c);
                    startIntent.putExtra("location_mode", a.f91848d);
                    startIntent.putExtra("data_enabled", a.f91849e);
                    startIntent.putExtra("data_available", a.f91850f);
                    PendingIntent pendingIntent = IntentOperation.getPendingIntent(context2, LocationSettingsResetIntentOperation.class, startIntent, 0, 536870912);
                    this.f91843c = pendingIntent;
                    if (pendingIntent == null) {
                        PendingIntent pendingIntent2 = IntentOperation.getPendingIntent(context2, LocationSettingsResetIntentOperation.class, startIntent, 0, 134217728);
                        bmxy.m108581a(pendingIntent2);
                        this.f91843c = pendingIntent2;
                        this.f91844d = a;
                    } else {
                        auhv auhv = this.f91844d;
                        if (auhv != null && !auhv.equals(a)) {
                            this.f91844d = null;
                        }
                    }
                    skc skc = new skc(context2);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long f = cgyq.m147648f();
                    PendingIntent pendingIntent3 = this.f91843c;
                    WorkSource a2 = stx.m36335a(skc.f44604f, "com.google.android.gms");
                    if (skc.m35506a(elapsedRealtime)) {
                        int i2 = Build.VERSION.SDK_INT;
                        skc.mo25669a("Thunderbird", 3, elapsedRealtime, skc.mo25667a(), f, pendingIntent3, a2);
                    }
                    try {
                        ((WifiManager) context.getApplicationContext().getSystemService("wifi")).setWifiEnabled(true);
                    } catch (SecurityException e) {
                        Log.w("Thunderbird", "cannot enable wifi - lost permission", e);
                    }
                    if (!m77082b()) {
                        try {
                            aeri.m52432a(context2, true, aerk.ALLOWED, 9, new int[0]);
                        } catch (SecurityException e2) {
                            Log.w("Thunderbird", "cannot confirm nlp opt in - lost permission", e2);
                        }
                        try {
                            aeri.m52430a(context2, 3, aerk.ALLOWED);
                        } catch (SecurityException e3) {
                            Log.w("Thunderbird", "cannot enable location - lost permission", e3);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo50543b(Context context) {
        boolean z;
        if (cgyq.m147649g()) {
            boolean z2 = true;
            if (this.f91842b > 0) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108600b(z);
            if (this.f91843c == null) {
                z2 = false;
            }
            bmxy.m108600b(z2);
            int i = this.f91842b - 1;
            this.f91842b = i;
            if (i <= 0 && this.f91844d != null) {
                m77083c(context);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003c, code lost:
        if (r11 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo50542a(Context context, Intent intent) {
        this.f91844d = new auhv(intent.getBooleanExtra("wifi_scanning_enabled", false), intent.getBooleanExtra("wifi_enabled", false), intent.getBooleanExtra("opted_into_nlp", false), intent.getIntExtra("location_mode", 0), intent.getBooleanExtra("data_enabled", false), intent.getBooleanExtra("data_available", false));
        if (this.f91843c == null) {
            PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, LocationSettingsResetIntentOperation.class, intent, 0, 536870912);
            this.f91843c = pendingIntent;
        }
        if (this.f91842b <= 0) {
            if (auho.m77070a()) {
                Log.d("Thunderbird", "location settings reset received");
            }
            m77083c(context);
            return;
        }
        C1223np npVar = auho.f91828a;
    }
}
