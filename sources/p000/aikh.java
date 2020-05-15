package p000;

import com.google.android.libraries.bluetooth.BluetoothException;
import java.io.IOException;

/* renamed from: aikh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aikh extends soa {

    /* renamed from: a */
    final /* synthetic */ aiki f69031a;

    /* renamed from: b */
    private final bqgy f69032b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aikh(aiki aiki, bqgy bqgy) {
        super(9);
        this.f69031a = aiki;
        this.f69032b = bqgy;
    }

    public final void run() {
        try {
            aiki aiki = this.f69031a;
            ayrp ayrp = new ayrp(aiki.f69036d, aysk.m84700a(aiki.f69033a));
            aiki aiki2 = this.f69031a;
            ayri a = ayrp.mo54335a(aiki2.f69034b, aiki2.f69035c);
            a.mo54312a(cfnv.m140790n());
            if (!this.f69032b.mo69138b(a)) {
                a.close();
            }
        } catch (BluetoothException e) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aikh", "run", 3114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Can't connect to an advertisement GATT server for peripheral %s.", this.f69031a.f69034b);
            this.f69032b.mo69136a((Throwable) new IOException());
        }
    }
}
