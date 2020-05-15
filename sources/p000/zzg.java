package p000;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: zzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zzg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bqgg f56258a;

    /* renamed from: b */
    final /* synthetic */ String f56259b;

    /* renamed from: c */
    final /* synthetic */ zxf f56260c;

    /* renamed from: d */
    final /* synthetic */ zzh f56261d;

    public zzg(zzh zzh, bqgg bqgg, String str, zxf zxf) {
        this.f56261d = zzh;
        this.f56258a = bqgg;
        this.f56259b = str;
        this.f56260c = zxf;
    }

    public final void run() {
        Status status;
        int i;
        zzh zzh;
        String str;
        zxf zxf;
        try {
            status = (Status) this.f56258a.get(0, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zyh.m46681a("FontsSharedState", e, "Failed to get status of %s in download listener", this.f56259b);
            status = Status.f30109c;
        } catch (Throwable th) {
            this.f56261d.mo31620a(this.f56259b, this.f56260c);
            throw th;
        }
        zyh.m46683c("FontsSharedState", "Status %s for %s", status, this.f56259b);
        if (!status.mo17710c()) {
            zzh = this.f56261d;
            str = this.f56259b;
            zxf = this.f56260c;
        } else {
            synchronized (this.f56261d.f56264c.f56268b) {
                i = this.f56261d.f56264c.f56283q.f56231a.f56082b;
            }
            try {
                zxe a = zyo.m46707a(this.f56261d.f56263b.mo31579b(this.f56260c.f56087b));
                int i2 = a.f56082b;
                if (i >= i2) {
                    zyh.m46683c("FontsSharedState", "Directory download complete for %d but already at %d; nop", Integer.valueOf(i2), Integer.valueOf(i));
                }
                zzh zzh2 = this.f56261d;
                zzh2.f56264c.mo31627c(zzh2.f56262a).mo31572a(a);
                zzh zzh3 = this.f56261d;
                zyh.m46683c("FontsSharedState", "After download %s and update using directory v%d", this.f56259b, Integer.valueOf(zzh3.f56264c.mo31630e(zzh3.f56262a.getApplicationContext()).f56231a.f56082b));
            } catch (Exception e2) {
                zyh.m46681a("FontsSharedState", e2, "Failed to load and update directory from %s after download %s", this.f56260c.f56087b, this.f56259b);
            }
            zzh = this.f56261d;
            str = this.f56259b;
            zxf = this.f56260c;
        }
        zzh.mo31620a(str, zxf);
    }
}
