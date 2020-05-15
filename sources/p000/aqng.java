package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* renamed from: aqng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqng extends aqnm {

    /* renamed from: a */
    final /* synthetic */ int f86385a;

    /* renamed from: b */
    final /* synthetic */ Account f86386b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqng(rkb rkb, int i, Account account) {
        super(rkb);
        this.f86385a = i;
        this.f86386b = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((aqof) ((aqoj) rjd).mo25289B()).mo47999a(this.f86385a, this.f86386b, new aqnf(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return status;
    }
}
