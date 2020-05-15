package p000;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

/* renamed from: gnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gnh {

    /* renamed from: a */
    public static final sek f18680a = ght.m13171a("GetTokenResponseHandler");

    /* renamed from: b */
    public static final bnic f18681b = bnic.m109494a("ac2dm", "android", "androidconsole", "androidsecure", "gaia", "mobilesync", "^^_account_id_^^", "oauth2:https://www.googleapis.com/auth/android_checkin", "oauth2:https://www.googleapis.com/auth/cryptauth", "oauth2:https://www.googleapis.com/auth/ender", "oauth2:https://www.googleapis.com/auth/experimentsandconfigs", "oauth2:https://www.googleapis.com/auth/glass.hangouts", "oauth2:https://www.googleapis.com/auth/androiddevicemanagementregistration", "oauth2:https://www.googleapis.com/auth/kid.management.bootstrap", "androidmarket");

    /* renamed from: c */
    public final gnp f18682c;

    /* renamed from: d */
    public final gns f18683d;

    /* renamed from: e */
    public final goa f18684e;

    /* renamed from: f */
    public final gkh f18685f;

    /* renamed from: g */
    public final Context f18686g;

    /* renamed from: h */
    public final ieq f18687h = ((ieq) ieq.f20816a.mo13145b());

    public gnh(Context context) {
        gnp gnp = (gnp) gnp.f18711a.mo13145b();
        gns gns = (gns) gns.f18716b.mo13145b();
        goa goa = (goa) goa.f18759a.mo13145b();
        gkh gkh = new gkh(context);
        gmw gmw = new gmw();
        srb srb = srb.f45012a;
        this.f18686g = context;
        sdo.m34959a(gnp);
        this.f18682c = gnp;
        sdo.m34959a(gns);
        this.f18683d = gns;
        sdo.m34959a(goa);
        this.f18684e = goa;
        sdo.m34959a(gkh);
        this.f18685f = gkh;
        sdo.m34959a(gmw);
        sdo.m34959a(srb);
    }

    /* renamed from: a */
    public final ieu mo12075a(bsne bsne, bsnd bsnd, Duration duration) {
        int i;
        try {
            Context context = this.f18686g;
            int i2 = Build.VERSION.SDK_INT;
            i = Settings.Global.getInt(context.getContentResolver(), "boot_count");
        } catch (Settings.SettingNotFoundException e) {
            f18680a.mo25415d("Failed to get boot count", e, new Object[0]);
            i = -1;
        }
        bxvd da = ieu.f20822g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ieu ieu = (ieu) da.f164949b;
        bsnd.getClass();
        ieu.f20824a = bsnd;
        bsne.getClass();
        ieu.f20825b = bsne;
        long epochMilli = Instant.now().toEpochMilli();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((ieu) da.f164949b).f20829f = epochMilli;
        double random = Math.random();
        long seconds = TimeUnit.MINUTES.toSeconds(10);
        long seconds2 = TimeUnit.MINUTES.toSeconds(5);
        double d = (double) seconds;
        Double.isNaN(d);
        long seconds3 = duration.minus(Duration.ofSeconds(seconds2 + ((long) (random * d)))).getSeconds();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((ieu) da.f164949b).f20827d = seconds3;
        long seconds4 = Duration.ofMillis(SystemClock.elapsedRealtime()).getSeconds();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ieu ieu2 = (ieu) da.f164949b;
        ieu2.f20826c = seconds4;
        ieu2.f20828e = i;
        return (ieu) da.mo74062i();
    }
}
