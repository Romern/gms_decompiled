package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.userlocation.SemanticLocation;

/* renamed from: avxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avxh extends dcj implements IInterface {
    public avxh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.userlocation.internal.ISemanticLocationProviderCallbacks");
    }

    /* renamed from: a */
    public final void mo51685a(Status status, SemanticLocation semanticLocation) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, semanticLocation);
        mo8530c(1, bj);
    }
}
