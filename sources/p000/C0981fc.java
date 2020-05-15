package p000;

import java.util.Arrays;

/* renamed from: fc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0981fc {

    /* renamed from: h */
    private static int f16244h = 1000;

    /* renamed from: a */
    int f16245a;

    /* renamed from: b */
    public final C0980fb f16246b;

    /* renamed from: c */
    public C0977ez[] f16247c;

    /* renamed from: d */
    public boolean[] f16248d;

    /* renamed from: e */
    public int f16249e;

    /* renamed from: f */
    public int f16250f;

    /* renamed from: g */
    public final C0979fa f16251g;

    /* renamed from: i */
    private int f16252i;

    /* renamed from: j */
    private int f16253j;

    /* renamed from: k */
    private int f16254k;

    /* renamed from: l */
    private C0983fe[] f16255l;

    /* renamed from: m */
    private int f16256m;

    /* renamed from: n */
    private C0977ez[] f16257n;

    public C0981fc() {
        this.f16245a = 0;
        this.f16246b = new C0980fb();
        this.f16252i = 32;
        this.f16253j = 32;
        this.f16247c = null;
        this.f16248d = new boolean[32];
        this.f16249e = 1;
        this.f16250f = 0;
        this.f16254k = 32;
        this.f16255l = new C0983fe[f16244h];
        this.f16256m = 0;
        this.f16257n = new C0977ez[32];
        this.f16247c = new C0977ez[32];
        m11431f();
        this.f16251g = new C0979fa();
    }

    /* renamed from: a */
    public static C0977ez m11426a(C0981fc fcVar, C0983fe feVar, C0983fe feVar2, int i, float f, C0983fe feVar3, C0983fe feVar4, int i2, boolean z) {
        C0977ez b = fcVar.mo10673b();
        b.mo10612a(feVar, feVar2, i, f, feVar3, feVar4, i2);
        if (z) {
            C0983fe d = fcVar.mo10677d();
            C0983fe d2 = fcVar.mo10677d();
            d.f16359c = 4;
            d2.f16359c = 4;
            b.mo10610a(d, d2);
        }
        return b;
    }

    /* renamed from: b */
    public static final int m11429b(Object obj) {
        C0983fe feVar = ((C0985fg) obj).f16491f;
        if (feVar != null) {
            return (int) (feVar.f16360d + 0.5f);
        }
        return 0;
    }

    /* renamed from: e */
    private final void m11430e() {
        int i = this.f16252i;
        int i2 = i + i;
        this.f16252i = i2;
        this.f16247c = (C0977ez[]) Arrays.copyOf(this.f16247c, i2);
        C0979fa faVar = this.f16251g;
        faVar.f16133a = (C0983fe[]) Arrays.copyOf(faVar.f16133a, this.f16252i);
        int i3 = this.f16252i;
        this.f16248d = new boolean[i3];
        this.f16253j = i3;
        this.f16254k = i3;
        this.f16246b.f16185a.clear();
    }

    /* renamed from: f */
    private final void m11431f() {
        int i = 0;
        while (true) {
            C0977ez[] ezVarArr = this.f16247c;
            if (i < ezVarArr.length) {
                C0977ez ezVar = ezVarArr[i];
                if (ezVar != null) {
                    this.f16251g.f16134b.mo10729a(ezVar);
                }
                this.f16247c[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final C0983fe mo10675c() {
        if (this.f16249e + 1 >= this.f16253j) {
            m11430e();
        }
        C0983fe a = m11428a(3);
        int i = this.f16245a + 1;
        this.f16245a = i;
        this.f16249e++;
        a.f16357a = i;
        this.f16251g.f16133a[i] = a;
        return a;
    }

    /* renamed from: d */
    public final C0983fe mo10677d() {
        if (this.f16249e + 1 >= this.f16253j) {
            m11430e();
        }
        C0983fe a = m11428a(4);
        int i = this.f16245a + 1;
        this.f16245a = i;
        this.f16249e++;
        a.f16357a = i;
        this.f16251g.f16133a[i] = a;
        return a;
    }

    /* renamed from: b */
    public final C0977ez mo10673b() {
        C0977ez ezVar = (C0977ez) this.f16251g.f16134b.mo10728a();
        if (ezVar == null) {
            return new C0977ez(this.f16251g);
        }
        ezVar.f16074a = null;
        C0976ey eyVar = ezVar.f16077d;
        eyVar.f16016f = -1;
        eyVar.f16017g = -1;
        eyVar.f16018h = false;
        eyVar.f16011a = 0;
        ezVar.f16075b = 0.0f;
        ezVar.f16078e = false;
        return ezVar;
    }

    /* renamed from: a */
    public static C0977ez m11427a(C0981fc fcVar, C0983fe feVar, C0983fe feVar2, int i, boolean z) {
        C0977ez b = fcVar.mo10673b();
        b.mo10611a(feVar, feVar2, i);
        if (z) {
            fcVar.mo10668a(b, 1);
        }
        return b;
    }

    /* renamed from: b */
    public final void mo10674b(C0983fe feVar, C0983fe feVar2, int i, int i2) {
        C0977ez b = mo10673b();
        C0983fe c = mo10675c();
        c.f16359c = i2;
        b.mo10615b(feVar, feVar2, c, i);
        mo10667a(b);
    }

    /* renamed from: c */
    public final void mo10676c(C0983fe feVar, C0983fe feVar2, int i, int i2) {
        C0977ez b = mo10673b();
        b.mo10611a(feVar, feVar2, i);
        C0983fe d = mo10677d();
        C0983fe d2 = mo10677d();
        d.f16359c = i2;
        d2.f16359c = i2;
        b.mo10610a(d, d2);
        mo10667a(b);
    }

    /* renamed from: a */
    private final C0983fe m11428a(int i) {
        C0983fe feVar = (C0983fe) this.f16251g.f16135c.mo10728a();
        if (feVar == null) {
            feVar = new C0983fe(i);
        } else {
            feVar.mo10744a();
            feVar.f16364h = i;
        }
        int i2 = this.f16256m;
        int i3 = f16244h;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            f16244h = i4;
            this.f16255l = (C0983fe[]) Arrays.copyOf(this.f16255l, i4);
        }
        C0983fe[] feVarArr = this.f16255l;
        int i5 = this.f16256m;
        this.f16256m = i5 + 1;
        feVarArr[i5] = feVar;
        return feVar;
    }

    /* renamed from: a */
    public final C0983fe mo10665a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f16249e + 1 >= this.f16253j) {
            m11430e();
        }
        C0985fg fgVar = (C0985fg) obj;
        C0983fe feVar = fgVar.f16491f;
        if (feVar == null) {
            fgVar.mo10797d();
            feVar = fgVar.f16491f;
        }
        int i = feVar.f16357a;
        if (i != -1) {
            if (i > this.f16245a || this.f16251g.f16133a[i] == null) {
                if (i != -1) {
                    feVar.mo10744a();
                }
            }
            return feVar;
        }
        int i2 = this.f16245a + 1;
        this.f16245a = i2;
        this.f16249e++;
        feVar.f16357a = i2;
        feVar.f16364h = 1;
        this.f16251g.f16133a[i2] = feVar;
        return feVar;
    }

    /* renamed from: a */
    public final void mo10666a() {
        C0979fa faVar;
        int i = 0;
        while (true) {
            faVar = this.f16251g;
            C0983fe[] feVarArr = faVar.f16133a;
            if (i >= feVarArr.length) {
                break;
            }
            C0983fe feVar = feVarArr[i];
            if (feVar != null) {
                feVar.mo10744a();
            }
            i++;
        }
        C0982fd fdVar = faVar.f16135c;
        C0983fe[] feVarArr2 = this.f16255l;
        int i2 = this.f16256m;
        int length = feVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0983fe feVar2 = feVarArr2[i3];
            int i4 = fdVar.f16295b;
            Object[] objArr = fdVar.f16294a;
            if (i4 < 256) {
                objArr[i4] = feVar2;
                fdVar.f16295b = i4 + 1;
            }
        }
        this.f16256m = 0;
        Arrays.fill(this.f16251g.f16133a, (Object) null);
        this.f16245a = 0;
        this.f16246b.f16185a.clear();
        this.f16249e = 1;
        for (int i5 = 0; i5 < this.f16250f; i5++) {
            this.f16247c[i5].f16076c = false;
        }
        m11431f();
        this.f16250f = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x011c  */
    /* renamed from: a */
    public final void mo10667a(C0977ez ezVar) {
        C0977ez[] ezVarArr;
        if (ezVar != null) {
            if (this.f16250f + 1 >= this.f16254k || this.f16249e + 1 >= this.f16253j) {
                m11430e();
            }
            if (!ezVar.f16078e) {
                if (this.f16250f > 0) {
                    C0976ey eyVar = ezVar.f16077d;
                    C0977ez[] ezVarArr2 = this.f16247c;
                    int i = eyVar.f16016f;
                    int i2 = 0;
                    while (i != -1 && i2 < eyVar.f16011a) {
                        C0983fe feVar = eyVar.f16012b.f16133a[eyVar.f16013c[i]];
                        if (feVar.f16358b != -1) {
                            float f = eyVar.f16015e[i];
                            eyVar.mo10572a(feVar);
                            C0977ez ezVar2 = ezVarArr2[feVar.f16358b];
                            if (!ezVar2.f16078e) {
                                C0976ey eyVar2 = ezVar2.f16077d;
                                int i3 = eyVar2.f16016f;
                                int i4 = 0;
                                while (i3 != -1 && i4 < eyVar2.f16011a) {
                                    eyVar.mo10578b(eyVar.f16012b.f16133a[eyVar2.f16013c[i3]], eyVar2.f16015e[i3] * f);
                                    i3 = eyVar2.f16014d[i3];
                                    i4++;
                                }
                            }
                            ezVar.f16075b += ezVar2.f16075b * f;
                            ezVar2.f16074a.mo10745a(ezVar);
                            i = eyVar.f16016f;
                            i2 = 0;
                        } else {
                            i = eyVar.f16014d[i];
                            i2++;
                        }
                    }
                    if (ezVar.f16077d.f16011a == 0) {
                        ezVar.f16078e = true;
                    }
                }
                float f2 = ezVar.f16075b;
                if (f2 < 0.0f) {
                    ezVar.f16075b = -f2;
                    C0976ey eyVar3 = ezVar.f16077d;
                    int i5 = eyVar3.f16016f;
                    int i6 = 0;
                    while (i5 != -1 && i6 < eyVar3.f16011a) {
                        float[] fArr = eyVar3.f16015e;
                        fArr[i5] = -fArr[i5];
                        i5 = eyVar3.f16014d[i5];
                        i6++;
                    }
                }
                C0976ey eyVar4 = ezVar.f16077d;
                int i7 = eyVar4.f16016f;
                C0983fe feVar2 = null;
                C0983fe feVar3 = null;
                int i8 = 0;
                while (true) {
                    if (i7 != -1 && i8 < eyVar4.f16011a) {
                        float[] fArr2 = eyVar4.f16015e;
                        float f3 = fArr2[i7];
                        if (f3 >= 0.0f) {
                            if (f3 < 0.001f) {
                                fArr2[i7] = 0.0f;
                                f3 = 0.0f;
                            }
                        } else if (f3 > -0.001f) {
                            fArr2[i7] = 0.0f;
                            f3 = 0.0f;
                        }
                        if (f3 != 0.0f) {
                            C0983fe feVar4 = eyVar4.f16012b.f16133a[eyVar4.f16013c[i7]];
                            if (feVar4.f16364h != 1) {
                                if (f3 < 0.0f && (feVar3 == null || feVar4.f16359c < feVar3.f16359c)) {
                                    feVar3 = feVar4;
                                }
                            } else if (f3 < 0.0f) {
                                feVar2 = feVar4;
                                break;
                            } else if (feVar2 == null) {
                                feVar2 = feVar4;
                            }
                        }
                        i7 = eyVar4.f16014d[i7];
                        i8++;
                    } else if (feVar2 == null) {
                        feVar2 = feVar3;
                    }
                }
                if (feVar2 == null) {
                }
                if (feVar2 != null) {
                    ezVar.mo10608a(feVar2);
                }
                if (ezVar.f16077d.f16011a == 0) {
                    ezVar.f16078e = true;
                }
                C0983fe feVar5 = ezVar.f16074a;
                if (feVar5 == null) {
                    return;
                }
                if (feVar5.f16364h != 1 && ezVar.f16075b < 0.0f) {
                    return;
                }
            }
            C0977ez ezVar3 = this.f16247c[this.f16250f];
            if (ezVar3 != null) {
                this.f16251g.f16134b.mo10729a(ezVar3);
            }
            if (!ezVar.f16078e) {
                ezVar.mo10605a();
            }
            C0977ez[] ezVarArr3 = this.f16247c;
            int i9 = this.f16250f;
            ezVarArr3[i9] = ezVar;
            C0983fe feVar6 = ezVar.f16074a;
            feVar6.f16358b = i9;
            this.f16250f = i9 + 1;
            int i10 = feVar6.f16363g;
            if (i10 > 0) {
                while (true) {
                    ezVarArr = this.f16257n;
                    int length = ezVarArr.length;
                    if (length >= i10) {
                        break;
                    }
                    this.f16257n = new C0977ez[(length + length)];
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    ezVarArr[i11] = ezVar.f16074a.f16362f[i11];
                }
                for (int i12 = 0; i12 < i10; i12++) {
                    C0977ez ezVar4 = ezVarArr[i12];
                    if (ezVar4 != ezVar) {
                        ezVar4.f16077d.mo10574a(ezVar4, ezVar);
                        ezVar4.mo10605a();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10668a(C0977ez ezVar, int i) {
        ezVar.f16077d.mo10575a(mo10677d(), (float) i);
    }

    /* renamed from: a */
    public final void mo10669a(C0980fb fbVar) {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f16250f) {
                i = 0;
                break;
            }
            C0977ez ezVar = this.f16247c[i2];
            if (ezVar.f16074a.f16364h != 1 && ezVar.f16075b < 0.0f) {
                boolean z = false;
                while (!z) {
                    float f = Float.MAX_VALUE;
                    int i3 = -1;
                    int i4 = -1;
                    int i5 = 0;
                    for (int i6 = 0; i6 < this.f16250f; i6++) {
                        C0977ez ezVar2 = this.f16247c[i6];
                        if (ezVar2.f16074a.f16364h != 1 && ezVar2.f16075b < 0.0f) {
                            for (int i7 = 1; i7 < this.f16249e; i7++) {
                                C0983fe feVar = this.f16251g.f16133a[i7];
                                float b = ezVar2.f16077d.mo10577b(feVar);
                                if (b > 0.0f) {
                                    for (int i8 = 0; i8 < 6; i8++) {
                                        float f2 = feVar.f16361e[i8] / b;
                                        if ((f2 < f && i8 == i5) || i8 > i5) {
                                            f = f2;
                                            i3 = i6;
                                            i4 = i7;
                                            i5 = i8;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i3 != -1) {
                        C0977ez ezVar3 = this.f16247c[i3];
                        ezVar3.f16074a.f16358b = -1;
                        ezVar3.mo10608a(this.f16251g.f16133a[i4]);
                        ezVar3.f16074a.f16358b = i3;
                        for (int i9 = 0; i9 < this.f16250f; i9++) {
                            this.f16247c[i9].mo10607a(ezVar3);
                        }
                        fbVar.mo10642a(this);
                    } else {
                        z = true;
                    }
                }
                i = 0;
            } else {
                i2++;
            }
        }
        while (i < this.f16250f) {
            C0977ez ezVar4 = this.f16247c[i];
            if (ezVar4.f16074a.f16364h == 1 || ezVar4.f16075b >= 0.0f) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo10670a(C0983fe feVar, int i) {
        int i2 = feVar.f16358b;
        if (i2 != -1) {
            C0977ez ezVar = this.f16247c[i2];
            if (!ezVar.f16078e) {
                C0977ez b = mo10673b();
                b.mo10609a(feVar, i);
                mo10667a(b);
                return;
            }
            ezVar.f16075b = (float) i;
            return;
        }
        C0977ez b2 = mo10673b();
        b2.f16074a = feVar;
        float f = (float) i;
        feVar.f16360d = f;
        b2.f16075b = f;
        b2.f16078e = true;
        mo10667a(b2);
    }

    /* renamed from: a */
    public final void mo10671a(C0983fe feVar, C0983fe feVar2, int i, float f, C0983fe feVar3, C0983fe feVar4, int i2) {
        C0977ez b = mo10673b();
        b.mo10612a(feVar, feVar2, i, f, feVar3, feVar4, i2);
        C0983fe d = mo10677d();
        C0983fe d2 = mo10677d();
        d.f16359c = 4;
        d2.f16359c = 4;
        b.mo10610a(d, d2);
        mo10667a(b);
    }

    /* renamed from: a */
    public final void mo10672a(C0983fe feVar, C0983fe feVar2, int i, int i2) {
        C0977ez b = mo10673b();
        C0983fe c = mo10675c();
        c.f16359c = i2;
        b.mo10613a(feVar, feVar2, c, i);
        mo10667a(b);
    }
}
