package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.location.quake.SeismicDataCollectionManager$QuakeAlarmsManager$1;

/* renamed from: bgrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgrl extends bgtf {

    /* renamed from: a */
    public final bmzi f117338a;

    /* renamed from: b */
    public final bgrn f117339b;

    /* renamed from: c */
    final PendingIntent f117340c;

    /* renamed from: d */
    public long f117341d;

    /* renamed from: e */
    public boolean f117342e;

    /* renamed from: i */
    private final aacn f117343i = new SeismicDataCollectionManager$QuakeAlarmsManager$1(this, "location");

    /* renamed from: j */
    private final Context f117344j;

    /* renamed from: k */
    private final skc f117345k;

    public bgrl(Context context, bmzi bmzi, skc skc, bgrn bgrn) {
        super("QAlarms");
        this.f117344j = context;
        this.f117345k = skc;
        this.f117338a = bmzi;
        this.f117339b = bgrn;
        Intent intent = new Intent("com.google.android.location.intent.action.ONLINE_CHECKIN_ALARM");
        intent.setPackage(this.f117344j.getPackageName());
        this.f117340c = PendingIntent.getBroadcast(this.f117344j, 0, intent, 134217728);
    }

    /* renamed from: a */
    public final void mo63111a() {
        srn srn = bgrw.f117381a;
        this.f117345k.mo25668a(this.f117340c);
        this.f117344j.registerReceiver(this.f117343i, new IntentFilter("com.google.android.location.intent.action.ONLINE_CHECKIN_ALARM"), null, this.f117482h.f117486b);
        mo63116c();
        this.f117342e = true;
        this.f117482h.mo63156c();
    }

    /* renamed from: b */
    public final void mo63113b() {
        srn srn = bgrw.f117381a;
        this.f117342e = false;
        this.f117345k.mo25668a(this.f117340c);
        this.f117344j.unregisterReceiver(this.f117343i);
    }

    /* renamed from: c */
    public final void mo63116c() {
        long j;
        skc skc = this.f117345k;
        long j2 = this.f117341d;
        long quakeApiAlarmOnlineMs = cezv.f183536a.mo6606a().quakeApiAlarmOnlineMs();
        if (j2 != 0) {
            j = j2 + quakeApiAlarmOnlineMs;
        } else {
            j = 1;
        }
        srn srn = bgrw.f117381a;
        this.f117338a.mo6606a();
        skc.mo25679b("QMonitor", 2, j, this.f117340c);
    }
}
