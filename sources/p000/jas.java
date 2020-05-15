package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: jas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jas extends aaab {

    /* renamed from: a */
    private final izz f22032a;

    /* renamed from: b */
    private final String f22033b;

    /* renamed from: c */
    private final String f22034c;

    public jas(izz izz, String str, String str2) {
        super(172, "GetConsent");
        this.f22032a = izz;
        sdo.m34977c(str);
        this.f22033b = str;
        sdo.m34977c(str2);
        this.f22034c = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        try {
            this.f22032a.mo13541a(Status.f30107a, ((jcf) jcf.f22150a.mo13145b()).mo13573a(this.f22034c, this.f22033b));
        } catch (gid | IOException e) {
            this.f22032a.mo13541a(new Status(8), false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f22032a.mo13541a(status, false);
    }
}
