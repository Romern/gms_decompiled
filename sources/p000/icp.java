package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Scope;

/* renamed from: icp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class icp extends sbm {

    /* renamed from: a */
    public final GoogleSignInOptions f20747a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof idh) {
            return (idh) queryLocalInterface;
        }
        return new idf(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 12451000;
    }

    /* renamed from: h */
    public final boolean mo12923h() {
        return true;
    }

    /* renamed from: i */
    public final Intent mo12924i() {
        Context context = this.f43948r;
        GoogleSignInOptions googleSignInOptions = this.f20747a;
        icv.f20750a.mo25412b("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public icp(Context context, Looper looper, sat sat, GoogleSignInOptions googleSignInOptions, rjz rjz, rka rka) {
        super(context, looper, 91, sat, rjz, rka);
        ich ich;
        if (googleSignInOptions == null) {
            ich = new ich();
        } else {
            ich = new ich(googleSignInOptions);
        }
        ich.f20726b = adbv.m50143a();
        if (!sat.f43965c.isEmpty()) {
            for (Scope scope : sat.f43965c) {
                ich.mo12913a(scope, new Scope[0]);
            }
        }
        this.f20747a = ich.mo12912a();
    }
}
