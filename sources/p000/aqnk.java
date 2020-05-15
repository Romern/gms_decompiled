package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.signin.internal.AuthAccountResult;

/* renamed from: aqnk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqnk extends aqnm {

    /* renamed from: a */
    final /* synthetic */ AuthAccountRequest f86389a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aqnk(rkb rkb, AuthAccountRequest authAccountRequest) {
        super(rkb);
        this.f86389a = authAccountRequest;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((aqof) ((aqoj) rjd).mo25289B()).mo48001a(this.f86389a, new aqnj(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new AuthAccountResult(8, null);
    }
}
