package p000;

import android.os.Build;
import android.view.View;

/* renamed from: ezk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ezk extends C1251oq {

    /* renamed from: b */
    final /* synthetic */ String f16092b;

    /* renamed from: c */
    final /* synthetic */ ezm f16093c;

    public ezk(ezm ezm, String str) {
        this.f16093c = ezm;
        this.f16092b = str;
    }

    /* renamed from: a */
    public final void mo345a(View view, C1301qm qmVar) {
        super.mo345a(view, qmVar);
        View view2 = this.f16093c.f16102c;
        int i = Build.VERSION.SDK_INT;
        qmVar.f26877a.setTraversalBefore(view2);
        if (!stm.m36302d(this.f16092b)) {
            qmVar.mo15757a(new C1298qj(C1298qj.f26862c.mo15748a(), this.f16092b));
        }
    }
}
