package p000;

import com.google.android.gms.measurement.internal.EventParcel;

/* renamed from: agjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agjn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ EventParcel f65735a;

    /* renamed from: b */
    final /* synthetic */ String f65736b;

    /* renamed from: c */
    final /* synthetic */ aghp f65737c;

    public agjn(aghp aghp, EventParcel eventParcel, String str) {
        this.f65737c = aghp;
        this.f65735a = eventParcel;
        this.f65736b = str;
    }

    public final void run() {
        this.f65737c.f65526a.mo35701y();
        this.f65737c.f65526a.mo35670a(this.f65735a, this.f65736b);
    }
}
