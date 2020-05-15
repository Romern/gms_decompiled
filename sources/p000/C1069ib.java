package p000;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: ib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1069ib implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ View f20664a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f20665b;

    public C1069ib(View view, ArrayList arrayList) {
        this.f20664a = view;
        this.f20665b = arrayList;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f20664a.setVisibility(8);
        int size = this.f20665b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f20665b.get(i)).setVisibility(0);
        }
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
