package p000;

import com.google.android.gms.common.data.DataHolder;

/* renamed from: axpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axpf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ DataHolder f96239a;

    /* renamed from: b */
    final /* synthetic */ axpo f96240b;

    public axpf(axpo axpo, DataHolder dataHolder) {
        this.f96240b = axpo;
        this.f96239a = dataHolder;
    }

    public final void run() {
        rtx rtx = new rtx(this.f96239a);
        try {
            this.f96240b.f96251a.mo19178a(rtx);
        } finally {
            rtx.mo12460c();
        }
    }
}
