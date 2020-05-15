package p000;

import com.google.autofill.detection.p098ml.ExecutionException;
import java.util.concurrent.Callable;

/* renamed from: kmy */
final /* synthetic */ class kmy implements Callable {

    /* renamed from: a */
    private final knh f24503a;

    /* renamed from: b */
    private final kom f24504b;

    public kmy(knh knh, kom kom) {
        this.f24503a = knh;
        this.f24504b = kom;
    }

    public final Object call() {
        knh knh = this.f24503a;
        try {
            return knh.f24520a.predict(this.f24504b);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
