package p000;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: beuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beuv {

    /* renamed from: a */
    public final int f112554a;

    /* renamed from: b */
    public final boolean f112555b;

    /* renamed from: c */
    public final int[] f112556c;

    /* renamed from: d */
    public final ByteBuffer f112557d;

    /* renamed from: e */
    public final List f112558e;

    /* renamed from: f */
    public final List f112559f;

    /* renamed from: g */
    public final List f112560g;

    /* renamed from: h */
    public final List f112561h;

    /* renamed from: i */
    public final List f112562i;

    /* renamed from: j */
    public final List f112563j;

    /* renamed from: k */
    public final List f112564k;

    /* renamed from: l */
    private final int f112565l;

    public beuv(ByteBuffer byteBuffer, boolean z) {
        ByteBuffer byteBuffer2 = byteBuffer;
        boolean z2 = z;
        byteBuffer.rewind();
        this.f112557d = byteBuffer2;
        this.f112555b = z2;
        byteBuffer.getLong();
        int i = byteBuffer.getInt();
        this.f112565l = i;
        int i2 = 4;
        if (i == 2 || i == 4) {
            int i3 = byteBuffer.getInt();
            this.f112554a = i3;
            this.f112556c = new int[i3];
            this.f112560g = new ArrayList();
            this.f112561h = new ArrayList();
            this.f112562i = new ArrayList();
            this.f112563j = new ArrayList();
            if (!z2) {
                this.f112558e = new ArrayList();
                this.f112559f = new ArrayList();
            } else {
                this.f112558e = null;
                this.f112559f = null;
            }
            this.f112564k = new ArrayList();
            int i4 = 0;
            int i5 = 0;
            while (i5 < this.f112554a) {
                this.f112556c[i5] = byteBuffer.getInt();
                int i6 = this.f112556c[i5];
                if (i6 == 1) {
                    int i7 = byteBuffer.getInt();
                    int i8 = byteBuffer.getInt();
                    int[] iArr = new int[3];
                    int i9 = 0;
                    while (i9 < 3) {
                        iArr[i9] = byteBuffer.getInt();
                        i9++;
                        i4 = 0;
                    }
                    this.f112560g.add(iArr);
                    this.f112561h.add(Integer.valueOf(byteBuffer.getInt()));
                    this.f112562i.add(Integer.valueOf(byteBuffer.getInt()));
                    this.f112563j.add(Integer.valueOf(byteBuffer.getInt()));
                    int position = byteBuffer.position();
                    List list = this.f112564k;
                    int[] iArr2 = new int[3];
                    iArr2[i4] = position;
                    iArr2[1] = i8;
                    iArr2[2] = i7;
                    list.add(iArr2);
                    if (z2) {
                        byteBuffer2.position(position + (i8 * (i7 + i7 + 24)));
                    } else {
                        int[] iArr3 = new int[2];
                        iArr3[1] = i7;
                        iArr3[i4] = i8;
                        float[][] fArr = (float[][]) Array.newInstance(float.class, iArr3);
                        int[] iArr4 = new int[2];
                        iArr4[1] = 4;
                        iArr4[i4] = i8;
                        float[][] fArr2 = (float[][]) Array.newInstance(float.class, iArr4);
                        int i10 = 0;
                        while (i10 < i8) {
                            int i11 = this.f112565l;
                            if (i11 == 2) {
                                float f = byteBuffer.getFloat();
                                float f2 = byteBuffer.getFloat();
                                for (int i12 = 0; i12 < i7; i12++) {
                                    fArr[i10][i12] = (((float) ((char) byteBuffer.getShort())) * f2) + f;
                                }
                                i4 = 0;
                            } else if (i11 == 4) {
                                for (int i13 = 0; i13 < i7; i13++) {
                                    fArr[i10][i13] = byteBuffer.getFloat();
                                }
                            }
                            while (i4 < 4) {
                                fArr2[i10][i4] = byteBuffer.getFloat();
                                i4++;
                            }
                            i10++;
                            i4 = 0;
                        }
                        this.f112558e.add(fArr);
                        this.f112559f.add(fArr2);
                    }
                } else if (i6 == 2) {
                    int i14 = byteBuffer.getInt();
                    int i15 = byteBuffer.getInt();
                    int position2 = byteBuffer.position();
                    List list2 = this.f112564k;
                    int[] iArr5 = new int[3];
                    iArr5[i4] = position2;
                    iArr5[1] = i15;
                    iArr5[2] = i14;
                    list2.add(iArr5);
                    if (z2) {
                        byteBuffer2.position(position2 + (i15 * (i14 + i14 + 8)));
                    } else {
                        int[] iArr6 = new int[2];
                        iArr6[1] = i14;
                        iArr6[i4] = i15;
                        float[][] fArr3 = (float[][]) Array.newInstance(float.class, iArr6);
                        int i16 = 0;
                        while (i16 < i15) {
                            int i17 = this.f112565l;
                            if (i17 == 2) {
                                float f3 = byteBuffer.getFloat();
                                float f4 = byteBuffer.getFloat();
                                for (int i18 = 0; i18 < i14; i18++) {
                                    fArr3[i16][i18] = (((float) ((char) byteBuffer.getShort())) * f4) + f3;
                                }
                            } else if (i17 == i2) {
                                for (int i19 = 0; i19 < i14; i19++) {
                                    fArr3[i16][i19] = byteBuffer.getFloat();
                                }
                            }
                            i16++;
                            i2 = 4;
                        }
                        this.f112558e.add(fArr3);
                    }
                } else if (i6 != 3) {
                    StringBuilder sb = new StringBuilder(34);
                    sb.append("Unsupported layerType: ");
                    sb.append(i6);
                    throw new IllegalArgumentException(sb.toString());
                }
                i5++;
                i2 = 4;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Unsupported numBytesForFloat: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }
}
