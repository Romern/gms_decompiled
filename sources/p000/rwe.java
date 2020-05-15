package p000;

import android.content.Context;

/* renamed from: rwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rwe implements rwg {

    /* renamed from: a */
    public final Context f43789a;

    /* renamed from: b */
    private aucb f43790b = null;

    public rwe(Context context) {
        this.f43789a = context;
    }

    /* renamed from: b */
    private final synchronized aucb m34550b() {
        if (this.f43790b == null) {
            aucb a = aucu.m76780a(snp.m35704b(10), new rwc(this));
            this.f43790b = a;
            a.mo50379a(bqfb.INSTANCE, rwd.f43788a);
        }
        return this.f43790b;
    }

    /* renamed from: a */
    public final void mo25216a(bput bput) {
        if (!cdkp.f181122a.mo6606a().mo77828o()) {
            return;
        }
        if (cdkp.f181122a.mo6606a().mo77827n() || bput.f139289d.size() != 0) {
            synchronized (this) {
                m34550b().mo50365a(bqfb.INSTANCE, new rwb(bput));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo25217a() {
        return false;
    }
}
