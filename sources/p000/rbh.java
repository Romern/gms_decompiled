package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.clearcut.LogEventParcelable;

/* renamed from: rbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rbh extends dcj implements rbj {
    public rbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    /* renamed from: a */
    public final void mo24427a(rbg rbg) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rbg);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo24428a(rbg rbg, CollectForDebugParcelable collectForDebugParcelable) {
        throw null;
    }

    /* renamed from: a */
    public final void mo24430a(rbg rbg, String str) {
        throw null;
    }

    /* renamed from: b */
    public final void mo24431b(rbg rbg) {
        throw null;
    }

    /* renamed from: b */
    public final void mo24432b(rbg rbg, String str) {
        throw null;
    }

    /* renamed from: c */
    public final void mo24433c(rbg rbg) {
        throw null;
    }

    /* renamed from: d */
    public final void mo24434d(rbg rbg) {
        throw null;
    }

    /* renamed from: e */
    public final void mo24435e(rbg rbg) {
        throw null;
    }

    /* renamed from: a */
    public final void mo24429a(rbg rbg, LogEventParcelable logEventParcelable) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, rbg);
        dcl.m8165a(bj, logEventParcelable);
        mo8530c(1, bj);
    }
}
