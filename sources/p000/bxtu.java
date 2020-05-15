package p000;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: bxtu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class bxtu extends bxtt {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    protected final byte[] f164789a;

    public bxtu(byte[] bArr) {
        if (bArr != null) {
            this.f164789a = bArr;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public byte mo73743a(int i) {
        return this.f164789a[i];
    }

    /* renamed from: a */
    public int mo73744a() {
        return this.f164789a.length;
    }

    /* renamed from: b */
    public byte mo73746b(int i) {
        return this.f164789a[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo73747b() {
        return 0;
    }

    /* renamed from: e */
    public final ByteBuffer mo73760e() {
        return ByteBuffer.wrap(this.f164789a, mo73747b(), mo73744a()).asReadOnlyBuffer();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxtx) || mo73744a() != ((bxtx) obj).mo73744a()) {
            return false;
        }
        if (mo73744a() == 0) {
            return true;
        }
        if (!(obj instanceof bxtu)) {
            return obj.equals(this);
        }
        bxtu bxtu = (bxtu) obj;
        int i = this.f164798c;
        int i2 = bxtu.f164798c;
        if (i == 0 || i2 == 0 || i == i2) {
            return mo73750a(bxtu, 0, mo73744a());
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo73762f() {
        int b = mo73747b();
        return bxzd.m124557a(this.f164789a, b, mo73744a() + b);
    }

    /* renamed from: g */
    public final InputStream mo73763g() {
        return new ByteArrayInputStream(this.f164789a, mo73747b(), mo73744a());
    }

    /* renamed from: h */
    public final bxuc mo73764h() {
        return bxuc.m123421a(this.f164789a, mo73747b(), mo73744a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo73753a(int i, int i2, int i3) {
        int b = mo73747b() + i2;
        return bxzd.f165126a.mo74327a(i, this.f164789a, b, i3 + b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo73759b(int i, int i2, int i3) {
        return bxwd.m124078a(i, this.f164789a, mo73747b() + i2, i3);
    }

    /* renamed from: a */
    public final bxtx mo73754a(int i, int i2) {
        int c = m123267c(i, i2, mo73744a());
        return c != 0 ? new bxtp(this.f164789a, mo73747b() + i, c) : bxtx.f164797b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo73755a(Charset charset) {
        return new String(this.f164789a, mo73747b(), mo73744a(), charset);
    }

    /* renamed from: a */
    public final void mo73756a(bxtl bxtl) {
        bxtl.mo73737a(this.f164789a, mo73747b(), mo73744a());
    }

    /* renamed from: a */
    public final void mo73757a(OutputStream outputStream) {
        outputStream.write(mo73780k());
    }

    /* renamed from: a */
    public final void mo73758a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f164789a, mo73747b(), mo73744a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo73745a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f164789a, i, bArr, i2, i3);
    }

    /* renamed from: a */
    public final boolean mo73750a(bxtx bxtx, int i, int i2) {
        if (i2 <= bxtx.mo73744a()) {
            int i3 = i + i2;
            if (i3 > bxtx.mo73744a()) {
                int a = bxtx.mo73744a();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: ");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                sb.append(", ");
                sb.append(a);
                throw new IllegalArgumentException(sb.toString());
            } else if (!(bxtx instanceof bxtu)) {
                return bxtx.mo73754a(i, i3).equals(mo73754a(0, i2));
            } else {
                bxtu bxtu = (bxtu) bxtx;
                byte[] bArr = this.f164789a;
                byte[] bArr2 = bxtu.f164789a;
                int b = mo73747b() + i2;
                int b2 = mo73747b();
                int b3 = bxtu.mo73747b() + i;
                while (b2 < b) {
                    if (bArr[b2] != bArr2[b3]) {
                        return false;
                    }
                    b2++;
                    b3++;
                }
                return true;
            }
        } else {
            int a2 = mo73744a();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i2);
            sb2.append(a2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
