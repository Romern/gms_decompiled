package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import com.google.android.gms.plus.service.DefaultChimeraIntentService;
import com.google.android.gms.plus.service.PlusChimeraService;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aoax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aoax extends rzu {

    /* renamed from: a */
    final /* synthetic */ PlusChimeraService f78056a;

    /* renamed from: b */
    private final String f78057b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aoax(PlusChimeraService plusChimeraService, String str, Context context) {
        super(context, 2, 70);
        this.f78056a = plusChimeraService;
        this.f78057b = str;
    }

    /* renamed from: a */
    private final void m65717a(sck sck, ClientContext clientContext, ClientContext clientContext2) {
        try {
            sck.mo16678a(0, PlusChimeraService.m68556a(this.f78057b, this.f78056a, clientContext2, clientContext, new aoav()), (Bundle) null);
        } catch (RemoteException e) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Set mo6392a() {
        return Collections.singleton("android.permission-group.CONTACTS");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo16737a(int i, sck sck, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        bundle2.putString("auth_package", str3);
        super.mo16737a(i, sck, i2, str, str2, strArr, bundle2, iBinder, str3, str4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6393a(sbj sbj, GetServiceRequest getServiceRequest) {
        int i;
        String str;
        String str2;
        String[] strArr;
        String[] strArr2;
        sbj sbj2 = sbj;
        GetServiceRequest getServiceRequest2 = getServiceRequest;
        if (getServiceRequest2.f30229c > 0) {
            Scope[] scopeArr = getServiceRequest2.f30232f;
            String[] a = scopeArr != null ? stc.m36284a(scopeArr) : null;
            Account account = getServiceRequest2.f30234h;
            Account a2 = getServiceRequest.mo17822a();
            String str3 = getServiceRequest2.f30230d;
            Bundle bundle = getServiceRequest2.f30233g;
            String string = bundle.getString("com.google.android.gms.plus.internal.CALLING_PACKAGE_NAME");
            String str4 = string == null ? str3 : string;
            String string2 = bundle.getString("auth_package");
            if (this.f78056a.getPackageName().equals(string2)) {
                PlusChimeraService.m68557a();
            } else if (!str4.equals(string2)) {
                throw new SecurityException("invalid authPackage");
            }
            int callingUid = Binder.getCallingUid();
            if (Process.myUid() != Binder.getCallingUid()) {
                i = callingUid;
            } else {
                PlusChimeraService plusChimeraService = this.f78056a;
                if (string2 != null) {
                    try {
                        i = plusChimeraService.getPackageManager().getPackageInfo(string2, 128).applicationInfo.uid;
                    } catch (PackageManager.NameNotFoundException e) {
                        i = 0;
                    }
                } else {
                    i = 0;
                }
            }
            String string3 = rfz.m33557a(this.f78056a).mo24610b(str4) ? bundle.getString("application_name") : "100";
            if (account != null) {
                str = account.name;
            } else {
                str = null;
            }
            if (a2 != null) {
                str2 = a2.name;
            } else {
                str2 = null;
            }
            ClientContext clientContext = new ClientContext(i, str, str2, str4, string2);
            clientContext.mo17799a(a);
            if (bundle != null) {
                bundle.setClassLoader(PlusCommonExtras.class.getClassLoader());
                strArr = bundle.getStringArray("request_visible_actions");
            } else {
                strArr = null;
            }
            clientContext.f30218h.clear();
            if (strArr != null && strArr.length > 0) {
                clientContext.f30218h.addAll(Arrays.asList(strArr));
            }
            clientContext.mo17798a("application_name", string3);
            PlusCommonExtras.m68419b(bundle).mo46574a(clientContext.f30219i);
            ClientContext clientContext2 = new ClientContext(Process.myUid(), clientContext.mo17795a(), clientContext.mo17802b(), clientContext.f30215e, this.f78056a.getPackageName());
            clientContext2.mo17799a(aoay.f78059b);
            clientContext2.mo17797a(clientContext);
            Bundle bundle2 = getServiceRequest2.f30233g;
            if (bundle2 == null) {
                strArr2 = null;
            } else if (bundle2.getBoolean("skip_oob", false)) {
                PlusChimeraService.m68557a();
                m65717a(sbj2, clientContext, null);
                return;
            } else {
                strArr2 = null;
            }
            if (anty.m65328b(new HashSet(Arrays.asList(getServiceRequest2.f30232f)))) {
                Bundle bundle3 = getServiceRequest2.f30233g;
                if (Process.myUid() == Binder.getCallingUid()) {
                    strArr2 = bundle3.getStringArray("required_features");
                }
                if (strArr2 == null) {
                    if (!anuh.m65338a(a)) {
                        strArr2 = PlusChimeraService.f82610b;
                    } else {
                        strArr2 = sam.f43928G;
                    }
                }
                DefaultChimeraIntentService.m68555a(this.f78056a, new aocn(clientContext2, clientContext, strArr2, sbj, this.f78057b, aoay.f78058a, rzu.m34713a(getServiceRequest), getServiceRequest2.f30228b == 70));
                return;
            }
            m65717a(sbj2, clientContext, clientContext2);
            return;
        }
        throw new IllegalArgumentException("clientVersion too old");
    }
}
