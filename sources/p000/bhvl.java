package p000;

import java.util.List;

/* renamed from: bhvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhvl implements bhve {

    /* renamed from: a */
    private static final Integer[] f119686a = {30, 29, 31};

    /* renamed from: b */
    private static final Integer[] f119687b = {33, 32, 34};

    /* renamed from: a */
    private static long m101617a(bvod bvod) {
        if ((bvod.f157014a & 8) != 0) {
            return bvod.f157018e;
        }
        return -1;
    }

    /* renamed from: a */
    public final String mo64340a() {
        return "Wifi";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011e, code lost:
        if (r18 != false) goto L_0x0123;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0145 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0145 A[SYNTHETIC] */
    /* renamed from: a */
    public final bhvi mo64339a(bhtx bhtx, List list) {
        bvod bvod;
        boolean z;
        int a;
        int i;
        int i2;
        int i3;
        bhtx bhtx2 = bhtx;
        List list2 = list;
        if (bhtx2.f119581b == null) {
            bhuj.m101555a();
            return null;
        }
        bhuj.m101555a();
        List a2 = bhvc.m101600a(list.size());
        bhwr bhwr = bhtx2.f119581b;
        for (int i4 = 0; i4 < list.size(); i4++) {
            bhue bhue = new bhue();
            bxwc bxwc = ((bhsu) list2.get(i4)).f119498a.f157004i;
            int size = bxwc.size();
            for (int i5 = 0; i5 < size; i5++) {
                bvod bvod2 = (bvod) bxwc.get(i5);
                int i6 = bvod2.f157014a;
                int i7 = 1;
                if ((i6 & 4) != 0 && (i6 & 1) != 0) {
                    bvnq bvnq = bvod2.f157015b;
                    if (bvnq == null) {
                        bvnq = bvnq.f156961b;
                    }
                    float a3 = bhvc.m101598a(bhwr, bvnq.f156963a, m101617a(bvod2));
                    bvod bvod3 = bvod2;
                    if (((double) a3) >= 1.0E-6d || bhwr.mo64366a() <= 0) {
                        bvod = bvod3;
                    } else {
                        bvod = bvod3;
                        bvnq bvnq2 = bvod.f157015b;
                        if (bvnq2 == null) {
                            bvnq2 = bvnq.f156961b;
                        }
                        if (bvnq2.f156963a.size() > 0) {
                            z = true;
                            a = bvoc.m121310a(bvod.f157017d);
                            if (a != 0) {
                                i7 = a;
                            }
                            i = i7 - 1;
                            if (i != 0) {
                                i3 = 29;
                                i2 = 23;
                            } else if (i != 4) {
                                i3 = null;
                                i2 = null;
                            } else {
                                i3 = 30;
                                i2 = 22;
                            }
                            if (i3 == null) {
                                bhue.mo64306a(i3, Float.valueOf(a3));
                                if (z) {
                                    bhue.mo64306a(i2, Float.valueOf(1.0f));
                                }
                            }
                        }
                    }
                    z = false;
                    a = bvoc.m121310a(bvod.f157017d);
                    if (a != 0) {
                    }
                    i = i7 - 1;
                    if (i != 0) {
                    }
                    if (i3 == null) {
                    }
                } else if ((i6 & 2) != 0) {
                    bvno bvno = bvod2.f157016c;
                    if (bvno == null) {
                        bvno = bvno.f156953b;
                    }
                    bxwc bxwc2 = bvno.f156955a;
                    int size2 = bxwc2.size();
                    float f = 0.0f;
                    boolean z2 = false;
                    for (int i8 = 0; i8 < size2; i8++) {
                        bvnq bvnq3 = (bvnq) bxwc2.get(i8);
                        if (bvnq3.f156963a.size() > 0) {
                            float a4 = bhvc.m101598a(bhwr, bvnq3.f156963a, m101617a(bvod2));
                            if (a4 > f) {
                                f = a4;
                            }
                            z2 = true;
                        }
                    }
                    if (((double) f) < 1.0E-6d) {
                        if (bhwr.mo64366a() <= 0) {
                            i7 = 0;
                        }
                        bhue.mo64306a(31, Float.valueOf(f));
                        if (i7 == 0) {
                            bhue.mo64306a(24, Float.valueOf(1.0f));
                        }
                    }
                    i7 = 0;
                    bhue.mo64306a(31, Float.valueOf(f));
                    if (i7 == 0) {
                    }
                } else {
                    bhuj.m101555a();
                }
            }
            int i9 = 0;
            while (true) {
                Integer[] numArr = f119686a;
                if (i9 >= numArr.length) {
                    break;
                }
                if (!bhue.f119618a.containsKey(numArr[i9])) {
                    bhue.mo64306a(f119687b[i9], Float.valueOf(1.0f));
                }
                i9++;
            }
            a2.set(i4, bhue);
        }
        return new bhvi(list2, a2);
    }
}
