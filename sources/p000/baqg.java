package p000;

import java.util.List;

/* renamed from: baqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baqg {

    /* renamed from: a */
    public final byjh f101554a;

    private baqg(byjh byjh) {
        this.f101554a = byjh;
    }

    /* renamed from: a */
    public static baqg m87393a(byjh byjh) {
        return new baqg(byjh);
    }

    /* renamed from: a */
    private static byje m87394a(List list, boolean z) {
        boolean z2;
        int i;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            byje byje = (byje) list.get(i2);
            bxwc bxwc = byje.f166645b;
            int size2 = bxwc.size();
            int i3 = 0;
            while (true) {
                z2 = true;
                if (i3 >= size2) {
                    break;
                }
                byjd byjd = (byjd) bxwc.get(i3);
                int i4 = byjd.f166640a;
                if (i4 != 0) {
                    i = i4 != 1 ? 0 : 1;
                } else {
                    i = 2;
                }
                int i5 = i - 1;
                if (i != 0) {
                    if (i5 == 0) {
                        if ((i4 == 1 ? ((Boolean) byjd.f166641b).booleanValue() : false) != z) {
                            z2 = false;
                            break;
                        }
                    }
                    i3++;
                } else {
                    throw null;
                }
            }
            i2++;
            if (z2) {
                return byje;
            }
        }
        return byje.f166642e;
    }

    /* renamed from: a */
    public static final Integer m87395a(byjh byjh, List list, boolean z, Integer num) {
        int a = byjg.m124871a(byjh.f166652b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 1) {
            if (i != 2) {
                return num;
            }
            byje a2 = m87394a(list, z);
            if (a2.f166646c) {
                return Integer.valueOf(a2.f166647d);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final boolean m87396a(byjh byjh, List list, boolean z) {
        int a = byjg.m124871a(byjh.f166652b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return true;
        }
        return m87394a(list, z).f166646c;
    }

    /* renamed from: a */
    public final Integer mo55886a(boolean z, Integer num) {
        byjh byjh = this.f101554a;
        return m87395a(byjh, byjh.f166653c, z, num);
    }
}
