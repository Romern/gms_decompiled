package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.GetMetadataRequest;

/* renamed from: usw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class usw extends ush {

    /* renamed from: a */
    final /* synthetic */ usx f48622a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public usw(usx usx, rkb rkb) {
        super(rkb);
        this.f48622a = usx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((usn) rjd).mo27951n().mo27130a(new GetMetadataRequest(this.f48622a.f48623a, false), new usu(this));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new usv(status, null);
    }
}
