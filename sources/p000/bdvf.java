package p000;

import android.content.BroadcastReceiver;

/* renamed from: bdvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdvf implements bqfp {

    /* renamed from: a */
    final /* synthetic */ long f106494a;

    /* renamed from: b */
    final /* synthetic */ BroadcastReceiver.PendingResult f106495b;

    /* renamed from: c */
    final /* synthetic */ bdvg f106496c;

    public bdvf(bdvg bdvg, long j, BroadcastReceiver.PendingResult pendingResult) {
        this.f106496c = bdvg;
        this.f106494a = j;
        this.f106495b = pendingResult;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        bdvg bdvg = this.f106496c;
        bdvg.f106497a.mo58395a(3009, true, bdvg.f106498b.mo54418b() - this.f106494a, 0, null, null, null);
        this.f106495b.finish();
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bdvg bdvg = this.f106496c;
        bdvg.f106497a.mo58394a(3009, bdvg.f106498b.mo54418b() - this.f106494a, 0);
        this.f106495b.finish();
    }
}
