package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: csu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum csu implements csz {
    FCI_TEMPLATE("6f"),
    FCI_PROPRIETARY_TEMPLATE("a5"),
    APPLICATION_TEMPLATE("61"),
    FCI_ISSUER_DISCRETIONARY_DATA("bf0c"),
    RECORD_TEMPLATE("70"),
    RESPONSE_MESSAGE_TEMPLATE_2("77");
    

    /* renamed from: g */
    private final byte[] f11950g;

    private csu(String str) {
        this.f11950g = czm.m8012a(str);
    }

    /* renamed from: a */
    public final csv mo8231a(cta... ctaArr) {
        List asList = Arrays.asList(ctaArr);
        if (asList.contains(null)) {
            ArrayList arrayList = new ArrayList(asList);
            arrayList.removeAll(Collections.singleton(null));
            ctaArr = (cta[]) arrayList.toArray(new cta[arrayList.size()]);
        }
        return new csv(this, ctaArr);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cta mo8232a(byte[] bArr) {
        try {
            return new csv(this, ctc.m7527a(bArr));
        } catch (IOException e) {
            throw new ctu(e, css.UNKNOWN_ERROR_RESPONSE);
        }
    }

    /* renamed from: a */
    public final ctf mo8233a(int i) {
        return new ctf(this, i);
    }

    /* renamed from: a */
    public final byte[] mo8234a() {
        return czm.m8028e(this.f11950g);
    }
}
