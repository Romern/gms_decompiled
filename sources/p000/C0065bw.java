package p000;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: bw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0065bw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0915ct f5838a;

    /* renamed from: b */
    final /* synthetic */ C0915ct f5839b;

    /* renamed from: c */
    final /* synthetic */ int f5840c;

    /* renamed from: d */
    final /* synthetic */ C0915ct f5841d;

    /* renamed from: e */
    final /* synthetic */ C0066bx f5842e;

    public C0065bw(C0066bx bxVar, C0915ct ctVar, C0915ct ctVar2, int i, C0915ct ctVar3) {
        this.f5842e = bxVar;
        this.f5838a = ctVar;
        this.f5839b = ctVar2;
        this.f5840c = i;
        this.f5841d = ctVar3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0221  */
    public final void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        C1409um umVar;
        ArrayList arrayList3;
        C1404uh uhVar;
        int i;
        C1409um umVar2;
        C1409um umVar3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList4;
        int i9;
        C0918cw cwVar = this.f5838a.f11998l;
        C0918cw cwVar2 = this.f5839b.f11998l;
        C1406uj ujVar = this.f5842e.f5932b.f27238b;
        int a = cwVar.mo8348a();
        C0919cx cxVar = new C0919cx(cwVar, a, cwVar2, (cwVar.size() - a) - cwVar.mo8349b(), (cwVar2.size() - cwVar2.mo8348a()) - cwVar2.mo8349b());
        int i10 = cxVar.f12310d;
        int i11 = cxVar.f12311e;
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new C1408ul(i10, i11));
        int i12 = i10 + i11;
        int i13 = 1;
        int i14 = (i12 + 1) / 2;
        int i15 = i14 + i14 + 1;
        C1403ug ugVar = new C1403ug(i15);
        C1403ug ugVar2 = new C1403ug(i15);
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            C1408ul ulVar = (C1408ul) arrayList6.remove(arrayList6.size() - 1);
            if (ulVar.mo16086a() > 0 && ulVar.mo16087b() > 0) {
                int a2 = ((ulVar.mo16086a() + ulVar.mo16087b()) + i13) / 2;
                ugVar.mo16082a(i13, ulVar.f27261a);
                ugVar2.mo16082a(i13, ulVar.f27262b);
                int i16 = 0;
                while (true) {
                    if (i16 >= a2) {
                        break;
                    }
                    int abs = Math.abs(ulVar.mo16086a() - ulVar.mo16087b()) % 2;
                    int a3 = ulVar.mo16086a() - ulVar.mo16087b();
                    int i17 = -i16;
                    int i18 = i17;
                    while (true) {
                        if (i18 > i16) {
                            arrayList2 = arrayList6;
                            i = a2;
                            umVar2 = null;
                            break;
                        }
                        if (i18 != i17 && (i18 == i16 || ugVar.mo16081a(i18 + 1) <= ugVar.mo16081a(i18 - 1))) {
                            int a4 = ugVar.mo16081a(i18 - 1);
                            i6 = a4;
                            i7 = a4 + 1;
                        } else {
                            i7 = ugVar.mo16081a(i18 + 1);
                            i6 = i7;
                        }
                        i = a2;
                        int i19 = (ulVar.f27263c + (i7 - ulVar.f27261a)) - i18;
                        if (i16 != 0 && i7 == i6) {
                            i8 = i19 - 1;
                        } else {
                            i8 = i19;
                        }
                        while (true) {
                            arrayList2 = arrayList6;
                            if (i7 >= ulVar.f27262b || i19 >= ulVar.f27264d || !cxVar.mo8380b(i7, i19)) {
                                ugVar.mo16082a(i18, i7);
                            } else {
                                i7++;
                                i19++;
                                arrayList6 = arrayList2;
                            }
                        }
                        ugVar.mo16082a(i18, i7);
                        if (abs == 1) {
                            int i20 = a3 - i18;
                            i9 = abs;
                            if (i20 < i17 + 1) {
                                arrayList4 = arrayList5;
                            } else if (i20 > i16 - 1) {
                                arrayList4 = arrayList5;
                            } else if (ugVar2.mo16081a(i20) <= i7) {
                                umVar2 = new C1409um();
                                umVar2.f27265a = i6;
                                umVar2.f27266b = i8;
                                umVar2.f27267c = i7;
                                umVar2.f27268d = i19;
                                umVar2.f27269e = false;
                                break;
                            } else {
                                arrayList4 = arrayList5;
                            }
                        } else {
                            arrayList4 = arrayList5;
                            i9 = abs;
                        }
                        i18 += 2;
                        a2 = i;
                        arrayList6 = arrayList2;
                        abs = i9;
                        arrayList5 = arrayList4;
                    }
                    if (umVar2 != null) {
                        arrayList = arrayList5;
                        umVar = umVar2;
                        break;
                    }
                    int a5 = (ulVar.mo16086a() - ulVar.mo16087b()) % 2;
                    int a6 = ulVar.mo16086a() - ulVar.mo16087b();
                    int i21 = i17;
                    while (true) {
                        if (i21 > i16) {
                            arrayList = arrayList5;
                            umVar3 = null;
                            break;
                        }
                        if (i21 != i17 && (i21 == i16 || ugVar2.mo16081a(i21 + 1) >= ugVar2.mo16081a(i21 - 1))) {
                            int a7 = ugVar2.mo16081a(i21 - 1);
                            i2 = a7;
                            i3 = a7 - 1;
                        } else {
                            i3 = ugVar2.mo16081a(i21 + 1);
                            i2 = i3;
                        }
                        int i22 = ulVar.f27264d - ((ulVar.f27262b - i3) - i21);
                        if (i16 != 0 && i3 == i2) {
                            i4 = i22 + 1;
                        } else {
                            i4 = i22;
                        }
                        while (true) {
                            if (i3 > ulVar.f27261a && i22 > ulVar.f27263c) {
                                int i23 = i3 - 1;
                                arrayList = arrayList5;
                                int i24 = i22 - 1;
                                if (!cxVar.mo8380b(i23, i24)) {
                                    break;
                                }
                                i3 = i23;
                                i22 = i24;
                                arrayList5 = arrayList;
                            } else {
                                arrayList = arrayList5;
                            }
                        }
                        arrayList = arrayList5;
                        ugVar2.mo16082a(i21, i3);
                        if (a5 == 0 && (i5 = a6 - i21) >= i17 && i5 <= i16 && ugVar.mo16081a(i5) >= i3) {
                            umVar3 = new C1409um();
                            umVar3.f27265a = i3;
                            umVar3.f27266b = i22;
                            umVar3.f27267c = i2;
                            umVar3.f27268d = i4;
                            umVar3.f27269e = true;
                            break;
                        }
                        i21 += 2;
                        arrayList5 = arrayList;
                    }
                    if (umVar3 != null) {
                        umVar = umVar3;
                        break;
                    }
                    i16++;
                    a2 = i;
                    arrayList6 = arrayList2;
                    arrayList5 = arrayList;
                }
                if (umVar != null) {
                    arrayList7.add(ulVar);
                    arrayList6 = arrayList2;
                    arrayList5 = arrayList;
                    i13 = 1;
                } else {
                    if (umVar.mo16088a() > 0) {
                        int i25 = umVar.f27268d;
                        int i26 = umVar.f27266b;
                        int i27 = i25 - i26;
                        int i28 = umVar.f27267c;
                        int i29 = umVar.f27265a;
                        int i30 = i28 - i29;
                        if (i27 == i30) {
                            uhVar = new C1404uh(i29, i26, i30);
                        } else if (umVar.f27269e) {
                            uhVar = new C1404uh(i29, i26, umVar.mo16088a());
                        } else if (i27 > i30) {
                            uhVar = new C1404uh(i29, i26 + 1, umVar.mo16088a());
                        } else {
                            uhVar = new C1404uh(i29 + 1, i26, umVar.mo16088a());
                        }
                        arrayList3 = arrayList;
                        arrayList3.add(uhVar);
                    } else {
                        arrayList3 = arrayList;
                    }
                    C1408ul ulVar2 = arrayList7.isEmpty() ? new C1408ul() : (C1408ul) arrayList7.remove(arrayList7.size() - 1);
                    ulVar2.f27261a = ulVar.f27261a;
                    ulVar2.f27263c = ulVar.f27263c;
                    ulVar2.f27262b = umVar.f27265a;
                    ulVar2.f27264d = umVar.f27266b;
                    arrayList6 = arrayList2;
                    arrayList6.add(ulVar2);
                    int i31 = ulVar.f27262b;
                    int i32 = ulVar.f27264d;
                    ulVar.f27261a = umVar.f27267c;
                    ulVar.f27263c = umVar.f27268d;
                    arrayList6.add(ulVar);
                    arrayList5 = arrayList3;
                    i13 = 1;
                }
            }
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            umVar = null;
            if (umVar != null) {
            }
        }
        Collections.sort(arrayList5, C1410un.f27270a);
        this.f5842e.f5933c.execute(new C0064bv(this, new C1405ui(cxVar, arrayList5, ugVar.f27246a, ugVar2.f27246a)));
    }
}
