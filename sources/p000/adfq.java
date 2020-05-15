package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: adfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adfq {

    /* renamed from: a */
    private static final adfs f61565a = new adfs("SignatureVerifier");

    /* renamed from: b */
    private static final byte[] f61566b = {-26, 38, 73, -86, -29, 23, 110, 31, -50, -34, 96, 19, -58, -24, -70, 63, -1, -45, 41, 53, -6, -100, -86, -64, -44, 43, -64, -125, 81, 76, -53, -15};

    /* renamed from: c */
    private static final byte[] f61567c = {58, -1, 119, 121, -71, 17, 11, -54, 46, 10, 44, -125, 44, -108, 73, -15, -126, 47, Byte.MAX_VALUE, -38, -55, -36, -50, -110, 11, -41, -69, -86, 44, 106, 6, 56};

    /* renamed from: d */
    private static final byte[] f61568d = {-16, -3, 108, 91, 65, 15, 37, -53, 37, -61, -75, 51, 70, -56, -105, 47, -82, 48, -8, -18, 116, 17, -33, -111, 4, Byte.MIN_VALUE, -83, 107, 45, 96, -37, -125};

    /* renamed from: e */
    private static final byte[] f61569e = {25, 117, -78, -15, 113, 119, -68, -119, -91, -33, -13, 31, -98, 100, -90, -54, -30, -127, -91, 61, -63, -47, -43, -101, 29, 20, Byte.MAX_VALUE, -31, -56, 42, -6, 0};

    /* renamed from: f */
    private final Context f61570f;

    public adfq(Context context) {
        this.f61570f = context;
    }

    /* renamed from: a */
    private final boolean m50313a(PackageInfo packageInfo) {
        if (packageInfo.signatures.length == 1) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(packageInfo.signatures[0].toByteArray());
                if (Arrays.equals(digest, f61567c)) {
                    return true;
                }
                if (Arrays.equals(digest, f61566b)) {
                    if (cepl.f183185a.mo6606a().mo79537h() || rfx.m33537a(this.f61570f)) {
                        return true;
                    }
                    f61565a.mo33429c("Test-keys are not supported on this device.", new Object[0]);
                }
                return false;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m50314b(PackageInfo packageInfo) {
        if (packageInfo.signatures.length == 1) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(packageInfo.signatures[0].toByteArray());
                if (Arrays.equals(digest, f61568d)) {
                    return true;
                }
                if (Arrays.equals(digest, f61569e)) {
                    if (rfx.m33537a(this.f61570f)) {
                        return true;
                    }
                    f61565a.mo33429c("Test-keys are not supported on this device.", new Object[0]);
                }
                return false;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo33422b(int i) {
        String[] packagesForUid = this.f61570f.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && packagesForUid.length == 1) {
            try {
                if (m50314b(this.f61570f.getPackageManager().getPackageInfo(packagesForUid[0], 64))) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo33421a(int i) {
        String[] packagesForUid = this.f61570f.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && packagesForUid.length == 1) {
            try {
                if (m50313a(this.f61570f.getPackageManager().getPackageInfo(packagesForUid[0], 64))) {
                    return true;
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return false;
    }
}
