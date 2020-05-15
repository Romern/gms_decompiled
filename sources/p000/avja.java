package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.contextmanager.ContextData;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: avja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avja {

    /* renamed from: a */
    private static final srn f93263a = srn.m36124a();

    /* renamed from: b */
    private final rjx f93264b;

    public avja(Context context, Account account) {
        new avjn(context, account.name);
        lri a = lri.m19582a("com.google.android.gms.udc", account);
        this.f93264b = lrh.m19580d(context, a);
        lrh.m19579c(context, a);
    }

    /* renamed from: a */
    public static bxlw m78602a(ContextData contextData) {
        if (contextData == null) {
            return null;
        }
        return (bxlw) GeneratedMessageLite.m124016a(bxlw.f163903b, contextData.mo18023k(), bxus.m123744c());
    }

    /* renamed from: a */
    public final tir mo51287a() {
        tit tit = new tit();
        tit.mo26579a(10002);
        tit.mo26582b(2);
        try {
            return ((tjy) ((rkj) aucu.m76783a(sdl.m34955a(tjj.m37075a(this.f93264b.f43165D, tit.mo26578a()), new rkj()), chbh.m148005c(), TimeUnit.MILLISECONDS)).f43190a).mo26614b();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) f93263a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Failure reading udc context");
            return null;
        }
    }
}
