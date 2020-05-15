package p000;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: beuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beuu implements beuk {

    /* renamed from: b */
    private final float[] f112548b;

    /* renamed from: c */
    private final int f112549c;

    /* renamed from: d */
    private final boolean f112550d;

    /* renamed from: e */
    private final beuv f112551e;

    /* renamed from: f */
    private final beuz f112552f;

    /* renamed from: g */
    private final beuz f112553g;

    public beuu(ByteBuffer byteBuffer, int i, boolean z) {
        this.f112551e = new beuv(byteBuffer, ceuq.m138262b());
        beuz beuz = new beuz(byteBuffer, ceuq.m138262b());
        this.f112552f = beuz;
        int i2 = beuz.f112578a - 1;
        this.f112548b = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f112548b[i3] = byteBuffer.getFloat();
        }
        this.f112549c = i;
        this.f112550d = z;
        this.f112553g = z ? new beuz(byteBuffer, ceuq.m138262b()) : null;
    }

    /* renamed from: a */
    public final List mo61159a(beup beup) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final List mo61160a(float[] fArr) {
        int i;
        int i2;
        beuv beuv;
        int i3;
        int i4;
        int i5;
        int i6;
        float[] fArr2;
        beuu beuu = this;
        beuv beuv2 = beuu.f112551e;
        int i7 = 0;
        float[] fArr3 = null;
        int i8 = 0;
        float[] fArr4 = fArr;
        while (i8 < beuv2.f112554a) {
            int i9 = beuv2.f112556c[i8];
            char c = 2;
            int i10 = 1;
            if (i9 == 1) {
                int i11 = ((int[]) beuv2.f112564k.get(i8))[1];
                if (i8 != 0) {
                    i = ((int[]) beuv2.f112564k.get(i8 - 1))[1];
                } else {
                    i = ((int[]) beuv2.f112560g.get(i7))[i7];
                }
                int intValue = ((Integer) beuv2.f112561h.get(i8)).intValue();
                int length = ((((fArr4.length / i) - ((int[]) beuv2.f112560g.get(i8))[1]) / intValue) + 1) * i11;
                float[] fArr5 = new float[length];
                int i12 = 0;
                while (i12 < i11) {
                    if (!beuv2.f112555b) {
                        int i13 = i * intValue;
                        float[] fArr6 = ((float[][]) beuv2.f112558e.get(i8))[i12];
                        float f = ((float[][]) beuv2.f112559f.get(i8))[i12][i7];
                        float f2 = ((float[][]) beuv2.f112559f.get(i8))[i12][i10];
                        float f3 = ((float[][]) beuv2.f112559f.get(i8))[i12][c];
                        float f4 = ((float[][]) beuv2.f112559f.get(i8))[i12][3];
                        int i14 = beul.f112493b;
                        int i15 = i12;
                        int i16 = 0;
                        while (true) {
                            i4 = length;
                            i3 = i12;
                            if (i16 > fArr4.length - fArr6.length) {
                                break;
                            }
                            int i17 = 0;
                            float f5 = 0.0f;
                            while (true) {
                                i6 = i8;
                                if (i17 >= fArr6.length) {
                                    break;
                                }
                                f5 += fArr4[i16 + i17] * fArr6[i17];
                                i17++;
                                i8 = i6;
                            }
                            fArr5[i15] = (((f5 - f) * f3) / f2) + f4;
                            i16 += i13;
                            i15 += i11;
                            length = i4;
                            i12 = i3;
                            i8 = i6;
                        }
                        beuv = beuv2;
                        i5 = i8;
                    } else {
                        i4 = length;
                        i3 = i12;
                        int i18 = i * intValue;
                        ByteBuffer byteBuffer = beuv2.f112557d;
                        i5 = i8;
                        int[] iArr = (int[]) beuv2.f112564k.get(i5);
                        int i19 = beul.f112493b;
                        int i20 = iArr[2];
                        int i21 = i20 + i20;
                        int i22 = iArr[0] + ((i21 + 24) * i3);
                        int i23 = i3;
                        int i24 = 0;
                        while (i24 <= fArr4.length - i20) {
                            int i25 = 0;
                            float f6 = 0.0f;
                            float f7 = 0.0f;
                            while (i25 < i20) {
                                int i26 = i24 + i25;
                                f6 += fArr4[i26] * ((float) ((char) byteBuffer.getShort(i22 + 8 + i25 + i25)));
                                f7 += fArr4[i26];
                                i25++;
                                beuv2 = beuv2;
                                i18 = i18;
                            }
                            int i27 = i22 + 8 + i21;
                            fArr5[i23] = ((byteBuffer.getFloat(i27 + 8) * (((byteBuffer.getFloat(i22 + 4) * f6) + (byteBuffer.getFloat(i22) * f7)) - byteBuffer.getFloat(i27))) / byteBuffer.getFloat(i27 + 4)) + byteBuffer.getFloat(i27 + 12);
                            i24 += i18;
                            i23 += i11;
                            beuv2 = beuv2;
                        }
                        beuv = beuv2;
                    }
                    i12 = i3 + 1;
                    beuu = this;
                    i8 = i5;
                    length = i4;
                    beuv2 = beuv;
                    i7 = 0;
                    c = 2;
                    i10 = 1;
                }
                beul.m95905b(fArr5);
                int intValue2 = ((Integer) beuv2.f112562i.get(i8)).intValue();
                int intValue3 = ((Integer) beuv2.f112563j.get(i8)).intValue();
                int i28 = i8 + 1;
                if (i28 >= beuv2.f112554a || beuv2.f112556c[i28] != i10) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                int i29 = (((length / i11) - intValue3) / intValue2) + 1;
                float[] fArr7 = new float[((i29 + i2 + i2) * i11)];
                for (int i30 = 0; i30 < i11; i30++) {
                    for (int i31 = 0; i31 < i29 * intValue2; i31 += intValue2) {
                        float f8 = -3.4028235E38f;
                        for (int i32 = i31; i32 < i31 + intValue3; i32++) {
                            f8 = Math.max(f8, fArr5[(i11 * i32) + i30]);
                        }
                        fArr7[(((i31 / intValue2) + i2) * i11) + i30] = f8;
                    }
                }
                fArr3 = fArr7;
            } else if (i9 == 2) {
                if (beuv2.f112555b) {
                    fArr2 = beul.m95903a(beuv2.f112557d, (int[]) beuv2.f112564k.get(i8), fArr4);
                } else {
                    fArr2 = beul.m95904a((float[][]) beuv2.f112558e.get(i8), fArr4);
                }
                if (i8 < beuv2.f112554a - 1) {
                    beul.m95905b(fArr2);
                } else {
                    beul.m95906c(fArr2);
                }
                fArr3 = fArr2;
            } else if (i9 != 3) {
                StringBuilder sb = new StringBuilder(34);
                sb.append("Unsupported layerType: ");
                sb.append(i9);
                throw new IllegalArgumentException(sb.toString());
            }
            i8++;
            fArr4 = fArr3;
        }
        float[] a = beuu.f112552f.mo61173a(fArr3);
        beul.m95895a(beuu.f112549c, a, beuu.f112548b);
        List a2 = beul.m95894a(a);
        if (beuu.f112550d) {
            beul.m95897a(a2, a[3], beuu.f112553g.mo61173a(fArr3));
        }
        return a2;
    }
}
