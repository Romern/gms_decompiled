package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.location.nearby.direct.client.internal.OperationRequest;
import com.google.location.nearby.direct.client.internal.OperationResponse;

/* renamed from: bvay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvay extends dcj implements bvba {
    public bvay(IBinder iBinder) {
        super(iBinder, "com.google.location.nearby.direct.client.internal.INearbyDirectService");
    }

    /* renamed from: a */
    public final OperationResponse mo73267a(OperationRequest operationRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, operationRequest);
        Parcel a = mo8526a(1, bj);
        OperationResponse operationResponse = (OperationResponse) dcl.m8163a(a, OperationResponse.CREATOR);
        a.recycle();
        return operationResponse;
    }

    /* renamed from: b */
    public final OperationResponse mo73269b(OperationRequest operationRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, operationRequest);
        Parcel a = mo8526a(3, bj);
        OperationResponse operationResponse = (OperationResponse) dcl.m8163a(a, OperationResponse.CREATOR);
        a.recycle();
        return operationResponse;
    }

    /* renamed from: c */
    public final boolean mo73270c(OperationRequest operationRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, operationRequest);
        Parcel a = mo8526a(4, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final boolean mo73271d(OperationRequest operationRequest) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, operationRequest);
        Parcel a = mo8526a(5, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final OperationResponse mo73268a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(2, bj);
        OperationResponse operationResponse = (OperationResponse) dcl.m8163a(a, OperationResponse.CREATOR);
        a.recycle();
        return operationResponse;
    }
}
