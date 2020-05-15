package p000;

import android.accounts.Account;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.WebView;

/* renamed from: jdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jdc extends Fragment {

    /* renamed from: a */
    public static final sek f22209a = jdh.m16547a("WebViewFragment");

    /* renamed from: b */
    public jcw f22210b;

    /* renamed from: c */
    public WebView f22211c;

    /* renamed from: d */
    private String f22212d;

    /* renamed from: e */
    private final bqgj f22213e = snp.m35702a(9);

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f22210b = (jcw) adcj.m50161a(activity).mo3444a(jcw.class);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        bmxy.m108581a(arguments);
        String string = arguments.getString("account_name");
        bmxy.m108581a(string);
        this.f22212d = string;
        setRetainInstance(true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bmxy.m108581a(this.f22210b);
        if (viewGroup == null) {
            f22209a.mo25418e("Missing container for WebView.", new Object[0]);
            return null;
        }
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.webview_fragment, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0126R.C0129id.root);
        if (this.f22211c == null) {
            WebView webView = new WebView(viewGroup.getContext());
            this.f22211c = webView;
            webView.setWebViewClient(new jdb(this));
            this.f22211c.setId(C0126R.C0129id.webview);
            this.f22211c.getSettings().setJavaScriptEnabled(true);
            this.f22211c.addJavascriptInterface(new jcv(this.f22210b, this.f22212d), "mm");
            f22209a.mo25412b("Starting key retrieval", new Object[0]);
            String a = ccgb.f178929a.mo6606a().mo75913a();
            aucb a2 = aucu.m76780a(this.f22213e, new jda(new Account(this.f22212d, "com.google"), a));
            a2.mo50373a(new jcy(this, a));
            a2.mo50372a(new jcz(this));
        }
        linearLayout.removeAllViews();
        linearLayout.addView(this.f22211c, new LinearLayout.LayoutParams(-1, -1));
        return inflate;
    }

    public final void onDestroyView() {
        if (getRetainInstance() && (this.f22211c.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.f22211c.getParent()).removeView(this.f22211c);
        }
        super.onDestroyView();
        m16536a();
    }

    /* renamed from: a */
    public static void m16536a() {
        int i = Build.VERSION.SDK_INT;
        CookieManager instance = CookieManager.getInstance();
        instance.removeAllCookies(null);
        instance.flush();
    }
}
