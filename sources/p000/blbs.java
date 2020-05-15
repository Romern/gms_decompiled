package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: blbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blbs {

    /* renamed from: b */
    public static final char[] f125860b = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public final MessageDigest f125861a;

    public blbs() {
        try {
            this.f125861a = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final void mo66468a(byte[] bArr, int i, int i2) {
        this.f125861a.update(bArr, i, i2);
    }
}
