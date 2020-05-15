package p000;

import com.google.autofill.detection.p098ml.Model;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: kmz */
final /* synthetic */ class kmz implements Callable {

    /* renamed from: a */
    private final knh f24505a;

    /* renamed from: b */
    private final Map f24506b;

    /* renamed from: c */
    private final klu f24507c;

    public kmz(knh knh, Map map, klu klu) {
        this.f24505a = knh;
        this.f24506b = map;
        this.f24507c = klu;
    }

    public final Object call() {
        knh knh = this.f24505a;
        Map map = this.f24506b;
        klu klu = this.f24507c;
        knh.f24520a.reset();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((kom) entry.getKey(), ((Model.Result) ((bqgg) entry.getValue()).get()).getFieldPredictions());
        }
        return knh.mo14722a(klu, hashMap);
    }
}
