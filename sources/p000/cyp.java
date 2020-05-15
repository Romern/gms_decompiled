package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cyp implements cvs {

    /* renamed from: a */
    public final cvp f12398a;

    /* renamed from: b */
    public final cys f12399b;

    /* renamed from: c */
    public final cwg f12400c;

    /* renamed from: d */
    public Map f12401d;

    /* renamed from: e */
    public final Map f12402e;

    public cyp(cys cys, cwg cwg) {
        this.f12399b = cys;
        this.f12400c = cwg;
        this.f12398a = null;
        this.f12402e = new HashMap();
    }

    /* renamed from: a */
    private final void m7882a(Map map, Map.Entry entry) {
        map.put(Integer.valueOf(Integer.parseInt((String) entry.getKey(), 16)), mo8399a((String) entry.getValue()));
    }

    /* renamed from: c */
    public static cwe m7883c(String str) {
        byte b;
        int intValue = Integer.valueOf(str.substring(4, 8)).intValue();
        byte b2 = cvz.m7720b(str.substring(8))[0];
        byte b3 = b2 & Byte.MAX_VALUE;
        if ((b2 & Byte.MIN_VALUE) == 0) {
            b = 1;
        } else {
            b = -1;
        }
        return new cyo(intValue, b3 * b);
    }

    /* renamed from: b */
    public final cux mo8400b() {
        return this.f12398a.f12201b;
    }

    /* renamed from: d */
    public final cyu mo8403d() {
        return this.f12399b.f12409b;
    }

    /* renamed from: e */
    public final String mo8404e() {
        return mo8396a(16, 13, this.f12399b.f12408a.mo8443c("Service_Code"));
    }

    /* renamed from: f */
    public final Map mo8405f() {
        return Collections.unmodifiableMap(this.f12402e);
    }

    /* renamed from: g */
    public final boolean mo8406g() {
        byte[] l = mo8411l();
        return l != null && (l[0] & 1) == 1;
    }

    /* renamed from: h */
    public final String mo8407h() {
        return this.f12399b.mo8428b();
    }

    /* renamed from: i */
    public final cwi mo8408i() {
        return new cwi(this.f12399b.mo8432e());
    }

    /* renamed from: j */
    public final byte[] mo8409j() {
        return this.f12399b.mo8432e();
    }

    /* renamed from: k */
    public final String mo8410k() {
        return cwd.m7753b(this.f12399b.mo8430c(), 4);
    }

    /* renamed from: l */
    public final byte[] mo8411l() {
        return cvz.m7720b(this.f12399b.f12408a.mo8439a("AIP"));
    }

    /* renamed from: m */
    public final byte[] mo8412m() {
        return cvz.m7710a(this.f12399b.f12408a.mo8439a("CRM_Country_Code"));
    }

    /* renamed from: n */
    public final byte mo8413n() {
        return this.f12399b.f12408a.mo8449f()[0];
    }

    /* renamed from: o */
    public final byte[] mo8414o() {
        return cvz.m7710a(this.f12399b.f12408a.mo8440b());
    }

    /* renamed from: p */
    public final byte[] mo8415p() {
        return this.f12399b.mo8436i();
    }

    /* renamed from: q */
    public final void mo8416q() {
        HashMap hashMap = new HashMap();
        mo8398a(hashMap);
        Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public final cvc mo8393a(cvb cvb) {
        cyx cyx = this.f12399b.f12408a;
        String a = cvz.m7704a(cvb.mo8320a());
        String str = (String) cyv.f12421a.get(a);
        if (str == null) {
            str = (String) cyv.f12422b.get(a);
        }
        return ((cuz) cvb).mo8318a(cyx.mo8445d(str));
    }

    /* renamed from: b */
    public final byte[] mo8401b(String str) {
        return this.f12399b.f12408a.mo8445d(str);
    }

    public cyp(cys cys, cwg cwg, cvp cvp, Map map) {
        boolean z;
        if (map == null) {
            z = true;
        } else {
            z = false;
        }
        cvx.m7698b(z, "apdu context cannot be built with this constructor with null card profile properties");
        this.f12399b = cys;
        this.f12400c = cwg;
        this.f12398a = cvp;
        this.f12402e = new HashMap(map);
    }

    /* renamed from: c */
    public final cwm mo8402c() {
        return cwj.m7764a(cvz.m7720b(this.f12399b.f12408a.mo8439a("CL_ACO")));
    }

    /* renamed from: a */
    public final cwm mo8340a() {
        return cwk.m7767a(cvz.m7720b(this.f12399b.f12408a.mo8439a("CACO")));
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final cyq mo8394a(cup cup, cux cux) {
        boolean z;
        cwf cwf;
        byte[] bArr;
        cvg a = ((cxh) this.f12398a.f12202c).mo8336a(cux);
        byte[] e = cup.mo8302e();
        cuu cuu = cuu.WRONG_LENGTH;
        int length = e.length;
        int i = 0;
        int i2 = 2;
        for (cvh cvh : (cvh[]) a.f12181b) {
            i2 += cvh.f12188d;
        }
        cuu.mo8315a(length != i2);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
        try {
            cuu cuu2 = cuu.WRONG_MISSING_OR_INVALID_DATA_80;
            if (cuz.COMMAND_TEMPLATE.mo8320a()[0] != ((byte) byteArrayInputStream.read())) {
                z = true;
            } else {
                z = false;
            }
            cuu2.mo8315a(z);
            byteArrayInputStream.read();
            HashMap hashMap = new HashMap(((cvh[]) a.f12181b).length);
            cvh[] cvhArr = (cvh[]) a.f12181b;
            for (cvh cvh2 : cvhArr) {
                byte[] f = cvh2.mo8334f();
                byteArrayInputStream.read(f);
                cvb cvb = cvh2.f12187c;
                hashMap.put(cvb, cvb.mo8318a(f));
            }
            if (byteArrayInputStream.read() == -1) {
                cue cue = new cue(hashMap, a, e);
                byteArrayInputStream.close();
                cvh[] cvhArr2 = (cvh[]) cue.f12052a.f12181b;
                for (cvh cvh3 : cvhArr2) {
                    cvc cvc = (cvc) cue.f12053b.get(cvh3.f12187c);
                    cuu.WRONG_MISSING_OR_INVALID_DATA_80.mo8315a(cvc == null || cvc.mo8329b() != cvh3.f12188d);
                }
                cvp cvp = this.f12398a;
                cys cys = this.f12399b;
                cwg cwg = this.f12400c;
                Map map = this.f12402e;
                byte[] bArr2 = cwg.f12234a;
                if (bArr2 == null || bArr2.length == 0) {
                    cwf = cwf.m7756a();
                } else {
                    Map a2 = cwf.m7757a(bArr2);
                    try {
                        cvc[] a3 = cve.m7668a(bArr2);
                        int length2 = a3.length;
                        while (true) {
                            if (i >= length2) {
                                bArr = new byte[2];
                                break;
                            }
                            cvc cvc2 = a3[i];
                            cvb e2 = cvc2.mo8332e();
                            if (e2 != null && cuz.PREVIOUS_TRANSACTION_HISTORY == e2) {
                                bArr = (byte[]) ((cva) cvc2).f12181b;
                                break;
                            }
                            i++;
                        }
                        cwf = new cwf(Collections.unmodifiableMap(new HashMap(a2)), a2, bArr);
                    } catch (IOException e3) {
                        bqye.m113758a(e3);
                        throw new RuntimeException("Wrong PTH format", e3);
                    }
                }
                return new cyq(cvp, cue, cys, cwg, map, cwf);
            }
            throw new cvl(cuu.UNKNOWN_ERROR_RESPONSE);
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    /* renamed from: a */
    public final cyr mo8395a(cxc cxc) {
        return new cyr(cxc, this);
    }

    /* renamed from: a */
    public final String mo8396a(int i, int i2, String str) {
        String d = this.f12399b.mo8431d();
        if (cwd.m7751a((CharSequence) d)) {
            return str;
        }
        int lastIndexOf = d.lastIndexOf(70);
        if (lastIndexOf < 0) {
            lastIndexOf = d.length();
        }
        return d.substring(lastIndexOf - i, lastIndexOf - i2);
    }

    /* renamed from: a */
    public final void mo8397a(String str, byte[] bArr) {
        this.f12402e.put(str, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8398a(Map map) {
        for (Map.Entry entry : cyv.f12421a.entrySet()) {
            m7882a(map, entry);
        }
        for (Map.Entry entry2 : cyv.f12422b.entrySet()) {
            m7882a(map, entry2);
        }
    }

    /* renamed from: a */
    public final byte[] mo8341a(int i) {
        String a = czd.m7983a(i);
        String str = (String) cyv.f12421a.get(a);
        if (str == null) {
            str = (String) cyv.f12422b.get(a);
        }
        return this.f12399b.f12408a.mo8445d(str);
    }

    /* renamed from: a */
    public final byte[] mo8399a(String str) {
        byte[] bArr = (byte[]) this.f12402e.get(str);
        return bArr == null ? mo8401b(str) : bArr;
    }
}
