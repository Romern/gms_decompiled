package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;

/* renamed from: wft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wft extends dcj implements wfv {
    public wft(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.facs.cache.internal.IFacsCacheService");
    }

    /* renamed from: a */
    public final void mo29089a(wfs wfs) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, wfs);
        mo8528b(4, bj);
    }

    /* renamed from: b */
    public final void mo29093b(wfs wfs, FacsCacheCallOptions facsCacheCallOptions) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, wfs);
        dcl.m8165a(bj, facsCacheCallOptions);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo29090a(wfs wfs, FacsCacheCallOptions facsCacheCallOptions) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, wfs);
        dcl.m8165a(bj, facsCacheCallOptions);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo29091a(wfs wfs, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, wfs);
        bj.writeByteArray(bArr);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo29092a(wfs wfs, byte[] bArr, FacsCacheCallOptions facsCacheCallOptions) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, wfs);
        bj.writeByteArray(bArr);
        dcl.m8165a(bj, facsCacheCallOptions);
        mo8528b(2, bj);
    }
}
