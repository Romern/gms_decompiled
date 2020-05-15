package p000;

import android.accounts.Account;
import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: burm */
final /* synthetic */ class burm implements Runnable {

    /* renamed from: a */
    private final buru f154772a;

    /* renamed from: b */
    private final Account f154773b;

    /* renamed from: c */
    private final burt f154774c;

    /* renamed from: d */
    private final long f154775d;

    /* renamed from: e */
    private final Throwable f154776e;

    public burm(buru buru, Account account, burt burt, long j, Throwable th) {
        this.f154772a = buru;
        this.f154773b = account;
        this.f154774c = burt;
        this.f154775d = j;
        this.f154776e = th;
    }

    public final void run() {
        int i;
        buru buru = this.f154772a;
        Account account = this.f154773b;
        burt burt = this.f154774c;
        long j = this.f154775d;
        Throwable th = this.f154776e;
        try {
            i = ((List) buru.mo73055a(account).get()).size();
        } catch (InterruptedException | ExecutionException e) {
            bnsl bnsl = (bnsl) busr.f154819a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("buru", "b", (int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Footprints Manager: Failed to read the footprints for logging device count.");
            i = -1;
        }
        Context context = buru.f154791b;
        context.startService(butb.m120416a(context, burt.mo73010a().f68537y, burt.mo73013d(), j, i, th));
    }
}
