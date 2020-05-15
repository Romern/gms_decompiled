package p000;

import android.util.SparseArray;

/* renamed from: bveb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bveb extends buqn {

    /* renamed from: a */
    final /* synthetic */ bvaa f155690a;

    /* renamed from: b */
    final /* synthetic */ bvec f155691b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bveb(bvec bvec, String str, bvaa bvaa) {
        super(str);
        this.f155691b = bvec;
        this.f155690a = bvaa;
    }

    public final void run() {
        boolean z;
        this.f155691b.f155694c.mo73357b(this.f155690a.f155451b);
        synchronized (this.f155691b.f155694c.f155695a) {
            SparseArray sparseArray = this.f155691b.f155694c.f155695a;
            z = false;
            int i = 0;
            while (true) {
                if (i >= sparseArray.size()) {
                    break;
                }
                bvct bvct = (bvct) sparseArray.valueAt(i);
                if (bvct instanceof bvdi) {
                    bvdc bvdc = ((bvdi) bvct).f155649a;
                    if (!(bvdc instanceof buwc)) {
                        if (bvdc instanceof buwa) {
                            z = true;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                } else if (bvct instanceof bvbq) {
                    bvbk bvbk = ((bvbq) bvct).f155551a;
                    if ((bvbk instanceof buvb) || (bvbk instanceof buvu) || (bvbk instanceof buvw) || (bvbk instanceof buvy)) {
                        z = true;
                    }
                } else {
                    continue;
                }
                i++;
            }
        }
        if (!z) {
            srn srn = bvcm.f155598a;
            this.f155691b.f155694c.f155699e.mo73341a((bvda) null);
        }
    }
}
