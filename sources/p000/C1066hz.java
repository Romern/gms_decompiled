package p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: hz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1066hz {

    /* renamed from: a */
    public static final C1078ij f20575a = new C1073if();

    /* renamed from: b */
    public static final C1078ij f20576b;

    /* renamed from: c */
    private static final int[] f20577c = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    static {
        C1078ij ijVar;
        int i = Build.VERSION.SDK_INT;
        try {
            ijVar = (C1078ij) Class.forName("asr").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            ijVar = null;
        }
        f20576b = ijVar;
    }

    /* renamed from: a */
    static View m15052a(C1223np npVar, C1065hy hyVar, Object obj, boolean z) {
        ArrayList arrayList;
        C1002ft ftVar = hyVar.f20538c;
        if (obj == null || npVar == null || (arrayList = ftVar.f20283q) == null || arrayList.isEmpty()) {
            return null;
        }
        return (View) npVar.get(!z ? (String) ftVar.f20284r.get(0) : (String) ftVar.f20283q.get(0));
    }

    /* renamed from: b */
    private static Object m15066b(C1078ij ijVar, C1018gh ghVar, boolean z) {
        if (ghVar == null) {
            return null;
        }
        return ijVar.mo2400b(!z ? ghVar.getExitTransition() : ghVar.getReturnTransition());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ij.a(java.util.Map, android.view.View):void
     arg types: [np, android.view.View]
     candidates:
      ij.a(android.view.View, android.graphics.Rect):void
      ij.a(java.util.List, android.view.View):void
      ij.a(android.view.ViewGroup, java.lang.Object):void
      ij.a(java.lang.Object, android.graphics.Rect):void
      ij.a(java.lang.Object, android.view.View):void
      ij.a(java.lang.Object, java.util.ArrayList):void
      ij.a(java.util.ArrayList, android.view.View):void
      ij.a(java.util.Map, android.view.View):void */
    /* renamed from: b */
    private static C1223np m15067b(C1078ij ijVar, C1223np npVar, Object obj, C1065hy hyVar) {
        ArrayList arrayList;
        if (!npVar.isEmpty() && obj != null) {
            C1018gh ghVar = hyVar.f20539d;
            C1223np npVar2 = new C1223np();
            ijVar.mo13057a((Map) npVar2, ghVar.requireView());
            C1002ft ftVar = hyVar.f20541f;
            if (hyVar.f20540e) {
                ghVar.mo11843h();
                arrayList = ftVar.f20284r;
            } else {
                ghVar.mo11846i();
                arrayList = ftVar.f20283q;
            }
            if (arrayList != null) {
                C1238od.m19745b(npVar2, arrayList);
            }
            C1238od.m19745b(npVar, npVar2.keySet());
            return npVar2;
        }
        npVar.clear();
        return null;
    }

    /* renamed from: a */
    private static C1065hy m15053a(C1065hy hyVar, SparseArray sparseArray, int i) {
        if (hyVar != null) {
            return hyVar;
        }
        C1065hy hyVar2 = new C1065hy();
        sparseArray.put(i, hyVar2);
        return hyVar2;
    }

    /* renamed from: a */
    private static C1078ij m15054a(C1018gh ghVar, C1018gh ghVar2) {
        ArrayList arrayList = new ArrayList();
        if (ghVar != null) {
            Object exitTransition = ghVar.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = ghVar.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = ghVar.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (ghVar2 != null) {
            Object enterTransition = ghVar2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = ghVar2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = ghVar2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C1078ij ijVar = f20575a;
        if (ijVar != null && m15065a(ijVar, arrayList)) {
            return f20575a;
        }
        C1078ij ijVar2 = f20576b;
        if (ijVar2 != null && m15065a(ijVar2, arrayList)) {
            return f20576b;
        }
        if (f20575a == null && f20576b == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: a */
    private static Object m15055a(C1078ij ijVar, C1018gh ghVar, C1018gh ghVar2, boolean z) {
        return ijVar.mo2405c(ijVar.mo2400b(!z ? ghVar.getSharedElementEnterTransition() : ghVar2.getSharedElementReturnTransition()));
    }

    /* renamed from: a */
    private static Object m15056a(C1078ij ijVar, C1018gh ghVar, boolean z) {
        if (ghVar == null) {
            return null;
        }
        return ijVar.mo2400b(!z ? ghVar.getEnterTransition() : ghVar.getReenterTransition());
    }

    /* renamed from: a */
    private static Object m15057a(C1078ij ijVar, Object obj, Object obj2, Object obj3, C1018gh ghVar, boolean z) {
        if (!(obj == null || obj2 == null || ghVar == null)) {
            if (!(!z ? ghVar.getAllowEnterTransitionOverlap() : ghVar.getAllowReturnTransitionOverlap())) {
                return ijVar.mo2401b(obj2, obj, obj3);
            }
        }
        return ijVar.mo2390a(obj2, obj, obj3);
    }

    /* renamed from: a */
    static ArrayList m15058a(C1078ij ijVar, Object obj, C1018gh ghVar, ArrayList arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        View view2 = ghVar.getView();
        if (view2 != null) {
            ijVar.mo13056a(arrayList2, view2);
        }
        arrayList2.removeAll(arrayList);
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        ijVar.mo2396a(obj, arrayList2);
        return arrayList2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ij.a(java.util.Map, android.view.View):void
     arg types: [np, android.view.View]
     candidates:
      ij.a(android.view.View, android.graphics.Rect):void
      ij.a(java.util.List, android.view.View):void
      ij.a(android.view.ViewGroup, java.lang.Object):void
      ij.a(java.lang.Object, android.graphics.Rect):void
      ij.a(java.lang.Object, android.view.View):void
      ij.a(java.lang.Object, java.util.ArrayList):void
      ij.a(java.util.ArrayList, android.view.View):void
      ij.a(java.util.Map, android.view.View):void */
    /* renamed from: a */
    static C1223np m15059a(C1078ij ijVar, C1223np npVar, Object obj, C1065hy hyVar) {
        ArrayList arrayList;
        C1018gh ghVar = hyVar.f20536a;
        View view = ghVar.getView();
        if (npVar.isEmpty() || obj == null || view == null) {
            npVar.clear();
            return null;
        }
        C1223np npVar2 = new C1223np();
        ijVar.mo13057a((Map) npVar2, view);
        C1002ft ftVar = hyVar.f20538c;
        if (hyVar.f20537b) {
            ghVar.mo11846i();
            arrayList = ftVar.f20283q;
        } else {
            ghVar.mo11843h();
            arrayList = ftVar.f20284r;
        }
        if (arrayList != null) {
            C1238od.m19745b(npVar2, arrayList);
            C1238od.m19745b(npVar2, npVar.values());
        }
        for (int i = npVar.f26809h - 1; i >= 0; i--) {
            if (!npVar2.containsKey((String) npVar.mo15621c(i))) {
                npVar.mo8152d(i);
            }
        }
        return npVar2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: hz.a(ft, hq, android.util.SparseArray, boolean, boolean):void
     arg types: [ft, hq, android.util.SparseArray, int, boolean]
     candidates:
      hz.a(ij, java.lang.Object, gh, java.util.ArrayList, android.view.View):java.util.ArrayList
      hz.a(ft, hq, android.util.SparseArray, boolean, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ij.a(java.lang.Object, mg, java.lang.Runnable):void
     arg types: [java.lang.Object, mg, hs]
     candidates:
      ij.a(java.util.List, android.view.View, int):boolean
      ij.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object
      ij.a(java.lang.Object, android.view.View, java.util.ArrayList):void
      ij.a(java.lang.Object, java.util.ArrayList, java.util.ArrayList):void
      ij.a(java.lang.Object, mg, java.lang.Runnable):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ij.a(java.lang.Object, mg, java.lang.Runnable):void
     arg types: [java.lang.Object, mg, hu]
     candidates:
      ij.a(java.util.List, android.view.View, int):boolean
      ij.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object
      ij.a(java.lang.Object, android.view.View, java.util.ArrayList):void
      ij.a(java.lang.Object, java.util.ArrayList, java.util.ArrayList):void
      ij.a(java.lang.Object, mg, java.lang.Runnable):void */
    /* renamed from: a */
    static void m15060a(Context context, C1030gr grVar, ArrayList arrayList, ArrayList arrayList2, int i, int i2, boolean z, C1038gz gzVar) {
        int i3;
        int i4;
        int i5;
        SparseArray sparseArray;
        C1038gz gzVar2;
        C1223np npVar;
        ArrayList arrayList3;
        C1018gh ghVar;
        ArrayList arrayList4;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z2;
        Object obj6;
        Rect rect;
        int i6;
        boolean z3;
        C1223np npVar2;
        Object obj7;
        C1223np npVar3;
        Object obj8;
        Rect rect2;
        View view;
        int i7;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7 = arrayList;
        ArrayList arrayList8 = arrayList2;
        int i8 = i2;
        boolean z4 = z;
        C1038gz gzVar3 = gzVar;
        SparseArray sparseArray2 = new SparseArray();
        int i9 = i;
        while (true) {
            i3 = 0;
            if (i9 >= i8) {
                break;
            }
            C1002ft ftVar = (C1002ft) arrayList7.get(i9);
            if (!((Boolean) arrayList8.get(i9)).booleanValue()) {
                int size = ftVar.f20270d.size();
                for (int i10 = 0; i10 < size; i10++) {
                    m15061a(ftVar, (C1057hq) ftVar.f20270d.get(i10), sparseArray2, false, z4);
                }
            } else if (ftVar.f17209a.f19861l.mo11665a()) {
                for (int size2 = ftVar.f20270d.size() - 1; size2 >= 0; size2--) {
                    m15061a(ftVar, (C1057hq) ftVar.f20270d.get(size2), sparseArray2, true, z4);
                }
            }
            i9++;
        }
        if (sparseArray2.size() != 0) {
            View view2 = new View(context);
            int size3 = sparseArray2.size();
            int i11 = 0;
            while (i11 < size3) {
                int keyAt = sparseArray2.keyAt(i11);
                C1223np npVar4 = new C1223np();
                int i12 = i8 - 1;
                while (i12 >= i) {
                    C1002ft ftVar2 = (C1002ft) arrayList7.get(i12);
                    int size4 = ftVar2.f20270d.size();
                    while (true) {
                        if (i3 >= size4) {
                            break;
                        }
                        C1018gh ghVar2 = ((C1057hq) ftVar2.f20270d.get(i3)).f20206b;
                        if (ghVar2 != null) {
                            i7 = ghVar2.f18164A;
                        } else {
                            i7 = 0;
                        }
                        if (i7 != 0 && i7 == keyAt) {
                            boolean booleanValue = ((Boolean) arrayList8.get(i12)).booleanValue();
                            ArrayList arrayList9 = ftVar2.f20283q;
                            if (arrayList9 != null) {
                                int size5 = arrayList9.size();
                                if (booleanValue) {
                                    arrayList6 = ftVar2.f20283q;
                                    arrayList5 = ftVar2.f20284r;
                                } else {
                                    arrayList5 = ftVar2.f20283q;
                                    arrayList6 = ftVar2.f20284r;
                                }
                                int i13 = 0;
                                while (i13 < size5) {
                                    String str = (String) arrayList5.get(i13);
                                    ArrayList arrayList10 = arrayList6;
                                    String str2 = (String) arrayList6.get(i13);
                                    String str3 = (String) npVar4.remove(str2);
                                    if (str3 != null) {
                                        npVar4.put(str, str3);
                                    } else {
                                        npVar4.put(str, str2);
                                    }
                                    i13++;
                                    arrayList6 = arrayList10;
                                }
                            }
                        } else {
                            i3++;
                            arrayList8 = arrayList2;
                        }
                    }
                    i12--;
                    arrayList7 = arrayList;
                    arrayList8 = arrayList2;
                    i3 = 0;
                }
                C1065hy hyVar = (C1065hy) sparseArray2.valueAt(i11);
                if (grVar.mo11665a()) {
                    ViewGroup viewGroup = (ViewGroup) grVar.mo11664a(keyAt);
                    if (viewGroup == null) {
                        gzVar2 = gzVar3;
                        sparseArray = sparseArray2;
                        i4 = i11;
                        i5 = size3;
                    } else if (z4) {
                        C1018gh ghVar3 = hyVar.f20536a;
                        C1018gh ghVar4 = hyVar.f20539d;
                        C1078ij a = m15054a(ghVar4, ghVar3);
                        if (a != null) {
                            boolean z5 = hyVar.f20537b;
                            boolean z6 = hyVar.f20540e;
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = new ArrayList();
                            sparseArray = sparseArray2;
                            Object a2 = m15056a(a, ghVar3, z5);
                            Object b = m15066b(a, ghVar4, z6);
                            C1018gh ghVar5 = hyVar.f20536a;
                            int i14 = i11;
                            C1018gh ghVar6 = hyVar.f20539d;
                            if (ghVar5 != null) {
                                i6 = size3;
                                ghVar5.requireView().setVisibility(0);
                            } else {
                                i6 = size3;
                            }
                            if (ghVar5 == null) {
                                z3 = z5;
                                npVar2 = npVar4;
                                obj7 = null;
                            } else if (ghVar6 != null) {
                                boolean z7 = hyVar.f20537b;
                                if (!npVar4.isEmpty()) {
                                    obj8 = m15055a(a, ghVar5, ghVar6, z7);
                                } else {
                                    obj8 = null;
                                }
                                C1223np b2 = m15067b(a, npVar4, obj8, hyVar);
                                C1223np a3 = m15059a(a, npVar4, obj8, hyVar);
                                if (!npVar4.isEmpty()) {
                                    m15064a(arrayList12, b2, npVar4.keySet());
                                    m15064a(arrayList11, a3, npVar4.values());
                                    obj7 = obj8;
                                } else {
                                    if (b2 != null) {
                                        b2.clear();
                                    }
                                    if (a3 != null) {
                                        a3.clear();
                                    }
                                    obj7 = null;
                                }
                                if (a2 == null && b == null && obj7 == null) {
                                    z3 = z5;
                                    npVar2 = npVar4;
                                    obj7 = null;
                                } else {
                                    if (obj7 != null) {
                                        arrayList11.add(view2);
                                        a.mo2394a(obj7, view2, arrayList12);
                                        npVar2 = npVar4;
                                        z3 = z5;
                                        m15062a(a, obj7, b, b2, hyVar.f20540e, hyVar.f20541f);
                                        rect2 = new Rect();
                                        view = m15052a(a3, hyVar, a2, z7);
                                        if (view != null) {
                                            a.mo2392a(a2, rect2);
                                        }
                                    } else {
                                        z3 = z5;
                                        npVar2 = npVar4;
                                        view = null;
                                        rect2 = null;
                                    }
                                    C1271pj.m19857a(viewGroup, new C1063hw(view, rect2));
                                }
                            } else {
                                z3 = z5;
                                npVar2 = npVar4;
                                obj7 = null;
                            }
                            if (a2 == null && obj7 == null && b == null) {
                                gzVar2 = gzVar;
                                i4 = i14;
                                i5 = i6;
                            } else {
                                ArrayList a4 = m15058a(a, b, ghVar4, arrayList12, view2);
                                ArrayList a5 = m15058a(a, a2, ghVar3, arrayList11, view2);
                                m15063a(a5, 4);
                                Object a6 = m15057a(a, a2, b, obj7, ghVar3, z3);
                                if (ghVar4 != null && a4 != null) {
                                    if (a4.size() > 0 || arrayList12.size() > 0) {
                                        C1187mg mgVar = new C1187mg();
                                        gzVar.mo12338a(ghVar4, mgVar);
                                        a.mo2398a(a6, mgVar, (Runnable) new C1059hs(gzVar, ghVar4, mgVar));
                                    }
                                }
                                if (a6 != null) {
                                    if (ghVar4 != null) {
                                        if (b != null && ghVar4.f18198o && ghVar4.f18166C && ghVar4.f18179P) {
                                            ghVar4.mo11814a(true);
                                            a.mo2403b(b, ghVar4.getView(), a4);
                                            C1271pj.m19857a(ghVar4.f18173J, new C1060ht(a4));
                                        }
                                    }
                                    ArrayList arrayList13 = new ArrayList();
                                    int i15 = 0;
                                    for (int size6 = arrayList11.size(); i15 < size6; size6 = size6) {
                                        View view3 = (View) arrayList11.get(i15);
                                        arrayList13.add(C1280ps.m19935q(view3));
                                        C1280ps.m19893a(view3, (String) null);
                                        i15++;
                                    }
                                    a.mo2395a(a6, a2, a5, b, a4, obj7, arrayList11);
                                    a.mo2391a(viewGroup, a6);
                                    int size7 = arrayList11.size();
                                    ArrayList arrayList14 = new ArrayList();
                                    int i16 = 0;
                                    while (i16 < size7) {
                                        View view4 = (View) arrayList12.get(i16);
                                        String q = C1280ps.m19935q(view4);
                                        arrayList14.add(q);
                                        if (q != null) {
                                            C1280ps.m19893a(view4, (String) null);
                                            npVar3 = npVar2;
                                            String str4 = (String) npVar3.get(q);
                                            int i17 = 0;
                                            while (true) {
                                                if (i17 < size7) {
                                                    if (str4.equals(arrayList13.get(i17))) {
                                                        C1280ps.m19893a((View) arrayList11.get(i17), q);
                                                        break;
                                                    }
                                                    i17++;
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            npVar3 = npVar2;
                                        }
                                        i16++;
                                        npVar2 = npVar3;
                                    }
                                    C1271pj.m19857a(viewGroup, new C1074ig(size7, arrayList11, arrayList13, arrayList12, arrayList14));
                                    m15063a(a5, 0);
                                    a.mo2397a(obj7, arrayList12, arrayList11);
                                    gzVar2 = gzVar;
                                    i4 = i14;
                                    i5 = i6;
                                } else {
                                    gzVar2 = gzVar;
                                    i4 = i14;
                                    i5 = i6;
                                }
                            }
                        } else {
                            sparseArray = sparseArray2;
                            gzVar2 = gzVar;
                            i4 = i11;
                            i5 = size3;
                        }
                    } else {
                        sparseArray = sparseArray2;
                        C1223np npVar5 = npVar4;
                        int i18 = i11;
                        int i19 = size3;
                        C1018gh ghVar7 = hyVar.f20536a;
                        C1018gh ghVar8 = hyVar.f20539d;
                        C1078ij a7 = m15054a(ghVar8, ghVar7);
                        if (a7 != null) {
                            boolean z8 = hyVar.f20537b;
                            boolean z9 = hyVar.f20540e;
                            Object a8 = m15056a(a7, ghVar7, z8);
                            Object b3 = m15066b(a7, ghVar8, z9);
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            C1018gh ghVar9 = hyVar.f20536a;
                            C1018gh ghVar10 = hyVar.f20539d;
                            if (ghVar9 == null) {
                                ghVar = ghVar7;
                                npVar = npVar5;
                                arrayList3 = arrayList16;
                                arrayList4 = arrayList15;
                                obj2 = b3;
                                i4 = i18;
                                i5 = i19;
                                obj3 = null;
                                obj = null;
                                gzVar2 = gzVar;
                            } else if (ghVar10 != null) {
                                boolean z10 = hyVar.f20537b;
                                if (!npVar5.isEmpty()) {
                                    obj5 = m15055a(a7, ghVar9, ghVar10, z10);
                                } else {
                                    obj5 = null;
                                }
                                C1223np b4 = m15067b(a7, npVar5, obj5, hyVar);
                                if (!npVar5.isEmpty()) {
                                    arrayList15.addAll(b4.values());
                                } else {
                                    obj5 = null;
                                }
                                if (a8 == null && b3 == null && obj5 == null) {
                                    ghVar = ghVar7;
                                    npVar = npVar5;
                                    arrayList3 = arrayList16;
                                    arrayList4 = arrayList15;
                                    obj2 = b3;
                                    i4 = i18;
                                    i5 = i19;
                                    obj3 = null;
                                    obj = null;
                                    gzVar2 = gzVar;
                                } else {
                                    if (obj5 != null) {
                                        Rect rect3 = new Rect();
                                        a7.mo2394a(obj5, view2, arrayList15);
                                        ghVar = ghVar7;
                                        Rect rect4 = rect3;
                                        obj6 = obj5;
                                        z2 = z10;
                                        arrayList3 = arrayList16;
                                        arrayList4 = arrayList15;
                                        m15062a(a7, obj5, b3, b4, hyVar.f20540e, hyVar.f20541f);
                                        if (a8 != null) {
                                            a7.mo2392a(a8, rect4);
                                        }
                                        rect = rect4;
                                    } else {
                                        ghVar = ghVar7;
                                        obj6 = obj5;
                                        z2 = z10;
                                        arrayList3 = arrayList16;
                                        arrayList4 = arrayList15;
                                        rect = null;
                                    }
                                    obj = null;
                                    npVar = npVar5;
                                    i4 = i18;
                                    obj2 = b3;
                                    i5 = i19;
                                    gzVar2 = gzVar;
                                    C1271pj.m19857a(viewGroup, new C1064hx(a7, npVar5, obj6, hyVar, arrayList3, view2, z2, arrayList4, a8, rect));
                                    obj3 = obj6;
                                }
                            } else {
                                ghVar = ghVar7;
                                npVar = npVar5;
                                arrayList3 = arrayList16;
                                arrayList4 = arrayList15;
                                obj2 = b3;
                                i4 = i18;
                                i5 = i19;
                                obj = null;
                                gzVar2 = gzVar;
                                obj3 = null;
                            }
                            if (a8 != null || obj3 != null || obj2 != null) {
                                ArrayList arrayList17 = arrayList4;
                                ArrayList a9 = m15058a(a7, obj2, ghVar8, arrayList17, view2);
                                if (a9 != null) {
                                    obj4 = a9.isEmpty() ? obj : obj2;
                                } else {
                                    obj4 = obj;
                                }
                                a7.mo2402b(a8, view2);
                                Object a10 = m15057a(a7, a8, obj4, obj3, ghVar, hyVar.f20537b);
                                if (!(ghVar8 == null || a9 == null || (a9.size() <= 0 && arrayList17.size() <= 0))) {
                                    C1187mg mgVar2 = new C1187mg();
                                    gzVar2.mo12338a(ghVar8, mgVar2);
                                    a7.mo2398a(a10, mgVar2, (Runnable) new C1061hu(gzVar2, ghVar8, mgVar2));
                                }
                                if (a10 != null) {
                                    ArrayList arrayList18 = new ArrayList();
                                    a7.mo2395a(a10, a8, arrayList18, obj4, a9, obj3, arrayList3);
                                    C1271pj.m19857a(viewGroup, new C1062hv(a8, a7, view2, ghVar, arrayList3, arrayList18, a9, obj4));
                                    C1271pj.m19857a(viewGroup, new C1075ih(arrayList3, npVar));
                                    a7.mo2391a(viewGroup, a10);
                                    C1271pj.m19857a(viewGroup, new C1076ii(arrayList3, npVar));
                                }
                            }
                        } else {
                            gzVar2 = gzVar;
                            i4 = i18;
                            i5 = i19;
                        }
                    }
                } else {
                    gzVar2 = gzVar3;
                    sparseArray = sparseArray2;
                    i4 = i11;
                    i5 = size3;
                }
                i11 = i4 + 1;
                arrayList7 = arrayList;
                arrayList8 = arrayList2;
                i8 = i2;
                z4 = z;
                gzVar3 = gzVar2;
                sparseArray2 = sparseArray;
                size3 = i5;
                i3 = 0;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        if (r0.f18198o != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005e, code lost:
        if (r0.f18166C == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0060, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x008a, code lost:
        if (r0.f18166C == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x008c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00db A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    private static void m15061a(C1002ft ftVar, C1057hq hqVar, SparseArray sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        C1065hy hyVar;
        boolean z5;
        View view;
        C1018gh ghVar = hqVar.f20206b;
        if (ghVar != null && (i = ghVar.f18164A) != 0) {
            int i2 = z ? f20577c[hqVar.f20205a] : hqVar.f20205a;
            boolean z6 = true;
            boolean z7 = false;
            if (i2 != 1) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (i2 != 7) {
                                    z3 = false;
                                    z6 = false;
                                    z4 = false;
                                    hyVar = (C1065hy) sparseArray.get(i);
                                    if (z3) {
                                        hyVar = m15053a(hyVar, sparseArray, i);
                                        hyVar.f20536a = ghVar;
                                        hyVar.f20537b = z;
                                        hyVar.f20538c = ftVar;
                                    }
                                    if (!z2 && z6) {
                                        if (hyVar != null && hyVar.f20539d == ghVar) {
                                            hyVar.f20539d = null;
                                        }
                                        if (!ftVar.f20285s) {
                                            C1050hj hjVar = ftVar.f17209a;
                                            hjVar.f19850a.mo12663a(hjVar.mo12551e(ghVar));
                                            hjVar.mo12546c(ghVar);
                                        }
                                    }
                                    if (z4 && (hyVar == null || hyVar.f20539d == null)) {
                                        hyVar = m15053a(hyVar, sparseArray, i);
                                        hyVar.f20539d = ghVar;
                                        hyVar.f20540e = z;
                                        hyVar.f20541f = ftVar;
                                    }
                                    if (z2 && z7 && hyVar != null && hyVar.f20536a == ghVar) {
                                        hyVar.f20536a = null;
                                        return;
                                    }
                                    return;
                                }
                            }
                        } else if (!z2) {
                            z3 = ghVar.f18166C;
                            z4 = false;
                            hyVar = (C1065hy) sparseArray.get(i);
                            if (z3) {
                            }
                            hyVar.f20539d = null;
                            if (!ftVar.f20285s) {
                            }
                            hyVar = m15053a(hyVar, sparseArray, i);
                            hyVar.f20539d = ghVar;
                            hyVar.f20540e = z;
                            hyVar.f20541f = ftVar;
                            if (z2) {
                                return;
                            }
                            return;
                        } else {
                            if (ghVar.f18179P) {
                                if (!ghVar.f18166C) {
                                }
                            }
                            z3 = false;
                            z4 = false;
                            hyVar = (C1065hy) sparseArray.get(i);
                            if (z3) {
                            }
                            hyVar.f20539d = null;
                            if (!ftVar.f20285s) {
                            }
                            hyVar = m15053a(hyVar, sparseArray, i);
                            hyVar.f20539d = ghVar;
                            hyVar.f20540e = z;
                            hyVar.f20541f = ftVar;
                            if (z2) {
                            }
                        }
                    } else if (z2) {
                        z5 = false;
                        z4 = z5;
                        z3 = false;
                        z6 = false;
                        z7 = true;
                        hyVar = (C1065hy) sparseArray.get(i);
                        if (z3) {
                        }
                        hyVar.f20539d = null;
                        if (!ftVar.f20285s) {
                        }
                        hyVar = m15053a(hyVar, sparseArray, i);
                        hyVar.f20539d = ghVar;
                        hyVar.f20540e = z;
                        hyVar.f20541f = ftVar;
                        if (z2) {
                        }
                    } else {
                        z5 = false;
                        z4 = z5;
                        z3 = false;
                        z6 = false;
                        z7 = true;
                        hyVar = (C1065hy) sparseArray.get(i);
                        if (z3) {
                        }
                        hyVar.f20539d = null;
                        if (!ftVar.f20285s) {
                        }
                        hyVar = m15053a(hyVar, sparseArray, i);
                        hyVar.f20539d = ghVar;
                        hyVar.f20540e = z;
                        hyVar.f20541f = ftVar;
                        if (z2) {
                        }
                    }
                }
                boolean z8 = ghVar.f18198o;
                if (!z2) {
                    if (z8) {
                    }
                    z5 = false;
                    z4 = z5;
                    z3 = false;
                    z6 = false;
                    z7 = true;
                    hyVar = (C1065hy) sparseArray.get(i);
                    if (z3) {
                    }
                    hyVar.f20539d = null;
                    if (!ftVar.f20285s) {
                    }
                    hyVar = m15053a(hyVar, sparseArray, i);
                    hyVar.f20539d = ghVar;
                    hyVar.f20540e = z;
                    hyVar.f20541f = ftVar;
                    if (z2) {
                    }
                } else {
                    z5 = !z8 && (view = ghVar.f18174K) != null && view.getVisibility() == 0 && ghVar.f18180Q >= 0.0f;
                    z4 = z5;
                    z3 = false;
                    z6 = false;
                    z7 = true;
                    hyVar = (C1065hy) sparseArray.get(i);
                    if (z3) {
                    }
                    hyVar.f20539d = null;
                    if (!ftVar.f20285s) {
                    }
                    hyVar = m15053a(hyVar, sparseArray, i);
                    hyVar.f20539d = ghVar;
                    hyVar.f20540e = z;
                    hyVar.f20541f = ftVar;
                    if (z2) {
                    }
                }
            }
            if (z2) {
                z3 = ghVar.f18178O;
                z4 = false;
                hyVar = (C1065hy) sparseArray.get(i);
                if (z3) {
                }
                hyVar.f20539d = null;
                if (!ftVar.f20285s) {
                }
                hyVar = m15053a(hyVar, sparseArray, i);
                hyVar.f20539d = ghVar;
                hyVar.f20540e = z;
                hyVar.f20541f = ftVar;
                if (z2) {
                }
            } else {
                if (!ghVar.f18198o) {
                }
                z3 = false;
                z4 = false;
                hyVar = (C1065hy) sparseArray.get(i);
                if (z3) {
                }
                hyVar.f20539d = null;
                if (!ftVar.f20285s) {
                }
                hyVar = m15053a(hyVar, sparseArray, i);
                hyVar.f20539d = ghVar;
                hyVar.f20540e = z;
                hyVar.f20541f = ftVar;
                if (z2) {
                }
            }
        }
    }

    /* renamed from: a */
    private static void m15062a(C1078ij ijVar, Object obj, Object obj2, C1223np npVar, boolean z, C1002ft ftVar) {
        ArrayList arrayList = ftVar.f20283q;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = (View) npVar.get(!z ? (String) ftVar.f20283q.get(0) : (String) ftVar.f20284r.get(0));
            ijVar.mo2393a(obj, view);
            if (obj2 != null) {
                ijVar.mo2393a(obj2, view);
            }
        }
    }

    /* renamed from: a */
    static void m15063a(ArrayList arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static void m15064a(ArrayList arrayList, C1223np npVar, Collection collection) {
        for (int i = npVar.f26809h - 1; i >= 0; i--) {
            View view = (View) npVar.mo15621c(i);
            if (collection.contains(C1280ps.m19935q(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: a */
    private static boolean m15065a(C1078ij ijVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!ijVar.mo2399a(list.get(i))) {
                return false;
            }
        }
        return true;
    }
}
