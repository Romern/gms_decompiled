package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: iti */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iti {

    /* renamed from: e */
    private static final sek f21684e = new sek(new String[]{"ClientAppMetadataHelper"}, (byte[]) null);

    /* renamed from: a */
    private final Context f21685a;

    /* renamed from: b */
    private final itk f21686b;

    /* renamed from: c */
    private final itm f21687c;

    /* renamed from: d */
    private final vvp f21688d;

    public iti(Context context, itk itk, itm itm, vvp vvp) {
        this.f21685a = context;
        this.f21686b = itk;
        this.f21687c = itm;
        this.f21688d = vvp;
    }

    /* JADX WARNING: Removed duplicated region for block: B:156:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0269  */
    /* renamed from: a */
    public final bsnl mo13336a(List list) {
        String str;
        boolean z;
        boolean z2;
        String a;
        itl a2 = this.f21687c.mo13339a();
        addi a3 = addi.m50206a(this.f21685a);
        try {
            String a4 = a3.mo33343a((String) ipl.f21497g.mo58455c(), "GCM");
            String b = a3.mo33346b();
            bxvd da = bsnl.f146266C.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsnl bsnl = (bsnl) da.f164949b;
            b.getClass();
            bsnl.f146271b = b;
            a4.getClass();
            bsnl.f146272c = a4;
            long longValue = mo13337a().longValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bsnl) da.f164949b).f146273d = longValue;
            if (!((Boolean) ipl.f21508r.mo58455c()).booleanValue()) {
                str = Locale.getDefault().toString();
            } else {
                int i = Build.VERSION.SDK_INT;
                str = Locale.getDefault().toLanguageTag();
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((bsnl) da.f164949b).f146274e = str;
            String str2 = Build.DISPLAY;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str2.getClass();
            ((bsnl) da.f164949b).f146275f = str2;
            long j = (long) Build.VERSION.SDK_INT;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bsnl) da.f164949b).f146276g = j;
            String str3 = Build.VERSION.RELEASE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str3.getClass();
            ((bsnl) da.f164949b).f146277h = str3;
            String str4 = Build.VERSION.CODENAME;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str4.getClass();
            ((bsnl) da.f164949b).f146278i = str4;
            Display defaultDisplay = ((WindowManager) this.f21685a.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i2 = Build.VERSION.SDK_INT;
            defaultDisplay.getRealMetrics(displayMetrics);
            float f = (((float) displayMetrics.heightPixels) * 1000.0f) / displayMetrics.ydpi;
            float f2 = (((float) displayMetrics.widthPixels) * 1000.0f) / displayMetrics.xdpi;
            int sqrt = (int) Math.sqrt((double) ((f * f) + (f2 * f2)));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bsnl) da.f164949b).f146279j = sqrt;
            String str5 = Build.MODEL;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str5.getClass();
            ((bsnl) da.f164949b).f146280k = str5;
            String str6 = Build.MANUFACTURER;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsnl bsnl2 = (bsnl) da.f164949b;
            str6.getClass();
            bsnl2.f146281l = str6;
            boolean z3 = true;
            bsnl2.f146282m = 1;
            itk itk = this.f21686b;
            int i3 = Build.VERSION.SDK_INT;
            boolean isDeviceSecure = itk.f21689a.isDeviceSecure();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bsnl bsnl3 = (bsnl) da.f164949b;
            bsnl3.f146283n = isDeviceSecure;
            bsnl3.f146284o = a2.f21690a;
            bsnl3.f146285p = a2.f21691b;
            int i4 = Build.VERSION.SDK_INT;
            boolean z4 = rrs.m34317a() != null;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bsnl) da.f164949b).f146286q = z4;
            int i5 = Build.VERSION.SDK_INT;
            rrs a5 = rrs.m34317a();
            if (a5 != null) {
                z = a5.mo25052b();
            } else {
                z = false;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bsnl) da.f164949b).f146287r = z;
            int i6 = Build.VERSION.SDK_INT;
            boolean hasSystemFeature = this.f21685a.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bsnl) da.f164949b).f146288s = hasSystemFeature;
            boolean z5 = ((ConnectivityManager) this.f21685a.getSystemService("connectivity")).getNetworkInfo(0) != null;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bsnl) da.f164949b).f146289t = z5;
            Context context = this.f21685a;
            int i7 = Build.VERSION.SDK_INT;
            if (!"7.1".equals(Build.VERSION.RELEASE)) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (((Boolean) ipl.f21507q.mo58455c()).booleanValue()) {
                    z2 = connectivityManager.isTetheringSupported();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((bsnl) da.f164949b).f146290u = z2;
                    boolean f3 = sre.m36086f(this.f21685a);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((bsnl) da.f164949b).f146292w = f3;
                    boolean hasSystemFeature2 = this.f21685a.getPackageManager().hasSystemFeature("org.chromium.arc");
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((bsnl) da.f164949b).f146293x = hasSystemFeature2;
                    bxvd da2 = bsnk.f146259f.mo74144da();
                    a = aaks.m21407a(this.f21685a);
                    if (a == null) {
                        bxtx a6 = bxtx.m123258a(a);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bsnk bsnk = (bsnk) da2.f164949b;
                        a6.getClass();
                        bsnk.f146261a = a6;
                        "20.15.15 (120300-{{cl}})".getClass();
                        bsnk.f146263c = "20.15.15 (120300-{{cl}})";
                        bsnk.f146264d = 201515033;
                        String packageName = this.f21685a.getPackageName();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        packageName.getClass();
                        ((bsnk) da2.f164949b).f146265e = packageName;
                        Boolean b2 = mo13338b();
                        if (b2 != null) {
                            boolean booleanValue = b2.booleanValue();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((bsnk) da2.f164949b).f146262b = booleanValue;
                        }
                        bsnk bsnk2 = (bsnk) da2.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bsnl bsnl4 = (bsnl) da.f164949b;
                        bsnk2.getClass();
                        if (!bsnl4.f146270a.mo73666a()) {
                            bsnl4.f146270a = bxvk.m124021a(bsnl4.f146270a);
                        }
                        bsnl4.f146270a.add(bsnk2);
                        boolean c = m16098c();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((bsnl) da.f164949b).f146294y = c;
                        boolean c2 = m16098c();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((bsnl) da.f164949b).f146268A = c2;
                        if (ccfg.f178858a.mo6606a().mo75849a()) {
                            int i8 = Build.VERSION.SDK_INT;
                            BiometricManager biometricManager = (BiometricManager) this.f21685a.getSystemService(BiometricManager.class);
                            if (biometricManager == null || biometricManager.canAuthenticate() != 0) {
                                int i9 = Build.VERSION.SDK_INT;
                                FingerprintManager fingerprintManager = (FingerprintManager) this.f21685a.getSystemService(FingerprintManager.class);
                                if (fingerprintManager == null || !fingerprintManager.isHardwareDetected()) {
                                    z3 = false;
                                } else if (!fingerprintManager.hasEnrolledFingerprints()) {
                                    z3 = false;
                                }
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            ((bsnl) da.f164949b).f146295z = z3;
                        }
                        if (ccfg.f178858a.mo6606a().mo75851c()) {
                            bnzc d = bnzi.m110902d();
                            HashMap hashMap = new HashMap();
                            hashMap.put("instanceId", d.mo68722a(b.getBytes()).toString());
                            hashMap.put("deviceId", d.mo68719a(mo13337a().longValue()).toString());
                            String a7 = this.f21688d.mo28903a("cryptauth_synckeys_request", hashMap, (DroidGuardResultsRequest) null);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            a7.getClass();
                            ((bsnl) da.f164949b).f146269B = a7;
                        }
                        if (list != null && !list.isEmpty()) {
                            int size = list.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                byte[] bArr = (byte[]) list.get(i10);
                                if (bArr != null && bArr.length > 0) {
                                    try {
                                        bsnn bsnn = (bsnn) bxvk.m124014a(bsnn.f146304c, bArr);
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bsnl bsnl5 = (bsnl) da.f164949b;
                                        bsnn.getClass();
                                        if (!bsnl5.f146291v.mo73666a()) {
                                            bsnl5.f146291v = bxvk.m124021a(bsnl5.f146291v);
                                        }
                                        bsnl5.f146291v.add(bsnn);
                                    } catch (bxwf e) {
                                        f21684e.mo25417e("Fail to parse featureMetadata", e, new Object[0]);
                                    }
                                } else {
                                    f21684e.mo25412b("Null/empty featureMetadata", new Object[0]);
                                }
                            }
                        }
                        return (bsnl) da.mo74062i();
                    }
                    Intent intent = new Intent();
                    intent.setClassName(this.f21685a, "com.google.android.gms.gcm.gmsproc.GmsAutoStarter");
                    this.f21685a.sendBroadcast(intent);
                    throw new iqr("Failed to get GCM registeration id");
                }
            }
            z2 = false;
            if (da.f164950c) {
            }
            ((bsnl) da.f164949b).f146290u = z2;
            boolean f32 = sre.m36086f(this.f21685a);
            if (da.f164950c) {
            }
            ((bsnl) da.f164949b).f146292w = f32;
            boolean hasSystemFeature22 = this.f21685a.getPackageManager().hasSystemFeature("org.chromium.arc");
            if (da.f164950c) {
            }
            ((bsnl) da.f164949b).f146293x = hasSystemFeature22;
            bxvd da22 = bsnk.f146259f.mo74144da();
            a = aaks.m21407a(this.f21685a);
            if (a == null) {
            }
        } catch (IOException e2) {
            throw new iqr("Can't read instanceId", e2);
        }
    }

    /* renamed from: c */
    private final boolean m16098c() {
        int i = Build.VERSION.SDK_INT;
        return this.f21685a.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Boolean mo13338b() {
        int i = Build.VERSION.SDK_INT;
        AppOpsManager appOpsManager = (AppOpsManager) this.f21685a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f21685a.getApplicationInfo();
        String packageName = this.f21685a.getApplicationContext().getPackageName();
        int i2 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            boolean z = true;
            if (((Integer) cls.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i2), packageName)).intValue() != 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException e) {
            f21684e.mo25415d("Exception while finding whether notifications are enabled for GmsCore", e, new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Long mo13337a() {
        return Long.valueOf(spn.m35843a(this.f21685a));
    }
}
