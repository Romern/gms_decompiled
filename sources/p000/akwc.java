package p000;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import java.util.ArrayList;
import java.util.List;

/* renamed from: akwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akwc implements akww {

    /* renamed from: a */
    public final akwb f72985a;

    /* renamed from: b */
    List f72986b = new ArrayList();

    /* renamed from: c */
    private final Handler f72987c = new adzt(Looper.getMainLooper());

    public akwc(akwb akwb) {
        sdo.m34959a(akwb);
        this.f72985a = akwb;
    }

    /* renamed from: a */
    public final akwv mo39896a() {
        return new akwv("ocAppBar", null, true);
    }

    /* renamed from: a */
    public final void mo39897a(String str) {
    }

    /* renamed from: b */
    public final void mo39898b() {
        this.f72987c.removeCallbacksAndMessages(null);
    }

    @JavascriptInterface
    public synchronized void clear() {
        this.f72986b.clear();
        setTitleText(null);
        setTitleType(1);
        setAccountDisplay(1);
        setUpButtonAction(1);
        setHelpContext(null);
        setHelpUrl(null);
    }

    @JavascriptInterface
    public synchronized void commitChanges() {
        List list = this.f72986b;
        this.f72986b = new ArrayList();
        this.f72987c.post(new akvy(list));
    }

    @JavascriptInterface
    public void hide(double d) {
        this.f72987c.post(new akvz(this.f72985a, d));
    }

    @JavascriptInterface
    public synchronized void setAccountDisplay(int i) {
        this.f72986b.add(new akvv(this, i));
    }

    @JavascriptInterface
    public synchronized void setHelpContext(String str) {
        this.f72986b.add(new akvw(this, str));
    }

    @JavascriptInterface
    public synchronized void setHelpUrl(String str) {
        this.f72986b.add(new akvx(this, str));
    }

    @JavascriptInterface
    public synchronized void setTitleText(String str) {
        this.f72986b.add(new akvt(this, str));
    }

    @JavascriptInterface
    public synchronized void setTitleType(int i) {
        this.f72986b.add(new akvu(this, i));
    }

    @JavascriptInterface
    public synchronized void setUpButtonAction(int i) {
        this.f72986b.add(new akvs(this, i));
    }

    @JavascriptInterface
    public void show(double d) {
        this.f72987c.post(new akwa(this.f72985a, d));
    }
}
