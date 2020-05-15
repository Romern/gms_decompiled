package p000;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: bevc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bevc implements beuk {

    /* renamed from: b */
    public final int f112593b;

    /* renamed from: c */
    private final float[] f112594c;

    /* renamed from: d */
    private final int f112595d;

    /* renamed from: e */
    private final int f112596e;

    /* renamed from: f */
    private final boolean f112597f;

    /* renamed from: g */
    private final ByteBuffer f112598g;

    /* renamed from: h */
    private final List f112599h = new ArrayList();

    /* renamed from: i */
    private final List f112600i = new ArrayList();

    /* renamed from: j */
    private final List f112601j = new ArrayList();

    /* renamed from: k */
    private final List f112602k = new ArrayList();

    /* renamed from: l */
    private final List f112603l = new ArrayList();

    /* renamed from: m */
    private final List f112604m = new ArrayList();

    /* renamed from: n */
    private final List f112605n = new ArrayList();

    /* renamed from: o */
    private final int f112606o;

    public bevc(ByteBuffer byteBuffer, int i, boolean z) {
        byteBuffer.rewind();
        this.f112598g = byteBuffer;
        this.f112597f = z;
        byteBuffer.getLong();
        this.f112595d = byteBuffer.getInt();
        this.f112596e = byteBuffer.getInt();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < this.f112596e) {
            int i5 = byteBuffer.getInt();
            int i6 = byteBuffer.getInt();
            i3 = i2 == 0 ? (i5 - (i6 / 3)) - 1 : i3;
            int i7 = this.f112595d;
            if (i7 != 2) {
                if (i7 == 4) {
                    int[] iArr = new int[2];
                    iArr[1] = i5;
                    iArr[0] = i6;
                    float[][] fArr = (float[][]) Array.newInstance(float.class, iArr);
                    for (int i8 = 0; i8 < i6; i8++) {
                        for (int i9 = 0; i9 < i5; i9++) {
                            fArr[i8][i9] = byteBuffer.getFloat();
                        }
                    }
                    this.f112599h.add(fArr);
                } else {
                    StringBuilder sb = new StringBuilder(41);
                    sb.append("Unsupported numBytesForFloat: ");
                    sb.append(i7);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (z) {
                int position = byteBuffer.position();
                this.f112603l.add(new int[]{position, i6, i5});
                byteBuffer.position(position + ((i5 + i5 + 8) * i6));
            } else {
                int[] iArr2 = new int[2];
                iArr2[1] = i5;
                iArr2[0] = i6;
                short[][] sArr = (short[][]) Array.newInstance(short.class, iArr2);
                float[] fArr2 = new float[i6];
                float[] fArr3 = new float[i6];
                for (int i10 = 0; i10 < i6; i10++) {
                    fArr2[i10] = byteBuffer.getFloat();
                    fArr3[i10] = byteBuffer.getFloat();
                    for (int i11 = 0; i11 < i5; i11++) {
                        sArr[i10][i11] = byteBuffer.getShort();
                    }
                }
                this.f112600i.add(sArr);
                this.f112601j.add(fArr2);
                this.f112602k.add(fArr3);
            }
            if (i2 < this.f112596e - 1) {
                this.f112605n.add(new float[i6]);
                this.f112604m.add(new float[(i6 / 3)]);
            } else {
                this.f112604m.add(new float[i6]);
            }
            i2++;
            i4 = i6;
        }
        this.f112593b = i3;
        int i12 = i4 - 1;
        this.f112594c = new float[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            this.f112594c[i13] = byteBuffer.getFloat();
        }
        this.f112606o = i;
    }

    /* renamed from: a */
    public final List mo61159a(beup beup) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final void mo61175b(float[] fArr) {
        beul.m95895a(this.f112606o, fArr, this.f112594c);
    }

    /* renamed from: c */
    public final float[] mo61176c(float[] fArr) {
        int i = 0;
        for (int i2 = 0; i2 < this.f112596e - 1; i2++) {
            if (i2 > 0) {
                fArr = (float[]) this.f112604m.get(i2 - 1);
            }
            float[] fArr2 = (float[]) this.f112605n.get(i2);
            int length = fArr2.length / 3;
            if (this.f112595d == 4) {
                beul.m95901a((float[][]) this.f112599h.get(i2), 0, length + length, fArr, (float[]) this.f112604m.get(i2), fArr2);
            } else if (!this.f112597f) {
                beul.m95902a((short[][]) this.f112600i.get(i2), (float[]) this.f112602k.get(i2), (float[]) this.f112601j.get(i2), 0, length + length, fArr, (float[]) this.f112604m.get(i2), fArr2);
            } else {
                beul.m95896a(this.f112598g, (int[]) this.f112603l.get(i2), 0, length + length, fArr, (float[]) this.f112604m.get(i2), fArr2);
            }
            int i3 = length + length;
            beul.m95900a(fArr2, i3);
            for (int i4 = 0; i4 < length; i4++) {
                fArr2[i4] = fArr2[i4] * ((float[]) this.f112604m.get(i2))[i4];
            }
            if (this.f112595d == 4) {
                beul.m95901a((float[][]) this.f112599h.get(i2), i3, length * 3, fArr, fArr2, fArr2);
            } else if (!this.f112597f) {
                beul.m95902a((short[][]) this.f112600i.get(i2), (float[]) this.f112602k.get(i2), (float[]) this.f112601j.get(i2), i3, length * 3, fArr, fArr2, fArr2);
            } else {
                beul.m95896a(this.f112598g, (int[]) this.f112603l.get(i2), i3, length * 3, fArr, fArr2, fArr2);
            }
            int i5 = length * 3;
            for (int i6 = i3; i6 < i5; i6++) {
                fArr2[i6] = (float) Math.tanh((double) fArr2[i6]);
            }
            float[] fArr3 = (float[]) this.f112604m.get(i2);
            for (int i7 = 0; i7 < length; i7++) {
                float f = fArr2[length + i7];
                fArr3[i7] = (fArr3[i7] * f) + ((1.0f - f) * fArr2[i3 + i7]);
            }
        }
        List list = this.f112604m;
        float[] fArr4 = (float[]) list.get(list.size() - 1);
        if (this.f112595d == 4) {
            float[][] fArr5 = (float[][]) this.f112599h.get(this.f112596e - 1);
            float[] fArr6 = (float[]) this.f112604m.get(this.f112596e - 2);
            int i8 = beul.f112493b;
            int length2 = fArr5.length;
            while (i < length2) {
                fArr4[i] = beul.m95891a(fArr5[i], fArr6);
                i++;
            }
        } else if (!this.f112597f) {
            short[][] sArr = (short[][]) this.f112600i.get(this.f112596e - 1);
            float[] fArr7 = (float[]) this.f112602k.get(this.f112596e - 1);
            float[] fArr8 = (float[]) this.f112601j.get(this.f112596e - 1);
            float[] fArr9 = (float[]) this.f112604m.get(this.f112596e - 2);
            int i9 = beul.f112493b;
            int length3 = sArr.length;
            while (i < length3) {
                fArr4[i] = beul.m95892a(sArr[i], fArr7[i], fArr8[i], fArr9);
                i++;
            }
        } else {
            ByteBuffer byteBuffer = this.f112598g;
            int[] iArr = (int[]) this.f112603l.get(this.f112596e - 1);
            float[] fArr10 = (float[]) this.f112604m.get(this.f112596e - 2);
            int i10 = beul.f112493b;
            int i11 = iArr[1];
            int i12 = iArr[0];
            int i13 = iArr[2];
            while (i < i11) {
                fArr4[i] = beul.m95890a(byteBuffer, ((i13 + i13 + 8) * i) + i12, i13, fArr10);
                i++;
            }
        }
        beul.m95906c(fArr4);
        return fArr4;
    }

    /* renamed from: a */
    public final List mo61160a(float[] fArr) {
        boolean z;
        int length = fArr.length;
        if (length % this.f112593b == 0) {
            z = true;
        } else {
            z = false;
        }
        bxbm.m122545b(z, String.format(Locale.US, "%d %% %d != 0", Integer.valueOf(length), Integer.valueOf(this.f112593b)));
        mo61174a();
        int i = this.f112593b;
        int i2 = length / i;
        float[] fArr2 = new float[i];
        float[] fArr3 = null;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f112593b;
            System.arraycopy(fArr, i4 * i3, fArr2, 0, i4);
            fArr3 = mo61176c(fArr2);
        }
        mo61175b(fArr3);
        return beul.m95894a(fArr3);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(float[], float):void}
     arg types: [float[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void} */
    /* renamed from: a */
    public final void mo61174a() {
        List list = this.f112604m;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Arrays.fill((float[]) list.get(i), 0.0f);
        }
    }
}
