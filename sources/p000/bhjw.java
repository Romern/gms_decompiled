package p000;

import android.graphics.Rect;
import android.view.View;

/* renamed from: bhjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhjw implements C1270pi {

    /* renamed from: a */
    final /* synthetic */ bhjx f118879a;

    public bhjw(bhjx bhjx) {
        this.f118879a = bhjx;
    }

    /* renamed from: a */
    public final C1296qh mo761a(View view, C1296qh qhVar) {
        bhjx bhjx = this.f118879a;
        if (bhjx.f118881b == null) {
            bhjx.f118881b = new Rect();
        }
        this.f118879a.f118881b.set(qhVar.mo15731a(), qhVar.mo15733b(), qhVar.mo15735c(), qhVar.mo15736d());
        this.f118879a.mo63888a(qhVar);
        bhjx bhjx2 = this.f118879a;
        boolean z = true;
        if (qhVar.mo15737e() && this.f118879a.f118880a != null) {
            z = false;
        }
        bhjx2.setWillNotDraw(z);
        C1280ps.m19915e(this.f118879a);
        return qhVar.mo15740g();
    }
}
