package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.chimera.WebView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/* renamed from: aazn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aazn extends Fragment {

    /* renamed from: a */
    public WebView f56892a;

    /* renamed from: b */
    public Deque f56893b;

    /* renamed from: c */
    public aasf f56894c;

    /* renamed from: d */
    boolean f56895d;

    /* renamed from: e */
    private List f56896e = new ArrayList();

    /* renamed from: a */
    static final bzps m47321a(int i) {
        int i2 = i - 2;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 == 1) {
                    return bzps.CHAT;
                }
                if (i2 == 2) {
                    return bzps.HANGOUTS;
                }
                if (i2 == 3) {
                    return bzps.C2C;
                }
                if (i2 != 50) {
                    return bzps.UNKNOWN_CONTACT_MODE;
                }
            }
            return bzps.EMAIL;
        }
        throw null;
    }

    /* renamed from: b */
    public final boolean mo31948b() {
        return !this.f56893b.isEmpty() && ((aasg) this.f56893b.peek()).mo31705b();
    }

    /* renamed from: c */
    public final boolean mo31949c() {
        return !this.f56893b.isEmpty() && ((aasg) this.f56893b.peek()).mo31706c();
    }

    /* renamed from: d */
    public final float mo31950d() {
        WebView webView = this.f56892a;
        if (webView == null || webView.getContentHeight() <= 0) {
            return -1.0f;
        }
        return ((float) this.f56892a.getScrollY()) / ((float) this.f56892a.getContentHeight());
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        aasf aasf = (aasf) activity;
        this.f56894c = aasf;
        if (aasf.mo18626g() != null && cegi.f182636a.mo6606a().mo79104a()) {
            int i = Build.VERSION.SDK_INT;
            AppBarLayout appBarLayout = (AppBarLayout) activity.findViewById(C0126R.C0129id.gh_help_app_bar);
            if (appBarLayout != null) {
                appBarLayout.f150996d = true;
                appBarLayout.mo70976c(true);
                this.f56892a.setOnScrollChangeListener(new aazd(appBarLayout));
            }
        }
        mo31946a(new aaze(this));
        mo31947a(false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.gh_help_answer_fragment, viewGroup, false);
        WebView webView = (WebView) inflate.findViewById(C0126R.C0129id.gh_answer_content);
        this.f56892a = webView;
        webView.setBackgroundColor(aayi.m47263a(layoutInflater.getContext(), C0126R.attr.ghf_surfaceColor));
        this.f56893b = new ArrayDeque();
        this.f56895d = false;
        int size = this.f56896e.size();
        for (int i = 0; i < size; i++) {
            ((aazl) this.f56896e.get(i)).mo31937a();
        }
        this.f56896e = null;
        return inflate;
    }

    /* renamed from: a */
    public final void mo31944a() {
        mo31946a(new aazj(this));
    }

    /* renamed from: a */
    public final void mo31945a(aasg aasg, boolean z) {
        mo31946a(new aazf(this, aasg, z));
    }

    /* renamed from: a */
    public final void mo31946a(aazl aazl) {
        List list = this.f56896e;
        if (list != null) {
            list.add(aazl);
        } else {
            aazl.mo31937a();
        }
    }

    /* renamed from: a */
    public final void mo31947a(boolean z) {
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        if (z) {
            beginTransaction.show(this);
        } else {
            beginTransaction.hide(this);
        }
        beginTransaction.commitAllowingStateLoss();
    }
}
