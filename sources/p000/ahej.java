package p000;

import android.content.Context;
import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: ahej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahej extends rjx implements ahco {

    /* renamed from: b */
    private static final rjo f67075b = new rjo("Nearby.BOOTSTRAP_API", new ahed(), new rje());

    /* renamed from: a */
    public final aidf f67076a = aidf.m57029a(this);

    public ahej(Context context) {
        super(context, f67075b, (rjk) null, rjw.f43159a);
    }

    /* renamed from: a */
    public static rlf m55617a(aucf aucf) {
        return new aheb(aucf);
    }

    /* renamed from: b */
    public final void mo36365b(Device device) {
        aidf aidf = this.f67076a;
        aidf.mo37436a(this, aidf.mo37438a(device, "connection"));
    }

    /* renamed from: a */
    public final aucb mo36302a(Device device) {
        mo36365b(device);
        roz b = rpa.m34196b();
        b.f43472a = new ahea(device);
        return mo24732b(b.mo24977a());
    }
}
