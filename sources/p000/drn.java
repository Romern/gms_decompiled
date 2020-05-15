package p000;

import android.os.RemoteException;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.fence.internal.FenceStateImpl;
import com.google.android.gms.contextmanager.fence.internal.FenceStateMapImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;

/* renamed from: drn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class drn {
    /* renamed from: a */
    public static void m9163a(tmo tmo, int i) {
        try {
            tmo.mo9545a(new Status(i));
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("drn", "a", 34, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[Callbacks] Can't return status to client.");
        }
    }

    /* renamed from: b */
    public static void m9169b(tmo tmo, int i, DataHolder dataHolder) {
        try {
            tmo.mo9547a(new Status(i), dataHolder);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("drn", "b", 68, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[Callbacks] Can't return read result to client.");
        }
    }

    /* renamed from: a */
    public static void m9164a(tmo tmo, int i, Snapshot snapshot) {
        try {
            tmo.mo9546a(new Status(i), snapshot);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("drn", "a", 99, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[Callbacks] Can't return snapshot result to client.");
        }
    }

    /* renamed from: a */
    public static void m9165a(tmo tmo, int i, DataHolder dataHolder) {
        try {
            tmo.mo9552b(new Status(i), dataHolder);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("drn", "a", 51, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[Callbacks] Can't return read result to client.");
        }
    }

    /* renamed from: a */
    public static void m9166a(tmo tmo, int i, FenceStateImpl fenceStateImpl) {
        try {
            tmo.mo9548a(new Status(i), fenceStateImpl);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("drn", "a", 128, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[Callbacks] Can't return fence evaluate result to client.");
        }
    }

    /* renamed from: a */
    public static void m9167a(tmo tmo, int i, FenceStateMapImpl fenceStateMapImpl) {
        try {
            tmo.mo9549a(new Status(i), fenceStateMapImpl);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("drn", "a", 116, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[Callbacks] Can't return fence state query result to client.");
        }
    }

    /* renamed from: a */
    public static void m9168a(tmo tmo, int i, WriteBatchImpl writeBatchImpl) {
        try {
            tmo.mo9550a(new Status(i), writeBatchImpl);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("drn", "a", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[Callbacks] Can't return write batch result to client.");
        }
    }
}
