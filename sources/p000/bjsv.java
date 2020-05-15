package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.clientlog.Session;

/* renamed from: bjsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjsv implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    public LogContext f123258a;

    /* renamed from: b */
    public long f123259b;

    /* renamed from: c */
    public String f123260c;

    /* renamed from: d */
    public boolean f123261d;

    /* renamed from: e */
    public final int f123262e;

    /* renamed from: f */
    private final View f123263f;

    /* renamed from: g */
    private final Rect f123264g;

    public bjsv(View view) {
        this(view, 1);
    }

    /* renamed from: c */
    private final void m104540c() {
        if (!this.f123261d && this.f123263f.isShown() && this.f123263f.getGlobalVisibleRect(this.f123264g)) {
            int i = this.f123262e;
            if (i != 1) {
                LogContext logContext = this.f123258a;
                String str = this.f123260c;
                long j = this.f123259b;
                if (!bjst.m104536d(logContext)) {
                    Log.e("ClientLog", "Tried to log fieldImpression() in an invalid session.");
                } else {
                    Session b = logContext.mo71783b();
                    bxvd da = bwfu.f159137e.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bwfu bwfu = (bwfu) da.f164949b;
                    int i2 = i - 1;
                    if (i != 0) {
                        bwfu.f159140b = i2;
                        bwfu.f159139a |= 1;
                        if (b.f151805e && !TextUtils.isEmpty(str)) {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bwfu bwfu2 = (bwfu) da.f164949b;
                            str.getClass();
                            bwfu2.f159139a |= 2;
                            bwfu2.f159141c = str;
                        }
                        bxvd e = bjst.m104537e(logContext);
                        bwfe bwfe = bwfe.EVENT_NAME_IMPRESSION;
                        if (e.f164950c) {
                            e.mo74035c();
                            e.f164950c = false;
                        }
                        bwfr bwfr = (bwfr) e.f164949b;
                        bwfr bwfr2 = bwfr.f159113m;
                        bwfr.f159121g = bwfe.f159083I;
                        int i3 = bwfr.f159115a | 4;
                        bwfr.f159115a = i3;
                        bwfr.f159115a = i3 | 32;
                        bwfr.f159124j = j;
                        bwfu bwfu3 = (bwfu) da.mo74062i();
                        bwfu3.getClass();
                        bwfr.f159117c = bwfu3;
                        bwfr.f159116b = 11;
                        bjst.m104528a(b, (bwfr) e.mo74062i());
                    } else {
                        throw null;
                    }
                }
            } else {
                LogContext logContext2 = this.f123258a;
                long j2 = this.f123259b;
                if (!bjst.m104536d(logContext2)) {
                    Log.e("ClientLog", "Tried to log impression() in an invalid session.");
                } else {
                    bxvd e2 = bjst.m104537e(logContext2);
                    bwfe bwfe2 = bwfe.EVENT_NAME_IMPRESSION;
                    if (e2.f164950c) {
                        e2.mo74035c();
                        e2.f164950c = false;
                    }
                    bwfr bwfr3 = (bwfr) e2.f164949b;
                    bwfr bwfr4 = bwfr.f159113m;
                    bwfr3.f159121g = bwfe2.f159083I;
                    int i4 = bwfr3.f159115a | 4;
                    bwfr3.f159115a = i4;
                    bwfr3.f159115a = i4 | 32;
                    bwfr3.f159124j = j2;
                    bjst.m104528a(logContext2.mo71783b(), (bwfr) e2.mo74062i());
                }
            }
            this.f123261d = true;
            ViewTreeObserver viewTreeObserver = this.f123263f.getViewTreeObserver();
            viewTreeObserver.removeGlobalOnLayoutListener(this);
            viewTreeObserver.removeOnScrollChangedListener(this);
        }
    }

    /* renamed from: a */
    public final void mo65506a() {
        LogContext logContext;
        if (!this.f123261d && (logContext = this.f123258a) != null && bjst.m104529a(logContext.mo71783b(), bwfe.EVENT_NAME_IMPRESSION) && this.f123259b != 0) {
            ViewTreeObserver viewTreeObserver = this.f123263f.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(this);
            viewTreeObserver.addOnScrollChangedListener(this);
        }
    }

    /* renamed from: b */
    public final Bundle mo65508b() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("impressionLogged", this.f123261d);
        return bundle;
    }

    public final void onGlobalLayout() {
        m104540c();
    }

    public final void onScrollChanged() {
        m104540c();
    }

    public bjsv(View view, int i) {
        this.f123260c = "";
        this.f123264g = new Rect();
        this.f123263f = view;
        this.f123262e = i;
    }

    /* renamed from: a */
    public final void mo65507a(Bundle bundle) {
        if (bundle != null) {
            this.f123261d = bundle.getBoolean("impressionLogged");
        }
    }
}
