package p000;

import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;

/* renamed from: bquv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bquv implements bqod {

    /* renamed from: a */
    private final ECPrivateKey f141649a;

    /* renamed from: b */
    private final String f141650b;

    /* renamed from: c */
    private final int f141651c;

    public bquv(ECPrivateKey eCPrivateKey, int i, int i2) {
        this.f141649a = eCPrivateKey;
        this.f141650b = bqwk.m113519a(i);
        this.f141651c = i2;
    }

    /* renamed from: a */
    public final byte[] mo69316a(byte[] bArr) {
        int i;
        byte b;
        byte b2;
        int i2;
        int i3;
        int i4;
        byte b3;
        Signature signature = (Signature) bqvo.f141691c.mo69341a(this.f141650b);
        signature.initSign(this.f141649a);
        signature.update(bArr);
        byte[] sign = signature.sign();
        byte b4 = 1;
        if (this.f141651c != 1) {
            return sign;
        }
        int b5 = bqvm.m113485b(this.f141649a.getParams().getCurve());
        int i5 = b5 + b5;
        int length = sign.length;
        if (length >= 8 && sign[0] == 48) {
            byte b6 = sign[1] & 255;
            int i6 = 2;
            if (b6 == 129) {
                b = sign[2] & 255;
                if (b >= 128) {
                    i = 2;
                }
            } else if (b6 != 128 && b6 <= 129) {
                b = b6;
                i = 1;
            }
            if (b == (length - 1) - i && sign[i + 1] == 2 && (i4 = (i3 = (i2 = i + 3) + (b2 = sign[i + 2] & 255)) + 1) < length && b2 != 0) {
                byte b7 = sign[i2];
                if ((b7 & 255) < 128 && ((b2 <= 1 || b7 != 0 || (sign[i + 4] & 255) >= 128) && sign[i3] == 2)) {
                    byte b8 = sign[i4] & 255;
                    if (i3 + 2 + b8 == length && b8 != 0) {
                        byte b9 = sign[i + 5 + b2];
                        if ((b9 & 255) < 128 && (b8 <= 1 || b9 != 0 || (sign[i + 6 + b2] & 255) >= 128)) {
                            byte[] bArr2 = new byte[i5];
                            if (b6 >= 128) {
                                i6 = 3;
                            }
                            int i7 = i6 + 1;
                            int i8 = i7 + 1;
                            byte b10 = sign[i7];
                            if (sign[i8] == 0) {
                                b3 = 1;
                            } else {
                                b3 = 0;
                            }
                            System.arraycopy(sign, i8 + b3, bArr2, ((i5 / 2) - b10) + b3, b10 - b3);
                            int i9 = i8 + b10 + 1;
                            int i10 = i9 + 1;
                            byte b11 = sign[i9];
                            if (sign[i10] != 0) {
                                b4 = 0;
                            }
                            System.arraycopy(sign, i10 + b4, bArr2, (i5 - b11) + b4, b11 - b4);
                            return bArr2;
                        }
                    }
                }
            }
        }
        throw new GeneralSecurityException("Invalid DER encoding");
    }
}
