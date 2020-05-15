package p000;

import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.mdm.receivers.MdmDeviceAdminChimeraReceiver;
import com.google.android.gms.mdm.services.SitrepHelperIntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: afzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afzq {

    /* renamed from: a */
    public static boolean f65032a = false;

    /* renamed from: b */
    private static boolean f65033b = false;

    /* renamed from: a */
    public static ComponentName m53757a() {
        return new ComponentName(rpr.m34216b(), apuh.m71023a(MdmDeviceAdminChimeraReceiver.class));
    }

    /* renamed from: c */
    public static void m53765c(Context context) {
        try {
            ((DevicePolicyManager) context.getSystemService("device_policy")).lockNow();
        } catch (SecurityException e) {
            agac.m53793c("FMD does not own an active administrator that uses USES_POLICY_FORCE_LOCK", new Object[0]);
        }
    }

    /* renamed from: d */
    public static void m53767d(Context context) {
        if (cgkt.m145940l()) {
            int i = Build.VERSION.SDK_INT;
            int i2 = Build.VERSION.SDK_INT;
            if (!m53766c(context, false)) {
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
                ComponentName a = m53757a();
                try {
                    devicePolicyManager.setKeyguardDisabledFeatures(a, 8);
                } catch (SecurityException e) {
                    int i3 = Build.VERSION.SDK_INT;
                    m53762b();
                    try {
                        devicePolicyManager.setKeyguardDisabledFeatures(a, 8);
                    } catch (SecurityException e2) {
                        agac.m53793c("FMD does not own an admin that uses USES_POLICY_DISABLE_KEYGUARD_FEATURESeven after refreshing device admin", new Object[0]);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public static void m53768e(Context context) {
        if (cgkt.m145940l()) {
            int i = Build.VERSION.SDK_INT;
            int i2 = Build.VERSION.SDK_INT;
            if (!m53766c(context, true)) {
                try {
                    ((DevicePolicyManager) context.getSystemService("device_policy")).setKeyguardDisabledFeatures(m53757a(), 0);
                } catch (SecurityException e) {
                    agac.m53793c("FMD does not own an admin that uses USES_POLICY_DISABLE_KEYGUARD_FEATURES", new Object[0]);
                }
            }
        }
    }

    /* renamed from: f */
    public static void m53769f(Context context) {
        NfcAdapter defaultAdapter;
        if (!cgki.m145895c() && (defaultAdapter = NfcAdapter.getDefaultAdapter(context)) != null) {
            if (f65033b) {
                f65033b = false;
                defaultAdapter.enable();
                agac.m53792b("Enable NFC", new Object[0]);
            }
            if (cgki.m145897e()) {
                int i = Build.VERSION.SDK_INT;
                if (f65032a) {
                    f65032a = false;
                    if (defaultAdapter.isSecureNfcSupported()) {
                        if (defaultAdapter.isEnabled()) {
                            defaultAdapter.enableSecureNfc(false);
                        } else {
                            defaultAdapter.enable();
                            defaultAdapter.enableSecureNfc(false);
                            defaultAdapter.disable();
                        }
                        agac.m53792b("Disable Secure NFC", new Object[0]);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public static void m53770g(Context context) {
        if (!m53764b(context)) {
            Intent intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
            intent.putExtra("android.app.extra.DEVICE_ADMIN", m53757a());
            intent.putExtra("android.app.extra.ADD_EXPLANATION", context.getString(C0126R.string.mdm_device_admin_desc));
            context.startActivity(intent);
        }
    }

    /* renamed from: h */
    private static void m53771h(Context context) {
        try {
            ((DevicePolicyManager) context.getSystemService("device_policy")).removeActiveAdmin(m53757a());
        } catch (SecurityException e) {
            agac.m53793c("FMD is not in the owner application of admin", new Object[0]);
        }
    }

    /* renamed from: a */
    public static cajz m53758a(DevicePolicyManager devicePolicyManager) {
        bxvd da = cajz.f174899k.mo74144da();
        int passwordQuality = devicePolicyManager.getPasswordQuality(null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajz cajz = (cajz) da.f164949b;
        cajz.f174901a |= 1;
        cajz.f174902b = passwordQuality;
        int passwordMaximumLength = devicePolicyManager.getPasswordMaximumLength(passwordQuality);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajz cajz2 = (cajz) da.f164949b;
        cajz2.f174901a |= 2;
        cajz2.f174903c = passwordMaximumLength;
        int passwordMinimumLength = devicePolicyManager.getPasswordMinimumLength(null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajz cajz3 = (cajz) da.f164949b;
        cajz3.f174901a |= 4;
        cajz3.f174904d = passwordMinimumLength;
        int passwordMinimumLetters = devicePolicyManager.getPasswordMinimumLetters(null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajz cajz4 = (cajz) da.f164949b;
        cajz4.f174901a |= 8;
        cajz4.f174905e = passwordMinimumLetters;
        int passwordMinimumLowerCase = devicePolicyManager.getPasswordMinimumLowerCase(null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajz cajz5 = (cajz) da.f164949b;
        cajz5.f174901a |= 16;
        cajz5.f174906f = passwordMinimumLowerCase;
        int passwordMinimumNonLetter = devicePolicyManager.getPasswordMinimumNonLetter(null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajz cajz6 = (cajz) da.f164949b;
        cajz6.f174901a |= 32;
        cajz6.f174907g = passwordMinimumNonLetter;
        int passwordMinimumNumeric = devicePolicyManager.getPasswordMinimumNumeric(null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajz cajz7 = (cajz) da.f164949b;
        cajz7.f174901a |= 64;
        cajz7.f174908h = passwordMinimumNumeric;
        int passwordMinimumSymbols = devicePolicyManager.getPasswordMinimumSymbols(null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajz cajz8 = (cajz) da.f164949b;
        cajz8.f174901a |= 128;
        cajz8.f174909i = passwordMinimumSymbols;
        int passwordMinimumUpperCase = devicePolicyManager.getPasswordMinimumUpperCase(null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cajz cajz9 = (cajz) da.f164949b;
        cajz9.f174901a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        cajz9.f174910j = passwordMinimumUpperCase;
        return (cajz) da.mo74062i();
    }

    /* renamed from: b */
    private static cake m53762b() {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        agac.m53793c("Q+ devices does not need device admin.", new Object[0]);
        return cake.SUCCESS;
    }

    /* renamed from: c */
    private static boolean m53766c(Context context, boolean z) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        try {
            Method method = KeyguardManager.class.getMethod("setPrivateNotificationsAllowed", Boolean.TYPE);
            if (method != null) {
                method.invoke(keyguardManager, Boolean.valueOf(z));
                return true;
            }
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            agac.m53792b("Exception trying to set keyguard through KeyguardManager", new Object[0]);
        }
        return false;
    }

    /* renamed from: b */
    public static cake m53763b(Context context, boolean z) {
        if (z == m53764b(context)) {
            agac.m53793c("Device admin action is a no-op. Action: %s", Boolean.valueOf(z));
            return z ? cake.AUTO_ENABLE_ALREADY_DEVICE_ADMINISTRATOR : cake.AUTO_DISABLE_ALREADY_NOT_DEVICE_ADMINISTRATOR;
        } else if (z) {
            return m53762b();
        } else {
            m53771h(context);
            return cake.SUCCESS;
        }
    }

    /* renamed from: b */
    public static boolean m53764b(Context context) {
        return ((DevicePolicyManager) context.getSystemService("device_policy")).isAdminActive(m53757a());
    }

    /* renamed from: a */
    public static void m53759a(Context context) {
        if (m53764b(context)) {
            m53771h(context);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public static void m53760a(Context context, boolean z) {
        int i;
        StringBuilder sb = new StringBuilder(33);
        sb.append("DeviceAdminState changed to ");
        sb.append(z);
        sb.toString();
        int i2 = eoa.f15378a;
        Intent startIntent = IntentOperation.getStartIntent(context, SitrepHelperIntentOperation.class, "com.google.android.gms.mdm.services.ACTION_DEVICE_ADMIN_CHANGED");
        startIntent.putExtra("force", false);
        startIntent.putExtra("enabled", z);
        if (!z) {
            i = 3;
        } else {
            i = 4;
        }
        startIntent.putExtra("reason", i);
        context.startService(startIntent);
        Intent intent = new Intent("com.google.android.gms.mdm.DEVICE_ADMIN_CHANGE_INTENT");
        intent.putExtra("device_admin_enabled", z);
        aki.m919a(context).mo874a(intent);
        sex.m35104a(context).mo25444a("mdm.notification_reminder", 1);
    }

    /* renamed from: a */
    public static void m53761a(NfcAdapter nfcAdapter) {
        if (nfcAdapter.isEnabled()) {
            f65033b = true;
            nfcAdapter.disable();
            agac.m53792b("Disable NFC", new Object[0]);
        }
    }
}
