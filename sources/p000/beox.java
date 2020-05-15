package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: beox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beox implements Application.ActivityLifecycleCallbacks, beoo {

    /* renamed from: h */
    private static final long f111959h = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a */
    public final ScheduledExecutorService f111960a;

    /* renamed from: b */
    public beor f111961b;

    /* renamed from: c */
    public long f111962c;

    /* renamed from: d */
    public long f111963d;

    /* renamed from: e */
    public final AtomicLong f111964e = new AtomicLong(0);

    /* renamed from: f */
    public ScheduledFuture f111965f;

    /* renamed from: g */
    protected final Object f111966g;

    /* renamed from: i */
    private final beoq f111967i;

    private beox(beor beor, ScheduledExecutorService scheduledExecutorService, beoq beoq) {
        this.f111961b = beor;
        this.f111960a = scheduledExecutorService;
        this.f111967i = beoq;
        this.f111962c = 100;
        this.f111963d = f111959h;
        this.f111966g = new Object();
    }

    /* renamed from: a */
    public static beox m95372a(beor beor, ScheduledExecutorService scheduledExecutorService, beoq beoq, Application application) {
        beox beox = new beox(beor, scheduledExecutorService, beoq);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(beox);
        }
        beoq.f111953c = beox;
        return beox;
    }

    /* renamed from: b */
    public final void mo60870b() {
        this.f111964e.set(0);
        this.f111961b.mo60848a(this.f111967i);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        synchronized (this.f111966g) {
            mo60870b();
            mo60869a();
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    /* renamed from: a */
    public final void mo60869a() {
        synchronized (this.f111966g) {
            ScheduledFuture scheduledFuture = this.f111965f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f111965f = null;
            }
        }
    }
}
