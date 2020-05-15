package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: aceb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aceb implements acjh {

    /* renamed from: a */
    private final rnt f59619a;

    /* renamed from: b */
    private final String f59620b;

    /* renamed from: c */
    private final acjf f59621c;

    public aceb(rnt rnt, String str, acjf acjf) {
        this.f59619a = rnt;
        this.f59620b = str;
        this.f59621c = acjf;
    }

    /* renamed from: a */
    public final void mo32708a() {
        try {
            this.f59621c.mo32791a(acea.f59618a, this.f59620b).mo32789a(false, 3, false, null);
            this.f59619a.mo11797a(Status.f30107a);
        } catch (Exception e) {
            this.f59619a.mo11797a(ackq.m49337a(getClass().getSimpleName(), 8, String.format("Failed to start task %s", this.f59620b)));
        }
    }

    /* renamed from: a */
    public final void mo32709a(Status status) {
        this.f59619a.mo11797a(status);
    }
}
