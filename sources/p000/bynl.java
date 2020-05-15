package p000;

import android.util.Log;

/* renamed from: bynl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bynl implements bqfp {

    /* renamed from: a */
    final /* synthetic */ bynm f167119a;

    public bynl(bynm bynm) {
        this.f167119a = bynm;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        String str = this.f167119a.f167120a.f167104a;
        String valueOf = String.valueOf((Boolean) obj);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Opt-in status future for ");
        sb.append(str);
        sb.append(": ");
        sb.append(valueOf);
        sb.toString();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        String valueOf = String.valueOf(this.f167119a.f167120a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
        sb.append("Could not resolve opt-in status future. Client options: ");
        sb.append(valueOf);
        Log.e("SherlogClientImpl", sb.toString(), th);
    }
}
