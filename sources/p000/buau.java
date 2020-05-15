package p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: buau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buau extends buav {

    /* renamed from: k */
    private byte[] f153168k;

    /* renamed from: l */
    private byte[] f153169l;

    /* renamed from: m */
    private byte[] f153170m;

    /* renamed from: n */
    private byte[] f153171n;

    /* renamed from: o */
    private byte[] f153172o;

    /* renamed from: p */
    private transient byte[] f153173p;

    public buau(buas buas, int i, int i2, float f, ByteBuffer byteBuffer) {
        super(buas, i, i2, f, byteBuffer, 127);
    }

    /* renamed from: l */
    private static byte[] m119198l(int i) {
        byte[] bArr = new byte[i];
        Arrays.fill(bArr, (byte) -1);
        return bArr;
    }

    /* renamed from: a */
    public final int mo72587a(int i) {
        return this.f153170m[mo72608j(i)];
    }

    /* renamed from: b */
    public final int mo72591b() {
        return (this.f153179f * 4) + 48 + this.f153178e;
    }

    /* renamed from: c */
    public final int mo72594c(int i) {
        return this.f153169l[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo72595c() {
        this.f153173p = this.f153168k;
    }

    /* renamed from: d */
    public final int mo72596d(int i) {
        return this.f153168k[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo72597d() {
        this.f153173p = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo72598e() {
        int i;
        int i2 = this.f153179f;
        byte[] bArr = new byte[i2];
        byte b = 0;
        byte b2 = 0;
        while (true) {
            i = i2 - 1;
            if (b2 >= i) {
                break;
            }
            byte b3 = (byte) (b2 + 1);
            bArr[b2] = b3;
            b2 = b3;
        }
        bArr[i] = 0;
        this.f153168k = bArr;
        int i3 = this.f153179f;
        byte[] bArr2 = new byte[i3];
        int i4 = i3 - 1;
        bArr2[0] = (byte) i4;
        while (b < i4) {
            int i5 = b + 1;
            bArr2[i5] = b;
            b = (byte) i5;
        }
        this.f153169l = bArr2;
        this.f153170m = m119198l(this.f153178e);
        this.f153171n = m119198l(this.f153179f);
        this.f153172o = m119198l(this.f153179f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo72600f(int i) {
        return this.f153173p[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo72601g(int i) {
        int i2 = this.f153181h;
        if (i != i2) {
            byte[] bArr = this.f153169l;
            byte b = bArr[i];
            byte b2 = bArr[i2];
            if (i == b2) {
                this.f153181h = i;
                this.f153182i = b;
                return;
            }
            if (i == this.f153182i) {
                this.f153182i = b;
            }
            byte[] bArr2 = this.f153168k;
            byte b3 = bArr2[i];
            bArr2[i] = (byte) i2;
            bArr[i] = b2;
            bArr2[b] = b3;
            bArr[b3] = b;
            byte b4 = (byte) i;
            bArr2[b2] = b4;
            bArr[i2] = b4;
            this.f153181h = i;
            this.f153177d++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo72602h(int i) {
        byte b = this.f153171n[i];
        byte b2 = this.f153172o[i];
        int j = mo72608j(this.f153183j.mo72484c(i));
        byte[] bArr = this.f153170m;
        if (i == bArr[j]) {
            bArr[j] = b;
        } else {
            this.f153171n[b2] = b;
        }
        if (b != -1) {
            this.f153172o[b] = b2;
        }
        this.f153171n[i] = -1;
        this.f153172o[i] = -1;
        this.f153180g--;
        this.f153177d++;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo72588a() {
        int i = this.f153179f;
        int i2 = this.f153175b;
        if (i == i2) {
            Arrays.fill(this.f153170m, (byte) -1);
            int i3 = this.f153181h;
            int i4 = this.f153180g;
            int i5 = 0;
            int i6 = i3;
            while (i5 < i4) {
                this.f153171n[i6] = -1;
                this.f153172o[i6] = -1;
                this.f153183j.mo72586d(i6);
                i5++;
                i6 = this.f153168k[i6];
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
        return this.f153171n[i];
    }

    /* renamed from: b */
    public final void mo72593b(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f153168k);
        byteBuffer.put(this.f153169l);
        byteBuffer.put(this.f153170m);
        byteBuffer.put(this.f153171n);
        byteBuffer.put(this.f153172o);
    }

    /* renamed from: a */
    public final void mo72589a(int i, int i2) {
        byte[] bArr;
        int j = mo72608j(i2);
        byte[] bArr2 = this.f153170m;
        byte b = bArr2[j];
        if (b == -1) {
            bArr2[j] = (byte) i;
            this.f153172o[i] = -1;
        } else {
            while (true) {
                bArr = this.f153171n;
                byte b2 = bArr[b];
                if (b2 == -1) {
                    break;
                }
                b = b2;
            }
            bArr[b] = (byte) i;
            this.f153172o[i] = b;
        }
        this.f153180g++;
        this.f153177d++;
    }

    /* renamed from: e */
    public final void mo72599e(int i) {
        int i2 = this.f153182i;
        if (i != i2) {
            byte[] bArr = this.f153168k;
            byte b = bArr[i];
            byte b2 = bArr[i2];
            if (i == b2) {
                this.f153182i = i;
                this.f153181h = b;
                return;
            }
            if (i == this.f153181h) {
                this.f153181h = b;
            }
            byte[] bArr2 = this.f153169l;
            byte b3 = bArr2[i];
            bArr[i] = b2;
            bArr2[i] = (byte) i2;
            bArr[b3] = b;
            bArr2[b] = b3;
            byte b4 = (byte) i;
            bArr[i2] = b4;
            bArr2[b2] = b4;
            this.f153182i = i;
            this.f153177d++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo72590a(ByteBuffer byteBuffer) {
        int i = this.f153179f;
        this.f153168k = new byte[i];
        this.f153169l = new byte[i];
        this.f153170m = new byte[this.f153178e];
        this.f153171n = new byte[i];
        this.f153172o = new byte[i];
        byteBuffer.get(this.f153168k);
        byteBuffer.get(this.f153169l);
        byteBuffer.get(this.f153170m);
        byteBuffer.get(this.f153171n);
        byteBuffer.get(this.f153172o);
    }
}
