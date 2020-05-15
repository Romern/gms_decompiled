package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: arjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arjg extends dcj implements arji {
    public arjg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceService");
    }

    /* renamed from: a */
    public final String mo48492a(BootstrapOptions bootstrapOptions) {
        throw null;
    }

    /* renamed from: a */
    public final void mo48494a(arjf arjf, arjc arjc) {
        throw null;
    }

    /* renamed from: a */
    public final void mo48497a(arjf arjf, BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, arik arik) {
        throw null;
    }

    /* renamed from: a */
    public final void mo48498a(artk artk) {
        throw null;
    }

    /* renamed from: a */
    public final void mo48499a(artk artk, HandshakeData handshakeData) {
        throw null;
    }

    /* renamed from: b */
    public final void mo48501b(arjf arjf) {
        throw null;
    }

    /* renamed from: b */
    public final void mo48502b(artk artk) {
        throw null;
    }

    /* renamed from: b */
    public final void mo48503b(artk artk, HandshakeData handshakeData) {
        throw null;
    }

    /* renamed from: c */
    public final void mo48505c(arjf arjf) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arjf);
        mo8530c(19, bj);
    }

    /* renamed from: d */
    public final void mo48506d(arjf arjf) {
        throw null;
    }

    /* renamed from: e */
    public final void mo48507e(arjf arjf) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arjf);
        mo8530c(16, bj);
    }

    /* renamed from: f */
    public final void mo48508f(arjf arjf) {
        throw null;
    }

    /* renamed from: a */
    public final void mo48493a(arjf arjf) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arjf);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo48495a(arjf arjf, BootstrapOptions bootstrapOptions, arjc arjc) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arjf);
        dcl.m8165a(bj, bootstrapOptions);
        dcl.m8164a(bj, arjc);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo48496a(arjf arjf, BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, arij arij) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arjf);
        dcl.m8165a(bj, bootstrapOptions);
        bj.writeTypedArray(parcelFileDescriptorArr, 0);
        dcl.m8164a(bj, arij);
        mo8530c(20, bj);
    }
}
