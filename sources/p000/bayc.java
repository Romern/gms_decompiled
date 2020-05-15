package p000;

import android.net.Uri;
import java.util.List;

/* renamed from: bayc */
final /* synthetic */ class bayc implements bmxj {

    /* renamed from: a */
    private final List f102080a;

    public bayc(List list) {
        this.f102080a = list;
    }

    public final Object apply(Object obj) {
        List list = this.f102080a;
        Uri uri = (Uri) obj;
        if (uri == null) {
            return null;
        }
        list.add(uri);
        return null;
    }
}
