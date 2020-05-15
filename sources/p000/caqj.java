package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: caqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caqj {

    /* renamed from: a */
    public static final byte[] f175536a = {-97, 54};

    /* renamed from: b */
    public final caok f175537b;

    /* renamed from: c */
    public final cara f175538c;

    /* renamed from: d */
    public capy f175539d;

    /* renamed from: e */
    public final casy f175540e;

    /* renamed from: f */
    public final caso f175541f;

    /* renamed from: g */
    public final caqk f175542g;

    /* renamed from: h */
    public final caov f175543h;

    /* renamed from: i */
    public final casb f175544i;

    /* renamed from: j */
    private final caox f175545j;

    /* renamed from: k */
    private final caqm f175546k = new caqm();

    /* renamed from: l */
    private boolean f175547l;

    /* renamed from: m */
    private final carn f175548m;

    public caqj(caox caox, caok caok, cara cara) {
        byte[] bArr;
        this.f175545j = caox;
        this.f175537b = caok;
        this.f175538c = cara;
        casa casa = cara.f175653o;
        if (casa != null) {
            this.f175544i = casa.f175729b;
            carv b = casa.mo74796b();
            if (this.f175544i == null || b == null) {
                throw new capk("Invalid Card Profile data");
            }
            this.f175538c.f175642d.f175561m = caok.f175460l;
            this.f175548m = cara.f175651m;
            this.f175542g = cara.f175642d;
            this.f175543h = cara.f175643e;
            this.f175541f = new casp(this.f175537b, this.f175542g.mo74762a(), this.f175542g.mo74764b());
            if (this.f175542g.f175556h) {
                bArr = this.f175544i.mo74804h().f175723a;
            } else {
                bArr = this.f175544i.mo74799c();
            }
            this.f175540e = new casz(caql.m126973a(bArr), b.f175706b, this.f175537b, this.f175542g.mo74764b());
            this.f175547l = ((casp) this.f175541f).f175773a == casn.f175769a;
            return;
        }
        throw new capk("Invalid Card Profile object");
    }

    /* renamed from: a */
    private static char m126965a(byte b, byte b2) {
        return (char) ((((b & 240) >>> 4) << 12) + ((b & 15) << 8) + (((b2 & 240) >>> 4) << 4) + (b2 & 15));
    }

    /* renamed from: b */
    public final byte[] mo74761b(caou caou) {
        byte[] bArr;
        this.f175542g.mo74763a(caou.mo49410c());
        if (!this.f175547l) {
            this.f175538c.f175642d.f175564p = 4;
            bArr = caor.m126888a(27010);
        } else {
            byte[] a = cath.m127170a(f175536a, caou.mo49410c());
            byte[] e = this.f175539d.mo74753e();
            int length = a.length;
            int length2 = e.length;
            byte[] bArr2 = new byte[(length + length2)];
            System.arraycopy(a, 0, bArr2, 0, length);
            System.arraycopy(e, 0, bArr2, length, length2);
            byte[] a2 = cath.m127170a(new byte[]{119}, bArr2);
            try {
                byte[] a3 = caor.m126889a(a2);
                catg.m127166c(a);
                catg.m127166c(e);
                catg.m127166c(bArr2);
                catg.m127166c(a2);
                bArr = a3;
            } catch (capg e2) {
                throw new capk(e2.getMessage());
            } catch (Throwable th) {
                catg.m127166c(a);
                catg.m127166c(e);
                catg.m127166c(bArr2);
                catg.m127166c(a2);
                throw th;
            }
        }
        this.f175548m.mo49414a(m126966a((byte[]) null, (byte[]) null));
        return bArr;
    }

    /* renamed from: a */
    private final caqu m126966a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4;
        boolean z;
        caqk caqk = this.f175542g;
        casb casb = this.f175544i;
        caso caso = this.f175541f;
        try {
            byte[] bArr5 = caqk.f175554f;
            if (((casp) caso).f175774b == 1) {
                z = true;
            } else {
                z = false;
            }
            caqw caqw = new caqw(casb, bArr2, bArr, bArr5, z);
            bArr4 = caqw.f175630g;
            bArr3 = caqw.f175631h;
        } catch (capg e) {
            bArr4 = new byte[0];
            bArr3 = new byte[0];
        }
        return new caqu(caqk, caso, bArr4, bArr3);
    }

    /* renamed from: a */
    public final caou mo74759a() {
        return this.f175543h.mo49420d();
    }

    /* renamed from: a */
    public final byte[] mo74760a(caou caou) {
        byte[] bArr;
        this.f175542g.mo74763a(caou.mo49410c());
        byte[] c = caou.mo49410c();
        this.f175546k.mo74765a();
        byte[] bArr2 = this.f175537b.f175454f;
        byte[] f = this.f175544i.mo74802f();
        byte[] bArr3 = new byte[8];
        int length = f.length;
        System.arraycopy(f, 0, bArr3, 0, length);
        int length2 = bArr2.length;
        System.arraycopy(bArr2, 0, bArr3, length, length2);
        System.arraycopy(c, 0, bArr3, length + length2, c.length);
        byte[] d = caou.mo49411d();
        byte[] a = caou.mo49408a();
        try {
            caox caox = this.f175545j;
            caow caow = new caow(((capu) caox).mo74736a(bArr3, d), ((capu) caox).mo74736a(bArr3, a));
            byte[] bArr4 = caow.f175509a;
            byte[] bArr5 = caow.f175510b;
            byte b = bArr5[0];
            byte b2 = bArr5[1];
            byte b3 = bArr4[6];
            byte b4 = bArr4[7];
            int a2 = m126965a(c[0], c[1]) % 'd';
            byte[] array = ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt((m126965a(b, b2) % 1000) + ((a2 / 10) * 1000)).array();
            byte[] array2 = ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt((m126965a(b3, b4) % 1000) + ((a2 % 10) * 1000)).array();
            byte[] bArr6 = {array2[2], array2[3], array[2], array[3], 0, 0, 0, 0};
            catg.m127166c(array);
            catg.m127166c(array2);
            caou.mo49412e();
            catg.m127166c(bArr4);
            catg.m127166c(bArr5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr6, 0, 2);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr6, 2, 4);
            this.f175542g.f175555g = bArr6;
            byte[] a3 = cath.m127170a(new byte[]{-97, 97}, copyOfRange);
            byte[] a4 = cath.m127170a(new byte[]{-97, 96}, copyOfRange);
            byte[] a5 = cath.m127170a(f175536a, copyOfRange2);
            if (this.f175547l) {
                bArr = this.f175539d.mo74753e();
            } else {
                bArr = new byte[0];
            }
            int length3 = a3.length;
            int length4 = a4.length;
            int i = length3 + length4;
            int length5 = a5.length;
            int i2 = i + length5;
            int length6 = bArr.length;
            byte[] bArr7 = new byte[(i2 + length6)];
            System.arraycopy(a3, 0, bArr7, 0, length3);
            System.arraycopy(a4, 0, bArr7, length3, length4);
            System.arraycopy(a5, 0, bArr7, i, length5);
            if (length6 > 0) {
                System.arraycopy(bArr, 0, bArr7, i2, length6);
            }
            byte[] a6 = cath.m127170a(new byte[]{119}, bArr7);
            catg.m127166c(a3);
            catg.m127166c(a4);
            catg.m127166c(a5);
            catg.m127166c(bArr);
            catg.m127166c(bArr7);
            try {
                byte[] a7 = caor.m126889a(a6);
                this.f175548m.mo49414a(m126966a(copyOfRange, copyOfRange2));
                catg.m127166c(copyOfRange);
                catg.m127166c(copyOfRange2);
                return a7;
            } catch (capg e) {
                catg.m127166c(a6);
                throw new capk(e.getMessage());
            }
        } catch (GeneralSecurityException e2) {
            throw new capk(e2.getMessage());
        }
    }
}
