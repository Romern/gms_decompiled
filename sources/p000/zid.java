package p000;

import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: zid */
final /* synthetic */ class zid implements bmxj {

    /* renamed from: a */
    static final bmxj f55126a = new zid();

    private zid() {
    }

    public final Object apply(Object obj) {
        srn srn = zie.f55127a;
        for (Status status : (List) obj) {
            if (!status.mo17710c()) {
                bnsl bnsl = (bnsl) zie.f55127a.mo68388c();
                bnsl.mo68432a("zie", "a", 124, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Sensor flush failed. Results may be stale. %s", status);
                return status;
            }
        }
        return Status.f30107a;
    }
}
