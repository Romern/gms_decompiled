package p000;

import android.location.Location;
import android.os.SystemClock;
import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.List;

/* renamed from: bfsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfsi extends bfsf {

    /* renamed from: b */
    long f115119b;

    /* renamed from: c */
    final /* synthetic */ bfsl f115120c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfsi(bfsl bfsl) {
        super(bfsl);
        this.f115120c = bfsl;
    }

    /* renamed from: a */
    private final boolean m97711a() {
        return SystemClock.elapsedRealtime() - this.f115119b > cewd.f183471a.mo6606a().vehicleActivityTimeoutMs();
    }

    /* renamed from: b */
    public final void mo62207b() {
        this.f115119b = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final void mo62205a(ActivityRecognitionResult activityRecognitionResult) {
        if (!m97711a()) {
            int a = activityRecognitionResult.mo43491a().mo43513a();
            if (a == 0 || a == 1) {
                this.f115119b = SystemClock.elapsedRealtime();
            } else if (a == 2) {
                mo62204a(this.f115120c.f115132g);
            }
        } else {
            mo62204a(this.f115120c.f115132g);
            this.f115120c.mo62150a(activityRecognitionResult);
        }
    }

    /* renamed from: a */
    public final void mo62206a(List list) {
        if (m97711a()) {
            mo62204a(this.f115120c.f115132g);
            this.f115120c.mo62211b(list);
        } else if (bfsl.m97720a((Location) list.get(list.size() - 1))) {
            this.f115119b = SystemClock.elapsedRealtime();
        }
    }
}
