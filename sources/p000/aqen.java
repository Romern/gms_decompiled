package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: aqen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqen {
    static {
        aqen.class.getCanonicalName();
    }

    aqen() {
    }

    /* renamed from: a */
    private static int m71444a(Context context) {
        try {
            Class<?> cls = Class.forName("android.service.persistentdata.PersistentDataBlockManager");
            Object systemService = context.getSystemService((String) Context.class.getField("PERSISTENT_DATA_BLOCK_SERVICE").get(null));
            if (systemService != null) {
                return ((Integer) cls.getDeclaredMethod("getFlashLockState", new Class[0]).invoke(systemService, new Object[0])).intValue();
            }
            return -1;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            return -1;
        }
    }

    /* renamed from: a */
    private static int m71445a(Context context, String str) {
        try {
            Class<?> cls = Class.forName("android.provider.Settings$System");
            return ((Integer) cls.getMethod("getInt", ContentResolver.class, String.class).invoke(null, context.getContentResolver(), (String) cls.getField(str).get(null))).intValue();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            return -1;
        }
    }

    /* renamed from: a */
    static aqek m71446a(Context context, aqfa aqfa) {
        aqek aqek = new aqek();
        aqek.f85875a = m71447a("ro.boot.verifiedbootstate");
        aqek.f85876b = m71447a("ro.boot.veritymode");
        aqek.f85877c = m71447a("ro.build.version.security_patch");
        int i = -1;
        try {
            i = ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "ro.oem_unlock_supported", -1)).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
        }
        aqek.f85878d = i;
        int i2 = Build.VERSION.SDK_INT;
        aqek.f85879e = m71444a(context);
        aqek.f85880f = m71447a("ro.product.brand");
        aqek.f85881g = m71447a("ro.product.model");
        aqek.f85882h = aqfy.m71563b("/proc/version");
        int i3 = Build.VERSION.SDK_INT;
        ArrayList arrayList = new ArrayList();
        String a = aqfa.f85935b.mo47806a("jvm_properties");
        if (!TextUtils.isEmpty(a)) {
            arrayList.addAll(Arrays.asList(a.split(",")));
        }
        Collections.addAll(arrayList, aqfa.f85934a);
        if (arrayList.size() > 0) {
            if (aqek.f85883i == null) {
                aqek.f85883i = new ArrayList();
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                String str = (String) arrayList.get(i4);
                aqem aqem = new aqem();
                aqem.f85888a = str;
                aqem.f85889b = System.getProperty(str);
                if (aqem.f85889b != null) {
                    aqek.f85883i.add(aqem);
                }
            }
        }
        if (aqfy.m71557a(aqek.f85880f, aqfy.m71566c("KkzFqJ9SGQ=="))) {
            aqek.f85884j = new aqel();
            aqek.f85884j.f85887b = 3;
            Iterator<ApplicationInfo> it = context.getPackageManager().getInstalledApplications(128).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ApplicationInfo next = it.next();
                if (aqfy.m71566c("OkLF9ZlZHd1DkGVR2aCjET9C3LqJUBeWTIo=").equalsIgnoreCase(next.packageName)) {
                    if (next.enabled) {
                        aqek.f85884j.f85887b = 1;
                    } else {
                        aqek.f85884j.f85887b = 2;
                    }
                }
            }
            aqek.f85884j.f85886a = m71445a(context, "SOFTWARE_UPDATE_AUTO_UPDATE");
        }
        int i5 = Build.VERSION.SDK_INT;
        bxvd da = aqal.f85408d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aqal aqal = (aqal) da.f164949b;
        "RSA_hardware_backed".getClass();
        aqal.f85410a |= 1;
        aqal.f85411b = "RSA_hardware_backed";
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            instance.initialize(new KeyGenParameterSpec.Builder("snet_test_keys", 4).setDigests("SHA-256").build());
            String valueOf = String.valueOf(((KeyInfo) KeyFactory.getInstance("RSA", "AndroidKeyStore").getKeySpec(instance.generateKeyPair().getPrivate(), KeyInfo.class)).isInsideSecureHardware());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aqal aqal2 = (aqal) da.f164949b;
            valueOf.getClass();
            aqal2.f85410a |= 2;
            aqal2.f85412c = valueOf;
        } catch (GeneralSecurityException e2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aqal aqal3 = (aqal) da.f164949b;
            "Unknown".getClass();
            aqal3.f85410a |= 2;
            aqal3.f85412c = "Unknown";
        }
        bxvd da2 = aqal.f85408d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        aqal aqal4 = (aqal) da2.f164949b;
        "EC_hardware_backed".getClass();
        aqal4.f85410a |= 1;
        aqal4.f85411b = "EC_hardware_backed";
        try {
            KeyPairGenerator instance2 = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            instance2.initialize(new KeyGenParameterSpec.Builder("snet_test_keys", 4).setDigests("SHA-256").build());
            String valueOf2 = String.valueOf(((KeyInfo) KeyFactory.getInstance("EC", "AndroidKeyStore").getKeySpec(instance2.generateKeyPair().getPrivate(), KeyInfo.class)).isInsideSecureHardware());
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aqal aqal5 = (aqal) da2.f164949b;
            valueOf2.getClass();
            aqal5.f85410a |= 2;
            aqal5.f85412c = valueOf2;
        } catch (GeneralSecurityException | ProviderException e3) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            aqal aqal6 = (aqal) da2.f164949b;
            "Unknown".getClass();
            aqal6.f85410a |= 2;
            aqal6.f85412c = "Unknown";
        }
        aqek.f85885k = new aqal[]{(aqal) da.mo74062i(), (aqal) da2.mo74062i()};
        return aqek;
    }

    /* renamed from: a */
    private static String m71447a(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            return TextUtils.isEmpty(str2) ? "Unknown" : str2;
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException e) {
            return "Unknown";
        } catch (InvocationTargetException e2) {
            return "Unknown";
        }
    }
}
