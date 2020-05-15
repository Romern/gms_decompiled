package p000;

import android.net.Uri;
import java.util.Locale;

/* renamed from: ton */
final /* synthetic */ class ton implements bmxz {

    /* renamed from: a */
    static final bmxz f46411a = new ton();

    private ton() {
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        bnic bnic = top.f46413a;
        Uri parse = Uri.parse(((qun) obj).f42167b);
        return parse.getScheme() != null && top.f46413a.contains(parse.getScheme().toLowerCase(Locale.US)) && (parse.getPath().isEmpty() || parse.getPath().equals("/"));
    }
}
