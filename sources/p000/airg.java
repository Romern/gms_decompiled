package p000;

import java.io.IOException;

/* renamed from: airg */
final /* synthetic */ class airg implements Runnable {

    /* renamed from: a */
    private final airh f69540a;

    /* renamed from: b */
    private final IOException f69541b;

    public airg(airh airh, IOException iOException) {
        this.f69540a = airh;
        this.f69541b = iOException;
    }

    public final void run() {
        airh airh = this.f69540a;
        IOException iOException = this.f69541b;
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68437a(iOException);
        bnsl.mo68432a("airh", "b", 383, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("PhysicalBleSocket connected to %s encountered an error with its internal Weave socket.", airh.f69542a.f69543a);
    }
}
