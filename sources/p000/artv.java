package p000;

import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;

/* renamed from: artv */
final /* synthetic */ class artv implements aubg {

    /* renamed from: a */
    private final Challenge f88289a;

    /* renamed from: b */
    private final byte[] f88290b;

    public artv(Challenge challenge, byte[] bArr) {
        this.f88289a = challenge;
        this.f88290b = bArr;
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        Challenge challenge = this.f88289a;
        byte[] bArr = this.f88290b;
        Logger Logger = aruc.f88303a;
        return new Assertion(challenge.f108122c, bArr, ((SignCryptedBlob) aucb.mo50386d()).f10555c, challenge.f108125f, challenge.f108124e);
    }
}
