package p000;

import android.net.Uri;
import android.webkit.URLUtil;
import java.util.regex.Pattern;

/* renamed from: becg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class becg {

    /* renamed from: a */
    private static final Pattern f106901a = Pattern.compile("(\\.|%2e){2,}|%u", 2);

    static {
        bnsp.m110328a("UrlChecker");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo29318a(String str);

    /* renamed from: a */
    public final boolean mo58550a(Uri uri) {
        Uri.Builder encodedFragment = uri.buildUpon().encodedFragment(null);
        if (uri.isHierarchical()) {
            encodedFragment.clearQuery();
        }
        String uri2 = encodedFragment.build().toString();
        if (f106901a.matcher(uri2).find()) {
            becf.m91769a(uri);
            return false;
        } else if ((!bmxx.m108577a(uri.getHost()) && "https".equalsIgnoreCase(uri.getScheme())) || URLUtil.isAssetUrl(uri2) || URLUtil.isAboutUrl(uri2) || uri2.startsWith("file:///android_res/")) {
            return mo29318a(uri2);
        } else {
            becf.m91769a(uri);
            return false;
        }
    }
}
