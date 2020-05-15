package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: gtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class gtl extends rpa {

    /* renamed from: b */
    protected aucf f18992b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12197a(Status status) {
        this.f18992b.mo50390a((Exception) new gtp(status));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12188a(gun gun);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12198a(Object obj) {
        this.f18992b.mo50391a(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11798a(rjd rjd, aucf aucf) {
        this.f18992b = aucf;
        mo12188a((gun) ((gug) rjd).mo25289B());
    }
}
