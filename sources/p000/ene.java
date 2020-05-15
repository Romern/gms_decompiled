package p000;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;

/* renamed from: ene */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ene extends dck implements IInterface {

    /* renamed from: a */
    final /* synthetic */ BlockingQueue f15320a;

    public ene() {
        super("com.google.android.finsky.zapp.protocol.IPlayModuleServiceCallbacks");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        int readInt = parcel.readInt();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
        Bundle bundle = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
        if (this.f15320a.peek() != null) {
            return true;
        }
        this.f15320a.add(new ems(readInt, createTypedArrayList, bundle));
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ene(BlockingQueue blockingQueue) {
        super("com.google.android.finsky.zapp.protocol.IPlayModuleServiceCallbacks");
        this.f15320a = blockingQueue;
    }
}
