package p000;

import com.google.android.gms.fido.u2f.api.StateUpdate;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: xhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class xhl {

    /* renamed from: b */
    private static final sek f52299b = new sek(new String[]{"FidoApiImpl"}, (short[]) null);

    /* renamed from: a */
    public xhp f52300a;

    /* renamed from: a */
    public static String m42944a(String str) {
        URI uri = new URI(str);
        if (uri.getScheme() == null || uri.getAuthority() == null) {
            throw new URISyntaxException(str, "URL has invalid scheme or authority");
        }
        String scheme = uri.getScheme();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(scheme).length() + 3 + String.valueOf(authority).length());
        sb.append(scheme);
        sb.append("://");
        sb.append(authority);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo29749a() {
        xhp xhp = this.f52300a;
        if (xhp == null) {
            f52299b.mo25418e("finishSecurityKeyRequestController should not be called when SecurityKeyRequestController is null.", new Object[0]);
            return;
        }
        xhp.mo29762f();
        this.f52300a = null;
    }

    /* renamed from: a */
    public final void mo29750a(StateUpdate stateUpdate) {
        sek sek = f52299b;
        String valueOf = String.valueOf(stateUpdate.f31875e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("updateTransaction is called for ");
        sb.append(valueOf);
        sek.mo25414c(sb.toString(), new Object[0]);
        StateUpdate.Type type = StateUpdate.Type.CANCEL;
        switch (stateUpdate.f31875e.ordinal()) {
            case 0:
                mo29749a();
                return;
            case 1:
                xhp xhp = this.f52300a;
                if (xhp == null) {
                    f52299b.mo25418e("pauseSecurityKeyRequestController should not be called when SecurityKeyRequestController is null.", new Object[0]);
                    return;
                } else {
                    xhp.mo29761e();
                    return;
                }
            case 2:
                xhp xhp2 = this.f52300a;
                if (xhp2 == null) {
                    f52299b.mo25418e("resumeSecurityKeyRequestController should not be called when SecurityKeyRequestController is null.", new Object[0]);
                    return;
                } else {
                    xhp2.mo29757b();
                    return;
                }
            case 3:
                mo29749a();
                return;
            case 4:
            case 5:
            case 6:
            case 7:
                xhp xhp3 = this.f52300a;
                if (xhp3 == null) {
                    f52299b.mo25418e("updateSecurityKeyRequestOnUserAction should not be called when SecurityKeyRequestController is null.", new Object[0]);
                    return;
                } else {
                    xhp3.mo29754a(stateUpdate);
                    return;
                }
            default:
                f52299b.mo25418e("Type %s is not supported.", stateUpdate.f31875e);
                return;
        }
    }
}
