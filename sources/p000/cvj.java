package p000;

import java.math.BigInteger;

/* renamed from: cvj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cvj {

    /* renamed from: a */
    public final byte[] f12192a;

    /* renamed from: b */
    public final byte[] f12193b;

    /* renamed from: c */
    public final byte[] f12194c;

    /* renamed from: d */
    public final byte[] f12195d;

    /* renamed from: e */
    public final byte[] f12196e;

    /* renamed from: f */
    public final int f12197f;

    public cvj(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f12192a = bArr;
        this.f12193b = bArr2;
        this.f12194c = bArr3;
        this.f12195d = bArr4;
        this.f12196e = bArr5;
        this.f12197f = new BigInteger(bArr).multiply(new BigInteger(bArr2)).toByteArray().length;
    }
}
