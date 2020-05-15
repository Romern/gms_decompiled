package p000;

import java.util.Calendar;
import java.util.List;

/* renamed from: card */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1707card implements cari {

    /* renamed from: a */
    private final carj f175658a;

    /* renamed from: b */
    private final cara f175659b;

    public C1707card(caox caox, carj carj, carn carn) {
        this.f175658a = carj;
        casa casa = carj.f175671i;
        if (carn != null) {
            caov caov = carj.f175663a;
            caoy caoy = carj.f175666d;
            casf casf = carj.f175664b;
            Ccase caseR = carj.f175665c;
            List list = carj.f175667e;
            List list2 = carj.f175668f;
            boolean z = carj.f175669g;
            cara cara = new cara(caox, casa, caov, caoy, casf, caseR, list, list2, carn);
            this.f175659b = cara;
            cara.mo74777c();
            return;
        }
        throw new capg("Invalid input data");
    }

    /* renamed from: a */
    public final caru mo74786a(caro caro) {
        throw new capt("Invalid state createRemoteCryptogram");
    }

    /* renamed from: b */
    public final void mo74790b() {
        cara cara = this.f175659b;
        if (cara != null) {
            caqk caqk = cara.f175642d;
            carn carn = cara.f175651m;
            if (!cara.f175652n) {
                if (caqk.f175549a == null) {
                    caqk.mo74763a(cara.f175643e.mo49420d().mo49410c());
                }
                if (caqk.f175552d == null) {
                    Calendar instance = Calendar.getInstance();
                    int i = instance.get(1) - 2000;
                    if (i >= 0) {
                        int i2 = instance.get(2);
                        int i3 = instance.get(5);
                        String a = carg.m127039a(String.valueOf(i));
                        String a2 = carg.m127039a(String.valueOf(i2 + 1));
                        String a3 = carg.m127039a(String.valueOf(i3));
                        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + String.valueOf(a2).length() + String.valueOf(a3).length());
                        sb.append(a);
                        sb.append(a2);
                        sb.append(a3);
                        caqk.f175552d = catg.m127160a(sb.toString());
                    } else {
                        throw new caph("Unable to retrieve the current year");
                    }
                }
                ((asrk) carn).f89523a.mo49403a(new caqu(caqk, null, new byte[0], new byte[0]));
            }
            care care = this.f175659b.f175650l;
            if (care != null) {
                care.mo74781a();
            }
        }
        carj carj = this.f175658a;
        if (carj != null) {
            carj.mo74791a();
        }
    }

    /* renamed from: a */
    public final void mo74787a() {
        throw new capt("Invalid state for startRemotePayment");
    }

    /* renamed from: a */
    public final void mo74788a(carn carn) {
        throw new capt("Invalid state for startContactLessPayment");
    }

    /* renamed from: a */
    public final byte[] mo74789a(byte[] bArr) {
        care care = this.f175659b.f175650l;
        try {
            int a = caoi.m126871a(bArr) - 1;
            if (a == 1) {
                caqr caqr = new caqr(new caos(bArr), this.f175658a.f175671i, this.f175659b);
                int i = caqr.f175597c - 1;
                if (i == 0) {
                    cara cara = caqr.f175596b;
                    List list = cara.f175647i;
                    cara.f175642d.f175556h = false;
                    return caqr.mo74770a(list, caqr.f175598d.mo74799c());
                } else if (i == 1) {
                    cara cara2 = caqr.f175596b;
                    List list2 = cara2.f175647i;
                    cara2.f175642d.f175556h = true;
                    return caqr.mo74770a(list2, caqr.f175599e.f175723a);
                } else if (i != 2) {
                    caqr.f175596b.mo74777c();
                    return caor.m126888a(27266);
                } else {
                    caqr.f175596b.mo74777c();
                    return caor.m126889a(caqr.f175598d.mo74800d());
                }
            } else if (a == 2) {
                return care.mo74785a(new caoq(bArr, this.f175659b.f175642d.f175559k));
            } else {
                if (a == 3) {
                    return care.mo74782a(new caoi(bArr, null));
                }
                if (a != 4) {
                    byte[] a2 = care.mo74783a(new caok(bArr, this.f175659b.f175642d.f175560l));
                    this.f175659b.mo74778d();
                    mo74790b();
                    return a2;
                }
                byte[] a3 = care.mo74784a(new caoo(bArr));
                this.f175659b.mo74778d();
                mo74790b();
                return a3;
            }
        } catch (capg e) {
            throw new capk(e.getMessage());
        } catch (capk e2) {
            return e2.f175516a;
        } catch (RuntimeException e3) {
            bqye.m113758a(e3);
            return caor.m126888a(28416);
        } catch (Throwable th) {
            mo74790b();
            throw th;
        }
    }
}
