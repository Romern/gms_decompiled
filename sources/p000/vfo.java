package p000;

import com.google.android.gms.drive.events.internal.TransferProgressData;

/* renamed from: vfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vfo implements ufx {

    /* renamed from: a */
    final /* synthetic */ vfp f49184a;

    /* renamed from: b */
    private final uey f49185b;

    /* renamed from: c */
    private final ukk f49186c;

    /* renamed from: d */
    private long f49187d = 0;

    public vfo(vfp vfp, uey uey, ukk ukk) {
        this.f49184a = vfp;
        this.f49185b = uey;
        this.f49186c = ukk;
    }

    /* renamed from: a */
    public final synchronized Long mo28396a() {
        long j;
        j = this.f49187d;
        return j >= 0 ? Long.valueOf(j) : null;
    }

    /* renamed from: a */
    public final synchronized void mo27242a(int i) {
    }

    /* renamed from: a */
    public final synchronized void mo27243a(long j, long j2) {
        this.f49187d = j2;
        try {
            ujx a = this.f49184a.f49189b.mo27402a(this.f49185b, this.f49186c);
            this.f49184a.f49197j.mo27858a(new TransferProgressData(1, a.mo27610g(), 2, j, j2), a);
        } catch (uaa e) {
        }
    }
}
