package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgl implements bgj {

    /* renamed from: a */
    private final List f3173a;

    /* renamed from: b */
    private bgj f3174b;

    public bgl() {
        this.f3173a = new ArrayList();
        this.f3174b = null;
        this.f3174b = new bgk();
    }

    /* renamed from: a */
    private static final int m2962a(int i) {
        return Math.abs(Math.abs(i) - 32768);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* renamed from: b */
    public static final boolean m2964b() {
        Object a = bgs.f3191a.mo3119a("RETRY_REQUIRED", true);
        if (a != null) {
            return ((Boolean) a).booleanValue();
        }
        return false;
    }

    /* renamed from: c */
    public final int mo3108c(byte[] bArr) {
        return this.f3174b.mo3108c(bArr);
    }

    /* renamed from: d */
    public final int mo3110d(byte[] bArr) {
        return this.f3174b.mo3110d(bArr);
    }

    /* renamed from: e */
    public final int mo3112e(byte[] bArr, byte[] bArr2) {
        return this.f3174b.mo3112e(bArr, bArr2);
    }

    /* renamed from: f */
    public final int mo3113f(byte[] bArr, byte[] bArr2) {
        bhp.m3059c(new String(bArr));
        m2963a(bArr, bArr2);
        int f = this.f3174b.mo3113f(bArr, bArr2);
        if (f >= -12288) {
            return f;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("::SecureComponentImpl::getSignatureData::Retry::");
        sb.append(f);
        sb.toString();
        int a = m2962a(f);
        byte[] bArr3 = new byte[a];
        StringBuilder sb2 = new StringBuilder(67);
        sb2.append("::SecureComponentImpl::getSignatureData::newDestBuffer::");
        sb2.append(a);
        sb2.toString();
        int f2 = this.f3174b.mo3113f((byte[]) this.f3173a.get(0), bArr3);
        m2963a(bArr3);
        bgs.f3191a.mo3121a("RETRY_REQUIRED", Boolean.valueOf("true"));
        return f2;
    }

    /* renamed from: c */
    public final int mo3109c(byte[] bArr, byte[] bArr2) {
        return this.f3174b.mo3109c(bArr, bArr2);
    }

    /* renamed from: d */
    public final int mo3111d(byte[] bArr, byte[] bArr2) {
        return this.f3174b.mo3111d(bArr, bArr2);
    }

    /* renamed from: a */
    private final void m2963a(Object... objArr) {
        this.f3173a.clear();
        for (Object obj : objArr) {
            if (obj != null) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                    this.f3173a.add(bArr2);
                } else {
                    this.f3173a.add(obj);
                }
            }
        }
    }

    /* renamed from: b */
    public final int mo3106b(byte[] bArr) {
        bhp.m3059c(new String(bArr));
        m2963a(bArr);
        int b = this.f3174b.mo3106b(bArr);
        if (b >= -12288) {
            return b;
        }
        StringBuilder sb = new StringBuilder(48);
        sb.append("::SecureComponentImpl::close::Retry::");
        sb.append(b);
        sb.toString();
        int a = m2962a(b);
        byte[] bArr2 = new byte[a];
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("::SecureComponentImpl::close::newDestBuffer::");
        sb2.append(a);
        sb2.toString();
        int b2 = this.f3174b.mo3106b(bArr2);
        m2963a(bArr2);
        bgs.f3191a.mo3121a("RETRY_REQUIRED", Boolean.valueOf("true"));
        return b2;
    }

    /* renamed from: a */
    public final int mo3100a(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        byte[] bArr3 = bArr;
        if (bArr3 != null) {
            bhp.m3059c(new String(bArr3));
        }
        m2963a(Integer.valueOf(i), bArr3, Integer.valueOf(i2), bArr2, Integer.valueOf(i3));
        int a = this.f3174b.mo3100a(i, bArr, i2, bArr2, i3);
        if (a >= -12288) {
            return a;
        }
        StringBuilder sb = new StringBuilder(49);
        sb.append("::SecureComponentImpl::unwrap::Retry::");
        sb.append(a);
        sb.toString();
        int a2 = m2962a(a);
        byte[] bArr4 = new byte[a2];
        StringBuilder sb2 = new StringBuilder(57);
        sb2.append("::SecureComponentImpl::unwrap::newDestBuffer::");
        sb2.append(a2);
        sb2.toString();
        int a3 = this.f3174b.mo3100a(((Integer) this.f3173a.get(0)).intValue(), (byte[]) this.f3173a.get(1), ((Integer) this.f3173a.get(2)).intValue(), bArr4, a2);
        m2963a(bArr4);
        bgs.f3191a.mo3121a("RETRY_REQUIRED", Boolean.valueOf("true"));
        return a3;
    }

    /* renamed from: b */
    public final int mo3107b(byte[] bArr, byte[] bArr2) {
        bhp.m3059c(new String(bArr));
        m2963a(bArr, bArr2);
        int b = this.f3174b.mo3107b(bArr, bArr2);
        if (b >= -12288) {
            return b;
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("::SecureComponentImpl::updateSecureChannel::Retry::");
        sb.append(b);
        sb.toString();
        int a = m2962a(b);
        byte[] bArr3 = new byte[a];
        StringBuilder sb2 = new StringBuilder(70);
        sb2.append("::SecureComponentImpl::updateSecureChannel::newDestBuffer::");
        sb2.append(a);
        sb2.toString();
        int b2 = this.f3174b.mo3107b((byte[]) this.f3173a.get(0), bArr3);
        m2963a(bArr3);
        bgs.f3191a.mo3121a("RETRY_REQUIRED", Boolean.valueOf("true"));
        return b2;
    }

    /* renamed from: a */
    public final int mo3101a(int i, byte[] bArr, byte[] bArr2) {
        return this.f3174b.mo3101a(i, bArr, bArr2);
    }

    /* renamed from: a */
    public final int mo3102a(byte[] bArr) {
        return this.f3174b.mo3102a(bArr);
    }

    /* renamed from: a */
    public final int mo3103a(byte[] bArr, int i, byte[] bArr2, int i2) {
        bhp.m3059c(new String(bArr));
        m2963a(bArr, Integer.valueOf(i), bArr2, Integer.valueOf(i2));
        int a = this.f3174b.mo3103a(bArr, i, bArr2, i2);
        if (a >= -12288) {
            return a;
        }
        StringBuilder sb = new StringBuilder(47);
        sb.append("::SecureComponentImpl::wrap::Retry::");
        sb.append(a);
        sb.toString();
        int a2 = m2962a(a);
        byte[] bArr3 = new byte[a2];
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("::SecureComponentImpl::wrap::newDestBuffer::");
        sb2.append(a2);
        sb2.toString();
        int a3 = this.f3174b.mo3103a((byte[]) this.f3173a.get(0), ((Integer) this.f3173a.get(1)).intValue(), bArr3, a2);
        m2963a(bArr3);
        bgs.f3191a.mo3121a("RETRY_REQUIRED", Boolean.valueOf("true"));
        return a3;
    }

    /* renamed from: a */
    public final int mo3104a(byte[] bArr, byte[] bArr2) {
        bhp.m3059c(new String(bArr));
        m2963a(bArr, bArr2);
        int a = this.f3174b.mo3104a(bArr, bArr2);
        if (a >= -12288) {
            return a;
        }
        StringBuilder sb = new StringBuilder(66);
        sb.append("::SecureComponentImpl::initializeSecureChannel::Retry::");
        sb.append(a);
        sb.toString();
        int a2 = m2962a(a);
        byte[] bArr3 = new byte[a2];
        StringBuilder sb2 = new StringBuilder(74);
        sb2.append("::SecureComponentImpl::initializeSecureChannel::newDestBuffer::");
        sb2.append(a2);
        sb2.toString();
        int a3 = this.f3174b.mo3104a((byte[]) this.f3173a.get(0), bArr3);
        m2963a(bArr3);
        bgs.f3191a.mo3121a("RETRY_REQUIRED", Boolean.valueOf("true"));
        return a3;
    }

    /* renamed from: a */
    public final int mo3105a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return this.f3174b.mo3105a(bArr, bArr2, bArr3);
    }

    /* renamed from: a */
    public final byte[] mo3114a() {
        return (byte[]) this.f3173a.get(0);
    }
}
