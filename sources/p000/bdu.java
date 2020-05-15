package p000;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bdu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdu implements bea {

    /* renamed from: a */
    public static final bdu f3055a = new bdu();

    /* renamed from: b */
    private static final bed f3056b = bed.m2754a("c", "v", "i", "o");

    private bdu() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2999a(bef bef, float f) {
        if (bef.mo3035n() == 1) {
            bef.mo3021a();
        }
        bef.mo3024c();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = false;
        while (bef.mo3026e()) {
            int a = bef.mo3019a(f3056b);
            if (a == 0) {
                z = bef.mo3030i();
            } else if (a == 1) {
                list = bdi.m2728a(bef, f);
            } else if (a == 2) {
                list2 = bdi.m2728a(bef, f);
            } else if (a != 3) {
                bef.mo3028g();
                bef.mo3033l();
            } else {
                list3 = bdi.m2728a(bef, f);
            }
        }
        bef.mo3025d();
        if (bef.mo3035n() == 2) {
            bef.mo3023b();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new bbx(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = (PointF) list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) list.get(i);
                int i2 = i - 1;
                arrayList.add(new baq(bem.m2823a((PointF) list.get(i2), (PointF) list3.get(i2)), bem.m2823a(pointF2, (PointF) list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = (PointF) list.get(0);
                int i3 = size - 1;
                arrayList.add(new baq(bem.m2823a((PointF) list.get(i3), (PointF) list3.get(i3)), bem.m2823a(pointF3, (PointF) list2.get(0)), pointF3));
            }
            return new bbx(pointF, z, arrayList);
        }
    }
}
