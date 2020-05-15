package p000;

/* renamed from: dyl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dyl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ dyo f14405a;

    public dyl(dyo dyo) {
        this.f14405a = dyo;
    }

    public final void run() {
        dyo dyo = this.f14405a;
        dyo.f14429r.requestTriggerSensor(dyo.f14423l, dyo.f14430s);
    }
}
