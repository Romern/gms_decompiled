package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;

/* renamed from: brsm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brsm extends dcj implements IInterface {
    public brsm(IBinder iBinder) {
        super(iBinder, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
    }

    /* renamed from: a */
    public final void mo69837a(Status status, DynamicLinkData dynamicLinkData) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, dynamicLinkData);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo69838a(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, shortDynamicLinkImpl);
        mo8530c(2, bj);
    }
}
