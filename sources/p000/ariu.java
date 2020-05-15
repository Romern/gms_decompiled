package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import com.google.android.gms.smartdevice.d2d.internal.ConnectParams;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;

/* renamed from: ariu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ariu extends dcj implements ariw {
    public ariu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceService");
    }

    /* renamed from: a */
    public final void mo48403a(arit arit) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arit);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo48406a(arit arit, BootstrapConfigurations bootstrapConfigurations) {
        throw null;
    }

    /* renamed from: b */
    public final void mo48416b(arit arit) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arit);
        mo8530c(6, bj);
    }

    /* renamed from: c */
    public final void mo48420c(arit arit) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arit);
        mo8530c(9, bj);
    }

    /* renamed from: d */
    public final void mo48421d(arit arit) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arit);
        mo8530c(11, bj);
    }

    /* renamed from: a */
    public final void mo48404a(arit arit, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arit);
        dcl.m8165a(bj, bundle);
        mo8530c(7, bj);
    }

    /* renamed from: b */
    public final void mo48417b(arit arit, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arit);
        dcl.m8165a(bj, bundle);
        mo8530c(16, bj);
    }

    /* renamed from: a */
    public final void mo48405a(arit arit, ariz ariz) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arit);
        dcl.m8164a(bj, ariz);
        mo8530c(1, bj);
    }

    /* renamed from: b */
    public final void mo48418b(artk artk, HandshakeData handshakeData) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, artk);
        dcl.m8165a(bj, handshakeData);
        mo8530c(21, bj);
    }

    /* renamed from: a */
    public final void mo48407a(arit arit, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, arij arij) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arit);
        dcl.m8165a(bj, bootstrapConfigurations);
        bj.writeTypedArray(parcelFileDescriptorArr, 0);
        dcl.m8164a(bj, arij);
        mo8530c(23, bj);
    }

    /* renamed from: a */
    public final void mo48408a(arit arit, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, arik arik) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arit);
        dcl.m8165a(bj, bootstrapConfigurations);
        bj.writeTypedArray(parcelFileDescriptorArr, 0);
        dcl.m8164a(bj, arik);
        mo8530c(10, bj);
    }

    /* renamed from: a */
    public final void mo48409a(arit arit, D2DDevice d2DDevice, BootstrapConfigurations bootstrapConfigurations, arin arin) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arit);
        dcl.m8165a(bj, d2DDevice);
        dcl.m8165a(bj, bootstrapConfigurations);
        dcl.m8164a(bj, arin);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo48410a(arit arit, D2DDevice d2DDevice, String str, ariq ariq) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arit);
        dcl.m8165a(bj, d2DDevice);
        bj.writeString(str);
        dcl.m8164a(bj, ariq);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo48411a(arit arit, String str) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arit);
        bj.writeString(null);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo48412a(artk artk) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, artk);
        mo8530c(19, bj);
    }

    /* renamed from: a */
    public final void mo48413a(artk artk, HandshakeData handshakeData) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, artk);
        dcl.m8165a(bj, handshakeData);
        mo8530c(20, bj);
    }

    /* renamed from: a */
    public final void mo48414a(ConnectParams connectParams) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, connectParams);
        mo8530c(22, bj);
    }
}
