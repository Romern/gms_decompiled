package p000;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: buay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buay extends buav {

    /* renamed from: k */
    private short[] f153197k;

    /* renamed from: l */
    private short[] f153198l;

    /* renamed from: m */
    private short[] f153199m;

    /* renamed from: n */
    private short[] f153200n;

    /* renamed from: o */
    private short[] f153201o;

    /* renamed from: p */
    private transient short[] f153202p;

    public buay(buas buas, int i, int i2, float f, ByteBuffer byteBuffer) {
        super(buas, i, i2, f, byteBuffer, 32767);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(short[], short):void}
     arg types: [short[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(short[], short):void} */
    /* renamed from: l */
    private static short[] m119257l(int i) {
        short[] sArr = new short[i];
        Arrays.fill(sArr, (short) -1);
        return sArr;
    }

    /* renamed from: a */
    public final int mo72587a(int i) {
        return this.f153199m[mo72608j(i)];
    }

    /* renamed from: b */
    public final int mo72591b() {
        int i = this.f153179f;
        int i2 = this.f153178e;
        return (i * 8) + 48 + i2 + i2;
    }

    /* renamed from: c */
    public final int mo72594c(int i) {
        return this.f153198l[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo72595c() {
        this.f153202p = this.f153197k;
    }

    /* renamed from: d */
    public final int mo72596d(int i) {
        return this.f153197k[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo72597d() {
        this.f153202p = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo72598e() {
        int i;
        int i2 = this.f153179f;
        short[] sArr = new short[i2];
        short s = 0;
        short s2 = 0;
        while (true) {
            i = i2 - 1;
            if (s2 >= i) {
                break;
            }
            short s3 = (short) (s2 + 1);
            sArr[s2] = s3;
            s2 = s3;
        }
        sArr[i] = 0;
        this.f153197k = sArr;
        int i3 = this.f153179f;
        short[] sArr2 = new short[i3];
        int i4 = i3 - 1;
        sArr2[0] = (short) i4;
        while (s < i4) {
            int i5 = s + 1;
            sArr2[i5] = s;
            s = (short) i5;
        }
        this.f153198l = sArr2;
        this.f153199m = m119257l(this.f153178e);
        this.f153200n = m119257l(this.f153179f);
        this.f153201o = m119257l(this.f153179f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo72600f(int i) {
        return this.f153202p[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo72601g(int i) {
        int i2 = this.f153181h;
        if (i != i2) {
            short[] sArr = this.f153198l;
            short s = sArr[i];
            short s2 = sArr[i2];
            if (i == s2) {
                this.f153181h = i;
                this.f153182i = s;
                return;
            }
            if (i == this.f153182i) {
                this.f153182i = s;
            }
            short[] sArr2 = this.f153197k;
            short s3 = sArr2[i];
            sArr2[i] = (short) i2;
            sArr[i] = s2;
            sArr2[s] = s3;
            sArr[s3] = s;
            short s4 = (short) i;
            sArr2[s2] = s4;
            sArr[i2] = s4;
            this.f153181h = i;
            this.f153177d++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo72602h(int i) {
        short s = this.f153200n[i];
        short s2 = this.f153201o[i];
        int j = mo72608j(this.f153183j.mo72484c(i));
        short[] sArr = this.f153199m;
        if (i == sArr[j]) {
            sArr[j] = s;
        } else {
            this.f153200n[s2] = s;
        }
        if (s != -1) {
            this.f153201o[s] = s2;
        }
        this.f153200n[i] = -1;
        this.f153201o[i] = -1;
        this.f153180g--;
        this.f153177d++;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: short} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(short[], short):void}
     arg types: [short[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(short[], short):void} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo72588a() {
        int i = this.f153179f;
        int i2 = this.f153175b;
        if (i == i2) {
            Arrays.fill(this.f153199m, (short) -1);
            int i3 = this.f153181h;
            int i4 = this.f153180g;
            int i5 = 0;
            int i6 = i3;
            while (i5 < i4) {
                this.f153200n[i6] = -1;
                this.f153201o[i6] = -1;
                this.f153183j.mo72586d(i6);
                i5++;
                i6 = this.f153197k[i6];
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
        return this.f153200n[i];
    }

    /* renamed from: b */
    public final void mo72593b(ByteBuffer byteBuffer) {
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.put(this.f153197k);
        asShortBuffer.put(this.f153198l);
        asShortBuffer.put(this.f153199m);
        asShortBuffer.put(this.f153200n);
        asShortBuffer.put(this.f153201o);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
    }

    /* renamed from: a */
    public final void mo72589a(int i, int i2) {
        short[] sArr;
        int j = mo72608j(i2);
        short[] sArr2 = this.f153199m;
        short s = sArr2[j];
        if (s == -1) {
            sArr2[j] = (short) i;
            this.f153201o[i] = -1;
        } else {
            while (true) {
                sArr = this.f153200n;
                short s2 = sArr[s];
                if (s2 == -1) {
                    break;
                }
                s = s2;
            }
            sArr[s] = (short) i;
            this.f153201o[i] = s;
        }
        this.f153180g++;
        this.f153177d++;
    }

    /* renamed from: e */
    public final void mo72599e(int i) {
        int i2 = this.f153182i;
        if (i != i2) {
            short[] sArr = this.f153197k;
            short s = sArr[i];
            short s2 = sArr[i2];
            if (i == s2) {
                this.f153182i = i;
                this.f153181h = s;
                return;
            }
            if (i == this.f153181h) {
                this.f153181h = s;
            }
            short[] sArr2 = this.f153198l;
            short s3 = sArr2[i];
            sArr[i] = s2;
            sArr2[i] = (short) i2;
            sArr[s3] = s;
            sArr2[s] = s3;
            short s4 = (short) i;
            sArr[i2] = s4;
            sArr2[s2] = s4;
            this.f153182i = i;
            this.f153177d++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72590a(ByteBuffer byteBuffer) {
        int i = this.f153179f;
        this.f153197k = new short[i];
        this.f153198l = new short[i];
        this.f153199m = new short[this.f153178e];
        this.f153200n = new short[i];
        this.f153201o = new short[i];
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        asShortBuffer.get(this.f153197k);
        asShortBuffer.get(this.f153198l);
        asShortBuffer.get(this.f153199m);
        asShortBuffer.get(this.f153200n);
        asShortBuffer.get(this.f153201o);
        int position = byteBuffer.position();
        int position2 = asShortBuffer.position();
        byteBuffer.position(position + position2 + position2);
    }
}
