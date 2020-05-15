package p000;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* renamed from: kpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kpl implements kpk {

    /* renamed from: a */
    private static final srn f24747a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: b */
    private final PackageManager f24748b;

    public kpl(PackageManager packageManager) {
        this.f24748b = packageManager;
    }

    /* renamed from: a */
    private static String m18290a(String str, String str2) {
        return String.format("%s://%s", str, str2);
    }

    /* renamed from: b */
    public final kck mo14765b(String str) {
        try {
            return m18291a(this.f24748b.getPackageInfo(str, 64)).f23818a;
        } catch (PackageManager.NameNotFoundException e) {
            throw new kpi(e);
        }
    }

    /* renamed from: a */
    private static kcl m18291a(PackageInfo packageInfo) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            throw new kpi("signatures.length != 1");
        }
        Signature signature = signatureArr[0];
        if (signature != null) {
            return new kcl(new kck(String.format("android://%s@%s", Base64.encodeToString(m18292a(signature), 10), Uri.encode(packageInfo.packageName)), packageInfo.packageName), String.valueOf(packageInfo.versionCode));
        }
        throw new kpi("signatures[0] == null");
    }

    /* renamed from: a */
    private static byte[] m18292a(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA-512").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException e) {
            throw new kpi(e);
        }
    }

    /* renamed from: a */
    public final bngx mo14762a() {
        List<PackageInfo> installedPackages = this.f24748b.getInstalledPackages(65);
        bngs b = bngx.m109371b(installedPackages.size());
        for (PackageInfo packageInfo : installedPackages) {
            if (!(packageInfo.activities == null || packageInfo.activities.length == 0)) {
                try {
                    b.mo67668c(m18291a(packageInfo));
                } catch (kpi e) {
                    bnsl bnsl = (bnsl) f24747a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("kpl", "a", 178, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("failed to create domain from PackageInfo");
                }
            }
        }
        return b.mo67664a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: a */
    public final kcv mo14763a(String str) {
        char c;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String encodedAuthority = parse.getEncodedAuthority();
        if (scheme == null || encodedAuthority == null) {
            throw new kpi("scheme or authority null");
        } else if (!encodedAuthority.isEmpty()) {
            int hashCode = scheme.hashCode();
            if (hashCode != -861391249) {
                if (hashCode != 3213448) {
                    if (hashCode == 99617003 && scheme.equals("https")) {
                        c = 2;
                        if (c != 0) {
                            String[] split = encodedAuthority.split("@");
                            if (split.length == 2) {
                                return new kck(m18290a(scheme, encodedAuthority), Uri.decode(split[1]));
                            }
                            throw new kpi("illegal android uri");
                        } else if (c == 1 || c == 2) {
                            return new kdl(m18290a(scheme, encodedAuthority));
                        } else {
                            throw new kpi(scheme.length() == 0 ? new String("illegal scheme: ") : "illegal scheme: ".concat(scheme));
                        }
                    }
                } else if (scheme.equals("http")) {
                    c = 1;
                    if (c != 0) {
                    }
                }
            } else if (scheme.equals("android")) {
                c = 0;
                if (c != 0) {
                }
            }
            c = 65535;
            if (c != 0) {
            }
        } else {
            throw new kpi("empty encodedAutority");
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.CharSequence], assign insn: 0x0014: INVOKE  (r2v2 ? I:java.lang.CharSequence) = (r2v1 android.content.pm.PackageManager), (r0v5 android.content.pm.ApplicationInfo) type: VIRTUAL call: android.content.pm.PackageManager.getApplicationLabel(android.content.pm.ApplicationInfo):java.lang.CharSequence */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final kpj mo14764a(kcv kcv) {
        kcz kcz = null;
        kcz = null;
        if (!(kcv instanceof kck)) {
            return new kpj(kcv.f23841b, null);
        }
        String str = ((kck) kcv).f23817a;
        try {
            ApplicationInfo applicationInfo = this.f24748b.getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                return new kpj(str, null);
            }
            ? applicationLabel = this.f24748b.getApplicationLabel(applicationInfo);
            if (applicationLabel != 0) {
                str = applicationLabel;
            }
            String str2 = applicationInfo.packageName;
            int i = applicationInfo.icon;
            if (!(str2 == null || i == 0)) {
                kcz = kcz.m17657a(str2, i, str);
            }
            return new kpj(str, kcz);
        } catch (PackageManager.NameNotFoundException e) {
            return new kpj(str, null);
        }
    }
}
