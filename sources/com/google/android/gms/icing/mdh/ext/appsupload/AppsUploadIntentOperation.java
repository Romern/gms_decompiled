package com.google.android.gms.icing.mdh.ext.appsupload;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AppsUploadIntentOperation extends IntentOperation {

    /* renamed from: a */
    private acew f79067a;

    public final void onCreate() {
        if (((Boolean) acaw.f59402v.mo58455c()).booleanValue()) {
            this.f79067a = acbt.m48836a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006b, code lost:
        if (((java.lang.Boolean) r1.mo32596a()).booleanValue() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009a, code lost:
        if (((java.lang.Boolean) r14.f79067a.mo32638d().mo32596a()).booleanValue() != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b4, code lost:
        if (((java.lang.Boolean) r15.mo32596a()).booleanValue() == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0051, code lost:
        if (((java.lang.Boolean) r14.f79067a.mo32638d().mo32596a()).booleanValue() != false) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x012f  */
    public final void onHandleIntent(Intent intent) {
        ayuj ayuj;
        if (this.f79067a != null) {
            Log.i("AppsUpload", String.format("Received intent with action %s", intent.getAction()));
            String action = intent.getAction();
            boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                ayuj ayuj2 = acez.f59700a;
                cazf.m127593a(ayuj2, "Cannot return null from a non-@Nullable @Provides method");
                if (((Boolean) ayuj2.mo32596a()).booleanValue()) {
                    if (booleanExtra) {
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("skip_upload_for_unchanged", cenv.f183121a.mo6606a().mo79470d());
                    ayuj = acfe.f59705a;
                    cazf.m127593a(ayuj, "Cannot return null from a non-@Nullable @Provides method");
                    if (((Boolean) ayuj.mo32596a()).booleanValue()) {
                        bamc e = this.f79067a.mo32639e();
                        ayuj ayuj3 = acff.f59706a;
                        cazf.m127593a(ayuj3, "Cannot return null from a non-@Nullable @Provides method");
                        long longValue = ((Long) ayuj3.mo32596a()).longValue();
                        ayuj ayuj4 = acfg.f59707a;
                        cazf.m127593a(ayuj4, "Cannot return null from a non-@Nullable @Provides method");
                        long longValue2 = ((Long) ayuj4.mo32596a()).longValue();
                        ayuj ayuj5 = acfd.f59704a;
                        cazf.m127593a(ayuj5, "Cannot return null from a non-@Nullable @Provides method");
                        e.mo32790a(true, longValue, longValue2, 3, ((Boolean) ayuj5.mo32596a()).booleanValue(), false, bundle);
                        return;
                    }
                    this.f79067a.mo32639e().mo32789a(false, 3, false, bundle);
                    return;
                }
            }
            if ("android.intent.action.PACKAGE_CHANGED".equals(action)) {
                ayuj ayuj6 = acfa.f59701a;
                cazf.m127593a(ayuj6, "Cannot return null from a non-@Nullable @Provides method");
            }
            if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                ayuj ayuj7 = acfb.f59702a;
                cazf.m127593a(ayuj7, "Cannot return null from a non-@Nullable @Provides method");
                if (((Boolean) ayuj7.mo32596a()).booleanValue()) {
                    if (booleanExtra) {
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("skip_upload_for_unchanged", cenv.f183121a.mo6606a().mo79470d());
                    ayuj = acfe.f59705a;
                    cazf.m127593a(ayuj, "Cannot return null from a non-@Nullable @Provides method");
                    if (((Boolean) ayuj.mo32596a()).booleanValue()) {
                    }
                }
            }
            if ("android.intent.action.PACKAGE_REPLACED".equals(action)) {
                ayuj ayuj8 = acfc.f59703a;
                cazf.m127593a(ayuj8, "Cannot return null from a non-@Nullable @Provides method");
            }
            if ("android.intent.action.LOCALE_CHANGED".equals(action)) {
                ayuj ayuj9 = acey.f59699a;
                cazf.m127593a(ayuj9, "Cannot return null from a non-@Nullable @Provides method");
                if (!((Boolean) ayuj9.mo32596a()).booleanValue()) {
                    return;
                }
                Bundle bundle22 = new Bundle();
                bundle22.putBoolean("skip_upload_for_unchanged", cenv.f183121a.mo6606a().mo79470d());
                ayuj = acfe.f59705a;
                cazf.m127593a(ayuj, "Cannot return null from a non-@Nullable @Provides method");
                if (((Boolean) ayuj.mo32596a()).booleanValue()) {
                }
            }
        }
    }
}
