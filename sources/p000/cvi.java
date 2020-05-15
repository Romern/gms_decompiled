package p000;

import java.security.MessageDigest;

/* renamed from: cvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cvi {
    SHA1;
    

    /* renamed from: b */
    public final byte f12191b = 1;

    private cvi(String str) {
    }

    /* renamed from: a */
    public final byte[] mo8335a(byte[] bArr) {
        if (ordinal() == 0) {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bArr);
            return instance.digest();
        }
        throw null;
    }
}
