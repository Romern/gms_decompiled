package p000;

import android.accounts.Account;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.Process;

/* renamed from: amuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amuz extends Thread {

    /* renamed from: a */
    final /* synthetic */ amva f75981a;

    /* renamed from: b */
    private final Account f75982b;

    /* renamed from: c */
    private final Bundle f75983c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amuz(amva amva, Account account, Bundle bundle) {
        super("ContactsSyncAdapter_WorkerThread");
        this.f75981a = amva;
        this.f75982b = account;
        this.f75983c = bundle;
    }

    public final void run() {
        amva amva;
        Process.setThreadPriority(10);
        try {
            if (!Thread.currentThread().isInterrupted()) {
                this.f75981a.mo41365a(this.f75982b, this.f75983c, "com.android.contacts", new SyncResult());
                amva = this.f75981a;
            } else {
                amva = this.f75981a;
            }
            amva.f75984a = null;
        } catch (Throwable th) {
            this.f75981a.f75984a = null;
            throw th;
        }
    }
}
