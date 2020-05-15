package p000;

import android.os.SystemClock;
import java.io.IOException;

/* renamed from: ahlb */
final /* synthetic */ class ahlb implements Runnable {

    /* renamed from: a */
    private final ahlh f67419a;

    /* renamed from: b */
    private final ahlj f67420b;

    public ahlb(ahlh ahlh, ahlj ahlj) {
        this.f67419a = ahlh;
        this.f67420b = ahlj;
    }

    public final void run() {
        ahfi b;
        ahlh ahlh = this.f67419a;
        ahlj ahlj = this.f67420b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ahna ahna = ahlj.f67448a;
        if (ahna == null) {
            ((bnsl) ahkm.f67363a.mo68387b()).mo68420a("BandwidthUpgradeManager failed to create new EndpointChannel for incoming socket %s", ahlj);
            srz.m36171a(ahlj.f67449b);
            ahlh.mo36785a(bvhu.MEDIUM_ERROR, 6);
            return;
        }
        srn srn = ahkm.f67363a;
        try {
            b = ahfi.m55635b(new ahlc(ahna), cfnv.m140797u(), ahlh.f67437c);
            int i = 1;
            buuj a = ahoy.m56305a(ahna.mo36803e());
            b.mo36396b();
            if (ahoy.m56306a(a) == buuw.BANDWIDTH_UPGRADE_NEGOTIATION) {
                buux buux = a.f154950c;
                if (buux == null) {
                    buux = buux.f155003j;
                }
                buty buty = buux.f155010f;
                if (buty == null) {
                    buty = buty.f154902e;
                }
                int b2 = butp.m120439b(buty.f154905b);
                if (b2 != 0) {
                    if (b2 == 5) {
                        buux buux2 = a.f154950c;
                        if (buux2 == null) {
                            buux2 = buux.f155003j;
                        }
                        buty buty2 = buux2.f155010f;
                        if (buty2 == null) {
                            buty2 = buty.f154902e;
                        }
                        butn butn = buty2.f154907d;
                        if (butn == null) {
                            butn = butn.f154857c;
                        }
                        String str = butn.f154860b;
                        ahkv ahkv = (ahkv) ahlh.f67441g.remove(str);
                        ahlh.mo36787a(str);
                        if (ahkv == null) {
                            ahna.mo36805g();
                            ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("BandwidthUpgradeManager got an incoming connection for unexpected endpoint %s, short-circuiting", str);
                            return;
                        }
                        ahkv.f67390f.mo36652a(3, ahna.mo36865l(), 2, SystemClock.elapsedRealtime() - elapsedRealtime);
                        ahna.mo36797a(ahkv.f67390f, str);
                        ahlh.mo36779a(ahkv, str, ahna);
                        return;
                    }
                }
                bvhu bvhu = bvhu.PROTOCOL_ERROR;
                Object[] objArr = new Object[1];
                buux buux3 = a.f154950c;
                if (buux3 == null) {
                    buux3 = buux.f155003j;
                }
                buty buty3 = buux3.f155010f;
                if (buty3 == null) {
                    buty3 = buty.f154902e;
                }
                int b3 = butp.m120439b(buty3.f154905b);
                if (b3 != 0) {
                    i = b3;
                }
                objArr[0] = butp.m120438a(i);
                throw new ahli(bvhu, 2, String.format("In readClientIntroductionFrame, expected a CLIENT_INTRODUCTION v1 OfflineFrame but got a BandwidthUpgradeNegotiation frame with eventType %s instead", objArr));
            }
            throw new ahli(bvhu.PROTOCOL_ERROR, 2, String.format("In readClientIntroductionFrame, expected a BANDWIDTH_UPGRADE_NEGOTIATION v1 OfflineFrame but got a %s frame instead", ahoy.m56306a(a).name()));
        } catch (IOException e) {
            throw new ahli(bvhu.RESULT_IO_ERROR, 2, String.format("In readClientIntroductionFrame, attempted to read a ClientIntroductionFrame from EndpointChannel %s but was unable to obtain any OfflineFrame.", ahna.mo36795a()), e);
        } catch (ahli e2) {
            ahna.mo36805g();
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
            bnsl.mo68437a(e2);
            bnsl.mo68420a("BandwidthUpgradeManager failed to read BANDWIDTH_UPGRADE_NEGOTIATION.CLIENT_INTRODUCTION OfflineFrame from newly-created EndpointChannel %s, so the EndpointChannel was discarded.", ahna.mo36800b());
            ahlh.mo36785a(e2.f67446a, e2.f67447b);
        } catch (Throwable th) {
            b.mo36396b();
            throw th;
        }
    }
}
