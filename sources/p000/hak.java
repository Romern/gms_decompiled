package p000;

import android.graphics.Bitmap;
import java.util.concurrent.ExecutionException;

/* renamed from: hak */
final /* synthetic */ class hak implements Runnable {

    /* renamed from: a */
    private final hav f19348a;

    /* renamed from: b */
    private final bqgg f19349b;

    /* renamed from: c */
    private final bqgg f19350c;

    public hak(hav hav, bqgg bqgg, bqgg bqgg2) {
        this.f19348a = hav;
        this.f19349b = bqgg;
        this.f19350c = bqgg2;
    }

    public final void run() {
        hav hav = this.f19348a;
        bqgg bqgg = this.f19349b;
        bqgg bqgg2 = this.f19350c;
        try {
            hav.f19363b.f19387k = (hba) bqgg.get();
        } catch (InterruptedException | ExecutionException e) {
        }
        try {
            hav.f19363b.f19386j = (Bitmap) ((bmxv) bqgg2.get()).mo66815c();
        } catch (InterruptedException | ExecutionException e2) {
        }
        hav.f19363b.mo12366a(2);
        hav.f19363b.mo12369a(false);
    }
}
