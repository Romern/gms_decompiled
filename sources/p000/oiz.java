package p000;

import android.os.RemoteException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.car.CarInstrumentClusterInfo;
import java.nio.ByteBuffer;

/* renamed from: oiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oiz extends ojh {

    /* renamed from: a */
    public static final /* synthetic */ int f37734a = 0;

    /* renamed from: b */
    private final oiy f37735b;

    public oiz(oiy oiy, ojm ojm) {
        super(10, oiy, ojm);
        this.f37735b = oiy;
    }

    /* renamed from: a */
    public final void mo22200a(int i, int i2, int i3, int i4) {
        bxvd da = bisq.f121590f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bisq bisq = (bisq) da.f164949b;
        int i5 = bisq.f121592a | 1;
        bisq.f121592a = i5;
        bisq.f121593b = i;
        int i6 = i5 | 2;
        bisq.f121592a = i6;
        bisq.f121594c = i2;
        int i7 = i6 | 4;
        bisq.f121592a = i7;
        bisq.f121595d = i3;
        bisq.f121596e = i4 - 1;
        bisq.f121592a = i7 | 8;
        mo22206a(32773, (bisq) da.mo74062i());
    }

    /* renamed from: b */
    public final void mo22087b(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22085a(int i, ByteBuffer byteBuffer) {
        if (i == 32769) {
            bitd bitd = (bitd) bxvk.m124012a(bitd.f121631a, byteBuffer);
            oiy oiy = this.f37735b;
            synchronized (((nma) oiy).f36001b) {
                for (nlz nlz : ((nma) oiy).f36001b) {
                    try {
                        nsa nsa = nlz.f35999b;
                        CarInstrumentClusterInfo carInstrumentClusterInfo = ((nma) oiy).f36002c;
                        nsa.mo21505a(carInstrumentClusterInfo.f29349a, carInstrumentClusterInfo.f29350b, carInstrumentClusterInfo.f29352d, carInstrumentClusterInfo.f29351c, carInstrumentClusterInfo.f29353e);
                    } catch (RemoteException e) {
                        bnsi c = nma.f36000a.mo68388c();
                        c.mo68432a("nma", "a", 188, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c.mo68405a("Error calling onStart()");
                    }
                }
            }
        } else if (i == 32770) {
            bite bite = (bite) bxvk.m124012a(bite.f121633a, byteBuffer);
            oiy oiy2 = this.f37735b;
            synchronized (((nma) oiy2).f36001b) {
                for (nlz nlz2 : ((nma) oiy2).f36001b) {
                    try {
                        nlz2.f35999b.mo21504a();
                    } catch (RemoteException e2) {
                        bnsi c2 = nma.f36000a.mo68388c();
                        c2.mo68432a("nma", "b", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        c2.mo68405a("Error calling onStop()");
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid message type;");
        }
    }
}
