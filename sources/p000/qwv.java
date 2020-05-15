package p000;

import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: qwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qwv extends rbf {

    /* renamed from: a */
    private final aucf f42351a;

    public qwv(aucf aucf) {
        this.f42351a = aucf;
    }

    /* renamed from: a */
    public final void mo24340a(Status status) {
        rpc.m34201a(status, this.f42351a);
    }

    /* renamed from: b */
    public final void mo24345b(Status status) {
        rpc.m34201a(status, this.f42351a);
    }

    /* renamed from: c */
    public final void mo24348c(Status status) {
        rpc.m34201a(status, this.f42351a);
    }

    /* renamed from: a */
    public final void mo24341a(Status status, long j) {
        rpc.m34202a(status, Long.valueOf(j), this.f42351a);
    }

    /* renamed from: b */
    public final void mo24346b(Status status, long j) {
        rpc.m34202a(status, Long.valueOf(j), this.f42351a);
    }

    /* renamed from: a */
    public final void mo24342a(Status status, CollectForDebugParcelable collectForDebugParcelable) {
        rpc.m34202a(status, collectForDebugParcelable, this.f42351a);
    }

    /* renamed from: b */
    public final void mo24347b(Status status, CollectForDebugParcelable collectForDebugParcelable) {
        rpc.m34202a(status, collectForDebugParcelable, this.f42351a);
    }

    /* renamed from: a */
    public final void mo24343a(Status status, LogEventParcelable[] logEventParcelableArr) {
        rpc.m34202a(status, logEventParcelableArr, this.f42351a);
    }

    /* renamed from: a */
    public final void mo24344a(DataHolder dataHolder) {
        rts rts = new rts(dataHolder, LogEventParcelable.CREATOR);
        try {
            LogEventParcelable[] logEventParcelableArr = new LogEventParcelable[rts.mo24660a()];
            for (int i = 0; i < rts.mo24660a(); i++) {
                logEventParcelableArr[i] = (LogEventParcelable) rts.mo24661a(i);
            }
            rpc.m34202a(new Status(dataHolder.f30165e), logEventParcelableArr, this.f42351a);
        } finally {
            rts.mo12460c();
        }
    }
}
