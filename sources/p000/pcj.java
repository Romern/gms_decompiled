package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: pcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pcj {

    /* renamed from: a */
    public final pcl f38834a;

    /* renamed from: b */
    public final long f38835b;

    /* renamed from: c */
    public final long f38836c;

    /* renamed from: d */
    public final double f38837d;

    /* renamed from: e */
    public final Handler f38838e = new adzt(Looper.getMainLooper());

    /* renamed from: f */
    public final AtomicInteger f38839f = new AtomicInteger(0);

    /* renamed from: g */
    public long f38840g;

    public pcj(pci pci) {
        this.f38834a = pci.f38830a;
        this.f38835b = pci.f38831b;
        this.f38836c = pci.f38832c;
        this.f38837d = pci.f38833d;
    }

    /* renamed from: a */
    public final boolean mo22903a() {
        if (this.f38839f.get() != 0) {
            this.f38838e.removeCallbacks(null);
            double d = (double) this.f38835b;
            double pow = Math.pow(this.f38837d, (double) (this.f38839f.get() - 1));
            Double.isNaN(d);
            long j = (long) (d * pow);
            this.f38840g = j;
            if (j >= this.f38836c) {
                this.f38834a.mo22694a(bpea.WIFI_START_EXPONENTIAL_RETRY_MAX_DELAY_REACHED);
                return false;
            }
            this.f38839f.incrementAndGet();
            this.f38838e.postDelayed(new pch(this), this.f38840g);
            return true;
        }
        this.f38838e.post(null);
        this.f38839f.incrementAndGet();
        return true;
    }

    /* renamed from: b */
    public final void mo22904b() {
        this.f38839f.set(0);
        this.f38840g = 0;
        this.f38838e.removeCallbacks(null);
    }
}
