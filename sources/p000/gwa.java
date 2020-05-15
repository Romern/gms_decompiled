package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.Credential;

/* renamed from: gwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gwa extends rpa {

    /* renamed from: a */
    final /* synthetic */ Account f19106a;

    /* renamed from: b */
    final /* synthetic */ String f19107b;

    /* renamed from: c */
    final /* synthetic */ Credential f19108c;

    public gwa(Account account, String str, Credential credential) {
        this.f19106a = account;
        this.f19107b = str;
        this.f19108c = credential;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11798a(rjd rjd, aucf aucf) {
        ((hil) ((hib) rjd).mo25289B()).mo12490a(new gwg(aucf, Credential.class), this.f19106a, this.f19107b, this.f19108c);
    }
}
