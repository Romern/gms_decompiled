package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: hpp */
public final /* synthetic */ class hpp implements bqeh {

    /* renamed from: a */
    private final Account f20184a;

    /* renamed from: b */
    private final String f20185b;

    /* renamed from: c */
    private final Credential f20186c;

    /* renamed from: d */
    private final hik f20187d;

    public hpp(hik hik, Account account, String str, Credential credential) {
        this.f20187d = hik;
        this.f20184a = account;
        this.f20185b = str;
        this.f20186c = credential;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hik hik = this.f20187d;
        Account account = this.f20184a;
        String str = this.f20185b;
        Credential credential = this.f20186c;
        hms a = hms.m14612a(hik.f19829a);
        adbj adbj = adbj.AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_SAVE;
        bqgg a2 = a.mo12598a(heb.m14255a(account), str, credential);
        ((hez) obj).mo12448a(adbj, a2);
        return adax.m50092a(a2);
    }
}
