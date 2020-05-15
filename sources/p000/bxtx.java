package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: bxtx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bxtx implements Iterable, Serializable {

    /* renamed from: a */
    private static final bxtq f164796a;

    /* renamed from: b */
    public static final bxtx f164797b = new bxtu(bxwd.f164981b);

    /* renamed from: c */
    public int f164798c = 0;

    static {
        bxtq bxtq;
        if (!bxtd.m123131a()) {
            bxtq = new bxto();
        } else {
            bxtq = new bxtw();
        }
        f164796a = bxtq;
    }

    /* renamed from: a */
    public static bxtx m123256a(InputStream inputStream) {
        bxtx bxtx;
        ArrayList arrayList = new ArrayList();
        int i = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 != 0) {
                bxtx = m123262a(bArr, 0, i2);
            } else {
                bxtx = null;
            }
            if (bxtx == null) {
                return m123257a(arrayList);
            }
            arrayList.add(bxtx);
            i = Math.min(i + i, 8192);
        }
    }

    /* renamed from: b */
    public static bxtx m123263b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        m123267c(0, remaining, byteBuffer.remaining());
        byte[] bArr = new byte[remaining];
        byteBuffer.get(bArr);
        return new bxtu(bArr);
    }

    /* renamed from: c */
    static int m123267c(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: d */
    public static bxtv m123268d(int i) {
        return new bxtv(i);
    }

    /* renamed from: e */
    static bxts m123269e(int i) {
        return new bxts(i);
    }

    /* renamed from: m */
    public static bxtv m123270m() {
        return new bxtv(128);
    }

    /* renamed from: a */
    public abstract byte mo73743a(int i);

    /* renamed from: a */
    public abstract int mo73744a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo73753a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract bxtx mo73754a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo73755a(Charset charset);

    /* renamed from: a */
    public abstract void mo73756a(bxtl bxtl);

    /* renamed from: a */
    public abstract void mo73757a(OutputStream outputStream);

    /* renamed from: a */
    public abstract void mo73758a(ByteBuffer byteBuffer);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo73745a(byte[] bArr, int i, int i2, int i3);

    /* renamed from: b */
    public abstract byte mo73746b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo73759b(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo73751c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo73752d();

    /* renamed from: e */
    public abstract ByteBuffer mo73760e();

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract boolean mo73762f();

    /* renamed from: g */
    public abstract InputStream mo73763g();

    /* renamed from: h */
    public abstract bxuc mo73764h();

    public final int hashCode() {
        int i = this.f164798c;
        if (i == 0) {
            int a = mo73744a();
            i = mo73759b(a, 0, a);
            if (i == 0) {
                i = 1;
            }
            this.f164798c = i;
        }
        return i;
    }

    /* renamed from: i */
    public bxtr iterator() {
        return new bxtm(this);
    }

    /* renamed from: j */
    public final boolean mo73779j() {
        return mo73744a() == 0;
    }

    /* renamed from: k */
    public final byte[] mo73780k() {
        int a = mo73744a();
        if (a == 0) {
            return bxwd.f164981b;
        }
        byte[] bArr = new byte[a];
        mo73745a(bArr, 0, 0, a);
        return bArr;
    }

    /* renamed from: l */
    public final String mo73781l() {
        return mo73773b(bxwd.f164980a);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo73744a());
        objArr[2] = mo73744a() > 50 ? String.valueOf(bxyj.m124411a(mo73754a(0, 47))).concat("...") : bxyj.m124411a(this);
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: b */
    static bxtx m123264b(byte[] bArr) {
        return new bxtu(bArr);
    }

    /* renamed from: b */
    static bxtx m123265b(byte[] bArr, int i, int i2) {
        return new bxtp(bArr, i, i2);
    }

    /* renamed from: c */
    public final bxtx mo73775c(int i) {
        return mo73754a(i, mo73744a());
    }

    /* renamed from: b */
    static void m123266b(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i >= 0) {
            StringBuilder sb = new StringBuilder(40);
            sb.append("Index > length: ");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(22);
        sb2.append("Index < 0: ");
        sb2.append(i);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* renamed from: b */
    public final String mo73772b(String str) {
        try {
            return mo73773b(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.util.Collection, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static bxtx m123257a(Iterable r3) {
        int i;
        if (!(r3 instanceof Collection)) {
            int size = r3.size();
            i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                r3.get(i2);
                i++;
            }
        } else {
            i = r3.size();
        }
        return i != 0 ? m123260a(r3.iterator(), i) : f164797b;
    }

    /* renamed from: b */
    public final String mo73773b(Charset charset) {
        return mo73744a() != 0 ? mo73755a(charset) : "";
    }

    @Deprecated
    /* renamed from: b */
    public final void mo73774b(byte[] bArr, int i, int i2, int i3) {
        m123267c(i, i + i3, mo73744a());
        m123267c(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo73745a(bArr, i, i2, i3);
        }
    }

    /* renamed from: a */
    public static bxtx m123258a(String str) {
        return new bxtu(str.getBytes(bxwd.f164980a));
    }

    /* renamed from: a */
    public static bxtx m123259a(String str, Charset charset) {
        return new bxtu(str.getBytes(charset));
    }

    /* renamed from: a */
    private static bxtx m123260a(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        } else if (i == 1) {
            return (bxtx) it.next();
        } else {
            int i2 = i >>> 1;
            return m123260a(it, i2).mo73770a(m123260a(it, i - i2));
        }
    }

    /* renamed from: a */
    public static bxtx m123261a(byte[] bArr) {
        return m123262a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static bxtx m123262a(byte[] bArr, int i, int i2) {
        m123267c(i, i + i2, bArr.length);
        return new bxtu(f164796a.mo73742a(bArr, i, i2));
    }

    /* renamed from: a */
    public final bxtx mo73770a(bxtx bxtx) {
        if (Integer.MAX_VALUE - mo73744a() >= bxtx.mo73744a()) {
            int i = bxxu.f165061h;
            if (bxtx.mo73744a() == 0) {
                return this;
            }
            if (mo73744a() == 0) {
                return bxtx;
            }
            int a = mo73744a() + bxtx.mo73744a();
            if (a < 128) {
                return bxxu.m124312a(this, bxtx);
            }
            if (this instanceof bxxu) {
                bxxu bxxu = (bxxu) this;
                if (bxxu.f165064f.mo73744a() + bxtx.mo73744a() < 128) {
                    return new bxxu(bxxu.f165063e, bxxu.m124312a(bxxu.f165064f, bxtx));
                } else if (bxxu.f165063e.mo73751c() > bxxu.f165064f.mo73751c() && bxxu.f165065g > bxtx.mo73751c()) {
                    return new bxxu(bxxu.f165063e, new bxxu(bxxu.f165064f, bxtx));
                }
            }
            if (a >= bxxu.m124313f(Math.max(mo73751c(), bxtx.mo73751c()) + 1)) {
                return new bxxu(this, bxtx);
            }
            bxxr bxxr = new bxxr();
            bxxr.mo74232a(this);
            bxxr.mo74232a(bxtx);
            bxtx bxtx2 = (bxtx) bxxr.f165050a.pop();
            while (!bxxr.f165050a.isEmpty()) {
                bxtx2 = new bxxu((bxtx) bxxr.f165050a.pop(), bxtx2);
            }
            return bxtx2;
        }
        int a2 = mo73744a();
        int a3 = bxtx.mo73744a();
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(a2);
        sb.append("+");
        sb.append(a3);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo73771a(byte[] bArr, int i) {
        mo73774b(bArr, 0, i, mo73744a());
    }
}
