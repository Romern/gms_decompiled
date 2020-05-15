package p000;

import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* renamed from: ufc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ufc implements ufg {

    /* renamed from: a */
    private final uih f47401a;

    /* renamed from: b */
    private final AppIdentity f47402b;

    /* renamed from: c */
    private final ukk f47403c;

    /* renamed from: d */
    private final MetadataBundle f47404d;

    /* renamed from: e */
    private final uaj f47405e;

    /* renamed from: f */
    private final String f47406f;

    /* renamed from: g */
    private final uaw f47407g;

    public ufc(uih uih, AppIdentity appIdentity, ukk ukk, MetadataBundle metadataBundle, uaj uaj, String str, uaw uaw) {
        sdo.m34959a(uih);
        this.f47401a = uih;
        sdo.m34959a(appIdentity);
        this.f47402b = appIdentity;
        sdo.m34959a(ukk);
        this.f47403c = ukk;
        this.f47404d = metadataBundle;
        sdo.m34959a(uaj);
        this.f47405e = uaj;
        this.f47406f = str;
        sdo.m34959a(uaw);
        this.f47407g = uaw;
        MetadataBundle metadataBundle2 = this.f47404d;
        boolean z = true;
        if (metadataBundle2 != null && metadataBundle2.mo18275c(uzm.f48737M)) {
            z = false;
        }
        sdo.m34974b(z);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo27273a(String str) {
        tyb tyb = new tyb(this.f47401a, this.f47402b, this.f47403c, str, this.f47404d, this.f47406f, this.f47407g);
        int a = this.f47405e.mo26998a(tyb);
        if (a != 0) {
            tyb = null;
        }
        return new ufa(a, tyb);
    }
}
