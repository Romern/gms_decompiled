package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: asf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asf extends Property {
    public asf(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        ImageView imageView = (ImageView) obj;
        return null;
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        int i = Build.VERSION.SDK_INT;
        ((ImageView) obj).animateTransform((Matrix) obj2);
    }
}
