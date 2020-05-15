package p000;

import java.util.Arrays;

/* renamed from: ez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0977ez {

    /* renamed from: a */
    public C0983fe f16074a = null;

    /* renamed from: b */
    public float f16075b = 0.0f;

    /* renamed from: c */
    boolean f16076c = false;

    /* renamed from: d */
    public final C0976ey f16077d;

    /* renamed from: e */
    boolean f16078e = false;

    public C0977ez(C0979fa faVar) {
        this.f16077d = new C0976ey(this, faVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10605a() {
        C0976ey eyVar = this.f16077d;
        int i = eyVar.f16016f;
        int i2 = 0;
        while (i != -1 && i2 < eyVar.f16011a) {
            C0983fe feVar = eyVar.f16012b.f16133a[eyVar.f16013c[i]];
            int i3 = 0;
            while (true) {
                int i4 = feVar.f16363g;
                if (i3 < i4) {
                    if (feVar.f16362f[i3] == this) {
                        break;
                    }
                    i3++;
                } else {
                    C0977ez[] ezVarArr = feVar.f16362f;
                    int length = ezVarArr.length;
                    if (i4 >= length) {
                        feVar.f16362f = (C0977ez[]) Arrays.copyOf(ezVarArr, length + length);
                    }
                    C0977ez[] ezVarArr2 = feVar.f16362f;
                    int i5 = feVar.f16363g;
                    ezVarArr2[i5] = this;
                    feVar.f16363g = i5 + 1;
                }
            }
            i = eyVar.f16014d[i];
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo10615b(C0983fe feVar, C0983fe feVar2, C0983fe feVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.f16075b = (float) i;
            if (z) {
                this.f16077d.mo10575a(feVar, 1.0f);
                this.f16077d.mo10575a(feVar2, -1.0f);
                this.f16077d.mo10575a(feVar3, 1.0f);
                return;
            }
        }
        this.f16077d.mo10575a(feVar, -1.0f);
        this.f16077d.mo10575a(feVar2, 1.0f);
        this.f16077d.mo10575a(feVar3, -1.0f);
    }

    public final String toString() {
        String str;
        boolean z;
        String str2;
        if (this.f16074a != null) {
            str = "" + this.f16074a;
        } else {
            str = "0";
        }
        String str3 = str + " = ";
        if (this.f16075b != 0.0f) {
            str3 = str3 + this.f16075b;
            z = true;
        } else {
            z = false;
        }
        int i = this.f16077d.f16011a;
        for (int i2 = 0; i2 < i; i2++) {
            C0983fe a = this.f16077d.mo10573a(i2);
            if (a != null) {
                float b = this.f16077d.mo10576b(i2);
                String feVar = a.toString();
                if (z) {
                    if (b <= 0.0f) {
                        str2 = str2 + " - ";
                        b = -b;
                    } else {
                        str2 = str2 + " + ";
                    }
                } else if (b < 0.0f) {
                    str2 = str2 + "- ";
                    b = -b;
                }
                if (b != 1.0f) {
                    str2 = str2 + b + " " + feVar;
                } else {
                    str2 = str2 + feVar;
                }
                z = true;
            }
        }
        if (z) {
            return str2;
        }
        return str2 + "0.0";
    }

    /* renamed from: a */
    public final void mo10606a(float f, float f2, float f3, C0983fe feVar, int i, C0983fe feVar2, int i2, C0983fe feVar3, int i3, C0983fe feVar4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.f16075b = (float) (((-i) - i2) + i3 + i4);
            this.f16077d.mo10575a(feVar, 1.0f);
            this.f16077d.mo10575a(feVar2, -1.0f);
            this.f16077d.mo10575a(feVar4, 1.0f);
            this.f16077d.mo10575a(feVar3, -1.0f);
            return;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.f16075b = ((float) ((-i) - i2)) + (((float) i3) * f4) + (((float) i4) * f4);
        this.f16077d.mo10575a(feVar, 1.0f);
        this.f16077d.mo10575a(feVar2, -1.0f);
        this.f16077d.mo10575a(feVar4, f4);
        this.f16077d.mo10575a(feVar3, -f4);
    }

    /* renamed from: a */
    public final void mo10607a(C0977ez ezVar) {
        this.f16077d.mo10574a(this, ezVar);
    }

    /* renamed from: a */
    public final void mo10608a(C0983fe feVar) {
        C0983fe feVar2 = this.f16074a;
        if (feVar2 != null) {
            this.f16077d.mo10575a(feVar2, -1.0f);
            this.f16074a = null;
        }
        float f = -this.f16077d.mo10572a(feVar);
        this.f16074a = feVar;
        if (f != 1.0f) {
            this.f16075b /= f;
            C0976ey eyVar = this.f16077d;
            int i = eyVar.f16016f;
            int i2 = 0;
            while (i != -1 && i2 < eyVar.f16011a) {
                float[] fArr = eyVar.f16015e;
                fArr[i] = fArr[i] / f;
                i = eyVar.f16014d[i];
                i2++;
            }
        }
    }

    /* renamed from: a */
    public final void mo10609a(C0983fe feVar, int i) {
        if (i < 0) {
            this.f16075b = (float) (-i);
            this.f16077d.mo10575a(feVar, 1.0f);
            return;
        }
        this.f16075b = (float) i;
        this.f16077d.mo10575a(feVar, -1.0f);
    }

    /* renamed from: a */
    public final void mo10610a(C0983fe feVar, C0983fe feVar2) {
        this.f16077d.mo10575a(feVar, 1.0f);
        this.f16077d.mo10575a(feVar2, -1.0f);
    }

    /* renamed from: a */
    public final void mo10611a(C0983fe feVar, C0983fe feVar2, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.f16075b = (float) i;
            if (z) {
                this.f16077d.mo10575a(feVar, 1.0f);
                this.f16077d.mo10575a(feVar2, -1.0f);
                return;
            }
        }
        this.f16077d.mo10575a(feVar, -1.0f);
        this.f16077d.mo10575a(feVar2, 1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10612a(C0983fe feVar, C0983fe feVar2, int i, float f, C0983fe feVar3, C0983fe feVar4, int i2) {
        if (feVar2 == feVar3) {
            this.f16077d.mo10575a(feVar, 1.0f);
            this.f16077d.mo10575a(feVar4, 1.0f);
            this.f16077d.mo10575a(feVar2, -2.0f);
        } else if (f == 0.5f) {
            this.f16077d.mo10575a(feVar, 1.0f);
            this.f16077d.mo10575a(feVar2, -1.0f);
            this.f16077d.mo10575a(feVar3, -1.0f);
            this.f16077d.mo10575a(feVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f16075b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f16077d.mo10575a(feVar, -1.0f);
            this.f16077d.mo10575a(feVar2, 1.0f);
            this.f16075b = (float) i;
        } else if (f < 1.0f) {
            float f2 = 1.0f - f;
            this.f16077d.mo10575a(feVar, f2);
            this.f16077d.mo10575a(feVar2, -f2);
            this.f16077d.mo10575a(feVar3, -f);
            this.f16077d.mo10575a(feVar4, f);
            if (i > 0 || i2 > 0) {
                this.f16075b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        } else {
            this.f16077d.mo10575a(feVar3, -1.0f);
            this.f16077d.mo10575a(feVar4, 1.0f);
            this.f16075b = (float) i2;
        }
    }

    /* renamed from: a */
    public final void mo10613a(C0983fe feVar, C0983fe feVar2, C0983fe feVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.f16075b = (float) i;
            if (z) {
                this.f16077d.mo10575a(feVar, 1.0f);
                this.f16077d.mo10575a(feVar2, -1.0f);
                this.f16077d.mo10575a(feVar3, -1.0f);
                return;
            }
        }
        this.f16077d.mo10575a(feVar, -1.0f);
        this.f16077d.mo10575a(feVar2, 1.0f);
        this.f16077d.mo10575a(feVar3, 1.0f);
    }

    /* renamed from: a */
    public final void mo10614a(C0983fe feVar, C0983fe feVar2, C0983fe feVar3, C0983fe feVar4, float f) {
        this.f16077d.mo10575a(feVar, -1.0f);
        this.f16077d.mo10575a(feVar2, 1.0f);
        this.f16077d.mo10575a(feVar3, f);
        this.f16077d.mo10575a(feVar4, -f);
    }
}
