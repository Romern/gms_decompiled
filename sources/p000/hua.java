package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: hua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hua {

    /* renamed from: a */
    public static final sbw f20429a = new sbw("AuthEarlyUpdate");

    /* renamed from: b */
    public final rjx f20430b;

    /* renamed from: c */
    private final qws f20431c;

    /* renamed from: d */
    private final int f20432d;

    public hua(Context context) {
        int type;
        Context applicationContext = context.getApplicationContext();
        this.f20431c = new qws(applicationContext, "ANDROID_AUTH", null);
        this.f20430b = new rjx(applicationContext, qws.f42331a, (rjk) null, rjw.f43159a);
        TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) applicationContext.getSystemService("connectivity")).getActiveNetworkInfo();
        int i = -10000;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || (type = activeNetworkInfo.getType()) == 0) {
            int networkType = telephonyManager.getNetworkType();
            if (networkType != 0 || (activeNetworkInfo != null && activeNetworkInfo.isConnected())) {
                i = networkType;
            }
        } else if (type >= 0) {
            i = -type;
        }
        this.f20432d = i;
    }

    /* renamed from: a */
    public final boed mo12716a(int i, int i2, bxvd bxvd, Context context) {
        ModuleManager moduleManager = ModuleManager.get(context);
        bxvd da = boed.f132781i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boed boed = (boed) da.f164949b;
        boed.f132784b = i - 1;
        boed.f132783a |= 1;
        ModuleManager.ModuleInfo a = huc.m14858a(moduleManager);
        if (a != null) {
            int i3 = a.moduleVersion;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boed boed2 = (boed) da.f164949b;
            int i4 = boed2.f132783a | 4;
            boed2.f132783a = i4;
            boed2.f132786d = i3;
            ModuleManager.ModuleApkInfo moduleApkInfo = a.moduleApk;
            if (moduleApkInfo != null) {
                int i5 = moduleApkInfo.apkVersionCode;
                int i6 = i4 | 16;
                boed2.f132783a = i6;
                boed2.f132788f = i5;
                boolean z = moduleApkInfo.apkRequired;
                boed2.f132783a = i6 | 64;
                boed2.f132790h = z;
            }
        }
        int a2 = huc.m14857a(context);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boed boed3 = (boed) da.f164949b;
        boed3.f132783a |= 32;
        boed3.f132789g = a2;
        String a3 = huc.m14859a(context, i2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boed boed4 = (boed) da.f164949b;
        a3.getClass();
        boed4.f132783a |= 2;
        boed4.f132785c = a3;
        if (bxvd != null) {
            int i7 = this.f20432d;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            boei boei = (boei) bxvd.f164949b;
            boei boei2 = boei.f132795k;
            boei.f132797a |= 4;
            boei.f132800d = i7;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boed boed5 = (boed) da.f164949b;
            boei boei3 = (boei) bxvd.mo74062i();
            boei3.getClass();
            boed5.f132787e = boei3;
            boed5.f132783a |= 8;
        }
        return (boed) da.mo74062i();
    }

    /* renamed from: a */
    public final rke mo12717a(boed boed) {
        bxvd da = boct.f132600I.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        boct boct = (boct) da.f164949b;
        boct.f132612c = 39;
        boct.f132610a |= 1;
        boed.getClass();
        boct.f132602A = boed;
        boct.f132611b |= 32;
        return this.f20431c.mo24333a((boct) da.mo74062i()).mo24327b();
    }
}
