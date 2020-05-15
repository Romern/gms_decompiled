package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.download.DownloadDetails;

/* renamed from: ryk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ryk extends dcj implements rym {
    public ryk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.download.internal.IDownloadService");
    }

    /* renamed from: a */
    public final void mo25241a(ryp ryp, DownloadDetails downloadDetails) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, ryp);
        dcl.m8165a(bj, downloadDetails);
        mo8528b(4, bj);
    }

    /* renamed from: b */
    public final void mo25243b(ryp ryp, String str) {
        throw null;
    }

    /* renamed from: c */
    public final void mo25244c(ryp ryp, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, ryp);
        bj.writeString(str);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo25242a(ryp ryp, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, ryp);
        bj.writeString(str);
        mo8528b(1, bj);
    }
}
