package p000;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: bhdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhdn extends Property {

    /* renamed from: a */
    private final Matrix f118332a = new Matrix();

    public bhdn() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        this.f118332a.set(((ImageView) obj).getImageMatrix());
        return this.f118332a;
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
