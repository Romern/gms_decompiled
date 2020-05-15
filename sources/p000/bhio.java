package p000;

import android.graphics.Matrix;

/* renamed from: bhio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhio extends bhdo {

    /* renamed from: a */
    final /* synthetic */ bhiv f118732a;

    public bhio(bhiv bhiv) {
        this.f118732a = bhiv;
    }

    /* renamed from: a */
    public final Matrix mo63570a(float f, Matrix matrix, Matrix matrix2) {
        this.f118732a.f118774s = f;
        return super.evaluate(f, matrix, matrix2);
    }

    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return evaluate(f, (Matrix) obj, (Matrix) obj2);
    }
}
