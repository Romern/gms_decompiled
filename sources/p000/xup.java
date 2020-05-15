package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;

/* renamed from: xup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xup extends aaab {

    /* renamed from: b */
    public static final Logger f53176b = new Logger(new String[]{"IsUserVerifyingPlatformAuthenticatorAvailableForCredentialOperation"}, (short[]) null);

    /* renamed from: a */
    public final xoh f53177a;

    /* renamed from: c */
    private final String f53178c;

    /* renamed from: d */
    private final String f53179d;

    /* renamed from: e */
    private final byte[] f53180e;

    /* renamed from: f */
    private final xce f53181f = ((xce) xce.f51913a.mo33309a());

    public xup(xoh xoh, String str, String str2, byte[] bArr) {
        super(148, "IsUserVerifyingPlatformAuthenticatorAvailableForCredential");
        this.f53177a = xoh;
        this.f53178c = str;
        this.f53179d = str2;
        this.f53180e = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (!"com.google.android.gms".equals(this.f53178c)) {
            this.f53177a.mo29965a(new Status(10));
        } else {
            bqga.m112781a(this.f53181f.mo29629a(this.f53179d, this.f53180e), new xuo(this), bqfb.INSTANCE);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f53177a.mo29965a(status);
    }
}
