package p000;

import android.content.Intent;
import android.os.Build;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;

/* renamed from: gwv */
final /* synthetic */ class gwv implements bmxj {

    /* renamed from: a */
    private final gww f19138a;

    public gwv(gww gww) {
        this.f19138a = gww;
    }

    public final Object apply(Object obj) {
        gww gww = this.f19138a;
        sdo.m34974b(!((bngx) obj).isEmpty());
        BeginSignInRequest beginSignInRequest = gww.f19140b;
        String str = gww.f19139a;
        Intent intent = new Intent("com.google.android.gms.auth.api.credentials.ASSISTED_SIGNIN").setPackage("com.google.android.gms");
        sef.m35071a(beginSignInRequest, intent, "begin_sign_in_request");
        intent.putExtra("session_id", str);
        rpr b = rpr.m34216b();
        int i = Build.VERSION.SDK_INT;
        return new BeginSignInResult(spn.m35844a(b, intent, 1275068416));
    }
}
