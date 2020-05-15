package p000;

import java.util.Map;

/* renamed from: acjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class acjd extends aeah {

    /* renamed from: a */
    private final String f59967a;

    /* renamed from: b */
    private final bmzi f59968b;

    /* renamed from: c */
    private final bmzi f59969c;

    /* renamed from: d */
    private final bmzi f59970d;

    /* renamed from: e */
    private final bmzi f59971e;

    /* renamed from: g */
    private final bmzi f59972g;

    public acjd(String str, bmzi bmzi, bmzi bmzi2, bmzi bmzi3, bmzi bmzi4, bmzi bmzi5) {
        bmxy.m108581a(str);
        bmxy.m108581a(bmzi);
        bmxy.m108581a(bmzi2);
        bmxy.m108581a(bmzi3);
        bmxy.m108581a(bmzi4);
        bmxy.m108581a(bmzi5);
        this.f59967a = str;
        this.f59968b = bmzi;
        this.f59969c = bmzi2;
        this.f59970d = bmzi3;
        this.f59971e = bmzi4;
        this.f59972g = bmzi5;
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        boolean z;
        try {
            if (((Boolean) this.f59968b.mo6606a()).booleanValue()) {
                bame bame = (bame) ((Map) this.f59969c.mo6606a()).get(aecc.f63128a);
                if (bame == null) {
                    achs.f59875e.mo25418e("%s started with a missing task for tag %s", this.f59967a, aecc.f63128a);
                    return 2;
                }
                try {
                    achw achw = achs.f59871a;
                    Object[] objArr = new Object[3];
                    objArr[0] = this.f59967a;
                    objArr[1] = aecc.f63128a;
                    if (aecc.f63129b != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objArr[2] = Boolean.valueOf(z);
                    bame.mo55739a(aecc.f63129b).get();
                    return 0;
                } catch (Exception e) {
                    achs.f59875e.mo25418e("%s task %s execution failed.", this.f59967a, aecc.f63128a);
                    if (((Boolean) this.f59972g.mo6606a()).booleanValue() && (e instanceof InterruptedException)) {
                        ((bads) this.f59971e.mo6606a()).mo32743a(10020);
                        return 2;
                    }
                    String str = aecc.f63128a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27);
                    sb.append("MDH task ");
                    sb.append(str);
                    sb.append(" execution failure");
                    ((acdc) this.f59970d.mo6606a()).mo32707a(sb.toString(), e);
                    return 2;
                }
            } else {
                achs.f59875e.mo25409a("soft-disabled by way of flag", new Object[0]);
                return 2;
            }
        } catch (Exception e2) {
            ((acdc) this.f59970d.mo6606a()).mo32707a("MDH task service run task failure", e2);
            return 2;
        }
    }
}
