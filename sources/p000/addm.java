package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

/* renamed from: addm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class addm {
    /* renamed from: a */
    private static final addk m50216a(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(adea.m50242a(str, "|P|"), null);
        String string2 = sharedPreferences.getString(adea.m50242a(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        KeyPair a = m50219a(string, string2);
        String string3 = sharedPreferences.getString(adea.m50242a(str, "cre"), null);
        long j = 0;
        if (string3 != null) {
            try {
                j = Long.parseLong(string3);
            } catch (NumberFormatException e) {
            }
        }
        return new addk(a, j);
    }

    /* renamed from: b */
    private static final void m50221b(Context context, String str, addk addk) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (addk.equals(m50216a(sharedPreferences, str))) {
                return;
            }
        } catch (addl e) {
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(adea.m50242a(str, "|P|"), addk.mo33348a());
        edit.putString(adea.m50242a(str, "|K|"), addk.mo33349b());
        edit.putString(adea.m50242a(str, "cre"), String.valueOf(addk.f61441b));
        edit.commit();
    }

    /* renamed from: c */
    private static File m50222c(Context context, String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            try {
                String a = adea.m50243a(str.getBytes("UTF-8"));
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(a);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } else {
            str2 = "com.google.InstanceId.properties";
        }
        return new File(m50218a(context), str2);
    }

    /* renamed from: a */
    private static final addk m50217a(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            String property = properties.getProperty("pub");
            String property2 = properties.getProperty("pri");
            if (property != null) {
                if (property2 != null) {
                    addk addk = new addk(m50219a(property, property2), Long.parseLong(properties.getProperty("cre")));
                    fileInputStream.close();
                    return addk;
                }
            }
            fileInputStream.close();
            return null;
        } catch (NumberFormatException e) {
            throw new addl(e);
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final addk mo33353b(Context context, String str) {
        addk addk;
        try {
            File c = m50222c(context, str);
            if (c.exists()) {
                try {
                    addk = m50217a(c);
                } catch (IOException e) {
                    addk = m50217a(c);
                }
            } else {
                addk = null;
            }
            if (addk != null) {
                m50221b(context, str, addk);
                return addk;
            }
            e = null;
            try {
                addk a = m50216a(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (a != null) {
                    m50220a(context, str, a);
                    return a;
                } else if (e == null) {
                    return null;
                } else {
                    throw e;
                }
            } catch (addl e2) {
                e = e2;
            }
        } catch (IOException e3) {
            String valueOf = String.valueOf(e3);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
            sb.append("IID file exists, but failed to read from it: ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString());
            throw new addl(e3);
        } catch (addl e4) {
            e = e4;
        }
    }

    /* renamed from: a */
    public static File m50218a(Context context) {
        File c = C1133kh.m17845c(context);
        if (c != null && c.isDirectory()) {
            return c;
        }
        Log.w("InstanceID", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    /* renamed from: a */
    private static final KeyPair m50219a(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("InstanceID", sb.toString());
                throw new addl(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new addl(e2);
        }
    }

    /* renamed from: a */
    private static final void m50220a(Context context, String str, addk addk) {
        FileOutputStream fileOutputStream;
        try {
            File c = m50222c(context, str);
            c.createNewFile();
            Properties properties = new Properties();
            properties.setProperty("pub", addk.mo33348a());
            properties.setProperty("pri", addk.mo33349b());
            properties.setProperty("cre", String.valueOf(addk.f61441b));
            fileOutputStream = new FileOutputStream(c);
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (IOException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
            sb.append("Failed to write key: ");
            sb.append(valueOf);
            Log.w("InstanceID", sb.toString());
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final addk mo33352a(Context context, String str) {
        addk addk = new addk(adde.m50201a(), System.currentTimeMillis());
        try {
            addk b = mo33353b(context, str);
            if (b != null) {
                return b;
            }
        } catch (addl e) {
        }
        m50220a(context, str, addk);
        m50221b(context, str, addk);
        return addk;
    }
}
