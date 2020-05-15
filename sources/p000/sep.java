package p000;

import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.lso.AuthApps;

/* renamed from: sep */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sep extends shd {

    /* renamed from: a */
    private final shj f44095a;

    public sep(shj shj) {
        this.f44095a = shj;
    }

    /* renamed from: a */
    public final AuthApps mo25430a(ClientContext clientContext, String str, String str2) {
        StringBuilder sb = new StringBuilder("authapps");
        shd.m35269a(sb, "category", shd.m35267a(str));
        if (str2 != null) {
            shd.m35269a(sb, "hl", shd.m35267a(str2));
        }
        return (AuthApps) this.f44095a.mo25536a(clientContext, 0, sb.toString(), (Object) null, AuthApps.class);
    }
}
