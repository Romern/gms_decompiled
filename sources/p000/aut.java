package p000;

/* renamed from: aut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class aut extends aus {

    /* renamed from: m */
    protected C1169lp[] f2306m = null;

    /* renamed from: n */
    String f2307n;

    /* renamed from: o */
    int f2308o = 0;

    /* renamed from: p */
    int f2309p;

    /* renamed from: a */
    public boolean mo2583a() {
        return false;
    }

    public C1169lp[] getPathData() {
        return this.f2306m;
    }

    public String getPathName() {
        return this.f2307n;
    }

    public void setPathData(C1169lp[] lpVarArr) {
        C1169lp[] lpVarArr2 = this.f2306m;
        if (!(lpVarArr2 == null || lpVarArr == null || lpVarArr2.length != lpVarArr.length)) {
            int i = 0;
            while (i < lpVarArr2.length) {
                C1169lp lpVar = lpVarArr2[i];
                char c = lpVar.f26522a;
                C1169lp lpVar2 = lpVarArr[i];
                if (c == lpVar2.f26522a && lpVar.f26523b.length == lpVar2.f26523b.length) {
                    i++;
                }
            }
            C1169lp[] lpVarArr3 = this.f2306m;
            for (int i2 = 0; i2 < lpVarArr.length; i2++) {
                lpVarArr3[i2].f26522a = lpVarArr[i2].f26522a;
                int i3 = 0;
                while (true) {
                    float[] fArr = lpVarArr[i2].f26523b;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    lpVarArr3[i2].f26523b[i3] = fArr[i3];
                    i3++;
                }
            }
            return;
        }
        this.f2306m = C1170lq.m19512a(lpVarArr);
    }

    public aut() {
    }

    public aut(aut aut) {
        this.f2307n = aut.f2307n;
        int i = aut.f2309p;
        this.f2309p = 0;
        this.f2306m = C1170lq.m19512a(aut.f2306m);
    }
}
