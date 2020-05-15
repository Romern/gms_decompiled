package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: gwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gwx implements hep {

    /* renamed from: a */
    private final Context f19144a;

    /* renamed from: b */
    private final GetSignInIntentRequest f19145b;

    /* renamed from: c */
    private final qws f19146c;

    /* renamed from: d */
    private final String f19147d;

    /* renamed from: e */
    private final String f19148e;

    public gwx(Context context, GetSignInIntentRequest getSignInIntentRequest, qws qws, String str, String str2) {
        this.f19144a = context;
        this.f19145b = getSignInIntentRequest;
        this.f19146c = qws;
        this.f19147d = str;
        this.f19148e = str2;
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_GET_SIGN_IN_INTENT;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        qws qws = this.f19146c;
        bxvd da = bong.f133782r.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bong bong = (bong) da.f164949b;
        bong.f133785b = 16;
        int i = bong.f133784a | 1;
        bong.f133784a = i;
        String str = this.f19147d;
        str.getClass();
        bong.f133784a = i | 2;
        bong.f133786c = str;
        bxvd da2 = bomx.f133732c.mo74144da();
        String str2 = this.f19148e;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bomx bomx = (bomx) da2.f164949b;
        str2.getClass();
        bomx.f133734a |= 1;
        bomx.f133735b = str2;
        bomx bomx2 = (bomx) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bong bong2 = (bong) da.f164949b;
        bomx2.getClass();
        bong2.f133800q = bomx2;
        bong2.f133784a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        qws.mo24333a(da.mo74062i()).mo24327b();
        GetSignInIntentRequest getSignInIntentRequest = this.f19145b;
        Intent intent = new Intent("com.google.android.gms.auth.api.credentials.GOOGLE_SIGN_IN").setPackage("com.google.android.gms");
        sef.m35071a(getSignInIntentRequest, intent, "get_sign_in_intent_request");
        Context context = this.f19144a;
        int i2 = Build.VERSION.SDK_INT;
        return bqga.m112775a(spn.m35844a(context, intent, 1275068416));
    }
}
