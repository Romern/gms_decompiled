package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.cryptauth.ClientPublicKey;
import com.google.android.gms.auth.cryptauth.Payload;
import java.util.List;

/* renamed from: ios */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ios extends rjx {

    /* renamed from: a */
    private static final rjo f21484a = new rjo("Cryptauth.CryptauthServiceApi", f21486c, f21485b);

    /* renamed from: b */
    private static final rje f21485b = new rje();

    /* renamed from: c */
    private static final rjl f21486c = new inn();

    public ios(Context context) {
        super(context, f21484a, (rjk) null, new rky());
    }

    /* renamed from: a */
    public final aucb mo13178a(int i, List list, String str, Account account, byte[] bArr) {
        return mo24732b(new inr(i, list, str, account, bArr));
    }

    /* renamed from: b */
    public final aucb mo13186b(String str, Account account) {
        return mo24701a((rpa) new inx(str, account));
    }

    /* renamed from: c */
    public final aucb mo13187c(String str, Account account) {
        return mo24701a((rpa) new ioi(str, account));
    }

    /* renamed from: d */
    public final aucb mo13188d(String str, Account account) {
        return mo24701a((rpa) new ioj(str, account));
    }

    /* renamed from: a */
    public final aucb mo13179a(Account account, String str, String str2, byte[] bArr) {
        return mo24701a((rpa) new ioa(account, str, str2, bArr));
    }

    /* renamed from: a */
    public final aucb mo13180a(String str, Account account) {
        return mo24701a((rpa) new inu(str, account));
    }

    /* renamed from: a */
    public final aucb mo13181a(String str, Account account, ClientPublicKey clientPublicKey) {
        return mo24701a((rpa) new iof(str, account, clientPublicKey));
    }

    /* renamed from: a */
    public final aucb mo13182a(String str, Account account, Payload payload) {
        return mo24701a((rpa) new ioo(str, account, payload));
    }

    /* renamed from: a */
    public final aucb mo13183a(String str, Account account, List list) {
        return mo24732b(new inq(str, account, list));
    }

    /* renamed from: a */
    public final aucb mo13184a(String str, String str2, Account account, Payload payload) {
        return mo24701a((rpa) new iok(str, str2, account, payload));
    }

    /* renamed from: a */
    public final aucb mo13185a(byte[] bArr) {
        return mo24701a((rpa) new iob(bArr));
    }
}
