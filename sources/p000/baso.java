package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: baso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baso {

    /* renamed from: a */
    private final batc f101664a;

    /* renamed from: b */
    private final Context f101665b;

    /* renamed from: c */
    private final Executor f101666c;

    /* renamed from: d */
    private final aflo f101667d;

    public baso(batc batc, aflo aflo, Context context, Executor executor) {
        this.f101664a = batc;
        this.f101667d = aflo;
        this.f101665b = context;
        this.f101666c = executor;
    }

    /* renamed from: a */
    public final basb mo55937a(Account account, int i, int i2, bxuq bxuq) {
        aflo aflo = this.f101667d;
        return new bass(this.f101666c, this.f101665b, this.f101664a, new afmp(aflo.f64329a, aflo.f64330b, aflo.f64331c, aflo.f64332d, account, i, i2), bxuq, new basz(bxuq), account, i, i2);
    }

    /* renamed from: a */
    public final basb mo55938a(Account account, int i, bxuq bxuq) {
        return mo55937a(account, i, bxuq.mo73900a(), bxuq);
    }
}
