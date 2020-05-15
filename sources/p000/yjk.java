package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: yjk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yjk extends yiy {

    /* renamed from: c */
    public static final yhr f53931c = new yhr();

    /* renamed from: d */
    private final String f53932d;

    /* renamed from: e */
    private final String f53933e;

    /* renamed from: f */
    private final yjx f53934f;

    /* renamed from: g */
    private final yfr f53935g;

    public yjk(yjj yjj) {
        super(yjj);
        String str = yjj.f53926a;
        bmxy.m108581a(str);
        this.f53932d = str;
        String str2 = yjj.f53928c;
        bmxy.m108581a(str2);
        this.f53933e = str2;
        this.f53934f = yjj.f53930e;
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30421b(this.f53933e);
        a.mo30420a(yfl.f53726a);
        String str3 = yjj.f53929d;
        bmxy.m108581a(str3);
        a.mo30419a(str3);
        this.f53935g = a.mo30415a();
    }

    /* renamed from: a */
    public final bngx mo30570a(List list) {
        return bngx.m109356a(this.f53935g);
    }

    /* renamed from: b */
    public final String mo30564b() {
        return this.f53932d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0093, code lost:
        r6 = r11;
     */
    /* renamed from: e */
    public final List mo30571e(List list, yhg yhg, yhy yhy) {
        yhx a = yhy.m44167a(this.f53935g);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        long j = 0;
        while (i < size) {
            ygx ygx = (ygx) list.get(i);
            yjx yjx = this.f53934f;
            if (yjx != null) {
                ygx = yjx.mo30574a(ygx, yfv.m44005a(j, ((yfw) yhg).f53738b), yhy);
            }
            bnre i2 = ygx.mo30473a().listIterator();
            while (true) {
                int i3 = i + 1;
                if (!i2.hasNext()) {
                    break;
                }
                yhu yhu = (yhu) i2.next();
                long b = yhu.mo30387b();
                yfw yfw = (yfw) yhg;
                if (b >= yfw.f53737a) {
                    long a2 = yhu.mo30385a();
                    if ((a2 <= 0 || a2 >= j) && b != j) {
                        if (a2 <= yfw.f53738b) {
                            yht c = a.mo30521c();
                            c.mo30506a(yhu.mo30511d());
                            yfm.m43953a(c, a2, b);
                            yfp.m43963a(c, yhu.mo30516i());
                            j = b;
                        } else {
                            arrayList.add(a.mo30520b());
                            return arrayList;
                        }
                    }
                }
            }
        }
        arrayList.add(a.mo30520b());
        return arrayList;
    }
}
