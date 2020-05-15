package p000;

import java.util.Arrays;

/* renamed from: ey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0976ey {

    /* renamed from: a */
    public int f16011a = 0;

    /* renamed from: b */
    public final C0979fa f16012b;

    /* renamed from: c */
    public int[] f16013c = new int[8];

    /* renamed from: d */
    public int[] f16014d = new int[8];

    /* renamed from: e */
    public float[] f16015e = new float[8];

    /* renamed from: f */
    public int f16016f = -1;

    /* renamed from: g */
    public int f16017g = -1;

    /* renamed from: h */
    public boolean f16018h = false;

    /* renamed from: i */
    private final C0977ez f16019i;

    /* renamed from: j */
    private int f16020j = 8;

    public C0976ey(C0977ez ezVar, C0979fa faVar) {
        this.f16019i = ezVar;
        this.f16012b = faVar;
    }

    /* renamed from: a */
    public final float mo10572a(C0983fe feVar) {
        int i = this.f16016f;
        if (i != -1) {
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f16011a) {
                int i4 = this.f16013c[i];
                if (i4 != feVar.f16357a) {
                    i2++;
                    i3 = i;
                    i = this.f16014d[i];
                } else {
                    if (i != this.f16016f) {
                        int[] iArr = this.f16014d;
                        iArr[i3] = iArr[i];
                    } else {
                        this.f16016f = this.f16014d[i];
                    }
                    this.f16012b.f16133a[i4].mo10745a(this.f16019i);
                    this.f16011a--;
                    this.f16013c[i] = -1;
                    if (this.f16018h) {
                        this.f16017g = i;
                    }
                    return this.f16015e[i];
                }
            }
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo10576b(int i) {
        int i2 = this.f16016f;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f16011a) {
            if (i3 == i) {
                return this.f16015e[i2];
            }
            i2 = this.f16014d[i2];
            i3++;
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f16016f;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f16011a) {
            str = ((str + " -> ") + this.f16015e[i] + " : ") + this.f16012b.f16133a[this.f16013c[i]];
            i = this.f16014d[i];
            i2++;
        }
        return str;
    }

    /* renamed from: b */
    public final float mo10577b(C0983fe feVar) {
        int i = this.f16016f;
        int i2 = 0;
        while (i != -1 && i2 < this.f16011a) {
            if (this.f16013c[i] == feVar.f16357a) {
                return this.f16015e[i];
            }
            i = this.f16014d[i];
            i2++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final void mo10578b(C0983fe feVar, float f) {
        if (f != 0.0f) {
            int i = this.f16016f;
            if (i == -1) {
                this.f16016f = 0;
                this.f16015e[0] = f;
                this.f16013c[0] = feVar.f16357a;
                this.f16014d[0] = -1;
                this.f16011a++;
                if (!this.f16018h) {
                    this.f16017g++;
                    return;
                }
                return;
            }
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f16011a) {
                int i4 = this.f16013c[i];
                int i5 = feVar.f16357a;
                if (i4 == i5) {
                    float[] fArr = this.f16015e;
                    float f2 = fArr[i] + f;
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i != this.f16016f) {
                            int[] iArr = this.f16014d;
                            iArr[i3] = iArr[i];
                        } else {
                            this.f16016f = this.f16014d[i];
                        }
                        this.f16012b.f16133a[i4].mo10745a(this.f16019i);
                        if (this.f16018h) {
                            this.f16017g = i;
                        }
                        this.f16011a--;
                        return;
                    }
                    return;
                }
                if (i4 < i5) {
                    i3 = i;
                }
                i = this.f16014d[i];
                i2++;
            }
            int i6 = this.f16017g;
            int i7 = i6 + 1;
            if (this.f16018h) {
                int[] iArr2 = this.f16013c;
                if (iArr2[i6] != -1) {
                    i6 = iArr2.length;
                }
            } else {
                i6 = i7;
            }
            int length = this.f16013c.length;
            if (i6 >= length && this.f16011a < length) {
                int i8 = 0;
                while (true) {
                    int[] iArr3 = this.f16013c;
                    if (i8 < iArr3.length) {
                        if (iArr3[i8] == -1) {
                            i6 = i8;
                            break;
                        }
                        i8++;
                    } else {
                        break;
                    }
                }
            }
            int length2 = this.f16013c.length;
            if (i6 >= length2) {
                int i9 = this.f16020j;
                int i10 = i9 + i9;
                this.f16020j = i10;
                this.f16018h = false;
                this.f16017g = length2 - 1;
                this.f16015e = Arrays.copyOf(this.f16015e, i10);
                this.f16013c = Arrays.copyOf(this.f16013c, this.f16020j);
                this.f16014d = Arrays.copyOf(this.f16014d, this.f16020j);
                i6 = length2;
            }
            int[] iArr4 = this.f16013c;
            iArr4[i6] = feVar.f16357a;
            this.f16015e[i6] = f;
            if (i3 != -1) {
                int[] iArr5 = this.f16014d;
                iArr5[i6] = iArr5[i3];
                iArr5[i3] = i6;
            } else {
                this.f16014d[i6] = this.f16016f;
                this.f16016f = i6;
            }
            this.f16011a++;
            if (!this.f16018h) {
                this.f16017g++;
            }
            int i11 = this.f16017g;
            int length3 = iArr4.length;
            if (i11 >= length3) {
                this.f16018h = true;
                this.f16017g = length3 - 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0983fe mo10573a(int i) {
        int i2 = this.f16016f;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f16011a) {
            if (i3 == i) {
                return this.f16012b.f16133a[this.f16013c[i2]];
            }
            i2 = this.f16014d[i2];
            i3++;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo10574a(C0977ez ezVar, C0977ez ezVar2) {
        int i = this.f16016f;
        int i2 = 0;
        while (i != -1 && i2 < this.f16011a) {
            int i3 = this.f16013c[i];
            C0983fe feVar = ezVar2.f16074a;
            if (i3 == feVar.f16357a) {
                float f = this.f16015e[i];
                mo10572a(feVar);
                C0976ey eyVar = ezVar2.f16077d;
                int i4 = eyVar.f16016f;
                int i5 = 0;
                while (i4 != -1 && i5 < eyVar.f16011a) {
                    mo10578b(this.f16012b.f16133a[eyVar.f16013c[i4]], eyVar.f16015e[i4] * f);
                    i4 = eyVar.f16014d[i4];
                    i5++;
                }
                ezVar.f16075b += ezVar2.f16075b * f;
                ezVar2.f16074a.mo10745a(ezVar);
                i = this.f16016f;
                i2 = 0;
            } else {
                i = this.f16014d[i];
                i2++;
            }
        }
    }

    /* renamed from: a */
    public final void mo10575a(C0983fe feVar, float f) {
        if (f != 0.0f) {
            int i = this.f16016f;
            if (i == -1) {
                this.f16016f = 0;
                this.f16015e[0] = f;
                this.f16013c[0] = feVar.f16357a;
                this.f16014d[0] = -1;
                this.f16011a++;
                if (!this.f16018h) {
                    this.f16017g++;
                    return;
                }
                return;
            }
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f16011a) {
                int i4 = this.f16013c[i];
                int i5 = feVar.f16357a;
                if (i4 == i5) {
                    this.f16015e[i] = f;
                    return;
                }
                if (i4 < i5) {
                    i3 = i;
                }
                i = this.f16014d[i];
                i2++;
            }
            int i6 = this.f16017g;
            int i7 = i6 + 1;
            if (this.f16018h) {
                int[] iArr = this.f16013c;
                if (iArr[i6] != -1) {
                    i6 = iArr.length;
                }
            } else {
                i6 = i7;
            }
            int length = this.f16013c.length;
            if (i6 >= length && this.f16011a < length) {
                int i8 = 0;
                while (true) {
                    int[] iArr2 = this.f16013c;
                    if (i8 < iArr2.length) {
                        if (iArr2[i8] == -1) {
                            i6 = i8;
                            break;
                        }
                        i8++;
                    } else {
                        break;
                    }
                }
            }
            int length2 = this.f16013c.length;
            if (i6 >= length2) {
                int i9 = this.f16020j;
                int i10 = i9 + i9;
                this.f16020j = i10;
                this.f16018h = false;
                this.f16017g = length2 - 1;
                this.f16015e = Arrays.copyOf(this.f16015e, i10);
                this.f16013c = Arrays.copyOf(this.f16013c, this.f16020j);
                this.f16014d = Arrays.copyOf(this.f16014d, this.f16020j);
                i6 = length2;
            }
            int[] iArr3 = this.f16013c;
            iArr3[i6] = feVar.f16357a;
            this.f16015e[i6] = f;
            if (i3 != -1) {
                int[] iArr4 = this.f16014d;
                iArr4[i6] = iArr4[i3];
                iArr4[i3] = i6;
            } else {
                this.f16014d[i6] = this.f16016f;
                this.f16016f = i6;
            }
            int i11 = this.f16011a + 1;
            this.f16011a = i11;
            if (!this.f16018h) {
                this.f16017g++;
            }
            if (i11 >= iArr3.length) {
                this.f16018h = true;
                return;
            }
            return;
        }
        mo10572a(feVar);
    }
}
