package p000;

import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import java.util.List;

/* renamed from: rrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rrk {

    /* renamed from: a */
    static final Intent f43548a;

    /* renamed from: b */
    private static final sek f43549b = ght.m13171a("CommonAuth", "ManagedAccountUtil");

    static {
        Intent intent = new Intent("com.google.android.gms.auth.account.HANDLE_MANAGED");
        f43548a = intent;
        intent.setPackage("com.google.android.gms");
    }

    /* renamed from: a */
    public static Intent m34290a(Context context, Account account) {
        sdo.m34966a(context, "Context cannot be null");
        sdo.m34966a(account, "Account cannot be null");
        Intent a = m34292a(context, "com.google.android.gms.auth.removeaccount.DM_PRE_REMOVE_ACCOUNT");
        if (a != null) {
            a.putExtra("account", account);
        }
        return a;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m34297b(Context context, Account account) {
        return soz.m35808f(context, account.name);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bc  */
    /* renamed from: a */
    public static Intent m34291a(Context context, Account account, boolean z, boolean z2, Bundle bundle, boolean z3, String str, boolean z4, String str2, boolean z5, int i, Bundle bundle2) {
        String str3;
        boolean z6 = z;
        boolean z7 = z2;
        Bundle bundle3 = bundle;
        boolean z8 = z5;
        Bundle bundle4 = bundle2;
        sdo.m34966a(context, "Context cannot be null");
        sdo.m34966a(account, "Account cannot be null");
        sdo.m34966a(bundle3, "UiParameters cannot be null");
        sdo.m34966a(bundle4, "Options cannot be null");
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(f43548a, 128);
        if (z8) {
            if (cbxv.f178529a.mo6606a().mo75594h()) {
                long i2 = cbxv.f178529a.mo6606a().mo75595i();
                if (i2 > 0) {
                    try {
                        long a = C1147kv.m18618a(context.getPackageManager().getPackageInfo("com.android.vending", 0));
                        if (a < i2) {
                            f43549b.mo25414c("Kids MDM flow:PlayStore:%s < %s", Long.valueOf(a), Long.valueOf(i2));
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        f43549b.mo25414c("Kids MDM flow:missing PlayStore", new Object[0]);
                    }
                }
                if (z6 && !cbxv.f178529a.mo6606a().mo75593g()) {
                    f43549b.mo25414c("Kids MDM flow:during SUW", new Object[0]);
                } else {
                    f43549b.mo25414c("Kids MDM flow:false", new Object[0]);
                    str3 = "kids";
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        if (resolveInfo.activityInfo != null) {
                            if (resolveInfo.activityInfo.metaData != null) {
                                if (str3.equals(resolveInfo.activityInfo.metaData.getString("handle.managed.account.category"))) {
                                    Intent intent = new Intent();
                                    intent.setComponent(new ComponentName("com.google.android.gms", resolveInfo.activityInfo.name));
                                    intent.putExtra("account", account).putExtra("is_setup_wizard", z6).putExtra("use_immersive_mode", z7).putExtra("ui_parameters", bundle3).putExtra("suppress_account_provisioning", z3).putExtra("calling_package", str).putExtra("is_user_owner", z4).putExtra("dm_status", str2).putExtra("is_unicorn_account", z8).putExtra("flow", i).putExtra("options", bundle4);
                                    intent.putExtra("theme", bundle3.getString("theme")).putExtra("useImmersiveMode", z7);
                                    return intent;
                                }
                            }
                        }
                    }
                    return null;
                }
            } else {
                f43549b.mo25414c("Kids MDM flow:true", new Object[0]);
            }
        }
        str3 = "all";
        while (r7.hasNext()) {
        }
        return null;
    }

    /* renamed from: a */
    private static Intent m34292a(Context context, String str) {
        int i = Build.VERSION.SDK_INT;
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) context.getSystemService("device_policy");
        ComponentName profileOwner = devicePolicyManager.getProfileOwner() != null ? devicePolicyManager.getProfileOwner() : null;
        if (profileOwner == null) {
            int i2 = Build.VERSION.SDK_INT;
            profileOwner = devicePolicyManager.getDeviceOwnerComponentOnAnyUser();
        }
        if (profileOwner != null) {
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
            if (queryIntentActivities.isEmpty()) {
                f43549b.mo25414c("No activities matched action %s", str);
                return null;
            }
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (!(resolveInfo.activityInfo == null || resolveInfo.activityInfo.metaData == null)) {
                    if (profileOwner.flattenToString().equals(resolveInfo.activityInfo.metaData.getString("dm_component"))) {
                        intent.setComponent(new ComponentName("com.google.android.gms", resolveInfo.activityInfo.name));
                        return intent;
                    }
                }
            }
            f43549b.mo25416d("No activities matched metadata %s for DO/PO %s", "dm_component", profileOwner.flattenToString());
            return null;
        }
        f43549b.mo25414c("No DO or PO.", new Object[0]);
        return null;
    }

    /* renamed from: a */
    public static Intent m34293a(Context context, boolean z, boolean z2, Bundle bundle, Bundle bundle2) {
        sdo.m34966a(context, "Context cannot be null");
        sdo.m34966a(bundle, "UiParameters cannot be null");
        Intent a = m34292a(context, "com.google.android.gms.auth.addaccount.DM_PRE_ADD_ACCOUNT");
        if (a != null) {
            a.putExtra("is_setup_wizard", z2).putExtra("use_immersive_mode", z).putExtra("ui_parameters", bundle).putExtra("options", bundle2);
        }
        return a;
    }

    /* renamed from: a */
    public static boolean m34294a(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0) != 0;
    }

    /* renamed from: a */
    public static boolean m34295a(Intent intent) {
        return intent != null && intent.getBooleanExtra("is_unicorn_account", false);
    }

    /* renamed from: a */
    public static boolean m34296a(String str) {
        return str != null && !izj.DM_SCREENLOCK_REQUIRED.mo13527b(str);
    }
}
