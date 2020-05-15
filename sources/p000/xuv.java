package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import java.util.UUID;

/* renamed from: xuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xuv extends aaab {

    /* renamed from: b */
    public static final Logger f53189b = new Logger(new String[]{"RegisterZeroPartyOperation"}, (short[]) null);

    /* renamed from: a */
    public final xok f53190a;

    /* renamed from: c */
    private final UUID f53191c;

    /* renamed from: d */
    private final xwj f53192d;

    /* renamed from: e */
    private final xeq f53193e;

    /* renamed from: f */
    private final rnt f53194f;

    /* renamed from: g */
    private final PublicKeyCredentialCreationOptions f53195g;

    /* renamed from: h */
    private final String f53196h;

    public xuv(xwj xwj, xeq xeq, UUID uuid, rnt rnt, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, xok xok, String str) {
        super(180, "RegisterZeroParty");
        this.f53191c = uuid;
        this.f53192d = xwj;
        this.f53193e = xeq;
        this.f53194f = rnt;
        this.f53195g = publicKeyCredentialCreationOptions;
        this.f53190a = xok;
        this.f53196h = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        xuu xuu = new xuu(this);
        xeh xeh = xut.f53187a;
        xwn a = xwm.m43526a(context);
        if (cdvt.m135136b()) {
            this.f53193e.mo29687a();
        } else {
            xob.m43236b(this.f53191c, context, this.f53192d, this.f53195g, xeh, new xdx(), xuu, a, this.f53196h).mo29964b();
        }
        this.f53194f.mo11797a(Status.f30107a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f53194f.mo11797a(status);
    }
}
