package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.telecom.TelecomManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqfg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqfg {

    /* renamed from: b */
    private static final String f85957b = new BigInteger(130, new SecureRandom()).toString(16);

    /* renamed from: a */
    public final Context f85958a;

    /* renamed from: c */
    private final PackageManager f85959c;

    static {
        aqfg.class.getSimpleName();
    }

    public aqfg(Context context) {
        this.f85958a = context;
        this.f85959c = context.getPackageManager();
    }

    /* renamed from: a */
    private final PackageInfo m71479a(Intent intent) {
        ResolveInfo resolveActivity = this.f85959c.resolveActivity(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE);
        if (!(resolveActivity == null || resolveActivity.activityInfo == null)) {
            try {
                return this.f85959c.getPackageInfo(resolveActivity.activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final PackageInfo mo47820b() {
        String str = f85957b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append("file://");
        sb.append(str);
        sb.append(".apk");
        Uri parse = Uri.parse(sb.toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(parse, "application/vnd.android.package-archive");
        return m71479a(intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo47821c() {
        int i = Build.VERSION.SDK_INT;
        TelecomManager telecomManager = (TelecomManager) this.f85958a.getSystemService("telecom");
        if (telecomManager != null) {
            return telecomManager.getDefaultDialerPackage();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final List mo47822d() {
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.intent.action.PACKAGE_NEEDS_VERIFICATION");
        intent.setType("application/vnd.android.package-archive");
        List<ResolveInfo> queryBroadcastReceivers = this.f85959c.queryBroadcastReceivers(intent, 512);
        if (queryBroadcastReceivers != null) {
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                if (resolveInfo.activityInfo != null) {
                    String str = resolveInfo.activityInfo.packageName;
                    if (this.f85959c.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str) == 0) {
                        try {
                            arrayList.add(this.f85959c.getPackageInfo(str, 0));
                        } catch (PackageManager.NameNotFoundException e) {
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final PackageInfo mo47819a() {
        String str = f85957b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append("http://");
        sb.append(str);
        sb.append(".com");
        return m71479a(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
    }
}
