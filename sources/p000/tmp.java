package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: tmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tmp extends dcj implements tmr {
    public tmp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.contextmanager.internal.IContextManagerService");
    }

    /* renamed from: a */
    public final void mo9985a(tmo tmo, String str, String str2, String str3, SnapshotRequest snapshotRequest) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, tmo);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        dcl.m8165a(bj, snapshotRequest);
        mo8528b(15, bj);
    }

    /* renamed from: a */
    public final void mo9986a(tmo tmo, String str, String str2, String str3, ContextFenceStub contextFenceStub) {
        throw null;
    }

    /* renamed from: a */
    public final void mo9987a(tmo tmo, String str, String str2, String str3, FenceQueryRequestImpl fenceQueryRequestImpl) {
        throw null;
    }

    /* renamed from: a */
    public final void mo9990a(tmo tmo, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, tml tml) {
        throw null;
    }

    /* renamed from: a */
    public final void mo9993a(tmo tmo, String str, String str2, String str3, WriteBatchImpl writeBatchImpl) {
        throw null;
    }

    /* renamed from: a */
    public final void mo9994a(tmo tmo, String str, String str2, String str3, tml tml) {
        throw null;
    }

    /* renamed from: b */
    public final void mo9996b(tmo tmo, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, tmo);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        dcl.m8165a(bj, contextDataFilterImpl);
        dcl.m8165a(bj, (Parcelable) null);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo9988a(tmo tmo, String str, String str2, String str3, FenceUpdateRequestImpl fenceUpdateRequestImpl) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, tmo);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        dcl.m8165a(bj, fenceUpdateRequestImpl);
        mo8528b(13, bj);
    }

    /* renamed from: a */
    public final void mo9989a(tmo tmo, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, tmo);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        dcl.m8165a(bj, contextDataFilterImpl);
        mo8528b(14, bj);
    }

    /* renamed from: a */
    public final void mo9991a(tmo tmo, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, tml tml, PendingIntent pendingIntent) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, tmo);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        dcl.m8165a(bj, contextDataFilterImpl);
        dcl.m8165a(bj, (Parcelable) null);
        dcl.m8164a(bj, tml);
        dcl.m8165a(bj, pendingIntent);
        mo8528b(5, bj);
    }

    /* renamed from: a */
    public final void mo9992a(tmo tmo, String str, String str2, String str3, InterestUpdateBatchImpl interestUpdateBatchImpl) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, tmo);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        dcl.m8165a(bj, interestUpdateBatchImpl);
        mo8528b(12, bj);
    }

    /* renamed from: a */
    public final void mo9995a(tmo tmo, String str, String str2, String str3, tml tml, PendingIntent pendingIntent) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, tmo);
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeString(str3);
        dcl.m8164a(bj, tml);
        dcl.m8165a(bj, pendingIntent);
        mo8528b(6, bj);
    }
}
