package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.nfc.NfcAdapter;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.android.volley.toolbox.ImageLoader;
import com.google.android.cast.JGCastService;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.gms.ocr.RecognitionScreen;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: bjvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjvn {

    /* renamed from: a */
    public static Boolean f123388a;

    /* renamed from: b */
    public static long f123389b;

    /* renamed from: c */
    private static final bjyy f123390c = new bjvm();

    /* renamed from: d */
    private static ImageLoader f123391d;

    /* renamed from: e */
    private static bkib f123392e;

    /* renamed from: f */
    private static bkhv f123393f;

    /* renamed from: g */
    private static Boolean f123394g;

    /* renamed from: a */
    public static synchronized bkhv m104709a() {
        bkhv bkhv;
        synchronized (bjvn.class) {
            if (f123393f == null) {
                f123393f = new bkhv();
            }
            bkhv = f123393f;
        }
        return bkhv;
    }

    /* renamed from: a */
    public static synchronized void m104716a(bkhv bkhv) {
        synchronized (bjvn.class) {
            f123393f = bkhv;
        }
    }

    /* renamed from: b */
    public static int m104720b(String str) {
        return Integer.parseInt(str.substring(9));
    }

    /* renamed from: c */
    public static synchronized bkib m104722c(Context context) {
        bkib bkib;
        synchronized (bjvn.class) {
            if (f123392e == null) {
                f123392e = new bkib(bjtx.m104623c(context), new C1231nx(1));
            }
            bkib = f123392e;
        }
        return bkib;
    }

    /* renamed from: d */
    public static boolean m104723d(Context context) {
        if (f123394g == null && context != null) {
            int i = Build.VERSION.SDK_INT;
            f123394g = Boolean.valueOf(((ActivityManager) context.getSystemService("activity")).isLowRamDevice());
        }
        return bjzb.m104957a(f123394g, Boolean.TRUE);
    }

    /* renamed from: a */
    public static bmaj m104710a(Context context, String str) {
        boolean z;
        if (rfi.f42868a.mo24590b(context) == 0) {
            z = true;
        } else {
            z = false;
        }
        return m104711a(context.getApplicationContext(), null, z, 201515000, str, false, false, null, null, true, f123390c, null, null, null, 0);
    }

    /* renamed from: b */
    public static ImageLoader m104721b(Context context) {
        return m104713a(context, ((Integer) bjwd.f123463c.mo54082a()).intValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:202:0x049b, code lost:
        if ((r6 - r15.f123400a) <= ((long) ((java.lang.Integer) p000.bjwe.f123497r.mo54082a()).intValue())) goto L_0x04b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0506, code lost:
        if ((r6 - p000.bjvu.f123425t) <= ((long) ((java.lang.Integer) p000.bjwe.f123499t.mo54082a()).intValue())) goto L_0x0508;
     */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04bd A[SYNTHETIC, Splitter:B:214:0x04bd] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04e3 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x07e9 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x07ea A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0808 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0815 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0816 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x0833 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x085f A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0860 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x087e A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:392:0x0887 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0888 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x08aa A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x08ab A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:400:0x08cc A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x08cd A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x08e5 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x08e6 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x091b A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x09ad A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x09bf A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x09d5 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x09da A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:455:0x09db A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x09ed A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x09ee A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x09ff A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x0a00 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:467:0x0a1f A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0a4d A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:479:0x0a4e A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0a60 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0a6f A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }, LOOP:4: B:484:0x0a6d->B:485:0x0a6f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:488:0x0a83 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x0a84 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:492:0x0aa7 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:493:0x0aa8 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x0aaf A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x0ab0 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x0ade A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:512:0x0ae7 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* JADX WARNING: Removed duplicated region for block: B:513:0x0ae8 A[Catch:{ IllegalStateException -> 0x0775, NullPointerException -> 0x0773, IllegalArgumentException -> 0x0771, all -> 0x0b15 }] */
    /* renamed from: a */
    public static bmaj m104711a(Context context, byte[] bArr, boolean z, int i, String str, boolean z2, boolean z3, List list, int[] iArr, boolean z4, bjyy bjyy, bjyg bjyg, List list2, xnn xnn, long j) {
        long j2;
        int i2;
        int i3;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        long j3;
        ConnectivityManager connectivityManager;
        long j4;
        boolean z5;
        bxvd da;
        byte[] bArr2;
        int i4;
        Account[] accountArr;
        bjyg bjyg2;
        blxa blxa;
        int size;
        int i5;
        bxvd da2;
        List list3;
        int i6;
        bxvd da3;
        int[] iArr2;
        ArrayList arrayList;
        bwdj bwdj;
        NetworkInfo activeNetworkInfo;
        Context context2;
        int i7;
        List list4;
        bjvs bjvs;
        bjvs bjvs2;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            bjvu bjvu = new bjvu(context);
            bjvu.f123431b = bArr;
            bjvu.f123445u = 1;
            bjvu.f123432c = z;
            bjvu.f123446v = 3;
            bjvu.f123433d = i;
            bjvu.f123434e = str;
            bjvu.f123435f = z2;
            bjvu.f123436g = z3;
            bjvu.f123437h = bjyu.m104932c(list);
            bjvu.f123438i = iArr;
            bjvu.f123439j = z4;
            bjvu.f123440k = bjyy;
            bjvu.f123441l = bjyg;
            bjvu.f123442m = list2;
            bjvu.f123443n = xnn;
            bjvu.f123444o = j;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long uptimeMillis = SystemClock.uptimeMillis();
            blwr blwr = (blwr) blxa.f127989R.mo74144da();
            int i8 = bjvu.f123445u;
            if (blwr.f164950c) {
                blwr.mo74035c();
                blwr.f164950c = false;
            }
            blxa blxa2 = (blxa) blwr.f164949b;
            int i9 = i8 - 1;
            if (i8 != 0) {
                blxa2.f128003N = i9;
                blxa2.f128008b |= 2;
                String num = Integer.toString(Build.VERSION.SDK_INT);
                if (blwr.f164950c) {
                    blwr.mo74035c();
                    blwr.f164950c = false;
                }
                blxa blxa3 = (blxa) blwr.f164949b;
                num.getClass();
                int i10 = blxa3.f128007a | 16;
                blxa3.f128007a = i10;
                blxa3.f128013g = num;
                blxa3.f128007a = i10 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                blxa3.f128016j = uptimeMillis;
                String displayName = TimeZone.getDefault().getDisplayName();
                if (blwr.f164950c) {
                    blwr.mo74035c();
                    blwr.f164950c = false;
                }
                blxa blxa4 = (blxa) blwr.f164949b;
                displayName.getClass();
                blxa4.f128007a |= 512;
                blxa4.f128017k = displayName;
                if (!TextUtils.isEmpty(Build.DEVICE)) {
                    String str2 = Build.DEVICE;
                    if (blwr.f164950c) {
                        blwr.mo74035c();
                        blwr.f164950c = false;
                    }
                    blxa blxa5 = (blxa) blwr.f164949b;
                    str2.getClass();
                    blxa5.f128007a |= 32;
                    blxa5.f128014h = str2;
                }
                if (bjvu.f123440k.mo52112a()) {
                    long longValue = ((Long) bjwe.f123480a.mo54082a()).longValue();
                    if (blwr.f164950c) {
                        blwr.mo74035c();
                        blwr.f164950c = false;
                    }
                    blxa blxa6 = (blxa) blwr.f164949b;
                    blxa6.f128007a |= 64;
                    blxa6.f128015i = longValue;
                }
                String str3 = (String) bjwe.f123483d.mo54082a();
                if (!TextUtils.isEmpty(str3)) {
                    new adzt(Looper.getMainLooper()).post(new bjvq(bjvu, str3));
                    if (blwr.f164950c) {
                        blwr.mo74035c();
                        blwr.f164950c = false;
                    }
                    blxa blxa7 = (blxa) blwr.f164949b;
                    str3.getClass();
                    blxa7.f128007a = 4194304 | blxa7.f128007a;
                    blxa7.f128031y = str3;
                } else {
                    aymt aymt = bjwe.f123481b;
                    ContentResolver contentResolver = aymt.f97993a;
                    String str4 = ((ayms) aymt).f97994b;
                    String str5 = (String) ((ayms) aymt).f97995c;
                    String a = aymk.m84258a(contentResolver, str4);
                    if (a != null) {
                        str5 = a;
                    }
                    if (blwr.f164950c) {
                        blwr.mo74035c();
                        blwr.f164950c = false;
                    }
                    blxa blxa8 = (blxa) blwr.f164949b;
                    str5.getClass();
                    blxa8.f128007a = 4194304 | blxa8.f128007a;
                    blxa8.f128031y = str5;
                }
                List list5 = bjvu.f123437h;
                if (list5 != null) {
                    blxa blxa9 = (blxa) blwr.f164949b;
                    if (!blxa9.f128032z.mo73666a()) {
                        blxa9.f128032z = GeneratedMessageLite.m124021a(blxa9.f128032z);
                    }
                    bxsy.m123078a(list5, blxa9.f128032z);
                }
                bjvt a2 = bjvu.m104744a(bjvu.f123430a, elapsedRealtime);
                if (!a2.f123402a) {
                    i2 = 3;
                } else {
                    i2 = 2;
                }
                if (blwr.f164950c) {
                    blwr.mo74035c();
                    blwr.f164950c = false;
                }
                blxa blxa10 = (blxa) blwr.f164949b;
                blxa10.f128009c = i2 - 1;
                blxa10.f128007a |= 1;
                if (!TextUtils.isEmpty(a2.f123404c)) {
                    String a3 = bjyw.m104939a(a2.f123404c);
                    if (blwr.f164950c) {
                        blwr.mo74035c();
                        blwr.f164950c = false;
                    }
                    blxa blxa11 = (blxa) blwr.f164949b;
                    a3.getClass();
                    blxa11.f128007a |= 4;
                    blxa11.f128011e = a3;
                    try {
                        long parseLong = (Long.parseLong(a2.f123404c) / 100000) * 100000;
                        if (blwr.f164950c) {
                            blwr.mo74035c();
                            blwr.f164950c = false;
                        }
                        blxa blxa12 = (blxa) blwr.f164949b;
                        blxa12.f128007a |= 268435456;
                        blxa12.f127996F = parseLong;
                    } catch (NumberFormatException e) {
                    }
                }
                if (!TextUtils.isEmpty(a2.f123405d)) {
                    String str6 = a2.f123405d;
                    if (blwr.f164950c) {
                        blwr.mo74035c();
                        blwr.f164950c = false;
                    }
                    blxa blxa13 = (blxa) blwr.f164949b;
                    str6.getClass();
                    blxa13.f128007a |= 8;
                    blxa13.f128012f = str6;
                }
                if (!TextUtils.isEmpty(a2.f123406e)) {
                    String str7 = a2.f123406e;
                    if (blwr.f164950c) {
                        blwr.mo74035c();
                        blwr.f164950c = false;
                    }
                    blxa blxa14 = (blxa) blwr.f164949b;
                    str7.getClass();
                    blxa14.f128007a |= 8388608;
                    blxa14.f127991A = str7;
                }
                if (!TextUtils.isEmpty(a2.f123408g)) {
                    String str8 = a2.f123408g;
                    if (blwr.f164950c) {
                        blwr.mo74035c();
                        blwr.f164950c = false;
                    }
                    blxa blxa15 = (blxa) blwr.f164949b;
                    str8.getClass();
                    blxa15.f128007a |= 16777216;
                    blxa15.f127992B = str8;
                }
                if (((Boolean) bjwe.f123501v.mo54082a()).booleanValue()) {
                    if (!TextUtils.isEmpty(a2.f123411j)) {
                        String str9 = a2.f123411j;
                        if (blwr.f164950c) {
                            blwr.mo74035c();
                            blwr.f164950c = false;
                        }
                        blxa blxa16 = (blxa) blwr.f164949b;
                        str9.getClass();
                        blxa16.f128007a |= 33554432;
                        blxa16.f127993C = str9;
                    }
                    Boolean bool = a2.f123412k;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        if (blwr.f164950c) {
                            blwr.mo74035c();
                            blwr.f164950c = false;
                        }
                        blxa blxa17 = (blxa) blwr.f164949b;
                        blxa17.f128007a |= 67108864;
                        blxa17.f127994D = booleanValue;
                    }
                    Integer num2 = a2.f123413l;
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        if (blwr.f164950c) {
                            blwr.mo74035c();
                            blwr.f164950c = false;
                        }
                        blxa blxa18 = (blxa) blwr.f164949b;
                        blxa18.f128007a |= 134217728;
                        blxa18.f127995E = intValue;
                    }
                }
                if (!bjzc.m104960a(bjvu.f123430a, "android.permission.CAMERA")) {
                    i3 = 3;
                } else {
                    i3 = 2;
                }
                if (blwr.f164950c) {
                    blwr.mo74035c();
                    blwr.f164950c = false;
                }
                blxa blxa19 = (blxa) blwr.f164949b;
                blxa19.f128010d = i3 - 1;
                blxa19.f128007a |= 2;
                DisplayMetrics a4 = bjzh.m104970a(bjvu.f123430a);
                int i11 = a4.widthPixels;
                if (blwr.f164950c) {
                    blwr.mo74035c();
                    blwr.f164950c = false;
                }
                blxa blxa20 = (blxa) blwr.f164949b;
                blxa20.f128007a |= 1024;
                blxa20.f128018l = i11;
                int i12 = a4.heightPixels;
                if (blwr.f164950c) {
                    blwr.mo74035c();
                    blwr.f164950c = false;
                }
                blxa blxa21 = (blxa) blwr.f164949b;
                blxa21.f128007a |= 2048;
                blxa21.f128019m = i12;
                float f = a4.xdpi;
                if (blwr.f164950c) {
                    blwr.mo74035c();
                    blwr.f164950c = false;
                }
                blxa blxa22 = (blxa) blwr.f164949b;
                blxa22.f128007a |= 4096;
                blxa22.f128020n = f;
                float f2 = a4.ydpi;
                if (blwr.f164950c) {
                    blwr.mo74035c();
                    blwr.f164950c = false;
                }
                blxa blxa23 = (blxa) blwr.f164949b;
                blxa23.f128007a |= 8192;
                blxa23.f128021o = f2;
                int i13 = a4.densityDpi;
                if (blwr.f164950c) {
                    blwr.mo74035c();
                    blwr.f164950c = false;
                }
                blxa blxa24 = (blxa) blwr.f164949b;
                int i14 = blxa24.f128007a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                blxa24.f128007a = i14;
                blxa24.f128022p = i13;
                int i15 = bjvu.f123446v;
                if (i15 == 3) {
                    i14 |= 2097152;
                    blxa24.f128007a = i14;
                    blxa24.f128029w = (long) bjvu.f123433d;
                }
                int i16 = i15 - 1;
                if (i15 != 0) {
                    blxa24.f128023q = i16;
                    blxa24.f128007a = 32768 | i14;
                    PackageManager packageManager = bjvu.f123430a.getPackageManager();
                    String packageName = bjvu.f123430a.getPackageName();
                    bjvs bjvs3 = (bjvs) bjvu.f123421p.mo15546a(packageName);
                    if (bjvs3 == null) {
                        try {
                            packageInfo = svr.m36484b(bjvu.f123430a).mo26176b(packageName, 0);
                            if (packageInfo != null) {
                                try {
                                    bjvu.f123421p.mo15547a(packageName, new bjvs(elapsedRealtime, packageInfo));
                                } catch (PackageManager.NameNotFoundException e2) {
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e3) {
                            packageInfo = null;
                        }
                    } else {
                        packageInfo = bjvs3.f123401b;
                    }
                    if (packageInfo != null) {
                        if (blwr.f164950c) {
                            blwr.mo74035c();
                            blwr.f164950c = false;
                        }
                        blxa blxa25 = (blxa) blwr.f164949b;
                        packageName.getClass();
                        blxa25.f128007a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                        blxa25.f128024r = packageName;
                        String num3 = Integer.toString(packageInfo.versionCode);
                        if (blwr.f164950c) {
                            blwr.mo74035c();
                            blwr.f164950c = false;
                        }
                        blxa blxa26 = (blxa) blwr.f164949b;
                        num3.getClass();
                        blxa26.f128007a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                        blxa26.f128025s = num3;
                        if (!TextUtils.isEmpty(packageInfo.versionName)) {
                            String str10 = packageInfo.versionName;
                            if (blwr.f164950c) {
                                blwr.mo74035c();
                                blwr.f164950c = false;
                            }
                            blxa blxa27 = (blxa) blwr.f164949b;
                            str10.getClass();
                            blxa27.f128007a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                            blxa27.f128026t = str10;
                        }
                    }
                    if (!TextUtils.isEmpty(bjvu.f123434e)) {
                        String str11 = bjvu.f123434e;
                        if (blwr.f164950c) {
                            blwr.mo74035c();
                            blwr.f164950c = false;
                        }
                        blxa blxa28 = (blxa) blwr.f164949b;
                        str11.getClass();
                        blxa28.f128007a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                        blxa28.f128027u = str11;
                        Context context3 = bjvu.f123430a;
                        String str12 = bjvu.f123434e;
                        bjvs bjvs4 = (bjvs) bjvu.f123421p.mo15546a(str12);
                        if (bjvs4 == null) {
                            j2 = clearCallingIdentity;
                            bjvs2 = bjvs4;
                        } else {
                            j2 = clearCallingIdentity;
                            try {
                                bjvs2 = bjvs4;
                            } catch (IllegalStateException e4) {
                                j4 = 0;
                                if (blwr.f164950c) {
                                }
                                blxa blxa29 = (blxa) blwr.f164949b;
                                int i17 = blxa29.f128007a | 536870912;
                                blxa29.f128007a = i17;
                                blxa29.f127997G = j4;
                                blxa29.f128007a = i17 | JGCastService.FLAG_PRIVATE_DISPLAY;
                                blxa29.f127998H = j4;
                                int i18 = Build.VERSION.SDK_INT;
                                if (connectivityManager != null) {
                                }
                                z5 = false;
                                if (blwr.f164950c) {
                                }
                                blxa blxa30 = (blxa) blwr.f164949b;
                                blxa30.f128007a |= Integer.MIN_VALUE;
                                blxa30.f127999I = z5;
                                da = bmaj.f128452m.mo74144da();
                                bArr2 = bjvu.f123431b;
                                if (bArr2 != null) {
                                }
                                String a5 = bjyw.m104936a(bjvu.f123430a);
                                if (da.f164950c) {
                                }
                                bmaj bmaj = (bmaj) da.f164949b;
                                a5.getClass();
                                int i19 = bmaj.f128454a | 4;
                                bmaj.f128454a = i19;
                                bmaj.f128458e = a5;
                                bmaj.f128459f = 2;
                                bmaj.f128454a = i19 | 8;
                                if (packageInfo != null) {
                                }
                                if (da.f164950c) {
                                }
                                bmaj bmaj2 = (bmaj) da.f164949b;
                                bmaj2.f128454a |= 16;
                                bmaj2.f128460g = r8;
                                String l = Long.toString(UUID.randomUUID().getLeastSignificantBits());
                                if (da.f164950c) {
                                }
                                bmaj bmaj3 = (bmaj) da.f164949b;
                                l.getClass();
                                int i20 = bmaj3.f128454a | 32;
                                bmaj3.f128454a = i20;
                                bmaj3.f128461h = l;
                                boolean z6 = bjvu.f123436g;
                                bmaj3.f128454a = i20 | 128;
                                bmaj3.f128463j = z6;
                                if (!bjvu.f123435f) {
                                }
                                accountArr = AccountManager.get(bjvu.f123430a).getAccountsByType("com.google");
                                i4 = accountArr.length;
                                if (!bjvu.f123435f) {
                                }
                                if (!bjvu.f123439j) {
                                }
                                int[] iArr3 = bjvu.f123438i;
                                da3 = bwdj.f158900b.mo74144da();
                                iArr2 = bjvu.f123438i;
                                if (iArr2 == null) {
                                }
                                if (!da3.f164950c) {
                                }
                                bwdj = (bwdj) da3.f164949b;
                                if (bwdj.f158902a.mo73666a()) {
                                }
                                bxsy.m123078a(arrayList, bwdj.f158902a);
                                if (!da.f164950c) {
                                }
                                bmaj bmaj4 = (bmaj) da.f164949b;
                                bwdj bwdj2 = (bwdj) da3.mo74062i();
                                bwdj2.getClass();
                                bmaj4.f128462i = bwdj2;
                                bmaj4.f128454a |= 64;
                                bjyg2 = bjvu.f123441l;
                                if (bjyg2 != null) {
                                }
                                ArrayList a6 = m104714a(bjvu.f123430a);
                                if (!blwr.f164950c) {
                                }
                                blxa = (blxa) blwr.f164949b;
                                if (!blxa.f128001K.mo73666a()) {
                                }
                                size = a6.size();
                                while (i5 < size) {
                                }
                                if (!da.f164950c) {
                                }
                                bmaj bmaj5 = (bmaj) da.f164949b;
                                blxa blxa31 = (blxa) blwr.mo74062i();
                                blxa31.getClass();
                                bmaj5.f128456c = blxa31;
                                bmaj5.f128455b = 10;
                                da2 = bmah.f128446d.mo74144da();
                                if (bjvu.f123443n == null) {
                                }
                                list3 = bjvu.f123442m;
                                if (list3 == null) {
                                }
                                if ((((bmah) da2.f164949b).f128448a & 1) == 0) {
                                }
                                if (!da.f164950c) {
                                }
                                bmaj bmaj6 = (bmaj) da.f164949b;
                                bmah bmah = (bmah) da2.mo74062i();
                                bmah.getClass();
                                bmaj6.f128465l = bmah;
                                bmaj6.f128454a |= 512;
                                bmaj bmaj7 = (bmaj) da.mo74062i();
                                Binder.restoreCallingIdentity(j2);
                                return bmaj7;
                            } catch (NullPointerException e5) {
                                j4 = 0;
                                if (blwr.f164950c) {
                                }
                                blxa blxa292 = (blxa) blwr.f164949b;
                                int i172 = blxa292.f128007a | 536870912;
                                blxa292.f128007a = i172;
                                blxa292.f127997G = j4;
                                blxa292.f128007a = i172 | JGCastService.FLAG_PRIVATE_DISPLAY;
                                blxa292.f127998H = j4;
                                int i182 = Build.VERSION.SDK_INT;
                                if (connectivityManager != null) {
                                }
                                z5 = false;
                                if (blwr.f164950c) {
                                }
                                blxa blxa302 = (blxa) blwr.f164949b;
                                blxa302.f128007a |= Integer.MIN_VALUE;
                                blxa302.f127999I = z5;
                                da = bmaj.f128452m.mo74144da();
                                bArr2 = bjvu.f123431b;
                                if (bArr2 != null) {
                                }
                                String a52 = bjyw.m104936a(bjvu.f123430a);
                                if (da.f164950c) {
                                }
                                bmaj bmaj8 = (bmaj) da.f164949b;
                                a52.getClass();
                                int i192 = bmaj8.f128454a | 4;
                                bmaj8.f128454a = i192;
                                bmaj8.f128458e = a52;
                                bmaj8.f128459f = 2;
                                bmaj8.f128454a = i192 | 8;
                                if (packageInfo != null) {
                                }
                                if (da.f164950c) {
                                }
                                bmaj bmaj22 = (bmaj) da.f164949b;
                                bmaj22.f128454a |= 16;
                                bmaj22.f128460g = r8;
                                String l2 = Long.toString(UUID.randomUUID().getLeastSignificantBits());
                                if (da.f164950c) {
                                }
                                bmaj bmaj32 = (bmaj) da.f164949b;
                                l2.getClass();
                                int i202 = bmaj32.f128454a | 32;
                                bmaj32.f128454a = i202;
                                bmaj32.f128461h = l2;
                                boolean z62 = bjvu.f123436g;
                                bmaj32.f128454a = i202 | 128;
                                bmaj32.f128463j = z62;
                                if (!bjvu.f123435f) {
                                }
                                accountArr = AccountManager.get(bjvu.f123430a).getAccountsByType("com.google");
                                i4 = accountArr.length;
                                if (!bjvu.f123435f) {
                                }
                                if (!bjvu.f123439j) {
                                }
                                int[] iArr32 = bjvu.f123438i;
                                da3 = bwdj.f158900b.mo74144da();
                                iArr2 = bjvu.f123438i;
                                if (iArr2 == null) {
                                }
                                if (!da3.f164950c) {
                                }
                                bwdj = (bwdj) da3.f164949b;
                                if (bwdj.f158902a.mo73666a()) {
                                }
                                bxsy.m123078a(arrayList, bwdj.f158902a);
                                if (!da.f164950c) {
                                }
                                bmaj bmaj42 = (bmaj) da.f164949b;
                                bwdj bwdj22 = (bwdj) da3.mo74062i();
                                bwdj22.getClass();
                                bmaj42.f128462i = bwdj22;
                                bmaj42.f128454a |= 64;
                                bjyg2 = bjvu.f123441l;
                                if (bjyg2 != null) {
                                }
                                ArrayList a62 = m104714a(bjvu.f123430a);
                                if (!blwr.f164950c) {
                                }
                                blxa = (blxa) blwr.f164949b;
                                if (!blxa.f128001K.mo73666a()) {
                                }
                                size = a62.size();
                                while (i5 < size) {
                                }
                                if (!da.f164950c) {
                                }
                                bmaj bmaj52 = (bmaj) da.f164949b;
                                blxa blxa312 = (blxa) blwr.mo74062i();
                                blxa312.getClass();
                                bmaj52.f128456c = blxa312;
                                bmaj52.f128455b = 10;
                                da2 = bmah.f128446d.mo74144da();
                                if (bjvu.f123443n == null) {
                                }
                                list3 = bjvu.f123442m;
                                if (list3 == null) {
                                }
                                if ((((bmah) da2.f164949b).f128448a & 1) == 0) {
                                }
                                if (!da.f164950c) {
                                }
                                bmaj bmaj62 = (bmaj) da.f164949b;
                                bmah bmah2 = (bmah) da2.mo74062i();
                                bmah2.getClass();
                                bmaj62.f128465l = bmah2;
                                bmaj62.f128454a |= 512;
                                bmaj bmaj72 = (bmaj) da.mo74062i();
                                Binder.restoreCallingIdentity(j2);
                                return bmaj72;
                            } catch (IllegalArgumentException e6) {
                                j4 = 0;
                                if (blwr.f164950c) {
                                }
                                blxa blxa2922 = (blxa) blwr.f164949b;
                                int i1722 = blxa2922.f128007a | 536870912;
                                blxa2922.f128007a = i1722;
                                blxa2922.f127997G = j4;
                                blxa2922.f128007a = i1722 | JGCastService.FLAG_PRIVATE_DISPLAY;
                                blxa2922.f127998H = j4;
                                int i1822 = Build.VERSION.SDK_INT;
                                if (connectivityManager != null) {
                                }
                                z5 = false;
                                if (blwr.f164950c) {
                                }
                                blxa blxa3022 = (blxa) blwr.f164949b;
                                blxa3022.f128007a |= Integer.MIN_VALUE;
                                blxa3022.f127999I = z5;
                                da = bmaj.f128452m.mo74144da();
                                bArr2 = bjvu.f123431b;
                                if (bArr2 != null) {
                                }
                                String a522 = bjyw.m104936a(bjvu.f123430a);
                                if (da.f164950c) {
                                }
                                bmaj bmaj82 = (bmaj) da.f164949b;
                                a522.getClass();
                                int i1922 = bmaj82.f128454a | 4;
                                bmaj82.f128454a = i1922;
                                bmaj82.f128458e = a522;
                                bmaj82.f128459f = 2;
                                bmaj82.f128454a = i1922 | 8;
                                if (packageInfo != null) {
                                }
                                if (da.f164950c) {
                                }
                                bmaj bmaj222 = (bmaj) da.f164949b;
                                bmaj222.f128454a |= 16;
                                bmaj222.f128460g = r8;
                                String l22 = Long.toString(UUID.randomUUID().getLeastSignificantBits());
                                if (da.f164950c) {
                                }
                                bmaj bmaj322 = (bmaj) da.f164949b;
                                l22.getClass();
                                int i2022 = bmaj322.f128454a | 32;
                                bmaj322.f128454a = i2022;
                                bmaj322.f128461h = l22;
                                boolean z622 = bjvu.f123436g;
                                bmaj322.f128454a = i2022 | 128;
                                bmaj322.f128463j = z622;
                                if (!bjvu.f123435f) {
                                }
                                accountArr = AccountManager.get(bjvu.f123430a).getAccountsByType("com.google");
                                i4 = accountArr.length;
                                if (!bjvu.f123435f) {
                                }
                                if (!bjvu.f123439j) {
                                }
                                int[] iArr322 = bjvu.f123438i;
                                da3 = bwdj.f158900b.mo74144da();
                                iArr2 = bjvu.f123438i;
                                if (iArr2 == null) {
                                }
                                if (!da3.f164950c) {
                                }
                                bwdj = (bwdj) da3.f164949b;
                                if (bwdj.f158902a.mo73666a()) {
                                }
                                bxsy.m123078a(arrayList, bwdj.f158902a);
                                if (!da.f164950c) {
                                }
                                bmaj bmaj422 = (bmaj) da.f164949b;
                                bwdj bwdj222 = (bwdj) da3.mo74062i();
                                bwdj222.getClass();
                                bmaj422.f128462i = bwdj222;
                                bmaj422.f128454a |= 64;
                                bjyg2 = bjvu.f123441l;
                                if (bjyg2 != null) {
                                }
                                ArrayList a622 = m104714a(bjvu.f123430a);
                                if (!blwr.f164950c) {
                                }
                                blxa = (blxa) blwr.f164949b;
                                if (!blxa.f128001K.mo73666a()) {
                                }
                                size = a622.size();
                                while (i5 < size) {
                                }
                                if (!da.f164950c) {
                                }
                                bmaj bmaj522 = (bmaj) da.f164949b;
                                blxa blxa3122 = (blxa) blwr.mo74062i();
                                blxa3122.getClass();
                                bmaj522.f128456c = blxa3122;
                                bmaj522.f128455b = 10;
                                da2 = bmah.f128446d.mo74144da();
                                if (bjvu.f123443n == null) {
                                }
                                list3 = bjvu.f123442m;
                                if (list3 == null) {
                                }
                                if ((((bmah) da2.f164949b).f128448a & 1) == 0) {
                                }
                                if (!da.f164950c) {
                                }
                                bmaj bmaj622 = (bmaj) da.f164949b;
                                bmah bmah22 = (bmah) da2.mo74062i();
                                bmah22.getClass();
                                bmaj622.f128465l = bmah22;
                                bmaj622.f128454a |= 512;
                                bmaj bmaj722 = (bmaj) da.mo74062i();
                                Binder.restoreCallingIdentity(j2);
                                return bmaj722;
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                Binder.restoreCallingIdentity(j2);
                                throw th2;
                            }
                        }
                        try {
                            PackageInfo b = svr.m36484b(context3).mo26176b(str12, 0);
                            if (b != null) {
                                bjvs bjvs5 = new bjvs(elapsedRealtime, b);
                                try {
                                    bjvu.f123421p.mo15547a(str12, bjvs5);
                                } catch (PackageManager.NameNotFoundException e7) {
                                }
                                bjvs = bjvs5;
                                if (bjvs == null) {
                                    packageInfo2 = bjvs.f123401b;
                                    String valueOf = String.valueOf(C1147kv.m18618a(packageInfo2));
                                    if (blwr.f164950c) {
                                        blwr.mo74035c();
                                        blwr.f164950c = false;
                                    }
                                    blxa blxa32 = (blxa) blwr.f164949b;
                                    valueOf.getClass();
                                    blxa32.f128007a |= 1048576;
                                    blxa32.f128028v = valueOf;
                                } else {
                                    packageInfo2 = null;
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e8) {
                        }
                        bjvs = bjvs2;
                        if (bjvs == null) {
                        }
                    } else {
                        j2 = clearCallingIdentity;
                        packageInfo2 = null;
                    }
                    Context context4 = bjvu.f123430a;
                    if (bjvu.f123424s == null) {
                        j3 = uptimeMillis;
                    } else {
                        j3 = uptimeMillis;
                    }
                    List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent("com.google.android.payments.standard.AUTHENTICATE_V1"), 0);
                    List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(new Intent("com.google.android.payments.standard.REDIRECT_CAPTURE_V1"), 0);
                    List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("com.google.android.wallet.carrierbilling.operatorproperties.BIND"), 0);
                    HashMap hashMap = new HashMap(queryIntentActivities.size() + queryIntentServices.size());
                    bjvu.m104748a(hashMap, queryIntentActivities, 2);
                    bjvu.m104748a(hashMap, queryIntentActivities2, 4);
                    if (!queryIntentServices.isEmpty()) {
                        bxvd da4 = blwl.f127951c.mo74144da();
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = false;
                        }
                        blwl blwl = (blwl) da4.f164949b;
                        blwl.f127954b = 2;
                        blwl.f127953a |= 1;
                        blwl.m107717a(blwl);
                        blwl blwl2 = (blwl) da4.mo74062i();
                        int size2 = queryIntentServices.size();
                        int i21 = 0;
                        while (i21 < size2) {
                            String str13 = queryIntentServices.get(i21).serviceInfo.packageName;
                            List list6 = (List) hashMap.get(str13);
                            if (list6 == null) {
                                i7 = size2;
                                list4 = new ArrayList();
                                hashMap.put(str13, list4);
                            } else {
                                i7 = size2;
                                list4 = list6;
                            }
                            list4.add(blwl2);
                            i21++;
                            size2 = i7;
                        }
                    }
                    bjvu.f123424s = new ArrayList(hashMap.size());
                    for (String str14 : hashMap.keySet()) {
                        bxvd da5 = blwm.f127956e.mo74144da();
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        blwm blwm = (blwm) da5.f164949b;
                        str14.getClass();
                        blwm.f127958a |= 1;
                        blwm.f127959b = str14;
                        try {
                            String num4 = Integer.toString(svr.m36484b(context4).mo26176b(str14, 0).versionCode);
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            blwm blwm2 = (blwm) da5.f164949b;
                            num4.getClass();
                            context2 = context4;
                            try {
                                blwm2.f127958a |= 2;
                                blwm2.f127960c = num4;
                            } catch (PackageManager.NameNotFoundException e9) {
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            context2 = context4;
                        }
                        List list7 = (List) hashMap.get(str14);
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        blwm blwm3 = (blwm) da5.f164949b;
                        if (!blwm3.f127961d.mo73666a()) {
                            blwm3.f127961d = GeneratedMessageLite.m124021a(blwm3.f127961d);
                        }
                        bxsy.m123078a(list7, blwm3.f127961d);
                        bjvu.f123424s.add((blwm) da5.mo74062i());
                        context4 = context2;
                    }
                    bjvu.f123425t = elapsedRealtime;
                    List list8 = bjvu.f123424s;
                    if (blwr.f164950c) {
                        blwr.mo74035c();
                        blwr.f164950c = false;
                    }
                    blxa blxa33 = (blxa) blwr.f164949b;
                    if (!blxa33.f128002M.mo73666a()) {
                        blxa33.f128002M = GeneratedMessageLite.m124021a(blxa33.f128002M);
                    }
                    bxsy.m123078a(list8, blxa33.f128002M);
                    if (bjvu.f123423r == null) {
                        bjvu.f123423r = Boolean.valueOf(packageManager.hasSystemFeature("android.software.leanback"));
                    }
                    if (bjvu.f123423r.booleanValue()) {
                        blwr.mo66766a(blwy.ANDROID_LEANBACK);
                    }
                    if (bjvu.f123422q == null) {
                        bjvu.f123422q = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                    }
                    if (bjvu.f123422q.booleanValue()) {
                        blwr.mo66766a(blwy.ANDROID_WEAR);
                    }
                    Intent intent = new Intent("com.google.android.gms.ocr.ACTION_CARD_CAPTURE");
                    intent.setPackage("com.google.android.gms");
                    if (bjvu.f123432c) {
                        if (packageManager.resolveActivity(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE) != null) {
                            blwr.mo66766a(blwy.CAMERA_DOCUMENT_CAPTURE);
                        }
                    }
                    if (bjvu.f123440k.mo52113b()) {
                        if (new akoz(bjvu.f123430a).mo39623a() != null) {
                            if (blwr.f164950c) {
                                blwr.mo74035c();
                                blwr.f164950c = false;
                            }
                            blxa blxa34 = (blxa) blwr.f164949b;
                            blxa34.f128008b |= 8;
                            blxa34.f128006Q = true;
                            blwr.mo66765a(blwt.DEVICE_BASED_INPUT_TYPE_CARD_OCR);
                        }
                        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(bjvu.f123430a);
                        if (defaultAdapter != null && defaultAdapter.isEnabled()) {
                            blwr.mo66765a(blwt.DEVICE_BASED_INPUT_TYPE_NFC);
                        }
                    }
                    connectivityManager = (ConnectivityManager) bjvu.f123430a.getSystemService("connectivity");
                    WifiManager wifiManager = (WifiManager) bjvu.f123430a.getSystemService("wifi");
                    long j5 = 0;
                    if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected())) {
                        int type = activeNetworkInfo.getType();
                        if (type == 0) {
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                    j4 = bjvu.m104749b(114.0d);
                                    break;
                                case 2:
                                    j4 = bjvu.m104749b(135.0d);
                                    break;
                                case 3:
                                    j4 = bjvu.m104749b(384.0d);
                                    break;
                                case 4:
                                    j4 = bjvu.m104749b(115.0d);
                                    break;
                                case 5:
                                    j4 = bjvu.m104749b(700.0d);
                                    break;
                                case 6:
                                case 14:
                                    j4 = bjvu.m104749b(900.0d);
                                    break;
                                case 7:
                                    j4 = bjvu.m104749b(70.0d);
                                    break;
                                case 8:
                                    j4 = bjvu.m104743a(1.8d);
                                    break;
                                case 9:
                                case 10:
                                    j4 = bjvu.m104743a(1.0d);
                                    break;
                                case 11:
                                    j4 = bjvu.m104749b(13.0d);
                                    break;
                                case 12:
                                case 13:
                                case 15:
                                    j4 = bjvu.m104743a(5.0d);
                                    break;
                                default:
                                    j4 = 0;
                                    break;
                            }
                        } else if (type != 1) {
                            if (type == 6) {
                                j4 = bjvu.m104743a(3.0d);
                            } else if (type != 9) {
                                j4 = 0;
                            } else {
                                j4 = bjvu.m104743a(480.0d);
                            }
                        } else if (wifiManager != null) {
                            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                            if (connectionInfo != null) {
                                j4 = bjvu.m104743a((double) connectionInfo.getLinkSpeed());
                            }
                        }
                        if (blwr.f164950c) {
                            blwr.mo74035c();
                            blwr.f164950c = false;
                        }
                        blxa blxa29222 = (blxa) blwr.f164949b;
                        int i17222 = blxa29222.f128007a | 536870912;
                        blxa29222.f128007a = i17222;
                        blxa29222.f127997G = j4;
                        blxa29222.f128007a = i17222 | JGCastService.FLAG_PRIVATE_DISPLAY;
                        blxa29222.f127998H = j4;
                        int i18222 = Build.VERSION.SDK_INT;
                        if (connectivityManager != null || !connectivityManager.isActiveNetworkMetered()) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (blwr.f164950c) {
                            blwr.mo74035c();
                            blwr.f164950c = false;
                        }
                        blxa blxa30222 = (blxa) blwr.f164949b;
                        blxa30222.f128007a |= Integer.MIN_VALUE;
                        blxa30222.f127999I = z5;
                        da = bmaj.f128452m.mo74144da();
                        bArr2 = bjvu.f123431b;
                        if (bArr2 != null) {
                            if (bArr2.length > 0) {
                                ByteString a7 = ByteString.m123261a(bArr2);
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bmaj bmaj9 = (bmaj) da.f164949b;
                                a7.getClass();
                                bmaj9.f128454a |= 1;
                                bmaj9.f128457d = a7;
                            }
                        }
                        String a5222 = bjyw.m104936a(bjvu.f123430a);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bmaj bmaj822 = (bmaj) da.f164949b;
                        a5222.getClass();
                        int i19222 = bmaj822.f128454a | 4;
                        bmaj822.f128454a = i19222;
                        bmaj822.f128458e = a5222;
                        bmaj822.f128459f = 2;
                        bmaj822.f128454a = i19222 | 8;
                        if (packageInfo != null) {
                            j5 = (long) packageInfo.versionCode;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bmaj bmaj2222 = (bmaj) da.f164949b;
                        bmaj2222.f128454a |= 16;
                        bmaj2222.f128460g = j5;
                        String l222 = Long.toString(UUID.randomUUID().getLeastSignificantBits());
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bmaj bmaj3222 = (bmaj) da.f164949b;
                        l222.getClass();
                        int i20222 = bmaj3222.f128454a | 32;
                        bmaj3222.f128454a = i20222;
                        bmaj3222.f128461h = l222;
                        boolean z6222 = bjvu.f123436g;
                        bmaj3222.f128454a = i20222 | 128;
                        bmaj3222.f128463j = z6222;
                        if (!bjvu.f123435f) {
                            if (!bjvu.f123439j) {
                                accountArr = null;
                                i4 = -1;
                                if (!bjvu.f123435f) {
                                    for (int i22 = 0; i22 < i4; i22++) {
                                        String str15 = accountArr[i22].name;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bmaj bmaj10 = (bmaj) da.f164949b;
                                        str15.getClass();
                                        if (!bmaj10.f128464k.mo73666a()) {
                                            bmaj10.f128464k = GeneratedMessageLite.m124021a(bmaj10.f128464k);
                                        }
                                        bmaj10.f128464k.add(str15);
                                    }
                                }
                                if (!bjvu.f123439j) {
                                    bxvd da6 = bygl.f166347d.mo74144da();
                                    bygg a8 = bjvu.m104745a(a2);
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bygl bygl = (bygl) da6.f164949b;
                                    a8.getClass();
                                    bygl.f166350b = a8;
                                    bygl.f166349a |= 1;
                                    bygh a9 = bjvu.m104746a(bjvu.f123430a, packageInfo, packageInfo2, a2, elapsedRealtime, j3);
                                    if (i4 >= 0) {
                                        if (a9.f164950c) {
                                            a9.mo74035c();
                                            a9.f164950c = false;
                                        }
                                        bygk bygk = (bygk) a9.f164949b;
                                        bygk bygk2 = bygk.f166327s;
                                        bygk.f166329a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                                        bygk.f166346r = i4;
                                    }
                                    if (da6.f164950c) {
                                        da6.mo74035c();
                                        da6.f164950c = false;
                                    }
                                    bygl bygl2 = (bygl) da6.f164949b;
                                    bygk bygk3 = (bygk) a9.mo74062i();
                                    bygk3.getClass();
                                    bygl2.f166351c = bygk3;
                                    bygl2.f166349a |= 2;
                                    if (blwr.f164950c) {
                                        blwr.mo74035c();
                                        blwr.f164950c = false;
                                    }
                                    blxa blxa35 = (blxa) blwr.f164949b;
                                    bygl bygl3 = (bygl) da6.mo74062i();
                                    bygl3.getClass();
                                    blxa35.f128000J = bygl3;
                                    blxa35.f128008b |= 1;
                                }
                                int[] iArr3222 = bjvu.f123438i;
                                if (iArr3222 != null && iArr3222.length > 0) {
                                    da3 = bwdj.f158900b.mo74144da();
                                    iArr2 = bjvu.f123438i;
                                    if (iArr2 == null) {
                                        int length = iArr2.length;
                                        arrayList = new ArrayList(length);
                                        for (int i23 : iArr2) {
                                            arrayList.add(Integer.valueOf(i23));
                                        }
                                    } else {
                                        arrayList = null;
                                    }
                                    if (!da3.f164950c) {
                                        da3.mo74035c();
                                        da3.f164950c = false;
                                    }
                                    bwdj = (bwdj) da3.f164949b;
                                    if (bwdj.f158902a.mo73666a()) {
                                        bwdj.f158902a = GeneratedMessageLite.m124019a(bwdj.f158902a);
                                    }
                                    bxsy.m123078a(arrayList, bwdj.f158902a);
                                    if (!da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bmaj bmaj4222 = (bmaj) da.f164949b;
                                    bwdj bwdj2222 = (bwdj) da3.mo74062i();
                                    bwdj2222.getClass();
                                    bmaj4222.f128462i = bwdj2222;
                                    bmaj4222.f128454a |= 64;
                                }
                                bjyg2 = bjvu.f123441l;
                                if (bjyg2 != null) {
                                    if (!bjyg2.mo65626a(bjvu.f123430a)) {
                                        i6 = 2;
                                    } else {
                                        i6 = 3;
                                    }
                                    if (blwr.f164950c) {
                                        blwr.mo74035c();
                                        blwr.f164950c = false;
                                    }
                                    blxa blxa36 = (blxa) blwr.f164949b;
                                    blxa36.f128004O = i6 - 1;
                                    blxa36.f128008b |= 4;
                                }
                                ArrayList a6222 = m104714a(bjvu.f123430a);
                                if (!blwr.f164950c) {
                                    blwr.mo74035c();
                                    blwr.f164950c = false;
                                }
                                blxa = (blxa) blwr.f164949b;
                                if (!blxa.f128001K.mo73666a()) {
                                    blxa.f128001K = GeneratedMessageLite.m124019a(blxa.f128001K);
                                }
                                size = a6222.size();
                                for (i5 = 0; i5 < size; i5++) {
                                    blxa.f128001K.mo74153d(((blwq) a6222.get(i5)).f127969e);
                                }
                                if (!da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bmaj bmaj5222 = (bmaj) da.f164949b;
                                blxa blxa31222 = (blxa) blwr.mo74062i();
                                blxa31222.getClass();
                                bmaj5222.f128456c = blxa31222;
                                bmaj5222.f128455b = 10;
                                da2 = bmah.f128446d.mo74144da();
                                if (bjvu.f123443n == null) {
                                    bjvu.mo65570a(da2);
                                }
                                list3 = bjvu.f123442m;
                                if (list3 == null) {
                                    if (da2.f164950c) {
                                        da2.mo74035c();
                                        da2.f164950c = false;
                                    }
                                    bmah bmah3 = (bmah) da2.f164949b;
                                    if (!bmah3.f128449b.mo73666a()) {
                                        bmah3.f128449b = GeneratedMessageLite.m124021a(bmah3.f128449b);
                                    }
                                    bxsy.m123078a(list3, bmah3.f128449b);
                                }
                                if ((((bmah) da2.f164949b).f128448a & 1) == 0 || bjvu.f123442m != null) {
                                    if (!da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bmaj bmaj6222 = (bmaj) da.f164949b;
                                    bmah bmah222 = (bmah) da2.mo74062i();
                                    bmah222.getClass();
                                    bmaj6222.f128465l = bmah222;
                                    bmaj6222.f128454a |= 512;
                                }
                                bmaj bmaj7222 = (bmaj) da.mo74062i();
                                Binder.restoreCallingIdentity(j2);
                                return bmaj7222;
                            }
                        }
                        accountArr = AccountManager.get(bjvu.f123430a).getAccountsByType("com.google");
                        i4 = accountArr.length;
                        if (!bjvu.f123435f) {
                        }
                        if (!bjvu.f123439j) {
                        }
                        int[] iArr32222 = bjvu.f123438i;
                        da3 = bwdj.f158900b.mo74144da();
                        iArr2 = bjvu.f123438i;
                        if (iArr2 == null) {
                        }
                        if (!da3.f164950c) {
                        }
                        bwdj = (bwdj) da3.f164949b;
                        if (bwdj.f158902a.mo73666a()) {
                        }
                        bxsy.m123078a(arrayList, bwdj.f158902a);
                        if (!da.f164950c) {
                        }
                        bmaj bmaj42222 = (bmaj) da.f164949b;
                        bwdj bwdj22222 = (bwdj) da3.mo74062i();
                        bwdj22222.getClass();
                        bmaj42222.f128462i = bwdj22222;
                        bmaj42222.f128454a |= 64;
                        bjyg2 = bjvu.f123441l;
                        if (bjyg2 != null) {
                        }
                        ArrayList a62222 = m104714a(bjvu.f123430a);
                        if (!blwr.f164950c) {
                        }
                        blxa = (blxa) blwr.f164949b;
                        if (!blxa.f128001K.mo73666a()) {
                        }
                        size = a62222.size();
                        while (i5 < size) {
                        }
                        if (!da.f164950c) {
                        }
                        bmaj bmaj52222 = (bmaj) da.f164949b;
                        blxa blxa312222 = (blxa) blwr.mo74062i();
                        blxa312222.getClass();
                        bmaj52222.f128456c = blxa312222;
                        bmaj52222.f128455b = 10;
                        da2 = bmah.f128446d.mo74144da();
                        if (bjvu.f123443n == null) {
                        }
                        list3 = bjvu.f123442m;
                        if (list3 == null) {
                        }
                        if ((((bmah) da2.f164949b).f128448a & 1) == 0) {
                        }
                        if (!da.f164950c) {
                        }
                        bmaj bmaj62222 = (bmaj) da.f164949b;
                        bmah bmah2222 = (bmah) da2.mo74062i();
                        bmah2222.getClass();
                        bmaj62222.f128465l = bmah2222;
                        bmaj62222.f128454a |= 512;
                        bmaj bmaj72222 = (bmaj) da.mo74062i();
                        Binder.restoreCallingIdentity(j2);
                        return bmaj72222;
                    }
                    j4 = 0;
                    if (blwr.f164950c) {
                    }
                    blxa blxa292222 = (blxa) blwr.f164949b;
                    int i172222 = blxa292222.f128007a | 536870912;
                    blxa292222.f128007a = i172222;
                    blxa292222.f127997G = j4;
                    blxa292222.f128007a = i172222 | JGCastService.FLAG_PRIVATE_DISPLAY;
                    blxa292222.f127998H = j4;
                    int i182222 = Build.VERSION.SDK_INT;
                    if (connectivityManager != null) {
                    }
                    z5 = false;
                    if (blwr.f164950c) {
                    }
                    blxa blxa302222 = (blxa) blwr.f164949b;
                    blxa302222.f128007a |= Integer.MIN_VALUE;
                    blxa302222.f127999I = z5;
                    da = bmaj.f128452m.mo74144da();
                    bArr2 = bjvu.f123431b;
                    if (bArr2 != null) {
                    }
                    String a52222 = bjyw.m104936a(bjvu.f123430a);
                    if (da.f164950c) {
                    }
                    bmaj bmaj8222 = (bmaj) da.f164949b;
                    a52222.getClass();
                    int i192222 = bmaj8222.f128454a | 4;
                    bmaj8222.f128454a = i192222;
                    bmaj8222.f128458e = a52222;
                    bmaj8222.f128459f = 2;
                    bmaj8222.f128454a = i192222 | 8;
                    if (packageInfo != null) {
                    }
                    if (da.f164950c) {
                    }
                    bmaj bmaj22222 = (bmaj) da.f164949b;
                    bmaj22222.f128454a |= 16;
                    bmaj22222.f128460g = j5;
                    String l2222 = Long.toString(UUID.randomUUID().getLeastSignificantBits());
                    if (da.f164950c) {
                    }
                    bmaj bmaj32222 = (bmaj) da.f164949b;
                    l2222.getClass();
                    int i202222 = bmaj32222.f128454a | 32;
                    bmaj32222.f128454a = i202222;
                    bmaj32222.f128461h = l2222;
                    boolean z62222 = bjvu.f123436g;
                    bmaj32222.f128454a = i202222 | 128;
                    bmaj32222.f128463j = z62222;
                    if (!bjvu.f123435f) {
                    }
                    accountArr = AccountManager.get(bjvu.f123430a).getAccountsByType("com.google");
                    i4 = accountArr.length;
                    if (!bjvu.f123435f) {
                    }
                    if (!bjvu.f123439j) {
                    }
                    int[] iArr322222 = bjvu.f123438i;
                    da3 = bwdj.f158900b.mo74144da();
                    iArr2 = bjvu.f123438i;
                    if (iArr2 == null) {
                    }
                    if (!da3.f164950c) {
                    }
                    bwdj = (bwdj) da3.f164949b;
                    if (bwdj.f158902a.mo73666a()) {
                    }
                    bxsy.m123078a(arrayList, bwdj.f158902a);
                    if (!da.f164950c) {
                    }
                    bmaj bmaj422222 = (bmaj) da.f164949b;
                    bwdj bwdj222222 = (bwdj) da3.mo74062i();
                    bwdj222222.getClass();
                    bmaj422222.f128462i = bwdj222222;
                    bmaj422222.f128454a |= 64;
                    bjyg2 = bjvu.f123441l;
                    if (bjyg2 != null) {
                    }
                    ArrayList a622222 = m104714a(bjvu.f123430a);
                    if (!blwr.f164950c) {
                    }
                    blxa = (blxa) blwr.f164949b;
                    if (!blxa.f128001K.mo73666a()) {
                    }
                    size = a622222.size();
                    while (i5 < size) {
                    }
                    if (!da.f164950c) {
                    }
                    bmaj bmaj522222 = (bmaj) da.f164949b;
                    blxa blxa3122222 = (blxa) blwr.mo74062i();
                    blxa3122222.getClass();
                    bmaj522222.f128456c = blxa3122222;
                    bmaj522222.f128455b = 10;
                    da2 = bmah.f128446d.mo74144da();
                    if (bjvu.f123443n == null) {
                    }
                    list3 = bjvu.f123442m;
                    if (list3 == null) {
                    }
                    if ((((bmah) da2.f164949b).f128448a & 1) == 0) {
                    }
                    if (!da.f164950c) {
                    }
                    bmaj bmaj622222 = (bmaj) da.f164949b;
                    bmah bmah22222 = (bmah) da2.mo74062i();
                    bmah22222.getClass();
                    bmaj622222.f128465l = bmah22222;
                    bmaj622222.f128454a |= 512;
                    bmaj bmaj722222 = (bmaj) da.mo74062i();
                    Binder.restoreCallingIdentity(j2);
                    return bmaj722222;
                }
                j2 = clearCallingIdentity;
                throw null;
            }
            throw null;
        } catch (Throwable th3) {
            th = th3;
            j2 = clearCallingIdentity;
            Throwable th22 = th;
            Binder.restoreCallingIdentity(j2);
            throw th22;
        }
    }

    /* renamed from: a */
    public static bmik m104712a(CreditCardOcrResult creditCardOcrResult, int i) {
        int i2;
        bxvd da = bmik.f129577j.mo74144da();
        if (creditCardOcrResult == null) {
            i2 = 2;
        } else if (creditCardOcrResult.f81243p == 2) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmik bmik = (bmik) da.f164949b;
        int i3 = i2 - 1;
        bmik.f129580b = i3;
        bmik.f129579a |= 1;
        if (i3 != 1) {
            int a = bmih.m108060a(bkfr.m105604d(creditCardOcrResult.f81244q));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmik bmik2 = (bmik) da.f164949b;
            int i4 = a - 1;
            if (a != 0) {
                bmik2.f129581c = i4;
                bmik2.f129579a |= 2;
            } else {
                throw null;
            }
        } else {
            int a2 = bmih.m108060a(bkfr.m105599c(i));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmik bmik3 = (bmik) da.f164949b;
            int i5 = a2 - 1;
            if (a2 != 0) {
                bmik3.f129581c = i5;
                bmik3.f129579a |= 2;
            } else {
                throw null;
            }
        }
        if (creditCardOcrResult != null) {
            String str = creditCardOcrResult.f81228a;
            if (!TextUtils.isEmpty(str)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmik bmik4 = (bmik) da.f164949b;
                str.getClass();
                bmik4.f129579a |= 4;
                bmik4.f129582d = str;
            }
            if (creditCardOcrResult.mo44703a()) {
                int i6 = creditCardOcrResult.f81229b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmik bmik5 = (bmik) da.f164949b;
                int i7 = bmik5.f129579a | 8;
                bmik5.f129579a = i7;
                bmik5.f129583e = i6;
                int i8 = creditCardOcrResult.f81230c;
                bmik5.f129579a = i7 | 16;
                bmik5.f129584f = i8;
            }
            String str2 = creditCardOcrResult.f81232e;
            if (!TextUtils.isEmpty(str2)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmik bmik6 = (bmik) da.f164949b;
                str2.getClass();
                bmik6.f129579a |= 32;
                bmik6.f129585g = str2;
            }
            String str3 = creditCardOcrResult.f81233f;
            if (!TextUtils.isEmpty(str3)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bmik bmik7 = (bmik) da.f164949b;
                str3.getClass();
                bmik7.f129579a |= 128;
                bmik7.f129587i = str3;
            }
            int i9 = creditCardOcrResult.f81231d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmik bmik8 = (bmik) da.f164949b;
            bmik8.f129579a |= 64;
            bmik8.f129586h = i9;
        }
        return (bmik) da.mo74062i();
    }

    /* renamed from: a */
    public static synchronized ImageLoader m104713a(Context context, int i) {
        ImageLoader imageLoader;
        synchronized (bjvn.class) {
            if (f123391d == null) {
                f123391d = new ImageLoader(bjtx.m104621b(context), new bjvc(context, i));
            }
            imageLoader = f123391d;
        }
        return imageLoader;
    }

    /* renamed from: a */
    public static ArrayList m104714a(Context context) {
        ArrayList arrayList = new ArrayList();
        if (bjyw.m104942c(context)) {
            arrayList.add(blwq.FINGERPRINT);
        }
        if (bjyw.m104943d(context)) {
            arrayList.add(blwq.BIOMETRIC);
        }
        if (bjyw.m104941b(context)) {
            arrayList.add(blwq.PIN_PASSWORD_OR_PATTERN);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m104715a(akoz akoz, bmld bmld, List list) {
        if (bmld == bmld.UI_LAUNCH_WITH_CAMERA && !list.isEmpty()) {
            int size = list.size();
            RecognitionScreen[] recognitionScreenArr = new RecognitionScreen[size];
            for (int i = 0; i < size; i++) {
                akpk a = RecognitionScreen.m67680a();
                int a2 = bwhi.m121963a(((bwhj) list.get(i)).f159516c);
                int i2 = 1;
                if (a2 == 0) {
                    a2 = 1;
                }
                int i3 = a2 - 1;
                if (i3 != 1) {
                    if (i3 == 2) {
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Unrecognized screen type: %s", Integer.valueOf(i3)));
                    }
                }
                a.mo39657a(i2);
                a.mo39661d(((bwhj) list.get(i)).f159514a);
                a.mo39659b(((bwhj) list.get(i)).f159515b);
                a.mo39662e(((bwhj) list.get(i)).f159518e);
                a.mo39658a(((bwhj) list.get(i)).f159519f);
                a.mo39660c(((bwhj) list.get(i)).f159517d);
                recognitionScreenArr[i] = a.mo39656a();
            }
            akoz.mo39627a(recognitionScreenArr);
        }
    }

    /* renamed from: a */
    public static boolean m104717a(bmhu bmhu, bmhu bmhu2) {
        if (bjzb.m104957a(bmhu, bmhu2)) {
            return true;
        }
        if (bmhu == null || bmhu2 == null) {
            return false;
        }
        return bmhu.f129495e.equals(bmhu2.f129495e);
    }

    /* renamed from: a */
    public static boolean m104718a(String str) {
        return str.startsWith("embedded:");
    }

    /* renamed from: a */
    public static boolean m104719a(String str, int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return bjzi.m104994w(str);
        }
        String valueOf = String.valueOf(Integer.toString(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Unexpected checksum type=");
        sb.append(valueOf);
        sb.toString();
        return true;
    }
}
