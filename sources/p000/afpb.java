package p000;

import android.util.Pair;
import com.google.android.gms.mdd.FileGroupWithDownloadStatus;
import java.util.ArrayList;
import java.util.List;

/* renamed from: afpb */
final /* synthetic */ class afpb implements bmxj {

    /* renamed from: a */
    static final bmxj f64492a = new afpb();

    private afpb() {
    }

    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Pair pair : (List) obj) {
            arrayList.add(new FileGroupWithDownloadStatus(((bavr) pair.first).f101919b, ((bavr) pair.first).f101920c, ((bavd) pair.second).f101875e, ((bavr) pair.first).f101922e));
        }
        return arrayList;
    }
}
