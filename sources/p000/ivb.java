package p000;

import android.app.KeyguardManager;
import android.os.UserManager;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ivb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ivb implements ivt, ivq {

    /* renamed from: h */
    public static final Logger f21845h = new Logger(new String[]{"StatusUpdateTracker"}, (char[]) null);

    /* renamed from: a */
    public final KeyguardManager f21846a;

    /* renamed from: b */
    public final ivu f21847b;

    /* renamed from: c */
    public final ivr f21848c;

    /* renamed from: d */
    public final ssh f21849d;

    /* renamed from: e */
    public final UserManager f21850e;

    /* renamed from: f */
    public final ivi f21851f;

    /* renamed from: g */
    public final Set f21852g = new HashSet();

    /* renamed from: i */
    private final ivo f21853i;

    public ivb(KeyguardManager keyguardManager, ivo ivo, ivu ivu, ivr ivr, imq imq, ssh ssh, UserManager userManager, ivi ivi) {
        sdo.m34959a(keyguardManager);
        this.f21846a = keyguardManager;
        sdo.m34959a(ivo);
        this.f21853i = ivo;
        sdo.m34959a(ivu);
        this.f21847b = ivu;
        sdo.m34959a(ivr);
        this.f21848c = ivr;
        sdo.m34959a(imq);
        sdo.m34959a(ssh);
        this.f21849d = ssh;
        sdo.m34959a(userManager);
        this.f21850e = userManager;
        sdo.m34959a(ivi);
        this.f21851f = ivi;
    }

    /* renamed from: a */
    public final boolean mo13355a() {
        return this.f21852g.size() > 0;
    }

    /* renamed from: b */
    public final void mo13356b() {
        mo13358d();
    }

    /* renamed from: c */
    public final void mo13357c() {
        mo13358d();
    }

    /* renamed from: d */
    public final void mo13358d() {
        bqga.m112781a(this.f21853i.mo13374a(), new iuz(this), bqfb.INSTANCE);
    }

    /* renamed from: e */
    public final void mo13359e() {
        mo13358d();
    }
}
