package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import java.util.UUID;

/* renamed from: xva */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xva extends aaab {

    /* renamed from: b */
    public static final Logger f53203b = new Logger(new String[]{"SignZeroPartyOperation"}, (short[]) null);

    /* renamed from: a */
    public final xok f53204a;

    /* renamed from: c */
    private final UUID f53205c;

    /* renamed from: d */
    private final xwj f53206d;

    /* renamed from: e */
    private final xeq f53207e;

    /* renamed from: f */
    private final rnt f53208f;

    /* renamed from: g */
    private final PublicKeyCredentialRequestOptions f53209g;

    /* renamed from: h */
    private final String f53210h;

    public xva(xwj xwj, xeq xeq, UUID uuid, rnt rnt, PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, xok xok, String str) {
        super(180, "SignZeroParty");
        this.f53205c = uuid;
        this.f53206d = xwj;
        this.f53207e = xeq;
        this.f53208f = rnt;
        this.f53209g = publicKeyCredentialRequestOptions;
        this.f53204a = xok;
        this.f53210h = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        xuz xuz = new xuz(this);
        xeh xeh = xuy.f53201a;
        xwn a = xwm.m43526a(context);
        if (cdvt.m135136b()) {
            this.f53207e.mo29687a();
        } else {
            xob.m43234a(this.f53205c, context, this.f53206d, this.f53209g, xeh, new xdx(), xuz, a, this.f53210h).mo29964b();
        }
        this.f53208f.mo11797a(Status.f30107a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f53208f.mo11797a(status);
    }
}
