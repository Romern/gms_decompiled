package p000;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: bjgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjgd extends bjil implements bjgc, bjhb, bjfg {

    /* renamed from: Dy */
    private final ArrayList f122637Dy = new ArrayList();

    /* renamed from: Dz */
    private boolean f122638Dz;

    /* renamed from: a */
    public final bjgv f122639a;

    /* renamed from: b */
    public final ArrayList f122640b = new ArrayList(1);

    /* renamed from: c */
    public ArrayList f122641c;

    /* renamed from: d */
    C1230nw f122642d;

    /* renamed from: e */
    C1230nw f122643e;

    /* renamed from: f */
    public final C1246ol f122644f = new C1246ol();

    /* renamed from: g */
    public String f122645g = "";

    /* renamed from: h */
    public LinkedHashMap f122646h;

    /* renamed from: i */
    public final bjgh f122647i = new bjgh(true, null, false, false);

    /* renamed from: j */
    public bjfh f122648j;

    /* renamed from: k */
    public int f122649k = 1;

    /* renamed from: l */
    private bwny f122650l;

    protected bjgd(bjgv bjgv, bwny bwny, Bundle bundle) {
        this.f122639a = bjgv;
        mo65099a(bwny, bundle);
    }

    /* renamed from: a */
    private final void m103340a(bwny bwny, bwog bwog) {
        bwog bwog2;
        bwny bwny2 = this.f122650l;
        if (bwny2 != null) {
            bwog2 = bwny2.f160417b;
            if (bwog2 == null) {
                bwog2 = bwog.f160437f;
            }
        } else {
            bwog2 = null;
        }
        this.f122650l = bwny;
        if (bwny2 != null) {
            bjhg.m103485a(this.f122644f);
            this.f122637Dy.clear();
            mo65124j();
            this.f122642d = null;
            this.f122643e = null;
            mo65119d();
        }
        bjhg.m103486a(this.f122644f, this.f122650l.f160420e);
        bxwc bxwc = this.f122650l.f160425j;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = this.f122637Dy;
            bpsg a = bpsg.m112232a(((bxaz) bxwc.get(i)).f161769c);
            if (a == null) {
                a = bpsg.EVENT_TYPE_UNKNOWN;
            }
            arrayList.add(a);
        }
        mo65100a(bwny2, this.f122650l);
        mo65102a(bwog2, bwog);
        bwny bwny3 = this.f122650l;
        if ((bwny3.f160416a & 16) != 0) {
            bwnx bwnx = bwny3.f160424i;
            if (bwnx == null) {
                bwnx = bwnx.f160410b;
            }
            String str = bwnx.f160412a;
            if (!TextUtils.equals(this.f122645g, str)) {
                this.f122645g = str;
                ArrayList arrayList2 = this.f122640b;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((bjgf) arrayList2.get(i2)).mo65137cI();
                }
            }
        }
        this.f122638Dz = mo65109a(bpsg.EVENT_TYPE_VALIDATION_ERROR);
    }

    /* renamed from: c */
    private final bjfh m103343c(Bundle bundle) {
        bjfh a = this.f122639a.f122692a.f122730g.mo65088a(this, bundle);
        mo65286a(1, a);
        return a;
    }

    /* renamed from: p */
    private final void mo65253p() {
        ArrayList arrayList = this.f122640b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bjgf) arrayList.get(i)).mo65138cJ();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65100a(bwny bwny, bwny bwny2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo65110a(bwoi bwoi) {
        return true;
    }

    /* renamed from: b */
    public bxvf mo65111b(boolean z) {
        bwog bwog = this.f122650l.f160417b;
        if (bwog == null) {
            bwog = bwog.f160437f;
        }
        bxvd bxvd = (bxvd) bwog.mo74142c(5);
        bxvd.mo73625a((bxvk) bwog);
        bxvf bxvf = (bxvf) bxvd;
        bxvd o = mo65129o();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        bwog bwog2 = (bwog) bxvf.f164949b;
        bwof bwof = (bwof) o.mo74062i();
        bwof.getClass();
        bwog2.f160441c = bwof;
        bwog2.f160439a |= 4;
        if (!TextUtils.isEmpty(this.f122647i.f122655b)) {
            String str = this.f122647i.f122655b;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bwog bwog3 = (bwog) bxvf.f164949b;
            str.getClass();
            bwog3.f160439a |= 8;
            bwog3.f160442d = str;
        }
        return bxvf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo65115c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: cF */
    public Iterable mo65118cF() {
        return bngx.m109376e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo65119d() {
    }

    /* renamed from: e */
    public final long mo65120e() {
        bwog bwog = this.f122650l.f160417b;
        if (bwog == null) {
            bwog = bwog.f160437f;
        }
        return bwog.f160440b;
    }

    /* renamed from: g */
    public final void mo65121g() {
        ArrayList arrayList = this.f122641c;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bjgg) arrayList.get(i)).mo65141a();
            }
        }
    }

    /* renamed from: h */
    public String mo65122h() {
        mo65117c("getDisplayText not supported");
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public List mo65123i() {
        LinkedHashMap linkedHashMap = this.f122646h;
        return linkedHashMap != null ? new ArrayList(linkedHashMap.values()) : bngx.m109376e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo65124j() {
        LinkedHashMap linkedHashMap = this.f122646h;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
    }

    /* renamed from: k */
    public final boolean mo65125k() {
        return mo65095a(true).f122654a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo65126l() {
        return false;
    }

    /* renamed from: m */
    public final String mo65127m() {
        return this.f122647i.f122655b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final bjfh mo65128n() {
        if (this.f122648j == null) {
            this.f122648j = m103343c((Bundle) null);
        }
        return this.f122648j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public bxvd mo65129o() {
        bxvd da = bwof.f160430f.mo74144da();
        int i = this.f122649k;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwof bwof = (bwof) da.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            bwof.f160433b = i2;
            int i3 = bwof.f160432a | 1;
            bwof.f160432a = i3;
            bwof.f160436e = (!this.f122647i.f122654a ? 3 : 2) - 1;
            bwof.f160432a = i3 | 8;
            return da;
        }
        throw null;
    }

    /* renamed from: c */
    public final void mo65116c(bjgf bjgf) {
        this.f122640b.remove(bjgf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo65117c(String str) {
        throw new UnsupportedOperationException(String.format(Locale.US, "reference: %d, err: %s", Long.valueOf(mo65120e()), str));
    }

    /* renamed from: b */
    public final void mo65112b(long j) {
        C1230nw nwVar;
        if (this.f122643e == null) {
            bxwc bxwc = this.f122650l.f160422g;
            if (bxwc != null) {
                nwVar = new C1230nw(bxwc.size());
                int size = bxwc.size();
                for (int i = 0; i < size; i++) {
                    bwoq bwoq = (bwoq) bxwc.get(i);
                    m103341a(bwoq, bwoq.f160483b, nwVar);
                }
            } else {
                nwVar = new C1230nw();
            }
            this.f122643e = nwVar;
        }
        if (this.f122643e.mo15534a(j) != null) {
            for (bwoq bwoq2 : (List) this.f122643e.mo15534a(j)) {
                mo65103a(bwoq2);
            }
        }
    }

    /* renamed from: a */
    private static void m103341a(bxxc bxxc, List list, C1230nw nwVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            long longValue = ((Long) list.get(i)).longValue();
            List arrayList = nwVar.mo15534a(longValue) == null ? new ArrayList() : (List) nwVar.mo15534a(longValue);
            arrayList.add(bxxc);
            nwVar.mo15540b(longValue, arrayList);
        }
    }

    /* renamed from: a */
    private final void m103342a(boolean z, String str) {
        bjgh bjgh = this.f122647i;
        if (bjgh.f122654a != z || !TextUtils.equals(bjgh.f122655b, str)) {
            bjgh bjgh2 = this.f122647i;
            bjgh2.f122654a = z;
            bjgh2.f122655b = str;
            mo65253p();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067 A[RETURN] */
    /* renamed from: a */
    public final int mo65094a(long j) {
        int i;
        bwoi bwoi;
        C1230nw nwVar;
        if (this.f122642d == null) {
            bxwc bxwc = this.f122650l.f160421f;
            if (bxwc != null) {
                nwVar = new C1230nw(bxwc.size());
                int size = bxwc.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bwoi bwoi2 = (bwoi) bxwc.get(i2);
                    m103341a(bwoi2, bwoi2.f160454b, nwVar);
                }
            } else {
                nwVar = new C1230nw();
            }
            this.f122642d = nwVar;
        }
        if (this.f122642d.mo15534a(j) != null) {
            List list = (List) this.f122642d.mo15534a(j);
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    bwoi = (bwoi) it.next();
                    boolean a = mo65110a(bwoi);
                    if (!bwoi.f160457e) {
                        if (!a) {
                            break;
                        }
                    } else if (a) {
                        break;
                    }
                }
                i = bwoi.f160456d;
                if (i == 0) {
                    return i;
                }
            }
            i = 0;
            if (i == 0) {
                return 0;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65113b(bjgf bjgf) {
        ArrayList arrayList = this.f122640b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjgf bjgf2 = (bjgf) arrayList.get(i);
            if (bjgf2 != bjgf) {
                bjgf2.mo65136cH();
            }
        }
    }

    /* renamed from: b */
    public final void mo65114b(String str) {
        throw new IllegalArgumentException(String.format(Locale.US, "reference: %d, err: %s", Long.valueOf(mo65120e()), str));
    }

    /* renamed from: a */
    public final bjgh mo65095a(boolean z) {
        boolean z2;
        boolean l = mo65126l();
        bwny bwny = this.f122650l;
        boolean z3 = bwny.f160418c;
        boolean z4 = false;
        String str = "";
        if (!l) {
            z2 = false;
            boolean z5 = true;
            for (bjgb bjgb : mo65123i()) {
                if (z5 && !(z5 = bjgb.mo65090a())) {
                    str = bjgb.mo65091b();
                    if (this.f122638Dz) {
                        bxvd da = bpsk.f138966h.mo74144da();
                        long j = this.f122639a.f122692a.f122725b;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpsk bpsk = (bpsk) da.f164949b;
                        bpsk.f138968a |= 1;
                        bpsk.f138971d = j;
                        bpsg bpsg = bpsg.EVENT_TYPE_VALIDATION_ERROR;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpsk bpsk2 = (bpsk) da.f164949b;
                        bpsk2.f138972e = bpsg.f138957l;
                        bpsk2.f138968a |= 2;
                        long e = mo65120e();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpsk bpsk3 = (bpsk) da.f164949b;
                        bpsk3.f138968a |= 8;
                        bpsk3.f138973f = e;
                        bjie.f122757a.mo65279c().mo65294a((bpsk) da.mo74062i(), this.f122639a.f122692a.f122724a.mo71762a());
                    }
                }
                if (!z2) {
                    z2 = bjgb.mo65092c();
                }
            }
            z4 = z5;
        } else if (!z3) {
            str = bwny.f160419d;
            z2 = false;
        } else {
            z2 = false;
            z4 = true;
        }
        bjgh bjgh = null;
        if (z || z4) {
            for (Long l2 : mo65118cF()) {
                bjgh = this.f122639a.f122693b.mo65130a(l2.longValue()).mo65095a(z);
                if (!bjgh.f122654a && !z) {
                    break;
                }
            }
        }
        if (bjgh != null) {
            z4 &= bjgh.f122654a;
        }
        bjgh bjgh2 = new bjgh(z4, str, z2, this.f122647i.f122657d);
        if (z) {
            bjgh bjgh3 = this.f122647i;
            if (!bjgh3.equals(bjgh2)) {
                bjgh3.f122654a = bjgh2.f122654a;
                bjgh3.f122656c = bjgh2.f122656c;
                bjgh3.f122655b = bjgh2.f122655b;
                bjgh3.f122657d = bjgh2.f122657d;
            }
            mo65253p();
        }
        return bjgh2;
    }

    /* renamed from: a */
    public Object mo65096a(int i) {
        throw new UnsupportedOperationException("GetValueByField is not supported by DataComponent.");
    }

    /* renamed from: a */
    public void mo52014a(int i, bjfd bjfd) {
        mo65114b(String.format(Locale.US, "Unhandled action response with invalid request code: %d.", Integer.valueOf(i)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52015a(Bundle bundle) {
        bjhq.m103514b(bundle, "dataValue", mo65111b(false).mo74062i());
        bundle.putBoolean("isTerminal", this.f122647i.f122656c);
        bundle.putBoolean("isOrWasDisplayed", this.f122647i.f122657d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65097a(bjhg bjhg) {
        this.f122644f.mo15637a(bjhg.mo65222a(), bjhg);
    }

    /* renamed from: a */
    public final void mo65098a(bwny bwny) {
        bwog bwog = bwny.f160417b;
        if (bwog == null) {
            bwog = bwog.f160437f;
        }
        m103340a(bwny, bwog);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65099a(bwny bwny, Bundle bundle) {
        if (bundle == null || !bundle.containsKey("dataValue")) {
            mo65098a(bwny);
        } else {
            m103340a(bwny, (bwog) bjhq.m103511a(bundle, "dataValue", bwog.f160437f));
        }
        if (bundle != null) {
            Bundle a = bjil.m103603a(1, bundle);
            if (a != null) {
                this.f122648j = m103343c(a);
            }
            bjgh bjgh = this.f122647i;
            bjgh.f122656c = bundle.getBoolean("isTerminal", false);
            bjgh.f122657d = bundle.getBoolean("isOrWasDisplayed", false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65101a(bwof bwof, bwof bwof2) {
        int a = bwoa.m122149a(bwof2.f160433b);
        if (a == 0) {
            a = 2;
        }
        if (a != this.f122649k) {
            this.f122649k = a;
            ArrayList arrayList = this.f122640b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bjgf) arrayList.get(i)).mo65140e();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65102a(bwog bwog, bwog bwog2) {
        bwof bwof;
        if (bwog != null) {
            bwof = bwog.f160441c;
            if (bwof == null) {
                bwof = bwof.f160430f;
            }
        } else {
            bwof = null;
        }
        bwof bwof2 = bwog2.f160441c;
        if (bwof2 == null) {
            bwof2 = bwof.f160430f;
        }
        mo65101a(bwof, bwof2);
        boolean z = true;
        this.f122647i.f122656c = true;
        bwof bwof3 = bwog2.f160441c;
        if (bwof3 == null) {
            bwof3 = bwof.f160430f;
        }
        int a = bwoe.m122153a(bwof3.f160436e);
        if (a == 0) {
            a = 5;
        }
        if (a == 3) {
            z = false;
        }
        m103342a(z, bwog2.f160442d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65103a(bwoq bwoq) {
        int i;
        bxvj bxvj = bwoo.f160469e;
        bwoq.mo74135a(bxvj);
        if (bwoq.f164952m.mo73911a(bxvj.f164958d)) {
            bxvj bxvj2 = bwoo.f160469e;
            bwoq.mo74135a(bxvj2);
            Object b = bwoq.f164952m.mo73913b(bxvj2.f164958d);
            if (b == null) {
                b = bxvj2.f164956b;
            } else {
                bxvj2.mo74139a(b);
            }
            bwoo bwoo = (bwoo) b;
            int a = bwon.m122162a(bwoo.f160473c);
            int i2 = 1;
            if (a == 0 || a != 2) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                int a2 = bwon.m122162a(bwoo.f160473c);
                if (a2 != 0) {
                    i2 = a2;
                }
                objArr[0] = Integer.valueOf(i2 - 1);
                mo65114b(String.format(locale, "Unsupported ResultingAction: %s.", objArr));
            } else if (bwoo.f160471a == 2) {
                bwog bwog = this.f122650l.f160417b;
                if (bwog == null) {
                    bwog = bwog.f160437f;
                }
                bwof bwof = bwog.f160441c;
                if (bwof == null) {
                    bwof = bwof.f160430f;
                }
                bxvd bxvd = (bxvd) bwof.mo74142c(5);
                bxvd.mo73625a((bxvk) bwof);
                if (bwoo.f160471a != 2 || (i = bwoa.m122149a(((Integer) bwoo.f160472b).intValue())) == 0) {
                    i = 1;
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bwof bwof2 = (bwof) bxvd.f164949b;
                int i3 = i - 1;
                if (i != 0) {
                    bwof2.f160433b = i3;
                    bwof2.f160432a |= 1;
                    bwof bwof3 = (bwof) bxvd.mo74062i();
                    bwog bwog2 = this.f122650l.f160417b;
                    if (bwog2 == null) {
                        bwog2 = bwog.f160437f;
                    }
                    bxvd bxvd2 = (bxvd) bwog2.mo74142c(5);
                    bxvd2.mo73625a((bxvk) bwog2);
                    bxvf bxvf = (bxvf) bxvd2;
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    bwog bwog3 = (bwog) bxvf.f164949b;
                    bwof3.getClass();
                    bwog3.f160441c = bwof3;
                    bwog3.f160439a |= 4;
                    bwog bwog4 = (bwog) bxvf.mo74062i();
                    bwny bwny = this.f122650l;
                    bxvd bxvd3 = (bxvd) bwny.mo74142c(5);
                    bxvd3.mo73625a((bxvk) bwny);
                    bxvf bxvf2 = (bxvf) bxvd3;
                    if (bxvf2.f164950c) {
                        bxvf2.mo74035c();
                        bxvf2.f164950c = false;
                    }
                    bwny bwny2 = (bwny) bxvf2.f164949b;
                    bwny bwny3 = bwny.f160414k;
                    bwog4.getClass();
                    bwny2.f160417b = bwog4;
                    bwny2.f160416a |= 1;
                    mo65098a((bwny) bxvf2.mo74062i());
                    return;
                }
                throw null;
            } else {
                mo65114b("ResultingAction with type ENABLEMENT_STATE_CHANGE does not contain new enablement");
            }
        }
    }

    /* renamed from: a */
    public final void mo65104a(bwpd bwpd) {
        ArrayList arrayList = ((bwpd.f160523a & 1) != 0 ? this.f122639a.f122693b.mo65130a(bwpd.f160524b) : this).f122640b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (!((bjgf) arrayList.get(i)).mo65135a(bwpd)) {
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo65105a(bxuq bxuq, int i) {
        bjhg bjhg = (bjhg) this.f122644f.mo15646f(bxuq.mo73900a());
        if (bjhg != null) {
            bjhg.mo65224b(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65106a(String str) {
        m103342a(TextUtils.isEmpty(str), str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65107a(List list) {
        if (this.f122646h == null) {
            this.f122646h = bnmt.m109808c(list.size());
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bjgb bjgb = (bjgb) it.next();
            this.f122646h.put(Integer.valueOf(bjgb.mo65093d()), bjgb);
        }
    }

    /* renamed from: a */
    public final void mo65108a(C1230nw nwVar) {
        if (!nwVar.mo15544d(mo65120e())) {
            nwVar.mo15540b(mo65120e(), (bwog) mo65111b(true).mo74062i());
            for (Long l : mo65118cF()) {
                this.f122639a.f122693b.mo65130a(l.longValue()).mo65108a(nwVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65109a(bpsg bpsg) {
        return this.f122637Dy.contains(bpsg);
    }
}
