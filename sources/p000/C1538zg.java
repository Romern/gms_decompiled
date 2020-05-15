package p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1538zg extends adg {

    /* renamed from: i */
    private static TimeInterpolator f27724i;

    /* renamed from: a */
    final ArrayList f27725a = new ArrayList();

    /* renamed from: b */
    final ArrayList f27726b = new ArrayList();

    /* renamed from: c */
    final ArrayList f27727c = new ArrayList();

    /* renamed from: d */
    final ArrayList f27728d = new ArrayList();

    /* renamed from: e */
    final ArrayList f27729e = new ArrayList();

    /* renamed from: f */
    final ArrayList f27730f = new ArrayList();

    /* renamed from: g */
    final ArrayList f27731g = new ArrayList();

    /* renamed from: j */
    private final ArrayList f27732j = new ArrayList();

    /* renamed from: k */
    private final ArrayList f27733k = new ArrayList();

    /* renamed from: l */
    private final ArrayList f27734l = new ArrayList();

    /* renamed from: m */
    private final ArrayList f27735m = new ArrayList();

    /* renamed from: a */
    static final void m20950a(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((acm) list.get(size)).f201a.animate().cancel();
        }
    }

    /* renamed from: i */
    private final void m20954i(acm acm) {
        if (f27724i == null) {
            f27724i = new ValueAnimator().getInterpolator();
        }
        acm.f201a.animate().setInterpolator(f27724i);
        mo206d(acm);
    }

    /* renamed from: b */
    public boolean mo202b() {
        return !this.f27733k.isEmpty() || !this.f27735m.isEmpty() || !this.f27734l.isEmpty() || !this.f27732j.isEmpty() || !this.f27729e.isEmpty() || !this.f27730f.isEmpty() || !this.f27728d.isEmpty() || !this.f27731g.isEmpty() || !this.f27726b.isEmpty() || !this.f27725a.isEmpty() || !this.f27727c.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo16613c() {
        if (!mo202b()) {
            mo207e();
        }
    }

    /* renamed from: d */
    public void mo205d() {
        int size = this.f27734l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1537zf zfVar = (C1537zf) this.f27734l.get(size);
            View view = zfVar.f27719a.f201a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo208e(zfVar.f27719a);
            this.f27734l.remove(size);
        }
        for (int size2 = this.f27732j.size() - 1; size2 >= 0; size2--) {
            mo208e((acm) this.f27732j.get(size2));
            this.f27732j.remove(size2);
        }
        int size3 = this.f27733k.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            acm acm = (acm) this.f27733k.get(size3);
            acm.f201a.setAlpha(1.0f);
            mo208e(acm);
            this.f27733k.remove(size3);
        }
        for (int size4 = this.f27735m.size() - 1; size4 >= 0; size4--) {
            m20952a((C1536ze) this.f27735m.get(size4));
        }
        this.f27735m.clear();
        if (mo202b()) {
            for (int size5 = this.f27726b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f27726b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1537zf zfVar2 = (C1537zf) arrayList.get(size6);
                    View view2 = zfVar2.f27719a.f201a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo208e(zfVar2.f27719a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f27726b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f27725a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f27725a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    acm acm2 = (acm) arrayList2.get(size8);
                    acm2.f201a.setAlpha(1.0f);
                    mo208e(acm2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f27725a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f27727c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f27727c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m20952a((C1536ze) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f27727c.remove(arrayList3);
                    }
                }
            }
            m20950a(this.f27730f);
            m20950a(this.f27729e);
            m20950a(this.f27728d);
            m20950a(this.f27731g);
            mo207e();
        }
    }

    /* renamed from: a */
    private final void m20951a(List list, acm acm) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1536ze zeVar = (C1536ze) list.get(size);
            if (m20953a(zeVar, acm) && zeVar.f27713a == null && zeVar.f27714b == null) {
                list.remove(zeVar);
            }
        }
    }

    /* renamed from: b */
    public boolean mo428b(acm acm) {
        m20954i(acm);
        acm.f201a.setAlpha(0.0f);
        this.f27733k.add(acm);
        return true;
    }

    /* renamed from: c */
    public void mo16614c(acm acm) {
        View view = acm.f201a;
        ViewPropertyAnimator animate = view.animate();
        this.f27728d.add(acm);
        animate.alpha(1.0f).setDuration(120).setListener(new C1532za(this, acm, view, animate)).start();
    }

    /* renamed from: a */
    private final void m20952a(C1536ze zeVar) {
        acm acm = zeVar.f27713a;
        if (acm != null) {
            m20953a(zeVar, acm);
        }
        acm acm2 = zeVar.f27714b;
        if (acm2 != null) {
            m20953a(zeVar, acm2);
        }
    }

    /* renamed from: a */
    private final boolean m20953a(C1536ze zeVar, acm acm) {
        if (zeVar.f27714b == acm) {
            zeVar.f27714b = null;
        } else if (zeVar.f27713a != acm) {
            return false;
        } else {
            zeVar.f27713a = null;
        }
        acm.f201a.setAlpha(1.0f);
        acm.f201a.setTranslationX(0.0f);
        acm.f201a.setTranslationY(0.0f);
        mo208e(acm);
        return true;
    }

    /* renamed from: a */
    public void mo198a() {
        long j;
        long j2;
        boolean isEmpty = this.f27732j.isEmpty();
        boolean z = !isEmpty;
        boolean isEmpty2 = this.f27734l.isEmpty();
        boolean z2 = !isEmpty2;
        boolean isEmpty3 = this.f27735m.isEmpty();
        boolean z3 = !isEmpty3;
        boolean z4 = !this.f27733k.isEmpty();
        if (z || z2 || z4 || z3) {
            ArrayList arrayList = this.f27732j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                acm acm = (acm) arrayList.get(i);
                View view = acm.f201a;
                ViewPropertyAnimator animate = view.animate();
                this.f27730f.add(acm);
                animate.setDuration(120).alpha(0.0f).setListener(new C1530yz(this, acm, animate, view)).start();
            }
            this.f27732j.clear();
            if (z2) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f27734l);
                this.f27726b.add(arrayList2);
                this.f27734l.clear();
                C1527yw ywVar = new C1527yw(this, arrayList2);
                if (z) {
                    C1280ps.m19892a(((C1537zf) arrayList2.get(0)).f27719a.f201a, ywVar, 120);
                } else {
                    ywVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f27735m);
                this.f27727c.add(arrayList3);
                this.f27735m.clear();
                C1528yx yxVar = new C1528yx(this, arrayList3);
                if (z) {
                    j = 120;
                    C1280ps.m19892a(((C1536ze) arrayList3.get(0)).f27713a.f201a, yxVar, 120);
                } else {
                    j = 120;
                    yxVar.run();
                }
            } else {
                j = 120;
            }
            if (z4) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(this.f27733k);
                this.f27725a.add(arrayList4);
                this.f27733k.clear();
                C1529yy yyVar = new C1529yy(this, arrayList4);
                if (!z && !z2 && !z3) {
                    yyVar.run();
                    return;
                }
                long j3 = 0;
                if (isEmpty) {
                    j = 0;
                }
                if (!isEmpty2) {
                    j2 = 250;
                } else {
                    j2 = 0;
                }
                if (!isEmpty3) {
                    j3 = 250;
                }
                C1280ps.m19892a(((acm) arrayList4.get(0)).f201a, yyVar, j + Math.max(j2, j3));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo425a(acm acm) {
        m20954i(acm);
        this.f27732j.add(acm);
        return true;
    }

    /* renamed from: a */
    public final boolean mo426a(acm acm, int i, int i2, int i3, int i4) {
        View view = acm.f201a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) acm.f201a.getTranslationY());
        m20954i(acm);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo208e(acm);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.f27734l.add(new C1537zf(acm, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: a */
    public final boolean mo427a(acm acm, acm acm2, int i, int i2, int i3, int i4) {
        if (acm == acm2) {
            return mo426a(acm, i, i2, i3, i4);
        }
        float translationX = acm.f201a.getTranslationX();
        float translationY = acm.f201a.getTranslationY();
        float alpha = acm.f201a.getAlpha();
        m20954i(acm);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        acm.f201a.setTranslationX(translationX);
        acm.f201a.setTranslationY(translationY);
        acm.f201a.setAlpha(alpha);
        if (acm2 != null) {
            m20954i(acm2);
            acm2.f201a.setTranslationX((float) (-i5));
            acm2.f201a.setTranslationY((float) (-i6));
            acm2.f201a.setAlpha(0.0f);
        }
        this.f27735m.add(new C1536ze(acm, acm2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: d */
    public void mo206d(acm acm) {
        View view = acm.f201a;
        view.animate().cancel();
        int size = this.f27734l.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C1537zf) this.f27734l.get(size)).f27719a == acm) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo208e(acm);
                this.f27734l.remove(size);
            }
        }
        m20951a(this.f27735m, acm);
        if (this.f27732j.remove(acm)) {
            view.setAlpha(1.0f);
            mo208e(acm);
        }
        if (this.f27733k.remove(acm)) {
            view.setAlpha(1.0f);
            mo208e(acm);
        }
        for (int size2 = this.f27727c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f27727c.get(size2);
            m20951a(arrayList, acm);
            if (arrayList.isEmpty()) {
                this.f27727c.remove(size2);
            }
        }
        for (int size3 = this.f27726b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f27726b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1537zf) arrayList2.get(size4)).f27719a == acm) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo208e(acm);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f27726b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f27725a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f27725a.get(size5);
            if (arrayList3.remove(acm)) {
                view.setAlpha(1.0f);
                mo208e(acm);
                if (arrayList3.isEmpty()) {
                    this.f27725a.remove(size5);
                }
            }
        }
        this.f27730f.remove(acm);
        this.f27728d.remove(acm);
        this.f27731g.remove(acm);
        this.f27729e.remove(acm);
        mo16613c();
    }

    /* renamed from: a */
    public final boolean mo201a(acm acm, List list) {
        return !list.isEmpty() || mo209f(acm);
    }
}
