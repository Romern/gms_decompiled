package p000;

import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.firstparty.dataservice.DeviceManagementInfoResponse;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.common.Feature;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: arlt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arlt {

    /* renamed from: a */
    private static final asco f87862a = ascp.m73787a("ManagedAccountHelper");

    /* renamed from: b */
    private final Context f87863b;

    /* renamed from: c */
    private final iws f87864c;

    /* renamed from: d */
    private final gob f87865d;

    /* renamed from: e */
    private final DevicePolicyManager f87866e;

    public arlt(Context context) {
        ixl ixl = new ixl(context.getApplicationContext());
        gob a = goc.m13598a(context.getApplicationContext());
        this.f87863b = context.getApplicationContext();
        this.f87864c = ixl;
        this.f87866e = (DevicePolicyManager) context.getApplicationContext().getSystemService("device_policy");
        this.f87865d = a;
    }

    /* renamed from: a */
    public final Intent mo48617a(Account account, Bundle bundle, ManagedAuthOptions managedAuthOptions) {
        Bundle a = managedAuthOptions.mo7693a();
        if (managedAuthOptions.f10874b == 1) {
            a.putBoolean("smartdevice.do_active", true);
        }
        Intent a2 = rrk.m34291a(this.f87863b, account, true, false, bundle, false, "com.google.android.gms", spn.m35887f(), null, rrk.m34297b(this.f87863b, account), 2, a);
        if (a2 == null) {
            f87862a.mo25416d("Failed to resolve device management intent", new Object[0]);
        }
        return a2;
    }

    /* renamed from: a */
    public final boolean mo48618a() {
        int i = Build.VERSION.SDK_INT;
        DevicePolicyManager devicePolicyManager = this.f87866e;
        return (devicePolicyManager == null || devicePolicyManager.getDeviceOwner() == null) ? false : true;
    }

    /* renamed from: a */
    public final boolean mo48619a(Account account) {
        DeviceManagementInfoResponse deviceManagementInfoResponse;
        if (cgpa.f187426a.mo6606a().mo84221o()) {
            f87862a.mo25412b("Use AccountDataServiceClient.", new Object[0]);
            gob gob = this.f87865d;
            roz b = rpa.m34196b();
            b.f43473b = new Feature[]{ghy.f18275a};
            b.f43472a = new gpl(account);
            aucb b2 = ((rjx) gob).mo24732b(b.mo24977a());
            try {
                deviceManagementInfoResponse = (DeviceManagementInfoResponse) aucu.m76783a(b2, cgpa.f187426a.mo6606a().mo84219m(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                Exception e2 = b2.mo50387e();
                if (e2 instanceof rjp) {
                    asco asco = f87862a;
                    int a = ((rjp) e2).mo24655a();
                    StringBuilder sb = new StringBuilder(43);
                    sb.append("getDeviceManagementInfo status: ");
                    sb.append(a);
                    asco.mo25416d(sb.toString(), new Object[0]);
                }
                f87862a.mo25410a(e);
                deviceManagementInfoResponse = null;
            }
        } else {
            deviceManagementInfoResponse = (DeviceManagementInfoResponse) ((ixl) this.f87864c).mo13426a(new ixf(account));
        }
        boolean z = deviceManagementInfoResponse != null && !TextUtils.isEmpty(deviceManagementInfoResponse.f10624b);
        f87862a.mo25409a("isManagedAccount(%s) = %s", account, Boolean.valueOf(z));
        return z;
    }
}
