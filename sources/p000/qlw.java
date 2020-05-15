package p000;

import android.util.Log;

/* renamed from: qlw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qlw implements bqfp {

    /* renamed from: a */
    final /* synthetic */ qly f41678a;

    public qlw(qly qly) {
        this.f41678a = qly;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        this.f41678a.mo24102a((qlx) obj);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        Log.e("FileApkSvc", "Staging failed.", th);
        this.f41678a.mo24102a((qlx) null);
    }
}
