package p000;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ScrollView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: avic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avic implements suq {

    /* renamed from: a */
    public final View f93209a;

    /* renamed from: b */
    public final View f93210b;

    /* renamed from: c */
    public final View f93211c;

    /* renamed from: d */
    public final View f93212d;

    /* renamed from: e */
    private final ScrollView f93213e;

    /* renamed from: f */
    private final ViewGroup f93214f;

    /* renamed from: g */
    private final int f93215g;

    /* renamed from: h */
    private final Animation f93216h;

    /* renamed from: i */
    private final Animation f93217i;

    /* renamed from: j */
    private final Animation f93218j;

    public avic(ScrollView scrollView, ViewGroup viewGroup) {
        this.f93213e = scrollView;
        ViewGroup viewGroup2 = (ViewGroup) scrollView.findViewById(C0126R.C0129id.udc_consent_header);
        this.f93214f = viewGroup2;
        TextView textView = (TextView) viewGroup2.findViewById(C0126R.C0129id.header);
        if (textView == null) {
            textView = null;
        } else if (TextUtils.isEmpty(textView.getText())) {
            textView = null;
        }
        this.f93209a = textView;
        this.f93210b = this.f93214f.findViewById(C0126R.C0129id.illustration);
        this.f93211c = viewGroup.findViewById(C0126R.C0129id.udc_consent_toolbar);
        this.f93212d = viewGroup.findViewById(C0126R.C0129id.udc_consent_toolbar_shadow);
        Context context = scrollView.getContext();
        this.f93215g = context.getResources().getDimensionPixelSize(C0126R.dimen.udc_consent_title_vertical_margin);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, C0126R.anim.udc_fade_in);
        this.f93217i = loadAnimation;
        loadAnimation.setDuration(600);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, C0126R.anim.udc_fade_out);
        this.f93218j = loadAnimation2;
        loadAnimation2.setDuration(600);
        this.f93216h = AnimationUtils.loadAnimation(context, C0126R.anim.udc_fade_in);
    }

    /* renamed from: a */
    private final void m78546a(View view) {
        m78548a(view, this.f93217i, 0);
    }

    /* renamed from: b */
    private final void m78549b(View view) {
        m78548a(view, this.f93218j, 4);
    }

    /* renamed from: a */
    public static final void m78547a(View view, int i) {
        if (view != null && view.getVisibility() != 8 && view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    private final void m78548a(View view, Animation animation, int i) {
        View view2 = this.f93210b;
        if ((view != view2 || view2 == null || view2.getVisibility() != 8) && view != null) {
            view.clearAnimation();
            view.startAnimation(animation);
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo26131a(int i) {
        if (mo51260a()) {
            if (this.f93211c.getVisibility() != 0) {
                m78546a(this.f93211c);
                m78549b(this.f93209a);
                m78549b(this.f93210b);
            }
        } else if (this.f93211c.getVisibility() == 0) {
            m78549b(this.f93211c);
            m78546a(this.f93209a);
            m78546a(this.f93210b);
        }
        if (this.f93214f.getHeight() - i <= this.f93211c.getHeight()) {
            if (this.f93212d.getVisibility() != 0) {
                m78548a(this.f93212d, this.f93216h, 0);
            }
        } else if (this.f93212d.getVisibility() == 0) {
            this.f93212d.clearAnimation();
            this.f93212d.setVisibility(4);
        }
    }

    /* renamed from: a */
    public final boolean mo51260a() {
        int i;
        if (this.f93213e == null || this.f93211c == null) {
            return false;
        }
        View view = this.f93209a;
        if (view != null) {
            i = view.getTop();
        } else {
            View view2 = this.f93210b;
            i = view2 != null ? view2.getBottom() : 0;
        }
        return i - this.f93213e.getScrollY() <= this.f93215g + this.f93211c.getPaddingTop();
    }
}
