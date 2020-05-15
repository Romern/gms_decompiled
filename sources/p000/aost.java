package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: aost */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aost extends dcj implements IInterface {
    public aost(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.reminders.internal.IRemindersCallbacks");
    }

    /* renamed from: a */
    public final void mo46830a(Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, status);
        mo8528b(2, bj);
    }

    /* renamed from: a */
    public final void mo46831a(DataHolder dataHolder, Status status) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, dataHolder);
        dcl.m8165a(bj, status);
        mo8528b(1, bj);
    }

    /* renamed from: a */
    public final void mo46832a(boolean z, Status status) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        dcl.m8165a(bj, status);
        mo8528b(5, bj);
    }
}
