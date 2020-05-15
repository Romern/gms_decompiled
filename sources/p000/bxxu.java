package p000;

import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: bxxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxxu extends bxtx {

    /* renamed from: a */
    static final int[] f165060a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: h */
    public static final /* synthetic */ int f165061h = 0;
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    public final int f165062d;

    /* renamed from: e */
    public final bxtx f165063e;

    /* renamed from: f */
    public final bxtx f165064f;

    /* renamed from: g */
    public final int f165065g;

    /* renamed from: i */
    private final int f165066i;

    public bxxu(bxtx bxtx, bxtx bxtx2) {
        this.f165063e = bxtx;
        this.f165064f = bxtx2;
        int a = bxtx.mo73744a();
        this.f165066i = a;
        this.f165062d = a + bxtx2.mo73744a();
        this.f165065g = Math.max(bxtx.mo73751c(), bxtx2.mo73751c()) + 1;
    }

    /* renamed from: a */
    public static bxtx m124312a(bxtx bxtx, bxtx bxtx2) {
        int a = bxtx.mo73744a();
        int a2 = bxtx2.mo73744a();
        byte[] bArr = new byte[(a + a2)];
        bxtx.mo73774b(bArr, 0, 0, a);
        bxtx2.mo73774b(bArr, 0, a, a2);
        return bxtx.m123264b(bArr);
    }

    /* renamed from: f */
    static int m124313f(int i) {
        int[] iArr = f165060a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return Integer.MAX_VALUE;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    /* renamed from: a */
    public final int mo73744a() {
        return this.f165062d;
    }

    /* renamed from: b */
    public final byte mo73746b(int i) {
        int i2 = this.f165066i;
        if (i >= i2) {
            return this.f165064f.mo73746b(i - i2);
        }
        return this.f165063e.mo73746b(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo73751c() {
        return this.f165065g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo73752d() {
        return this.f165062d >= m124313f(this.f165065g);
    }

    /* renamed from: e */
    public final ByteBuffer mo73760e() {
        return ByteBuffer.wrap(mo73780k()).asReadOnlyBuffer();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxtx) {
            bxtx bxtx = (bxtx) obj;
            if (this.f165062d == bxtx.mo73744a()) {
                if (this.f165062d == 0) {
                    return true;
                }
                int i = this.f164798c;
                int i2 = bxtx.f164798c;
                if (i != 0 && i2 != 0 && i != i2) {
                    return false;
                }
                bxxs bxxs = new bxxs(this);
                bxtt a = bxxs.next();
                bxxs bxxs2 = new bxxs(bxtx);
                bxtt a2 = bxxs2.next();
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int a3 = a.mo73744a() - i3;
                    int a4 = a2.mo73744a() - i4;
                    int min = Math.min(a3, a4);
                    if (!(i3 == 0 ? a.mo73750a(a2, i4, min) : a2.mo73750a(a, i3, min))) {
                        return false;
                    }
                    i5 += min;
                    int i6 = this.f165062d;
                    if (i5 < i6) {
                        if (min == a3) {
                            a = bxxs.next();
                            i3 = 0;
                        } else {
                            i3 += min;
                        }
                        if (min == a4) {
                            a2 = bxxs2.next();
                            i4 = 0;
                        } else {
                            i4 += min;
                        }
                    } else if (i5 == i6) {
                        return true;
                    } else {
                        throw new IllegalStateException();
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public final InputStream mo73763g() {
        return new bxxt(this);
    }

    /* renamed from: h */
    public final bxuc mo73764h() {
        return bxuc.m123416a(new bxxt(this));
    }

    /* renamed from: i */
    public final bxtr mo73777i() {
        return new bxxq(this);
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return bxtx.m123264b(mo73780k());
    }

    /* renamed from: a */
    public final byte mo73743a(int i) {
        m123266b(i, this.f165062d);
        return mo73746b(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo73759b(int i, int i2, int i3) {
        int i4 = this.f165066i;
        if (i2 + i3 <= i4) {
            return this.f165063e.mo73759b(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f165064f.mo73759b(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f165064f.mo73759b(this.f165063e.mo73759b(i, i2, i5), 0, i3 - i5);
    }

    /* renamed from: f */
    public final boolean mo73762f() {
        int a = this.f165063e.mo73753a(0, 0, this.f165066i);
        bxtx bxtx = this.f165064f;
        return bxtx.mo73753a(a, 0, bxtx.mo73744a()) == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo73753a(int i, int i2, int i3) {
        int i4 = this.f165066i;
        if (i2 + i3 <= i4) {
            return this.f165063e.mo73753a(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f165064f.mo73753a(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f165064f.mo73753a(this.f165063e.mo73753a(i, i2, i5), 0, i3 - i5);
    }

    /* renamed from: a */
    public final bxtx mo73754a(int i, int i2) {
        int c = m123267c(i, i2, this.f165062d);
        if (c == 0) {
            return bxtx.f164797b;
        }
        if (c == this.f165062d) {
            return this;
        }
        int i3 = this.f165066i;
        if (i2 <= i3) {
            return this.f165063e.mo73754a(i, i2);
        }
        if (i < i3) {
            return new bxxu(this.f165063e.mo73775c(i), this.f165064f.mo73754a(0, i2 - this.f165066i));
        }
        return this.f165064f.mo73754a(i - i3, i2 - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo73755a(Charset charset) {
        return new String(mo73780k(), charset);
    }

    /* renamed from: a */
    public final void mo73756a(bxtl bxtl) {
        this.f165063e.mo73756a(bxtl);
        this.f165064f.mo73756a(bxtl);
    }

    /* renamed from: a */
    public final void mo73757a(OutputStream outputStream) {
        this.f165063e.mo73757a(outputStream);
        this.f165064f.mo73757a(outputStream);
    }

    /* renamed from: a */
    public final void mo73758a(ByteBuffer byteBuffer) {
        this.f165063e.mo73758a(byteBuffer);
        this.f165064f.mo73758a(byteBuffer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73745a(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.f165066i;
        if (i + i3 <= i4) {
            this.f165063e.mo73745a(bArr, i, i2, i3);
        } else if (i < i4) {
            int i5 = i4 - i;
            this.f165063e.mo73745a(bArr, i, i2, i5);
            this.f165064f.mo73745a(bArr, 0, i2 + i5, i3 - i5);
        } else {
            this.f165064f.mo73745a(bArr, i - i4, i2, i3);
        }
    }
}
