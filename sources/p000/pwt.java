package p000;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: pwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pwt {

    /* renamed from: a */
    public static final int f40528a = ((int) cdbn.f180427a.mo6606a().mo77204b());

    /* renamed from: g */
    private static final int f40529g = ((int) cdbn.f180427a.mo6606a().mo77203a());

    /* renamed from: b */
    public final pvd f40530b;

    /* renamed from: c */
    public final aaag f40531c;

    /* renamed from: d */
    public final qav f40532d;

    /* renamed from: e */
    public boolean f40533e;

    /* renamed from: f */
    public int f40534f = 0;

    /* renamed from: h */
    private final ActivityManager f40535h;

    /* renamed from: i */
    private final String f40536i;

    /* renamed from: j */
    private final snf f40537j;

    /* renamed from: k */
    private final boolean f40538k;

    /* renamed from: l */
    private ScheduledFuture f40539l;

    public pwt(pvd pvd, aaag aaag, Context context, String str, qav qav) {
        this.f40530b = pvd;
        this.f40531c = aaag;
        this.f40535h = (ActivityManager) context.getSystemService("activity");
        this.f40536i = str;
        this.f40537j = snp.m35703a(1, 10);
        this.f40532d = qav;
        this.f40538k = cdbn.f180427a.mo6606a().mo77205c().contains(str);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        return false;
     */
    /* renamed from: a */
    public final synchronized boolean mo23784a() {
        if (this.f40538k) {
            return true;
        }
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = this.f40535h.getRunningTasks(1);
            if (runningTasks != null) {
                if (!runningTasks.isEmpty()) {
                    ComponentName componentName = runningTasks.get(0).topActivity;
                    if (componentName != null && this.f40536i.equals(componentName.getPackageName())) {
                        return true;
                    }
                }
            }
            this.f40532d.mo23677d("No tasks running", new Object[0]);
            return false;
        } catch (RuntimeException e) {
            this.f40532d.mo23677d("Unable to get the running tasks bailing out.", new Object[0]);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo23785b() {
        if (!this.f40538k) {
            ScheduledFuture scheduledFuture = this.f40539l;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f40539l = this.f40537j.mo25769a(new pws(this), (long) f40529g, (long) f40529g, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo23786c() {
        if (!this.f40538k) {
            ScheduledFuture scheduledFuture = this.f40539l;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.f40539l = null;
            }
            this.f40537j.shutdown();
        }
    }
}
