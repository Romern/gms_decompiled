package p000;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* renamed from: arx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arx extends Property {
    public arx(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        View view = (View) obj;
        return null;
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        aty.m2102a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
    }
}
