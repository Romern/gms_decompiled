package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;

/* renamed from: beuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beuy {

    /* renamed from: a */
    public final Comparable[] f112576a;

    /* renamed from: b */
    public final beux f112577b;

    public beuy(Comparable[] comparableArr, ByteBuffer byteBuffer, long j) {
        beux beux = new beux(comparableArr, byteBuffer, j);
        if (comparableArr.length > 1) {
            this.f112577b = beux;
            this.f112576a = comparableArr;
            return;
        }
        throw new IllegalArgumentException(String.format("Expected at least 2 classes, found %s", Arrays.toString(comparableArr)));
    }

    /* renamed from: a */
    public static final void m95928a(Map map, Comparable comparable, float f) {
        float f2;
        Float f3 = (Float) map.get(comparable);
        if (f3 != null) {
            f2 = f3.floatValue();
        } else {
            f2 = 0.0f;
        }
        map.put(comparable, Float.valueOf(f2 + f));
    }

    /* renamed from: a */
    public final int mo61171a() {
        return this.f112577b.f112568a.length;
    }

    @Deprecated
    /* renamed from: a */
    public final beuw mo61172a(int i, float[] fArr) {
        return this.f112577b.mo61170a(i, fArr);
    }
}
