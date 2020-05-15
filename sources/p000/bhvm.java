package p000;

import java.util.List;

/* renamed from: bhvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhvm implements bhul {

    /* renamed from: a */
    private final int f119688a;

    /* renamed from: b */
    private final Boolean f119689b;

    public bhvm(int i, Boolean bool) {
        this.f119688a = i;
        this.f119689b = bool;
    }

    /* renamed from: a */
    private static final boolean m101620a(float[] fArr) {
        if (fArr != null) {
            return true;
        }
        bhuj.m101555a().mo64362d("Model misconfigured or loaded incorrectly");
        return false;
    }

    /* renamed from: a */
    static float[] m101621a(float[] fArr, int i, int i2) {
        float[] fArr2 = new float[i2];
        float[] fArr3 = new float[i2];
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = (i3 * i2) + i4;
                float f = fArr[i5];
                float f2 = fArr2[i4];
                float f3 = f - f2;
                float f4 = f2 + (f3 / ((float) (i3 + 1)));
                fArr2[i4] = f4;
                fArr3[i4] = fArr3[i4] + (f3 * (fArr[i5] - f4));
            }
        }
        for (int i6 = 0; i6 < i2; i6++) {
            fArr3[i6] = fArr3[i6] / ((float) i);
        }
        int i7 = i * i2;
        float[] fArr4 = new float[(i7 + i7)];
        for (int i8 = 0; i8 < i; i8++) {
            for (int i9 = 0; i9 < i2; i9++) {
                int i10 = i8 * i2;
                float f5 = fArr[i10 + i9];
                int i11 = i10 + i10;
                fArr4[i11 + i9] = f5;
                fArr4[i11 + i2 + i9] = (f5 - fArr2[i9]) / ((float) Math.sqrt((double) (fArr3[i9] + 0.1f)));
            }
        }
        return fArr4;
    }

    /* renamed from: a */
    public final String mo64321a() {
        int i = this.f119688a;
        StringBuilder sb = new StringBuilder(22);
        sb.append("SimpleTF-ID");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public final float[] mo64322a(bhun bhun, List list) {
        brtm brtm;
        bvpd bvpd;
        float f;
        int i;
        float f2;
        int i2;
        bxwc bxwc;
        bhvm bhvm = this;
        bhun bhun2 = bhun;
        int size = list.size();
        if (size == 0) {
            bhuj.m101555a().mo64360b("No candidates to score");
            return new float[0];
        }
        if (bhvm.f119689b.booleanValue()) {
            brtm brtm2 = bhun2.f119648g;
            if (brtm2 == null || brtm2.mo69906O() == null || bhun2.f119648g.mo69906O().mo69903L() == 0) {
                bhuj.m101555a().mo64361c("Model misconfigured or loaded incorrectly");
                return new float[size];
            }
            brtm O = bhun2.f119648g.mo69906O();
            brtm e = O.mo69925e(0);
            if (e.mo69899H() == 0 || e.mo69900I() == 0) {
                bhuj.m101555a().mo64361c("Model misconfigured or loaded incorrectly");
                return new float[size];
            }
            brtm = O;
            bvpd = null;
        } else {
            bvpf bvpf = bhun2.f119643b;
            if (!(bvpf == null || (bvpf.f157280a & 1) == 0)) {
                bvpd bvpd2 = bvpf.f157281b;
                if (bvpd2 == null) {
                    bvpd2 = bvpd.f157270b;
                }
                if (bvpd2.f157272a.size() != 0) {
                    bvpd = bhun2.f119643b.f157281b;
                    if (bvpd == null) {
                        bvpd = bvpd.f157270b;
                    }
                    bvpc bvpc = (bvpc) bvpd.f157272a.get(0);
                    if (bvpc.f157264a.size() == 0 || bvpc.f157266c == 0) {
                        bhuj.m101555a().mo64361c("Model misconfigured or loaded incorrectly");
                        return new float[size];
                    }
                    brtm = null;
                }
            }
            bhuj.m101555a().mo64361c("Model misconfigured or loaded incorrectly");
            return new float[size];
        }
        bvmj[] bvmjArr = bhun2.f119645d;
        int length = bvmjArr.length;
        float[] fArr = new float[(size * length)];
        int i3 = 0;
        while (i3 < size) {
            bhue bhue = (bhue) list.get(i3);
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = (i3 * length) + i4;
                Float f3 = (Float) bhue.f119618a.get(Integer.valueOf(bvmjArr[i4].f156743aM));
                if (f3 != null) {
                    fArr[i5] = f3.floatValue();
                }
            }
            i3++;
            bhvm = this;
        }
        float f4 = 0.0f;
        if (!bhvm.f119689b.booleanValue()) {
            bxwc bxwc2 = bvpd.f157272a;
            int size2 = bxwc2.size();
            int i6 = 0;
            while (i6 < size2) {
                bvpc bvpc2 = (bvpc) bxwc2.get(i6);
                if (bvpc2.f157268e == bhvm.f119688a) {
                    int i7 = bvpc2.f157266c;
                    if (bvpc2.f157264a.size() % i7 == 0) {
                        int size3 = bvpc2.f157264a.size() / i7;
                        if (size * size3 != fArr.length) {
                            bhuj.m101555a().mo64362d("Model misconfigured or loaded incorrectly");
                            bxwc = bxwc2;
                            i2 = size2;
                            fArr = null;
                        } else {
                            float[] fArr2 = new float[(size * i7)];
                            int i8 = 0;
                            while (i8 < i7) {
                                int i9 = 0;
                                while (i9 < size) {
                                    int i10 = (i9 * i7) + i8;
                                    fArr2[i10] = f4;
                                    int i11 = 0;
                                    while (i11 < size3) {
                                        fArr2[i10] = fArr2[i10] + (fArr[(i9 * size3) + i11] * bvpc2.f157264a.mo73923b((i8 * size3) + i11));
                                        i11++;
                                        bxwc2 = bxwc2;
                                        size2 = size2;
                                    }
                                    bxwc bxwc3 = bxwc2;
                                    int i12 = size2;
                                    float b = fArr2[i10] + bvpc2.f157265b.mo73923b(i8);
                                    fArr2[i10] = b;
                                    if (i7 != 1 && !bvpc2.f157267d) {
                                        fArr2[i10] = bhxi.m101704a(b);
                                    }
                                    i9++;
                                    bxwc2 = bxwc3;
                                    size2 = i12;
                                    f4 = 0.0f;
                                }
                                i8++;
                                f4 = 0.0f;
                            }
                            if (bvpc2.f157267d) {
                                float[] a = m101621a(fArr2, size, i7);
                                for (int i13 = 0; i13 < a.length; i13++) {
                                    a[i13] = bhxi.m101704a(a[i13]);
                                }
                                bxwc = bxwc2;
                                fArr = a;
                                i2 = size2;
                            } else {
                                bxwc = bxwc2;
                                i2 = size2;
                                fArr = fArr2;
                            }
                        }
                    } else {
                        bxwc = bxwc2;
                        i2 = size2;
                        bhuj.m101555a().mo64362d("Model misconfigured or loaded incorrectly");
                        fArr = null;
                    }
                } else {
                    bxwc = bxwc2;
                    i2 = size2;
                    bhuj.m101555a();
                    int i14 = bvpc2.f157268e;
                    int i15 = bhvm.f119688a;
                    StringBuilder sb = new StringBuilder(90);
                    sb.append("Bypass layer processing, model pass id: ");
                    sb.append(i14);
                    sb.append(", inference helper pass id: ");
                    sb.append(i15);
                    sb.toString();
                }
                i6++;
                if (!m101620a(fArr)) {
                    return new float[size];
                }
                bxwc2 = bxwc;
                size2 = i2;
                f4 = 0.0f;
            }
        } else {
            int i16 = 0;
            while (i16 < brtm.mo69903L()) {
                brtm e2 = brtm.mo69925e(i16);
                if (e2.mo69902K() != bhvm.f119688a) {
                    bhuj.m101555a();
                    int K = e2.mo69902K();
                    int i17 = bhvm.f119688a;
                    StringBuilder sb2 = new StringBuilder(90);
                    sb2.append("Bypass layer processing, model pass id: ");
                    sb2.append(K);
                    sb2.append(", inference helper pass id: ");
                    sb2.append(i17);
                    sb2.toString();
                } else {
                    int I = e2.mo69900I();
                    if (e2.mo69899H() % I != 0) {
                        bhuj.m101555a().mo64362d("Model misconfigured or loaded incorrectly");
                        fArr = null;
                    } else {
                        int H = e2.mo69899H() / I;
                        if (size * H != fArr.length) {
                            bhuj.m101555a().mo64362d("Model misconfigured or loaded incorrectly");
                            fArr = null;
                        } else {
                            float[] fArr3 = new float[(size * I)];
                            int i18 = 0;
                            while (i18 < I) {
                                int i19 = 0;
                                while (i19 < size) {
                                    int i20 = (i19 * I) + i18;
                                    fArr3[i20] = 0.0f;
                                    int i21 = 0;
                                    while (i21 < H) {
                                        float f5 = fArr3[i20];
                                        float f6 = fArr[(i19 * H) + i21];
                                        int i22 = (i18 * H) + i21;
                                        int i23 = i16;
                                        int __offset = e2.__offset(4);
                                        if (__offset != 0) {
                                            i = H;
                                            f2 = e2.f143329bb.getFloat(e2.__vector(__offset) + (i22 * 4));
                                        } else {
                                            i = H;
                                            f2 = 0.0f;
                                        }
                                        fArr3[i20] = f5 + (f6 * f2);
                                        i21++;
                                        H = i;
                                        i16 = i23;
                                    }
                                    int i24 = i16;
                                    int i25 = H;
                                    float f7 = fArr3[i20];
                                    int __offset2 = e2.__offset(6);
                                    if (__offset2 != 0) {
                                        f = e2.f143329bb.getFloat(e2.__vector(__offset2) + (i18 * 4));
                                    } else {
                                        f = 0.0f;
                                    }
                                    fArr3[i20] = f7 + f;
                                    if (I != 1 && !e2.mo69901J()) {
                                        fArr3[i20] = bhxi.m101704a(fArr3[i20]);
                                    }
                                    i19++;
                                    H = i25;
                                    i16 = i24;
                                }
                                i18++;
                                bhvm = this;
                            }
                            if (e2.mo69901J()) {
                                float[] a2 = m101621a(fArr3, size, I);
                                for (int i26 = 0; i26 < a2.length; i26++) {
                                    a2[i26] = bhxi.m101704a(a2[i26]);
                                }
                                fArr = a2;
                            } else {
                                fArr = fArr3;
                            }
                        }
                    }
                }
                if (!m101620a(fArr)) {
                    return new float[size];
                }
                i16++;
            }
        }
        if (fArr.length == size) {
            return fArr;
        }
        bhuj.m101555a().mo64362d("Model misconfigured or loaded incorrectly");
        return new float[size];
    }
}
