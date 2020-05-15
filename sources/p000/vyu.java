package p000;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* renamed from: vyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vyu implements vye {

    /* renamed from: a */
    protected static final byte[] f50251a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* renamed from: b */
    protected static final byte[] f50252b = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, 95, -61, 57, -4, -4, -114, -63};

    /* renamed from: c */
    private final byte[] f50253c = f50252b;

    /* renamed from: d */
    private final byte[] f50254d = f50251a;

    /* renamed from: a */
    public final boolean mo28956a(File file) {
        try {
            X509Certificate[][] a = blq.m3304a(file.getAbsolutePath());
            if (a.length == 1) {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(a[0][0].getEncoded());
                if (Arrays.equals(this.f50254d, digest)) {
                    return true;
                }
                if ("user".equals(Build.TYPE) || !Arrays.equals(this.f50253c, digest)) {
                    return false;
                }
                return true;
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (bln e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException | RuntimeException e2) {
            throw new GeneralSecurityException("Failed to verify signatures", e2);
        }
    }
}
