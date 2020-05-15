package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;

/* renamed from: ptr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ptr extends dcj implements ptt {
    public ptr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    /* renamed from: a */
    public final void mo23001a(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(1, bj);
    }

    /* renamed from: b */
    public final void mo23010b(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(14, bj);
    }

    /* renamed from: c */
    public final void mo23011c(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(15, bj);
    }

    /* renamed from: d */
    public final void mo23012d(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(3, bj);
    }

    /* renamed from: e */
    public final void mo23013e(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(8, bj);
    }

    /* renamed from: f */
    public final void mo23014f(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(2001);
        mo8530c(7, bj);
    }

    /* renamed from: g */
    public final void mo23015g(int i) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        mo8530c(9, bj);
    }

    /* renamed from: a */
    public final void mo23002a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, applicationMetadata);
        bj.writeString(str);
        bj.writeString(str2);
        dcl.m8166a(bj, z);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo23003a(ApplicationStatus applicationStatus) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, applicationStatus);
        mo8530c(12, bj);
    }

    /* renamed from: a */
    public final void mo23004a(DeviceStatus deviceStatus) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, deviceStatus);
        mo8530c(13, bj);
    }

    /* renamed from: a */
    public final void mo23005a(String str, double d, boolean z) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeDouble(d);
        dcl.m8166a(bj, z);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo23006a(String str, long j) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeLong(j);
        mo8530c(11, bj);
    }

    /* renamed from: a */
    public final void mo23007a(String str, long j, int i) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeLong(j);
        bj.writeInt(i);
        mo8530c(10, bj);
    }

    /* renamed from: a */
    public final void mo23008a(String str, String str2) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo23009a(String str, byte[] bArr) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeByteArray(bArr);
        mo8530c(6, bj);
    }
}
