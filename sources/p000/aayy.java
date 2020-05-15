package p000;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;

/* renamed from: aayy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aayy extends Fragment {

    /* renamed from: a */
    public ProgressBar f56854a;

    /* renamed from: b */
    public View f56855b;

    /* renamed from: c */
    public View f56856c;

    /* renamed from: d */
    public long f56857d = -1;

    /* renamed from: e */
    public boolean f56858e;

    /* renamed from: f */
    public boolean f56859f;

    /* renamed from: g */
    public boolean f56860g;

    /* renamed from: h */
    public aaru f56861h;

    /* renamed from: i */
    public final Handler f56862i = new adzt(Looper.getMainLooper());

    /* renamed from: j */
    public final Runnable f56863j = new aayw(this);

    /* renamed from: k */
    public final Runnable f56864k = new aayv(this);

    /* renamed from: a */
    public final void mo31920a() {
        View view = this.f56856c;
        if (view != null) {
            view.setVisibility(0);
            if (this.f56855b.getVisibility() == 0 && C1280ps.m19920g(this.f56855b) != 0.0f) {
                if (this.f56854a.getVisibility() != 0) {
                    this.f56855b.setVisibility(8);
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f56855b, "alpha", 1.0f, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f56856c, "alpha", 0.0f, 1.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.setDuration(500L);
                animatorSet.addListener(new aayx(this));
                animatorSet.start();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.gh_content_loading_fragment, viewGroup, false);
        this.f56855b = inflate.findViewById(C0126R.C0129id.scrim);
        this.f56854a = (ProgressBar) inflate.findViewById(C0126R.C0129id.gh_progress_bar);
        return inflate;
    }
}
