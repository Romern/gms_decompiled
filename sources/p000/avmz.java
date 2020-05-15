package p000;

import android.content.Context;
import android.util.EventLog;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.control.ChimeraGcmTaskService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: avmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avmz {

    /* renamed from: a */
    public static final avsz f93475a = new avmy();

    /* renamed from: c */
    private static final Logger f93476c = avpq.m79017d("LogControl");

    /* renamed from: d */
    private static final avtg f93477d = new avtg("control.log.last_event_log_hash_code", 0);

    /* renamed from: e */
    private static final avtk f93478e = new avtk("control.log.last_event_log_timestamp", 0L);

    /* renamed from: f */
    private static final avtk f93479f = new avtk("control.log.current_heart_beat_min_delay", -1L);

    /* renamed from: g */
    private static final avtk f93480g = new avtk("control.log.current_heart_beat_max_delay", -1L);

    /* renamed from: h */
    private static final avta f93481h = new avta("control.log.heart_beat_task_scheduled", false);

    /* renamed from: b */
    public final avpp f93482b;

    /* renamed from: i */
    private final Context f93483i;

    /* renamed from: j */
    private final avtn f93484j = ((avtn) avtn.f93892a.mo51589b());

    /* renamed from: k */
    private final int f93485k;

    static {
        new avtg("control.log.zero_rated_apn_status", 0);
    }

    public avmz(Context context) {
        this.f93483i = context;
        this.f93482b = avpp.m79008a(context);
        this.f93485k = avma.m78774b(context);
    }

    /* renamed from: a */
    private static boolean m78854a(SystemUpdateStatus systemUpdateStatus) {
        return !systemUpdateStatus.f109459a.isEmpty() || cftq.f185693a.mo6606a().mo82711c();
    }

    /* renamed from: e */
    public static boolean m78855e() {
        if (cftq.f185693a.mo6606a().mo82710b() && ((avmx) avmx.f93453h.mo51589b()).mo51414d().f109459a.isEmpty()) {
            if (cftq.m143013c() > 0 && cftq.m143012b() > 0 && cftq.m143013c() < cftq.m143012b()) {
                return true;
            }
            f93476c.mo25418e("Tasks parameter min_delay: %d, max_delay: %d incorrect.", Long.valueOf(cftq.m143013c()), Long.valueOf(cftq.m143012b()));
        }
        return false;
    }

    /* renamed from: b */
    public final void mo51421b() {
        Context context = this.f93483i;
        ChimeraGcmTaskService.f109491a.mo25414c("Scheduling task: LogHeartBeat.", new Object[0]);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.update.SystemUpdateGcmTaskService";
        aebi.f63099k = "LogHeartBeat";
        aebi.mo34004a(cftq.m143013c(), cftq.m143012b());
        aebi.f63102n = true;
        aebi.mo34023a(2);
        aebi.mo34024a(0, cdny.m134338c() ? 1 : 0);
        aebi.mo34027b(1);
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* renamed from: c */
    public final void mo51422c() {
        SystemUpdateStatus d = ((avmx) avmx.f93453h.mo51589b()).mo51414d();
        int hashCode = Arrays.hashCode(new Object[]{Integer.valueOf(d.f109461c), d.f109459a});
        long currentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.SECONDS.toMillis(cfsg.m142821h());
        int intValue = ((Integer) this.f93484j.mo51607b(f93477d)).intValue();
        long longValue = currentTimeMillis - ((Long) this.f93484j.mo51607b(f93478e)).longValue();
        if (intValue != hashCode || (m78854a(d) && longValue >= millis)) {
            this.f93484j.mo51605a(f93477d.mo51602b(Integer.valueOf(hashCode)), f93478e.mo51602b(Long.valueOf(currentTimeMillis)));
            avmq avmq = (avmq) avmq.f93413e.mo51589b();
            SystemUpdateStatus d2 = ((avmx) avmx.f93453h.mo51589b()).mo51414d();
            int i = d2.f109461c & 31;
            if (d2.f109467i) {
                i |= 32;
            }
            if (d2.f109468j) {
                i |= 64;
            }
            if (avmq.mo51393c() > 0) {
                i |= 512;
            }
            EventLog.writeEvent(201001, Long.valueOf((long) ((((d2.f109461c >> 8) & 15) << 19) | i | AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE | (((char) this.f93485k) << 23))), 0, 0, ((avmx) avmx.f93453h.mo51589b()).mo51414d().f109459a);
            bxvd da = boht.f133150d.mo74144da();
            int i2 = d.f109461c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boht boht = (boht) da.f164949b;
            int i3 = 1 | boht.f133152a;
            boht.f133152a = i3;
            boht.f133153b = i2;
            String str = d.f109459a;
            if (str != null) {
                str.getClass();
                boht.f133152a = i3 | 2;
                boht.f133154c = str;
            }
            avpp avpp = this.f93482b;
            boht boht2 = (boht) da.mo74062i();
            bxvd a = avpp.mo51476a(2);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bohn bohn = (bohn) a.f164949b;
            bohn bohn2 = bohn.f133102n;
            boht2.getClass();
            bohn.f133109f = boht2;
            bohn.f133104a |= 16;
            avpp.mo51478a((bohn) a.mo74062i());
        }
    }

    /* renamed from: d */
    public final void mo51423d() {
        if (!(((Boolean) this.f93484j.mo51607b(f93481h)).booleanValue() && cftq.m143013c() == ((Long) this.f93484j.mo51607b(f93479f)).longValue() && cftq.m143012b() == ((Long) this.f93484j.mo51607b(f93480g)).longValue()) && m78855e()) {
            mo51421b();
            mo51420a(true);
            return;
        }
        mo51420a(false);
    }

    /* renamed from: a */
    public final void mo51419a() {
        if (m78854a(((avmx) avmx.f93453h.mo51589b()).mo51414d())) {
            Context context = this.f93483i;
            ChimeraGcmTaskService.f109491a.mo25414c("Scheduling task: LogStatus.", new Object[0]);
            aebi aebi = new aebi();
            aebi.f63097i = "com.google.android.gms.update.SystemUpdateGcmTaskService";
            aebi.f63099k = "LogStatus";
            aebi.mo34004a(cfsg.m142821h(), cfsg.f185570a.mo6606a().mo82623G());
            aebi.f63102n = true;
            aebi.mo34023a(2);
            aebi.mo34024a(0, cdny.m134338c() ? 1 : 0);
            aebi.mo34027b(1);
            aeat.m51532a(context).mo33984a(aebi.mo33974b());
        }
    }

    /* renamed from: a */
    public final void mo51420a(boolean z) {
        if (z) {
            this.f93484j.mo51605a(f93480g.mo51602b(Long.valueOf(cftq.m143012b())));
            this.f93484j.mo51605a(f93479f.mo51602b(Long.valueOf(cftq.m143013c())));
        }
        this.f93484j.mo51605a(f93481h.mo51602b(Boolean.valueOf(z)));
    }
}
