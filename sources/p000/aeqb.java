package p000;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

/* renamed from: aeqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeqb extends rle {

    /* renamed from: a */
    final /* synthetic */ Account f63619a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aeqb(rkb rkb, Account account) {
        super(aeqc.f63620a, rkb);
        this.f63619a = account;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        super.mo17716a((rkk) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new aeqo(status, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        aeqn aeqn = (aeqn) rjd;
        Account account = this.f63619a;
        aeqn.mo25288A();
        mo17716a((rkk) new aeqo(Status.f30107a, ((aeql) aeqn.mo25289B()).mo34460a(account)));
    }
}
