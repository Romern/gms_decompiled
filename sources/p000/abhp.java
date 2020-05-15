package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: abhp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abhp {

    /* renamed from: b */
    private static final Object f57490b = new Object();

    /* renamed from: c */
    private static final Object f57491c = new Object();

    /* renamed from: d */
    private static final Object f57492d = new Object();

    /* renamed from: e */
    private static WebResourceResponse f57493e;

    /* renamed from: f */
    private static int f57494f;

    /* renamed from: g */
    private static List f57495g = new ArrayList();

    /* renamed from: h */
    private static int f57496h;

    /* renamed from: i */
    private static List f57497i = new ArrayList();

    /* renamed from: j */
    private static int f57498j;

    /* renamed from: k */
    private static List f57499k = new ArrayList();

    /* renamed from: l */
    private static int f57500l;

    /* renamed from: m */
    private static String f57501m;

    /* renamed from: n */
    private static int f57502n;

    /* renamed from: o */
    private static List f57503o = new ArrayList();

    /* renamed from: a */
    public aasg f57504a;

    /* renamed from: p */
    private final aasf f57505p;

    public abhp(aasf aasf) {
        this.f57505p = aasf;
    }

    /* renamed from: a */
    private static List m47714a(String str) {
        return Arrays.asList(aayh.m47256a(str));
    }

    /* renamed from: b */
    public static boolean m47719b(Uri uri) {
        return uri != null && !TextUtils.isEmpty(uri.toString()) && "https".equals(uri.getScheme()) && !TextUtils.isEmpty(uri.getHost());
    }

    public abhp(aasf aasf, aasg aasg) {
        this(aasf);
        this.f57504a = aasg;
    }

    /* renamed from: a */
    public static final void m47715a(aasf aasf, Uri uri, aasg aasg) {
        aasm aasm;
        String uri2 = uri.toString();
        String str = null;
        if (!(aasg == null || (aasm = aasg.f56426a) == null)) {
            str = aasm.f56497g;
        }
        abcx.m47485a(aasf, uri2, str);
    }

    /* renamed from: a */
    private static void m47716a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String valueOf = String.valueOf((String) list.get(i));
            list.set(i, valueOf.length() == 0 ? new String("https://") : "https://".concat(valueOf));
        }
    }

    /* renamed from: a */
    public static boolean m47717a(Uri uri, boolean z) {
        List list;
        if (!m47719b(uri)) {
            return false;
        }
        String host = uri.getHost();
        synchronized (f57490b) {
            String aT = ceeg.f182447a.mo6606a().mo78979aT();
            if (f57498j != aT.hashCode()) {
                f57498j = aT.hashCode();
                list = m47714a(aT);
                f57503o = list;
            } else {
                list = f57503o;
            }
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (host.endsWith((String) list.get(i))) {
                return true;
            }
        }
        if (!m47718a(uri.toString(), z)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m47718a(String str, boolean z) {
        List list;
        if (z) {
            String b = cegc.f182629a.mo6606a().mo79100b();
            if (f57494f != b.hashCode()) {
                sdo.m34967a("Should only be run on the UI/Main thread.");
                f57494f = b.hashCode();
                list = m47714a(b);
                m47716a(list);
                f57495g = list;
            } else {
                list = f57495g;
            }
        } else {
            synchronized (f57491c) {
                String a = cegc.f182629a.mo6606a().mo79099a();
                if (f57496h != a.hashCode()) {
                    f57496h = a.hashCode();
                    List a2 = m47714a(a);
                    m47716a(a2);
                    f57497i = a2;
                    list = a2;
                } else {
                    List list2 = f57497i;
                    list = list2;
                }
            }
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (str.startsWith((String) list.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: abhp.a(android.net.Uri, boolean):boolean
     arg types: [android.net.Uri, int]
     candidates:
      abhp.a(java.lang.String, boolean):boolean
      abhp.a(android.net.Uri, boolean):boolean */
    /* renamed from: a */
    public final WebResourceResponse mo32115a(Uri uri) {
        String str;
        List list;
        synchronized (f57492d) {
            String z = ceeg.m136421z();
            if (f57502n != z.hashCode()) {
                f57501m = Uri.parse(z).getAuthority().toLowerCase(Locale.US);
                f57502n = z.hashCode();
            }
            str = f57501m;
        }
        if (str.equalsIgnoreCase(uri.getAuthority())) {
            synchronized (f57492d) {
                String aJ = ceeg.f182447a.mo6606a().mo78969aJ();
                if (f57500l != aJ.hashCode()) {
                    f57499k = m47714a(aJ);
                    f57500l = aJ.hashCode();
                }
                list = f57499k;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (uri.getPath().contains((CharSequence) list.get(i))) {
                    return abfj.m47616a(this.f57505p.mo18630k(), this.f57505p.mo18626g(), uri.toString(), this.f57505p.mo18627h());
                }
            }
        }
        if (uri != null) {
            String host = uri.getHost();
            if (!TextUtils.isEmpty(host)) {
                host = host.toLowerCase(Locale.US);
            }
            String scheme = uri.getScheme();
            if (!TextUtils.isEmpty(scheme)) {
                scheme = scheme.toLowerCase(Locale.US);
            }
            if (aaya.m47229b(cefn.f182606a.mo6606a().mo79081a())) {
                if ("data".equals(scheme) && TextUtils.isEmpty(host) && uri.getSchemeSpecificPart().startsWith("image/") && uri.getSchemeSpecificPart().contains(";base64")) {
                    return null;
                }
            } else if ("data".equals(scheme) && TextUtils.isEmpty(host) && uri.getSchemeSpecificPart().contains(";base64")) {
                return null;
            }
            if (m47717a(uri, false)) {
                return null;
            }
            m47715a(this.f57505p, uri, this.f57504a);
        }
        if (f57493e == null) {
            f57493e = new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
        }
        return f57493e;
    }
}
