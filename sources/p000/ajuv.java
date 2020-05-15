package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.List;

/* renamed from: ajuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajuv extends ajuj {

    /* renamed from: A */
    private final ImageView f71325A;

    /* renamed from: B */
    private final Drawable f71326B;

    /* renamed from: C */
    private final Drawable f71327C;

    /* renamed from: D */
    private final Drawable f71328D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public Animator f71329E;

    /* renamed from: s */
    public final View f71330s;

    /* renamed from: t */
    public final ImageView f71331t;

    /* renamed from: u */
    public final ProgressBar f71332u;

    /* renamed from: v */
    public final ajwt f71333v;

    /* renamed from: w */
    final /* synthetic */ ajuw f71334w;

    /* renamed from: x */
    private final TextView f71335x;

    /* renamed from: y */
    private final TextView f71336y;

    /* renamed from: z */
    private final TextView f71337z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajuv(ajuw ajuw, View view) {
        super(view);
        this.f71334w = ajuw;
        this.f71330s = view.findViewById(C0126R.C0129id.root);
        this.f71335x = (TextView) view.findViewById(C0126R.C0129id.header);
        this.f71336y = (TextView) view.findViewById(C0126R.C0129id.title);
        this.f71337z = (TextView) view.findViewById(C0126R.C0129id.description);
        this.f71331t = (ImageView) view.findViewById(C0126R.C0129id.profile_image);
        this.f71332u = (ProgressBar) view.findViewById(C0126R.C0129id.progress_bar);
        this.f71325A = (ImageView) view.findViewById(C0126R.C0129id.badge);
        this.f71333v = new ajwt(((ajuk) ajuw).f71297a);
        this.f71326B = C1133kh.m17836a(((ajuk) ajuw).f71297a, (int) C0126R.C0127drawable.sharing_progress_sending);
        this.f71327C = C1133kh.m17836a(((ajuk) ajuw).f71297a, (int) C0126R.C0127drawable.sharing_progress_complete);
        this.f71328D = C1133kh.m17836a(((ajuk) ajuw).f71297a, (int) C0126R.C0127drawable.sharing_progress_failed);
    }

    /* renamed from: a */
    private final void m59057a(float f) {
        ProgressBar progressBar = this.f71332u;
        if (progressBar != null) {
            int i = (int) (f * 100.0f);
            progressBar.setProgress(i);
            this.f71332u.setTag(C0126R.C0129id.progress_bar, Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    private static final void m59065b(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: c */
    private final void m59066c(Drawable drawable) {
        ProgressBar progressBar = this.f71332u;
        if (progressBar != null) {
            Rect bounds = progressBar.getIndeterminateDrawable().getBounds();
            this.f71332u.setIndeterminateDrawable(drawable);
            drawable.setBounds(bounds);
        }
    }

    /* renamed from: d */
    private final void m59067d(Drawable drawable) {
        ProgressBar progressBar;
        if (this.f71329E == null && (progressBar = this.f71332u) != null) {
            if (!progressBar.isIndeterminate()) {
                mo38944a(drawable);
                return;
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f71333v, "realLevel", 8000, 10000);
            this.f71329E = ofInt;
            ofInt.addListener(new ajus(this, drawable));
            this.f71329E.setDuration(300);
            this.f71329E.setInterpolator(new LinearInterpolator());
            this.f71329E.start();
        }
    }

    /* renamed from: e */
    private final void m59068e(Drawable drawable) {
        Animator animator = this.f71329E;
        if (animator != null) {
            animator.cancel();
        }
        ProgressBar progressBar = this.f71332u;
        if (progressBar == null) {
            return;
        }
        if (progressBar.getProgress() == this.f71332u.getMax()) {
            mo38945b(drawable);
            return;
        }
        ProgressBar progressBar2 = this.f71332u;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar2, "progress", progressBar2.getProgress(), this.f71332u.getMax());
        this.f71329E = ofInt;
        ofInt.setDuration((long) (((this.f71332u.getMax() - this.f71332u.getProgress()) * 450) / this.f71332u.getMax()));
        this.f71329E.setInterpolator(new LinearInterpolator());
        this.f71329E.addListener(new ajut(this, drawable));
        this.f71329E.start();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ajuv.a(android.view.View, float):void
     arg types: [android.widget.ProgressBar, int]
     candidates:
      ajuv.a(android.content.Context, java.lang.String):void
      ajuv.a(android.view.View, int):void
      ajuv.a(android.widget.ImageView, int):void
      ajuv.a(android.widget.TextView, java.lang.CharSequence):void
      ajuv.a(android.content.Context, java.lang.Object):void
      ajuj.a(android.content.Context, java.lang.Object):void
      acm.a(int, int):void
      acm.a(int, boolean):void
      acm.a(acc, boolean):void
      ajuv.a(android.view.View, float):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ajuv.a(android.view.View, int):void
     arg types: [android.widget.ImageView, ?]
     candidates:
      ajuv.a(android.content.Context, java.lang.String):void
      ajuv.a(android.view.View, float):void
      ajuv.a(android.widget.ImageView, int):void
      ajuv.a(android.widget.TextView, java.lang.CharSequence):void
      ajuv.a(android.content.Context, java.lang.Object):void
      ajuj.a(android.content.Context, java.lang.Object):void
      acm.a(int, int):void
      acm.a(int, boolean):void
      acm.a(acc, boolean):void
      ajuv.a(android.view.View, int):void */
    /* renamed from: v */
    private final void m59069v() {
        m59061a((View) this.f71332u, 1.0f);
        mo38944a(this.f71328D);
        m59067d(this.f71328D);
        m59062a((View) this.f71325A, (int) C0126R.C0127drawable.sharing_bg_badge_error);
        m59063a(this.f71325A, (int) C0126R.C0127drawable.quantum_gm_ic_priority_high_vd_theme_24);
        m59068e(this.f71328D);
    }

    /* renamed from: b */
    public final void mo38945b(Drawable drawable) {
        ImageView imageView = this.f71325A;
        if (imageView != null && imageView.getVisibility() != 0) {
            this.f71325A.animate().cancel();
            this.f71325A.setVisibility(0);
            this.f71325A.setScaleX(0.0f);
            this.f71325A.setScaleY(0.0f);
            this.f71325A.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator()).setUpdateListener(new ajuu(this, drawable));
        }
    }

    /* renamed from: a */
    private final void m59059a(Context context, String str) {
        if (!bmxx.m108577a(str)) {
            m59064a(this.f71337z, context.getString(C0126R.string.sharing_notification_confirm_token, str));
            m59065b(this.f71337z, 0);
        }
    }

    /* renamed from: a */
    private static final void m59060a(View view) {
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: a */
    private static final void m59061a(View view, float f) {
        if (view != null) {
            view.setAlpha(f);
        }
    }

    /* renamed from: a */
    private static final void m59062a(View view, int i) {
        if (view != null) {
            view.setBackgroundResource(i);
        }
    }

    /* renamed from: a */
    private static final void m59063a(ImageView imageView, int i) {
        if (imageView != null) {
            imageView.setImageResource(i);
        }
    }

    /* renamed from: a */
    private static final void m59064a(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ajuv.a(android.view.View, float):void
     arg types: [android.widget.ProgressBar, int]
     candidates:
      ajuv.a(android.content.Context, java.lang.String):void
      ajuv.a(android.view.View, int):void
      ajuv.a(android.widget.ImageView, int):void
      ajuv.a(android.widget.TextView, java.lang.CharSequence):void
      ajuv.a(android.content.Context, java.lang.Object):void
      ajuj.a(android.content.Context, java.lang.Object):void
      acm.a(int, int):void
      acm.a(int, boolean):void
      acm.a(acc, boolean):void
      ajuv.a(android.view.View, float):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ajuv.a(android.view.View, int):void
     arg types: [android.widget.ImageView, ?]
     candidates:
      ajuv.a(android.content.Context, java.lang.String):void
      ajuv.a(android.view.View, float):void
      ajuv.a(android.widget.ImageView, int):void
      ajuv.a(android.widget.TextView, java.lang.CharSequence):void
      ajuv.a(android.content.Context, java.lang.Object):void
      ajuj.a(android.content.Context, java.lang.Object):void
      acm.a(int, int):void
      acm.a(int, boolean):void
      acm.a(acc, boolean):void
      ajuv.a(android.view.View, int):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo38926a(Context context, Object obj) {
        boolean z;
        ShareTarget shareTarget = (ShareTarget) obj;
        TextView textView = this.f71335x;
        String a = akip.m59840a(((ajuk) this.f71334w).f71297a, shareTarget.mo44499b());
        List b = shareTarget.mo44499b();
        if (!b.isEmpty()) {
            z = ((Attachment) b.get(0)).mo44386d();
        } else {
            z = false;
        }
        if (textView != null) {
            m59064a(textView, a);
            if (z) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            }
        }
        TextView textView2 = this.f71335x;
        Drawable b2 = akip.m59842b(((ajuk) this.f71334w).f71297a, shareTarget.mo44499b());
        if (textView2 != null) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(b2, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        m59064a(this.f71336y, shareTarget.f81029b);
        m59065b(this.f71337z, 8);
        Drawable drawable = (Drawable) this.f71334w.f71338f.get(shareTarget);
        if (drawable == null) {
            drawable = new ajwv(context, shareTarget);
            this.f71334w.f71338f.put(shareTarget, drawable);
        }
        this.f71331t.setImageDrawable(drawable);
        ProgressBar progressBar = this.f71332u;
        if (progressBar != null) {
            progressBar.setMax(10000);
        }
        switch (this.f71334w.mo38951b(shareTarget).f81052a) {
            case 1:
            case 12:
                m59057a(0.0f);
                m59066c(this.f71333v);
                Animator animator = this.f71329E;
                if (animator != null) {
                    animator.cancel();
                }
                ProgressBar progressBar2 = this.f71332u;
                if (progressBar2 != null) {
                    progressBar2.setIndeterminate(true);
                    this.f71332u.animate().alpha(1.0f).start();
                }
                m59060a((View) this.f71325A);
                m59065b(this.f71325A, 8);
                return;
            case 2:
                m59059a(context, this.f71334w.mo38951b(shareTarget).f81054c);
                m59057a(0.0f);
                m59066c(this.f71333v);
                Animator animator2 = this.f71329E;
                if (animator2 != null) {
                    animator2.cancel();
                }
                ProgressBar progressBar3 = this.f71332u;
                if (progressBar3 != null) {
                    progressBar3.setIndeterminate(true);
                    this.f71332u.animate().alpha(1.0f).start();
                }
                m59060a((View) this.f71325A);
                m59065b(this.f71325A, 8);
                return;
            case 3:
                m59059a(context, this.f71334w.mo38951b(shareTarget).f81054c);
                m59061a((View) this.f71332u, 1.0f);
                m59067d(this.f71326B);
                m59057a(0.0f);
                m59065b(this.f71325A, 8);
                return;
            case 4:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                m59069v();
                return;
            case 5:
                m59061a((View) this.f71332u, 1.0f);
                m59067d(this.f71326B);
                m59057a(this.f71334w.mo38951b(shareTarget).f81053b);
                m59065b(this.f71325A, 8);
                return;
            case 6:
                m59061a((View) this.f71332u, 1.0f);
                m59057a(100.0f);
                mo38944a(this.f71327C);
                m59067d(this.f71327C);
                m59062a((View) this.f71325A, (int) C0126R.C0127drawable.sharing_bg_badge_success);
                m59063a(this.f71325A, (int) C0126R.C0127drawable.quantum_gm_ic_done_vd_theme_24);
                m59068e(this.f71327C);
                this.f201a.setEnabled(false);
                return;
            default:
                if (!cfov.m142056i() || !this.f71334w.mo38951b(shareTarget).f81056e) {
                    m59057a(0.0f);
                    m59061a((View) this.f71332u, 0.0f);
                    Animator animator3 = this.f71329E;
                    if (animator3 != null) {
                        animator3.cancel();
                    }
                    m59066c(this.f71333v);
                    m59060a((View) this.f71325A);
                    m59065b(this.f71325A, 8);
                    this.f201a.setEnabled(true);
                    m59064a(this.f71337z, "");
                    TextView textView3 = this.f71337z;
                    int b3 = akim.m59829b(context);
                    if (textView3 != null) {
                        textView3.setTextColor(b3);
                        return;
                    }
                    return;
                }
                m59069v();
                return;
        }
    }

    /* renamed from: a */
    public final void mo38944a(Drawable drawable) {
        ProgressBar progressBar = this.f71332u;
        if (progressBar != null) {
            progressBar.setProgressDrawable(drawable);
            drawable.setLevel((this.f71332u.getProgress() * 10000) / this.f71332u.getMax());
        }
    }
}
