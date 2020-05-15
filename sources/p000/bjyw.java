package p000;

import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.chimera.Activity;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: bjyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjyw {

    /* renamed from: a */
    private static final Pattern f123657a = Pattern.compile("[^\\d]");

    /* renamed from: b */
    private static long f123658b;

    /* renamed from: c */
    private static Boolean f123659c;

    /* renamed from: d */
    private static long f123660d;

    /* renamed from: e */
    private static Boolean f123661e;

    /* renamed from: a */
    public static String m104935a() {
        try {
            int i = Build.VERSION.SDK_INT;
            return Build.getSerial();
        } catch (SecurityException e) {
            return "unknown";
        }
    }

    /* renamed from: b */
    public static boolean m104941b(Context context) {
        int i = Build.VERSION.SDK_INT;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        return keyguardManager != null && keyguardManager.isKeyguardSecure();
    }

    /* renamed from: c */
    public static boolean m104942c(Context context) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Boolean bool = f123659c;
        if (bool != null && elapsedRealtime - f123658b <= 3600000) {
            return bool.booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (!bjzc.m104960a(context, "android.permission.USE_FINGERPRINT")) {
            f123659c = false;
        } else {
            try {
                FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService(FingerprintManager.class);
                if (fingerprintManager == null || !fingerprintManager.isHardwareDetected() || !fingerprintManager.hasEnrolledFingerprints()) {
                    z = false;
                } else {
                    z = true;
                }
                f123659c = Boolean.valueOf(z);
            } catch (RuntimeException e) {
                f123659c = false;
            }
        }
        f123658b = elapsedRealtime;
        return f123659c.booleanValue();
    }

    /* renamed from: d */
    public static boolean m104943d(Context context) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Boolean bool = f123661e;
        if (bool != null && elapsedRealtime - f123660d <= 3600000) {
            return bool.booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (!bjzc.m104960a(context, "android.permission.USE_BIOMETRIC")) {
            f123661e = false;
        } else {
            try {
                BiometricManager biometricManager = (BiometricManager) context.getSystemService(BiometricManager.class);
                if (biometricManager == null || biometricManager.canAuthenticate() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                f123661e = Boolean.valueOf(z);
            } catch (RuntimeException e) {
                f123661e = false;
            }
        }
        f123660d = elapsedRealtime;
        return f123661e.booleanValue();
    }

    /* renamed from: a */
    public static String m104936a(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m104937a(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity == null) {
            return null;
        }
        String packageName = callingActivity.getPackageName();
        if (packageName != null) {
            return packageName;
        }
        String valueOf = String.valueOf(callingActivity);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
        sb.append("getCallingPackage(): Couldn't get a package name from ");
        sb.append(valueOf);
        Log.e("CommonUtils", sb.toString());
        return null;
    }

    /* renamed from: a */
    public static String m104938a(CharSequence charSequence) {
        if (charSequence != null) {
            return f123657a.matcher(charSequence).replaceAll("");
        }
        return null;
    }

    /* renamed from: a */
    public static String m104939a(String str) {
        try {
            return Base64.encodeToString(m104940a(str.getBytes("UTF-8")), 11);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static byte[] m104940a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bArr);
            return instance.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
