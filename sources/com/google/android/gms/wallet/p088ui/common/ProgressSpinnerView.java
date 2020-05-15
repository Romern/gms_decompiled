package com.google.android.gms.wallet.p088ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.common.p079ui.IndeterminateMultiColorSpinner;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;

/* renamed from: com.google.android.gms.wallet.ui.common.ProgressSpinnerView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ProgressSpinnerView extends LinearLayout implements awib, awgb {

    /* renamed from: a */
    View f110470a;

    /* renamed from: b */
    View f110471b;

    /* renamed from: c */
    ImageView f110472c;

    /* renamed from: d */
    InfoMessageView f110473d;

    /* renamed from: e */
    TextView f110474e;

    /* renamed from: f */
    bmoc f110475f;

    /* renamed from: g */
    public final Handler f110476g = new adzt();

    /* renamed from: h */
    public aun f110477h;

    /* renamed from: i */
    boolean f110478i;

    /* renamed from: j */
    bmon f110479j;

    /* renamed from: k */
    private int f110480k;

    public ProgressSpinnerView(Context context) {
        super(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.ImageWithCaptionView.a(android.content.Context, android.widget.ImageView, bmno, boolean):void
     arg types: [android.content.Context, android.widget.ImageView, bmno, int]
     candidates:
      com.google.android.wallet.ui.common.ImageWithCaptionView.a(bmno, com.android.volley.toolbox.ImageLoader, boolean, com.google.android.wallet.clientlog.LogContext):void
      com.google.android.wallet.ui.common.FifeNetworkImageView.a(java.lang.String, com.android.volley.toolbox.ImageLoader, boolean, java.util.List):void
      com.google.android.wallet.ui.common.ImageWithCaptionView.a(android.content.Context, android.widget.ImageView, bmno, boolean):void */
    /* renamed from: a */
    private final void m94206a(bmno bmno, auh auh) {
        if (bmno != null && !bmno.equals(bmno.f130138m)) {
            this.f110470a.setVisibility(8);
            this.f110471b.setVisibility(0);
            this.f110472c.setContentDescription(bmno.f130149j);
            aun a = aun.m2131a(getContext(), bkfr.m105586b(getContext(), bmno.f130142c));
            this.f110477h = a;
            this.f110472c.setImageDrawable(a);
            ImageWithCaptionView.m118569a(getContext(), this.f110472c, bmno, false);
            this.f110477h.mo2540a(auh);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.a(android.view.View, boolean):void
     arg types: [com.google.android.wallet.ui.common.InfoMessageView, int]
     candidates:
      bkfr.a(android.content.Context, int):int
      bkfr.a(android.view.View, android.view.View):int
      bkfr.a(android.content.Context, java.lang.String):android.content.Intent
      bkfr.a(android.content.res.Resources, java.util.List):java.lang.String
      bkfr.a(java.lang.String, java.lang.String):java.lang.String
      bkfr.a(android.content.Context, android.view.View):void
      bkfr.a(android.content.Context, android.widget.Button):void
      bkfr.a(android.view.View, int):void
      bkfr.a(android.view.View, android.util.TypedValue):void
      bkfr.a(android.view.View, java.lang.CharSequence):void
      bkfr.a(android.view.ViewGroup, int):void
      bkfr.a(android.view.ViewGroup, boolean):void
      bkfr.a(android.widget.ImageView, android.content.res.ColorStateList):void
      bkfr.a(android.widget.TextView, java.lang.String):void
      bkfr.a(android.widget.TextView, boolean):void
      bkfr.a(boolean, java.lang.Object):void
      bkfr.a(android.content.Context, bmap):boolean
      bkfr.a(android.content.Context, int[]):boolean
      bkfr.a(com.google.android.chimera.Activity, android.widget.TextView):boolean
      bkfr.a(android.view.View, boolean):void */
    /* renamed from: b */
    private final void m94207b() {
        if (this.f110480k < this.f110479j.f130244a.size()) {
            bmon bmon = this.f110479j;
            bmom bmom = (bmom) bmon.f130244a.get(this.f110480k);
            InfoMessageView infoMessageView = this.f110473d;
            bmnr bmnr = bmom.f130239a;
            if (bmnr == null) {
                bmnr = bmnr.f130153o;
            }
            infoMessageView.mo72003a(bmnr);
            bkfr.m105568a((View) this.f110473d, true);
            if (bmom.f130240b > 0) {
                this.f110476g.postDelayed(awgc.m79888a(this, "handleTextAppearingAnimationEnd"), (long) bmom.f130240b);
            }
        }
    }

    /* renamed from: c */
    private final void m94208c() {
        this.f110476g.removeCallbacksAndMessages(null);
        this.f110470a.setVisibility(0);
        this.f110471b.setVisibility(8);
        aun aun = this.f110477h;
        if (aun != null) {
            aun.mo2526a();
            if (this.f110477h.isRunning()) {
                this.f110477h.stop();
            }
            this.f110477h = null;
        }
        m94209d();
        this.f110479j = null;
    }

    /* renamed from: d */
    private final void m94209d() {
        this.f110473d.clearAnimation();
        if (this.f110473d.animate() != null) {
            this.f110473d.animate().setListener(null);
        }
        this.f110473d.setVisibility(4);
    }

    /* renamed from: g */
    public final boolean mo51880g() {
        return getVisibility() == 0;
    }

    /* renamed from: h */
    public final void mo52066h(Bundle bundle) {
        if ("handleTextAppearingAnimationEnd".equals(awgc.m79889a(bundle))) {
            bkfr.m105565a(this.f110473d, 0, 0, 4, awgc.m79888a(this, "handleTextDisappearingAnimationEnd"));
        } else if ("handleTextDisappearingAnimationEnd".equals(awgc.m79889a(bundle))) {
            this.f110480k++;
            m94207b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(8);
        this.f110470a = findViewById(C0126R.C0129id.default_spinner);
        this.f110471b = findViewById(C0126R.C0129id.animation_spinner);
        this.f110472c = (ImageView) findViewById(C0126R.C0129id.animation_spinner_image);
        this.f110473d = (InfoMessageView) findViewById(C0126R.C0129id.progress_text_animation);
        this.f110474e = (TextView) findViewById(C0126R.C0129id.progress_spinner_caption);
        if (awia.m79985a(getContext())) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16842801, C0126R.attr.internalUicIconDefaultColor});
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int color = obtainStyledAttributes.getColor(1, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1) {
                setBackgroundColor(getResources().getColor(resourceId));
            }
            if (color != -1) {
                ((IndeterminateMultiColorSpinner) this.f110470a).mo59865a(color);
            }
        }
    }

    public ProgressSpinnerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProgressSpinnerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo60071a() {
        this.f110478i = false;
        m94208c();
        mo51872b(false);
        bmoc bmoc = this.f110475f;
        if (bmoc != null) {
            bmno bmno = bmoc.f130211b;
            if (bmno == null) {
                bmno = bmno.f130138m;
            }
            m94206a(bmno, new awzo(this));
        }
    }

    /* renamed from: b */
    public final void mo51871b(Bundle bundle) {
        mo51872b(bundle.getBoolean("shouldShowProgressSpinner", false));
        boolean z = bundle.getBoolean("completedAnimationRunning");
        this.f110478i = z;
        if (z) {
            mo60071a();
        }
    }

    /* renamed from: b */
    public final void mo51872b(boolean z) {
        int i;
        if (!z) {
            i = 8;
        } else {
            i = 0;
        }
        if (getVisibility() != i && !this.f110478i) {
            awia.m79996b(this, z);
            setVisibility(i);
        }
        if (this.f110477h != null) {
            if (mo51880g() && !this.f110477h.isRunning()) {
                this.f110477h.start();
            } else if (!mo51880g() && this.f110477h.isRunning()) {
                this.f110477h.mo2526a();
                this.f110477h.stop();
            }
        }
        if (this.f110479j == null) {
            return;
        }
        if (z) {
            this.f110480k = 0;
            m94207b();
            return;
        }
        m94209d();
    }

    /* renamed from: a */
    public final void mo51861a(Bundle bundle) {
        bundle.putBoolean("shouldShowProgressSpinner", mo51880g());
        bundle.putBoolean("completedAnimationRunning", this.f110478i);
        m94208c();
    }

    /* renamed from: a */
    public final void mo51867a(bmoc bmoc, boolean z) {
        this.f110475f = bmoc;
        m94208c();
        if (bmoc != null && bkfr.m105612e(getContext())) {
            int i = bmoc.f130210a;
            if ((i & 4) != 0 && z) {
                bmno bmno = bmoc.f130213d;
                if (bmno == null) {
                    bmno = bmno.f130138m;
                }
                m94206a(bmno, new awzl(this));
                this.f110478i = true;
                this.f110477h.start();
            } else if ((i & 1) != 0) {
                bmno bmno2 = bmoc.f130211b;
                if (bmno2 == null) {
                    bmno2 = bmno.f130138m;
                }
                m94206a(bmno2, new awzo(this));
            }
            bmon bmon = bmoc.f130212c;
            if (bmon == null) {
                bmon = bmon.f130242b;
            }
            if (bmon.f130244a.size() > 0) {
                bmon bmon2 = bmoc.f130212c;
                if (bmon2 == null) {
                    bmon2 = bmon.f130242b;
                }
                this.f110479j = bmon2;
            }
        }
    }

    /* renamed from: a */
    public final void mo51868a(String str) {
        bkfr.m105573a(this.f110474e, str);
    }
}
