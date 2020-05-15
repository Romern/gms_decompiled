package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: beva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beva implements beuk {

    /* renamed from: b */
    private final float[] f112588b;

    /* renamed from: c */
    private final int f112589c;

    /* renamed from: d */
    private final beuz f112590d;

    /* renamed from: e */
    private final beuz f112591e;

    /* renamed from: f */
    private final boolean f112592f;

    public beva(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, boolean z) {
        byteBuffer.rewind();
        beuz beuz = new beuz(byteBuffer, ceuq.m138262b());
        this.f112590d = beuz;
        int i2 = beuz.f112578a - 1;
        this.f112588b = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f112588b[i3] = byteBuffer.getFloat();
        }
        if (z && byteBuffer2 != null) {
            byteBuffer2.rewind();
            this.f112591e = new beuz(byteBuffer2, ceuq.m138262b());
        } else {
            this.f112591e = null;
        }
        this.f112589c = i;
        this.f112592f = z;
    }

    /* renamed from: a */
    public final List mo61159a(beup beup) {
        if (beup.f112500c < 4.0E-4f || beup.f112516s < 4.0E-4f) {
            return Collections.singletonList(new beus(beur.STILL, 100));
        }
        float[] a = beup.mo61161a();
        beul.m95908e(a);
        float[] a2 = this.f112590d.mo61173a(a);
        beul.m95895a(this.f112589c, a2, this.f112588b);
        List a3 = beul.m95894a(a2);
        if (this.f112592f && this.f112591e != null) {
            float f = a2[3];
            float[] fArr = new float[2];
            if (((double) f) > ceuq.f183443a.mo6606a().roadVehicleThresholdFor2wheelerDetection()) {
                float f2 = this.f112591e.mo61173a(a)[0] * f;
                fArr[0] = f2;
                fArr[1] = f - f2;
            } else {
                float f3 = f / 2.0f;
                fArr[1] = f3;
                fArr[0] = f3;
            }
            beul.m95899a(a3, fArr);
        }
        return a3;
    }

    /* renamed from: a */
    public final List mo61160a(float[] fArr) {
        ArrayList arrayList = new ArrayList();
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return mo61159a(beuq.m95918a(arrayList));
    }
}
