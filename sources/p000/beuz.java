package p000;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: beuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beuz {

    /* renamed from: a */
    public final int f112578a;

    /* renamed from: b */
    private final int f112579b;

    /* renamed from: c */
    private final int f112580c;

    /* renamed from: d */
    private final boolean f112581d;

    /* renamed from: e */
    private final ByteBuffer f112582e;

    /* renamed from: f */
    private final List f112583f = new ArrayList();

    /* renamed from: g */
    private final List f112584g = new ArrayList();

    /* renamed from: h */
    private final List f112585h = new ArrayList();

    /* renamed from: i */
    private final List f112586i = new ArrayList();

    /* renamed from: j */
    private final List f112587j = new ArrayList();

    public beuz(ByteBuffer byteBuffer, boolean z) {
        this.f112582e = byteBuffer;
        this.f112581d = z;
        byteBuffer.getLong();
        this.f112579b = byteBuffer.getInt();
        this.f112580c = byteBuffer.getInt();
        int i = 0;
        int i2 = 0;
        while (i < this.f112580c) {
            int i3 = byteBuffer.getInt();
            int i4 = byteBuffer.getInt();
            int i5 = this.f112579b;
            if (i5 != 2) {
                if (i5 == 4) {
                    int[] iArr = new int[2];
                    iArr[1] = i3;
                    iArr[0] = i4;
                    float[][] fArr = (float[][]) Array.newInstance(float.class, iArr);
                    for (int i6 = 0; i6 < i4; i6++) {
                        for (int i7 = 0; i7 < i3; i7++) {
                            fArr[i6][i7] = byteBuffer.getFloat();
                        }
                    }
                    this.f112583f.add(fArr);
                } else {
                    StringBuilder sb = new StringBuilder(41);
                    sb.append("Unsupported numBytesForFloat: ");
                    sb.append(i5);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (z) {
                int position = byteBuffer.position();
                this.f112587j.add(new int[]{position, i4, i3});
                byteBuffer.position(position + ((i3 + i3 + 8) * i4));
            } else {
                int[] iArr2 = new int[2];
                iArr2[1] = i3;
                iArr2[0] = i4;
                short[][] sArr = (short[][]) Array.newInstance(short.class, iArr2);
                float[] fArr2 = new float[i4];
                float[] fArr3 = new float[i4];
                for (int i8 = 0; i8 < i4; i8++) {
                    fArr2[i8] = byteBuffer.getFloat();
                    fArr3[i8] = byteBuffer.getFloat();
                    for (int i9 = 0; i9 < i3; i9++) {
                        sArr[i8][i9] = byteBuffer.getShort();
                    }
                }
                this.f112584g.add(sArr);
                this.f112585h.add(fArr2);
                this.f112586i.add(fArr3);
            }
            i++;
            i2 = i4;
        }
        this.f112578a = i2;
    }

    /* renamed from: a */
    public final float[] mo61173a(float[] fArr) {
        for (int i = 0; i < this.f112580c; i++) {
            if (this.f112579b == 4) {
                fArr = beul.m95904a((float[][]) this.f112583f.get(i), fArr);
            } else if (!this.f112581d) {
                short[][] sArr = (short[][]) this.f112584g.get(i);
                float[] fArr2 = (float[]) this.f112586i.get(i);
                float[] fArr3 = (float[]) this.f112585h.get(i);
                int i2 = beul.f112493b;
                float[] fArr4 = new float[sArr.length];
                for (int i3 = 0; i3 < sArr.length; i3++) {
                    fArr4[i3] = beul.m95892a(sArr[i3], fArr2[i3], fArr3[i3], fArr);
                }
                fArr = fArr4;
            } else {
                fArr = beul.m95903a(this.f112582e, (int[]) this.f112587j.get(i), fArr);
            }
            if (i < this.f112580c - 1) {
                beul.m95905b(fArr);
            }
        }
        if (this.f112578a <= 2) {
            int i4 = beul.f112493b;
            beul.m95900a(fArr, fArr.length);
        } else {
            beul.m95906c(fArr);
        }
        return fArr;
    }
}
