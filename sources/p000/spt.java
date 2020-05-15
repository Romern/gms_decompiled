package p000;

import android.app.ActivityManager;

/* renamed from: spt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class spt implements ActivityManager.OnUidImportanceListener {

    /* renamed from: a */
    final /* synthetic */ spu f44951a;

    public spt(spu spu) {
        this.f44951a = spu;
    }

    public final void onUidImportance(int i, int i2) {
        spu spu = this.f44951a;
        spu.f44948a.post(new spq(spu, i, spu.m35919b(i2)));
    }
}
