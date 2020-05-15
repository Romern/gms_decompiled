package p000;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: adhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adhl implements adhk {

    /* renamed from: a */
    public final adik f61714a;

    /* renamed from: b */
    public final adil f61715b;

    public adhl(adik adik, adil adil, Context context) {
        this.f61714a = adik;
        this.f61715b = adil;
        spx.m35925a(context);
        context.getPackageManager();
    }

    /* renamed from: a */
    public final PackageInfo mo33520a(String str, int i) {
        Signature[] signatureArr;
        ServiceInfo[] serviceInfoArr;
        ActivityInfo[] activityInfoArr;
        String str2;
        FeatureInfo[] featureInfoArr;
        adhd b = this.f61714a.mo33533b(str);
        ProviderInfo[] providerInfoArr = null;
        if (b == null || b.f61669d == null) {
            return null;
        }
        adik adik = this.f61714a;
        adik.mo33534b();
        byte[] a = adik.f61808c.mo33514a(adik.mo33541i(str));
        if (a != null) {
            adii adii = (adii) bxvk.m124016a(adii.f61801b, a, bxus.m123743b());
            signatureArr = new Signature[adii.f61803a.size()];
            for (int i2 = 0; i2 < adii.f61803a.size(); i2++) {
                signatureArr[i2] = new Signature(((bxtx) adii.f61803a.get(i2)).mo73780k());
            }
        } else {
            signatureArr = null;
        }
        Integer a2 = this.f61715b.mo33546a(str);
        if (b.f61669d == null) {
            return null;
        }
        ApplicationInfo a3 = adlc.m50786a(str, i, b, a2);
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.applicationInfo = a3;
        packageInfo.packageName = str;
        packageInfo.versionCode = b.f61673h;
        if (!b.f61674i.isEmpty()) {
            packageInfo.versionName = b.f61674i;
        }
        if ((i & 4096) != 0) {
            packageInfo.requestedPermissions = adlc.m50788b(b.f61666a);
        }
        if ((i & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
            bxwc bxwc = b.f61667b;
            if (!bxwc.isEmpty()) {
                featureInfoArr = new FeatureInfo[bxwc.size()];
                for (int i3 = 0; i3 < bxwc.size(); i3++) {
                    adhh adhh = (adhh) bxwc.get(i3);
                    FeatureInfo featureInfo = new FeatureInfo();
                    featureInfo.name = adhh.f61703a;
                    featureInfo.reqGlEsVersion = adhh.f61705c;
                    int i4 = adhh.f61704b;
                    char c = 2;
                    if (i4 != 0) {
                        c = i4 != 1 ? i4 != 2 ? (char) 0 : 4 : 3;
                    }
                    if (c != 0 && c == 3) {
                        featureInfo.flags = 1;
                    } else {
                        featureInfo.flags = 0;
                    }
                    featureInfoArr[i3] = featureInfo;
                }
            } else {
                featureInfoArr = null;
            }
            packageInfo.reqFeatures = featureInfoArr;
        }
        if ((i & 64) != 0) {
            packageInfo.signatures = signatureArr;
        }
        if (a3 != null) {
            if ((i & 1) != 0) {
                bxwc bxwc2 = b.f61670e;
                if (!bxwc2.isEmpty()) {
                    activityInfoArr = new ActivityInfo[bxwc2.size()];
                    for (int i5 = 0; i5 < bxwc2.size(); i5++) {
                        adhb adhb = (adhb) bxwc2.get(i5);
                        ActivityInfo activityInfo = new ActivityInfo();
                        activityInfo.applicationInfo = a3;
                        activityInfo.packageName = a3.packageName;
                        activityInfo.name = adhb.f61646a;
                        if (!adhb.f61647b.isEmpty()) {
                            activityInfo.targetActivity = adhb.f61647b;
                        }
                        activityInfo.theme = adhb.f61648c;
                        activityInfo.configChanges = adhb.f61652g;
                        if (!adhb.f61653h.isEmpty()) {
                            str2 = adhb.f61653h;
                        } else {
                            str2 = null;
                        }
                        activityInfo.parentActivityName = str2;
                        bxvl bxvl = adhb.f61654i;
                        if (bxvl != null) {
                            activityInfo.screenOrientation = bxvl.f164964a;
                        }
                        if ((i & 128) != 0) {
                            activityInfo.metaData = adlc.m50787a(adhb.f61649d);
                        }
                        activityInfo.labelRes = adhb.f61650e;
                        if (!adhb.f61651f.isEmpty()) {
                            activityInfo.nonLocalizedLabel = adhb.f61651f;
                        }
                        activityInfo.enabled = true;
                        activityInfoArr[i5] = activityInfo;
                    }
                } else {
                    activityInfoArr = null;
                }
                packageInfo.activities = activityInfoArr;
            }
            if ((i & 4) != 0) {
                bxwc bxwc3 = b.f61671f;
                if (!bxwc3.isEmpty()) {
                    serviceInfoArr = new ServiceInfo[bxwc3.size()];
                    for (int i6 = 0; i6 < bxwc3.size(); i6++) {
                        adhg adhg = (adhg) bxwc3.get(i6);
                        ServiceInfo serviceInfo = new ServiceInfo();
                        serviceInfo.applicationInfo = a3;
                        serviceInfo.packageName = a3.packageName;
                        serviceInfo.name = adhg.f61699e;
                        serviceInfo.icon = adhg.f61696b;
                        if ((i & 128) != 0) {
                            serviceInfo.metaData = adlc.m50787a(adhg.f61700f);
                        }
                        serviceInfo.labelRes = adhg.f61697c;
                        if (!adhg.f61698d.isEmpty()) {
                            serviceInfo.nonLocalizedLabel = adhg.f61698d;
                        }
                        serviceInfo.enabled = !adhg.f61695a;
                        serviceInfoArr[i6] = serviceInfo;
                    }
                } else {
                    serviceInfoArr = null;
                }
                packageInfo.services = serviceInfoArr;
            }
            if ((i & 8) != 0) {
                bxwc bxwc4 = b.f61672g;
                if (!bxwc4.isEmpty()) {
                    providerInfoArr = new ProviderInfo[bxwc4.size()];
                    for (int i7 = 0; i7 < bxwc4.size(); i7++) {
                        adhe adhe = (adhe) bxwc4.get(i7);
                        ProviderInfo providerInfo = new ProviderInfo();
                        providerInfo.applicationInfo = a3;
                        providerInfo.packageName = a3.packageName;
                        providerInfo.name = adhe.f61681e;
                        providerInfo.icon = adhe.f61678b;
                        if ((i & 128) != 0) {
                            providerInfo.metaData = adlc.m50787a(adhe.f61683g);
                        }
                        providerInfo.labelRes = adhe.f61679c;
                        if (!adhe.f61680d.isEmpty()) {
                            providerInfo.nonLocalizedLabel = adhe.f61680d;
                        }
                        providerInfo.enabled = !adhe.f61677a;
                        providerInfo.authority = adhe.f61682f;
                        providerInfo.initOrder = adhe.f61684h;
                        providerInfo.grantUriPermissions = true;
                        providerInfoArr[i7] = providerInfo;
                    }
                }
                packageInfo.providers = providerInfoArr;
            }
        }
        return packageInfo;
    }
}
