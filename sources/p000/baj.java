package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: baj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baj extends azy {

    /* renamed from: e */
    private final bbx f2764e = new bbx();

    /* renamed from: f */
    private final Path f2765f = new Path();

    public baj(List list) {
        super(list);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2936a(beo beo, float f) {
        bbx bbx = (bbx) beo.f3103b;
        bbx bbx2 = (bbx) beo.f3104c;
        bbx bbx3 = this.f2764e;
        if (bbx3.f2900b == null) {
            bbx3.f2900b = new PointF();
        }
        boolean z = true;
        if (!bbx.f2901c && !bbx2.f2901c) {
            z = false;
        }
        bbx3.f2901c = z;
        if (bbx.f2899a.size() != bbx2.f2899a.size()) {
            bek.m2805a("Curves must have the same number of control points. Shape 1: " + bbx.f2899a.size() + "\tShape 2: " + bbx2.f2899a.size());
        }
        int min = Math.min(bbx.f2899a.size(), bbx2.f2899a.size());
        if (bbx3.f2899a.size() < min) {
            for (int size = bbx3.f2899a.size(); size < min; size++) {
                bbx3.f2899a.add(new baq());
            }
        } else if (bbx3.f2899a.size() > min) {
            for (int size2 = bbx3.f2899a.size() - 1; size2 >= min; size2--) {
                List list = bbx3.f2899a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointF = bbx.f2900b;
        PointF pointF2 = bbx2.f2900b;
        float a = bem.m2819a(pointF.x, pointF2.x, f);
        float a2 = bem.m2819a(pointF.y, pointF2.y, f);
        if (bbx3.f2900b == null) {
            bbx3.f2900b = new PointF();
        }
        bbx3.f2900b.set(a, a2);
        for (int size3 = bbx3.f2899a.size() - 1; size3 >= 0; size3--) {
            baq baq = (baq) bbx.f2899a.get(size3);
            baq baq2 = (baq) bbx2.f2899a.get(size3);
            PointF pointF3 = baq.f2792a;
            PointF pointF4 = baq.f2793b;
            PointF pointF5 = baq.f2794c;
            PointF pointF6 = baq2.f2792a;
            PointF pointF7 = baq2.f2793b;
            PointF pointF8 = baq2.f2794c;
            ((baq) bbx3.f2899a.get(size3)).f2792a.set(bem.m2819a(pointF3.x, pointF6.x, f), bem.m2819a(pointF3.y, pointF6.y, f));
            ((baq) bbx3.f2899a.get(size3)).f2793b.set(bem.m2819a(pointF4.x, pointF7.x, f), bem.m2819a(pointF4.y, pointF7.y, f));
            ((baq) bbx3.f2899a.get(size3)).f2794c.set(bem.m2819a(pointF5.x, pointF8.x, f), bem.m2819a(pointF5.y, pointF8.y, f));
        }
        bem.m2825a(this.f2764e, this.f2765f);
        return this.f2765f;
    }
}
