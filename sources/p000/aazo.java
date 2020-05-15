package p000;

import android.content.Context;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.WebView;
import java.util.List;

/* renamed from: aazo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aazo {
    /* renamed from: a */
    public static String m47329a(aasf aasf, boolean z) {
        if (!z) {
            aasf.mo18630k();
            return ((Context) aasf).getResources().getString(C0126R.string.gh_popular_articles);
        }
        aasf.mo18630k();
        return ((Context) aasf).getResources().getString(C0126R.string.gh_help_search_title);
    }

    /* renamed from: a */
    public static String m47330a(String str, List list, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("<h2>");
        sb.append(str);
        sb.append("</h2><ul>");
        for (int i = 0; i < list.size(); i++) {
            aasm aasm = (aasm) list.get(i);
            sb.append("<li>");
            sb.append(aasm.f56496f);
            if (z && !TextUtils.isEmpty(aasm.mo31735r())) {
                sb.append("<p class=\"ghelp-search-snippet\">");
                sb.append(aasm.mo31735r());
                sb.append("</p>");
            }
            sb.append("</li>");
        }
        sb.append("</ul>");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m47331a(aasf aasf, String str, WebView webView) {
        ((PrintManager) aasf.mo18630k().getSystemService("print")).print(aasf.mo18630k().getString(C0126R.string.gh_print_job_name, str), webView.createPrintDocumentAdapter(), new PrintAttributes.Builder().build());
    }

    /* renamed from: a */
    public static void m47332a(aasf aasf, String str, String str2) {
        aasf.mo18630k();
        WebView webView = new WebView((Context) aasf);
        abht.m47728a(webView, null, str, str2, abfm.m47619a(aasf.mo18626g()), false);
        m47331a(aasf, str, webView);
    }
}
