package p000;

import android.content.Intent;
import android.os.Build;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;

/* renamed from: hfk */
final /* synthetic */ class hfk implements bqeh {

    /* renamed from: a */
    private final hfl f19659a;

    public hfk(hfl hfl) {
        this.f19659a = hfl;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hfl hfl = this.f19659a;
        if (!((bngx) obj).isEmpty()) {
            rpr b = rpr.m34216b();
            SavePasswordRequest savePasswordRequest = hfl.f19660a;
            String str = hfl.f19661b;
            Intent intent = new Intent("com.google.android.gms.auth.api.credentials.SAVE_PASSWORD").setPackage("com.google.android.gms");
            sef.m35071a(savePasswordRequest, intent, "save_password_request");
            intent.putExtra("session_id", str);
            int i = Build.VERSION.SDK_INT;
            return bqga.m112775a(new SavePasswordResult(spn.m35844a(b, intent, 1275068416)));
        }
        throw adbe.m50106a(28434);
    }
}
