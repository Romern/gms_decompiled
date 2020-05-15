package com.google.android.gms.ads.internal.request.service;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.gms.ads.internal.request.service.l */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0562l {

    /* renamed from: A */
    private int f8792A;

    /* renamed from: B */
    private String f8793B;

    /* renamed from: C */
    private boolean f8794C;

    /* renamed from: a */
    private int f8795a;

    /* renamed from: b */
    private boolean f8796b;

    /* renamed from: c */
    private boolean f8797c;

    /* renamed from: d */
    private int f8798d;

    /* renamed from: e */
    private int f8799e;

    /* renamed from: f */
    private int f8800f;

    /* renamed from: g */
    private String f8801g;

    /* renamed from: h */
    private int f8802h;

    /* renamed from: i */
    private int f8803i;

    /* renamed from: j */
    private int f8804j;

    /* renamed from: k */
    private boolean f8805k;

    /* renamed from: l */
    private int f8806l;

    /* renamed from: m */
    private double f8807m;

    /* renamed from: n */
    private boolean f8808n;

    /* renamed from: o */
    private String f8809o;

    /* renamed from: p */
    private String f8810p;

    /* renamed from: q */
    private boolean f8811q;

    /* renamed from: r */
    private boolean f8812r;

    /* renamed from: s */
    private String f8813s;

    /* renamed from: t */
    private boolean f8814t;

    /* renamed from: u */
    private final boolean f8815u;

    /* renamed from: v */
    private boolean f8816v;

    /* renamed from: w */
    private String f8817w;

    /* renamed from: x */
    private String f8818x;

    /* renamed from: y */
    private float f8819y;

    /* renamed from: z */
    private int f8820z;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a2 A[Catch:{ Exception -> 0x00c3 }] */
    public C0562l(Context context) {
        String str;
        Resources resources;
        DisplayMetrics displayMetrics;
        PackageInfo b;
        ActivityInfo activityInfo;
        PackageManager packageManager = context.getPackageManager();
        m5564a(context);
        m5565b(context);
        m5566c(context);
        Locale locale = Locale.getDefault();
        boolean z = true;
        this.f8811q = m5563a(packageManager, "geo:0,0?q=donuts") != null;
        this.f8812r = m5563a(packageManager, "http://www.google.com") == null ? false : z;
        this.f8813s = locale.getCountry();
        C0341h.m5274a();
        this.f8814t = Build.DEVICE.startsWith("generic");
        this.f8815u = sre.m36082b(context);
        this.f8816v = sre.m36080a(context);
        this.f8817w = locale.getLanguage();
        ResolveInfo a = m5563a(packageManager, "market://details?id=com.google.android.gms.ads");
        String str2 = null;
        if (!(a == null || (activityInfo = a.activityInfo) == null)) {
            try {
                PackageInfo b2 = svr.m36484b(context).mo26176b(activityInfo.packageName, 0);
                if (b2 != null) {
                    int i = b2.versionCode;
                    String str3 = activityInfo.packageName;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 12);
                    sb.append(i);
                    sb.append(".");
                    sb.append(str3);
                    str = sb.toString();
                    this.f8818x = str;
                    b = svr.m36484b(context).mo26176b("com.android.vending", 128);
                    if (b != null) {
                        int i2 = b.versionCode;
                        String str4 = b.packageName;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 12);
                        sb2.append(i2);
                        sb2.append(".");
                        sb2.append(str4);
                        str2 = sb2.toString();
                    }
                    this.f8793B = str2;
                    resources = context.getResources();
                    if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                        this.f8819y = displayMetrics.density;
                        this.f8820z = displayMetrics.widthPixels;
                        this.f8792A = displayMetrics.heightPixels;
                        return;
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        str = null;
        this.f8818x = str;
        try {
            b = svr.m36484b(context).mo26176b("com.android.vending", 128);
            if (b != null) {
            }
        } catch (Exception e2) {
        }
        this.f8793B = str2;
        resources = context.getResources();
        if (resources != null) {
        }
    }

    /* renamed from: a */
    private static ResolveInfo m5563a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        } catch (Throwable th) {
            C0387d.m5366d().mo6783a(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: b */
    private final void m5565b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f8801g = telephonyManager.getNetworkOperator();
        this.f8803i = telephonyManager.getNetworkType();
        this.f8804j = telephonyManager.getPhoneType();
        this.f8802h = -2;
        this.f8805k = false;
        this.f8806l = -1;
        if (C0387d.m5363a().mo6856a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f8802h = activeNetworkInfo.getType();
                this.f8806l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f8802h = -1;
            }
            int i = Build.VERSION.SDK_INT;
            this.f8805k = connectivityManager.isActiveNetworkMetered();
        }
    }

    /* renamed from: c */
    private final void m5566c(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f8807m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            this.f8807m = -1.0d;
        }
        this.f8808n = z;
    }

    /* renamed from: a */
    private final void m5564a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f8795a = audioManager.getMode();
                this.f8796b = audioManager.isMusicActive();
                this.f8797c = audioManager.isSpeakerphoneOn();
                this.f8798d = audioManager.getStreamVolume(3);
                this.f8799e = audioManager.getRingerMode();
                this.f8800f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                C0387d.m5366d().mo6783a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f8795a = -2;
        this.f8796b = false;
        this.f8797c = false;
        this.f8798d = 0;
        this.f8799e = 2;
        this.f8800f = 0;
    }

    /* renamed from: a */
    public final C0563m mo6745a() {
        return new C0563m(this.f8795a, this.f8811q, this.f8812r, this.f8801g, this.f8813s, this.f8814t, this.f8815u, this.f8816v, this.f8796b, this.f8797c, this.f8817w, this.f8818x, this.f8793B, this.f8798d, this.f8802h, this.f8803i, this.f8804j, this.f8799e, this.f8800f, this.f8819y, this.f8820z, this.f8792A, this.f8807m, this.f8808n, this.f8805k, this.f8806l, this.f8809o, this.f8794C, this.f8810p);
    }

    public C0562l(Context context, C0563m mVar) {
        m5564a(context);
        m5565b(context);
        m5566c(context);
        this.f8809o = Build.FINGERPRINT;
        this.f8810p = Build.DEVICE;
        int i = Build.VERSION.SDK_INT;
        PackageManager packageManager = context.getPackageManager();
        boolean z = false;
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= queryIntentActivities.size()) {
                        break;
                    } else if (!resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                        i2++;
                    } else if (resolveActivity.activityInfo.packageName.equals(ciqv.m150907a(context))) {
                        z = true;
                    }
                }
            }
        }
        this.f8794C = z;
        this.f8811q = mVar.f8825b;
        this.f8812r = mVar.f8826c;
        this.f8813s = mVar.f8828e;
        this.f8814t = mVar.f8829f;
        this.f8815u = mVar.f8830g;
        this.f8816v = mVar.f8831h;
        this.f8817w = mVar.f8834k;
        this.f8818x = mVar.f8835l;
        this.f8793B = mVar.f8836m;
        this.f8819y = mVar.f8843t;
        this.f8820z = mVar.f8844u;
        this.f8792A = mVar.f8845v;
    }
}
