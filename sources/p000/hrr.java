package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

/* renamed from: hrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hrr implements hep {

    /* renamed from: a */
    public final Context f20319a;

    /* renamed from: b */
    public final hky f20320b;

    /* renamed from: c */
    public final String f20321c;

    /* renamed from: d */
    public final CredentialRequest f20322d;

    /* renamed from: e */
    public final String f20323e;

    /* renamed from: f */
    public final hnc f20324f = hnc.m14626a();

    /* renamed from: g */
    public final hln f20325g;

    public hrr(Context context, String str, CredentialRequest credentialRequest, String str2) {
        this.f20319a = context;
        this.f20325g = hln.m14581a(context);
        this.f20320b = hms.m14612a(context);
        this.f20321c = str;
        this.f20322d = credentialRequest;
        this.f20323e = str2;
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_REQUEST;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        bqgg a = new hou(this.f20319a).mo12291a(hez);
        return bqdx.m112674a(bqdx.m112674a(a, new hrg(this, hez), bqfb.INSTANCE), new hri(this, a), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final bqgg mo12690a(boolean z) {
        String c = qqt.m32669c(this.f20321c);
        CredentialRequest credentialRequest = this.f20322d;
        String str = this.f20323e;
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", c).putExtra("firstTime", z);
        putExtra.putExtra("logSessionId", str);
        sef.m35071a(credentialRequest, putExtra, "credentialRequest");
        adbd a = adbe.m50105a();
        a.f61234c = 28422;
        a.f61235d = bmxv.m108566b(PendingIntent.getActivity(this.f20319a, 0, putExtra, 134217728));
        throw a.mo33301a().mo33303c();
    }
}
