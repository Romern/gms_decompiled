package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import com.google.android.location.reporting.collectors.LocationHistorianDataRetriever$LogDataReceiver;

/* renamed from: bgts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgts {

    /* renamed from: a */
    public static final Object f117517a = new Object();

    /* renamed from: b */
    public LocationHistorianDataRetriever$LogDataReceiver f117518b;

    /* renamed from: c */
    public final Context f117519c;

    /* renamed from: d */
    private final bgyf f117520d;

    /* renamed from: e */
    private final SharedPreferences f117521e;

    /* renamed from: f */
    private final ConnectivityManager f117522f;

    /* renamed from: g */
    private final bgtr f117523g;

    public bgts(Context context, bgyf bgyf, SharedPreferences sharedPreferences, ConnectivityManager connectivityManager, bgtr bgtr, LocationHistorianDataRetriever$LogDataReceiver locationHistorianDataRetriever$LogDataReceiver) {
        this.f117519c = context;
        this.f117520d = bgyf;
        this.f117521e = sharedPreferences;
        this.f117522f = connectivityManager;
        this.f117523g = bgtr;
        this.f117518b = locationHistorianDataRetriever$LogDataReceiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.location.internal.server.SEND_LOG_DATA_ACTION");
        this.f117519c.registerReceiver(this.f117518b, intentFilter);
    }

    /* renamed from: a */
    public final void mo63159a(boolean z) {
        if (mo63161b() != null) {
            StringBuilder sb = new StringBuilder(39);
            sb.append("location historian data uploaded: ");
            sb.append(z);
            sb.toString();
            bguv.m100048a("UlrLocationHistorianUploadSuccess", z);
            if (z) {
                synchronized (f117517a) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = this.f117521e.getLong("last_upload_timestamp", -1);
                    if (j > 0) {
                        bguv.m100052b("UlrLocationHistorianUploadInterval", elapsedRealtime - j);
                    }
                    bgtp b = mo63161b();
                    this.f117521e.edit().putLong("boot_time", b.f117510b).putLong("last_event_time", b.f117511c).putLong("last_upload_timestamp", j).apply();
                }
            }
            this.f117518b.f150862a = null;
        }
    }

    /* renamed from: b */
    public final bgtp mo63161b() {
        LocationHistorianDataRetriever$LogDataReceiver locationHistorianDataRetriever$LogDataReceiver = this.f117518b;
        if (locationHistorianDataRetriever$LogDataReceiver != null) {
            return locationHistorianDataRetriever$LogDataReceiver.f150862a;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo63162c() {
        Intent intent = new Intent("com.google.android.location.reporting.DUMP_LOG_BROADCAST_ACTION");
        intent.putExtra("boot_time", this.f117521e.getLong("boot_time", 0));
        intent.putExtra("last_event_time", this.f117521e.getLong("last_event_time", 0));
        intent.putExtra("current_time_key", SystemClock.elapsedRealtime());
        intent.putExtra("max_location_historian_events", (int) chcs.f188354a.mo6606a().mo85082ar());
        this.f117519c.sendBroadcast(intent);
    }

    /* renamed from: a */
    public final boolean mo63160a() {
        boolean z;
        boolean z2;
        NetworkInfo activeNetworkInfo;
        if (chcs.f188354a.mo6606a().mo85015D()) {
            ConnectivityManager connectivityManager = this.f117522f;
            boolean z3 = (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : !C1185me.m19630a(this.f117522f);
            boolean a = bgzf.m100441a(this.f117520d.f118015g);
            bgtr bgtr = this.f117523g;
            int i = Build.VERSION.SDK_INT;
            PowerManager powerManager = bgtr.f117516a;
            boolean z4 = powerManager != null ? !powerManager.isInteractive() : true;
            long j = this.f117521e.getLong("last_upload_timestamp", -1);
            if (j >= 0) {
                z = System.currentTimeMillis() - j > chcs.f188354a.mo6606a().mo85067ac();
            } else {
                z = true;
            }
            StringBuilder sb = new StringBuilder(93);
            sb.append("shouldUploadHistorianEvents: eligibleNetwor=");
            sb.append(z3);
            sb.append(" powered=");
            sb.append(a);
            sb.append(" idle=");
            sb.append(z4);
            sb.append(" timeToUpload=");
            sb.append(z);
            sb.toString();
            if (bguv.m100053c()) {
                if (a) {
                    z2 = z3 | true;
                } else {
                    z2 = z3;
                }
                if (z4) {
                    z2 |= true;
                }
                if (z) {
                    z2 |= true;
                }
                bguv.m100043a("UlrLocationHistorianUploadAvailability", z2 ? 1 : 0);
            }
            return z && z3 && a && z4;
        }
    }
}
