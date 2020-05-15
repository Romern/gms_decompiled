package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: hks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hks implements hep {

    /* renamed from: a */
    private final Context f19957a;

    /* renamed from: b */
    private final String f19958b;

    /* renamed from: c */
    private final Account f19959c;

    public hks(Context context, String str, Account account) {
        sdo.m34959a(context);
        this.f19957a = context;
        sdo.m34977c(str);
        this.f19958b = str;
        sdo.m34959a(account);
        this.f19959c = account;
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_INTERNAL_RECORD_GRANTS;
    }

    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        int i = spn.m35897i(this.f19957a, this.f19958b);
        if (i != -1) {
            ixl a = aczw.m50063a(this.f19957a);
            adag a2 = adag.m50068a(this.f19959c, adag.f61199a);
            a2.mo33283a(5);
            a2.mo33287a(this.f19958b, i);
            a2.mo33285a(iyb.GRANTED);
            if (izj.SUCCESS.equals(a.mo13425a(a2.mo33282a()).mo7647b())) {
                return bqga.m112775a((Object) null);
            }
            adbd a3 = adbe.m50105a();
            a3.f61234c = 28404;
            a3.f61232a = "Failed to record grants on server";
            throw a3.mo33301a();
        }
        throw adbe.m50106a(28442);
    }
}
