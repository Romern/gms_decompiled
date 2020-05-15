package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.QueryRequest;
import com.google.android.gms.drive.query.Query;

/* renamed from: usi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class usi extends ush {

    /* renamed from: a */
    final /* synthetic */ Query f48594a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public usi(rkb rkb, Query query) {
        super(rkb);
        this.f48594a = query;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((usn) rjd).mo27951n().mo27149b(new QueryRequest(this.f48594a), new usl(this));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new usm(status);
    }
}
