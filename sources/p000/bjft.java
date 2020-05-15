package p000;

import android.content.Intent;

/* renamed from: bjft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjft implements bjew {
    /* renamed from: a */
    public final bjfd mo52455a(bjfc bjfc) {
        bjxy a = bjxx.m104869a();
        Intent a2 = bjfd.m103295a(0);
        a2.putExtra("ephemeralPublicKey", a.f123617b);
        a2.putExtra("ephemeralPrivateKey", a.f123616a);
        return new bjfd(a2);
    }
}
