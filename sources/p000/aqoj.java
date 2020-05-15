package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;

/* renamed from: aqoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqoj extends sbm implements aqkr {

    /* renamed from: a */
    public final sat f86410a;

    /* renamed from: b */
    private final boolean f86411b;

    /* renamed from: c */
    private final Bundle f86412c;

    /* renamed from: d */
    private final Integer f86413d;

    /* renamed from: a */
    public static Bundle m71863a(sat sat) {
        aqkt aqkt = sat.f43969g;
        Integer num = sat.f43970h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", sat.f43963a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (aqkt != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", aqkt.f86307b);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", aqkt.f86308c);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", aqkt.f86309d);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", aqkt.f86310e);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", aqkt.f86311f);
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", aqkt.f86312g);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", aqkt.f86313h);
            Long l = aqkt.f86314i;
            if (l != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", l.longValue());
            }
            Long l2 = aqkt.f86315j;
            if (l2 != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", l2.longValue());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.signin.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* renamed from: c */
    public final void mo47939c() {
        try {
            ((aqof) mo25289B()).mo47998a(this.f86413d.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }

    /* renamed from: e */
    public final void mo47940e() {
        mo25296a(new saj(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Bundle mo12238f() {
        if (!this.f43948r.getPackageName().equals(this.f86410a.f43967e)) {
            this.f86412c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f86410a.f43967e);
        }
        return this.f86412c;
    }

    /* renamed from: g */
    public final boolean mo12787g() {
        return this.f86411b;
    }

    public aqoj(Context context, Looper looper, boolean z, sat sat, Bundle bundle, rjz rjz, rka rka) {
        super(context, looper, 44, sat, rjz, rka);
        this.f86411b = z;
        this.f86410a = sat;
        this.f86412c = bundle;
        this.f86413d = sat.f43970h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof aqof) {
            return (aqof) queryLocalInterface;
        }
        return new aqod(iBinder);
    }

    /* renamed from: a */
    public final void mo47937a(aqoc aqoc) {
        GoogleSignInAccount googleSignInAccount;
        sdo.m34966a(aqoc, "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.f86410a.mo25320b();
            if ("<<default account>>".equals(b.name)) {
                googleSignInAccount = idk.m15277a(this.f43948r).mo12942a();
            } else {
                googleSignInAccount = null;
            }
            ((aqof) mo25289B()).mo48005a(new SignInRequest(1, new ResolveAccountRequest(2, b, this.f86413d.intValue(), googleSignInAccount)), aqoc);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                aqoc.mo24903a(new SignInResponse());
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo47938a(scb scb, boolean z) {
        try {
            ((aqof) mo25289B()).mo48006a(scb, this.f86413d.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }
}
