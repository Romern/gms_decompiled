package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.credentials.internal.InternalCredentialWrapper;

/* renamed from: hrx */
final /* synthetic */ class hrx implements bmxj {

    /* renamed from: a */
    static final bmxj f20332a = new hrx();

    private hrx() {
    }

    public final Object apply(Object obj) {
        int i = hsk.f20356h;
        Account account = ((InternalCredentialWrapper) obj).f10140b;
        bmxy.m108581a(account);
        return account;
    }
}
