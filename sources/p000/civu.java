package p000;

import java.text.ParseException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: civu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class civu {

    /* renamed from: a */
    public final SecretKeySpec f191542a;

    /* renamed from: b */
    public final SecretKeySpec f191543b;

    /* renamed from: c */
    public final IvParameterSpec f191544c;

    public civu(byte[] bArr) {
        try {
            byte[][] a = cixd.m151110a(bArr, 32, 32, 16);
            this.f191542a = new SecretKeySpec(a[0], "AES");
            this.f191543b = new SecretKeySpec(a[1], "HmacSHA256");
            this.f191544c = new IvParameterSpec(a[2]);
        } catch (ParseException e) {
            throw new AssertionError(e);
        }
    }
}
