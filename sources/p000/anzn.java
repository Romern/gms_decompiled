package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.lang.reflect.Method;

/* renamed from: anzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anzn extends AlertDialog implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    private sru f77935a;

    /* renamed from: b */
    private WebView f77936b;

    /* renamed from: c */
    private boolean f77937c = false;

    public anzn(Activity activity, String str, String str2, String str3) {
        super(activity);
        boolean z;
        int i;
        int i2 = 0;
        sru sru = new sru(activity);
        sru.mo26029a(str, str2);
        WebView webView = null;
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            declaredMethod.setAccessible(true);
            z = "wifi-only".equals(declaredMethod.invoke(null, "ro.carrier"));
        } catch (Exception e) {
            z = false;
        }
        sru.mo26028a(activity.getString(!z ? C0126R.string.common_url_load_unsuccessful_message : C0126R.string.common_url_load_unsuccessful_message_wifi_only));
        sru.mo26032b();
        this.f77935a = sru;
        if (!TextUtils.isEmpty(str3)) {
            setTitle(str3);
        }
        setButton(-1, activity.getText(C0126R.string.close_button_label), new anzm());
        FrameLayout frameLayout = new FrameLayout(getContext());
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        if (displayMetrics.heightPixels > 0) {
            double d = (double) displayMetrics.heightPixels;
            Double.isNaN(d);
            i = (int) ((d * 0.9d) + 0.5d);
        } else {
            i = -1;
        }
        frameLayout.addView(this.f77935a.mo26027a(), new FrameLayout.LayoutParams(-1, i));
        ViewGroup a = this.f77935a.mo26027a();
        while (true) {
            if (i2 >= a.getChildCount()) {
                break;
            } else if (a.getChildAt(i2) instanceof WebView) {
                webView = (WebView) a.getChildAt(i2);
                break;
            } else {
                i2++;
            }
        }
        this.f77936b = webView;
        setOnKeyListener(this);
        setView(frameLayout);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.a(android.view.View, int):boolean
     arg types: [android.webkit.WebView, int]
     candidates:
      ps.a(android.view.View, qh):qh
      ps.a(int, android.view.View):void
      ps.a(android.view.View, float):void
      ps.a(android.view.View, android.content.res.ColorStateList):void
      ps.a(android.view.View, android.graphics.PorterDuff$Mode):void
      ps.a(android.view.View, android.graphics.Rect):void
      ps.a(android.view.View, android.graphics.drawable.Drawable):void
      ps.a(android.view.View, java.lang.Runnable):void
      ps.a(android.view.View, java.lang.String):void
      ps.a(android.view.View, oq):void
      ps.a(android.view.View, pi):void
      ps.a(android.view.View, pk):void
      ps.a(android.view.View, qm):void
      ps.a(android.view.View, boolean):void
      ps.a(android.view.View, int):boolean */
    /* renamed from: a */
    private final void m65651a(int i) {
        WebView webView = this.f77936b;
        if (webView != null && C1280ps.m19901a((View) webView, i)) {
            this.f77936b.scrollBy(0, i);
        }
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (this.f77935a.mo26031a(keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 19) {
            m65651a(-20);
            return true;
        } else if (keyEvent.getKeyCode() != 20) {
            return false;
        } else {
            m65651a(20);
            return true;
        }
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
        if (!this.f77937c) {
            this.f77937c = true;
            if (!(layoutParams.width == -1 && layoutParams.height == -1)) {
                getWindow().setLayout(-1, -1);
            }
            this.f77937c = false;
        }
    }
}
