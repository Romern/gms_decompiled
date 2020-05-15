package p000;

import java.io.InputStream;
import java.util.Arrays;

/* renamed from: aykn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aykn {

    /* renamed from: a */
    public int f97857a = 0;

    /* renamed from: b */
    public boolean f97858b;

    /* renamed from: c */
    public int f97859c;

    /* renamed from: d */
    private final InputStream f97860d;

    /* renamed from: e */
    private final int f97861e;

    /* renamed from: f */
    private byte[] f97862f = new byte[4096];

    /* renamed from: g */
    private int f97863g;

    public aykn(InputStream inputStream, int i) {
        this.f97860d = inputStream;
        this.f97861e = Math.max(i, 4096);
        this.f97858b = inputStream == null;
        this.f97859c = 0;
        this.f97863g = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte mo54056a(int i) {
        int i2 = this.f97857a;
        if (i < i2) {
            return this.f97862f[mo54061b(i)];
        }
        StringBuilder sb = new StringBuilder(42);
        sb.append("Index ");
        sb.append(i);
        sb.append(" exceeds size ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: b */
    public final int mo54061b(int i) {
        return (this.f97859c + i) % this.f97862f.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("circular buffer size: ");
        sb.append(this.f97857a);
        sb.append(10);
        for (int i = 0; i < Math.min(this.f97857a, 100); i++) {
            char a = (char) mo54056a(i);
            sb.append(a != 10 ? Character.valueOf(a) : "\\n");
            sb.append('(');
            sb.append((int) ((byte) a));
            sb.append("), ");
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo54057a(int i, byte[] bArr, int i2) {
        if (i2 <= this.f97862f.length) {
            int b = mo54061b(i);
            byte[] bArr2 = this.f97862f;
            int length = bArr2.length - b;
            if (i2 > length) {
                System.arraycopy(bArr, 0, bArr2, b, length);
                System.arraycopy(bArr, length, this.f97862f, 0, i2 - length);
                return;
            }
            System.arraycopy(bArr, 0, bArr2, b, i2);
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Not enough space to write ");
        sb.append(i2);
        sb.append(" bytes");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo54058a(int i, byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return;
        }
        if (this.f97857a - i < i3) {
            throw new IndexOutOfBoundsException("Not enough data to copy.");
        } else if (bArr.length - i2 >= i3) {
            int b = mo54061b(i);
            int b2 = mo54061b(i + i3);
            if (b < b2) {
                System.arraycopy(this.f97862f, b, bArr, i2, i3);
                return;
            }
            byte[] bArr2 = this.f97862f;
            int length = bArr2.length - b;
            System.arraycopy(bArr2, b, bArr, i2, length);
            System.arraycopy(this.f97862f, 0, bArr, i2 + length, b2);
        } else {
            throw new IndexOutOfBoundsException("Not enough space to copy.");
        }
    }

    /* renamed from: a */
    public final boolean mo54059a() {
        int i;
        if (this.f97858b) {
            return false;
        }
        int i2 = 0;
        while (true) {
            int i3 = this.f97857a;
            byte[] bArr = this.f97862f;
            int length = bArr.length;
            if (i3 == length) {
                int i4 = this.f97861e;
                if (length >= i4) {
                    return true;
                }
                this.f97862f = Arrays.copyOf(bArr, Math.min(length + length, i4));
            }
            InputStream inputStream = this.f97860d;
            byte[] bArr2 = this.f97862f;
            int i5 = this.f97863g;
            int i6 = this.f97859c;
            if (i6 <= i5) {
                i = bArr2.length - i5;
            } else {
                i = i6 - i5;
            }
            int read = inputStream.read(bArr2, i5, i);
            if (read != -1) {
                this.f97857a += read;
                this.f97863g = (this.f97863g + read) % this.f97861e;
                i2 += read;
            } else {
                this.f97858b = true;
                return i2 != 0;
            }
        }
    }

    /* renamed from: a */
    public final byte[] mo54060a(int i, int i2) {
        byte[] bArr = new byte[i2];
        mo54058a(i, bArr, 0, i2);
        return bArr;
    }
}
