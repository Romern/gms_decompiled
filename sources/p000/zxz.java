package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: zxz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zxz implements Runnable {

    /* renamed from: a */
    private final zxy f56156a;

    public zxz(zxy zxy) {
        bmxy.m108582a(zxy, "download");
        this.f56156a = zxy;
    }

    public final void run() {
        this.f56156a.mo31580a(Status.f30110d);
    }
}
