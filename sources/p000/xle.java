package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: xle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xle {

    /* renamed from: a */
    public final byte f52646a;

    /* renamed from: b */
    public final byte f52647b;

    /* renamed from: c */
    public byte f52648c = 0;

    /* renamed from: d */
    public byte f52649d = 0;

    /* renamed from: e */
    public boolean f52650e = false;

    /* renamed from: f */
    public boat f52651f;

    /* renamed from: g */
    private int f52652g;

    /* renamed from: h */
    private byte[] f52653h;

    /* renamed from: i */
    private final int f52654i;

    private xle(byte b, byte b2, int i) {
        this.f52646a = b;
        this.f52647b = b2;
        this.f52654i = i;
        this.f52652g = m43130a(i);
    }

    /* renamed from: a */
    public static int m43130a(int i) {
        return i != 1 ? AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE : PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    /* renamed from: a */
    public final void mo29894a(byte b) {
        this.f52650e = true;
        this.f52648c = b;
    }

    /* renamed from: b */
    public final void mo29897b(int i) {
        if (this.f52654i == 1 && i > 256) {
            StringBuilder sb = new StringBuilder(68);
            sb.append("Short encoding has maximum result length 256, requested: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f52650e = true;
        this.f52652g = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xle) {
            return Arrays.equals(((xle) obj).mo29896a(), mo29896a());
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(mo29896a());
    }

    /* renamed from: a */
    public static xle m43131a(byte b, byte b2, int i) {
        return new xle(b, b2, i);
    }

    /* renamed from: a */
    public final void mo29895a(byte[] bArr) {
        if (this.f52651f == null) {
            this.f52651f = boav.m111024b();
        }
        this.f52650e = true;
        this.f52651f.write(bArr);
    }

    /* renamed from: a */
    public final byte[] mo29896a() {
        int i;
        int i2;
        int i3;
        if (this.f52653h == null || this.f52650e) {
            boat boat = this.f52651f;
            byte[] a = boat != null ? boat.mo68819a() : new byte[0];
            int length = a.length;
            int i4 = this.f52654i;
            int i5 = i4 - 1;
            if (i4 != 0) {
                if (i5 != 0) {
                    if (length <= 65535) {
                        i2 = length == 0 ? 0 : 3;
                        i = this.f52652g == 0 ? 0 : i2 > 0 ? 2 : 3;
                    } else {
                        throw new IllegalArgumentException("Extended encoding mandated, but APDU has more than 65535 bytes of data");
                    }
                } else if (length <= 255) {
                    if (length == 0) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                    if (this.f52652g == 0) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                } else {
                    throw new IllegalArgumentException("Short encoding mandated, but APDU has more than 255 bytes of data");
                }
                ByteBuffer allocate = ByteBuffer.allocate(i2 + 4 + length + i);
                allocate.put(new byte[]{this.f52646a, this.f52647b, this.f52648c, this.f52649d});
                allocate.put(bqcn.m112583a(length), 4 - i2, i2);
                if (length != 0) {
                    allocate.put(a);
                }
                allocate.put(bqcn.m112583a((int) ((char) this.f52652g)), 4 - i, i);
                this.f52653h = allocate.array();
                this.f52650e = false;
            } else {
                throw null;
            }
        }
        return this.f52653h;
    }
}
