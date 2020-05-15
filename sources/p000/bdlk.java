package p000;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import android.view.Window;

/* renamed from: bdlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bdlk implements Window.OnFrameMetricsAvailableListener, bdev, bdeu {

    /* renamed from: a */
    private final bdll f105892a;

    /* renamed from: b */
    private final boolean f105893b;

    /* renamed from: c */
    private Activity f105894c;

    /* renamed from: d */
    private boolean f105895d;

    /* renamed from: e */
    private HandlerThread f105896e;

    /* renamed from: f */
    private Handler f105897f;

    public bdlk(bdll bdll, boolean z) {
        this.f105892a = bdll;
        this.f105893b = z;
        if (z) {
            this.f105895d = true;
        }
    }

    /* renamed from: c */
    private static String m91020c(Activity activity) {
        if (activity instanceof bdim) {
            return bdgg.m90735a(((bdim) activity).mo58071a());
        }
        return activity.getClass().getName();
    }

    /* renamed from: d */
    private Handler m91021d() {
        if (this.f105897f == null) {
            HandlerThread handlerThread = new HandlerThread("Primes-Jank");
            this.f105896e = handlerThread;
            handlerThread.start();
            this.f105897f = new Handler(this.f105896e.getLooper());
        }
        return this.f105897f;
    }

    /* renamed from: e */
    private void m91022e() {
        Activity activity = this.f105894c;
        if (activity != null) {
            activity.getWindow().addOnFrameMetricsAvailableListener(this, m91021d());
        }
    }

    /* renamed from: f */
    private void m91023f() {
        Activity activity = this.f105894c;
        if (activity != null) {
            try {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this);
            } catch (RuntimeException e) {
                int i = bdlm.f105898a;
            }
        }
    }

    /* renamed from: a */
    public void mo58144a() {
        synchronized (this) {
            this.f105895d = true;
            if (this.f105894c == null) {
                int i = bdlm.f105898a;
            } else {
                m91022e();
            }
        }
    }

    /* renamed from: b */
    public void mo58145b() {
        synchronized (this) {
            this.f105895d = false;
            m91023f();
        }
    }

    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long metric = frameMetrics.getMetric(8);
        bdlm bdlm = ((bdlj) this.f105892a).f105891a;
        double d = (double) metric;
        Double.isNaN(d);
        bdlm.m91029a((int) (d / 1000000.0d));
    }

    /* renamed from: b */
    public void mo57948b(Activity activity) {
        if (this.f105893b) {
            bdll bdll = this.f105892a;
            ((bdlj) bdll).f105891a.mo58148a(m91020c(activity));
        }
        synchronized (this) {
            this.f105894c = activity;
            if (this.f105895d) {
                m91022e();
            }
        }
    }

    /* renamed from: c */
    public void mo58146c() {
        synchronized (this) {
            mo58145b();
            if (this.f105897f != null) {
                this.f105896e.quitSafely();
                this.f105896e = null;
                this.f105897f = null;
            }
        }
    }

    /* renamed from: a */
    public void mo57947a(Activity activity) {
        synchronized (this) {
            if (this.f105895d) {
                m91023f();
            }
            this.f105894c = null;
        }
        if (this.f105893b) {
            bdll bdll = this.f105892a;
            ((bdlj) bdll).f105891a.mo58149a(m91020c(activity), true, null);
        }
    }
}
