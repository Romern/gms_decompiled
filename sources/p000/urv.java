package p000;

import com.google.android.gms.drive.internal.QueryRequest;
import com.google.android.gms.drive.query.Query;

/* renamed from: urv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class urv extends ush {

    /* renamed from: a */
    final /* synthetic */ Query f48579a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public urv(rkb rkb, Query query) {
        super(rkb);
        this.f48579a = query;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((usn) rjd).mo27951n().mo27134a(new QueryRequest(this.f48579a), new C1597usb(this));
    }
}
