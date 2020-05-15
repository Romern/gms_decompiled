package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.AccountAuthenticatorResponse;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.chimera.Activity;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountIntroChimeraActivity extends Activity {

    /* renamed from: a */
    private static final sek f11298a = ght.m13171a("AccountIntroActivity");

    /* renamed from: a */
    public static Intent m6908a(Context context, AccountAuthenticatorResponse accountAuthenticatorResponse, String str, boolean z, boolean z2, rrq rrq, boolean z3, String str2, String str3, String str4, String[] strArr, PendingIntent pendingIntent, String str5, String str6, boolean z4, boolean z5, boolean z6, boolean z7, ManagedAuthOptions managedAuthOptions, D2dOptions d2dOptions) {
        byte[] bArr;
        Intent putExtra = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.addaccount.AccountIntroActivity").putExtra("am_response", accountAuthenticatorResponse).putExtra("account_type", str).putExtra("firstRun", z).putExtra(jwz.f23429j.f21366a, z2).putExtra(jwz.f23428i.f21366a, rrq.mo25045a()).putExtra("suppress_device_to_device_setup", z3).putExtra("allowed_domains", strArr).putExtra("caller_identity", pendingIntent).putExtra("account_name", str2).putExtra("package_name", str5).putExtra("minute_maid_login_template", str6).putExtra("is_resolve_frp_only", z4).putExtra("suppress_google_services", z5).putExtra("suppress_account_provisioning", z6).putExtra("suppress_backup_opt_in", z7);
        byte[] bArr2 = null;
        if (managedAuthOptions != null) {
            bArr = sef.m35074a(managedAuthOptions);
        } else {
            bArr = null;
        }
        Intent putExtra2 = putExtra.putExtra("managed_auth_options", bArr);
        if (cbzz.m129005b()) {
            if (d2dOptions != null) {
                bArr2 = sef.m35074a(d2dOptions);
            }
            putExtra2.putExtra("d2d_options", bArr2);
        }
        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            putExtra2.putExtra("purchaser_gaia_email", str3).putExtra("purchaser_name", str4);
        }
        return putExtra2;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        ManagedAuthOptions managedAuthOptions;
        D2dOptions d2dOptions;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("account_type");
        boolean booleanExtra = intent.getBooleanExtra("firstRun", false);
        if (stringExtra == null) {
            if (!booleanExtra) {
                f11298a.mo25420f("No account type passed in!", new Object[0]);
            }
            stringExtra = "com.google";
        }
        int i = Build.VERSION.SDK_INT;
        String stringExtra2 = intent.getStringExtra("package_name");
        if (stringExtra2 == null) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("caller_identity");
            if (pendingIntent != null) {
                int i2 = Build.VERSION.SDK_INT;
                stringExtra2 = pendingIntent.getCreatorPackage();
            } else {
                stringExtra2 = null;
            }
        }
        rrq a = rrq.m34308a(intent.getBundleExtra(jwz.f23428i.f21366a));
        if (a.f43552a == null) {
            a.f43552a = "material_light";
        }
        AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) intent.getParcelableExtra("am_response");
        boolean booleanExtra2 = intent.getBooleanExtra(jwz.f23429j.f21366a, false);
        boolean booleanExtra3 = intent.getBooleanExtra("suppress_device_to_device_setup", false);
        String stringExtra3 = intent.getStringExtra("account_name");
        String stringExtra4 = intent.getStringExtra("purchaser_gaia_email");
        String stringExtra5 = intent.getStringExtra("purchaser_name");
        String[] stringArrayExtra = intent.getStringArrayExtra("allowed_domains");
        String stringExtra6 = intent.getStringExtra("minute_maid_login_template");
        boolean booleanExtra4 = intent.getBooleanExtra("is_resolve_frp_only", false);
        boolean booleanExtra5 = intent.getBooleanExtra("suppress_google_services", false);
        boolean booleanExtra6 = intent.getBooleanExtra("suppress_account_provisioning", false);
        boolean booleanExtra7 = intent.getBooleanExtra("suppress_backup_opt_in", false);
        ManagedAuthOptions a2 = ManagedAuthOptions.m6596a(intent.getByteArrayExtra("managed_auth_options"));
        if (cbzz.m129005b()) {
            managedAuthOptions = a2;
            d2dOptions = D2dOptions.m6592a(intent.getByteArrayExtra("d2d_options"));
        } else {
            managedAuthOptions = a2;
            d2dOptions = null;
        }
        jva a3 = AddAccountController.m6918a();
        a3.f23288a = new imw(rpr.m34216b());
        a3.f23289b = new jvl(rpr.m34216b());
        a3.f23290c = accountAuthenticatorResponse;
        a3.f23291d = stringExtra;
        a3.f23292e = booleanExtra;
        a3.f23293f = booleanExtra2;
        a3.f23294g = a;
        a3.f23295h = booleanExtra3;
        a3.f23296i = stringExtra3;
        a3.f23297j = stringExtra4;
        a3.f23298k = stringExtra5;
        a3.f23299l = stringArrayExtra;
        a3.f23300m = stringExtra2;
        a3.f23301n = stringExtra6;
        a3.f23302o = Process.myUserHandle().isOwner();
        a3.f23303p = true;
        a3.f23304q = null;
        a3.f23305r = null;
        a3.f23306s = false;
        a3.f23307t = null;
        a3.f23308u = null;
        a3.f23309v = false;
        a3.f23310w = false;
        a3.f23311x = false;
        a3.f23312y = null;
        a3.f23313z = false;
        a3.f23281A = booleanExtra4;
        a3.f23282B = booleanExtra5;
        a3.f23283C = booleanExtra6;
        a3.f23284D = booleanExtra7;
        a3.f23285E = managedAuthOptions;
        a3.f23286F = d2dOptions;
        AddAccountController a4 = a3.mo14142a();
        jxw a5 = a4.mo7862a((jxy) null);
        Intent intent2 = a5.f23487b;
        bizc.m103024a(getIntent(), intent2);
        jxx.m17489a(intent2, a4, a5.f23486a);
        startActivity(intent2.addFlags(33554432));
        finish();
    }
}
