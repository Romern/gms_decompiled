package p000;

import android.os.Bundle;
import java.util.Map;

/* renamed from: agcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agcs extends agct {

    /* renamed from: a */
    public final Map f65230a = new C1223np();

    /* renamed from: b */
    public final Map f65231b = new C1223np();

    /* renamed from: c */
    public long f65232c;

    public agcs(agje agje) {
        super(agje);
    }

    /* renamed from: a */
    public final void mo35230a(long j) {
        agkt o = mo35236c().mo35597o();
        for (String str : this.f65230a.keySet()) {
            mo35232a(str, j - ((Long) this.f65230a.get(str)).longValue(), o);
        }
        if (!this.f65230a.isEmpty()) {
            mo35231a(j - this.f65232c, o);
        }
        mo35233b(j);
    }

    /* renamed from: b */
    public final void mo35233b(long j) {
        for (String str : this.f65230a.keySet()) {
            this.f65230a.put(str, Long.valueOf(j));
        }
        if (!this.f65230a.isEmpty()) {
            this.f65232c = j;
        }
    }

    /* renamed from: a */
    public final void mo35231a(long j, agkt agkt) {
        if (agkt == null) {
            mo35497E().f65572k.mo35435a("Not logging ad exposure. No active activity");
        } else if (j >= 1000) {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            agkw.m54438a(agkt, bundle, true);
            mo35239f().mo35570a("am", "_xa", bundle);
        } else {
            mo35497E().f65572k.mo35436a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        }
    }

    /* renamed from: a */
    public final void mo35232a(String str, long j, agkt agkt) {
        if (agkt == null) {
            mo35497E().f65572k.mo35435a("Not logging ad unit exposure. No active activity");
        } else if (j >= 1000) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            agkw.m54438a(agkt, bundle, true);
            mo35239f().mo35570a("am", "_xu", bundle);
        } else {
            mo35497E().f65572k.mo35436a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        }
    }
}
