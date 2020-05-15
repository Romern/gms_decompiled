package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: hpo */
public final /* synthetic */ class hpo implements bqeh {

    /* renamed from: a */
    private final Account f20177a;

    /* renamed from: b */
    private final String f20178b;

    /* renamed from: c */
    private final Credential f20179c;

    /* renamed from: d */
    private final boolean f20180d;

    /* renamed from: e */
    private final String f20181e;

    /* renamed from: f */
    private final String f20182f;

    /* renamed from: g */
    private final hik f20183g;

    public hpo(hik hik, Account account, String str, Credential credential, boolean z, String str2, String str3) {
        this.f20183g = hik;
        this.f20177a = account;
        this.f20178b = str;
        this.f20179c = credential;
        this.f20180d = z;
        this.f20181e = str2;
        this.f20182f = str3;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hik hik = this.f20183g;
        Account account = this.f20177a;
        String str = this.f20178b;
        Credential credential = this.f20179c;
        boolean z = this.f20180d;
        String str2 = this.f20181e;
        String str3 = this.f20182f;
        hms a = hms.m14612a(hik.f19829a);
        adbj adbj = adbj.AUTH_API_CREDENTIALS_CREDENTIAL_DATA_PROVIDER_GET_FULL_CREDENTIAL;
        bqgg a2 = a.mo12599a(heb.m14255a(account), str, credential, z, str2, str3);
        ((hez) obj).mo12448a(adbj, a2);
        return adax.m50092a(a2);
    }
}
