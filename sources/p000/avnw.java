package p000;

import android.content.Context;
import android.os.SystemClock;

/* renamed from: avnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class avnw extends avnn {

    /* renamed from: e */
    public static final avto f93566e = new avto("next_action_name", "");

    /* renamed from: f */
    public static final avtf f93567f = new avtf("next_action_params");

    /* renamed from: g */
    public static final avta f93568g = new avta("enforce_delay", false);

    /* renamed from: h */
    private static final avtk f93569h = new avtk("earliest_execution_time", 0L);

    /* renamed from: i */
    private static final avtk f93570i = new avtk("boot_token", -1L);

    /* renamed from: j */
    private final Context f93571j;

    /* renamed from: k */
    private final skc f93572k;

    protected avnw(String str, Context context, avte avte) {
        super(str, avte);
        this.f93571j = context;
        this.f93572k = new skc(context);
    }

    /* renamed from: c */
    public final avni mo51435c() {
        long j;
        long e = ((Long) mo51433a(f93569h)).longValue() == 0 ? mo51448e() : ((Long) mo51433a(f93569h)).longValue();
        long d = ((avmq) avmq.f93413e.mo51589b()).mo51394d();
        if (((Long) mo51433a(f93570i)).longValue() != -1) {
            j = ((Long) mo51433a(f93570i)).longValue();
        } else {
            j = d;
        }
        if (j != d || e <= SystemClock.elapsedRealtime()) {
            return new avni((String) mo51433a(f93566e), (avte) mo51433a(f93567f));
        }
        this.f93572k.mo25675a("DelayExecutionAction-Alarm", 3, e, avnh.m78871a(this.f93571j, 0), (String) null);
        if (!((Boolean) mo51433a(f93568g)).booleanValue()) {
            return new avni((String) mo51433a(f93566e), (avte) mo51433a(f93567f), null);
        }
        String str = this.f93511a;
        avtd b = mo51432a().mo51598b();
        b.mo51594a(f93569h, Long.valueOf(e));
        b.mo51594a(f93570i, Long.valueOf(j));
        return new avni(str, b.mo51593a(), null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract long mo51448e();
}
