package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: aczv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aczv {

    /* renamed from: a */
    public static final /* synthetic */ int f61176a = 0;

    /* renamed from: b */
    private static final Intent f61177b = new Intent("com.google.android.gms.auth.account.HANDLE_MANAGED").setPackage("com.google.android.gms");

    /* renamed from: a */
    public static PendingIntent m50059a(Context context, PendingIntent pendingIntent, bngx bngx) {
        return PendingIntent.getActivity(context.getApplicationContext(), 0, new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.common.FilteringRedirectActivity").setData(Uri.parse(String.format("intent://%s/%s", "com.google.android.gms.auth.uiflows.common.FilteringRedirectActivity", UUID.randomUUID()))).putExtra("com.google.android.gms.auth.redirect.INTENT", pendingIntent).putStringArrayListExtra("com.google.android.gms.auth.redirect.whitelist", new ArrayList(bngx)), 0);
    }

    /* renamed from: a */
    public static Intent m50060a(Context context, Account account) {
        return new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.DmSetScreenlockActivity").putExtra("account", account);
    }

    /* renamed from: a */
    public static Intent m50061a(Context context, TokenRequest tokenRequest, TokenResponse tokenResponse) {
        sre.m36088h(context);
        sre.m36089i(context);
        String string = tokenRequest.mo7640b().getString("KEY_DEVICE_NAME");
        gic a = gic.m13182a(tokenRequest.mo7640b());
        boolean z = !a.mo11905d();
        String c = a.mo11904c();
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.consent.GrantCredentialsWithAclActivity");
        className.putExtra("callingPkg", tokenRequest.f10714j.f10841e);
        className.putExtra("callingUid", tokenRequest.f10714j.f10838b);
        className.putExtra("service", tokenRequest.f10706b);
        className.putExtra("acctName", tokenRequest.mo7637a().name);
        className.putParcelableArrayListExtra("scopeData", bnkn.m109664a(bnfi.m109235a(tokenResponse.mo7648c()).mo67501a(aczu.f61175a).iterator()));
        className.putExtra("GrantCredentialsWithAclChimeraActivity.hasTitle", tokenResponse.f10741r);
        className.putExtra("GrantCredentialsWithAclChimeraActivity.title", tokenResponse.f10742s);
        className.putExtra("GrantCredentialsWithAclChimeraActivity.consentCookieWrapper", tokenResponse.f10748y);
        if (string != null) {
            className.putExtra("KEY_DEVICE_NAME", string);
        }
        className.putExtra("GrantCredentialsWithAclChimeraActivity.isRemoteApp", z);
        className.putExtra("GrantCredentialsWithAclChimeraActivity.remoteAppLabel", c);
        return className;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public static bmxv m50062a(Context context, Account account, Bundle bundle) {
        bmxy.m108582a(context, "Context cannot be null");
        bmxy.m108582a(account, "Account cannot be null");
        bmxy.m108582a(bundle, "Options cannot be null");
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(f61177b, 128)) {
            if (resolveInfo.activityInfo != null && resolveInfo.activityInfo.metaData != null && "all".equals(resolveInfo.activityInfo.metaData.getString("handle.managed.account.category"))) {
                Intent component = new Intent().setComponent(new ComponentName("com.google.android.gms", resolveInfo.activityInfo.name));
                component.putExtra("account", account).putExtra("is_setup_wizard", false).putExtra("ui_parameters", Bundle.EMPTY).putExtra("suppress_account_provisioning", false).putExtra("is_user_owner", true).putExtra("dm_status", "dmStatus").putExtra("flow", 1).putExtra("options", bundle);
                return bmxv.m108566b(component);
            }
        }
        return bmvz.f131120a;
    }
}
