package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: arir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arir extends dcj implements arit {
    public arir(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.smartdevice.d2d.internal.ISourceDeviceCallbacks");
    }

    /* renamed from: a */
    public final void mo48574a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(1, bj);
    }

    /* renamed from: b */
    public final void mo48576b(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }

    /* renamed from: c */
    public final void mo48577c(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(3, bj);
    }

    /* renamed from: d */
    public final void mo48578d(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(4, bj);
    }

    /* renamed from: e */
    public final void mo48579e(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(5, bj);
    }

    /* renamed from: f */
    public final void mo48580f(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(6, bj);
    }

    /* renamed from: g */
    public final void mo48581g(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(7, bj);
    }

    /* renamed from: h */
    public final void mo48582h(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(8, bj);
    }

    /* renamed from: i */
    public final void mo48583i(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(10, bj);
    }

    /* renamed from: j */
    public final void mo48584j(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(11, bj);
    }

    /* renamed from: k */
    public final void mo48585k(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(12, bj);
    }

    /* renamed from: a */
    public final void mo48575a(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(list);
        mo8530c(9, bj);
    }
}
