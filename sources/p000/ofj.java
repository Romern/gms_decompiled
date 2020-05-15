package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.nio.ByteBuffer;

/* renamed from: ofj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ofj extends ojh {

    /* renamed from: a */
    public static final bnsn f37502a = odk.m28481a("CAR.GAL.BT");

    /* renamed from: b */
    public boolean f37503b = false;

    /* renamed from: c */
    public volatile boolean f37504c = false;

    /* renamed from: d */
    private final ofi f37505d;

    public ofj(ofi ofi, ojm ojm) {
        super(9, ofi, ojm, 0);
        this.f37505d = ofi;
    }

    /* renamed from: a */
    private final void m28624a(bipe bipe) {
        if (this.f37503b) {
            bisf a = bisf.m102781a(bipe.f121151a);
            if (a == null) {
                a = bisf.STATUS_UNSOLICITED_MESSAGE;
            }
            this.f37505d.mo20961a(a, bipe.f121152b);
            return;
        }
        bnsi c = f37502a.mo68388c();
        c.mo68432a("ofj", "a", (int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("Have not sent pairing request");
    }

    /* renamed from: a */
    public final void mo22084a(int i) {
        this.f37504c = false;
    }

    /* renamed from: b */
    public final void mo22087b(int i) {
    }

    /* renamed from: i */
    public final void mo22088i() {
        this.f37504c = true;
        super.mo22088i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22085a(int i, ByteBuffer byteBuffer) {
        bioz bioz;
        if (i == 32770) {
            bipe bipe = (bipe) GeneratedMessageLite.m124012a(bipe.f121149c, byteBuffer);
            if (bipe == null) {
                bnsi b = f37502a.mo68387b();
                b.mo68432a("ofj", "a", 83, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Wrong BluetoothPairingResponse message");
            } else if (this.f37503b) {
                bisf a = bisf.m102781a(bipe.f121151a);
                if (a == null) {
                    a = bisf.STATUS_UNSOLICITED_MESSAGE;
                }
                this.f37505d.mo20961a(a, bipe.f121152b);
            } else {
                bnsi c = f37502a.mo68388c();
                c.mo68432a("ofj", "a", (int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Have not sent pairing request");
            }
        } else if (i == 32771) {
            try {
                bioz = (bioz) GeneratedMessageLite.m124012a(bioz.f121125c, byteBuffer);
            } catch (bxwf e) {
                bnsi b2 = f37502a.mo68387b();
                b2.mo68432a("ofj", "a", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b2.mo68420a("Invalid Protocol Buffer %s", e.getMessage());
                bioz = null;
            }
            if (bioz == null) {
                bnsi b3 = f37502a.mo68387b();
                b3.mo68432a("ofj", "a", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b3.mo68405a("Wrong BluetoothAuthenticationData message");
            } else if ((bioz.f121127a & 1) != 0) {
                this.f37505d.mo20962a(okb.m28991a(bioz.f121128b));
            }
        } else {
            bnsi c2 = f37502a.mo68388c();
            c2.mo68432a("ofj", "a", 98, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68409a("Wrong Bluetooth message type: %d", i);
        }
    }

    /* renamed from: a */
    public final void mo22086a(String str, bipc bipc) {
        if (!this.f37504c) {
            bnsi d = f37502a.mo68390d();
            d.mo68432a("ofj", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("sendPairingRequest on closed channel");
            return;
        }
        bxvd da = bipd.f121143d.mo74144da();
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bipd bipd = (bipd) da.f164949b;
            str.getClass();
            bipd.f121145a |= 1;
            bipd.f121146b = str;
        }
        if (bipc != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bipd bipd2 = (bipd) da.f164949b;
            bipd2.f121147c = bipc.f121142f;
            bipd2.f121145a |= 2;
        }
        this.f37503b = true;
        mo22206a(32769, da.mo74062i());
    }
}
