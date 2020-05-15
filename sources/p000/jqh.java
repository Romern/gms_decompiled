package p000;

import android.content.Context;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.FirstPartyDeviceRegistrationChimeraService;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.concurrent.ExecutionException;

/* renamed from: jqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jqh extends aaab {

    /* renamed from: a */
    private final rnt f23050a;

    /* renamed from: b */
    private final String f23051b;

    /* renamed from: c */
    private final Role f23052c;

    /* renamed from: d */
    private final byte[] f23053d;

    static {
        jsy.m17256a("SendMessage");
    }

    public jqh(rnt rnt, String str, Role role, byte[] bArr) {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, "SendMessage");
        this.f23050a = rnt;
        this.f23051b = str;
        this.f23052c = role;
        this.f23053d = bArr;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        byte[] bArr;
        String str = this.f23051b;
        if (str == null || str.isEmpty() || (bArr = this.f23053d) == null || bArr.length == 0 || !jqd.m17110a(this.f23052c)) {
            this.f23050a.mo11797a(Status.f30109c);
            return;
        }
        rex rex = new rex();
        jpg a = FirstPartyDeviceRegistrationChimeraService.m6794a(rex, context);
        if (a != null) {
            try {
                String str2 = this.f23051b;
                Role role = this.f23052c;
                byte[] bArr2 = this.f23053d;
                FirstPartyDeviceRegistrationChimeraService firstPartyDeviceRegistrationChimeraService = a.f22969a;
                FirstPartyDeviceRegistrationChimeraService.f11168a.mo25412b("Sending a message to %s for %s", str2, role.f11146b);
                jpo jpo = firstPartyDeviceRegistrationChimeraService.f11169b;
                this.f23050a.mo11797a((Status) jpo.f22995f.mo25819b(new jpk(jpo, str2, role, bArr2)).get());
            } catch (InterruptedException | ExecutionException e) {
                this.f23050a.mo11797a(Status.f30109c);
            }
            skh.m35531a().mo25689a(context, rex);
            return;
        }
        this.f23050a.mo11797a(Status.f30109c);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f23050a.mo11797a(status);
    }
}
