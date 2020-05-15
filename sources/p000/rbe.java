package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: rbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rbe extends dcj implements rbg {
    public rbe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    /* renamed from: a */
    public final void mo24340a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo24343a(Status status, LogEventParcelable[] logEventParcelableArr) {
        throw null;
    }

    /* renamed from: b */
    public final void mo24345b(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }

    /* renamed from: c */
    public final void mo24348c(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(4, bj);
    }

    /* renamed from: a */
    public final void mo24341a(Status status, long j) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeLong(j);
        mo8530c(3, bj);
    }

    /* renamed from: b */
    public final void mo24346b(Status status, long j) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeLong(j);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo24342a(Status status, CollectForDebugParcelable collectForDebugParcelable) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, collectForDebugParcelable);
        mo8530c(8, bj);
    }

    /* renamed from: b */
    public final void mo24347b(Status status, CollectForDebugParcelable collectForDebugParcelable) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        dcl.m8165a(bj, collectForDebugParcelable);
        mo8530c(9, bj);
    }

    /* renamed from: a */
    public final void mo24344a(DataHolder dataHolder) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataHolder);
        mo8530c(7, bj);
    }
}
