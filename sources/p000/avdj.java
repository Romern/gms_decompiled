package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import com.google.android.gms.udc.DeviceDataUploadOptedInAccountsParcelable;
import com.google.android.gms.udc.SettingDisplayInfo;
import com.google.android.gms.udc.UdcCacheResponse;
import java.util.List;

/* renamed from: avdj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avdj extends dcj implements avdl {
    public avdj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.udc.internal.IUdcCallbacks");
    }

    /* renamed from: a */
    public final void mo51154a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(9, bj);
    }

    /* renamed from: b */
    public final void mo51162b(Status status, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeByteArray(bArr);
        mo8530c(2, bj);
    }

    /* renamed from: c */
    public final void mo51163c(Status status, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeByteArray(bArr);
        mo8530c(3, bj);
    }

    /* renamed from: d */
    public final void mo51164d(Status status, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeByteArray(bArr);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo51155a(Status status, PendingIntent pendingIntent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, pendingIntent);
        mo8530c(6, bj);
    }

    /* renamed from: a */
    public final void mo51156a(Status status, DeviceDataUploadOptInFlags deviceDataUploadOptInFlags) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, deviceDataUploadOptInFlags);
        mo8530c(10, bj);
    }

    /* renamed from: a */
    public final void mo51157a(Status status, DeviceDataUploadOptedInAccountsParcelable deviceDataUploadOptedInAccountsParcelable) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, deviceDataUploadOptedInAccountsParcelable);
        mo8530c(11, bj);
    }

    /* renamed from: a */
    public final void mo51158a(Status status, SettingDisplayInfo settingDisplayInfo, PendingIntent pendingIntent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, settingDisplayInfo);
        dcl.m8165a(bj, pendingIntent);
        mo8530c(7, bj);
    }

    /* renamed from: a */
    public final void mo51159a(Status status, UdcCacheResponse udcCacheResponse) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, udcCacheResponse);
        mo8530c(8, bj);
    }

    /* renamed from: a */
    public final void mo51160a(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(list);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo51161a(Status status, byte[] bArr) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeByteArray(bArr);
        mo8530c(1, bj);
    }
}
