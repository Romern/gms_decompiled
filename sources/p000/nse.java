package p000;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.car.DrawingSpec;

/* renamed from: nse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nse extends dcj implements IInterface {
    public nse(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarProjection");
    }

    /* renamed from: a */
    public final void mo21507a() {
        mo8530c(12, mo8529bj());
    }

    /* renamed from: c */
    public final void mo21512c() {
        Parcel bj = mo8529bj();
        bj.writeInt(0);
        mo8530c(5, bj);
    }

    /* renamed from: d */
    public final void mo21513d() {
        Parcel bj = mo8529bj();
        bj.writeInt(0);
        mo8530c(4, bj);
    }

    /* renamed from: e */
    public final void mo21514e() {
        Parcel bj = mo8529bj();
        bj.writeInt(0);
        mo8530c(9, bj);
    }

    /* renamed from: a */
    public final void mo21508a(int i, DrawingSpec drawingSpec, Intent intent, Bundle bundle) {
        Parcel bj = mo8529bj();
        bj.writeInt(i);
        dcl.m8165a(bj, drawingSpec);
        dcl.m8165a(bj, intent);
        dcl.m8165a(bj, bundle);
        mo8530c(2, bj);
    }

    /* renamed from: a */
    public final void mo21509a(int i, DrawingSpec drawingSpec, Configuration configuration) {
        Parcel bj = mo8529bj();
        bj.writeInt(0);
        bj.writeInt(i);
        dcl.m8165a(bj, drawingSpec);
        dcl.m8165a(bj, configuration);
        mo8530c(6, bj);
    }

    /* renamed from: a */
    public final void mo21510a(Intent intent) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, intent);
        mo8530c(3, bj);
    }

    /* renamed from: a */
    public final void mo21511a(nsg nsg, nqu nqu) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, nsg);
        dcl.m8164a(bj, nqu);
        mo8530c(1, bj);
    }
}
