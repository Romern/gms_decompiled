package p000;

import java.io.IOException;

/* renamed from: cuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cuw implements cvb {
    FCI_TEMPLATE("6f"),
    FCI_PROPRIETARY_TEMPLATE("a5"),
    APPLICATION_TEMPLATE("61"),
    FCI_ISSUER_DISCRETIONARY_DATA("bf0c"),
    RECORD_TEMPLATE("70"),
    RESPONSE_MESSAGE_TEMPLATE_2("77");
    

    /* renamed from: g */
    private final byte[] f12103g;

    private cuw(String str) {
        this.f12103g = cvz.m7720b(str);
    }

    /* renamed from: a */
    public final cux mo8317a(cvc... cvcArr) {
        return new cux(this, cve.m7669b(cvcArr));
    }

    /* renamed from: b */
    public final int mo8321b() {
        return cvz.m7731f(this.f12103g);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cvc mo8318a(byte[] bArr) {
        try {
            return new cux(this, cve.m7668a(bArr));
        } catch (IOException e) {
            throw new cvl(e, cuu.UNKNOWN_ERROR_RESPONSE);
        }
    }

    /* renamed from: a */
    public final cvh mo8319a(int i) {
        return new cvh(this, i);
    }

    /* renamed from: a */
    public final byte[] mo8320a() {
        return cvz.m7735j(this.f12103g);
    }
}
