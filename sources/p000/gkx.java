package p000;

import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: gkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gkx {

    /* renamed from: a */
    private final Context f18441a;

    public gkx(Context context) {
        this.f18441a = context;
    }

    /* renamed from: a */
    public final bzxk mo12001a(Account account, String str) {
        try {
            bzxl a = gmi.m13447a(this.f18441a, account);
            bxvd da = bzxj.f171758c.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bzxj bzxj = (bzxj) da.f164949b;
            a.getClass();
            bzxj.f171761b = a;
            bzxj.f171760a |= 1;
            try {
                return (bzxk) jhr.m16734a().mo13754a("post", str, (bzxj) da.mo74062i(), bzxk.f171762c).get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException("Unable to query account state", e);
            }
        } catch (gmh e2) {
            throw new IOException("Couldn't create ClientAuthInfo", e2);
        }
    }

    /* renamed from: b */
    public final boolean mo12002b(Account account, String str) {
        return new gkh(this.f18441a).mo11983a(account, new Account(str, account.type));
    }
}
