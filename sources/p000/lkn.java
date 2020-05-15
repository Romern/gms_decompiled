package p000;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: lkn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lkn implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ AtomicInteger f26258a;

    /* renamed from: b */
    final /* synthetic */ aic f26259b;

    public lkn(AtomicInteger atomicInteger, aic aic) {
        this.f26258a = atomicInteger;
        this.f26259b = aic;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        kpb kpb = kpb.USERNAME;
        if (this.f26258a.get() == 1) {
            kpb = kpb.PASSWORD;
        }
        this.f26259b.mo749a(kpb);
    }
}
