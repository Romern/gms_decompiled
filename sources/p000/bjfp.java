package p000;

import android.content.Intent;

/* renamed from: bjfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjfp implements bjew {
    /* renamed from: a */
    public final bjfd mo52455a(bjfc bjfc) {
        String a = bjxx.m104874a(bjfc.f122612a.getByteArrayExtra("plainText"), bjfc.f122612a.getStringExtra("keyId"), bjfc.f122612a.getStringExtra("initializationVector"), bjfc.f122612a.getByteArrayExtra("cReqSessionKey"));
        Intent a2 = bjfd.m103295a(0);
        a2.putExtra("encryptionValue", a);
        return new bjfd(a2);
    }
}
