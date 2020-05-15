package p000;

import android.accounts.Account;
import java.util.Map;

/* renamed from: bafb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bafb implements babo {

    /* renamed from: a */
    final Map f100704a;

    public bafb(Map map) {
        this.f100704a = map;
    }

    /* renamed from: a */
    public final boolean mo55562a(bygz bygz, Account account) {
        byhn byhn;
        Map map = this.f100704a;
        if (bygz.f166412a == 2) {
            byhn = (byhn) bygz.f166413b;
        } else {
            byhn = byhn.f166478e;
        }
        byhm a = byhm.m124816a(byhn.f166483d);
        if (a == null) {
            a = byhm.UNKNOWN;
        }
        bafg bafg = (bafg) map.get(a);
        if (bafg != null) {
            return bafg.mo32735c(bygz, account);
        }
        return false;
    }
}
