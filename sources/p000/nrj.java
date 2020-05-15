package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.car.CarCall;
import java.util.List;

/* renamed from: nrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nrj extends dcj implements IInterface {
    public nrj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarCallListener");
    }

    /* renamed from: a */
    public final void mo21472a(CarCall carCall) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, carCall);
        mo8530c(3, bj);
    }

    /* renamed from: b */
    public final void mo21480b(CarCall carCall) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, carCall);
        mo8530c(4, bj);
    }

    /* renamed from: c */
    public final void mo21482c(CarCall carCall) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, carCall);
        mo8530c(11, bj);
    }

    /* renamed from: a */
    public final void mo21473a(CarCall carCall, int i) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, carCall);
        bj.writeInt(i);
        mo8530c(5, bj);
    }

    /* renamed from: b */
    public final void mo21481b(CarCall carCall, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, carCall);
        bj.writeStringList(list);
        mo8530c(9, bj);
    }

    /* renamed from: c */
    public final void mo21483c(CarCall carCall, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, carCall);
        bj.writeTypedList(list);
        mo8530c(12, bj);
    }

    /* renamed from: a */
    public final void mo21474a(CarCall carCall, CarCall.Details details) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, carCall);
        dcl.m8165a(bj, details);
        mo8530c(8, bj);
    }

    /* renamed from: a */
    public final void mo21475a(CarCall carCall, CarCall carCall2) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, carCall);
        dcl.m8165a(bj, carCall2);
        mo8530c(6, bj);
    }

    /* renamed from: a */
    public final void mo21476a(CarCall carCall, String str) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, carCall);
        bj.writeString(str);
        mo8530c(10, bj);
    }

    /* renamed from: a */
    public final void mo21477a(CarCall carCall, String str, Bundle bundle) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, carCall);
        bj.writeString(str);
        dcl.m8165a(bj, bundle);
        mo8530c(13, bj);
    }

    /* renamed from: a */
    public final void mo21478a(CarCall carCall, List list) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, carCall);
        bj.writeTypedList(list);
        mo8530c(7, bj);
    }

    /* renamed from: a */
    public final void mo21479a(boolean z, int i, int i2) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        bj.writeInt(i);
        bj.writeInt(i2);
        mo8530c(2, bj);
    }
}
