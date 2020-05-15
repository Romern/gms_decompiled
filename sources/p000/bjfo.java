package p000;

import android.content.Intent;

/* renamed from: bjfo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjfo implements bjew {
    /* renamed from: a */
    public final bjfd mo52455a(bjfc bjfc) {
        bjyb a = bjxx.m104870a(bjfc.f122612a.getStringExtra("ecdhPublicKey"), bjfc.f122612a.getStringExtra("agreementPartyVInfo"), bjfc.f122612a.getByteArrayExtra("ephemeralPrivateKey"));
        Intent a2 = bjfd.m103295a(0);
        a2.putExtra("cReqSessionKey", a.f123619a);
        a2.putExtra("cResSessionKey", a.f123620b);
        return new bjfd(a2);
    }
}
