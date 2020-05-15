package p000;

import android.accounts.Account;
import com.google.android.gms.location.reporting.OptInRequest;

/* renamed from: aept */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aept {

    /* renamed from: a */
    public final Account f63613a;

    /* renamed from: b */
    public String f63614b;

    /* renamed from: c */
    public String f63615c;

    public aept(Account account) {
        sdo.checkIfNull(account, "account");
        this.f63613a = account;
    }

    /* renamed from: a */
    public final OptInRequest mo34445a() {
        return new OptInRequest(this);
    }
}
