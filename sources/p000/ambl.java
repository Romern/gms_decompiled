package p000;

import android.util.Log;

/* renamed from: ambl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ambl extends Thread {

    /* renamed from: a */
    final /* synthetic */ ambn f74648a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ambl(ambn ambn) {
        super("PeopleAggregator-contacts");
        this.f74648a = ambn;
    }

    public final void run() {
        this.f74648a.f74657e.mo41711a("contacts query start");
        try {
            ambn ambn = this.f74648a;
            ambn.mo41113a(ambn.mo41114b());
        } catch (Exception e) {
            Log.e("PeopleAggregator", "Error while quering contacts", e);
            this.f74648a.mo41113a(null);
        }
    }
}
