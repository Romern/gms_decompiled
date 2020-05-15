package com.google.android.gms.wallet.p088ui.component.pageheader;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;

/* renamed from: com.google.android.gms.wallet.ui.component.pageheader.PageHeaderView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PageHeaderView extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    public awym f110581a;

    /* renamed from: b */
    public ImageWithCaptionView f110582b;

    /* renamed from: c */
    public ImageWithCaptionView f110583c;

    /* renamed from: d */
    public final int[] f110584d = new int[2];

    /* renamed from: e */
    public final int[] f110585e = new int[2];

    /* renamed from: f */
    private RelativeLayout f110586f;

    public PageHeaderView(Context context) {
        super(context);
    }

    /* renamed from: b */
    public static String m94278b(bmjt bmjt) {
        if ((bmjt.f129734a & 4) == 0) {
            return bmjt.f129738e;
        }
        bmnr bmnr = bmjt.f129737d;
        if (bmnr == null) {
            bmnr = bmnr.f130153o;
        }
        return bmnr.f130159e;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.wallet.ui.component.pageheader.PageHeaderView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo60126a() {
        LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.wallet_view_top_image_header, (ViewGroup) this, true);
    }

    public final void onScrollChanged() {
        this.f110582b.getLocationOnScreen(this.f110585e);
        int[] iArr = this.f110584d;
        if (iArr[0] == 0) {
            this.f110583c.getLocationOnScreen(iArr);
        }
        this.f110583c.setTranslationY((float) Math.max(0, this.f110585e[1] - this.f110584d[1]));
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        bkfr.m105608d(this, z);
    }

    /* renamed from: a */
    public final void mo60127a(bmjt bmjt) {
        mo60128a(bmjt, true, true);
    }

    /* renamed from: b */
    private final void m94279b(bmjt bmjt, boolean z, boolean z2) {
        bmnr bmnr;
        setVisibility(0);
        mo60126a();
        this.f110582b = (ImageWithCaptionView) findViewById(C0126R.C0129id.header_image);
        if ((bmjt.f129734a & 32) != 0) {
            ImageWithCaptionView imageWithCaptionView = this.f110582b;
            bmno bmno = bmjt.f129740g;
            if (bmno == null) {
                bmno = bmno.f130138m;
            }
            imageWithCaptionView.mo71992a(bmno, awia.m79973a(), ((Boolean) awir.f94488a.mo58455c()).booleanValue());
        } else {
            this.f110582b.setVisibility(8);
        }
        InfoMessageView infoMessageView = (InfoMessageView) findViewById(C0126R.C0129id.header_title_message);
        TextView textView = (TextView) findViewById(C0126R.C0129id.header_title);
        bmnr bmnr2 = null;
        if (z) {
            if ((bmjt.f129734a & 4) != 0) {
                bmnr = bmjt.f129737d;
                if (bmnr == null) {
                    bmnr = bmnr.f130153o;
                }
            } else {
                bmnr = null;
            }
            infoMessageView.mo72006b(bmnr);
            bkfr.m105573a(textView, bmjt.f129738e);
        } else {
            infoMessageView.setVisibility(8);
            textView.setVisibility(8);
        }
        InfoMessageView infoMessageView2 = (InfoMessageView) findViewById(C0126R.C0129id.header_subtitle);
        InfoMessageView infoMessageView3 = (InfoMessageView) findViewById(C0126R.C0129id.top_header_subtitle);
        if (!z) {
            if ((bmjt.f129734a & 16) != 0 && (bmnr2 = bmjt.f129739f) == null) {
                bmnr2 = bmnr.f130153o;
            }
            infoMessageView3.mo72006b(bmnr2);
            infoMessageView2.setVisibility(8);
        } else {
            if ((bmjt.f129734a & 16) != 0 && (bmnr2 = bmjt.f129739f) == null) {
                bmnr2 = bmnr.f130153o;
            }
            infoMessageView2.mo72006b(bmnr2);
            if ((bmjt.f129734a & 16) != 0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) infoMessageView2.getLayoutParams();
                int dimension = (int) getResources().getDimension(C0126R.dimen.wallet_top_image_page_header_subtitle_top_bottom_margin);
                int dimension2 = (int) getResources().getDimension(C0126R.dimen.wallet_top_image_page_header_small_top_bottom_margin);
                bmnr bmnr3 = bmjt.f129739f;
                if (bmnr3 == null) {
                    bmnr3 = bmnr.f130153o;
                }
                int a = bmoj.m108229a(bmnr3.f130168n);
                if (a != 0 && a == 4) {
                    layoutParams.topMargin = dimension2;
                    layoutParams.bottomMargin = dimension;
                } else {
                    layoutParams.topMargin = dimension;
                    layoutParams.bottomMargin = dimension2;
                }
                infoMessageView2.setLayoutParams(layoutParams);
            }
            infoMessageView3.setVisibility(8);
        }
        View findViewById = findViewById(C0126R.C0129id.im_header_separator);
        int a2 = bmjs.m108099a(bmjt.f129741h);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 1) {
            findViewById.setVisibility(0);
        } else if (i == 2) {
            findViewById.setVisibility(8);
        } else if (!z2) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo60128a(bmjt bmjt, boolean z, boolean z2) {
        int i;
        removeAllViews();
        int a = bmjq.m108097a(bmjt.f129736c);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 0 || i2 == 1) {
            setVisibility(8);
            this.f110581a.mo51888o(true);
            this.f110581a.setTitle(m94278b(bmjt));
        } else if (i2 != 2) {
            this.f110581a.mo51888o(true);
            bmno bmno = null;
            this.f110581a.setTitle(null);
            m94279b(bmjt, z, z2);
            if (this.f110582b.getVisibility() == 0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f110582b.getLayoutParams();
                layoutParams.topMargin = 0;
                this.f110582b.setLayoutParams(layoutParams);
            }
            if (bmjt.f129742i.size() > 0 && ((bmjo) bmjt.f129731j.mo14948a(Integer.valueOf(bmjt.f129742i.mo74151b(0)))) == bmjo.SCROLL_IMAGE_INTO_ACTION_BAR) {
                RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.wallet_view_action_bar_with_image, (ViewGroup) null);
                this.f110586f = relativeLayout;
                ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) relativeLayout.findViewById(C0126R.C0129id.image);
                this.f110583c = imageWithCaptionView;
                if ((bmjt.f129734a & 32) != 0 && (bmno = bmjt.f129740g) == null) {
                    bmno = bmno.f130138m;
                }
                imageWithCaptionView.mo71992a(bmno, awia.m79973a(), ((Boolean) awir.f94488a.mo58455c()).booleanValue());
                this.f110581a.mo51892s();
                TypedValue typedValue = new TypedValue();
                if (getContext().getTheme().resolveAttribute(16843499, typedValue, true)) {
                    i = TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
                } else {
                    i = getResources().getDimensionPixelSize(C0126R.dimen.wallet_action_bar_default_height);
                }
                this.f110581a.mo51865a(this.f110586f, new C1339rx(-1, i));
                this.f110583c.post(new axbx(this));
                getViewTreeObserver().addOnScrollChangedListener(this);
            }
        } else {
            this.f110581a.mo51888o(false);
            m94279b(bmjt, z, z2);
        }
    }

    public PageHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PageHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PageHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
