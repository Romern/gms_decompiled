package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cxh implements cvn {
    ZIP("ZIP", new cxr(), cvf.PDOL.mo8333a(cuz.TERMINAL_TRANSACTION_QUALIFIERS.mo8319a(4), cuz.AMOUNT_AUTHORISED_NUMERIC.mo8319a(6), cuz.AMOUNT_OTHER_NUMERIC.mo8319a(6), cuz.TERMINAL_COUNTRY_CODE.mo8319a(2), cuz.TRANSACTION_CURRENCY_CODE.mo8319a(2), cuz.TRANSACTION_DATE.mo8319a(3), cuz.TRANSACTION_TYPE.mo8319a(1), cuz.UNPREDICTABLE_NUMBER.mo8319a(4), cuz.TERMINAL_TYPE.mo8319a(1), cuz.CARD_NAME.mo8319a(1), cuz.CARD_PRODUCT_FUNCTIONS.mo8319a(2), cuz.ASI.mo8319a(2), cuz.CARD_PRODUCT_TYPE.mo8319a(2))),
    DPAS("Dpass", new cxm(), cvf.PDOL.mo8333a(cuz.UNPREDICTABLE_NUMBER.mo8319a(1)));
    

    /* renamed from: c */
    public static final Map f12370c;

    /* renamed from: d */
    public final cvo f12372d;

    /* renamed from: e */
    private final String f12373e;

    /* renamed from: f */
    private final cvg f12374f;

    static {
        HashMap hashMap = new HashMap();
        cxh[] values = values();
        for (cxh cxh : values) {
            hashMap.put(cxh.f12373e, cxh);
        }
        f12370c = Collections.unmodifiableMap(hashMap);
    }

    private cxh(String str, cvo cvo, cvg cvg) {
        this.f12373e = str;
        this.f12372d = cvo;
        this.f12374f = cvg;
    }

    /* renamed from: a */
    public final cvg mo8336a(cux cux) {
        return (cvg) cvz.m7703a(cve.m7665a((cvc[]) cux.f12181b, cvf.PDOL), this.f12374f);
    }
}
