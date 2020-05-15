package p000;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: atj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atj {

    /* renamed from: a */
    static final ArrayList f2200a = new ArrayList();

    /* renamed from: b */
    private static final atf f2201b = new atn(null);

    /* renamed from: e */
    private static final ThreadLocal f2202e = new ThreadLocal();

    /* renamed from: c */
    private final C1223np f2203c = new C1223np();

    /* renamed from: d */
    private final C1223np f2204d = new C1223np();

    /* renamed from: a */
    static C1223np m2052a() {
        C1223np npVar;
        WeakReference weakReference = (WeakReference) f2202e.get();
        if (weakReference != null && (npVar = (C1223np) weakReference.get()) != null) {
            return npVar;
        }
        C1223np npVar2 = new C1223np();
        f2202e.set(new WeakReference(npVar2));
        return npVar2;
    }

    /* renamed from: b */
    private static void m2054b(ViewGroup viewGroup, atf atf) {
        if (atf != null && viewGroup != null) {
            ati ati = new ati(atf, viewGroup);
            viewGroup.addOnAttachStateChangeListener(ati);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(ati);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atf.a(android.view.ViewGroup, boolean):void
     arg types: [android.view.ViewGroup, int]
     candidates:
      atf.a(android.view.View, boolean):atq
      atf.a(atq, atq):boolean
      atf.a(android.view.ViewGroup, boolean):void */
    /* renamed from: c */
    private static void m2055c(ViewGroup viewGroup, atf atf) {
        ArrayList arrayList = (ArrayList) m2052a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((atf) arrayList.get(i)).mo2472b(viewGroup);
            }
        }
        if (atf != null) {
            atf.mo2460a(viewGroup, true);
        }
        asw a = asw.m1978a(viewGroup);
        if (a != null) {
            a.mo2438a();
        }
    }

    /* renamed from: a */
    public static void m2053a(ViewGroup viewGroup, atf atf) {
        if (!f2200a.contains(viewGroup) && C1280ps.m19868C(viewGroup)) {
            f2200a.add(viewGroup);
            if (atf == null) {
                atf = f2201b;
            }
            atf h = atf.clone();
            m2055c(viewGroup, h);
            asw.m1979a(viewGroup, null);
            m2054b(viewGroup, h);
        }
    }

    /* renamed from: a */
    public final void mo2488a(asw asw) {
        atf atf;
        asw a;
        C1223np npVar;
        ViewGroup viewGroup = asw.f2142a;
        if ((viewGroup == null || (a = asw.m1978a(viewGroup)) == null || (npVar = (C1223np) this.f2204d.get(asw)) == null || (atf = (atf) npVar.get(a)) == null) && (atf = (atf) this.f2203c.get(asw)) == null) {
            atf = f2201b;
        }
        ViewGroup viewGroup2 = asw.f2142a;
        if (!f2200a.contains(viewGroup2)) {
            asw a2 = asw.m1978a(viewGroup2);
            if (atf != null) {
                f2200a.add(viewGroup2);
                atf h = atf.clone();
                m2055c(viewGroup2, h);
                asw.mo2439b();
                m2054b(viewGroup2, h);
                return;
            }
            if (a2 != null) {
                a2.mo2438a();
            }
            asw.mo2439b();
        }
    }

    /* renamed from: a */
    public final void mo2489a(asw asw, atf atf) {
        this.f2203c.put(asw, atf);
    }
}
