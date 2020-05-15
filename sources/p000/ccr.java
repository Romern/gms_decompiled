package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: ccr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ccr {

    /* renamed from: a */
    public final byte[] f6532a = new byte[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: b */
    public ByteBuffer f6533b;

    /* renamed from: c */
    public ccq f6534c;

    /* renamed from: d */
    public int f6535d = 0;

    /* renamed from: a */
    public final void mo3718a() {
        int c;
        do {
            c = mo3721c();
            this.f6533b.position(Math.min(this.f6533b.position() + c, this.f6533b.limit()));
        } while (c > 0);
    }

    /* renamed from: b */
    public final void mo3720b() {
        int c = mo3721c();
        this.f6535d = c;
        if (c > 0) {
            int i = 0;
            while (true) {
                try {
                    int i2 = this.f6535d;
                    if (i < i2) {
                        int i3 = i2 - i;
                        this.f6533b.get(this.f6532a, i, i3);
                        i += i3;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    this.f6534c.f6520b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final int mo3721c() {
        try {
            return this.f6533b.get() & 255;
        } catch (Exception e) {
            this.f6534c.f6520b = 1;
            return 0;
        }
    }

    /* renamed from: d */
    public final int mo3722d() {
        return this.f6533b.getShort();
    }

    /* renamed from: e */
    public final boolean mo3723e() {
        return this.f6534c.f6520b != 0;
    }

    /* renamed from: a */
    public final int[] mo3719a(int i) {
        int[] iArr;
        byte[] bArr = new byte[(i * 3)];
        try {
            this.f6533b.get(bArr);
            iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                try {
                    int i5 = i4 + 1;
                    int i6 = i5 + 1;
                    int i7 = i2 + 1;
                    iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                    i3 = i6;
                    i2 = i7;
                } catch (BufferUnderflowException e) {
                    this.f6534c.f6520b = 1;
                    return iArr;
                }
            }
        } catch (BufferUnderflowException e2) {
            iArr = null;
            this.f6534c.f6520b = 1;
            return iArr;
        }
        return iArr;
    }
}
