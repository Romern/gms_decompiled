package p000;

import com.google.android.libraries.messaging.lighter.model.ContactId;

/* renamed from: bcfl */
final /* synthetic */ class bcfl implements C1228nu {

    /* renamed from: a */
    private final bxvd f104080a;

    public bcfl(bxvd bxvd) {
        this.f104080a = bxvd;
    }

    /* renamed from: a */
    public final void mo9443a(Object obj) {
        bxvd bxvd = this.f104080a;
        bcuw bcuw = (bcuw) obj;
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int b = bcuw.mo57275b();
        int i = b - 1;
        if (b != 0) {
            int i2 = 4;
            if (i == 1) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bqhs bqhs = bqhs.f140708j;
                ((bqhs) bxvd.f164949b).f140716g = bqhl.m112844a(3);
                bcnw a = bcuw.mo57274a();
                bxvd da = bqhm.f140667g.mo74144da();
                String a2 = a.mo57017a();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                a2.getClass();
                ((bqhm) da.f164949b).f140669a = a2;
                int d = a.mo57020d();
                if (d == 1) {
                    i2 = 3;
                } else if (d != 2) {
                    i2 = 2;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bqhm) da.f164949b).f140672d = i2 - 2;
                bbot.m88296a(a.mo57021e(), new bcey(da));
                bbot.m88296a(a.mo57018b(), new bcez(da));
                bbot.m88296a(a.mo57019c(), new bcfa(da));
                bbot.m88296a(a.mo57021e(), new bcfb(da));
                bqhm bqhm = (bqhm) da.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bqhs bqhs2 = (bqhs) bxvd.f164949b;
                bqhm.getClass();
                bqhs2.f140711b = bqhm;
                bqhs2.f140710a = 7;
            } else if (i == 2) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bqhs bqhs3 = bqhs.f140708j;
                ((bqhs) bxvd.f164949b).f140716g = bqhl.m112844a(5);
            } else if (i == 3) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bqhs bqhs4 = bqhs.f140708j;
                ((bqhs) bxvd.f164949b).f140716g = bqhl.m112844a(7);
            } else if (i == 4) {
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bqhs bqhs5 = bqhs.f140708j;
                ((bqhs) bxvd.f164949b).f140716g = bqhl.m112844a(8);
            } else if (i == 5) {
                bcnx c = bcuw.mo57279c();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bqhs bqhs6 = bqhs.f140708j;
                ((bqhs) bxvd.f164949b).f140716g = bqhl.m112844a(6);
                bxvd da2 = bqhn.f140675e.mo74144da();
                boolean c2 = c.mo57027c();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((bqhn) da2.f164949b).f140679c = c2;
                boolean a3 = c.mo57025a();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((bqhn) da2.f164949b).f140677a = a3;
                long b2 = c.mo57026b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((bqhn) da2.f164949b).f140678b = b2;
                boolean d2 = c.mo57028d();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ((bqhn) da2.f164949b).f140680d = d2;
                bqhn bqhn = (bqhn) da2.mo74062i();
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bqhs bqhs7 = (bqhs) bxvd.f164949b;
                bqhn.getClass();
                bqhs7.f140711b = bqhn;
                bqhs7.f140710a = 9;
            }
        } else {
            throw null;
        }
    }
}
