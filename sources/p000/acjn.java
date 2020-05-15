package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: acjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acjn extends aaab {

    /* renamed from: a */
    private final String f59999a;

    /* renamed from: b */
    private final acjj f60000b;

    /* renamed from: c */
    private final acjk f60001c;

    /* renamed from: d */
    private final achw f60002d;

    public acjn(int i, String str, String str2, acjj acjj, acjk acjk) {
        super(i, str);
        this.f60002d = acjk.mo32779y();
        this.f59999a = str2;
        this.f60000b = acjj;
        this.f60001c = acjk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (acbm.m48831a()) {
            try {
                acib acib = new acib();
                acjk acjk = this.f60001c;
                cazf.m127594a(acjk);
                acib.f59891b = acjk;
                acjm acjm = new acjm(this.f59999a, context, this.f60000b);
                cazf.m127594a(acjm);
                acib.f59890a = acjm;
                cazf.m127595a(acib.f59890a, acjm.class);
                cazf.m127595a(acib.f59891b, acjk.class);
                new acih(acib.f59890a, acib.f59891b).f59901b.mo75201b().get();
            } catch (InterruptedException e) {
                this.f60000b.mo32664a(ackq.m49337a(this.f27820m, 14, "Delegate failed"));
            } catch (ExecutionException e2) {
                this.f60000b.mo32664a(ackq.m49339a(this.f27820m, "Delegate failed"));
                if (e2.getCause() instanceof chux) {
                    chux chux = (chux) e2.getCause();
                }
            }
        } else {
            this.f60000b.mo32664a(new Status(17, "Delegate aborted"));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f60002d.mo25418e("MdhAsyncOperation[%s]#onFailure: %s", this.f27820m, status);
        this.f60000b.mo32664a(status);
    }
}
