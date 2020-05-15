package p000;

import android.content.Context;
import com.google.android.gms.auth.cryptauth.Payload;
import com.google.android.gms.auth.cryptauth.PlainText;
import com.google.android.gms.common.api.Status;

/* renamed from: iui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iui extends aaab {

    /* renamed from: e */
    private static final sek f21794e = new sek(new String[]{"VerifyDecryptOperation"}, (byte[]) null);

    /* renamed from: a */
    private final isl f21795a;

    /* renamed from: b */
    private final String f21796b;

    /* renamed from: c */
    private final byte[] f21797c;

    /* renamed from: d */
    private final Payload f21798d;

    public iui(isl isl, String str, byte[] bArr, Payload payload) {
        super(129, "VerifyDecryptAuthzenPayloadOperation");
        this.f21795a = isl;
        this.f21796b = str;
        this.f21797c = bArr;
        this.f21798d = payload;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        isn isn = new isn(context);
        isn.f21612a = 4;
        try {
            PlainText a = isw.m16064a(context, isn).mo13323a(this.f21796b, this.f21797c, this.f21798d);
            isn.f21613b = 1;
            isn.mo13317a();
            this.f21795a.mo13314a(a);
        } catch (iqs e) {
            f21794e.mo25417e("Failed to verifyDecrypt payload", e, new Object[0]);
            isn.mo13317a();
            mo6503a(new Status(25507));
        } catch (isu e2) {
            isn.mo13317a();
            mo6503a(new Status(25508));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f21795a.mo13315a(status);
    }
}
