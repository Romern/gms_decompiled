package p000;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.WireMessageParams;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jmx extends rjx {

    /* renamed from: c */
    public static final /* synthetic */ int f22842c = 0;

    /* renamed from: d */
    private static final rjo f22843d = new rjo("ProximityAuth.LegacyProximityAuthApi", f22845f, f22844e);

    /* renamed from: e */
    private static final rje f22844e = new rje();

    /* renamed from: f */
    private static final rjl f22845f = new jmt();

    /* renamed from: a */
    public final jmw f22846a = new jmw(this);

    /* renamed from: b */
    public final List f22847b = new ArrayList();

    public jmx(Context context) {
        super(context, f22843d, (rjk) null, rjw.f43159a);
    }

    /* renamed from: a */
    public final aucb mo13886a(RemoteDevice remoteDevice, Role role) {
        roz b = rpa.m34196b();
        b.f43472a = new jmp(remoteDevice, role);
        return mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo13887a(Role role) {
        roz b = rpa.m34196b();
        b.f43472a = new jmr(role);
        return mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo13888a(String str, Role role) {
        roz b = rpa.m34196b();
        b.f43472a = new jmq(str, role);
        return mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final void mo13889a(WireMessageParams wireMessageParams) {
        roz b = rpa.m34196b();
        b.f43472a = new jms(wireMessageParams);
        mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final void mo13890a(jmk jmk) {
        rod a = roe.m34172a(jmk, Looper.getMainLooper(), jmx.class.getSimpleName());
        jmn jmn = new jmn(this, a);
        jmo jmo = new jmo(this, a);
        rom a2 = ron.m34179a();
        a2.f43445c = a;
        a2.f43443a = jmn;
        a2.f43444b = jmo;
        mo24700a(a2.mo24973a());
    }
}
