package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import java.net.CookieManager;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aqbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqbr {

    /* renamed from: a */
    public AtomicBoolean f85600a;

    /* renamed from: b */
    public final apyk f85601b;

    /* renamed from: c */
    private final long f85602c;

    /* renamed from: d */
    private final CookieStore f85603d = new CookieManager().getCookieStore();

    /* renamed from: e */
    private final ExecutorService f85604e;

    /* renamed from: f */
    private long f85605f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized String mo47742a() {
        List<HttpCookie> cookies;
        cookies = this.f85603d.getCookies();
        return (cookies == null || cookies.isEmpty()) ? null : TextUtils.join(";", cookies);
    }

    public aqbr(Context context, ExecutorService executorService) {
        ArrayList arrayList;
        this.f85604e = executorService;
        apyk apyk = new apyk(context);
        this.f85601b = apyk;
        this.f85605f = apyk.f85143a.getLong("snet_safe_browsing_last_cookie_save_time_ms", 0);
        this.f85600a = new AtomicBoolean(true);
        this.f85602c = 900000;
        String string = this.f85601b.f85143a.getString("snet_safe_browsing_cookies", "");
        if (!TextUtils.isEmpty(string)) {
            arrayList = new ArrayList();
            for (String str : bmyx.m108643a(";").mo66918a((CharSequence) string)) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(new String(Base64.decode(str.getBytes(Charset.forName("UTF-8")), 0)));
                }
            }
        } else {
            arrayList = null;
        }
        mo47743a(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo47743a(List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                this.f85603d.removeAll();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str != null) {
                        try {
                            for (HttpCookie httpCookie : HttpCookie.parse(str)) {
                                this.f85603d.add(null, httpCookie);
                            }
                        } catch (IllegalArgumentException e) {
                        }
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f85605f + this.f85602c <= currentTimeMillis) {
                    this.f85605f = currentTimeMillis;
                    this.f85604e.execute(new aqbq(this, list));
                }
            }
        }
    }
}
