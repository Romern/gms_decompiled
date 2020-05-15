package p000;

import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: ily */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ily {

    /* renamed from: d */
    public static final imo f21320d = new ilx();

    /* renamed from: e */
    private static final Pattern f21321e = Pattern.compile("^.+@(.*\\.|)gserviceaccount\\.com$");

    /* renamed from: a */
    public final PackageManager f21322a;

    /* renamed from: b */
    public final svq f21323b;

    /* renamed from: c */
    public final gpy f21324c;

    /* renamed from: f */
    private final DevicePolicyManager f21325f;

    public ily(DevicePolicyManager devicePolicyManager, PackageManager packageManager, svq svq, gpy gpy) {
        this.f21325f = devicePolicyManager;
        this.f21322a = packageManager;
        this.f21323b = svq;
        this.f21324c = gpy;
    }

    /* renamed from: c */
    private final boolean m15686c(String str) {
        int i = Build.VERSION.SDK_INT;
        return this.f21325f.isDeviceOwnerApp(str) || this.f21325f.isProfileOwnerApp(str);
    }

    /* renamed from: d */
    private final String m15687d(String str) {
        try {
            PackageInfo b = this.f21323b.mo26176b(str, 64);
            if (b == null || b.signatures == null || b.signatures.length == 0 || b.signatures[0] == null) {
                String valueOf = String.valueOf(str);
                Log.e("GLSUser", valueOf.length() == 0 ? new String("package without signature: ") : "package without signature: ".concat(valueOf));
                return "";
            }
            try {
                return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(b.signatures[0].toByteArray()), 11);
            } catch (NoSuchAlgorithmException e) {
                Log.e("GLSUser", "Cannot get SHA256 algorithm:", e);
                return "";
            }
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf2 = String.valueOf(str);
            Log.e("GLSUser", valueOf2.length() == 0 ? new String("package not found: ") : "package not found: ".concat(valueOf2), e2);
            return "";
        }
    }

    /* renamed from: a */
    public final String mo13129a() {
        ComponentName profileOwner;
        int i = Build.VERSION.SDK_INT;
        String deviceOwner = this.f21325f.getDeviceOwner();
        return (deviceOwner != null || (profileOwner = this.f21325f.getProfileOwner()) == null) ? deviceOwner : profileOwner.getPackageName();
    }

    /* renamed from: b */
    public final boolean mo13133b(int i) {
        String[] a = this.f21323b.mo26175a(i);
        if (a != null) {
            for (String str : a) {
                if (m15686c(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo13134b(String str) {
        List<ComponentName> activeAdmins = this.f21325f.getActiveAdmins();
        if (activeAdmins != null) {
            for (ComponentName componentName : activeAdmins) {
                if (str.equals(componentName.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo13130a(int i) {
        String[] a = this.f21323b.mo26175a(i);
        if (a != null) {
            for (String str : a) {
                if (mo13132a(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo13131a(Account account) {
        return account != null && "com.google.work".equals(account.type) && f21321e.matcher(account.name).matches();
    }

    /* renamed from: a */
    public final boolean mo13132a(String str) {
        if (m15686c(str) || mo13134b(str)) {
            return true;
        }
        if (!((Boolean) gnv.f18732c.mo58455c()).booleanValue() || mo13129a() != null) {
            return false;
        }
        kav j = gnv.m13565j();
        if (j.f23665a.size() != 0) {
            String d = m15687d(str);
            bxwc bxwc = j.f23665a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                kaw kaw = (kaw) bxwc.get(i);
                if (kaw.f23668a.equals(str) && kaw.f23669b.equals(d)) {
                    return true;
                }
            }
        }
        return false;
    }
}
