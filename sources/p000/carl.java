package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: carl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class carl implements cari {

    /* renamed from: a */
    private final caox f175677a;

    /* renamed from: b */
    private final carj f175678b;

    /* renamed from: c */
    private final cark f175679c;

    public carl(caox caox, carj carj) {
        this.f175677a = caox;
        this.f175678b = carj;
        carj carj2 = this.f175678b;
        this.f175679c = new cark(carj2.f175663a, carj2.f175666d, carj2.f175664b, carj2.f175665c);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final caru mo74786a(caro caro) {
        casg casg;
        try {
            caqt caqt = new caqt(this.f175677a, this.f175678b.f175671i, caro, this.f175679c);
            if (!Arrays.equals(caqt.f175605b.f175682c, caqt.f175612i.f175706b)) {
                caqt.f175606c.mo74742d();
            } else {
                caqt.f175606c.mo74740c();
            }
            byte[] a = caqt.m126996a(caqt.f175605b);
            carw carw = caqt.f175611h;
            int a2 = caqh.m126960a(a, carw.f175709c, carw.f175713g, caqt.f175612i.f175705a);
            boolean z = true;
            if (a2 == 1) {
                caqt.f175606c.mo74745g();
            } else if (a2 == 2) {
                caqt.f175606c.mo74746h();
            }
            if (caqt.f175607d.mo74792a()) {
                caqt.f175606c.mo74737a();
            } else {
                caqt.f175606c.mo74738b();
            }
            cark cark = caqt.f175607d;
            casy casy = caqt.f175608e;
            capx capx = caqt.f175606c;
            byte[] bArr = caqt.f175611h.f175713g;
            boolean a3 = caqt.f175604a.mo49416a(2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new caqg(!capx.mo74739b(bArr)));
            arrayList.add(new capz(cark.f175675c.mo49421e()));
            arrayList.add(new caqd(cark.f175674b.mo49418b(), cark.mo74792a(), true, true, casy));
            boolean a4 = cark.f175673a.mo49417a(3, 2);
            if (cark.mo74793b() != 1) {
                z = false;
            }
            arrayList.add(new caqb(cark.mo74792a(), z, a4));
            arrayList.add(new caqc(a3));
            casg a5 = capw.m126927a(arrayList);
            cark cark2 = caqt.f175607d;
            casy casy2 = caqt.f175608e;
            caso caso = caqt.f175609f;
            Ccase caseR = cark2.f175676d;
            if (caseR == null) {
                casg = a5;
            } else {
                casg = caseR.mo49413a(a5, casy2, caso);
            }
            caru caru = (caru) new caqy(casg, caqt.f175608e, caqt.f175609f, caqt.f175604a, caqt.f175607d.mo74792a(), caqt.f175607d.mo74793b(), new caqs(caqt)).mo74773a();
            mo74790b();
            return caru;
        } catch (capk e) {
            bqye.m113758a(e);
            mo74790b();
            return null;
        } catch (Throwable th) {
            mo74790b();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo74790b() {
        carj carj = this.f175678b;
        carj.f175670h = new carh(this.f175677a, carj);
    }

    /* renamed from: a */
    public final void mo74787a() {
        throw new capt("Invalid State for startRemotePayment");
    }

    /* renamed from: a */
    public final void mo74788a(carn carn) {
        throw new capt("Invalid State for startContactLessPayment");
    }

    /* renamed from: a */
    public final byte[] mo74789a(byte[] bArr) {
        return caor.m126887a();
    }
}
