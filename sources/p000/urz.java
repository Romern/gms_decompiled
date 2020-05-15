package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.CreateFileRequest;

/* renamed from: urz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class urz extends ush {

    /* renamed from: a */
    final /* synthetic */ txd f48583a;

    /* renamed from: b */
    final /* synthetic */ DriveId f48584b;

    /* renamed from: c */
    final /* synthetic */ int f48585c;

    /* renamed from: m */
    final /* synthetic */ int f48586m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public urz(rkb rkb, txd txd, DriveId driveId, int i, int i2) {
        super(rkb);
        this.f48583a = txd;
        this.f48584b = driveId;
        this.f48585c = i;
        this.f48586m = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        usn usn = (usn) rjd;
        this.f48583a.f46905a.mo18270a(usn.f43948r);
        usn.mo27951n().mo27123a(new CreateFileRequest(this.f48584b, this.f48583a.f46905a, null, this.f48586m, false, null, 0, this.f48585c), new urx(this));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ rkk mo11187b(Status status) {
        return new ury(status, null);
    }
}
