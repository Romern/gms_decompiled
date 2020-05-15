package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.CreateFolderRequest;

/* renamed from: usr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class usr extends ush {

    /* renamed from: a */
    final /* synthetic */ txd f48615a;

    /* renamed from: b */
    final /* synthetic */ usx f48616b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public usr(usx usx, rkb rkb, txd txd) {
        super(rkb);
        this.f48616b = usx;
        this.f48615a = txd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        usn usn = (usn) rjd;
        this.f48615a.f46905a.mo18270a(usn.f43948r);
        usn.mo27951n().mo27124a(new CreateFolderRequest(this.f48616b.f48623a, this.f48615a.f46905a), new usp(this));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new usq(status, null);
    }
}
