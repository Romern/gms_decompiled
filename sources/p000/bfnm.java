package p000;

import com.google.android.gms.location.ActivityRecognitionResult;
import java.util.Collections;
import java.util.List;

/* renamed from: bfnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfnm implements bfma {

    /* renamed from: c */
    private final List f114492c;

    public bfnm(ActivityRecognitionResult activityRecognitionResult) {
        bmxy.m108581a(activityRecognitionResult);
        this.f114492c = Collections.singletonList(activityRecognitionResult);
    }

    /* renamed from: a */
    public final List mo61908a(long j) {
        return mo61909a(j, 60000, bfma.f114381a);
    }

    /* renamed from: a */
    public final boolean mo61911a() {
        return true;
    }

    /* renamed from: b */
    public final List mo61912b() {
        return mo61910a(bfma.f114381a);
    }

    /* renamed from: c */
    public final long mo61913c() {
        return ((ActivityRecognitionResult) this.f114492c.get(0)).f79302c;
    }

    /* renamed from: a */
    public final List mo61909a(long j, long j2, bflz bflz) {
        if (j < ((ActivityRecognitionResult) this.f114492c.get(0)).f79302c) {
            return mo61910a(bflz);
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    public final List mo61910a(bflz bflz) {
        ActivityRecognitionResult a = bflz.mo61907a((ActivityRecognitionResult) this.f114492c.get(0));
        if (a == null) {
            return Collections.emptyList();
        }
        if (a.equals(this.f114492c.get(0))) {
            return this.f114492c;
        }
        return Collections.singletonList(a);
    }
}
