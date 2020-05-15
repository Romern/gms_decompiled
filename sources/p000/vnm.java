package p000;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.p039ui.select.path.FolderPathElement;
import com.google.android.gms.drive.p039ui.select.path.PathElement;
import com.google.android.gms.drive.p039ui.select.path.PathStack;

/* renamed from: vnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vnm implements rkl {

    /* renamed from: a */
    final /* synthetic */ PathStack f49582a;

    /* renamed from: b */
    private final DriveId f49583b;

    /* renamed from: c */
    private final boolean f49584c;

    /* renamed from: d */
    private final boolean f49585d;

    public vnm(PathStack pathStack, DriveId driveId, boolean z, boolean z2) {
        this.f49582a = pathStack;
        this.f49583b = driveId;
        this.f49584c = z;
        this.f49585d = z2;
    }

    /* renamed from: a */
    private final void m40892a(PathElement pathElement) {
        this.f49582a.f31211c.set(0, pathElement);
        this.f49582a.mo18346a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        usa usa = (usa) rkk;
        if (usa.f48587a.mo17710c()) {
            txb txb = usa.f48588b;
            try {
                if (txb.mo24660a() > 0) {
                    twz b = txb.mo24661a(0);
                    if (!b.mo26854a().equals(this.f49583b)) {
                        m40892a(new FolderPathElement(b));
                    } else {
                        m40892a(vnr.f49586a);
                    }
                } else if (this.f49584c) {
                    m40892a(vnr.f49587b);
                } else if (!this.f49585d) {
                    m40892a(vnr.f49586a);
                } else {
                    m40892a(vnr.f49588c);
                }
            } finally {
                txb.mo12460c();
            }
        } else {
            PathStack.f31209a.mo25375b("Unable to list parents, status: %s", usa.f48587a);
        }
    }
}
