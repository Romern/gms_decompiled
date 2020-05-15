package p000;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: eqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eqs implements eqo {

    /* renamed from: a */
    private final C0953ec f15532a;

    /* renamed from: b */
    private final C0942ds f15533b;

    /* renamed from: c */
    private final C0958eh f15534c;

    public eqs(C0953ec ecVar) {
        this.f15532a = ecVar;
        this.f15533b = new eqp(ecVar);
        new eqq(ecVar);
        this.f15534c = new eqr(ecVar);
    }

    /* renamed from: a */
    public final List mo10417a() {
        Long l;
        C0956ef a = C0956ef.m10280a("SELECT * FROM per_device_dismissed_onboarding_flow", 0);
        this.f15532a.mo9943e();
        Cursor a2 = this.f15532a.mo9937a(a);
        try {
            int a3 = C0962el.m10613a(a2, "dismissalId");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                if (!a2.isNull(a3)) {
                    l = Long.valueOf(a2.getLong(a3));
                } else {
                    l = null;
                }
                arrayList.add(new eqt(l));
            }
            return arrayList;
        } finally {
            a2.close();
            a.mo10064b();
        }
    }

    /* renamed from: b */
    public final void mo10419b() {
        this.f15532a.mo9943e();
        C0939dp b = this.f15534c.mo10124b();
        this.f15532a.mo9944f();
        try {
            b.mo9363b();
            this.f15532a.mo9946h();
        } finally {
            this.f15532a.mo9945g();
            this.f15534c.mo10123a(b);
        }
    }

    /* renamed from: a */
    public final void mo10418a(eqt... eqtArr) {
        this.f15532a.mo9943e();
        this.f15532a.mo9944f();
        try {
            this.f15533b.mo9524a(eqtArr);
            this.f15532a.mo9946h();
        } finally {
            this.f15532a.mo9945g();
        }
    }
}
