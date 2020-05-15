package p000;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: aopb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aopb {

    /* renamed from: a */
    private static WeakReference f78631a = new WeakReference(null);

    /* renamed from: b */
    private final qws f78632b;

    private aopb(Context context) {
        this.f78632b = new qws(context.getApplicationContext(), "CARRIER_SERVICES", null);
    }

    /* renamed from: a */
    public static synchronized aopb m66261a(Context context) {
        aopb aopb;
        synchronized (aopb.class) {
            aopb = (aopb) f78631a.get();
            if (aopb == null) {
                aopb = new aopb(context);
                f78631a = new WeakReference(aopb);
            }
        }
        return aopb;
    }

    /* renamed from: a */
    public final void mo43143a(byby byby) {
        this.f78632b.mo24333a(byby).mo24327b();
    }

    /* renamed from: a */
    public final void mo43144a(String str, int i, String str2) {
        bxvd da = byby.f165608c.mo74144da();
        bxvd da2 = bycb.f165622e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bycb bycb = (bycb) da2.f164949b;
        bycb.f165625b = i - 1;
        bycb.f165624a |= 1;
        String a = stm.m36299a(str);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bycb bycb2 = (bycb) da2.f164949b;
        a.getClass();
        int i2 = bycb2.f165624a | 2;
        bycb2.f165624a = i2;
        bycb2.f165626c = a;
        str2.getClass();
        bycb2.f165624a = i2 | 4;
        bycb2.f165627d = str2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byby byby = (byby) da.f164949b;
        bycb bycb3 = (bycb) da2.mo74062i();
        bycb3.getClass();
        byby.f165611b = bycb3;
        byby.f165610a = 3;
        mo43143a((byby) da.mo74062i());
    }
}
