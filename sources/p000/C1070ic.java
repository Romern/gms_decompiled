package p000;

import android.transition.Transition;
import java.util.ArrayList;

/* renamed from: ic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1070ic implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ Object f20712a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f20713b;

    /* renamed from: c */
    final /* synthetic */ Object f20714c;

    /* renamed from: d */
    final /* synthetic */ ArrayList f20715d;

    /* renamed from: e */
    final /* synthetic */ Object f20716e;

    /* renamed from: f */
    final /* synthetic */ ArrayList f20717f;

    /* renamed from: g */
    final /* synthetic */ C1073if f20718g;

    public C1070ic(C1073if ifVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f20718g = ifVar;
        this.f20712a = obj;
        this.f20713b = arrayList;
        this.f20714c = obj2;
        this.f20715d = arrayList2;
        this.f20716e = obj3;
        this.f20717f = arrayList3;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
        Object obj = this.f20712a;
        if (obj != null) {
            this.f20718g.mo2404b(obj, this.f20713b, (ArrayList) null);
        }
        Object obj2 = this.f20714c;
        if (obj2 != null) {
            this.f20718g.mo2404b(obj2, this.f20715d, (ArrayList) null);
        }
        Object obj3 = this.f20716e;
        if (obj3 != null) {
            this.f20718g.mo2404b(obj3, this.f20717f, (ArrayList) null);
        }
    }
}
