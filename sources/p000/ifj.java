package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.CryptauthPublicKey;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.PlainText;
import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import java.util.concurrent.TimeUnit;

/* renamed from: ifj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ifj {

    /* renamed from: a */
    public static final long f20859a = TimeUnit.MINUTES.toMillis(60);

    /* renamed from: a */
    public static final CryptauthPublicKey m15366a(Context context, Account account) {
        return (CryptauthPublicKey) m15368a(inl.m15759a(context).mo13188d("PublicKey", account));
    }

    /* renamed from: a */
    public static final ifi m15367a(Context context, byte[] bArr, byte[] bArr2) {
        PlainText plainText = (PlainText) m15368a(inl.m15759a(context).mo24701a((rpa) new ior("authzen", bArr2, new Payload(null, null, bArr))));
        int a = byrx.m125235a(((byrv) bxvk.m124007a(byrv.f167517d, ((bytc) bxvk.m124014a(bytc.f167647i, plainText.f10550b)).f167655g)).f167520b);
        if (a == 0) {
            a = 1;
        }
        return new ifi(new byrz(bysa.m125238b(a), plainText.f10551c), plainText.f10552d.name);
    }

    /* renamed from: a */
    public static Object m15368a(aucb aucb) {
        aucu.m76783a(aucb, f20859a, TimeUnit.MILLISECONDS);
        return aucb.mo50386d();
    }

    /* renamed from: a */
    public static final byte[] m15369a(Context context, bysa bysa, byte[] bArr, Account account) {
        ios a = inl.m15759a(context);
        bxvd da = byrv.f167517d.mo74144da();
        int i = bysa.f167549q;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byrv byrv = (byrv) da.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            byrv.f167520b = i2;
            byrv.f167519a |= 1;
            byrv.m125232a(byrv);
            return ((SignCryptedBlob) m15368a(a.mo13184a("PublicKey", "authzen", account, new Payload(null, ((byrv) da.mo74062i()).mo73642k(), bArr)))).f10555c;
        }
        throw null;
    }
}
