package p000;

import java.io.InputStream;

/* renamed from: bwal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwal extends InputStream {

    /* renamed from: a */
    private int f158663a;

    /* renamed from: b */
    private final byte[] f158664b;

    /* renamed from: c */
    private int f158665c;

    /* renamed from: d */
    private int f158666d;

    /* renamed from: e */
    private final InputStream f158667e;

    public bwal(InputStream inputStream, int i) {
        this.f158667e = inputStream;
        this.f158663a = i;
        this.f158664b = new byte[Math.min(i, 4096)];
    }

    /* renamed from: a */
    private final boolean m121654a() {
        int i = this.f158663a;
        if (i <= 0) {
            return false;
        }
        if (this.f158665c < this.f158666d) {
            return true;
        }
        InputStream inputStream = this.f158667e;
        byte[] bArr = this.f158664b;
        int read = inputStream.read(bArr, 0, Math.min(i, bArr.length));
        this.f158666d = read;
        if (read > 0) {
            this.f158665c = 0;
            return true;
        }
        this.f158663a = 0;
        return false;
    }

    public final int available() {
        return this.f158666d - this.f158665c;
    }

    public final int read() {
        if (!m121654a()) {
            return -1;
        }
        this.f158663a--;
        byte[] bArr = this.f158664b;
        int i = this.f158665c;
        this.f158665c = i + 1;
        return bArr[i] & 255;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (!m121654a()) {
            return -1;
        }
        int min = Math.min(i2, this.f158666d - this.f158665c);
        System.arraycopy(this.f158664b, this.f158665c, bArr, i, min);
        this.f158665c += min;
        this.f158663a -= min;
        return min;
    }
}
