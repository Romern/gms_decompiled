package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: apbl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apbl extends dcj implements apbn {
    public apbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.romanesco.internal.IRomanescoCallbacks");
    }

    /* renamed from: a */
    public final void mo46970a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8530c(2, bj);
    }

    /* renamed from: b */
    public final void mo46968b(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(list);
        mo8530c(3, bj);
    }

    /* renamed from: c */
    public final void mo46969c(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(list);
        mo8530c(4, bj);
    }

    /* renamed from: d */
    public final void mo46971d(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(list);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo46967a(Status status, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(list);
        mo8530c(1, bj);
    }
}
