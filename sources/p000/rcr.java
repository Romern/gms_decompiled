package p000;

import java.util.PriorityQueue;

/* renamed from: rcr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rcr extends PriorityQueue {

    /* renamed from: a */
    long f42652a = 0;

    /* renamed from: b */
    long f42653b;

    /* renamed from: c */
    long f42654c = 0;

    /* renamed from: d */
    final /* synthetic */ rde f42655d;

    public rcr(rde rde, long j) {
        this.f42655d = rde;
        this.f42653b = j;
    }

    /* renamed from: a */
    public final void mo24461a() {
        while (true) {
            if ((!isEmpty() && this.f42653b <= this.f42654c - ((rcq) peek()).f42651b) || size() > 1500) {
                this.f42654c -= ((rcq) poll()).f42651b;
            } else {
                return;
            }
        }
    }

    public final void clear() {
        super.clear();
        this.f42654c = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24462a(long j) {
        long a = this.f42653b - this.f42655d.mo24480a(j);
        this.f42653b = a;
        if (a <= 0) {
            clear();
            this.f42653b = 0;
        }
        mo24461a();
    }
}
