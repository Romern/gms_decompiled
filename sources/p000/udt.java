package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnDownloadProgressResponse;

/* renamed from: udt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class udt implements ufx {

    /* renamed from: a */
    final /* synthetic */ udu f47317a;

    public udt(udu udu) {
        this.f47317a = udu;
    }

    /* renamed from: a */
    public final void mo27242a(int i) {
        boolean z;
        if (ufy.m38299a(i) && this.f47317a.mo27238f()) {
            this.f47317a.mo27249a(i);
            boolean z2 = false;
            switch (i) {
                case 2:
                case 3:
                case 4:
                case 6:
                    vcy vcy = this.f47317a.f47239c;
                    if (i == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    vcy.mo28291a(z);
                    udu udu = this.f47317a;
                    uey b = udu.mo27233b();
                    if (i == 6) {
                        z2 = true;
                    }
                    udu.mo27250a(b, z2);
                    return;
                case 5:
                case 7:
                case 8:
                    this.f47317a.mo27251b(new Status(ufy.m38302d(i), "Error downloading file", null));
                    return;
                default:
                    udu.f47318g.mo25374b("OpenContentsOperation", "Invalid state here: %s", Integer.valueOf(i));
                    return;
            }
        }
    }

    /* renamed from: a */
    public final void mo27243a(long j, long j2) {
        this.f47317a.f47319h = j2;
        udu udu = this.f47317a;
        if (udu.f47237a.f47160u) {
            try {
                udu.f47238b.mo27976a(new OnDownloadProgressResponse(j, j2, 0, null));
            } catch (RemoteException e) {
                udu.f47318g.mo25373b("OpenContentsOperation", "Failed to call download progress listener", e);
            }
        }
    }
}
