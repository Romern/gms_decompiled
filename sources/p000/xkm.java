package p000;

import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import java.util.List;

/* renamed from: xkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xkm {

    /* renamed from: a */
    public List f52554a;

    /* renamed from: b */
    public AuthenticationExtensions f52555b;

    /* renamed from: c */
    public boolean f52556c = true;

    /* renamed from: d */
    public boolean f52557d = false;

    /* renamed from: e */
    private String f52558e;

    /* renamed from: f */
    private byte[] f52559f;

    /* renamed from: a */
    public final xkn mo29866a() {
        boolean z;
        boolean z2 = true;
        if (this.f52558e != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        if (this.f52559f == null) {
            z2 = false;
        }
        sdo.m34970a(z2);
        return new xkn(this.f52558e, this.f52559f, this.f52554a, this.f52555b, this.f52556c, this.f52557d);
    }

    /* renamed from: a */
    public final void mo29867a(String str) {
        sdo.m34974b(str != null);
        this.f52558e = str;
    }

    /* renamed from: a */
    public final void mo29868a(byte[] bArr) {
        sdo.m34974b(bArr != null);
        this.f52559f = bArr;
    }
}
