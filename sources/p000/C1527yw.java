package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: yw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1527yw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f27685a;

    /* renamed from: b */
    final /* synthetic */ C1538zg f27686b;

    public C1527yw(C1538zg zgVar, ArrayList arrayList) {
        this.f27686b = zgVar;
        this.f27685a = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.f27685a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1537zf zfVar = (C1537zf) arrayList.get(i);
            C1538zg zgVar = this.f27686b;
            acm acm = zfVar.f27719a;
            int i2 = zfVar.f27720b;
            int i3 = zfVar.f27721c;
            int i4 = zfVar.f27722d;
            int i5 = zfVar.f27723e;
            View view = acm.f201a;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (i6 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i7 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            zgVar.f27729e.add(acm);
            animate.setDuration(250).setListener(new C1533zb(zgVar, acm, i6, view, i7, animate)).start();
        }
        this.f27685a.clear();
        this.f27686b.f27726b.remove(this.f27685a);
    }
}
