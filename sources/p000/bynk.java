package p000;

import android.util.Log;

/* renamed from: bynk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bynk implements bqfp {

    /* renamed from: a */
    final /* synthetic */ Runnable f167117a;

    /* renamed from: b */
    final /* synthetic */ bynm f167118b;

    public bynk(bynm bynm, Runnable runnable) {
        this.f167118b = bynm;
        this.f167117a = runnable;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f167117a.run();
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        String valueOf = String.valueOf(this.f167118b.f167120a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
        sb.append("Could not resolve opt-in status future. Client options: ");
        sb.append(valueOf);
        Log.e("SherlogClientImpl", sb.toString(), th);
    }
}
