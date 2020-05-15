package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: xn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1491xn {

    /* renamed from: a */
    public final ArrayList f27591a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f27592b = new ArrayList();

    /* renamed from: c */
    final aat f27593c;

    /* renamed from: d */
    public int f27594d = 0;

    /* renamed from: e */
    final abg f27595e;

    /* renamed from: f */
    private final C1241og f27596f = new C1242oh(30);

    /* renamed from: b */
    private final int m20795b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = this.f27592b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1490xm xmVar = (C1490xm) this.f27592b.get(size);
            int i7 = xmVar.f27587a;
            if (i7 == 8) {
                int i8 = xmVar.f27588b;
                int i9 = xmVar.f27590d;
                int i10 = i8 < i9 ? i9 : i8;
                int i11 = i8 < i9 ? i8 : i9;
                if (i < i11 || i > i10) {
                    if (i < i8) {
                        if (i2 == 1) {
                            xmVar.f27588b = i8 + 1;
                            i4 = i9 + 1;
                        } else if (i2 == 2) {
                            xmVar.f27588b = i8 - 1;
                            i4 = i9 - 1;
                        }
                        xmVar.f27590d = i4;
                    }
                } else if (i11 != i8) {
                    if (i2 == 1) {
                        i6 = i8 + 1;
                    } else {
                        if (i2 == 2) {
                            i6 = i8 - 1;
                        }
                        i--;
                    }
                    xmVar.f27588b = i6;
                    i--;
                } else {
                    if (i2 == 1) {
                        i5 = i9 + 1;
                    } else {
                        if (i2 == 2) {
                            i5 = i9 - 1;
                        }
                        i++;
                    }
                    xmVar.f27590d = i5;
                    i++;
                }
            } else {
                int i12 = xmVar.f27588b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    xmVar.f27588b = i3;
                } else if (i7 == 1) {
                    i -= xmVar.f27590d;
                } else if (i7 == 2) {
                    i += xmVar.f27590d;
                }
            }
        }
        for (int size2 = this.f27592b.size() - 1; size2 >= 0; size2--) {
            C1490xm xmVar2 = (C1490xm) this.f27592b.get(size2);
            if (xmVar2.f27587a == 8) {
                int i13 = xmVar2.f27590d;
                if (i13 == xmVar2.f27588b || i13 < 0) {
                    this.f27592b.remove(size2);
                    mo16484a(xmVar2);
                }
            } else if (xmVar2.f27590d <= 0) {
                this.f27592b.remove(size2);
                mo16484a(xmVar2);
            }
        }
        return i;
    }

    /* renamed from: c */
    private final void m20797c(C1490xm xmVar) {
        this.f27592b.add(xmVar);
        int i = xmVar.f27587a;
        if (i == 1) {
            this.f27595e.mo155b(xmVar.f27588b, xmVar.f27590d);
        } else if (i == 2) {
            abg abg = this.f27595e;
            abg.f101a.offsetPositionRecordsForRemove(xmVar.f27588b, xmVar.f27590d, false);
            abg.f101a.mItemsAddedOrRemoved = true;
        } else if (i == 4) {
            this.f27595e.mo153a(xmVar.f27588b, xmVar.f27590d, xmVar.f27589c);
        } else if (i == 8) {
            this.f27595e.mo156c(xmVar.f27588b, xmVar.f27590d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + xmVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo16480a(int i, int i2) {
        int size = this.f27592b.size();
        while (i2 < size) {
            C1490xm xmVar = (C1490xm) this.f27592b.get(i2);
            int i3 = xmVar.f27587a;
            if (i3 == 8) {
                int i4 = xmVar.f27588b;
                if (i4 == i) {
                    i = xmVar.f27590d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (xmVar.f27590d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = xmVar.f27588b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = xmVar.f27590d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += xmVar.f27590d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: a */
    public final boolean mo16486a(int i) {
        return (i & this.f27594d) != 0;
    }

    /* renamed from: d */
    public final boolean mo16490d() {
        return this.f27591a.size() > 0;
    }

    /* renamed from: e */
    public final void mo16491e() {
        mo16489c();
        int size = this.f27591a.size();
        for (int i = 0; i < size; i++) {
            C1490xm xmVar = (C1490xm) this.f27591a.get(i);
            int i2 = xmVar.f27587a;
            if (i2 == 1) {
                this.f27595e.mo154a(xmVar);
                this.f27595e.mo155b(xmVar.f27588b, xmVar.f27590d);
            } else if (i2 == 2) {
                this.f27595e.mo154a(xmVar);
                this.f27595e.mo152a(xmVar.f27588b, xmVar.f27590d);
            } else if (i2 == 4) {
                this.f27595e.mo154a(xmVar);
                this.f27595e.mo153a(xmVar.f27588b, xmVar.f27590d, xmVar.f27589c);
            } else if (i2 == 8) {
                this.f27595e.mo154a(xmVar);
                this.f27595e.mo156c(xmVar.f27588b, xmVar.f27590d);
            }
        }
        mo16483a(this.f27591a);
        this.f27594d = 0;
    }

    public C1491xn(abg abg) {
        this.f27595e = abg;
        this.f27593c = new aat(this);
    }

    /* renamed from: a */
    public final C1490xm mo16481a(int i, int i2, int i3, Object obj) {
        C1490xm xmVar = (C1490xm) this.f27596f.mo8188a();
        if (xmVar == null) {
            return new C1490xm(i, i2, i3, obj);
        }
        xmVar.f27587a = i;
        xmVar.f27588b = i2;
        xmVar.f27590d = i3;
        xmVar.f27589c = obj;
        return xmVar;
    }

    /* renamed from: c */
    private final boolean m20798c(int i) {
        int size = this.f27592b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1490xm xmVar = (C1490xm) this.f27592b.get(i2);
            int i3 = xmVar.f27587a;
            if (i3 == 8) {
                if (mo16480a(xmVar.f27590d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = xmVar.f27588b;
                int i5 = xmVar.f27590d + i4;
                while (i4 < i5) {
                    if (mo16480a(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m20796b(C1490xm xmVar) {
        int i;
        int i2 = xmVar.f27587a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b = m20795b(xmVar.f27588b, i2);
        int i3 = xmVar.f27588b;
        int i4 = xmVar.f27587a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + xmVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < xmVar.f27590d; i6++) {
            int b2 = m20795b(xmVar.f27588b + (i * i6), xmVar.f27587a);
            int i7 = xmVar.f27587a;
            if (i7 == 2 ? b2 != b : !(i7 == 4 && b2 == b + 1)) {
                C1490xm a = mo16481a(i7, b, i5, xmVar.f27589c);
                mo16485a(a, i3);
                mo16484a(a);
                if (xmVar.f27587a == 4) {
                    i3 += i5;
                }
                b = b2;
                i5 = 1;
            } else {
                i5++;
            }
        }
        Object obj = xmVar.f27589c;
        mo16484a(xmVar);
        if (i5 > 0) {
            C1490xm a2 = mo16481a(xmVar.f27587a, b, i5, obj);
            mo16485a(a2, i3);
            mo16484a(a2);
        }
    }

    /* renamed from: a */
    public final void mo16482a() {
        mo16483a(this.f27591a);
        mo16483a(this.f27592b);
        this.f27594d = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16483a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo16484a((C1490xm) list.get(i));
        }
        list.clear();
    }

    /* renamed from: c */
    public final void mo16489c() {
        int size = this.f27592b.size();
        for (int i = 0; i < size; i++) {
            this.f27595e.mo154a((C1490xm) this.f27592b.get(i));
        }
        mo16483a(this.f27592b);
        this.f27594d = 0;
    }

    /* renamed from: a */
    public final void mo16484a(C1490xm xmVar) {
        xmVar.f27589c = null;
        this.f27596f.mo8189a(xmVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16485a(C1490xm xmVar, int i) {
        this.f27595e.mo154a(xmVar);
        int i2 = xmVar.f27587a;
        if (i2 == 2) {
            this.f27595e.mo152a(i, xmVar.f27590d);
        } else if (i2 == 4) {
            this.f27595e.mo153a(i, xmVar.f27590d, xmVar.f27589c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo16487b(int i) {
        return mo16480a(i, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009d  */
    /* renamed from: b */
    public final void mo16488b() {
        char c;
        boolean z;
        boolean z2;
        boolean z3;
        C1490xm xmVar;
        int i;
        int i2;
        aat aat = this.f27593c;
        ArrayList arrayList = this.f27591a;
        while (true) {
            int i3 = -1;
            int size = arrayList.size() - 1;
            boolean z4 = false;
            boolean z5 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C1490xm) arrayList.get(size)).f27587a != 8) {
                    z5 = true;
                } else if (z5) {
                    break;
                }
                size--;
            }
            C1490xm xmVar2 = null;
            if (size == -1) {
                break;
            }
            int i4 = size + 1;
            C1490xm xmVar3 = (C1490xm) arrayList.get(size);
            C1490xm xmVar4 = (C1490xm) arrayList.get(i4);
            int i5 = xmVar4.f27587a;
            if (i5 == 1) {
                int i6 = xmVar3.f27590d;
                int i7 = xmVar4.f27588b;
                if (i6 >= i7) {
                    i3 = 0;
                }
                int i8 = xmVar3.f27588b;
                if (i8 < i7) {
                    i3++;
                }
                if (i8 >= i7) {
                    xmVar3.f27588b = i8 + xmVar4.f27590d;
                }
                int i9 = xmVar4.f27588b;
                if (i9 <= i6) {
                    xmVar3.f27590d = i6 + xmVar4.f27590d;
                }
                xmVar4.f27588b = i9 + i3;
                arrayList.set(size, xmVar4);
                arrayList.set(i4, xmVar3);
            } else if (i5 == 2) {
                int i10 = xmVar3.f27588b;
                int i11 = xmVar3.f27590d;
                if (i10 < i11) {
                    if (xmVar4.f27588b == i10 && xmVar4.f27590d == i11 - i10) {
                        z3 = false;
                        z4 = true;
                    } else {
                        z3 = false;
                    }
                } else if (xmVar4.f27588b == i11 + 1 && xmVar4.f27590d == i10 - i11) {
                    z3 = true;
                    z4 = true;
                } else {
                    z3 = true;
                }
                int i12 = xmVar4.f27588b;
                if (i11 < i12) {
                    i12--;
                    xmVar4.f27588b = i12;
                } else {
                    int i13 = xmVar4.f27590d;
                    if (i11 < i12 + i13) {
                        xmVar4.f27590d = i13 - 1;
                        xmVar3.f27587a = 2;
                        xmVar3.f27590d = 1;
                        if (xmVar4.f27590d == 0) {
                            arrayList.remove(i4);
                            aat.f86a.mo16484a(xmVar4);
                        }
                    }
                }
                int i14 = xmVar3.f27588b;
                if (i14 > i12) {
                    int i15 = i12 + xmVar4.f27590d;
                    if (i14 < i15) {
                        xmVar2 = aat.f86a.mo16481a(2, i14 + 1, i15 - i14, null);
                        xmVar4.f27590d = xmVar3.f27588b - xmVar4.f27588b;
                    }
                } else {
                    xmVar4.f27588b = i12 + 1;
                }
                if (z4) {
                    arrayList.set(size, xmVar4);
                    arrayList.remove(i4);
                    aat.f86a.mo16484a(xmVar3);
                } else {
                    if (!z3) {
                        if (xmVar2 != null) {
                            int i16 = xmVar3.f27588b;
                            if (i16 >= xmVar2.f27588b) {
                                xmVar3.f27588b = i16 - xmVar2.f27590d;
                            }
                            int i17 = xmVar3.f27590d;
                            if (i17 >= xmVar2.f27588b) {
                                xmVar3.f27590d = i17 - xmVar2.f27590d;
                            }
                        }
                        int i18 = xmVar3.f27588b;
                        if (i18 >= xmVar4.f27588b) {
                            xmVar3.f27588b = i18 - xmVar4.f27590d;
                        }
                        int i19 = xmVar3.f27590d;
                        if (i19 >= xmVar4.f27588b) {
                            xmVar3.f27590d = i19 - xmVar4.f27590d;
                        }
                    } else {
                        if (xmVar2 != null) {
                            int i20 = xmVar3.f27588b;
                            if (i20 > xmVar2.f27588b) {
                                xmVar3.f27588b = i20 - xmVar2.f27590d;
                            }
                            int i21 = xmVar3.f27590d;
                            if (i21 > xmVar2.f27588b) {
                                xmVar3.f27590d = i21 - xmVar2.f27590d;
                            }
                        }
                        int i22 = xmVar3.f27588b;
                        if (i22 > xmVar4.f27588b) {
                            xmVar3.f27588b = i22 - xmVar4.f27590d;
                        }
                        int i23 = xmVar3.f27590d;
                        if (i23 > xmVar4.f27588b) {
                            xmVar3.f27590d = i23 - xmVar4.f27590d;
                        }
                    }
                    arrayList.set(size, xmVar4);
                    if (xmVar3.f27588b != xmVar3.f27590d) {
                        arrayList.set(i4, xmVar3);
                    } else {
                        arrayList.remove(i4);
                    }
                    if (xmVar2 != null) {
                        arrayList.add(size, xmVar2);
                    }
                }
            } else if (i5 == 4) {
                int i24 = xmVar3.f27590d;
                int i25 = xmVar4.f27588b;
                if (i24 >= i25) {
                    int i26 = xmVar4.f27590d;
                    if (i24 < i25 + i26) {
                        xmVar4.f27590d = i26 - 1;
                        xmVar = aat.f86a.mo16481a(4, xmVar3.f27588b, 1, xmVar4.f27589c);
                        i = xmVar3.f27588b;
                        i2 = xmVar4.f27588b;
                        if (i <= i2) {
                            int i27 = i2 + xmVar4.f27590d;
                            if (i < i27) {
                                int i28 = i27 - i;
                                xmVar2 = aat.f86a.mo16481a(4, i + 1, i28, xmVar4.f27589c);
                                xmVar4.f27590d -= i28;
                            }
                        } else {
                            xmVar4.f27588b = i2 + 1;
                        }
                        arrayList.set(i4, xmVar3);
                        if (xmVar4.f27590d <= 0) {
                            arrayList.set(size, xmVar4);
                        } else {
                            arrayList.remove(size);
                            aat.f86a.mo16484a(xmVar4);
                        }
                        if (xmVar != null) {
                            arrayList.add(size, xmVar);
                        }
                        if (xmVar2 == null) {
                            arrayList.add(size, xmVar2);
                        }
                    }
                } else {
                    xmVar4.f27588b = i25 - 1;
                }
                xmVar = null;
                i = xmVar3.f27588b;
                i2 = xmVar4.f27588b;
                if (i <= i2) {
                }
                arrayList.set(i4, xmVar3);
                if (xmVar4.f27590d <= 0) {
                }
                if (xmVar != null) {
                }
                if (xmVar2 == null) {
                }
            }
        }
        int size2 = this.f27591a.size();
        for (int i29 = 0; i29 < size2; i29++) {
            C1490xm xmVar5 = (C1490xm) this.f27591a.get(i29);
            int i30 = xmVar5.f27587a;
            if (i30 == 1) {
                m20797c(xmVar5);
            } else if (i30 == 2) {
                int i31 = xmVar5.f27588b;
                int i32 = xmVar5.f27590d + i31;
                int i33 = i31;
                int i34 = 0;
                char c2 = 65535;
                while (i33 < i32) {
                    if (this.f27595e.mo151a(i33) != null || m20798c(i33)) {
                        if (c2 == 0) {
                            m20796b(mo16481a(2, i31, i34, null));
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c = 1;
                    } else {
                        if (c2 == 1) {
                            m20797c(mo16481a(2, i31, i34, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 0;
                    }
                    if (z) {
                        i33 -= i34;
                        i32 -= i34;
                        i34 = 1;
                    } else {
                        i34++;
                    }
                    i33++;
                    c2 = c;
                }
                if (i34 != xmVar5.f27590d) {
                    mo16484a(xmVar5);
                    xmVar5 = mo16481a(2, i31, i34, null);
                }
                if (c2 != 0) {
                    m20797c(xmVar5);
                } else {
                    m20796b(xmVar5);
                }
            } else if (i30 == 4) {
                int i35 = xmVar5.f27588b;
                int i36 = xmVar5.f27590d + i35;
                int i37 = i35;
                int i38 = 0;
                char c3 = 65535;
                while (i35 < i36) {
                    if (this.f27595e.mo151a(i35) != null || m20798c(i35)) {
                        if (c3 == 0) {
                            m20796b(mo16481a(4, i37, i38, xmVar5.f27589c));
                            i37 = i35;
                            i38 = 0;
                        }
                        c3 = 1;
                    } else {
                        if (c3 == 1) {
                            m20797c(mo16481a(4, i37, i38, xmVar5.f27589c));
                            i37 = i35;
                            i38 = 0;
                        }
                        c3 = 0;
                    }
                    i38++;
                    i35++;
                }
                if (i38 != xmVar5.f27590d) {
                    Object obj = xmVar5.f27589c;
                    mo16484a(xmVar5);
                    xmVar5 = mo16481a(4, i37, i38, obj);
                }
                if (c3 != 0) {
                    m20797c(xmVar5);
                } else {
                    m20796b(xmVar5);
                }
            } else if (i30 == 8) {
                m20797c(xmVar5);
            }
        }
        this.f27591a.clear();
    }
}
