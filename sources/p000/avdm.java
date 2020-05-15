package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcSettingsListActivityRequest;
import com.google.android.gms.udc.UdcWriteLocalSettingsRequest;

/* renamed from: avdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avdm extends dcj implements avdo {
    public avdm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.udc.internal.IUdcService");
    }

    /* renamed from: a */
    public final void mo51165a(avdl avdl) {
        throw null;
    }

    /* renamed from: a */
    public final void mo51167a(avdl avdl, UdcSettingsListActivityRequest udcSettingsListActivityRequest) {
        throw null;
    }

    /* renamed from: a */
    public final void mo51169a(avdl avdl, byte[] bArr) {
        throw null;
    }

    /* renamed from: b */
    public final void mo51170b(avdl avdl) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, avdl);
        mo8528b(11, bj);
    }

    /* renamed from: b */
    public final void mo51171b(avdl avdl, byte[] bArr) {
        throw null;
    }

    /* renamed from: c */
    public final void mo51172c(avdl avdl) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, avdl);
        mo8528b(12, bj);
    }

    /* renamed from: d */
    public final void mo51174d(avdl avdl, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, avdl);
        bj.writeByteArray(bArr);
        mo8528b(4, bj);
    }

    /* renamed from: e */
    public final void mo51175e(avdl avdl, byte[] bArr) {
        throw null;
    }

    /* renamed from: f */
    public final void mo51176f(avdl avdl, byte[] bArr) {
        throw null;
    }

    /* renamed from: a */
    public final void mo51166a(avdl avdl, UdcCacheRequest udcCacheRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, avdl);
        dcl.m8165a(bj, udcCacheRequest);
        mo8528b(8, bj);
    }

    /* renamed from: c */
    public final void mo51173c(avdl avdl, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, avdl);
        bj.writeByteArray(bArr);
        mo8528b(3, bj);
    }

    /* renamed from: a */
    public final void mo51168a(avdl avdl, UdcWriteLocalSettingsRequest udcWriteLocalSettingsRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, avdl);
        dcl.m8165a(bj, udcWriteLocalSettingsRequest);
        mo8528b(10, bj);
    }
}
