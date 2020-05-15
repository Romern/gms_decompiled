package p000;

import android.os.Handler;

/* renamed from: arnj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arnj extends ahin {

    /* renamed from: a */
    public final ahin f87965a;

    /* renamed from: b */
    private final Handler f87966b;

    public arnj(Handler handler, ahin ahin) {
        this.f87966b = handler;
        this.f87965a = ahin;
    }

    /* renamed from: a */
    public final void mo20146a(String str) {
        this.f87966b.post(new arni(this, str));
    }

    /* renamed from: a */
    public final void mo20147a(String str, ahij ahij) {
        this.f87966b.post(new arnh(this, str, ahij));
    }
}
