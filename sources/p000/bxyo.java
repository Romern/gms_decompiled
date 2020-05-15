package p000;

import java.util.Arrays;

/* renamed from: bxyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxyo {

    /* renamed from: a */
    public static final bxyo f165102a = new bxyo(0, new int[0], new Object[0], false);

    /* renamed from: b */
    public int f165103b;

    /* renamed from: c */
    public int[] f165104c;

    /* renamed from: d */
    public Object[] f165105d;

    /* renamed from: e */
    public int f165106e;

    /* renamed from: f */
    private boolean f165107f;

    private bxyo() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    static bxyo m124424a() {
        return new bxyo(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    public final void mo74285b() {
        this.f165107f = false;
    }

    /* renamed from: c */
    public final int mo74286c() {
        int i;
        int i2 = this.f165106e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f165103b; i4++) {
            int i5 = this.f165104c[i4];
            int b = bxzh.m124563b(i5);
            int a = bxzh.m124561a(i5);
            if (a == 0) {
                i = bxuk.m123647e(b, ((Long) this.f165105d[i4]).longValue());
            } else if (a == 1) {
                ((Long) this.f165105d[i4]).longValue();
                i = bxuk.m123668r(b);
            } else if (a == 2) {
                i = bxuk.m123642c(b, (bxtx) this.f165105d[i4]);
            } else if (a == 3) {
                int i6 = bxuk.m123657i(b);
                i = i6 + i6 + ((bxyo) this.f165105d[i4]).mo74286c();
            } else if (a == 5) {
                ((Integer) this.f165105d[i4]).intValue();
                i = bxuk.m123667q(b);
            } else {
                throw new IllegalStateException(bxwf.m124093f());
            }
            i3 += i;
        }
        this.f165106e = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bxyo)) {
            bxyo bxyo = (bxyo) obj;
            int i = this.f165103b;
            if (i == bxyo.f165103b) {
                int[] iArr = this.f165104c;
                int[] iArr2 = bxyo.f165104c;
                int i2 = 0;
                while (true) {
                    if (i2 < i) {
                        if (iArr[i2] != iArr2[i2]) {
                            break;
                        }
                        i2++;
                    } else {
                        Object[] objArr = this.f165105d;
                        Object[] objArr2 = bxyo.f165105d;
                        int i3 = this.f165103b;
                        int i4 = 0;
                        while (i4 < i3) {
                            if (objArr[i4].equals(objArr2[i4])) {
                                i4++;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f165103b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f165104c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f165105d;
        int i7 = this.f165103b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    private bxyo(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f165106e = -1;
        this.f165103b = i;
        this.f165104c = iArr;
        this.f165105d = objArr;
        this.f165107f = z;
    }

    /* renamed from: a */
    static bxyo m124425a(bxyo bxyo, bxyo bxyo2) {
        int i = bxyo.f165103b + bxyo2.f165103b;
        int[] copyOf = Arrays.copyOf(bxyo.f165104c, i);
        System.arraycopy(bxyo2.f165104c, 0, copyOf, bxyo.f165103b, bxyo2.f165103b);
        Object[] copyOf2 = Arrays.copyOf(bxyo.f165105d, i);
        System.arraycopy(bxyo2.f165105d, 0, copyOf2, bxyo.f165103b, bxyo2.f165103b);
        return new bxyo(i, copyOf, copyOf2, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo74283a(int i, Object obj) {
        int i2;
        if (this.f165107f) {
            int i3 = this.f165103b;
            int[] iArr = this.f165104c;
            if (i3 == iArr.length) {
                if (i3 >= 4) {
                    i2 = i3 >> 1;
                } else {
                    i2 = 8;
                }
                int i4 = i3 + i2;
                this.f165104c = Arrays.copyOf(iArr, i4);
                this.f165105d = Arrays.copyOf(this.f165105d, i4);
            }
            int[] iArr2 = this.f165104c;
            int i5 = this.f165103b;
            iArr2[i5] = i;
            this.f165105d[i5] = obj;
            this.f165103b = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo74284a(bxul bxul) {
        if (this.f165103b != 0) {
            for (int i = 0; i < this.f165103b; i++) {
                int i2 = this.f165104c[i];
                Object obj = this.f165105d[i];
                int b = bxzh.m124563b(i2);
                int a = bxzh.m124561a(i2);
                if (a == 0) {
                    bxul.mo73877a(b, ((Long) obj).longValue());
                } else if (a == 1) {
                    bxul.mo73889d(b, ((Long) obj).longValue());
                } else if (a == 2) {
                    bxul.mo73878a(b, (bxtx) obj);
                } else if (a == 3) {
                    bxul.f164857a.mo73845b(b, 3);
                    ((bxyo) obj).mo74284a(bxul);
                    bxul.f164857a.mo73845b(b, 4);
                } else if (a == 5) {
                    bxul.mo73888d(b, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(bxwf.m124093f());
                }
            }
        }
    }
}
