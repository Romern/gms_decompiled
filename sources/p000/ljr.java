package p000;

import android.content.Intent;

/* renamed from: ljr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ljr implements bqfp {

    /* renamed from: a */
    final /* synthetic */ lju f26211a;

    public ljr(lju lju) {
        this.f26211a = lju;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        bmxv bmxv = (bmxv) obj;
        if (bmxv.mo66813a()) {
            this.f26211a.mo15167a(-1, (Intent) bmxv.mo66814b());
        } else {
            this.f26211a.mo15165a(0);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        bnsl bnsl = (bnsl) lju.f26221d.mo68388c();
        bnsl.mo68437a(th);
        bnsl.mo68448m();
        this.f26211a.mo15165a(0);
    }
}
