package p000;

import java.util.List;

/* renamed from: carb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class carb implements care {

    /* renamed from: a */
    private final cara f175655a;

    /* renamed from: b */
    private final caox f175656b;

    public carb(caox caox, cara cara) {
        this.f175656b = caox;
        this.f175655a = cara;
    }

    /* renamed from: a */
    public final void mo74781a() {
        this.f175655a.mo74779e();
    }

    /* renamed from: a */
    public final byte[] mo74782a(caoi caoi) {
        return caqq.m126987a(caoi, this.f175655a).f175590c;
    }

    /* renamed from: a */
    public final byte[] mo74783a(caok caok) {
        byte[] bArr;
        caqj caqj = new caqj(this.f175656b, caok, this.f175655a);
        casc casc = caqj.f175544i.f175730a.f175742a;
        byte[] bArr2 = casc.f175741j;
        if (bArr2 == null || bArr2.length != 2 || (bArr = casc.f175736e) == null || bArr.length != 2) {
            throw new capl("Magstripe data not found in profile");
        } else if (!catg.m127158a(caqj.f175537b.f175455g)) {
            caqk caqk = caqj.f175542g;
            caok caok2 = caqj.f175537b;
            caqk.f175550b = caok2.f175450b;
            caqk.f175551c = caok2.f175453e;
            caqk.f175552d = caok2.f175456h;
            boolean z = true;
            caqk.f175553e = new byte[]{caok2.f175458j};
            caqk.f175554f = caok2.f175454f;
            cara cara = caqj.f175538c;
            casy casy = caqj.f175540e;
            byte[] b = caqj.f175544i.mo74798b();
            List a = caqf.m126958a(cara, casy, caqj.f175543h.mo49416a(1));
            byte[] bArr3 = caok2.f175450b;
            byte[] bArr4 = caok2.f175453e;
            byte[] bArr5 = cara.f175640b;
            byte[] bArr6 = cara.f175641c;
            boolean z2 = cara.f175639a;
            a.add(new caqa());
            if (((casz) casy).f175794a == 1) {
                if ((b[0] & 2) == 2) {
                    z = false;
                }
            } else if ((b[0] & 4) == 4) {
                z = false;
            }
            a.add(new caqg(z));
            a.add(new caqd(cara.mo74776b(), cara.mo74775a(), caqd.m126955a(casy), caqd.m126954a(cara, casy), casy));
            return (byte[]) new caqy(caqj.f175538c.mo74774a(capw.m126927a(a), caqj.f175540e, caqj.f175541f), caqj.f175540e, caqj.f175541f, caqj.f175543h, caqj.f175538c.mo74775a(), caqj.f175538c.mo74780f(), new caqi(caqj)).mo74773a();
        } else {
            throw new capl("The Terminal is offline");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r13.mo74803g() != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r2.f175581l.mo74803g() != false) goto L_0x0038;
     */
    /* renamed from: a */
    public final byte[] mo74784a(caoo caoo) {
        caqo caqo = new caqo(this.f175656b, caoo, this.f175655a);
        if (caqo.f175578i.f175556h) {
            casb casb = caqo.f175581l;
            carz carz = casb.f175730a.f175747f;
            if (carz != null) {
                byte[] bArr = carz.f175727e;
                if (bArr != null) {
                    if (bArr.length == 3) {
                        byte[] bArr2 = carz.f175725c;
                        if (bArr2 != null) {
                            if (bArr2.length == 6) {
                            }
                        }
                    }
                }
            }
            throw new capl("MCHIP profile data is not available");
        }
        int i = caqo.f175581l.f175730a.f175742a.f175734c;
        caoo caoo2 = caqo.f175570a;
        if (i != caoo2.f175466b.length) {
            throw new capp("Pdol and CDOL1 Related Data Length do not match");
        } else if (!catg.m127158a(caoo2.f175474j)) {
            caqk caqk = caqo.f175578i;
            caoo caoo3 = caqo.f175570a;
            caqk.f175550b = caoo3.f175467c;
            caqk.f175551c = caoo3.f175470f;
            caqk.f175552d = caoo3.f175471g;
            caqk.f175553e = caoo3.f175472h;
            caqk.f175554f = caoo3.f175473i;
            if (((cata) caqo.f175579j).f175803a == 1) {
                caqo.f175572c.mo74740c();
            } else {
                caqo.f175572c.mo74742d();
            }
            int a = caqh.m126960a(caqo.f175570a.f175466b, caqo.f175576g, caqo.f175575f, caqo.f175582m.f175705a);
            if (a == 1) {
                caqo.f175572c.mo74745g();
            } else if (a == 2) {
                caqo.f175572c.mo74746h();
            }
            if (caqo.f175571b.mo74775a()) {
                caqo.f175572c.mo74737a();
            } else {
                caqo.f175572c.mo74738b();
            }
            caoo caoo4 = caqo.f175570a;
            cara cara = caqo.f175571b;
            casy casy = caqo.f175579j;
            capx capx = caqo.f175572c;
            byte[] bArr3 = caqo.f175575f;
            List a2 = caqf.m126958a(cara, casy, caqo.f175577h.mo49416a(1));
            byte[] bArr4 = caoo4.f175467c;
            byte[] bArr5 = caoo4.f175470f;
            byte[] bArr6 = cara.f175640b;
            byte[] bArr7 = cara.f175641c;
            boolean z = cara.f175639a;
            a2.add(new caqa());
            a2.add(new caqg(!capx.mo74739b(bArr3)));
            a2.add(new caqd(cara.mo74776b(), cara.mo74775a(), caqd.m126955a(casy), caqd.m126954a(cara, casy), casy));
            casg a3 = capw.m126927a(a2);
            if (a3.f175748a.contains(cash.MISSING_CD_CVM)) {
                byte[] bArr8 = caqo.f175572c.f175521a;
                bArr8[3] = (byte) (1 | bArr8[3]);
            }
            return (byte[]) new caqy(caqo.f175571b.mo74774a(a3, caqo.f175579j, caqo.f175580k), caqo.f175579j, caqo.f175580k, caqo.f175577h, caqo.f175571b.mo74775a(), caqo.f175571b.mo74780f(), new caqn(caqo)).mo74773a();
        } else {
            throw new capl("MCHIP profile data is not available");
        }
    }

    /* renamed from: a */
    public final byte[] mo74785a(caoq caoq) {
        return caor.m126887a();
    }
}
