package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: fzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fzt extends dcj implements IInterface {
    public fzt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.apppreviewmessaging.internal.IAppPreviewMessagingCallback");
    }

    /* renamed from: a */
    public final void mo11566a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo11567a(Status status, DataHolder dataHolder) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, dataHolder);
        mo8530c(1, bj);
    }
}
