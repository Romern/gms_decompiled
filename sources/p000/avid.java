package p000;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.support.p002v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.widget.phone.ScrollViewWithEvents;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.udc.ConsentFlowConfig;

/* renamed from: avid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avid extends avhz implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: m */
    private boolean f93219m;

    /* renamed from: n */
    private ScrollViewWithEvents f93220n;

    /* renamed from: o */
    private ViewGroup f93221o;

    /* renamed from: p */
    private avic f93222p;

    /* renamed from: q */
    private avgt f93223q;

    /* renamed from: r */
    private int f93224r;

    /* renamed from: a */
    private final int m78552a(int i) {
        Resources resources = getResources();
        int color = resources.getColor(C0126R.color.udc_title_text_light);
        int color2 = resources.getColor(C0126R.color.udc_title_text_dark);
        double a = chay.f188218a.mo6606a().mo84892a();
        double a2 = avgs.m78488a(i);
        double a3 = avgs.m78487a(avgs.m78488a(color), a2);
        return (a3 >= a || avgs.m78487a(avgs.m78488a(color2), a2) <= a3) ? color : color2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo51250a() {
        return C0126R.C0128layout.udc_consent_fragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo51258c() {
        if (this.f93206k || this.f93220n.mo17935a()) {
            super.mo51258c();
            return;
        }
        this.f93204i.mo51291a(this.f93205j);
        this.f93220n.pageScroll(130);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        avic avic = this.f93222p;
        if (avic != null) {
            View view = avic.f93211c;
            if (view != null) {
                view.clearAnimation();
            }
            View view2 = avic.f93212d;
            if (view2 != null) {
                view2.clearAnimation();
            }
            View view3 = avic.f93209a;
            if (view3 != null) {
                view3.clearAnimation();
            }
            View view4 = avic.f93210b;
            if (view4 != null) {
                view4.clearAnimation();
            }
        }
    }

    public final void onGlobalLayout() {
        int i;
        int i2;
        int i3;
        int i4;
        avgt avgt = this.f93223q;
        boolean z = false;
        if (avgt != null) {
            if (chay.f188218a.mo6606a().mo84897f()) {
                View findViewById = avgt.f93155b.findViewById(C0126R.C0129id.udc_consent_header);
                if (findViewById == null) {
                    bnsl bnsl = (bnsl) avgt.f93154a.mo68387b();
                    bnsl.mo68432a("avgt", "b", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Cannot find headerView.");
                } else {
                    int c = avgt.mo51213c();
                    if (avgt.f93156c != null) {
                        i3 = avgt.mo51210a((TextView) findViewById.findViewById(C0126R.C0129id.header), c);
                        i4 = avgy.m78500a(c - i3, avgt.f93156c.doubleValue(), avgt.f93155b.getWidth());
                        ImageView imageView = (ImageView) findViewById.findViewById(C0126R.C0129id.illustration);
                        if (imageView == null) {
                            bnsl bnsl2 = (bnsl) avgt.f93154a.mo68387b();
                            bnsl2.mo68432a("avgt", "b", 138, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("Cannot find illustrationView.");
                        } else if (i4 != 0) {
                            if (!(imageView.getVisibility() == 0 && imageView.getMaxHeight() == i4)) {
                                imageView.setVisibility(0);
                                imageView.setMaxHeight(i4);
                            }
                        } else if (imageView.getVisibility() != 8) {
                            imageView.setVisibility(8);
                        }
                    } else {
                        i4 = 0;
                        i3 = 0;
                    }
                    if (i4 > 0) {
                        c = i4 + i3;
                    }
                    if (findViewById.getMinimumHeight() != c) {
                        findViewById.setMinimumHeight(c);
                        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                        layoutParams.height = c;
                        findViewById.setLayoutParams(layoutParams);
                    }
                }
            } else {
                View findViewById2 = avgt.f93155b.findViewById(C0126R.C0129id.udc_consent_header);
                if (findViewById2 == null) {
                    bnsl bnsl3 = (bnsl) avgt.f93154a.mo68387b();
                    bnsl3.mo68432a("avgt", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Cannot find headerView.");
                } else {
                    int c2 = avgt.mo51213c();
                    if (avgt.f93156c != null) {
                        i = avgt.mo51210a((TextView) findViewById2.findViewById(C0126R.C0129id.header), c2);
                        i2 = avgy.m78500a(c2 - i, avgt.f93156c.doubleValue(), avgt.f93155b.getWidth());
                        ImageView imageView2 = (ImageView) findViewById2.findViewById(C0126R.C0129id.illustration);
                        if (imageView2 == null) {
                            bnsl bnsl4 = (bnsl) avgt.f93154a.mo68387b();
                            bnsl4.mo68432a("avgt", "a", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl4.mo68405a("Cannot find illustrationView.");
                        } else if (i2 != 0) {
                            imageView2.setMaxHeight(i2);
                            if (imageView2.getVisibility() != 0) {
                                imageView2.setVisibility(0);
                            }
                        } else if (imageView2.getVisibility() != 8) {
                            imageView2.setVisibility(8);
                        }
                    } else {
                        i2 = 0;
                        i = 0;
                    }
                    if (i2 > 0) {
                        c2 = i2 + i;
                    }
                    ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                    if (layoutParams2.height != c2) {
                        findViewById2.setMinimumHeight(c2);
                        layoutParams2.height = c2;
                        findViewById2.setLayoutParams(layoutParams2);
                    }
                }
            }
        }
        avic avic = this.f93222p;
        if (avic != null) {
            if (avic.mo51260a()) {
                avic.m78547a(avic.f93211c, 0);
                avic.m78547a(avic.f93212d, 0);
                avic.m78547a(avic.f93209a, 4);
                avic.m78547a(avic.f93210b, 4);
            } else {
                avic.m78547a(avic.f93211c, 4);
                avic.m78547a(avic.f93212d, 4);
                avic.m78547a(avic.f93209a, 0);
                avic.m78547a(avic.f93210b, 0);
            }
        }
        ScrollViewWithEvents scrollViewWithEvents = this.f93220n;
        if (scrollViewWithEvents != null) {
            if (this.f93206k || scrollViewWithEvents.mo17935a()) {
                z = true;
            }
            m78555a(z);
        }
    }

    /* renamed from: a */
    private final C1240of m78553a(bxru bxru) {
        int color = getResources().getColor(C0126R.color.udc_header_default_background);
        bxsk bxsk = bxru.f164616e;
        if (bxsk == null) {
            bxsk = bxsk.f164695d;
        }
        if (!avih.m78576a(bxsk)) {
            try {
                color = Color.parseColor(bxsk.f164699c);
            } catch (IllegalArgumentException e) {
            }
            return new C1240of(Integer.valueOf(color), bxsk);
        }
        bxsk = null;
        return new C1240of(Integer.valueOf(color), bxsk);
    }

    /* renamed from: a */
    private final void m78554a(View view, C1240of ofVar) {
        if (view != null) {
            view.setBackgroundColor(((Integer) ofVar.f26798a).intValue());
            this.f93198c.mo51267b((bxsk) ofVar.f26799b);
        }
    }

    /* renamed from: a */
    private final void m78555a(boolean z) {
        TextView textView;
        int i;
        if (getActivity() != null && (textView = (TextView) getActivity().findViewById(C0126R.C0129id.action_button_positive)) != null) {
            Resources resources = getResources();
            if (!z) {
                i = C0126R.color.udc_button_default;
            } else {
                i = C0126R.color.udc_button_highlight;
            }
            textView.setTextColor(resources.getColor(i));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
     arg types: [?, android.util.TypedValue, int]
     candidates:
      ClspMth{android.content.res.Resources.getValue(java.lang.String, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException}
      ClspMth{android.content.res.Resources.getValue(int, android.util.TypedValue, boolean):void throws android.content.res.Resources$NotFoundException} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51252a(ViewGroup viewGroup, LayoutInflater layoutInflater, ConsentFlowConfig consentFlowConfig, bxru bxru) {
        View view;
        Double d;
        bxsk bxsk;
        int identifier;
        ViewGroup viewGroup2 = viewGroup;
        LayoutInflater layoutInflater2 = layoutInflater;
        bxru bxru2 = bxru;
        ScrollViewWithEvents scrollViewWithEvents = (ScrollViewWithEvents) viewGroup2.findViewById(C0126R.C0129id.udc_consent_scroll_view);
        this.f93220n = scrollViewWithEvents;
        scrollViewWithEvents.f30408a = this;
        scrollViewWithEvents.getViewTreeObserver().addOnGlobalLayoutListener(this);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(C0126R.C0129id.udc_consent_container);
        mo51251a(viewGroup3);
        avhb avhb = new avhb(layoutInflater2, viewGroup3);
        this.f93219m = consentFlowConfig.f109333c;
        this.f93221o = (ViewGroup) viewGroup2.findViewById(C0126R.C0129id.udc_consent_toolbar_container);
        int i = Build.VERSION.SDK_INT;
        boolean z = !sre.m36081a(getResources());
        if (z) {
            mo51256b();
        }
        bxsk bxsk2 = bxru2.f164617f;
        if (bxsk2 == null) {
            bxsk2 = bxsk.f164695d;
        }
        if (!avih.m78576a(bxsk2)) {
            Toolbar toolbar = (Toolbar) this.f93221o.findViewById(C0126R.C0129id.udc_consent_toolbar);
            toolbar.mo1679a(this.f93202g);
            C1240of a = m78553a(bxru2);
            m78554a(toolbar, a);
            toolbar.mo1680b(m78552a(((Integer) a.f26798a).intValue()));
            this.f93224r = (!z || (identifier = getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) ? 0 : getResources().getDimensionPixelSize(identifier);
            toolbar.setPadding(toolbar.getPaddingLeft(), toolbar.getPaddingTop() + this.f93224r, toolbar.getPaddingRight(), toolbar.getPaddingBottom());
        }
        if (this.f93219m) {
            Toolbar toolbar2 = (Toolbar) this.f93221o.findViewById(C0126R.C0129id.udc_consent_toolbar);
            toolbar2.setVisibility(0);
            View findViewById = this.f93221o.findViewById(C0126R.C0129id.udc_consent_toolbar_shadow);
            findViewById.setVisibility(0);
            if (toolbar2 != null) {
                toolbar2.setAlpha(1.0f);
            }
            if (findViewById != null) {
                findViewById.setAlpha(1.0f);
            }
            if (!TextUtils.isEmpty(this.f93202g)) {
                avih avih = this.f93198c;
                if ((bxru2.f164612a & 128) != 0) {
                    bxsk = bxru2.f164617f;
                    if (bxsk == null) {
                        bxsk = bxsk.f164695d;
                    }
                } else {
                    bxsk = null;
                }
                avih.mo51267b(bxsk);
            }
            View findViewById2 = viewGroup2.findViewById(C0126R.C0129id.udc_consent_content);
            int paddingTop = findViewById2.getPaddingTop();
            int dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.udc_consent_toolbar_height);
            int i2 = Build.VERSION.SDK_INT;
            findViewById2.setPadding(findViewById2.getPaddingLeft(), paddingTop + dimensionPixelSize + this.f93224r, findViewById2.getRight(), findViewById2.getPaddingBottom());
        } else {
            ViewGroup viewGroup4 = (ViewGroup) avhb.mo51218a(C0126R.C0128layout.udc_consent_header);
            if (viewGroup4 != null) {
                C1240of a2 = m78553a(bxru2);
                m78554a(viewGroup4, a2);
                avhb avhb2 = new avhb(layoutInflater2, viewGroup4);
                if ((bxru2.f164612a & 16) != 0) {
                    ImageView imageView = (ImageView) avhb2.mo51218a(C0126R.C0128layout.udc_consent_header_illustration);
                    avih avih2 = this.f93198c;
                    bxsc bxsc = bxru2.f164615d;
                    if (bxsc == null) {
                        bxsc = bxsc.f164659d;
                    }
                    avih2.mo51263a(imageView, (int) C0126R.C0129id.illustration, bxsc, this.f93196a);
                    bxsc bxsc2 = bxru2.f164615d;
                    if (bxsc2 == null) {
                        bxsc2 = bxsc.f164659d;
                    }
                    d = Double.valueOf(avgy.m78499a(bxsc2.f164663c));
                } else {
                    d = null;
                }
                TextView textView = (TextView) avhb2.mo51218a(C0126R.C0128layout.udc_consent_header_title);
                avih avih3 = this.f93198c;
                bxsk bxsk3 = bxru2.f164617f;
                if (bxsk3 == null) {
                    bxsk3 = bxsk.f164695d;
                }
                avih3.mo51262a(textView, (int) C0126R.C0129id.header, bxsk3);
                textView.setTextColor(m78552a(((Integer) a2.f26798a).intValue()));
                avic avic = new avic(this.f93220n, this.f93221o);
                this.f93222p = avic;
                this.f93220n.f30409b = avic;
                TypedValue typedValue = new TypedValue();
                getResources().getValue((int) C0126R.dimen.udc_consent_header_fraction, typedValue, true);
                this.f93223q = new avgt(viewGroup2, (double) typedValue.getFloat(), d);
            }
        }
        avhb.mo51218a(C0126R.C0128layout.udc_consent_spacer);
        if ((bxru2.f164612a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            View a3 = avhb.mo51218a(C0126R.C0128layout.udc_consent_product_statement);
            avih avih4 = this.f93198c;
            bxsk bxsk4 = bxru2.f164618g;
            if (bxsk4 == null) {
                bxsk4 = bxsk.f164695d;
            }
            avih4.mo51264a(a3, bxsk4, this.f93197b);
        }
        if ((bxru2.f164612a & 512) != 0) {
            View a4 = avhb.mo51218a(C0126R.C0128layout.udc_consent_identity);
            avih avih5 = this.f93198c;
            bxsk bxsk5 = bxru2.f164619h;
            if (bxsk5 == null) {
                bxsk5 = bxsk.f164695d;
            }
            avih5.mo51262a(a4, (int) C0126R.C0129id.header, bxsk5);
            avhb.mo51218a(C0126R.C0128layout.udc_consent_separator);
        }
        boolean a5 = mo51255a(layoutInflater, avhb, bxru, consentFlowConfig, C0126R.C0128layout.udc_consent_setting);
        bxwc bxwc = bxru2.f164621j;
        int size = bxwc.size();
        boolean z2 = true;
        for (int i3 = 0; i3 < size; i3++) {
            bxsk bxsk6 = (bxsk) bxwc.get(i3);
            if (!avih.m78576a(bxsk6)) {
                if (z2) {
                    if (!a5) {
                        if (avhb.f93173a.getChildCount() != 0) {
                            ViewGroup viewGroup5 = avhb.f93173a;
                            view = viewGroup5.getChildAt(viewGroup5.getChildCount() - 1);
                        } else {
                            view = null;
                        }
                        if (view == null || view.getId() != C0126R.C0129id.udc_consent_spacer) {
                            avhb.mo51219a();
                        }
                        a5 = true;
                    } else {
                        mo51253a(avhb, true, true);
                        a5 = true;
                    }
                }
                this.f93198c.mo51264a(avhb.mo51218a(C0126R.C0128layout.udc_consent_text), bxsk6, this.f93197b);
                z2 = false;
            }
        }
        bxsk bxsk7 = bxru2.f164622k;
        if (bxsk7 == null) {
            bxsk7 = bxsk.f164695d;
        }
        if (!avih.m78576a(bxsk7)) {
            mo51253a(avhb, a5, true);
            View a6 = avhb.mo51218a(C0126R.C0128layout.udc_consent_footer);
            avih avih6 = this.f93198c;
            bxsk bxsk8 = bxru2.f164622k;
            if (bxsk8 == null) {
                bxsk8 = bxsk.f164695d;
            }
            avih6.mo51264a(a6, bxsk8, this.f93197b);
        }
    }

    /* renamed from: a */
    public final void mo26132a(ScrollView scrollView, boolean z) {
        super.mo26132a(scrollView, z);
        if (z) {
            m78555a(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51253a(avhb avhb, boolean z, boolean z2) {
        if (z) {
            avhb.mo51218a(C0126R.C0128layout.udc_consent_separator);
            if (z2) {
                avhb.mo51219a();
            }
        }
    }
}
