package p000;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;

/* renamed from: buax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buax extends buav {

    /* renamed from: k */
    private int[] f153191k;

    /* renamed from: l */
    private int[] f153192l;

    /* renamed from: m */
    private int[] f153193m;

    /* renamed from: n */
    private int[] f153194n;

    /* renamed from: o */
    private int[] f153195o;

    /* renamed from: p */
    private transient int[] f153196p;

    public buax(buas buas, int i, int i2, float f, ByteBuffer byteBuffer) {
        super(buas, i, i2, f, byteBuffer, Integer.MAX_VALUE);
    }

    /* renamed from: l */
    private static int[] m119240l(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: a */
    public final int mo72587a(int i) {
        return this.f153193m[mo72608j(i)];
    }

    /* renamed from: b */
    public final int mo72591b() {
        return (this.f153179f * 16) + 48 + (this.f153178e * 4);
    }

    /* renamed from: c */
    public final int mo72594c(int i) {
        return this.f153192l[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo72595c() {
        this.f153196p = this.f153191k;
    }

    /* renamed from: d */
    public final int mo72596d(int i) {
        return this.f153191k[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo72597d() {
        this.f153196p = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo72598e() {
        int i;
        int i2 = this.f153179f;
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = i2 - 1;
            if (i4 >= i) {
                break;
            }
            int i5 = i4 + 1;
            iArr[i4] = i5;
            i4 = i5;
        }
        iArr[i] = 0;
        this.f153191k = iArr;
        int i6 = this.f153179f;
        int[] iArr2 = new int[i6];
        int i7 = i6 - 1;
        iArr2[0] = i7;
        while (i3 < i7) {
            int i8 = i3 + 1;
            iArr2[i8] = i3;
            i3 = i8;
        }
        this.f153192l = iArr2;
        this.f153193m = m119240l(this.f153178e);
        this.f153194n = m119240l(this.f153179f);
        this.f153195o = m119240l(this.f153179f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo72600f(int i) {
        return this.f153196p[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo72601g(int i) {
        int i2 = this.f153181h;
        if (i != i2) {
            int[] iArr = this.f153192l;
            int i3 = iArr[i];
            int i4 = iArr[i2];
            if (i == i4) {
                this.f153181h = i;
                this.f153182i = i3;
                return;
            }
            if (i == this.f153182i) {
                this.f153182i = i3;
            }
            int[] iArr2 = this.f153191k;
            int i5 = iArr2[i];
            iArr2[i] = i2;
            iArr[i] = i4;
            iArr2[i3] = i5;
            iArr[i5] = i3;
            iArr2[i4] = i;
            iArr[i2] = i;
            this.f153181h = i;
            this.f153177d++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo72602h(int i) {
        int i2 = this.f153194n[i];
        int i3 = this.f153195o[i];
        int j = mo72608j(this.f153183j.mo72484c(i));
        int[] iArr = this.f153193m;
        if (i == iArr[j]) {
            iArr[j] = i2;
        } else {
            this.f153194n[i3] = i2;
        }
        if (i2 != -1) {
            this.f153195o[i2] = i3;
        }
        this.f153194n[i] = -1;
        this.f153195o[i] = -1;
        this.f153180g--;
        this.f153177d++;
    }

    /* renamed from: a */
    public final void mo72588a() {
        int i = this.f153179f;
        int i2 = this.f153175b;
        if (i == i2) {
            Arrays.fill(this.f153193m, -1);
            int i3 = this.f153181h;
            int i4 = this.f153180g;
            for (int i5 = 0; i5 < i4; i5++) {
                this.f153194n[i3] = -1;
                this.f153195o[i3] = -1;
                this.f153183j.mo72586d(i3);
                i3 = this.f153191k[i3];
            }
            this.f153181h = this.f153182i;
            this.f153180g = 0;
        } else {
            mo72609k(i2);
        }
        this.f153177d++;
    }

    /* renamed from: b */
    public final int mo72592b(int i) {
        return this.f153194n[i];
    }

    /* renamed from: b */
    public final void mo72593b(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.put(this.f153191k);
        asIntBuffer.put(this.f153192l);
        asIntBuffer.put(this.f153193m);
        asIntBuffer.put(this.f153194n);
        asIntBuffer.put(this.f153195o);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
    }

    /* renamed from: a */
    public final void mo72589a(int i, int i2) {
        int[] iArr;
        int j = mo72608j(i2);
        int[] iArr2 = this.f153193m;
        int i3 = iArr2[j];
        if (i3 == -1) {
            iArr2[j] = i;
            this.f153195o[i] = -1;
        } else {
            while (true) {
                iArr = this.f153194n;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                }
                i3 = i4;
            }
            iArr[i3] = i;
            this.f153195o[i] = i3;
        }
        this.f153180g++;
        this.f153177d++;
    }

    /* renamed from: e */
    public final void mo72599e(int i) {
        int i2 = this.f153182i;
        if (i != i2) {
            int[] iArr = this.f153191k;
            int i3 = iArr[i];
            int i4 = iArr[i2];
            if (i == i4) {
                this.f153182i = i;
                this.f153181h = i3;
                return;
            }
            if (i == this.f153181h) {
                this.f153181h = i3;
            }
            int[] iArr2 = this.f153192l;
            int i5 = iArr2[i];
            iArr[i] = i4;
            iArr2[i] = i2;
            iArr[i5] = i3;
            iArr2[i3] = i5;
            iArr[i2] = i;
            iArr2[i4] = i;
            this.f153182i = i;
            this.f153177d++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72590a(ByteBuffer byteBuffer) {
        int i = this.f153179f;
        this.f153191k = new int[i];
        this.f153192l = new int[i];
        this.f153193m = new int[this.f153178e];
        this.f153194n = new int[i];
        this.f153195o = new int[i];
        IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
        asIntBuffer.get(this.f153191k);
        asIntBuffer.get(this.f153192l);
        asIntBuffer.get(this.f153193m);
        asIntBuffer.get(this.f153194n);
        asIntBuffer.get(this.f153195o);
        byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
    }
}
