package p000;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bwbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwbj {

    /* renamed from: a */
    private static final String f158742a = bwbj.class.getSimpleName();

    /* renamed from: b */
    private static final long f158743b = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: c */
    private static final AtomicInteger f158744c = new AtomicInteger(0);

    /* renamed from: d */
    private int f158745d;

    /* renamed from: e */
    private final long f158746e = SystemClock.elapsedRealtime();

    /* renamed from: f */
    private final StringBuilder f158747f;

    public bwbj(List list) {
        synchronized (this) {
            this.f158745d = -1;
            StringBuilder sb = new StringBuilder("DRD");
            this.f158747f = sb;
            sb.append("(");
            sb.append(f158744c.incrementAndGet());
            sb.append("): ");
            String str = "";
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f158747f.append(str);
                str = "|";
                this.f158747f.append(((bwbd) it.next()).mo73402a());
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo73449a() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f158746e;
        this.f158747f.append(", ");
        if (elapsedRealtime < 1000) {
            this.f158747f.append("<1s");
            return;
        }
        StringBuilder sb = this.f158747f;
        sb.append(elapsedRealtime / 1000);
        sb.append("s");
    }

    /* renamed from: a */
    public final synchronized void mo73450a(int i, int i2) {
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f158746e);
        if (i2 >= 8192) {
            if (((long) elapsedRealtime) <= f158743b) {
                this.f158745d = (((int) TimeUnit.SECONDS.toMillis(1)) * i2) / elapsedRealtime;
                if (bwam.m121655a(f158742a, 3)) {
                    int i3 = this.f158745d;
                    StringBuilder sb = new StringBuilder(67);
                    sb.append("Sent ");
                    sb.append(i);
                    sb.append(", Loaded ");
                    sb.append(i2);
                    sb.append(" bytes.  Byte/Sec = ");
                    sb.append(i3);
                    sb.toString();
                }
            }
        }
        this.f158747f.append(", ");
        if (i2 < 1000) {
            this.f158747f.append("<1kb");
        } else {
            StringBuilder sb2 = this.f158747f;
            sb2.append(i2 / 1000);
            sb2.append("kb");
        }
        if (bwam.m121655a(f158742a, 3)) {
            this.f158747f.toString();
        }
    }
}
