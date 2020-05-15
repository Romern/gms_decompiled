package p000;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: ui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1405ui {

    /* renamed from: a */
    public final int[] f27251a;

    /* renamed from: b */
    public final int f27252b;

    /* renamed from: c */
    private final List f27253c;

    /* renamed from: d */
    private final int[] f27254d;

    /* renamed from: e */
    private final C1402uf f27255e;

    /* renamed from: f */
    private final int f27256f;

    /* renamed from: g */
    private final boolean f27257g = true;

    public C1405ui(C1402uf ufVar, List list, int[] iArr, int[] iArr2) {
        C1404uh uhVar;
        int i;
        int i2;
        int i3;
        this.f27253c = list;
        this.f27251a = iArr;
        this.f27254d = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(this.f27254d, 0);
        this.f27255e = ufVar;
        C0919cx cxVar = (C0919cx) ufVar;
        this.f27252b = cxVar.f12310d;
        this.f27256f = cxVar.f12311e;
        if (!this.f27253c.isEmpty()) {
            uhVar = (C1404uh) this.f27253c.get(0);
        } else {
            uhVar = null;
        }
        if (!(uhVar != null && uhVar.f27248a == 0 && uhVar.f27249b == 0)) {
            this.f27253c.add(0, new C1404uh(0, 0, 0));
        }
        this.f27253c.add(new C1404uh(this.f27252b, this.f27256f, 0));
        List list2 = this.f27253c;
        int size = list2.size();
        int i4 = 0;
        while (i4 < size) {
            C1404uh uhVar2 = (C1404uh) list2.get(i4);
            int i5 = 0;
            while (true) {
                i2 = i4 + 1;
                if (i5 >= uhVar2.f27250c) {
                    break;
                }
                int i6 = uhVar2.f27248a + i5;
                int i7 = uhVar2.f27249b + i5;
                if (!this.f27255e.mo8381c(i6, i7)) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                this.f27251a[i6] = (i7 << 4) | i3;
                this.f27254d[i7] = (i6 << 4) | i3;
                i5++;
            }
            i4 = i2;
        }
        if (this.f27257g) {
            List list3 = this.f27253c;
            int size2 = list3.size();
            int i8 = 0;
            for (int i9 = 0; i9 < size2; i9++) {
                C1404uh uhVar3 = (C1404uh) list3.get(i9);
                while (i8 < uhVar3.f27248a) {
                    if (this.f27251a[i8] == 0) {
                        int size3 = this.f27253c.size();
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            if (i10 >= size3) {
                                break;
                            }
                            C1404uh uhVar4 = (C1404uh) this.f27253c.get(i10);
                            while (i11 < uhVar4.f27249b) {
                                if (this.f27254d[i11] == 0 && this.f27255e.mo8380b(i8, i11)) {
                                    if (!this.f27255e.mo8381c(i8, i11)) {
                                        i = 4;
                                    } else {
                                        i = 8;
                                    }
                                    this.f27251a[i8] = (i11 << 4) | i;
                                    this.f27254d[i11] = i | (i8 << 4);
                                } else {
                                    i11++;
                                }
                            }
                            i11 = uhVar4.mo16084b();
                            i10++;
                        }
                    }
                    i8++;
                }
                i8 = uhVar3.mo16083a();
            }
        }
    }

    /* renamed from: a */
    private static C1407uk m20478a(Collection collection, int i, boolean z) {
        C1407uk ukVar;
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                ukVar = null;
                break;
            }
            ukVar = (C1407uk) it.next();
            if (ukVar.f27258a == i && ukVar.f27260c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C1407uk ukVar2 = (C1407uk) it.next();
            if (z) {
                ukVar2.f27259b--;
            } else {
                ukVar2.f27259b++;
            }
        }
        return ukVar;
    }

    /* renamed from: a */
    public final void mo16085a(C1411uo uoVar) {
        C1400ud udVar;
        int i;
        if (uoVar instanceof C1400ud) {
            udVar = (C1400ud) uoVar;
        } else {
            udVar = new C1400ud(uoVar);
        }
        int i2 = this.f27252b;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = this.f27252b;
        int i4 = this.f27256f;
        for (int size = this.f27253c.size() - 1; size >= 0; size--) {
            C1404uh uhVar = (C1404uh) this.f27253c.get(size);
            int a = uhVar.mo16083a();
            int b = uhVar.mo16084b();
            while (true) {
                if (i3 <= a) {
                    break;
                }
                i3--;
                int i5 = this.f27251a[i3];
                if ((i5 & 12) != 0) {
                    int i6 = i5 >> 4;
                    C1407uk a2 = m20478a(arrayDeque, i6, false);
                    if (a2 != null) {
                        int i7 = (i2 - a2.f27259b) - 1;
                        udVar.mo8387c(i3, i7);
                        if ((i5 & 4) != 0) {
                            udVar.mo8385a(i7, 1, this.f27255e.mo8379a(i3, i6));
                        }
                    } else {
                        arrayDeque.add(new C1407uk(i3, (i2 - i3) - 1, true));
                    }
                } else {
                    udVar.mo8386b(i3, 1);
                    i2--;
                }
            }
            while (i4 > b) {
                i4--;
                int i8 = this.f27254d[i4];
                if ((i8 & 12) != 0) {
                    int i9 = i8 >> 4;
                    C1407uk a3 = m20478a(arrayDeque, i9, true);
                    if (a3 == null) {
                        arrayDeque.add(new C1407uk(i4, i2 - i3, false));
                    } else {
                        udVar.mo8387c((i2 - a3.f27259b) - 1, i3);
                        if ((i8 & 4) != 0) {
                            udVar.mo8385a(i3, 1, this.f27255e.mo8379a(i9, i4));
                        }
                    }
                } else {
                    udVar.mo8384a(i3, 1);
                    i2++;
                }
            }
            int i10 = uhVar.f27248a;
            int i11 = uhVar.f27249b;
            for (i = 0; i < uhVar.f27250c; i++) {
                if ((this.f27251a[i10] & 15) == 2) {
                    udVar.mo8385a(i10, 1, this.f27255e.mo8379a(i10, i11));
                }
                i10++;
                i11++;
            }
            i3 = uhVar.f27248a;
            i4 = uhVar.f27249b;
        }
        udVar.mo16079a();
    }
}
