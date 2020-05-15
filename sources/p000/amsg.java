package p000;

import android.accounts.Account;
import android.util.Log;
import java.util.concurrent.CancellationException;

/* renamed from: amsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amsg extends C0034at implements bqfp {

    /* renamed from: a */
    public final amul f75848a;

    /* renamed from: g */
    public String f75849g;

    /* renamed from: h */
    public final amsh f75850h;

    /* renamed from: i */
    private final bqgj f75851i;

    /* renamed from: j */
    private bqgg f75852j;

    public amsg(amul amul, bqgj bqgj, amsh amsh) {
        this.f75848a = amul;
        this.f75851i = bqgj;
        this.f75850h = amsh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2443a() {
        mo41300e();
    }

    /* renamed from: e */
    public final void mo41300e() {
        bqgg bqgg = this.f75852j;
        if (bqgg != null) {
            bqgg.cancel(true);
        }
        bqgg b = this.f75851i.mo25819b(new amsf(this));
        this.f75852j = b;
        bqga.m112781a(b, this, bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        mo2453l((Account) obj);
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        if (!(th instanceof CancellationException)) {
            Log.e("AccountLiveData", "Error with account future. ", th);
        }
    }
}
