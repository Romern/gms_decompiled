package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahkj {

    /* renamed from: a */
    public final C1245ok f67340a = new C1245ok();

    /* renamed from: b */
    public final C1245ok f67341b = new C1245ok();

    /* renamed from: c */
    public final C1245ok f67342c = new C1245ok();

    /* renamed from: d */
    public bvif f67343d;

    public ahkj(bvif bvif) {
        mo36645a(bvif);
    }

    /* renamed from: a */
    private static List m55930a(C1245ok okVar, int i) {
        bvih bvih;
        if (i == 5) {
            bvih = bvih.MOVED_TO_NEW_MEDIUM;
        } else {
            bvih = bvih.CONNECTION_CLOSED;
        }
        ArrayList arrayList = new ArrayList();
        C1245ok okVar2 = new C1245ok();
        for (int i2 = 0; i2 < okVar.f26809h; i2++) {
            ahkk ahkk = (ahkk) okVar.mo15621c(i2);
            bxvd a = ahkk.mo36649a();
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bven bven = (bven) a.f164949b;
            bven bven2 = bven.f155761h;
            bven.f155769g = bvih.f156153j;
            bven.f155763a |= 32;
            arrayList.add((bven) a.mo74062i());
            if (i == 5) {
                okVar2.put((Long) okVar.mo15620b(i2), new ahkk(ahkk.f67345b, ahkk.f67344a));
            }
        }
        okVar.clear();
        if (i == 5) {
            okVar.mo8150a(okVar2);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo36648b(long j, bvih bvih) {
        C1245ok okVar = this.f67342c;
        Long valueOf = Long.valueOf(j);
        if (okVar.containsKey(valueOf)) {
            bvif bvif = this.f67343d;
            if (bvif != null) {
                bxvd bxvd = (bxvd) this.f67340a.get(bvif);
                bxvd a = ((ahkk) this.f67342c.remove(valueOf)).mo36649a();
                if (a.f164950c) {
                    a.mo74035c();
                    a.f164950c = false;
                }
                bven bven = (bven) a.f164949b;
                bven bven2 = bven.f155761h;
                bven.f155769g = bvih.f156153j;
                bven.f155763a |= 32;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bvem bvem = (bvem) bxvd.f164949b;
                bven bven3 = (bven) a.mo74062i();
                bvem bvem2 = bvem.f155753g;
                bven3.getClass();
                bvem.mo73361b();
                bvem.f155759e.add(bven3);
                return;
            }
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
            bnsl.mo68432a("ahkj", "b", 927, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unexpected call to incomingPayloadDone() while NearbyRecorder has no active current medium.");
        }
    }

    /* renamed from: a */
    public final List mo36643a() {
        if (this.f67343d != null) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
            bnsl.mo68432a("ahkj", "a", 871, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("NearbyRecorder expected no more active physical connections before logging this endpoint connection.");
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            C1245ok okVar = this.f67340a;
            if (i < okVar.f26809h) {
                arrayList.add((bvem) ((bxvd) okVar.mo15621c(i)).mo74062i());
                i++;
            } else {
                okVar.clear();
                return arrayList;
            }
        }
    }

    /* renamed from: a */
    public final void mo36644a(long j, bvih bvih) {
        C1245ok okVar = this.f67341b;
        Long valueOf = Long.valueOf(j);
        if (okVar.containsKey(valueOf)) {
            bvif bvif = this.f67343d;
            if (bvif != null) {
                bxvd bxvd = (bxvd) this.f67340a.get(bvif);
                bxvd a = ((ahkk) this.f67341b.remove(valueOf)).mo36649a();
                if (a.f164950c) {
                    a.mo74035c();
                    a.f164950c = false;
                }
                bven bven = (bven) a.f164949b;
                bven bven2 = bven.f155761h;
                bven.f155769g = bvih.f156153j;
                bven.f155763a |= 32;
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bvem bvem = (bvem) bxvd.f164949b;
                bven bven3 = (bven) a.mo74062i();
                bvem bvem2 = bvem.f155753g;
                bven3.getClass();
                bvem.mo73360a();
                bvem.f155758d.add(bven3);
                return;
            }
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
            bnsl.mo68432a("ahkj", "a", 900, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unexpected call to outgoingPayloadDone() while NearbyRecorder has no active current medium.");
        }
    }

    /* renamed from: a */
    public final void mo36645a(bvif bvif) {
        if (this.f67343d != null) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
            bnsl.mo68432a("ahkj", "a", 798, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unexpected call to physicalConnectionEstablished while NearbyRecorder still has an active current medium.");
        }
        C1245ok okVar = this.f67340a;
        bxvd da = bvem.f155753g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvem bvem = (bvem) da.f164949b;
        bvem.f155757c = bvif.f156141k;
        bvem.f155755a |= 2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvem bvem2 = (bvem) da.f164949b;
        bvem2.f155755a |= 1;
        bvem2.f155756b = elapsedRealtime;
        okVar.put(bvif, da);
        this.f67343d = bvif;
    }

    /* renamed from: a */
    public final void mo36646a(bvif bvif, int i) {
        String str;
        bvif bvif2 = this.f67343d;
        if (bvif2 == null) {
            bnsl bnsl = (bnsl) ahkm.f67363a.mo68388c();
            bnsl.mo68432a("ahkj", "a", 813, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Unexpected call to physicalConnectionClosed() for medium %s while NearbyRecorder has no active current medium", bvif.name());
        } else if (bvif2 != bvif) {
            bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68388c();
            bnsl2.mo68432a("ahkj", "a", 818, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68424a("Unexpected call to physicalConnectionClosed() for medium %s while NearbyRecorder has active medium %s", bvif.name(), this.f67343d.name());
        }
        bxvd bxvd = (bxvd) this.f67340a.get(bvif);
        if (bxvd == null) {
            bnsl bnsl3 = (bnsl) ahkm.f67363a.mo68388c();
            bnsl3.mo68432a("ahkj", "a", 826, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Unexpected call to physicalConnectionClosed() for medium %s with no corresponding EstablishedConnection that was previously opened.", bvif.name());
        } else if ((((bvem) bxvd.f164949b).f155755a & 4) == 0) {
            mo36647a(bxvd, i);
            if (bvif == this.f67343d) {
                this.f67343d = null;
            }
        } else {
            bnsl bnsl4 = (bnsl) ahkm.f67363a.mo68388c();
            bnsl4.mo68432a("ahkj", "a", 833, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            String name = bvif.name();
            int a = bvic.m121133a(((bvem) bxvd.f164949b).f155760f);
            if (a == 0) {
                a = 1;
            }
            switch (a) {
                case 1:
                    str = "UNKNOWN_DISCONNECTION_REASON";
                    break;
                case 2:
                    str = "LOCAL_DISCONNECTION";
                    break;
                case 3:
                    str = "REMOTE_DISCONNECTION";
                    break;
                case 4:
                    str = "IO_ERROR";
                    break;
                case 5:
                    str = "UPGRADED";
                    break;
                case 6:
                    str = "SHUTDOWN";
                    break;
                default:
                    str = "UNFINISHED";
                    break;
            }
            bnsl4.mo68424a("Unexpected call to physicalConnectionClosed() for medium %s which already has disconnection reason %s", name, str);
        }
    }

    /* renamed from: a */
    public final void mo36647a(bxvd bxvd, int i) {
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bvem bvem = (bvem) bxvd.f164949b;
        int i2 = i - 1;
        bvem bvem2 = bvem.f155753g;
        if (i != 0) {
            bvem.f155760f = i2;
            bvem.f155755a |= 4;
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((bvem) bxvd.f164949b).f155756b;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvem bvem3 = (bvem) bxvd.f164949b;
            bvem3.f155755a |= 1;
            bvem3.f155756b = elapsedRealtime;
            List a = m55930a(this.f67341b, i);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvem bvem4 = (bvem) bxvd.f164949b;
            bvem4.mo73360a();
            bxsy.m123078a(a, bvem4.f155758d);
            List a2 = m55930a(this.f67342c, i);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvem bvem5 = (bvem) bxvd.f164949b;
            bvem5.mo73361b();
            bxsy.m123078a(a2, bvem5.f155759e);
            return;
        }
        throw null;
    }
}
