package p000;

import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.gms.contextmanager.fence.internal.FenceQueryRequestImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.InterestUpdateBatchImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: tmr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface tmr extends IInterface {
    /* renamed from: a */
    void mo9985a(tmo tmo, String str, String str2, String str3, SnapshotRequest snapshotRequest);

    /* renamed from: a */
    void mo9986a(tmo tmo, String str, String str2, String str3, ContextFenceStub contextFenceStub);

    /* renamed from: a */
    void mo9987a(tmo tmo, String str, String str2, String str3, FenceQueryRequestImpl fenceQueryRequestImpl);

    /* renamed from: a */
    void mo9988a(tmo tmo, String str, String str2, String str3, FenceUpdateRequestImpl fenceUpdateRequestImpl);

    /* renamed from: a */
    void mo9989a(tmo tmo, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl);

    /* renamed from: a */
    void mo9990a(tmo tmo, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, tml tml);

    /* renamed from: a */
    void mo9991a(tmo tmo, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl, tml tml, PendingIntent pendingIntent);

    /* renamed from: a */
    void mo9992a(tmo tmo, String str, String str2, String str3, InterestUpdateBatchImpl interestUpdateBatchImpl);

    /* renamed from: a */
    void mo9993a(tmo tmo, String str, String str2, String str3, WriteBatchImpl writeBatchImpl);

    /* renamed from: a */
    void mo9994a(tmo tmo, String str, String str2, String str3, tml tml);

    /* renamed from: a */
    void mo9995a(tmo tmo, String str, String str2, String str3, tml tml, PendingIntent pendingIntent);

    /* renamed from: b */
    void mo9996b(tmo tmo, String str, String str2, String str3, ContextDataFilterImpl contextDataFilterImpl);
}
