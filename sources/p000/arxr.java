package p000;

import com.google.android.gms.smartdevice.d2d.VerificationInfo;

/* renamed from: arxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arxr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ VerificationInfo f88418a;

    /* renamed from: b */
    final /* synthetic */ arxx f88419b;

    public arxr(arxx arxx, VerificationInfo verificationInfo) {
        this.f88419b = arxx;
        this.f88418a = verificationInfo;
    }

    public final void run() {
        this.f88419b.mo48904a(this.f88418a);
    }
}
