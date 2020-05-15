package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: ifv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ifv extends ift {

    /* renamed from: a */
    private final Account f20888a;

    /* renamed from: b */
    private final int f20889b;

    /* renamed from: c */
    private final int f20890c;

    /* renamed from: d */
    private final C1077iid f20891d;

    public ifv(C1077iid iid, Account account, int i, int i2) {
        super("ForceCryptauthRegistrationSync");
        sdo.m34959a(iid);
        this.f20891d = iid;
        this.f20888a = account;
        this.f20889b = i;
        this.f20890c = i2;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f20891d.mo13039a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12978b(Context context) {
        this.f20891d.mo13039a(ihe.m15438a(context).mo13010a(this.f20889b, this.f20888a.name, this.f20890c, 0));
    }
}
