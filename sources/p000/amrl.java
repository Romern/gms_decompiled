package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncStatusObserver;

/* renamed from: amrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amrl implements SyncStatusObserver {

    /* renamed from: a */
    public final Context f75805a;

    /* renamed from: b */
    public Object f75806b;

    /* renamed from: c */
    final /* synthetic */ amrm f75807c;

    /* renamed from: d */
    private boolean f75808d = false;

    /* renamed from: e */
    private bmza f75809e;

    /* renamed from: f */
    private final Account f75810f;

    public amrl(amrm amrm, Context context, Account account) {
        this.f75807c = amrm;
        this.f75810f = account;
        this.f75805a = context.getApplicationContext();
    }

    /* renamed from: a */
    private final void m63201a(String str) {
        this.f75807c.getActivity().runOnUiThread(new amrk(this, str));
    }

    public final void onStatusChanged(int i) {
        if (ContentResolver.isSyncActive(this.f75810f, "com.google.android.gms.people")) {
            m63201a(String.format("Sync started for account: %s", this.f75810f.name));
            this.f75808d = true;
            this.f75809e = bmza.m108658b();
        } else if (this.f75808d && this.f75806b != null) {
            this.f75809e.mo66931e();
            ContentResolver.removeStatusChangeListener(this.f75806b);
            m63201a(String.format("Sync finished for account: %s.  Took %s", this.f75810f.name, this.f75809e));
        }
    }
}
