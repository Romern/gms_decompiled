package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.OnContentsResponse;
import com.google.android.gms.drive.internal.OpenContentsRequest;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: udu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class udu extends uco {

    /* renamed from: g */
    public static final sbw f47318g = new sbw("OpenContentsOperation", "");

    /* renamed from: h */
    public volatile long f47319h = -1;

    /* renamed from: i */
    private final ubq f47320i;

    /* renamed from: j */
    private final OpenContentsRequest f47321j;

    /* renamed from: k */
    private final ufx f47322k = new udt(this);

    /* renamed from: l */
    private volatile uga f47323l;

    /* renamed from: o */
    private final AtomicBoolean f47324o = new AtomicBoolean(false);

    /* renamed from: p */
    private final veg f47325p;

    public udu(ubk ubk, ubq ubq, OpenContentsRequest openContentsRequest, veg veg, uto uto) {
        super("OpenContentsOperation", ubk, uto, 14);
        this.f47320i = ubq;
        this.f47321j = openContentsRequest;
        this.f47325p = veg;
    }

    /* renamed from: d */
    private final void m38197d() {
        DriveId driveId;
        if (!this.f47324o.getAndSet(true)) {
            OpenContentsRequest openContentsRequest = this.f47321j;
            if (openContentsRequest != null) {
                driveId = openContentsRequest.f30900a;
            } else {
                driveId = null;
            }
            if (driveId != null) {
                this.f47237a.mo27085a(this.f47239c, driveId);
            }
        }
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }

    /* renamed from: b */
    public final void mo27251b(Status status) {
        vcv g = this.f47239c.mo28306g();
        g.mo28257b(status.f30115i);
        if (this.f47237a.f47160u) {
            try {
                this.f47238b.mo27107a(status);
            } catch (RemoteException e) {
                g.mo28256b();
            }
        }
        g.mo28254a();
        vcy vcy = this.f47239c;
        vcy.mo28307h();
        vcy.mo28274a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo27237e() {
        aaal.m21020a(this.f47321j, "Invalid open contents request: no request");
        aaal.m21020a(this.f47321j.f30900a, "Invalid open contents request: no id");
        int i = this.f47321j.f30901b;
        boolean z = true;
        if (!(i == 268435456 || i == 536870912 || i == 805306368)) {
            z = false;
        }
        aaal.m21021a(z, "Invalid open contents request: invalid mode");
        m38197d();
        this.f47239c.mo28295b(this.f47321j.f30901b);
        ujx b = this.f47237a.mo27088b(this.f47321j.f30900a);
        if (b.mo27568ad()) {
            int i2 = this.f47321j.f30901b;
            if (!(i2 == 805306368 || i2 == 536870912) || b.mo27524B()) {
                uey b2 = mo27233b();
                OpenContentsRequest openContentsRequest = this.f47321j;
                if (openContentsRequest.f30901b == 536870912) {
                    mo27250a(b2, false);
                    mo27238f();
                    return;
                }
                this.f47323l = this.f47237a.mo27077a(openContentsRequest.f30900a, this.f47322k);
                return;
            }
            throw new aaaj(10, "The user cannot edit the resource.");
        }
        throw new aaaj(10, "This file is not openable.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo27240h() {
        m38197d();
        mo27249a(4);
        vcv g = this.f47239c.mo28306g();
        g.mo28257b(16);
        if (this.f47323l != null) {
            this.f47323l.mo27305a();
        }
        if (this.f47237a.f47160u) {
            try {
                this.f47238b.mo27107a(Status.f30111e);
            } catch (RemoteException e) {
                f47318g.mo25373b("OpenContentsOperation", "Failed to report error to client", e);
                g.mo28256b();
            }
        }
        g.mo28254a();
        vcy vcy = this.f47239c;
        vcy.mo28307h();
        vcy.mo28274a();
    }

    /* renamed from: a */
    public final void mo27249a(int i) {
        this.f47239c.mo28278a(2, i, this.f47319h >= 0 ? Long.valueOf(this.f47319h) : null, this.f47325p.mo28344b());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ubq.a(uey, int, com.google.android.gms.drive.metadata.internal.MetadataBundle, boolean, uaw):void
     arg types: [uey, int, com.google.android.gms.drive.metadata.internal.MetadataBundle, int, uaw]
     candidates:
      ubq.a(uey, int, com.google.android.gms.drive.metadata.internal.MetadataBundle, com.google.android.gms.drive.DriveId, uaw):com.google.android.gms.drive.DriveId
      ubq.a(uey, int, com.google.android.gms.drive.metadata.internal.MetadataBundle, boolean, uaw):void */
    /* renamed from: a */
    public final void mo27250a(uey uey, boolean z) {
        try {
            ujx b = this.f47237a.mo27088b(this.f47321j.f30900a);
            ubq ubq = this.f47320i;
            OpenContentsRequest openContentsRequest = this.f47321j;
            OnContentsResponse onContentsResponse = new OnContentsResponse(((ubp) ubq).mo27163a(uey, b, openContentsRequest.f30902c, openContentsRequest.f30901b, this.f47238b.asBinder()), z);
            boolean z2 = true;
            if (this.f47237a.f47160u) {
                try {
                    this.f47238b.mo27975a(onContentsResponse);
                    z2 = false;
                } catch (RemoteException e) {
                    f47318g.mo25373b("OpenContentsOperation", "Error returning opened contents to client", e);
                    vcv g = this.f47239c.mo28306g();
                    g.mo28256b();
                    g.mo28254a();
                }
            }
            vcy vcy = this.f47239c;
            vcy.mo28307h();
            vcy.mo28274a();
            if (z2) {
                try {
                    this.f47320i.mo27167a(uey, onContentsResponse.f30872a.f30721b, MetadataBundle.m23056a(), false, uaw.f47070a);
                } catch (aaaj e2) {
                    f47318g.mo25373b("OpenContentsOperation", "Failed to close file", e2);
                }
            }
        } catch (aaaj e3) {
            mo27251b(e3.f27843a);
        }
    }
}
