package p000;

import android.webkit.WebView;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: akwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akwx {

    /* renamed from: a */
    public final IdentityHashMap f73031a = new IdentityHashMap();

    /* renamed from: b */
    public final IdentityHashMap f73032b = new IdentityHashMap();

    /* renamed from: c */
    public final WebView f73033c;

    /* renamed from: d */
    public final becg f73034d = new akzu(Pattern.compile(stm.m36299a(cfrc.f185484a.mo6606a().mo82552j())), Pattern.compile(stm.m36299a(cfrc.f185484a.mo6606a().mo82551i())));

    public akwx(List list, WebView webView) {
        this.f73033c = webView;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            akww akww = (akww) list.get(i);
            this.f73031a.put(akww, akww.mo39896a());
            this.f73032b.put(akww, false);
        }
    }

    /* renamed from: a */
    public final boolean mo39944a(akww akww) {
        return ((Boolean) this.f73032b.get(akww)).booleanValue();
    }
}
