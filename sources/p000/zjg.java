package p000;

import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: zjg */
final /* synthetic */ class zjg implements bmxj {

    /* renamed from: a */
    static final bmxj f55204a = new zjg();

    private zjg() {
    }

    public final Object apply(Object obj) {
        srn srn = zjm.f55217a;
        for (Status status : (List) obj) {
            if (!status.mo17710c()) {
                return status;
            }
        }
        return Status.f30107a;
    }
}
