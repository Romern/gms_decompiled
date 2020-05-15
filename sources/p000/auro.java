package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: auro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auro {

    /* renamed from: a */
    public static final bngx f92369a = bngx.m109362a(new aurn("com.google.android.gms.trustlet.bluetooth.service.BIND"), new aurn("com.google.android.gms.trustlet.connectionlessble.service.BIND"), new aurn("com.google.android.gms.trustlet.onbody.service.BIND"), new aurn("com.google.android.gms.trustlet.place.service.BIND"), new aurn("com.google.android.gms.trustlet.voiceunlock.service.BIND"), new aurn("com.google.android.gms.trustlet.face.service.BIND"), new aurn("com.google.android.gms.sesame.service.BIND", true, cgzt.f188132a.mo6606a().mo84837v()));

    /* renamed from: b */
    public final Object f92370b = new Object();

    /* renamed from: c */
    public final Context f92371c;

    /* renamed from: d */
    public final List f92372d = new ArrayList();

    public auro(Context context) {
        this.f92371c = context;
    }

    /* renamed from: a */
    public final boolean mo50846a() {
        boolean z;
        synchronized (this.f92370b) {
            z = false;
            for (aurm aurm : this.f92372d) {
                if (!aurm.f92357a && !aurm.mo50844c() && aurm.f92358b && aurm.mo50842a()) {
                    z = true;
                }
            }
        }
        return z;
    }
}
