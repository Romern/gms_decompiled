package com.google.android.gms.common;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GoogleCertificatesImpl extends scp {
    /* renamed from: a */
    private static Context m22458a() {
        Context context = qkk.f41604a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Missing DynamiteApplicationContext.");
    }

    /* renamed from: b */
    private static final boolean m22462b(rgc rgc) {
        return rgc.mo24613a(rez.m33491a());
    }

    /* renamed from: c */
    private static final boolean m22463c(rgc rgc) {
        if (!rgc.f42905a.equals("com.google.android.instantapps.supervisor")) {
            return false;
        }
        bdyx.m91615b(m22458a());
        try {
            return cdlh.f181190a.mo6606a().mo77857b();
        } catch (SecurityException e) {
            Log.w("GoogleCertificatesImpl", "Flags cannot be read", e);
            return false;
        }
    }

    /* renamed from: d */
    private static final boolean m22464d(rgc rgc) {
        if (!m22463c(rgc)) {
            return m22460a(rgc);
        }
        return false;
    }

    @Deprecated
    public vzr getGoogleCertificates() {
        return vzs.m41642a((rfl[]) m22459a(true).toArray(new rfl[0]));
    }

    @Deprecated
    public vzr getGoogleReleaseCertificates() {
        return vzs.m41642a((rfl[]) m22459a(false).toArray(new rfl[0]));
    }

    public boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery googleCertificatesQuery, vzr vzr) {
        if (googleCertificatesQuery.f30072b == null) {
            return false;
        }
        ApplicationInfo applicationInfo = null;
        rga rga = vzr != null ? new rga((PackageManager) vzs.m41641a(vzr)) : null;
        String str = googleCertificatesQuery.f30071a;
        rgc rgc = new rgc(str, googleCertificatesQuery.f30072b);
        if (m22461a(rgc, rga)) {
            return true;
        }
        if (!m22464d(rgc)) {
            return false;
        }
        if (googleCertificatesQuery.f30073c) {
            return true;
        }
        if (!googleCertificatesQuery.f30074d) {
            Context a = m22458a();
            if (rfc.m33496a(a)) {
                bdyx.m91615b(a);
                try {
                    if (cdlh.f181190a.mo6606a().mo77856a()) {
                        synchronized (rfc.f42859c) {
                            if (rfc.f42858b != null) {
                                if (!rfc.f42858b.contains(str)) {
                                }
                            }
                            PackageManager packageManager = a.getPackageManager();
                            try {
                                applicationInfo = packageManager.getApplicationInfo(str, 0);
                            } catch (PackageManager.NameNotFoundException e) {
                            }
                            String format = String.format("Application \"%s\" (%s) is an unverified version of a Google application, but is considered trusted by Google Play services because an account on your device has opted into accepting debug certificates. If you do not wish to run unverified apps, please uninstall immediately.", applicationInfo != null ? (String) packageManager.getApplicationLabel(applicationInfo) : "(could not get application name)", str);
                            NotificationManager notificationManager = (NotificationManager) a.getSystemService("notification");
                            int i = Build.VERSION.SDK_INT;
                            notificationManager.createNotificationChannel(new NotificationChannel("googlecertificates", "Security warning", 2));
                            int i2 = Build.VERSION.SDK_INT;
                            Notification.Builder smallIcon = new Notification.Builder(a, "googlecertificates").setContentText(format).setSmallIcon((int) C0126R.C0127drawable.common_ic_googleplayservices);
                            smallIcon.setStyle(new Notification.BigTextStyle().bigText(format));
                            int i3 = Build.VERSION.SDK_INT;
                            smallIcon.setLocalOnly(true);
                            int i4 = Build.VERSION.SDK_INT;
                            Notification build = smallIcon.build();
                            String valueOf = String.valueOf(str);
                            notificationManager.notify(valueOf.length() == 0 ? new String("GMS_TEST_KEYS_WARNING_NOTIFICATION_TAG") : "GMS_TEST_KEYS_WARNING_NOTIFICATION_TAG".concat(valueOf), 1, build);
                            if (rfc.f42858b == null) {
                                rfc.f42858b = new C1225nr();
                            }
                            rfc.f42858b.add(str);
                        }
                        Log.w("GoogleCertificatesImpl", String.valueOf(str).concat(" is signed with test keys"));
                        return true;
                    }
                } catch (SecurityException e2) {
                    Log.w("DebugCertificatesHelper", "Flags cannot be read", e2);
                }
            }
        }
        return false;
    }

    @Deprecated
    public boolean isGoogleReleaseSigned(String str, vzr vzr) {
        return m22461a(new rgc(str, new rfm((byte[]) vzs.m41641a(vzr))), null);
    }

    @Deprecated
    public boolean isGoogleSigned(String str, vzr vzr) {
        rgc rgc = new rgc(str, new rfm((byte[]) vzs.m41641a(vzr)));
        return m22461a(rgc, null) || m22464d(rgc);
    }

    /* renamed from: a */
    private static final Set m22459a(boolean z) {
        Log.w("GoogleCertificatesImpl", "App has 2016 GMS Core SDK; yielding incomplete certs");
        HashSet hashSet = new HashSet();
        Context a = m22458a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (PackageInfo packageInfo : a.getPackageManager().getInstalledPackages(64)) {
            String str = packageInfo.packageName;
            byte[] bArr = null;
            if (packageInfo.signatures != null && packageInfo.signatures.length == 1) {
                bArr = packageInfo.signatures[0].toByteArray();
            }
            if (bArr != null) {
                rgc rgc = new rgc(str, bArr);
                if ((z && m22460a(rgc)) || m22462b(rgc)) {
                    hashSet.add(new rfm(bArr));
                }
            }
        }
        if (Log.isLoggable("GoogleCertificatesImpl", 4)) {
            Log.i("GoogleCertificatesImpl", String.format("Scraped %d debug certs in %d ms", Integer.valueOf(hashSet.size()), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime)));
        }
        return hashSet;
    }

    /* renamed from: a */
    private static final boolean m22460a(rgc rgc) {
        rfa rfa = rez.f42853a;
        if (rgc.f42908d == null) {
            rgc.f42908d = rgc.m33572a(rgc.f42907c, "*");
        }
        if (!rfa.mo24571a(rgc.f42908d)) {
            return rgc.mo24613a(rez.m33492b());
        }
        return true;
    }

    /* renamed from: a */
    static final boolean m22461a(rgc rgc, rga rga) {
        rfm rfm;
        if (m22463c(rgc)) {
            return false;
        }
        if (m22462b(rgc)) {
            return true;
        }
        String str = rgc.f42905a;
        rfl rfl = rgc.f42906b;
        if (rga == null || !rga.f42900b || !rga.f42899a.contains(str)) {
            return false;
        }
        try {
            PackageInfo packageInfo = rga.f42901c.getPackageInfo("android", 64);
            if (packageInfo.signatures.length == 1) {
                rfm = new rfm(packageInfo.signatures[0].toByteArray());
                if (rfm == null && rfm.equals(rfl)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("PlatCertificateHelper", "Unexpected exception looking up android", e);
        }
        Log.w("PlatCertificateHelper", "Could not determine the platform key");
        rfm = null;
        return rfm == null ? false : false;
    }
}
