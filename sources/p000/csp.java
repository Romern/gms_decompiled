package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: csp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class csp extends csn {

    /* renamed from: d */
    public static final Map f11921d;

    /* renamed from: e */
    public final csb f11922e;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("C8", "LCOA");
        hashMap.put("C9", "UCOA");
        hashMap.put("CA", "STA");
        hashMap.put("CB", "LCOL");
        hashMap.put("CC", "UCOL");
        hashMap.put("CD", "NCOT");
        hashMap.put("CE", "COA");
        hashMap.put("D4", "CVM-Accumulator");
        hashMap.put("D9", "CVM-Counter");
        hashMap.put("DF40", "CL-Accumulator");
        hashMap.put("DF43", "CL-Counter");
        f11921d = Collections.unmodifiableMap(hashMap);
    }

    public csp(cty cty, csb csb, ctn ctn, Map map) {
        super(ctn, cty, map);
        css.CONDITIONS_OF_USE_NOT_SATISFIED.mo8229a(csb == null);
        this.f11922e = csb;
    }

    /* renamed from: a */
    public static csp m7470a(csn csn) {
        css.CONDITIONS_OF_USE_NOT_SATISFIED.mo8229a(!(csn instanceof csp));
        return (csp) csn;
    }

    /* renamed from: b */
    public final String mo8226b(csx csx) {
        return czm.m8019b(this.f11922e.mo8203a(csx));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ csn mo8210a(cty cty) {
        return new csp(cty, this.f11922e, this.f11918b, mo8219d());
    }

    /* renamed from: a */
    public final byte[] mo8225a(csx csx) {
        return this.f11922e.mo8203a(csx);
    }
}
