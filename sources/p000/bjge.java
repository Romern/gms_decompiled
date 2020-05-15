package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: bjge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjge extends bjil {

    /* renamed from: a */
    public final C1230nw f122651a = new C1230nw();

    /* renamed from: b */
    private final bjgv f122652b;

    /* renamed from: c */
    private boolean f122653c;

    public bjge(bjgv bjgv) {
        this.f122652b = bjgv;
    }

    /* renamed from: a */
    private final bjgd m103383a(bwny bwny, Bundle bundle, Class cls) {
        Object obj;
        bmxy.m108601b(!this.f122653c, "Can not construct a new data component before adding the current one being constructed.");
        this.f122653c = true;
        bjgv bjgv = this.f122652b;
        bjle bjle = bjgv.f122692a.f122734k;
        switch (bwny.f160423h) {
            case 67853280:
                obj = new bjpn(bjgv, bwny, bundle);
                break;
            case 217437962:
                obj = new bjqc(bjgv, bwny, bundle);
                break;
            case 217440216:
                obj = new bjoe(bjgv, bwny, bundle);
                break;
            case 220794717:
                obj = new bjpe(bjgv, bwny, bundle);
                break;
            case 220794719:
                obj = new bjrl(bjgv, bwny, bundle);
                break;
            case 223344550:
                obj = new bjqr(bjgv, bwny, bundle);
                break;
            case 223344551:
                obj = new bjqu(bjgv, bwny, bundle);
                break;
            case 223344552:
                obj = new bjrq(bjgv, bwny, bundle);
                break;
            case 223344553:
                obj = new bjqj(bjgv, bwny, bundle);
                break;
            case 223344555:
                obj = new bjnz(bjgv, bwny, bundle);
                break;
            case 228971049:
                obj = new bjrn(bjgv, bwny, bundle);
                break;
            case 228971052:
                obj = new bjlp(bjgv, bwny, bundle);
                break;
            case 229613733:
                obj = new bjqn(bjgv, bwny, bundle);
                break;
            case 232057536:
                obj = new bjlm(bjgv, bwny, bundle);
                break;
            case 232057537:
                obj = new bjmh(bjgv, bwny, bundle);
                break;
            case 232060280:
                obj = new bjpx(bjgv, bwny, bundle);
                break;
            case 232348703:
                obj = new bjmk(bjgv, bwny, bundle);
                break;
            case 232946268:
                obj = new bjnr(bjgv, bwny, bundle);
                break;
            case 233780159:
                obj = new bjmy(bjgv, bwny, bundle);
                break;
            case 243313294:
                obj = new bjpl(bjgv, bwny, bundle);
                break;
            case 247679520:
                obj = new bjnm(bjgv, bwny, bundle);
                break;
            case 248595894:
                obj = new bjlr(bjgv, bwny, bundle);
                break;
            case 254667699:
                obj = new bjnn(bjgv, bwny, bundle);
                break;
            case 255478363:
                obj = new bjrd(bjgv, bwny, bundle);
                break;
            case 260216776:
                obj = new bjlg(bjgv, bwny, bundle);
                break;
            case 262235235:
                obj = new bjnb(bjgv, bwny, bundle);
                break;
            case 264984587:
                obj = new bjne(bjgv, bwny, bundle);
                break;
            case 265527174:
                obj = new bjog(bjgv, bwny, bundle);
                break;
            case 268123868:
                obj = new bjnc(bjgv, bwny, bundle);
                break;
            case 268341327:
                obj = new bjmo(bjgv, bwny, bundle);
                break;
            case 275110909:
                obj = new bjmm(bjgv, bwny, bundle);
                break;
            case 277984631:
                obj = new bjme(bjgv, bwny, bundle);
                break;
            case 277998451:
                obj = new bjmc(bjgv, bwny, bundle);
                break;
            case 279018859:
                obj = new bjma(bjgv, bwny, bundle);
                break;
            case 280016706:
                obj = new bjmw(bjgv, bwny, bundle);
                break;
            case 284093889:
                obj = new bjnv(bjgv, bwny, bundle);
                break;
            case 286058389:
                obj = new bjnu(bjgv, bwny, bundle);
                break;
            case 287212047:
                obj = new bjmd(bjgv, bwny, bundle);
                break;
            case 290848973:
                obj = new bjmu(bjgv, bwny, bundle);
                break;
            case 290848974:
                obj = new bjmq(bjgv, bwny, bundle);
                break;
            case 290848975:
                obj = new bjms(bjgv, bwny, bundle);
                break;
            case 294483524:
                obj = new bjng(bjgv, bwny, bundle);
                break;
            case 297159458:
                obj = new bjnx(bjgv, bwny, bundle);
                break;
            case 301214406:
                obj = new bjob(bjgv, bwny, bundle);
                break;
            default:
                obj = null;
                break;
        }
        bjgd bjgd = (bjgd) cls.cast(obj);
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        bwog bwog = bwny.f160417b;
        if (bwog == null) {
            bwog = bwog.f160437f;
        }
        objArr[0] = Long.valueOf(bwog.f160440b);
        objArr[1] = Integer.valueOf(bwny.f160423h);
        bmxy.m108582a(bjgd, String.format(locale, "Unable to create data %d of extension number %d", objArr));
        this.f122653c = false;
        mo65286a(bjgd.mo65120e(), bjgd);
        return bjgd;
    }

    /* renamed from: b */
    public final boolean mo65133b(long j) {
        return this.f122651a.mo15544d(j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataManager: [");
        int F = mo65285F();
        for (int i = 0; i < F; i++) {
            sb.append(mo65289c(i));
            sb.append(",");
        }
        sb.append(" ] ");
        return sb.toString();
    }

    /* renamed from: a */
    public final bjgd mo65130a(long j) {
        return mo65131a(j, bjgd.class);
    }

    /* renamed from: a */
    public final bjgd mo65131a(long j, Class cls) {
        boolean z = true;
        if (this.f122653c && bjhz.m103567a().mo65270f()) {
            z = false;
        }
        bmxy.m108601b(z, "Can not retrieve data components while constructing new ones if lazy data creation is enabled.");
        bjgd bjgd = (bjgd) mo65287b(j, cls);
        if (bjgd != null || !mo65133b(j)) {
            return bjgd;
        }
        bjgd a = m103383a((bwny) this.f122651a.mo15534a(j), null, cls);
        a.mo65115c();
        return a;
    }

    /* renamed from: a */
    public final void mo65132a(List list, List list2, List list3, Bundle bundle) {
        int i;
        bmxy.m108601b(this.f122792n != 3, "Can not update data while in the resumed state.");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            this.f122651a.mo15539b(longValue);
            mo65290c(longValue);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            bwny bwny = (bwny) list2.get(i2);
            C1230nw nwVar = this.f122651a;
            bwog bwog = bwny.f160417b;
            if (bwog == null) {
                bwog = bwog.f160437f;
            }
            nwVar.mo15540b(bwog.f160440b, bwny);
            bwog bwog2 = bwny.f160417b;
            if (bwog2 == null) {
                bwog2 = bwog.f160437f;
            }
            if (mo65291d(bwog2.f160440b) == null) {
                arrayList2.add(bwny);
            } else {
                arrayList.add(bwny);
            }
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            bwog bwog3 = (bwog) it2.next();
            long j = bwog3.f160440b;
            bmxy.m108601b(this.f122651a.mo15544d(j), "Can not replace unknown data.");
            bwny bwny2 = (bwny) this.f122651a.mo15534a(j);
            bxvd bxvd = (bxvd) bwny2.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bwny2);
            bxvf bxvf = (bxvf) bxvd;
            if (bxvf.f164950c) {
                bxvf.mo74035c();
                bxvf.f164950c = false;
            }
            bwny bwny3 = (bwny) bxvf.f164949b;
            bwny bwny4 = bwny.f160414k;
            bwog3.getClass();
            bwny3.f160417b = bwog3;
            bwny3.f160416a |= 1;
            bwny bwny5 = (bwny) bxvf.mo74062i();
            this.f122651a.mo15540b(j, bwny5);
            arrayList.add(bwny5);
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            bwny bwny6 = (bwny) arrayList.get(i3);
            bwog bwog4 = bwny6.f160417b;
            if (bwog4 == null) {
                bwog4 = bwog.f160437f;
            }
            mo65130a(bwog4.f160440b).mo65098a(bwny6);
        }
        int size3 = arrayList2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            bwny bwny7 = (bwny) arrayList2.get(i4);
            bwog bwog5 = bwny7.f160417b;
            if (bwog5 == null) {
                bwog5 = bwog.f160437f;
            }
            long j2 = bwog5.f160440b;
            if (mo65291d(j2) == null) {
                Bundle a = bjil.m103603a(j2, bundle);
                if (a == null) {
                    bjle bjle = this.f122652b.f122692a.f122734k;
                    if (bjhz.m103567a().mo65270f()) {
                        bwog bwog6 = bwny7.f160417b;
                        if (bwog6 == null) {
                            bwog6 = bwog.f160437f;
                        }
                        bwof bwof = bwog6.f160441c;
                        if (bwof == null) {
                            bwof = bwof.f160430f;
                        }
                        int a2 = bwoc.m122151a(bwof.f160434c);
                        if (!((a2 != 0 && a2 == 3) || (i = bwny7.f160423h) == 233780159 || i == 228971052 || i == 264984587)) {
                        }
                    }
                }
                m103383a(bwny7, a, bjgd.class);
            }
        }
        int size4 = list2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            bwog bwog7 = ((bwny) list2.get(i5)).f160417b;
            if (bwog7 == null) {
                bwog7 = bwog.f160437f;
            }
            bjgd bjgd = (bjgd) mo65287b(bwog7.f160440b, bjgd.class);
            if (bjgd != null) {
                bjgd.mo65115c();
            }
        }
    }
}
