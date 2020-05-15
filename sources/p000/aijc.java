package p000;

import java.util.concurrent.Callable;

/* renamed from: aijc */
final /* synthetic */ class aijc implements Callable {

    /* renamed from: a */
    private final aije f68941a;

    public aijc(aije aije) {
        this.f68941a = aije;
    }

    public final Object call() {
        aipa aipa;
        aije aije = this.f68941a;
        if (!cfnv.f184625a.mo6606a().mo81851s()) {
            aipa = aije.mo37571c();
        } else {
            bqgy c = bqgy.m112818c();
            new soa(9, new aijd(aije, c)).start();
            aipa = (aipa) ahhf.m55778c("BluetoothClassic.connect", c, cfnv.f184625a.mo6606a().mo81849q());
        }
        if (aipa != null) {
            return aipa;
        }
        throw new RuntimeException(String.format("Failed to create client Bluetooth socket to %s.", aije.f68944a));
    }
}
