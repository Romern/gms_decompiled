package p000;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: csn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class csn {

    /* renamed from: a */
    public final cty f11917a;

    /* renamed from: b */
    public final ctn f11918b;

    /* renamed from: c */
    public Map f11919c;

    /* renamed from: d */
    private final Map f11920d;

    public csn(ctn ctn) {
        this.f11918b = ctn;
        this.f11917a = null;
        this.f11920d = new HashMap();
    }

    /* renamed from: a */
    public csn mo8210a(cty cty) {
        return new csn(this.f11918b, cty, this.f11920d);
    }

    /* renamed from: b */
    public final ctp mo8216b() {
        return this.f11918b.f12029b;
    }

    /* renamed from: c */
    public final String mo8218c() {
        return mo8213a(16, 13, this.f11918b.f12028a.mo8267a("Service_Code"));
    }

    /* renamed from: d */
    public final Map mo8219d() {
        return Collections.unmodifiableMap(this.f11920d);
    }

    /* renamed from: e */
    public final String mo8220e() {
        return this.f11918b.mo8283d();
    }

    /* renamed from: f */
    public final czs mo8221f() {
        return new czs(czm.m8012a(this.f11918b.f12028a.mo8267a("AFL")));
    }

    /* renamed from: g */
    public final String mo8222g() {
        return czq.m8044c(this.f11918b.mo8284e(), 4);
    }

    /* renamed from: h */
    public final byte mo8223h() {
        return this.f11918b.f12028a.mo8271c()[0];
    }

    /* renamed from: i */
    public final csv mo8224i() {
        return this.f11918b.mo8276a();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final csp mo8211a(crw crw, csv csv) {
        boolean z;
        boolean z2;
        cte a = this.f11917a.f12049c.mo8294a(csv);
        byte[] e = crw.mo8195e();
        css css = css.WRONG_LENGTH;
        int length = e.length;
        int i = 2;
        for (ctf ctf : (ctf[]) a.f12004b) {
            i += ctf.f12011d;
        }
        if (length != i) {
            z = true;
        } else {
            z = false;
        }
        css.mo8229a(z);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
        try {
            css css2 = css.WRONG_MISSING_OR_INVALID_DATA_80;
            if (csx.COMMAND_TEMPLATE.mo8234a()[0] != ((byte) byteArrayInputStream.read())) {
                z2 = true;
            } else {
                z2 = false;
            }
            css2.mo8229a(z2);
            byteArrayInputStream.read();
            HashMap hashMap = new HashMap(((ctf[]) a.f12004b).length);
            ctf[] ctfArr = (ctf[]) a.f12004b;
            for (ctf ctf2 : ctfArr) {
                byte[] f = ctf2.mo8256f();
                byteArrayInputStream.read(f);
                csz csz = ctf2.f12010c;
                hashMap.put(csz, csz.mo8232a(f));
            }
            if (byteArrayInputStream.read() == -1) {
                csb csb = new csb(hashMap, a);
                byteArrayInputStream.close();
                ctf[] ctfArr2 = (ctf[]) csb.f11909a.f12004b;
                for (ctf ctf3 : ctfArr2) {
                    cta cta = (cta) csb.f11910b.get(ctf3.f12010c);
                    css.WRONG_MISSING_OR_INVALID_DATA_80.mo8229a(cta == null || cta.mo8251b() != ctf3.f12011d);
                }
                return new csp(this.f11917a, csb, this.f11918b, this.f11920d);
            }
            throw new ctu(css.UNKNOWN_ERROR_RESPONSE);
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    /* renamed from: b */
    public final byte[] mo8217b(String str) {
        return this.f11918b.f12028a.mo8272c(str);
    }

    public csn(ctn ctn, cty cty, Map map) {
        boolean z;
        if (map == null) {
            z = true;
        } else {
            z = false;
        }
        czl.m8004b(z, "apdu context cannot be built with this constructor with numm card profile properties");
        this.f11918b = ctn;
        this.f11917a = cty;
        this.f11920d = new HashMap(map);
    }

    /* renamed from: a */
    public final czw mo8212a() {
        return czt.m8047a(czm.m8012a(this.f11918b.f12028a.mo8267a("CL_ACO")));
    }

    /* renamed from: a */
    public final String mo8213a(int i, int i2, String str) {
        String f = this.f11918b.mo8285f();
        if (czq.m8041a((CharSequence) f)) {
            return str;
        }
        int lastIndexOf = f.lastIndexOf(70);
        if (lastIndexOf < 0) {
            lastIndexOf = f.length();
        }
        return f.substring(lastIndexOf - i, lastIndexOf - i2);
    }

    /* renamed from: a */
    public final void mo8214a(String str, byte[] bArr) {
        this.f11920d.put(str, bArr);
    }

    /* renamed from: a */
    public final byte[] mo8215a(String str) {
        byte[] bArr = (byte[]) this.f11920d.get(str);
        return bArr == null ? mo8217b(str) : bArr;
    }
}
