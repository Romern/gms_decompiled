package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: bjqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjqr extends bjhy implements bjqt {

    /* renamed from: p */
    public ArrayList f123146p;

    /* renamed from: q */
    public bwzw f123147q;

    public bjqr(bjgv bjgv, bwny bwny, Bundle bundle) {
        super(bjgv, bwny, bundle);
    }

    /* renamed from: G */
    private final void m104379G() {
        bjqx bjqx = (bjqx) ((bjhy) this).f122754m;
        bxvw bxvw = this.f123147q.f161656d;
        int size = bxvw.size();
        for (int i = 0; i < size; i++) {
            Long l = (Long) bxvw.get(i);
            bjqs bjqs = (bjqs) this.f122639a.f122693b.mo65131a(l.longValue(), bjqs.class);
            boolean a = bjqx.mo65460a(l);
            if (bjqs.f123148l != a) {
                bjqs.f123148l = a;
                bjqs.mo65113b((bjgf) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo65240a(bjgf bjgf) {
        m104379G();
        super.mo65240a(bjgf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bjhs mo65264b(bwny bwny) {
        bjqx bjqx = (bjqx) ((bjhy) this).f122754m;
        if (this.f123147q.f161654b) {
            if (!(bjqx instanceof bjqq)) {
                return new bjqq();
            }
        } else if (!(bjqx instanceof bjqy)) {
            return new bjqy();
        }
        return bjqx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo65115c() {
        m104379G();
    }

    /* access modifiers changed from: protected */
    /* renamed from: cF */
    public final Iterable mo65118cF() {
        bngx e = bngx.m109376e();
        bjqx bjqx = (bjqx) ((bjhy) this).f122754m;
        if (bjqx instanceof bjqy) {
            bjqy bjqy = (bjqy) bjqx;
            if (bjqy.mo65464e()) {
                return bngx.m109356a(Long.valueOf(bjqy.f123154d));
            }
        } else if (bjqx instanceof bjqq) {
            return ((bjqq) bjqx).f123145d;
        }
        return e;
    }

    /* renamed from: h */
    public final String mo65122h() {
        bjqx bjqx = (bjqx) ((bjhy) this).f122754m;
        if (bjqx instanceof bjqy) {
            bjqy bjqy = (bjqy) bjqx;
            return bjqy.mo65464e() ? this.f122639a.f122693b.mo65130a(bjqy.f123154d).mo65122h() : "";
        } else if (!(bjqx instanceof bjqq)) {
            return "";
        } else {
            String str = this.f123147q.f161655c;
            Iterator it = ((bjqq) bjqx).f123145d.iterator();
            StringBuilder sb = new StringBuilder();
            while (it.hasNext()) {
                sb.append(this.f122639a.f122693b.mo65130a(((Long) it.next()).longValue()).mo65122h());
                if (it.hasNext()) {
                    sb.append(str);
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: a */
    public final void mo65461a(bjqs bjqs) {
        bjqx bjqx = (bjqx) ((bjhy) this).f122754m;
        if (bjqx instanceof bjqy) {
            ((bjqy) bjqx).mo65463a(bjqs.mo65120e());
        } else if (bjqx instanceof bjqq) {
            bjqq bjqq = (bjqq) bjqx;
            if (bjqs.f123148l) {
                if (bjqq.f123145d.remove(Long.valueOf(bjqs.mo65120e()))) {
                    bjqq.mo65244a((bjgf) null);
                }
            } else {
                if (bjqq.f123145d.add(Long.valueOf(bjqs.mo65120e()))) {
                    bjqq.mo65244a((bjgf) null);
                }
            }
        }
        ArrayList arrayList = this.f123146p;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bjqt) arrayList.get(i)).mo65461a(bjqs);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65100a(bwny bwny, bwny bwny2) {
        bxvj bxvj = bwzw.f161651f;
        bwny2.mo74135a(bxvj);
        Object b = bwny2.f164952m.mo73913b(bxvj.f164958d);
        if (b == null) {
            b = bxvj.f164956b;
        } else {
            bxvj.mo74139a(b);
        }
        this.f123147q = (bwzw) b;
        super.mo65100a(bwny, bwny2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65103a(bwoq bwoq) {
        boolean z;
        bwzx bwzx;
        bxvj bxvj = bxaa.f161663e;
        bwoq.mo74135a(bxvj);
        if (bwoq.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = bxaa.f161663e;
            bwoq.mo74135a(bxvj2);
            Object b = bwoq.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            bxaa bxaa = (bxaa) b;
            int a = bwzz.m122481a(bxaa.f161667c);
            int i = 1;
            if (a != 0 && a == 2) {
                if (bxaa.f161665a == 2) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108589a(z, "Selector resulting action replace selected options equals missing proto.");
                if (bxaa.f161665a == 2) {
                    bwzx = (bwzx) bxaa.f161666b;
                } else {
                    bwzx = bwzx.f161658b;
                }
                bxvw bxvw = bwzx.f161660a;
                bjqx bjqx = (bjqx) ((bjhy) this).f122754m;
                if (bjqx instanceof bjqy) {
                    if (bxvw.size() > 1) {
                        mo65114b("Single selector does not support more than 1 selection");
                    }
                    bjqy bjqy = (bjqy) bjqx;
                    if (!bxvw.isEmpty()) {
                        bjqy.mo65463a(((Long) bxvw.get(0)).longValue());
                    } else if (bjqy.mo65464e()) {
                        bjqy.f123154d = -1;
                        bjqy.mo65244a((bjgf) null);
                    }
                } else if (bjqx instanceof bjqq) {
                    bjqq bjqq = (bjqq) bjqx;
                    C1225nr nrVar = new C1225nr(bxvw);
                    if (!nrVar.equals(bjqq.f123145d)) {
                        bjqq.f123145d = nrVar;
                        bjqq.mo65244a((bjgf) null);
                    }
                }
            } else {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                int a2 = bwzz.m122481a(bxaa.f161667c);
                if (a2 != 0) {
                    i = a2;
                }
                objArr[0] = Integer.valueOf(i - 1);
                mo65114b(String.format(locale, "Unknown Selector ResultingAction: %s", objArr));
            }
        } else {
            super.mo65103a(bwoq);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65110a(bwoi bwoi) {
        boolean z;
        bwzs bwzs;
        bxvj bxvj = bwzv.f161644e;
        bwoi.mo74135a(bxvj);
        int i = 1;
        if (!bwoi.f164952m.mo73911a(bxvj.f164958d)) {
            return super.mo65110a(bwoi);
        }
        bxvj bxvj2 = bwzv.f161644e;
        bwoi.mo74135a(bxvj2);
        Object b = bwoi.f164952m.mo73913b(bxvj2.f164958d);
        if (b == null) {
            b = bxvj2.f164956b;
        } else {
            bxvj2.mo74139a(b);
        }
        bwzv bwzv = (bwzv) b;
        int a = bwzu.m122476a(bwzv.f161648c);
        if (a != 0 && a == 2) {
            if (bwzv.f161646a == 2) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108589a(z, "Selector condition all selected options equals missing proto.");
            if (bwzv.f161646a == 2) {
                bwzs = (bwzs) bwzv.f161647b;
            } else {
                bwzs = bwzs.f161639b;
            }
            bxvw bxvw = bwzs.f161641a;
            bjqx bjqx = (bjqx) ((bjhy) this).f122754m;
            bxvw bxvw2 = this.f123147q.f161656d;
            int size = bxvw2.size();
            int i2 = 0;
            while (i2 < size) {
                Long l = (Long) bxvw2.get(i2);
                i2++;
                if (bjqx.mo65460a(l) != bxvw.contains(l)) {
                    return false;
                }
            }
            return true;
        }
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        int a2 = bwzu.m122476a(bwzv.f161648c);
        if (a2 != 0) {
            i = a2;
        }
        objArr[0] = Integer.valueOf(i - 1);
        mo65114b(String.format(locale, "Unknown Selector Condition: %s", objArr));
        return false;
    }
}
