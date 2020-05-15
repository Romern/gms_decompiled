package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: ifu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ifu extends ift {

    /* renamed from: a */
    private final Account f20884a;

    /* renamed from: b */
    private final boolean f20885b;

    /* renamed from: c */
    private final int f20886c;

    /* renamed from: d */
    private final C1077iid f20887d;

    public ifu(C1077iid iid, Account account, boolean z, int i) {
        super("ForceCryptauthDeviceSync");
        sdo.m34959a(iid);
        this.f20887d = iid;
        this.f20884a = account;
        this.f20885b = z;
        this.f20886c = i;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f20887d.mo13039a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo12978b(Context context) {
        this.f20887d.mo13039a(iha.m15433a(context).mo13004a(this.f20884a.name, this.f20885b, this.f20886c, 0));
    }
}
