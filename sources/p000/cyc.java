package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: cyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cyc extends cvq {

    /* renamed from: a */
    private static final cwe f12384a = new cxu();

    /* renamed from: b */
    protected static final Map f12385b = Collections.unmodifiableMap(cvz.m7706a(cvz.m7719b((Object) 1, (Object) cvz.m7706a(cvz.m7719b((Object) 1, (Object) f12384a), cvz.m7719b((Object) 2, (Object) f12386c))), cvz.m7719b((Object) 2, (Object) cvz.m7706a(cvz.m7719b((Object) 1, (Object) f12387d), cvz.m7719b((Object) 2, (Object) f12388e), cvz.m7719b((Object) 3, (Object) f12389f))), cvz.m7719b((Object) 3, (Object) cvz.m7706a(cvz.m7719b((Object) 1, (Object) f12390g), cvz.m7719b((Object) 2, (Object) f12392i), cvz.m7719b((Object) 3, (Object) f12391h)))));

    /* renamed from: c */
    private static final cwe f12386c = new cxv();

    /* renamed from: d */
    private static final cwe f12387d = new cxw();

    /* renamed from: e */
    private static final cwe f12388e = new cxx();

    /* renamed from: f */
    private static final cwe f12389f = new cxy();

    /* renamed from: g */
    private static final cwe f12390g = new cxz();

    /* renamed from: h */
    private static final cwe f12391h = new cya();

    /* renamed from: i */
    private static final cwe f12392i = new cyb();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cvz.b(java.lang.Object, java.lang.Object):java.util.Map$Entry
     arg types: [int, java.util.Map]
     candidates:
      cvz.b(byte[], int):byte[]
      cvz.b(java.lang.Object, java.lang.Object):java.util.Map$Entry */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cvz.b(java.lang.Object, java.lang.Object):java.util.Map$Entry
     arg types: [int, cwe]
     candidates:
      cvz.b(byte[], int):byte[]
      cvz.b(java.lang.Object, java.lang.Object):java.util.Map$Entry */
    static {
        new cyc();
    }

    protected cyc() {
        super(cuq.class);
    }

    /* renamed from: b */
    protected static final boolean m7861b(cuq cuq, cyq cyq) {
        return cyq.mo8408i().mo8358a(cuq.mo8311g(), cuq.mo8298a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cvv mo8339a(cuf cuf, cvs cvs) {
        boolean z;
        cuq cuq = (cuq) cuf;
        cuu cuu = cuu.WRONG_LENGTH;
        boolean z2 = false;
        if (cuq.mo8301d().byteValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        cuu.mo8315a(z);
        if (cuq.mo8311g() > 0 && cuq.mo8311g() <= 10) {
            return mo8383a(cuq, cyq.m7910a(cvs));
        }
        cyq.m7910a(cvs);
        cuu cuu2 = cuu.FILE_OR_APP_NOT_FOUND;
        if (cuq.mo8298a() == 1) {
            z2 = true;
        }
        cuu2.mo8315a(z2);
        throw new cvl(cuu.RECORD_NOT_FOUND);
    }

    /* renamed from: a */
    public cvv mo8383a(cuq cuq, cyq cyq) {
        boolean z;
        boolean z2 = false;
        if (cuq.mo8311g() == 1 && cuq.mo8298a() == 1) {
            return cvv.m7695a(cyz.m7965a(cyq, cxc.SUCCESS), cut.m7621a(cuw.RECORD_TEMPLATE.mo8317a(cuz.TRACK_1.mo8327a(cyq.f12399b.f12408a.mo8443c("Track_1_Data_for_ZIP/MS_Mode")), cuz.TRACK_2_EQV_DATA.mo8327a(cyq.f12399b.mo8431d()))));
        }
        cuu cuu = cuu.FILE_OR_APP_NOT_FOUND;
        cwi i = cyq.mo8408i();
        byte g = cuq.mo8311g();
        Iterator it = i.f12239a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((cwh) it.next()).f12236a == g) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        cuu.mo8315a(!z);
        Map map = (Map) f12385b.get(Integer.valueOf(cuq.mo8311g()));
        cuu cuu2 = cuu.RECORD_NOT_FOUND;
        if (map == null || map.isEmpty() || map.get(Integer.valueOf(cuq.mo8298a())) == null) {
            z2 = true;
        }
        cuu2.mo8315a(z2);
        cuu.CONDITIONS_OF_USE_NOT_SATISFIED.mo8315a(!m7861b(cuq, cyq));
        throw new cvl(cuu.RECORD_NOT_FOUND);
    }
}
