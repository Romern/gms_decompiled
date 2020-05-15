package p000;

import android.content.Context;
import java.util.UUID;

/* renamed from: nds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nds extends ndr {

    /* renamed from: b */
    public final String f35359b;

    /* renamed from: c */
    public final bxvd f35360c;

    /* renamed from: d */
    private final Context f35361d;

    /* renamed from: e */
    private final long f35362e;

    /* renamed from: a */
    public final void mo20496a() {
        bxvd bxvd = this.f35360c;
        long currentTimeMillis = System.currentTimeMillis() - this.f35362e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mrj mrj = (mrj) bxvd.f164949b;
        mrj mrj2 = mrj.f34426i;
        mrj.f34428a |= 1;
        mrj.f34429b = currentTimeMillis;
        bxvd a = lyu.m24685a();
        String str = this.f35359b;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        mqk mqk = (mqk) a.f164949b;
        mqk mqk2 = mqk.f34276G;
        str.getClass();
        mqk.f34284a |= 1;
        mqk.f34286c = str;
        mrj mrj3 = (mrj) this.f35360c.mo74062i();
        mrj3.getClass();
        mqk.f34290g = mrj3;
        mqk.f34284a |= 16;
        mo20495a(this.f35361d, a, mqj.FULL_DATA_BACKUP);
    }

    public nds(Context context, String str, int i) {
        super(i);
        bxvd da = mrj.f34426i.mo74144da();
        this.f35360c = da;
        this.f35361d = context;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mrj mrj = (mrj) da.f164949b;
        str.getClass();
        mrj.f34428a |= 2;
        mrj.f34430c = str;
        this.f35362e = System.currentTimeMillis();
        this.f35359b = UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public final void mo20497a(int i) {
        bxvd bxvd = this.f35360c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mrj mrj = (mrj) bxvd.f164949b;
        mrj mrj2 = mrj.f34426i;
        mrj.f34433f = i - 1;
        mrj.f34428a |= 16;
        mo20496a();
    }

    /* renamed from: a */
    public final void mo20498a(long j, long j2) {
        bxvd bxvd = this.f35360c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        mrj mrj = (mrj) bxvd.f164949b;
        mrj mrj2 = mrj.f34426i;
        mrj.f34428a |= 4;
        mrj.f34431d = j;
        bxvd bxvd2 = this.f35360c;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        mrj mrj3 = (mrj) bxvd2.f164949b;
        mrj3.f34428a |= 8;
        mrj3.f34432e = j2;
    }
}
