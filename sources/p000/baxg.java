package p000;

import android.net.Uri;

/* renamed from: baxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baxg {

    /* renamed from: a */
    public Uri f102031a;

    /* renamed from: b */
    public String f102032b;

    /* renamed from: c */
    public baxf f102033c;

    /* renamed from: d */
    public Integer f102034d;

    /* renamed from: e */
    public bngx f102035e;

    /* renamed from: a */
    public final void mo56018a(int i) {
        this.f102034d = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo56019a(baxf baxf) {
        if (baxf != null) {
            this.f102033c = baxf;
            return;
        }
        throw new NullPointerException("Null downloadConstraints");
    }

    /* renamed from: a */
    public final void mo56020a(bngx bngx) {
        if (bngx != null) {
            this.f102035e = bngx;
            return;
        }
        throw new NullPointerException("Null extraHttpHeaders");
    }
}
