package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.IdToken;

/* renamed from: gvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gvz extends rpa {

    /* renamed from: a */
    final /* synthetic */ Account f19101a;

    /* renamed from: b */
    final /* synthetic */ String f19102b;

    /* renamed from: c */
    final /* synthetic */ String f19103c;

    /* renamed from: d */
    final /* synthetic */ String f19104d;

    public gvz(Account account, String str, String str2, String str3) {
        this.f19101a = account;
        this.f19102b = str;
        this.f19103c = str2;
        this.f19104d = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11798a(rjd rjd, aucf aucf) {
        ((hil) ((hib) rjd).mo25289B()).mo12492a(new gwg(aucf, IdToken.class), this.f19101a, this.f19102b, this.f19103c, this.f19104d);
    }
}
