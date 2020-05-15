package p000;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: bqhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqhb implements Runnable {

    /* renamed from: a */
    bqhd f140655a;

    public bqhb(bqhd bqhd) {
        this.f140655a = bqhd;
    }

    public final void run() {
        bqgg bqgg;
        bqhd bqhd = this.f140655a;
        if (bqhd != null && (bqgg = bqhd.f140656a) != null) {
            this.f140655a = null;
            if (!bqgg.isDone()) {
                try {
                    ScheduledFuture scheduledFuture = bqhd.f140657b;
                    bqhd.f140657b = null;
                    String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                StringBuilder sb = new StringBuilder(75);
                                sb.append(str);
                                sb.append(" (timeout delayed by ");
                                sb.append(abs);
                                sb.append(" ms after scheduled time)");
                                str = sb.toString();
                            }
                        } catch (Throwable th) {
                            th = th;
                            bqhd.mo69136a((Throwable) new bqhc(str));
                            throw th;
                        }
                    }
                    try {
                        String valueOf = String.valueOf(str);
                        String valueOf2 = String.valueOf(bqgg);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
                        sb2.append(valueOf);
                        sb2.append(": ");
                        sb2.append(valueOf2);
                        bqhd.mo69136a((Throwable) new bqhc(sb2.toString()));
                    } catch (Throwable th2) {
                        th = th2;
                        bqhd.mo69136a((Throwable) new bqhc(str));
                        throw th;
                    }
                } finally {
                    bqgg.cancel(true);
                }
            } else {
                bqhd.mo69137b(bqgg);
            }
        }
    }
}
