package p000;

import android.bluetooth.le.ScanResult;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: ahwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahwx extends buqn {

    /* renamed from: a */
    final /* synthetic */ ScanResult f68263a;

    /* renamed from: b */
    final /* synthetic */ String f68264b;

    /* renamed from: c */
    final /* synthetic */ int f68265c;

    /* renamed from: d */
    final /* synthetic */ ahxa f68266d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ahwx(ahxa ahxa, String str, ScanResult scanResult, String str2, int i) {
        super(str);
        this.f68266d = ahxa;
        this.f68263a = scanResult;
        this.f68264b = str2;
        this.f68265c = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahxa.a(bvkr, boolean):ahyx
     arg types: [bvkr, int]
     candidates:
      ahxa.a(android.bluetooth.le.ScanResult, int):ahyw
      ahxa.a(ahyw, android.bluetooth.le.ScanResult):void
      ahxa.a(android.bluetooth.le.ScanResult, ahyw):void
      ahxa.a(bvkr, boolean):ahyx */
    public final void run() {
        int i;
        double d;
        int i2;
        bvkr bvkr;
        ahxa ahxa = this.f68266d;
        ScanResult scanResult = this.f68263a;
        byte[] serviceData = scanResult.getScanRecord().getServiceData(ahxa.f68272f);
        ahxa.f68273a.mo36468d();
        String a = srv.m36160a(serviceData);
        ahyx ahyx = (ahyx) ahxa.f68273a.mo36459a(a);
        if (ahyx == null || cfog.m141284l()) {
            if (cfog.m141284l()) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairCache: Forcing server request for %s", a);
            }
            ahxa.f68277e.mo37016a(bvin.FAST_PAIR_DEVICE_INFO_SERVER_REQUEST_SENT, a, 0);
            long a2 = ahxa.f68276d.mo20505a();
            byte[] serviceData2 = scanResult.getScanRecord().getServiceData(ahxa.f68272f);
            if (serviceData2 == null || !ahfo.m55650b(serviceData2)) {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPairCache: service data is null or the service data is not model id skip get device info.");
                bvkr = null;
            } else {
                ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPairCache: scanner found model id is %s, request the information from server.", srv.m36160a(serviceData2));
                bvkr = ((ahvm) ahgz.m55754a(ahxa.f68274b, ahvm.class)).mo37205a(srv.m36160a(serviceData2));
            }
            if (bvkr == null) {
                ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPairCache: Failed to get result from server");
                ahxa.f68277e.mo37016a(bvin.FAST_PAIR_DEVICE_INFO_SERVER_ERROR_RESPONSE, a, ahxa.f68276d.mo20505a() - a2);
                ahyx = ahyx.f68417f;
            } else {
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68390d();
                bvkk bvkk = bvkr.f156462a;
                if (bvkk == null) {
                    bvkk = bvkk.f156420q;
                }
                bnsl.mo68420a("FastPairCache: Got response from server %s", bvkk.f156423b);
                ahxa.f68277e.mo37016a(bvin.FAST_PAIR_DEVICE_INFO_SERVER_RESPONSE_RECEIVED, a, ahxa.f68276d.mo20505a() - a2);
                ahyx = ahxa.mo37250a(bvkr, true);
            }
        } else {
            bnsl bnsl2 = (bnsl) ahsd.f67925a.mo68390d();
            bvkr bvkr2 = ahyx.f68421c;
            if (bvkr2 == null) {
                bvkr2 = bvkr.f156460d;
            }
            bvkk bvkk2 = bvkr2.f156462a;
            if (bvkk2 == null) {
                bvkk2 = bvkk.f156420q;
            }
            bnsl2.mo68420a("FastPairCache: Item exists in cache, returning %s", bvkk2.f156423b);
            if (!cfom.m141867b()) {
                ahxa.f68277e.mo37016a(bvin.FAST_PAIR_LOCAL_DB_CACHE_HIT, a, 0);
            } else if (ahyx.f68423e) {
                ahxa.f68277e.mo37016a(bvin.FAST_PAIR_LOCAL_DB_CACHE_HIT, a, 0);
            } else {
                ahxa.f68277e.mo37016a(bvin.FAST_PAIR_OFFLINE_SERVICE_CACHE_HIT, a, 0);
            }
        }
        if (!ahyx.equals(ahyx.f68417f)) {
            bvkr bvkr3 = ahyx.f68421c;
            if (bvkr3 == null) {
                bvkr3 = bvkr.f156460d;
            }
            bvkk bvkk3 = bvkr3.f156462a;
            if (bvkk3 == null) {
                bvkk3 = bvkk.f156420q;
            }
            bxvd da = bvkk.f156420q.mo74144da();
            long parseLong = Long.parseLong(this.f68264b, 16);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bvkk) da.f164949b).f156422a = parseLong;
            if (!bvkk3.equals(da.mo74062i())) {
                bvkk bvkk4 = bvkr3.f156462a;
                if (bvkk4 == null) {
                    bvkk4 = bvkk.f156420q;
                }
                if (bvkk4.f156425d == 0) {
                    i = this.f68265c;
                } else {
                    bvkk bvkk5 = bvkr3.f156462a;
                    if (bvkk5 == null) {
                        bvkk5 = bvkk.f156420q;
                    }
                    i = bvkk5.f156425d;
                }
                bvkk bvkk6 = bvkr3.f156462a;
                if (bvkk6 == null) {
                    bvkk6 = bvkk.f156420q;
                }
                if (bvkk6.f156426e == 0.0f) {
                    d = cfog.f184854a.mo6606a().mo81946H();
                } else {
                    bvkk bvkk7 = bvkr3.f156462a;
                    if (bvkk7 == null) {
                        bvkk7 = bvkk.f156420q;
                    }
                    d = (double) bvkk7.f156426e;
                }
                if (d != 0.0d) {
                    double d2 = (double) (i - 41);
                    Double.isNaN(d2);
                    i2 = (int) Math.floor(d2 - (Math.log10(d) * 20.0d));
                } else {
                    i2 = i;
                }
                ahyw ahyw = (ahyw) this.f68266d.get(this.f68263a.getDevice().getAddress());
                if (ahyw == null) {
                    ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPairCache: Cached Item was evicted before observed device call completed");
                    bxvd da2 = ahyw.f68389A.mo74144da();
                    long a3 = ((sqv) ahgz.m55754a(this.f68266d.f68274b, sqv.class)).mo20505a();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ahyw ahyw2 = (ahyw) da2.f164949b;
                    ahyw2.f68392a |= 32;
                    ahyw2.f68398g = a3;
                    String address = this.f68263a.getDevice().getAddress();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ahyw ahyw3 = (ahyw) da2.f164949b;
                    address.getClass();
                    ahyw3.f68392a |= 128;
                    ahyw3.f68400i = address;
                    int rssi = this.f68263a.getRssi();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    ahyw ahyw4 = (ahyw) da2.f164949b;
                    int i3 = ahyw4.f68392a | 2;
                    ahyw4.f68392a = i3;
                    ahyw4.f68394c = rssi;
                    String str = this.f68264b;
                    str.getClass();
                    ahyw4.f68392a = i3 | 1;
                    ahyw4.f68393b = str;
                    ahyw = (ahyw) da2.mo74062i();
                }
                bxvd bxvd = (bxvd) ahyw.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) ahyw);
                bvkk bvkk8 = bvkr3.f156462a;
                if (bvkk8 == null) {
                    bvkk8 = bvkk.f156420q;
                }
                String str2 = bvkk8.f156424c;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ahyw ahyw5 = (ahyw) bxvd.f164949b;
                str2.getClass();
                ahyw5.f68392a |= 64;
                ahyw5.f68399h = str2;
                bvkk bvkk9 = bvkr3.f156462a;
                if (bvkk9 == null) {
                    bvkk9 = bvkk.f156420q;
                }
                String str3 = bvkk9.f156423b;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ahyw ahyw6 = (ahyw) bxvd.f164949b;
                str3.getClass();
                int i4 = 16 | ahyw6.f68392a;
                ahyw6.f68392a = i4;
                ahyw6.f68397f = str3;
                ByteString bxtx = bvkr3.f156463b;
                bxtx.getClass();
                int i5 = i4 | 8;
                ahyw6.f68392a = i5;
                ahyw6.f68396e = bxtx;
                int i6 = i5 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                ahyw6.f68392a = i6;
                ahyw6.f68401j = i2;
                ahyw6.f68392a = i6 | 4;
                ahyw6.f68395d = i;
                bxvd da3 = ahyt.f68381d.mo74144da();
                bvku bvku = bvkr3.f156464c;
                if (bvku == null) {
                    bvku = bvku.f156466c;
                }
                String str4 = bvku.f156468a;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ahyt ahyt = (ahyt) da3.f164949b;
                str4.getClass();
                ahyt.f68383a |= 1;
                ahyt.f68384b = str4;
                bvku bvku2 = bvkr3.f156464c;
                if (bvku2 == null) {
                    bvku2 = bvku.f156466c;
                }
                String str5 = bvku2.f156469b;
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                ahyt ahyt2 = (ahyt) da3.f164949b;
                str5.getClass();
                ahyt2.f68383a |= 2;
                ahyt2.f68385c = str5;
                ahyt ahyt3 = (ahyt) da3.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ahyw ahyw7 = (ahyw) bxvd.f164949b;
                ahyt3.getClass();
                ahyw7.f68404m = ahyt3;
                ahyw7.f68392a |= 2048;
                bvkk bvkk10 = bvkr3.f156462a;
                if (bvkk10 == null) {
                    bvkk10 = bvkk.f156420q;
                }
                bvkh bvkh = bvkk10.f156427f;
                if (bvkh == null) {
                    bvkh = bvkh.f156412b;
                }
                ByteString bxtx2 = bvkh.f156414a;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ahyw ahyw8 = (ahyw) bxvd.f164949b;
                bxtx2.getClass();
                ahyw8.f68392a |= 4096;
                ahyw8.f68405n = bxtx2;
                bvkk bvkk11 = bvkr3.f156462a;
                if (bvkk11 == null) {
                    bvkk11 = bvkk.f156420q;
                }
                boolean z = bvkk11.f156432k;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ahyw ahyw9 = (ahyw) bxvd.f164949b;
                ahyw9.f68392a |= 8192;
                ahyw9.f68406o = z;
                bvkk bvkk12 = bvkr3.f156462a;
                if (bvkk12 == null) {
                    bvkk12 = bvkk.f156420q;
                }
                int i7 = bvkk12.f156429h;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ahyw ahyw10 = (ahyw) bxvd.f164949b;
                ahyw10.f68392a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
                ahyw10.f68407p = i7;
                bvkk bvkk13 = bvkr3.f156462a;
                if (bvkk13 == null) {
                    bvkk13 = bvkk.f156420q;
                }
                int i8 = bvkk13.f156428g;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ahyw ahyw11 = (ahyw) bxvd.f164949b;
                ahyw11.f68392a |= 4194304;
                ahyw11.f68416z = i8;
                bvkk bvkk14 = bvkr3.f156462a;
                if (bvkk14 == null) {
                    bvkk14 = bvkk.f156420q;
                }
                bzaa bzaa = bvkk14.f156430i;
                if (bzaa == null) {
                    bzaa = bzaa.f169202d;
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ahyw ahyw12 = (ahyw) bxvd.f164949b;
                bzaa.getClass();
                ahyw12.f68408q = bzaa;
                ahyw12.f68392a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
                bvkk bvkk15 = bvkr3.f156462a;
                if (bvkk15 == null) {
                    bvkk15 = bvkk.f156420q;
                }
                boolean z2 = bvkk15.f156431j;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ahyw ahyw13 = (ahyw) bxvd.f164949b;
                ahyw13.f68392a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                ahyw13.f68409r = z2;
                bvkk bvkk16 = bvkr3.f156462a;
                if (bvkk16 == null) {
                    bvkk16 = bvkk.f156420q;
                }
                String str6 = bvkk16.f156433l;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ahyw ahyw14 = (ahyw) bxvd.f164949b;
                str6.getClass();
                ahyw14.f68392a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                ahyw14.f68410s = str6;
                bvkk bvkk17 = bvkr3.f156462a;
                if (bvkk17 == null) {
                    bvkk17 = bvkk.f156420q;
                }
                bxvd.mo74021aa(new bxvv(bvkk17.f156434m, bvkk.f156419n));
                bvkk bvkk18 = bvkr3.f156462a;
                if (bvkk18 == null) {
                    bvkk18 = bvkk.f156420q;
                }
                int a4 = bvkt.m121215a(bvkk18.f156435o);
                if (a4 == 0) {
                    a4 = 1;
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                ahyw ahyw15 = (ahyw) bxvd.f164949b;
                if (a4 != 1) {
                    ahyw15.f68412v = a4 - 2;
                    ahyw15.f68392a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                    bvkk bvkk19 = bvkr3.f156462a;
                    if (bvkk19 == null) {
                        bvkk19 = bvkk.f156420q;
                    }
                    bvki bvki = bvkk19.f156436p;
                    if (bvki == null) {
                        bvki = bvki.f156415c;
                    }
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    ahyw ahyw16 = (ahyw) bxvd.f164949b;
                    bvki.getClass();
                    ahyw16.f68414x = bvki;
                    ahyw16.f68392a |= 1048576;
                    String address2 = this.f68263a.getDevice().getAddress();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    ahyw ahyw17 = (ahyw) bxvd.f164949b;
                    address2.getClass();
                    ahyw17.f68392a |= 128;
                    ahyw17.f68400i = address2;
                    ahyw ahyw18 = (ahyw) bxvd.mo74062i();
                    this.f68266d.put(this.f68263a.getDevice().getAddress(), ahyw18);
                    this.f68266d.mo37252a(this.f68263a, ahyw18);
                    return;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            ((bnsl) ahsd.f67925a.mo68388c()).mo68405a("FastPairCache: Failed to get observedDevice");
            return;
        }
        this.f68266d.remove(this.f68263a.getDevice().getAddress());
    }
}
