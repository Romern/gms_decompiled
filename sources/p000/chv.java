package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: chv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chv implements crh {
    /* renamed from: b */
    public static final chw m4287b() {
        try {
            return new chw(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3820a() {
        return m4287b();
    }
}
