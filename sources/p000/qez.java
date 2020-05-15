package p000;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.checkin.eventlog.EventLogChimeraService;

/* renamed from: qez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qez {

    /* renamed from: a */
    public static final Logger f41099a = qgn.m32143a("CheckinOperation");

    /* renamed from: b */
    public final Context f41100b;

    /* renamed from: c */
    public final qfp f41101c;

    /* renamed from: d */
    public final Bundle f41102d;

    /* renamed from: e */
    public final boolean f41103e;

    /* renamed from: f */
    public final qfe f41104f;

    /* renamed from: g */
    public final qev f41105g;

    /* renamed from: h */
    public final qgm f41106h;

    /* renamed from: i */
    public final qgk f41107i;

    /* renamed from: j */
    public bmxv f41108j = bmvz.f131120a;

    public qez(Context context, Bundle bundle) {
        this.f41102d = bundle;
        boolean a = EventLogChimeraService.m22379a(context);
        this.f41103e = a;
        this.f41100b = context;
        this.f41101c = new qfp(context, a);
        this.f41104f = (qfe) qfe.f41114a.mo24026b();
        this.f41105g = (qev) qev.f41093a.mo24026b();
        this.f41107i = new qgk(context, bmvy.f131119a);
        this.f41106h = qgm.m32141a(context);
    }

    /* renamed from: a */
    public static long m32046a() {
        bmxv b = ((qfs) qfs.f41128a.mo24026b()).mo24018b();
        if (b.mo66813a()) {
            return ((qfq) b.mo66814b()).f41126a - SystemClock.elapsedRealtime();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo23999a(int i) {
        String str = "checkin failed";
        if (i == 0) {
            str = "checkin succeeded";
        } else if (i != 2 && i == 3) {
            str = "checkin rescheduled";
        }
        sex a = sex.m35104a(this.f41100b);
        if (a == null) {
            f41099a.mo25418e("Unable to get notification manager", new Object[0]);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        a.mo25442a(new NotificationChannel("checkin.default_notification_channel", this.f41100b.getString(C0126R.string.checkin_module_name), 3));
        C1102je jeVar = new C1102je(this.f41100b, "checkin.default_notification_channel");
        jeVar.mo13630b(17301642);
        jeVar.mo13619a(System.currentTimeMillis());
        jeVar.mo13639d(str);
        jeVar.mo13627a(true);
        jeVar.mo13640e(str);
        a.mo25441a(17301642, jeVar.mo13629b());
    }

    /* renamed from: a */
    public final void mo24000a(String str) {
        if (!qdn.m31960l(this.f41100b).getString("CheckinService_lastSimOperator", "").equals(str)) {
            qdn.m31960l(this.f41100b).edit().putString("CheckinService_lastSimOperator", str).apply();
        }
    }
}
