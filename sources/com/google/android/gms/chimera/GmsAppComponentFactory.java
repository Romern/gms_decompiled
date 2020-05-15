package com.google.android.gms.chimera;

import android.app.AppComponentFactory;
import android.content.ContentProvider;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsAppComponentFactory extends AppComponentFactory {

    /* renamed from: a */
    static List f29954a = null;

    /* renamed from: a */
    private static dng m22383a(Context context, String str) {
        try {
            brtm f = dfy.m8329a(context).mo8898f().mo9181f();
            return f.mo69926e(dmv.m8834a(f.mo69896E(), str));
        } catch (IndexOutOfBoundsException e) {
            dfq.m8314a();
            if (cdjl.f180997a.mo6606a().mo77692F()) {
                String valueOf = String.valueOf(str);
                throw new InvalidConfigException(valueOf.length() == 0 ? new String("IndexOutOfBounds trying to retrieve ") : "IndexOutOfBounds trying to retrieve ".concat(valueOf), e);
            }
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0092, code lost:
        if (r3 != false) goto L_0x0098;
     */
    public final ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        boolean z;
        dng dng;
        if (rpr.m34215a()) {
            rpr b = rpr.m34216b();
            qlc qlc = null;
            if (b == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 60);
                sb.append("Cannot Instantiate ");
                sb.append(str);
                sb.append(": GmsApplicationContext is not available.");
                Log.e("GmsAppComponentFactory", sb.toString());
            } else {
                if (cdjl.f180997a.mo6606a().mo77716v()) {
                    List list = f29954a;
                    if (list == null) {
                        SystemClock.uptimeMillis();
                        bngs bngs = new bngs();
                        try {
                            PackageInfo packageInfo = b.getPackageManager().getPackageInfo(b.getPackageName(), 648);
                            if (packageInfo.providers != null) {
                                ProviderInfo[] providerInfoArr = packageInfo.providers;
                                for (ProviderInfo providerInfo : providerInfoArr) {
                                    Bundle bundle = providerInfo.metaData;
                                    if (bundle != null) {
                                        if (bundle.getBoolean("chimera.sliceProviderProxy", false)) {
                                            bngs.mo67668c(providerInfo.name);
                                        }
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.e("GmsAppComponentFactory", "Cannot get package info", e);
                        }
                        list = bngs.mo67664a();
                        f29954a = list;
                        SystemClock.uptimeMillis();
                    }
                    z = list.contains(str);
                } else {
                    z = false;
                }
                try {
                    dng = m22383a(b, str);
                } catch (InvalidConfigException e2) {
                    qmc.m32424a(true);
                    try {
                        dng = m22383a(b, str);
                    } catch (InvalidConfigException e3) {
                        String valueOf = String.valueOf(e3);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 49 + String.valueOf(valueOf).length());
                        sb2.append("Cannot instantiate ");
                        sb2.append(str);
                        sb2.append(" from invalid Chimera config: ");
                        sb2.append(valueOf);
                        Log.e("GmsAppComponentFactory", sb2.toString());
                        dng = null;
                    }
                }
                if (dng != null) {
                    int e4 = dng.mo9303e();
                    if (e4 <= 0) {
                        qlc = new qlc(str);
                    } else {
                        String[] strArr = new String[e4];
                        for (int i = 0; i < e4; i++) {
                            strArr[i] = dng.mo9302a(i);
                        }
                        qlc = new qlc(str, strArr);
                    }
                } else if (z) {
                    qlc = new qlc(str);
                }
            }
            if (qlc != null) {
                return qlc;
            }
        }
        return super.instantiateProvider(classLoader, str);
    }
}
