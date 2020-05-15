package p000;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbx {

    /* renamed from: a */
    public final List f2899a;

    /* renamed from: b */
    public PointF f2900b;

    /* renamed from: c */
    public boolean f2901c;

    public bbx() {
        this.f2899a = new ArrayList();
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f2899a.size() + "closed=" + this.f2901c + '}';
    }

    public bbx(PointF pointF, boolean z, List list) {
        this.f2900b = pointF;
        this.f2901c = z;
        this.f2899a = new ArrayList(list);
    }
}
