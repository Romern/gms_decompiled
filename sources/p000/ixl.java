package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceRequest;
import com.google.android.gms.auth.firstparty.dataservice.CheckFactoryResetPolicyComplianceResponse;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountData;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.dataservice.UpdateCredentialsRequest;

/* renamed from: ixl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ixl implements iws {

    /* renamed from: a */
    private final Context f21927a;

    public ixl(Context context) {
        sdo.m34959a(context);
        this.f21927a = context;
    }

    /* renamed from: a */
    public final CheckFactoryResetPolicyComplianceResponse mo13424a(CheckFactoryResetPolicyComplianceRequest checkFactoryResetPolicyComplianceRequest) {
        return (CheckFactoryResetPolicyComplianceResponse) mo13426a(new ixb(checkFactoryResetPolicyComplianceRequest));
    }

    /* renamed from: b */
    public final void mo13429b() {
        mo13426a(new ixe());
    }

    /* renamed from: a */
    public final GoogleAccountData mo13417a(Account account) {
        return (GoogleAccountData) mo13426a(new ixa(account));
    }

    /* renamed from: a */
    public final TokenResponse mo13418a(AccountSignInRequest accountSignInRequest) {
        return (TokenResponse) mo13426a(new iwv(accountSignInRequest));
    }

    /* renamed from: a */
    public final TokenResponse mo13419a(ConfirmCredentialsRequest confirmCredentialsRequest) {
        return (TokenResponse) mo13426a(new iww(confirmCredentialsRequest));
    }

    /* renamed from: a */
    public final TokenResponse mo13425a(TokenRequest tokenRequest) {
        sdo.checkIfNull(tokenRequest, "TokenRequest cannot be null!");
        Bundle b = tokenRequest.mo7640b();
        b.putLong("gads_service_connection_start_time_millis", SystemClock.elapsedRealtime());
        tokenRequest.mo7638a(b);
        return (TokenResponse) mo13426a(new iwu(tokenRequest));
    }

    /* renamed from: a */
    public final TokenResponse mo13420a(UpdateCredentialsRequest updateCredentialsRequest) {
        return (TokenResponse) mo13426a(new iwx(updateCredentialsRequest));
    }

    /* renamed from: a */
    public final Object mo13426a(ixk ixk) {
        rex rex;
        sbq a;
        ixr ixr;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            rex = new rex();
            a = sbq.m34856a(this.f21927a);
            if (a.mo25356a("com.google.android.gms.auth.DATA_PROXY", rex, "GoogleAccountDataServiceClient")) {
                try {
                    IBinder a2 = rex.mo24567a();
                    if (a2 != null) {
                        IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.auth.firstparty.dataservice.IGoogleAccountDataService");
                        ixr = !(queryLocalInterface instanceof ixr) ? new ixp(a2) : (ixr) queryLocalInterface;
                    } else {
                        ixr = null;
                    }
                    Object a3 = ixk.mo13423a(ixr);
                    a.mo25352a("com.google.android.gms.auth.DATA_PROXY", rex);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return a3;
                } catch (InterruptedException e) {
                    Log.w("GoogleAccountDataServiceClient", "[GoogleAccountDataServiceClient] Interrupted when getting service.", e);
                    a.mo25352a("com.google.android.gms.auth.DATA_PROXY", rex);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return null;
                } catch (RemoteException e2) {
                    Log.w("GoogleAccountDataServiceClient", "[GoogleAccountDataServiceClient] RemoteException when executing call.", e2);
                    a.mo25352a("com.google.android.gms.auth.DATA_PROXY", rex);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return null;
                }
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return null;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* renamed from: a */
    public final String mo13427a(String str) {
        return (String) mo13426a(new ixi(str));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo13428a() {
        mo13426a(new ixc());
    }
}
