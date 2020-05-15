package p000;

import java.nio.ByteBuffer;

/* renamed from: pko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pko {

    /* renamed from: a */
    public final byte[] f39511a;

    /* renamed from: b */
    public int f39512b;

    /* renamed from: c */
    public int f39513c;

    /* renamed from: d */
    public int f39514d = -1;

    /* renamed from: e */
    public boolean f39515e = true;

    /* renamed from: f */
    private final ByteBuffer[] f39516f = new ByteBuffer[1];

    /* renamed from: g */
    private final ByteBuffer[] f39517g = new ByteBuffer[2];

    public pko(int i) {
        this.f39511a = new byte[i];
    }

    /* renamed from: a */
    public final void mo23328a(byte b) {
        this.f39511a[this.f39513c] = b;
        mo23331b(1);
    }

    /* renamed from: b */
    public final void mo23331b(int i) {
        int i2 = this.f39513c + i;
        this.f39513c = i2;
        int length = this.f39511a.length;
        if (i2 >= length) {
            this.f39513c = i2 - length;
        }
        this.f39515e = false;
        this.f39514d = -1;
    }

    /* renamed from: c */
    public final void mo23333c() {
        this.f39513c = 0;
        this.f39512b = 0;
        this.f39514d = -1;
        this.f39515e = true;
    }

    /* renamed from: d */
    public final int mo23334d() {
        if (this.f39515e) {
            return this.f39511a.length;
        }
        int i = this.f39513c;
        int i2 = this.f39512b;
        return i >= i2 ? (this.f39511a.length - i) + i2 : i2 - i;
    }

    /* renamed from: e */
    public final int mo23335e() {
        if (this.f39515e) {
            return 0;
        }
        int i = this.f39512b;
        int i2 = this.f39513c;
        return i >= i2 ? (this.f39511a.length - i) + i2 : i2 - i;
    }

    /* renamed from: f */
    public final boolean mo23336f() {
        return !this.f39515e && this.f39512b == this.f39513c;
    }

    /* renamed from: g */
    public final byte mo23337g() {
        byte b = this.f39511a[this.f39512b];
        mo23329a(1);
        return b;
    }

    /* renamed from: a */
    public final void mo23329a(int i) {
        int i2 = this.f39512b + i;
        this.f39512b = i2;
        int length = this.f39511a.length;
        if (i2 >= length) {
            i2 -= length;
            this.f39512b = i2;
        }
        if (i2 != this.f39513c) {
            return;
        }
        if (this.f39514d != -1) {
            this.f39515e = true;
        } else {
            mo23333c();
        }
    }

    /* renamed from: b */
    public final ByteBuffer[] mo23332b() {
        if (mo23336f()) {
            return null;
        }
        if (!this.f39515e) {
            int i = this.f39513c;
            int i2 = this.f39512b;
            if (i < i2) {
                ByteBuffer[] byteBufferArr = this.f39516f;
                byteBufferArr[0] = ByteBuffer.wrap(this.f39511a, i, i2 - i);
                return byteBufferArr;
            } else if (i2 != 0) {
                ByteBuffer[] byteBufferArr2 = this.f39517g;
                byte[] bArr = this.f39511a;
                byteBufferArr2[0] = ByteBuffer.wrap(bArr, i, bArr.length - i);
                byteBufferArr2[1] = ByteBuffer.wrap(this.f39511a, 0, this.f39512b);
                return byteBufferArr2;
            } else {
                ByteBuffer[] byteBufferArr3 = this.f39516f;
                byte[] bArr2 = this.f39511a;
                byteBufferArr3[0] = ByteBuffer.wrap(bArr2, i, bArr2.length - i);
                return byteBufferArr3;
            }
        } else {
            int i3 = this.f39512b;
            if (i3 != 0) {
                ByteBuffer[] byteBufferArr4 = this.f39517g;
                byte[] bArr3 = this.f39511a;
                byteBufferArr4[0] = ByteBuffer.wrap(bArr3, i3, bArr3.length - i3);
                byteBufferArr4[1] = ByteBuffer.wrap(this.f39511a, 0, this.f39513c);
                return byteBufferArr4;
            }
            ByteBuffer[] byteBufferArr5 = this.f39516f;
            byte[] bArr4 = this.f39511a;
            byteBufferArr5[0] = ByteBuffer.wrap(bArr4, 0, bArr4.length);
            return byteBufferArr5;
        }
    }

    /* renamed from: a */
    public final ByteBuffer[] mo23330a() {
        if (this.f39515e) {
            return null;
        }
        if (!mo23336f()) {
            int i = this.f39512b;
            int i2 = this.f39513c;
            if (i < i2) {
                ByteBuffer[] byteBufferArr = this.f39516f;
                byteBufferArr[0] = ByteBuffer.wrap(this.f39511a, i, i2 - i);
                return byteBufferArr;
            } else if (i2 != 0) {
                ByteBuffer[] byteBufferArr2 = this.f39517g;
                byte[] bArr = this.f39511a;
                byteBufferArr2[0] = ByteBuffer.wrap(bArr, i, bArr.length - i);
                byteBufferArr2[1] = ByteBuffer.wrap(this.f39511a, 0, this.f39513c);
                return byteBufferArr2;
            } else {
                ByteBuffer[] byteBufferArr3 = this.f39516f;
                byte[] bArr2 = this.f39511a;
                byteBufferArr3[0] = ByteBuffer.wrap(bArr2, i, bArr2.length - i);
                return byteBufferArr3;
            }
        } else {
            int i3 = this.f39512b;
            if (i3 != 0) {
                ByteBuffer[] byteBufferArr4 = this.f39517g;
                byte[] bArr3 = this.f39511a;
                byteBufferArr4[0] = ByteBuffer.wrap(bArr3, i3, bArr3.length - i3);
                byteBufferArr4[1] = ByteBuffer.wrap(this.f39511a, 0, this.f39513c);
                return byteBufferArr4;
            }
            ByteBuffer[] byteBufferArr5 = this.f39516f;
            byte[] bArr4 = this.f39511a;
            byteBufferArr5[0] = ByteBuffer.wrap(bArr4, 0, bArr4.length);
            return byteBufferArr5;
        }
    }
}
