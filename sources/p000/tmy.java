package p000;

import com.google.android.gms.contextmanager.internal.QueryFilterParameters;

/* renamed from: tmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tmy {

    /* renamed from: a */
    public int[] f46275a = null;

    /* renamed from: b */
    private int f46276b = 0;

    /* renamed from: c */
    private int f46277c = -1;

    /* renamed from: a */
    public final QueryFilterParameters mo26664a() {
        return new QueryFilterParameters(this.f46276b, this.f46277c, this.f46275a);
    }

    /* renamed from: b */
    public final void mo26666b() {
        sdo.m34974b(true);
        this.f46276b = 1;
    }

    /* renamed from: a */
    public final void mo26665a(int i) {
        boolean z = true;
        if (i != -1 && i <= 0) {
            z = false;
        }
        sdo.m34974b(z);
        this.f46277c = i;
    }
}
