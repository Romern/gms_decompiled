package p000;

import android.os.SystemClock;

/* renamed from: ngd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ngd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ngg f35477a;

    public ngd(ngg ngg) {
        this.f35477a = ngg;
    }

    public final void run() {
        ngg ngg;
        try {
            ngg ngg2 = this.f35477a;
            if (ngg2.f35483a.startLeScan(ngg2.f35486d)) {
                ngz.m26242b(24);
                int d = this.f35477a.f35484b.mo20623d();
                int i = 1500;
                if (d != 0) {
                    if (d == 2) {
                        i = 2000;
                    }
                }
                long j = (long) i;
                long elapsedRealtime = SystemClock.elapsedRealtime() + j;
                ngg ngg3 = this.f35477a;
                ngg3.f35487e.f35563a.mo20639a(ngg3.f35484b.mo20628i(), j);
                int i2 = 1;
                while (true) {
                    if (SystemClock.elapsedRealtime() < elapsedRealtime) {
                        if (!this.f35477a.f35484b.mo20621b()) {
                            break;
                        }
                        Thread.sleep(50);
                        int i3 = i2 + 1;
                        StringBuilder sb = new StringBuilder(32);
                        sb.append("Background iteration ");
                        sb.append(i2);
                        sb.toString();
                        this.f35477a.mo20595g();
                        i2 = i3;
                    } else {
                        break;
                    }
                }
                ngg = this.f35477a;
                ngg.mo20594f();
                this.f35477a.mo20593e();
                return;
            }
            ngz.m26242b(30);
            throw new IllegalStateException("Scan failed: Bluetooth may be disabled.");
        } catch (Exception e) {
            this.f35477a.f35484b.mo20617a(3);
            nha.m26244a("Exception in background scan", e);
            ngg = this.f35477a;
        } catch (Throwable th) {
            this.f35477a.mo20594f();
            this.f35477a.mo20593e();
            throw th;
        }
    }
}
