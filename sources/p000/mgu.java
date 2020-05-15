package p000;

/* renamed from: mgu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class mgu implements bqfp {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Void voidR = (Void) obj;
        mgw.f33663a.mo25414c("App updates successfully resumed", new Object[0]);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        if (th instanceof lzk) {
            mgw.f33663a.mo25416d("App updates resume failed because disabled", new Object[0]);
        } else {
            mgw.f33663a.mo25417e("App updates resume failed", th, new Object[0]);
        }
    }
}
