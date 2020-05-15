package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceTriggerInfoImpl;

/* renamed from: tks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tks extends dcj implements tku {
    public tks(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
    }

    /* renamed from: a */
    public final void mo9519a(FenceStateImpl fenceStateImpl) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, fenceStateImpl);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo9520a(FenceTriggerInfoImpl fenceTriggerInfoImpl) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, fenceTriggerInfoImpl);
        mo8528b(1, bj);
    }
}
