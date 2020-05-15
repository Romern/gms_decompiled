package p000;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: ahqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahqu implements Callable {

    /* renamed from: a */
    long f67831a = 0;

    /* renamed from: b */
    final /* synthetic */ ahqy f67832b;

    /* renamed from: c */
    final /* synthetic */ buut f67833c;

    /* renamed from: d */
    final /* synthetic */ ahqv f67834d;

    public ahqu(ahqv ahqv, ahqy ahqy, buut buut) {
        this.f67834d = ahqv;
        this.f67832b = ahqy;
        this.f67833c = buut;
    }

    /* renamed from: a */
    public final Boolean call() {
        int i;
        bvih bvih;
        ahqy ahqy = this.f67832b;
        ArrayList a = bnkn.m109661a();
        ArrayList a2 = bnkn.m109661a();
        List c = ahqy.mo36984c();
        int size = c.size();
        for (int i2 = 0; i2 < size; i2++) {
            ahqx ahqx = (ahqx) c.get(i2);
            if (ahqx.f67845b != ahqw.AVAILABLE) {
                a2.add(ahqx);
            } else {
                a.add(ahqx.f67844a);
            }
        }
        Pair create = Pair.create(a, a2);
        for (ahqx ahqx2 : (List) create.second) {
            ahqv ahqv = this.f67834d;
            ahra ahra = ahqv.f67838d;
            ahkv ahkv = ahqv.f67837c;
            ArrayList a3 = bnkn.m109665a(ahqx2.f67844a);
            buut buut = this.f67833c;
            long j = this.f67831a;
            ahqw ahqw = ahqx2.f67845b;
            ahqw ahqw2 = ahqw.UNKNOWN;
            buum buum = buum.UNKNOWN_EVENT_TYPE;
            buup buup = buup.UNKNOWN_PACKET_TYPE;
            bvih bvih2 = bvih.UNKNOWN_PAYLOAD_STATUS;
            int ordinal = ahqw.ordinal();
            if (ordinal == 1) {
                bvih = bvih.SUCCESS;
            } else if (ordinal == 2) {
                bvih = bvih.REMOTE_CANCELLATION;
            } else if (ordinal != 3) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("Unknown PayloadStatus for EndpointInfo.Status %s!", ahqw);
                bvih = bvih.UNKNOWN_PAYLOAD_STATUS;
            } else {
                bvih = bvih.REMOTE_ERROR;
            }
            ahra.mo36992a(ahkv, a3, buut, j, bvih);
        }
        List<String> list = (List) create.first;
        if (list.isEmpty()) {
            srn srn = ahkm.f67363a;
            return false;
        } else if (this.f67832b.mo36983b()) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68423a("Aborting send of payload %s at offset %d since it is marked canceled.", this.f67832b, this.f67831a);
            ahqv ahqv2 = this.f67834d;
            ahqv2.f67838d.mo36992a(ahqv2.f67837c, list, this.f67833c, this.f67831a, bvih.LOCAL_CANCELLATION);
            return false;
        } else {
            for (String str : list) {
                this.f67832b.mo36980a(str, this.f67831a);
            }
            ahra ahra2 = this.f67834d.f67838d;
            int I = (int) cfnv.m140747I();
            for (String str2 : list) {
                long az = cfnv.f184625a.mo6606a().mo81793az();
                ahna a4 = ahra2.f67852a.f67634a.mo36876a(str2);
                if (a4 != null) {
                    i = a4.mo36809k();
                } else {
                    i = 0;
                }
                I = Math.min(I, i - ((int) az));
            }
            try {
                byte[] a5 = this.f67832b.f67847a.mo36899a(I);
                long j2 = this.f67831a;
                bxvd da = buuq.f154972e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                buuq buuq = (buuq) da.f164949b;
                buuq.f154974a |= 2;
                buuq.f154976c = j2;
                if (a5 != null) {
                    bxtx a6 = bxtx.m123261a(a5);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    buuq buuq2 = (buuq) da.f164949b;
                    a6.getClass();
                    buuq2.f154974a |= 4;
                    buuq2.f154977d = a6;
                }
                buuq buuq3 = (buuq) da.f164949b;
                int i3 = buuq3.f154974a | 1;
                buuq3.f154974a = i3;
                buuq3.f154975b = 0;
                if (a5 == null) {
                    buuq3.f154974a = i3 | 1;
                    buuq3.f154975b = 1;
                }
                buuq buuq4 = (buuq) da.mo74062i();
                ahnp ahnp = this.f67834d.f67838d.f67852a;
                buut buut2 = this.f67833c;
                bxvd da2 = buuu.f154985f.mo74144da();
                buup buup2 = buup.DATA;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                buuu buuu = (buuu) da2.f164949b;
                buuu.f154988b = buup2.f154971d;
                int i4 = buuu.f154987a | 1;
                buuu.f154987a = i4;
                buut2.getClass();
                buuu.f154989c = buut2;
                int i5 = 2 | i4;
                buuu.f154987a = i5;
                buuq4.getClass();
                buuu.f154990d = buuq4;
                buuu.f154987a = i5 | 4;
                List a7 = ahnp.mo36891a(list, ahoy.m56304a(buuw.PAYLOAD_TRANSFER, da2.mo74062i()).mo73642k(), buut2.f154982b, buuq4.f154976c, "DATA");
                if (!a7.isEmpty()) {
                    ahqv ahqv3 = this.f67834d;
                    ahqv3.f67838d.mo36992a(ahqv3.f67837c, a7, this.f67833c, this.f67831a, bvih.ENDPOINT_IO_ERROR);
                }
                if (a7.size() < list.size()) {
                    for (String str3 : list) {
                        if (!a7.contains(str3)) {
                            ahqv ahqv4 = this.f67834d;
                            ahra ahra3 = ahqv4.f67838d;
                            ahra3.mo36994a(new ahql(ahra3, this.f67833c, str3, buuq4, ahqv4.f67837c));
                        }
                    }
                    srn srn2 = ahkm.f67363a;
                    if (a5 == null) {
                        return false;
                    }
                    this.f67831a += (long) a5.length;
                }
                return true;
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68423a("PayloadManager short-circuiting Payload %s after sending %d bytes because we failed to detach the next chunk.", this.f67832b, this.f67831a);
                ahqv ahqv5 = this.f67834d;
                ahqv5.f67838d.mo36992a(ahqv5.f67837c, list, this.f67833c, this.f67831a, bvih.LOCAL_ERROR);
                return false;
            }
        }
    }
}
