package com.google.android.gms.ads.identifier.settings;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.ads.identifier.settings.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0287e {

    /* renamed from: c */
    private static C0287e f8019c = null;

    /* renamed from: g */
    private static final AtomicLong f8020g = new AtomicLong(-1);

    /* renamed from: a */
    public final Object f8021a = new Object();

    /* renamed from: b */
    public final C0307y f8022b = new C0307y();

    /* renamed from: d */
    private final Context f8023d;

    /* renamed from: e */
    private final C0305w f8024e;

    /* renamed from: f */
    private final C0303u f8025f;

    private C0287e(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f8023d = applicationContext != null ? applicationContext : context;
        this.f8024e = new C0305w(this.f8023d);
        this.f8025f = new C0303u(this.f8023d);
    }

    /* renamed from: a */
    public static synchronized C0287e m5194a(Context context) {
        C0287e eVar;
        synchronized (C0287e.class) {
            if (f8019c == null) {
                f8019c = new C0287e(context);
            }
            eVar = f8019c;
        }
        return eVar;
    }

    /* renamed from: a */
    public static boolean m5196a(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    /* renamed from: j */
    private final void m5197j() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(this.f8023d, "com.google.android.gms.ads.identifier.service.AdvertisingIdNotificationService"));
        long currentTimeMillis = System.currentTimeMillis();
        long andSet = f8020g.getAndSet(currentTimeMillis);
        long j = -1;
        if (andSet != -1) {
            j = currentTimeMillis - andSet;
        }
        intent.putExtra("time_since_last_update", j);
        this.f8023d.startService(intent);
    }

    /* renamed from: b */
    public final String mo6511b() {
        String a;
        synchronized (this.f8021a) {
            boolean f = mo6515f();
            String e = !f ? "" : mo6514e();
            this.f8024e.mo6530b();
            String str = null;
            if (cbvp.m128520g() && cbvp.f178349a.mo6606a().mo75447s()) {
                try {
                    String uuid = C0305w.m5234b(this.f8024e.mo6531c()).toString();
                    if (!TextUtils.isEmpty(uuid)) {
                        str = uuid;
                    } else {
                        throw new IOException("Generated Id is null");
                    }
                } catch (IOException | GeneralSecurityException e2) {
                    C0288f.m5215a(this.f8023d, "generateNewIdError", e2);
                }
            }
            boolean z = !TextUtils.isEmpty(str);
            if (!z) {
                str = UUID.randomUUID().toString();
            }
            if (z) {
                C0301s.m5225a(this.f8023d).mo6523b();
                C0301s.m5225a(this.f8023d).mo6522a();
            }
            mo6505a().edit().putInt("adid_reset_count", mo6505a().getInt("adid_reset_count", 0) + 1).apply();
            a = mo6508a(f, z, str, e);
        }
        return a;
    }

    /* renamed from: c */
    public final String mo6512c() {
        String h = !mo6515f() ? mo6517h() : mo6516g();
        return h.isEmpty() ? mo6511b() : h;
    }

    /* renamed from: d */
    public final boolean mo6513d() {
        return mo6505a().getBoolean("using_cert", false);
    }

    /* renamed from: e */
    public final String mo6514e() {
        String uuid = UUID.randomUUID().toString();
        return String.valueOf(uuid.substring(0, uuid.length() - 12)).concat("10ca1ad1abe1");
    }

    /* renamed from: g */
    public final String mo6516g() {
        return mo6505a().getString("fake_adid_key", "");
    }

    /* renamed from: h */
    public final String mo6517h() {
        return mo6505a().getString("adid_key", "");
    }

    /* renamed from: i */
    public final boolean mo6518i() {
        boolean z;
        synchronized (this.f8021a) {
            if (!mo6505a().contains("enable_limit_ad_tracking")) {
                mo6509a(false);
            }
            z = mo6505a().getBoolean("enable_limit_ad_tracking", false);
        }
        return z;
    }

    /* renamed from: a */
    private final boolean m5195a(UUID uuid, byte[] bArr) {
        try {
            return uuid.equals(C0305w.m5234b(bArr));
        } catch (IOException | IllegalArgumentException | NullPointerException | GeneralSecurityException e) {
            C0288f.m5215a(this.f8023d, "adidMatchPublicKey", e);
            return false;
        }
    }

    /* renamed from: f */
    public final boolean mo6515f() {
        int i = Build.VERSION.SDK_INT;
        if (cbsv.m128325b()) {
            try {
                if (Settings.Global.getInt(this.f8023d.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    return mo6505a().getBoolean("enable_debug_logging", false);
                }
            } catch (Exception e) {
                Log.w("AdvertisingIdSettings", "Fail to determine debug setting.", e);
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SharedPreferences mo6505a() {
        return this.f8023d.getSharedPreferences("adid_settings", 4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011f  */
    /* renamed from: a */
    public final bxvd mo6506a(String str) {
        String str2;
        Signature[] signatureArr;
        int i;
        int i2;
        String str3;
        bxvd da = bqkp.f141022g.mo74144da();
        if (!TextUtils.isEmpty(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqkp bqkp = (bqkp) da.f164949b;
            str.getClass();
            bqkp.f141024a |= 2;
            bqkp.f141026c = str;
            PackageManager packageManager = this.f8023d.getPackageManager();
            try {
                str2 = packageManager.getInstallerPackageName(str);
            } catch (RuntimeException e) {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                C0288f.m5217b(this.f8023d, "getCommonPayloadBuilder", "empty installerPackageName");
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bqkp bqkp2 = (bqkp) da.f164949b;
                str2.getClass();
                bqkp2.f141024a |= 4;
                bqkp2.f141028e = str2;
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
                if (cbvp.f178349a.mo6606a().mo75437i()) {
                    C0306x xVar = new C0306x("apkHash", this.f8023d, "pending");
                    try {
                        byte[] a = C0289g.m5219a(packageInfo, str);
                        if (a != null) {
                            int length = a.length;
                            StringBuilder sb = new StringBuilder(24);
                            sb.append("result ");
                            sb.append(length);
                            sb.append(" bytes");
                            xVar.f8055d = sb.toString();
                        }
                        xVar.close();
                        if (a == null || a.length != 32) {
                            Context context = this.f8023d;
                            if (a != null) {
                                int length2 = a.length;
                                StringBuilder sb2 = new StringBuilder(33);
                                sb2.append("unexpected hash size: ");
                                sb2.append(length2);
                                str3 = sb2.toString();
                            } else {
                                str3 = "Null result";
                            }
                            C0288f.m5213a(context, "apkHash", str3);
                        } else {
                            bxtx a2 = bxtx.m123261a(a);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bqkp bqkp3 = (bqkp) da.f164949b;
                            a2.getClass();
                            bqkp3.f141024a |= 8;
                            bqkp3.f141029f = a2;
                        }
                    } catch (Throwable th) {
                        bqye.m113761a(th, th);
                    }
                }
                if (cbvp.f178349a.mo6606a().mo75441m()) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (packageInfo.signingInfo != null) {
                        SigningInfo signingInfo = packageInfo.signingInfo;
                        signatureArr = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                        if (signatureArr == null) {
                            i = Math.min(5, signatureArr.length);
                        } else {
                            i = 0;
                        }
                        for (i2 = 0; i2 < i; i2++) {
                            Signature signature = signatureArr[i2];
                            if (signature != null) {
                                byte[] byteArray = signature.toByteArray();
                                if (!m5196a(byteArray)) {
                                    byte[] a3 = C0288f.m5216a(byteArray);
                                    if (!m5196a(a3)) {
                                        bxtx a4 = bxtx.m123261a(a3);
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bqkp bqkp4 = (bqkp) da.f164949b;
                                        a4.getClass();
                                        if (!bqkp4.f141027d.mo73666a()) {
                                            bqkp4.f141027d = bxvk.m124021a(bqkp4.f141027d);
                                        }
                                        bqkp4.f141027d.add(a4);
                                    }
                                }
                            }
                        }
                        return da;
                    }
                }
                signatureArr = packageInfo.signatures;
                if (signatureArr == null) {
                }
                while (i2 < i) {
                }
                return da;
            } catch (PackageManager.NameNotFoundException e2) {
                C0288f.m5215a(this.f8023d, "getPackageInfoError", e2);
                return da;
            }
        } else {
            C0288f.m5213a(this.f8023d, "getCommonPayloadBuilder", "empty packageName");
            return da;
        }
        throw th;
    }

    /* renamed from: a */
    public final String mo6507a(String str, int i) {
        return i != Process.myUid() ? this.f8023d.getPackageManager().getNameForUid(i) : str;
    }

    /* renamed from: a */
    public final String mo6508a(boolean z, boolean z2, String str, String str2) {
        if (z) {
            sdo.m34974b(!str2.isEmpty());
        } else {
            sdo.m34974b(str2.isEmpty());
        }
        mo6505a().edit().putBoolean("enable_debug_logging", z).putBoolean("using_cert", z2).putString("adid_key", str).putString("fake_adid_key", str2).apply();
        m5197j();
        return z ? str2 : str;
    }

    /* renamed from: a */
    public final void mo6509a(boolean z) {
        synchronized (this.f8021a) {
            mo6505a().edit().putBoolean("enable_limit_ad_tracking", z).apply();
            m5197j();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037 A[Catch:{ IllegalArgumentException -> 0x00f5, NullPointerException -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0115 A[Catch:{ IllegalArgumentException -> 0x00f5, NullPointerException -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0116 A[Catch:{ IllegalArgumentException -> 0x00f5, NullPointerException -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0138 A[Catch:{ IllegalArgumentException -> 0x00f5, NullPointerException -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0139 A[Catch:{ IllegalArgumentException -> 0x00f5, NullPointerException -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015f A[Catch:{ IllegalArgumentException -> 0x00f5, NullPointerException -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0170 A[Catch:{ IllegalArgumentException -> 0x00f5, NullPointerException -> 0x00f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x017e A[SYNTHETIC, Splitter:B:73:0x017e] */
    /* renamed from: a */
    public final byte[] mo6510a(String str, String str2, C0286d dVar) {
        byte[] c;
        bxvd da;
        bqnk a;
        if (!C0303u.m5230b(str) || !cbvp.m128520g()) {
            return null;
        }
        C0306x xVar = new C0306x(str2, this.f8023d, "pending");
        try {
            synchronized (this.f8021a) {
                if (mo6513d()) {
                    c = this.f8024e.mo6531c();
                    if (m5196a(c)) {
                        bxvd da2 = bqkt.f141038i.mo74144da();
                        long currentTimeMillis = System.currentTimeMillis();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bqkt bqkt = (bqkt) da2.f164949b;
                        int i = bqkt.f141040a | 4;
                        bqkt.f141040a = i;
                        bqkt.f141045f = currentTimeMillis;
                        str.getClass();
                        bqkt.f141040a = i | 512;
                        bqkt.f141047h = str;
                        dVar.mo6504a(da2);
                        bqkw a2 = this.f8024e.mo6528a();
                        if (a2 != null) {
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bqkt bqkt2 = (bqkt) da2.f164949b;
                            a2.getClass();
                            bqkt2.f141046g = a2;
                            bqkt2.f141040a |= 128;
                        } else {
                            bxtx a3 = bxtx.m123261a(c);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bqkt bqkt3 = (bqkt) da2.f164949b;
                            a3.getClass();
                            bqkt3.f141040a |= 1;
                            bqkt3.f141043d = a3;
                        }
                        if (cbvp.m128518e()) {
                            try {
                                UUID fromString = UUID.fromString(mo6512c());
                                if (fromString != null) {
                                    if (!m5195a(fromString, c)) {
                                        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
                                        wrap.putLong(fromString.getMostSignificantBits());
                                        wrap.putLong(fromString.getLeastSignificantBits());
                                        bxtx a4 = bxtx.m123261a(wrap.array());
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bqkt bqkt4 = (bqkt) da2.f164949b;
                                        a4.getClass();
                                        bqkt4.f141040a |= 2;
                                        bqkt4.f141044e = a4;
                                    }
                                }
                            } catch (IllegalArgumentException e) {
                                e = e;
                                C0288f.m5215a(this.f8023d, "adidMatchPublicKey", e);
                                byte[] k = ((bqkt) da2.mo74062i()).mo73642k();
                                da = bqkw.f141054d.mo74144da();
                                bxtx a5 = bxtx.m123261a(k);
                                if (da.f164950c) {
                                }
                                bqkw bqkw = (bqkw) da.f164949b;
                                a5.getClass();
                                bqkw.f141056a |= 1;
                                bqkw.f141057b = a5;
                                bxtx a6 = bxtx.m123261a(this.f8024e.mo6532c(k));
                                if (da.f164950c) {
                                }
                                bqkw bqkw2 = (bqkw) da.f164949b;
                                a6.getClass();
                                bqkw2.f141056a |= 2;
                                bqkw2.f141058c = a6;
                                byte[] k2 = ((bqkw) da.mo74062i()).mo73642k();
                                a = this.f8025f.mo6526a(str);
                                if (a != null) {
                                }
                                xVar.f8055d = "succeeded";
                                xVar.close();
                                return k2;
                            } catch (NullPointerException e2) {
                                e = e2;
                                C0288f.m5215a(this.f8023d, "adidMatchPublicKey", e);
                                byte[] k3 = ((bqkt) da2.mo74062i()).mo73642k();
                                da = bqkw.f141054d.mo74144da();
                                bxtx a52 = bxtx.m123261a(k3);
                                if (da.f164950c) {
                                }
                                bqkw bqkw3 = (bqkw) da.f164949b;
                                a52.getClass();
                                bqkw3.f141056a |= 1;
                                bqkw3.f141057b = a52;
                                bxtx a62 = bxtx.m123261a(this.f8024e.mo6532c(k3));
                                if (da.f164950c) {
                                }
                                bqkw bqkw22 = (bqkw) da.f164949b;
                                a62.getClass();
                                bqkw22.f141056a |= 2;
                                bqkw22.f141058c = a62;
                                byte[] k22 = ((bqkw) da.mo74062i()).mo73642k();
                                a = this.f8025f.mo6526a(str);
                                if (a != null) {
                                }
                                xVar.f8055d = "succeeded";
                                xVar.close();
                                return k22;
                            }
                        }
                        byte[] k32 = ((bqkt) da2.mo74062i()).mo73642k();
                        da = bqkw.f141054d.mo74144da();
                        bxtx a522 = bxtx.m123261a(k32);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bqkw bqkw32 = (bqkw) da.f164949b;
                        a522.getClass();
                        bqkw32.f141056a |= 1;
                        bqkw32.f141057b = a522;
                        bxtx a622 = bxtx.m123261a(this.f8024e.mo6532c(k32));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bqkw bqkw222 = (bqkw) da.f164949b;
                        a622.getClass();
                        bqkw222.f141056a |= 2;
                        bqkw222.f141058c = a622;
                        byte[] k222 = ((bqkw) da.mo74062i()).mo73642k();
                        a = this.f8025f.mo6526a(str);
                        if (a != null) {
                            k222 = a.mo69285a(k222, null);
                        } else if (!"doubleclick.net".equals(str)) {
                            throw new IOException("Can not find key");
                        }
                        xVar.f8055d = "succeeded";
                        xVar.close();
                        return k222;
                    }
                } else {
                    if (!cbvp.m128518e()) {
                    }
                    c = this.f8024e.mo6531c();
                    if (m5196a(c)) {
                    }
                }
                xVar.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                xVar.close();
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
            throw th;
        }
    }
}
