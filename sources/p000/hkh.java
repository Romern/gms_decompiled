package p000;

import android.content.Context;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;

/* renamed from: hkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hkh implements hep {

    /* renamed from: a */
    public static final sek f19936a = ght.m13172b("ListSignInCredentialsOperation");

    /* renamed from: e */
    private static final adcb f19937e = adca.m50151b(hjw.f19921a);

    /* renamed from: b */
    public final Context f19938b;

    /* renamed from: c */
    public final String f19939c;

    /* renamed from: d */
    public final BeginSignInRequest f19940d;

    public hkh(Context context, String str, BeginSignInRequest beginSignInRequest) {
        sdo.m34959a(context);
        this.f19938b = context;
        sdo.m34977c(str);
        this.f19939c = str;
        sdo.m34959a(beginSignInRequest);
        this.f19940d = beginSignInRequest;
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_LIST_SIGNIN_CREDENTIALS;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        bqgg bqgg;
        bmxv a = qqt.m32666a(this.f19938b, this.f19939c);
        if (a.mo66813a()) {
            adai adai = (adai) f19937e.mo33309a();
            hkg hkg = new hkg((String) a.mo66814b(), this.f19940d);
            hjv hjv = new hjv(this, hez);
            synchronized (adai.f61204a) {
                bqgg = (bqgg) adai.f61205b.mo66947b(hkg);
                if (bqgg == null) {
                    try {
                        bqgg = hjv.mo6375a(hkg);
                        adai.f61205b.mo66946a(hkg, bqgg);
                    } catch (Exception e) {
                        bqgg = bqga.m112777a((Throwable) e);
                    }
                }
            }
            return bqgg;
        }
        throw adbe.m50106a(28442);
    }
}
