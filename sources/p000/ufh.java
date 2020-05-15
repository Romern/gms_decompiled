package p000;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: ufh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ufh implements ufg {

    /* renamed from: a */
    private final uih f47425a;

    /* renamed from: b */
    private final AppIdentity f47426b;

    /* renamed from: c */
    private final MetadataBundle f47427c;

    /* renamed from: d */
    private final DriveId f47428d;

    /* renamed from: e */
    private final uaj f47429e;

    /* renamed from: f */
    private final uaw f47430f;

    public ufh(uih uih, AppIdentity appIdentity, MetadataBundle metadataBundle, DriveId driveId, uaj uaj, uaw uaw) {
        this.f47425a = uih;
        this.f47426b = appIdentity;
        this.f47427c = metadataBundle;
        this.f47428d = driveId;
        this.f47429e = uaj;
        this.f47430f = uaw;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo27273a(String str) {
        tyd tyd = new tyd(this.f47425a, this.f47426b, str, this.f47427c, this.f47428d, this.f47430f);
        int a = this.f47429e.mo26998a(tyd);
        if (a != 0) {
            tyd = null;
        }
        return new ufa(a, tyd);
    }
}
