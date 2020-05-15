package p000;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.AuthorizeAccessRequest;

/* renamed from: uso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uso extends usg {

    /* renamed from: a */
    final /* synthetic */ long f48610a;

    /* renamed from: b */
    final /* synthetic */ DriveId f48611b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uso(rkb rkb, long j, DriveId driveId) {
        super(rkb);
        this.f48610a = j;
        this.f48611b = driveId;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo11186a(rjd rjd) {
        ((usn) rjd).mo27951n().mo27115a(new AuthorizeAccessRequest(this.f48610a, this.f48611b), new uuv(this));
    }
}
