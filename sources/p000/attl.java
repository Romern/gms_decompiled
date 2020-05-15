package p000;

import com.google.android.gms.tapandpay.issuer.CreatePushTokenizeSessionRequest;
import com.google.android.gms.tapandpay.tokenization.TokenizePanChimeraActivity;

/* renamed from: attl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class attl extends atue {

    /* renamed from: a */
    public static final srn f90879a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    public attl(TokenizePanChimeraActivity tokenizePanChimeraActivity) {
        super(tokenizePanChimeraActivity);
    }

    /* renamed from: a */
    public final void mo50169a(atsy atsy) {
        askf askf = new askf(atsy.f90857t, askc.m74272b(), this.f90898f);
        attk attk = new attk(this);
        CreatePushTokenizeSessionRequest createPushTokenizeSessionRequest = (CreatePushTokenizeSessionRequest) sef.m35069a(atsy.f90860w, CreatePushTokenizeSessionRequest.CREATOR);
        bxvd da = btke.f149242d.mo74144da();
        String str = atsy.f90861x;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btke btke = (btke) da.f164949b;
        str.getClass();
        btke.f149244a = str;
        String str2 = createPushTokenizeSessionRequest.f108568b;
        str2.getClass();
        btke.f149245b = str2;
        bxtx a = bxtx.m123261a(atsy.f90816H);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((btke) da.f164949b).f149246c = a;
        atff.m75765a(askf, "t/cardtokenization/createissuerpushprovisioningsession", (btke) da.mo74062i(), btkf.f149247b, attk, this);
    }
}
