package p000;

import android.accounts.Account;

/* renamed from: befo */
final /* synthetic */ class befo implements bqeh {

    /* renamed from: a */
    private final int f111510a;

    public befo(int i) {
        this.f111510a = i;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        byee byee;
        int i = this.f111510a;
        byeg byeg = (byeg) obj;
        bxww bxww = byeg.f165903c;
        Integer valueOf = Integer.valueOf(i);
        Account account = null;
        if (bxww.containsKey(valueOf)) {
            byee = (byee) bxww.get(valueOf);
        } else {
            byee = null;
        }
        if (byee != null) {
            account = new Account(byee.f165896b, byee.f165897c);
        }
        if (account != null) {
            return bqga.m112775a(account);
        }
        if (!byeg.equals(byeg.f165899d)) {
            int i2 = byeg.f165902b;
            if (i == i2) {
                throw new bego("Account not found");
            } else if (i < 0) {
                throw new bego("Account not found");
            } else if (i > 100) {
                throw new bego("Account not found");
            } else if (i > i2) {
                throw new bego("Account not found");
            } else {
                throw new bego("Account not found");
            }
        } else {
            throw new bego("Account not found");
        }
    }
}
