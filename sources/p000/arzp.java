package p000;

import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: arzp */
final /* synthetic */ class arzp implements Runnable {

    /* renamed from: a */
    private final arzy f88535a;

    /* renamed from: b */
    private final bqgg f88536b;

    /* renamed from: c */
    private final bqgg f88537c;

    public arzp(arzy arzy, bqgg bqgg, bqgg bqgg2) {
        this.f88535a = arzy;
        this.f88536b = bqgg;
        this.f88537c = bqgg2;
    }

    public final void run() {
        arzy arzy = this.f88535a;
        bqgg bqgg = this.f88536b;
        bqgg bqgg2 = this.f88537c;
        try {
            arzy.f88560g = (Set) bqga.m112780a((Future) bqgg);
        } catch (ExecutionException e) {
            arzy.f88554a.mo25417e("Failed to find Dasher accounts", e, new Object[0]);
        }
        try {
            arzy.f88561h = (Set) bqga.m112780a((Future) bqgg2);
        } catch (ExecutionException e2) {
            arzy.f88554a.mo25417e("Failed to find Unicorn accounts", e2, new Object[0]);
        }
        arzy.f88559f = rsr.m34360a(arzy.f88560g, arzy.f88561h);
    }
}
