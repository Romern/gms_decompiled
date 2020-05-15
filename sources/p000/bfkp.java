package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bfkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfkp {

    /* renamed from: a */
    private final Context f114312a;

    public bfkp(Context context) {
        this.f114312a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final boolean mo61852a() {
        Account[] accountArr = bfkd.m97106a(this.f114312a).f114281b;
        for (Account account : accountArr) {
            rpr b = rpr.m34216b();
            auzx auzx = new auzx();
            auzx.f92843a = account;
            try {
                rkj rkj = (rkj) aucu.m76783a(auzz.m78131a(b, auzx.mo51097a()).mo24671C(), 500, TimeUnit.MILLISECONDS);
                if (rkj.mo24823q()) {
                    if (rkj.mo24822p()) {
                        return true;
                    }
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
            }
        }
        return false;
    }
}
