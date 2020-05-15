package p000;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.os.Build;
import android.util.Property;

/* renamed from: asu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class asu {
    /* renamed from: a */
    static ObjectAnimator m1976a(Object obj, Property property, Path path) {
        int i = Build.VERSION.SDK_INT;
        return ObjectAnimator.ofObject(obj, property, (TypeConverter) null, path);
    }
}
