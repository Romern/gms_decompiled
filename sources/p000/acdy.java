package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: acdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acdy implements acjh {

    /* renamed from: a */
    private final rnt f59615a;

    /* renamed from: b */
    private final baam f59616b;

    public acdy(rnt rnt, baam baam) {
        this.f59615a = rnt;
        this.f59616b = baam;
    }

    /* renamed from: a */
    public final void mo32708a() {
        try {
            this.f59616b.f100379h = null;
            this.f59615a.mo11797a(Status.f30107a);
        } catch (Exception e) {
            this.f59615a.mo11797a(ackq.m49337a("resetTesting", 8, "Failed to reset"));
        }
    }

    /* renamed from: a */
    public final void mo32709a(Status status) {
        this.f59615a.mo11797a(status);
    }
}
