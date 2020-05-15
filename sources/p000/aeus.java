package p000;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.gms.locationsharing.reporting.GmsLocationReportingClient$1;

/* renamed from: aeus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeus {

    /* renamed from: a */
    public static final srn f63859a = srn.m36127a(sgj.LOCATION_SHARING);

    /* renamed from: b */
    public final Context f63860b;

    /* renamed from: c */
    public ReportingState f63861c;

    /* renamed from: d */
    public boolean f63862d;

    /* renamed from: e */
    public Exception f63863e;

    /* renamed from: f */
    public final aesq f63864f;

    /* renamed from: g */
    private final BroadcastReceiver f63865g = new GmsLocationReportingClient$1(this, "locationsharing");

    /* renamed from: h */
    private final Account f63866h;

    /* renamed from: i */
    private boolean f63867i;

    /* renamed from: j */
    private final rjx f63868j;

    public aeus(Context context, String str, aesq aesq, rjx rjx) {
        this.f63860b = context;
        this.f63868j = rjx;
        Account account = new Account(str, "com.google");
        this.f63866h = account;
        this.f63864f = aesq;
        aetj.m52535a(context, account.name, false, 0);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.location.reporting.SETTINGS_CHANGED");
        if (!this.f63867i) {
            context.registerReceiver(this.f63865g, intentFilter);
            this.f63867i = true;
        }
        mo34583a();
    }

    /* renamed from: b */
    private final void m52584b() {
        if (this.f63862d) {
            bnsl bnsl = (bnsl) f63859a.mo68388c();
            bnsl.mo68437a(this.f63863e);
            bnsl.mo68432a("aeus", "b", 178, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Illegal to call this method when the status is failure");
            throw new IllegalStateException("Illegal to call this method when status is failure: ", this.f63863e);
        }
    }

    /* renamed from: a */
    public final void mo34583a() {
        aucb c = this.f63868j.mo24736c(this.f63866h);
        c.mo50373a(new aeuq(this));
        c.mo50372a(new aeur(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo34584a(Exception exc) {
        this.f63862d = true;
        bnsl bnsl = (bnsl) f63859a.mo68388c();
        bnsl.mo68437a(exc);
        bnsl.mo68432a("aeus", "a", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("getReportingStateSafe reports an error. ");
        this.f63863e = exc;
        aesq aesq = this.f63864f;
        if (aesq != null) {
            aesq.mo34512a();
        }
    }
}
