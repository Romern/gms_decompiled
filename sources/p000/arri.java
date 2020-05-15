package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.smartdevice.directtransfer.DirectTransferConfigurations;

/* renamed from: arri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arri extends dcj implements arrk {
    public arri(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.directtransfer.internal.ISourceDirectTransferService");
    }

    /* renamed from: a */
    public final void mo48763a(arrh arrh) {
        throw null;
    }

    /* renamed from: a */
    public final void mo48765a(arrh arrh, DirectTransferConfigurations directTransferConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, arik arik) {
        throw null;
    }

    /* renamed from: a */
    public final void mo48764a(arrh arrh, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, arrh);
        dcl.m8165a(bj, bundle);
        mo8530c(3, bj);
    }
}
