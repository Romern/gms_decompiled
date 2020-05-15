package p000;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: if */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1073if extends C1078ij {
    /* renamed from: a */
    private static boolean m15340a(Transition transition) {
        return !C1078ij.m15505a(transition.getTargetIds()) || !C1078ij.m15505a(transition.getTargetNames()) || !C1078ij.m15505a(transition.getTargetTypes());
    }

    /* renamed from: b */
    public final Object mo2400b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: c */
    public final Object mo2405c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public final Object mo2390a(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: b */
    public final Object mo2401b(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj3;
        TransitionSet ordering = new TransitionSet().addTransition((Transition) obj).addTransition((Transition) obj2).setOrdering(1);
        if (transition == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition);
        return transitionSet;
    }

    /* renamed from: c */
    public final void mo2406c(Object obj, View view) {
        ((Transition) obj).removeTarget(view);
    }

    /* renamed from: a */
    public final void mo2391a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: a */
    public final void mo2392a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C1072ie(rect));
        }
    }

    /* renamed from: b */
    public final void mo2402b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: a */
    public final void mo2393a(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            C1078ij.m15503a(view, rect);
            ((Transition) obj).setEpicenterCallback(new C1068ia(rect));
        }
    }

    /* renamed from: b */
    public final void mo2403b(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C1069ib(view, arrayList));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: if.b(java.lang.Object, java.util.ArrayList, java.util.ArrayList):void
     arg types: [android.transition.Transition, java.util.ArrayList, java.util.ArrayList]
     candidates:
      if.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object
      if.b(java.lang.Object, android.view.View, java.util.ArrayList):void
      ij.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object
      ij.b(java.lang.Object, android.view.View, java.util.ArrayList):void
      if.b(java.lang.Object, java.util.ArrayList, java.util.ArrayList):void */
    /* renamed from: b */
    public final void mo2404b(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List targets;
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo2404b((Object) transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m15340a(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 != null) {
                i = arrayList2.size();
            } else {
                i = 0;
            }
            while (i2 < i) {
                transition.addTarget((View) arrayList2.get(i2));
                i2++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget((View) arrayList.get(size));
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ij.a(java.util.List, android.view.View):void
     arg types: [java.util.List<android.view.View>, android.view.View]
     candidates:
      ij.a(android.view.View, android.graphics.Rect):void
      ij.a(android.view.ViewGroup, java.lang.Object):void
      ij.a(java.lang.Object, android.graphics.Rect):void
      ij.a(java.lang.Object, android.view.View):void
      ij.a(java.lang.Object, java.util.ArrayList):void
      ij.a(java.util.ArrayList, android.view.View):void
      ij.a(java.util.Map, android.view.View):void
      ij.a(java.util.List, android.view.View):void */
    /* renamed from: a */
    public final void mo2394a(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1078ij.m15504a((List) targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo2396a(transitionSet, arrayList);
    }

    /* renamed from: a */
    public final void mo2395a(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new C1070ic(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: a */
    public final void mo2396a(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo2396a(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m15340a(transition) && C1078ij.m15505a((List) transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: if.b(java.lang.Object, java.util.ArrayList, java.util.ArrayList):void
     arg types: [android.transition.TransitionSet, java.util.ArrayList, java.util.ArrayList]
     candidates:
      if.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object
      if.b(java.lang.Object, android.view.View, java.util.ArrayList):void
      ij.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object
      ij.b(java.lang.Object, android.view.View, java.util.ArrayList):void
      if.b(java.lang.Object, java.util.ArrayList, java.util.ArrayList):void */
    /* renamed from: a */
    public final void mo2397a(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo2404b((Object) transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public final void mo2398a(Object obj, C1187mg mgVar, Runnable runnable) {
        ((Transition) obj).addListener(new C1071id(runnable));
    }

    /* renamed from: a */
    public final boolean mo2399a(Object obj) {
        return obj instanceof Transition;
    }
}
