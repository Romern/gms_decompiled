package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: sru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sru {

    /* renamed from: a */
    private final Context f45054a;

    /* renamed from: b */
    private String f45055b;

    /* renamed from: c */
    private String f45056c;

    /* renamed from: d */
    private String f45057d;

    /* renamed from: e */
    private FrameLayout f45058e;

    /* renamed from: f */
    private WebView f45059f;

    /* renamed from: g */
    private View f45060g;

    /* renamed from: h */
    private TextView f45061h;

    /* renamed from: i */
    private final float f45062i;

    /* renamed from: j */
    private boolean f45063j;

    public sru(Context context) {
        this.f45054a = context;
        this.f45062i = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    private static String m36152b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String lowerCase = locale.getCountry().toLowerCase(Locale.US);
        StringBuilder sb = new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(lowerCase).length());
        sb.append(language);
        sb.append("_");
        sb.append(lowerCase);
        return String.format(str, sb.toString());
    }

    /* renamed from: c */
    private final synchronized void m36153c() {
        if (this.f45058e == null) {
            FrameLayout frameLayout = new FrameLayout(this.f45054a);
            this.f45058e = frameLayout;
            frameLayout.setForegroundGravity(17);
            int i = (int) ((this.f45062i * 10.0f) + 0.5f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            ProgressBar progressBar = new ProgressBar(this.f45054a);
            progressBar.setIndeterminate(true);
            this.f45058e.addView(progressBar, layoutParams);
            this.f45060g = progressBar;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            com.google.android.chimera.WebView webView = new com.google.android.chimera.WebView(this.f45054a);
            this.f45059f = webView;
            webView.setVisibility(4);
            this.f45059f.getSettings().setCacheMode(2);
            this.f45059f.setWebViewClient(new srt(this));
            this.f45058e.addView(this.f45059f, layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams3.gravity = 17;
            TextView textView = new TextView(this.f45054a);
            this.f45061h = textView;
            textView.setVisibility(8);
            this.f45061h.setPadding(i, i, i, i);
            this.f45061h.setText(this.f45057d);
            this.f45058e.addView(this.f45061h, layoutParams3);
        }
    }

    /* renamed from: a */
    public final ViewGroup mo26027a() {
        m36153c();
        return this.f45058e;
    }

    /* renamed from: a */
    public final void mo26028a(String str) {
        this.f45057d = String.format(this.f45054a.getResources().getConfiguration().locale, str, this.f45056c);
    }

    /* renamed from: a */
    public final void mo26029a(String str, String str2) {
        this.f45055b = m36152b(str);
        this.f45056c = m36152b(str2);
    }

    /* renamed from: b */
    public final void mo26032b() {
        m36153c();
        this.f45059f.loadUrl(this.f45055b);
    }

    /* renamed from: a */
    public final synchronized void mo26030a(boolean z) {
        View view;
        View view2;
        if (!this.f45063j) {
            this.f45063j = true;
            ((ViewGroup) this.f45060g.getParent()).removeView(this.f45060g);
            if (!z) {
                view = this.f45059f;
            } else {
                view = this.f45061h;
            }
            ((ViewGroup) view.getParent()).removeView(view);
            if (!z) {
                view2 = this.f45061h;
            } else {
                view2 = this.f45059f;
            }
            view2.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final boolean mo26031a(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0 || !this.f45059f.canGoBack()) {
            return false;
        }
        this.f45059f.goBack();
        return true;
    }
}
