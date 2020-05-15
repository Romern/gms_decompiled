package p000;

import android.content.Context;
import android.os.Looper;

/* renamed from: abwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class abwj extends aeah {

    /* renamed from: a */
    private acri f58630a;

    /* renamed from: b */
    private abrv f58631b;

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        abrv abrv = this.f58631b;
        boolean z = false;
        if (abrv == null) {
            absg.m48184a("RebuildIndexService is unavailable on this device");
            return 0;
        } else if (!((Boolean) abzt.f58900ao.mo58455c()).booleanValue()) {
            absg.m48184a("Bail out as 3P appindexing is disabled.");
            return 0;
        } else {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                z = true;
            }
            sdo.m34970a(z);
            if (!abrv.mo32320d()) {
                absg.m48184a("IndexManager initialization failed. Rescheduling!");
                return 1;
            }
            Context applicationContext = getApplicationContext();
            return mo32383a(aecc, new abvs(applicationContext, abrv.f58071g, abrv.f58083s, new abyp(applicationContext)));
        }
    }

    /* renamed from: a */
    public abstract int mo32383a(aecc aecc, abvs abvs);

    public final void onCreate() {
        super.onCreate();
        if (cemq.m137369f()) {
            acri a = acri.m49734a("main", getApplicationContext());
            this.f58630a = a;
            if (a != null) {
                this.f58631b = a.mo33016b();
            }
        }
    }

    public final void onDestroy() {
        acri acri = this.f58630a;
        if (acri != null) {
            acri.mo33015a();
        }
        super.onDestroy();
    }
}
