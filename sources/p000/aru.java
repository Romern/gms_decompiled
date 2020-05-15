package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: aru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aru extends Property {

    /* renamed from: a */
    private final Rect f2100a = new Rect();

    public aru(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        ((Drawable) obj).copyBounds(this.f2100a);
        return new PointF((float) this.f2100a.left, (float) this.f2100a.top);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        drawable.copyBounds(this.f2100a);
        this.f2100a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(this.f2100a);
    }
}
