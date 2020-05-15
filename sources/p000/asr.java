package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: asr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asr extends C1078ij {
    /* renamed from: a */
    private static boolean m1957a(atf atf) {
        return !C1078ij.m15505a(atf.f2176d) || !C1078ij.m15505a(null) || !C1078ij.m15505a(atf.f2178f);
    }

    /* renamed from: b */
    public final Object mo2400b(Object obj) {
        if (obj != null) {
            return ((atf) obj).clone();
        }
        return null;
    }

    /* renamed from: c */
    public final Object mo2405c(Object obj) {
        if (obj == null) {
            return null;
        }
        atn atn = new atn();
        atn.mo2491a((atf) obj);
        return atn;
    }

    /* renamed from: a */
    public final Object mo2390a(Object obj, Object obj2, Object obj3) {
        atn atn = new atn();
        if (obj != null) {
            atn.mo2491a((atf) obj);
        }
        if (obj2 != null) {
            atn.mo2491a((atf) obj2);
        }
        if (obj3 != null) {
            atn.mo2491a((atf) obj3);
        }
        return atn;
    }

    /* renamed from: b */
    public final Object mo2401b(Object obj, Object obj2, Object obj3) {
        atf atf = (atf) obj3;
        atn atn = new atn();
        atn.mo2491a((atf) obj);
        atn.mo2491a((atf) obj2);
        atn.mo2493b(1);
        if (atf == null) {
            return atn;
        }
        atn atn2 = new atn();
        atn2.mo2491a(atn);
        atn2.mo2491a(atf);
        return atn2;
    }

    /* renamed from: c */
    public final void mo2406c(Object obj, View view) {
        ((atf) obj).mo2480e(view);
    }

    /* renamed from: a */
    public final void mo2391a(ViewGroup viewGroup, Object obj) {
        atj.m2053a(viewGroup, (atf) obj);
    }

    /* renamed from: a */
    public final void mo2392a(Object obj, Rect rect) {
        if (obj != null) {
            ((atf) obj).mo2462a(new asq(rect));
        }
    }

    /* renamed from: b */
    public final void mo2402b(Object obj, View view) {
        if (obj != null) {
            ((atf) obj).mo2478d(view);
        }
    }

    /* renamed from: a */
    public final void mo2393a(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            C1078ij.m15503a(view, rect);
            ((atf) obj).mo2462a(new asl(rect));
        }
    }

    /* renamed from: b */
    public final void mo2403b(Object obj, View view, ArrayList arrayList) {
        ((atf) obj).mo2463a(new asm(view, arrayList));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asr.b(java.lang.Object, java.util.ArrayList, java.util.ArrayList):void
     arg types: [atf, java.util.ArrayList, java.util.ArrayList]
     candidates:
      asr.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object
      asr.b(java.lang.Object, android.view.View, java.util.ArrayList):void
      ij.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object
      ij.b(java.lang.Object, android.view.View, java.util.ArrayList):void
      asr.b(java.lang.Object, java.util.ArrayList, java.util.ArrayList):void */
    /* renamed from: b */
    public final void mo2404b(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        atf atf = (atf) obj;
        int i2 = 0;
        if (atf instanceof atn) {
            atn atn = (atn) atf;
            int b = atn.mo2492b();
            while (i2 < b) {
                mo2404b((Object) atn.mo2490a(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m1957a(atf)) {
            ArrayList arrayList3 = atf.f2177e;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 != null) {
                    i = arrayList2.size();
                } else {
                    i = 0;
                }
                while (i2 < i) {
                    atf.mo2478d((View) arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    atf.mo2480e((View) arrayList.get(size));
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ij.a(java.util.List, android.view.View):void
     arg types: [java.util.ArrayList, android.view.View]
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
        atn atn = (atn) obj;
        ArrayList arrayList2 = atn.f2177e;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1078ij.m15504a((List) arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo2396a(atn, arrayList);
    }

    /* renamed from: a */
    public final void mo2395a(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((atf) obj).mo2463a(new asn(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: a */
    public final void mo2396a(Object obj, ArrayList arrayList) {
        atf atf = (atf) obj;
        if (atf != null) {
            int i = 0;
            if (atf instanceof atn) {
                atn atn = (atn) atf;
                int b = atn.mo2492b();
                while (i < b) {
                    mo2396a(atn.mo2490a(i), arrayList);
                    i++;
                }
            } else if (!m1957a(atf) && C1078ij.m15505a((List) atf.f2177e)) {
                int size = arrayList.size();
                while (i < size) {
                    atf.mo2478d((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asr.b(java.lang.Object, java.util.ArrayList, java.util.ArrayList):void
     arg types: [atn, java.util.ArrayList, java.util.ArrayList]
     candidates:
      asr.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object
      asr.b(java.lang.Object, android.view.View, java.util.ArrayList):void
      ij.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object
      ij.b(java.lang.Object, android.view.View, java.util.ArrayList):void
      asr.b(java.lang.Object, java.util.ArrayList, java.util.ArrayList):void */
    /* renamed from: a */
    public final void mo2397a(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        atn atn = (atn) obj;
        if (atn != null) {
            atn.f2177e.clear();
            atn.f2177e.addAll(arrayList2);
            mo2404b((Object) atn, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public final void mo2398a(Object obj, C1187mg mgVar, Runnable runnable) {
        atf atf = (atf) obj;
        mgVar.mo15459a(new aso(atf));
        atf.mo2463a(new asp(runnable));
    }

    /* renamed from: a */
    public final boolean mo2399a(Object obj) {
        return obj instanceof atf;
    }
}
