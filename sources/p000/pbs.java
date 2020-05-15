package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: pbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class pbs {
    static {
        bnsp.m110328a("GH.FileMigration");
    }

    /* renamed from: a */
    public static byte[] m30177a(InputStream inputStream) {
        DigestInputStream digestInputStream;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            try {
                digestInputStream = new DigestInputStream(inputStream, instance);
                do {
                } while (digestInputStream.read(new byte[4096]) != -1);
                byte[] digest = instance.digest();
                digestInputStream.close();
                return digest;
            } catch (IOException e) {
                throw new UnsupportedOperationException("Cannot calculate sha1 digest for source.", e);
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
            throw th;
        } catch (NoSuchAlgorithmException e2) {
            throw new UnsupportedOperationException("No SHA-1 encoder available.", e2);
        }
    }

    /* renamed from: a */
    public abstract int mo22873a();

    /* renamed from: a */
    public abstract File mo22874a(Context context);

    /* renamed from: a */
    public abstract void mo22875a(long j);

    /* renamed from: b */
    public abstract String mo22876b();

    /* renamed from: c */
    public abstract long mo22877c();
}
