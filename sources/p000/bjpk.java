package p000;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/* renamed from: bjpk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjpk extends bjht {

    /* renamed from: b */
    static final GregorianCalendar f123086b = new GregorianCalendar(1, 1, 1);

    /* renamed from: c */
    static final GregorianCalendar f123087c = new GregorianCalendar(9999, 12, 31);

    /* renamed from: d */
    final Calendar f123088d;

    /* renamed from: e */
    final Calendar f123089e;

    /* renamed from: f */
    final List f123090f;

    /* renamed from: g */
    final bwvc f123091g;

    /* renamed from: h */
    final int f123092h;

    public bjpk(bjpf bjpf, String str, int i, bwvf bwvf, List list) {
        super(bjpf, str, i);
        bwvc bwvc;
        GregorianCalendar gregorianCalendar;
        GregorianCalendar gregorianCalendar2;
        boolean z;
        int i2;
        this.f123090f = list;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                bwvc = null;
                break;
            }
            bwvc = (bwvc) it.next();
            if (bwvc != bwvc.DATE_COMPONENT_YEAR_TWO_DIGITS) {
                if (bwvc == bwvc.DATE_COMPONENT_YEAR_FOUR_DIGITS) {
                    break;
                }
            } else {
                break;
            }
        }
        this.f123091g = bwvc;
        if (bwvc == bwvc.DATE_COMPONENT_YEAR_TWO_DIGITS) {
            int i3 = bwvf.f161115a;
            int i4 = i3 & 1;
            int i5 = i3 & 2;
            if (i4 != 0) {
                z = true;
            } else {
                z = i5 != 0;
            }
            bmxy.m108589a(z, "DateRange should at least has one min date or max date.");
            blxc blxc = bwvf.f161116b;
            int i6 = (blxc == null ? blxc.f128037e : blxc).f128040b;
            blxc blxc2 = bwvf.f161117c;
            int i7 = (blxc2 == null ? blxc.f128037e : blxc2).f128040b;
            if (i4 == 0 || i5 == 0) {
                i2 = i4 == 0 ? i7 / 100 : i6 / 100;
            } else {
                i2 = i6 / 100;
                if (i2 != i7 / 100) {
                    throw new IllegalArgumentException(String.format("If both min year and max year exists. The min Year: %d should has same prefix as max Year: %d", Integer.valueOf(i6), Integer.valueOf(i7)));
                }
            }
            this.f123092h = i2;
        } else {
            this.f123092h = 0;
        }
        if ((bwvf.f161115a & 1) != 0) {
            blxc blxc3 = bwvf.f161116b;
            int i8 = (blxc3 == null ? blxc.f128037e : blxc3).f128040b;
            blxc blxc4 = bwvf.f161116b;
            int i9 = (blxc4 == null ? blxc.f128037e : blxc4).f128041c;
            blxc blxc5 = bwvf.f161116b;
            gregorianCalendar = new GregorianCalendar(i8, i9, (blxc5 == null ? blxc.f128037e : blxc5).f128042d);
        } else {
            gregorianCalendar = f123086b;
        }
        this.f123088d = gregorianCalendar;
        if ((bwvf.f161115a & 2) != 0) {
            blxc blxc6 = bwvf.f161117c;
            int i10 = (blxc6 == null ? blxc.f128037e : blxc6).f128040b;
            blxc blxc7 = bwvf.f161117c;
            int i11 = (blxc7 == null ? blxc.f128037e : blxc7).f128041c;
            blxc blxc8 = bwvf.f161117c;
            gregorianCalendar2 = new GregorianCalendar(i10, i11, (blxc8 == null ? blxc.f128037e : blxc8).f128042d);
        } else {
            gregorianCalendar2 = f123087c;
        }
        this.f123089e = gregorianCalendar2;
    }

    /* renamed from: a */
    public final boolean mo65090a() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar((this.f123092h * 100) + bjpj.m104220a(((bjpf) this.f122747a).f123076d), bjpj.m104220a(((bjpf) this.f122747a).f123077e), bjpj.m104220a(((bjpf) this.f122747a).f123078f));
        return gregorianCalendar.after(this.f123088d) && gregorianCalendar.before(this.f123089e);
    }

    /* renamed from: c */
    public final boolean mo65092c() {
        boolean z;
        boolean z2;
        bjpf bjpf = (bjpf) this.f122747a;
        String str = bjpf.f123076d;
        String str2 = bjpf.f123077e;
        String str3 = bjpf.f123078f;
        int a = (this.f123092h * 100) + bjpj.m104220a(str);
        int a2 = bjpj.m104220a(str2);
        boolean a3 = bjpj.m104223a(this.f123091g, str, str2, str3);
        if (bjpj.m104224a(this.f123090f)) {
            z = bjpj.m104223a(bwvc.DATE_COMPONENT_MONTH, str, str2, str3);
        } else {
            z = true;
        }
        if (bjpj.m104225b(this.f123090f)) {
            z2 = bjpj.m104223a(bwvc.DATE_COMPONENT_DAY, str, str2, str3);
        } else {
            z2 = true;
        }
        if (a3 && z && z2) {
            return true;
        }
        if (a3 && z) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(a, a2, 1);
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
            gregorianCalendar2.set(1, a);
            gregorianCalendar2.set(2, a2);
            gregorianCalendar2.set(5, gregorianCalendar2.getActualMaximum(5));
            if (gregorianCalendar.after(this.f123089e) || gregorianCalendar2.before(this.f123088d)) {
                return true;
            }
            return false;
        } else if (!a3 || (a >= this.f123088d.get(1) && a <= this.f123089e.get(1))) {
            return false;
        } else {
            return true;
        }
    }
}
