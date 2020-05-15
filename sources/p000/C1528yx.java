package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* renamed from: yx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1528yx implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ArrayList f27687a;

    /* renamed from: b */
    final /* synthetic */ C1538zg f27688b;

    public C1528yx(C1538zg zgVar, ArrayList arrayList) {
        this.f27688b = zgVar;
        this.f27687a = arrayList;
    }

    public final void run() {
        View view;
        ArrayList arrayList = this.f27687a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1536ze zeVar = (C1536ze) arrayList.get(i);
            C1538zg zgVar = this.f27688b;
            acm acm = zeVar.f27713a;
            View view2 = null;
            if (acm != null) {
                view = acm.f201a;
            } else {
                view = null;
            }
            acm acm2 = zeVar.f27714b;
            if (acm2 != null) {
                view2 = acm2.f201a;
            }
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(250);
                zgVar.f27731g.add(zeVar.f27713a);
                duration.translationX((float) (zeVar.f27717e - zeVar.f27715c));
                duration.translationY((float) (zeVar.f27718f - zeVar.f27716d));
                duration.alpha(0.0f).setListener(new C1534zc(zgVar, zeVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                zgVar.f27731g.add(zeVar.f27714b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(250).alpha(1.0f).setListener(new C1535zd(zgVar, zeVar, animate, view2)).start();
            }
        }
        this.f27687a.clear();
        this.f27688b.f27727c.remove(this.f27687a);
    }
}
