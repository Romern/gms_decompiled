package p000;

import android.content.Context;
import com.google.android.gms.auth.cryptauth.SignedBlob;
import com.google.android.gms.common.api.Status;

/* renamed from: iug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iug extends aaab {

    /* renamed from: e */
    private static final Logger f21784e = new Logger(new String[]{"SignForKeyHandleOperation"}, (byte[]) null);

    /* renamed from: a */
    private final isi f21785a;

    /* renamed from: b */
    private final byte[] f21786b;

    /* renamed from: c */
    private final String f21787c;

    /* renamed from: d */
    private final byte[] f21788d;

    public iug(isi isi, byte[] bArr, String str, byte[] bArr2) {
        super(129, "SignForKeyHandleOperation");
        this.f21785a = isi;
        this.f21786b = bArr;
        this.f21787c = str;
        this.f21788d = bArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        f21784e.mo25412b("SignForKeyHandle operation is called", new Object[0]);
        isn isn = new isn(context);
        isn.f21612a = 8;
        try {
            SignedBlob a = isw.m16064a(context, isn).mo13328a(this.f21786b, this.f21787c, this.f21788d);
            isn.f21613b = 1;
            isn.mo13317a();
            this.f21785a.mo13176a(a);
        } catch (iqs e) {
            f21784e.mo25417e("Failed to sign payload", e, new Object[0]);
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
        this.f21785a.mo13177a(status);
    }
}
