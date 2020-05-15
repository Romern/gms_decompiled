package p000;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;

/* renamed from: avgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avgt {

    /* renamed from: a */
    public static final srn f93154a = srn.m36124a();

    /* renamed from: b */
    public final View f93155b;

    /* renamed from: c */
    public final Double f93156c;

    /* renamed from: d */
    private final double f93157d;

    public avgt(View view, double d, Double d2) {
        this.f93155b = view;
        this.f93157d = d;
        this.f93156c = d2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo51210a(TextView textView, int i) {
        if (textView == null) {
            bnsl bnsl = (bnsl) f93154a.mo68387b();
            bnsl.mo68432a("avgt", "a", 187, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("textView is null.");
            return 0;
        } else if (TextUtils.isEmpty(textView.getText())) {
            return 0;
        } else {
            textView.measure(View.MeasureSpec.makeMeasureSpec(this.f93155b.getWidth(), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE));
            return textView.getMeasuredHeight();
        }
    }

    /* renamed from: b */
    public final void mo51212b() {
        int i;
        View findViewById = this.f93155b.findViewById(C0126R.C0129id.udc_consent_header);
        if (findViewById == null) {
            bnsl bnsl = (bnsl) f93154a.mo68387b();
            bnsl.mo68432a("avgt", "b", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Cannot find headerView.");
            return;
        }
        int c = mo51213c();
        int i2 = 0;
        if (this.f93156c != null) {
            i = mo51210a((TextView) findViewById.findViewById(C0126R.C0129id.header), c);
            int a = avgy.m78500a(c - i, this.f93156c.doubleValue(), this.f93155b.getWidth());
            ImageView imageView = (ImageView) findViewById.findViewById(C0126R.C0129id.illustration);
            if (imageView == null) {
                bnsl bnsl2 = (bnsl) f93154a.mo68387b();
                bnsl2.mo68432a("avgt", "b", 138, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Cannot find illustrationView.");
            } else if (a == 0) {
                if (imageView.getVisibility() != 8) {
                    imageView.setVisibility(8);
                }
            } else if (!(imageView.getVisibility() == 0 && imageView.getMaxHeight() == a)) {
                imageView.setVisibility(0);
                imageView.setMaxHeight(a);
            }
            i2 = a;
        } else {
            i = 0;
        }
        if (i2 > 0) {
            c = i2 + i;
        }
        if (findViewById.getMinimumHeight() != c) {
            findViewById.setMinimumHeight(c);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = c;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo51213c() {
        int i = Resources.getSystem().getDisplayMetrics().heightPixels;
        if (sre.m36081a(Resources.getSystem())) {
            double d = this.f93157d;
            int height = this.f93155b.getHeight();
            double d2 = this.f93157d;
            double d3 = (double) i;
            Double.isNaN(d3);
            double d4 = (double) height;
            Double.isNaN(d4);
            return Math.min((int) (d3 * d), (int) ((d4 * d2) / (1.0d - d2)));
        }
        double d5 = (double) i;
        double d6 = this.f93157d;
        Double.isNaN(d5);
        return (int) (d5 * d6);
    }

    /* renamed from: a */
    public final void mo51211a() {
        int i;
        int i2;
        int i3 = 0;
        if (chay.f188218a.mo6606a().mo84897f()) {
            View findViewById = this.f93155b.findViewById(C0126R.C0129id.udc_consent_header);
            if (findViewById == null) {
                bnsl bnsl = (bnsl) f93154a.mo68387b();
                bnsl.mo68432a("avgt", "b", 119, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Cannot find headerView.");
                return;
            }
            int c = mo51213c();
            if (this.f93156c != null) {
                i2 = mo51210a((TextView) findViewById.findViewById(C0126R.C0129id.header), c);
                int a = avgy.m78500a(c - i2, this.f93156c.doubleValue(), this.f93155b.getWidth());
                ImageView imageView = (ImageView) findViewById.findViewById(C0126R.C0129id.illustration);
                if (imageView == null) {
                    bnsl bnsl2 = (bnsl) f93154a.mo68387b();
                    bnsl2.mo68432a("avgt", "b", 138, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Cannot find illustrationView.");
                } else if (a != 0) {
                    if (!(imageView.getVisibility() == 0 && imageView.getMaxHeight() == a)) {
                        imageView.setVisibility(0);
                        imageView.setMaxHeight(a);
                    }
                } else if (imageView.getVisibility() != 8) {
                    imageView.setVisibility(8);
                }
                i3 = a;
            } else {
                i2 = 0;
            }
            if (i3 > 0) {
                c = i3 + i2;
            }
            if (findViewById.getMinimumHeight() != c) {
                findViewById.setMinimumHeight(c);
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = c;
                findViewById.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        View findViewById2 = this.f93155b.findViewById(C0126R.C0129id.udc_consent_header);
        if (findViewById2 == null) {
            bnsl bnsl3 = (bnsl) f93154a.mo68387b();
            bnsl3.mo68432a("avgt", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Cannot find headerView.");
            return;
        }
        int c2 = mo51213c();
        if (this.f93156c != null) {
            i = mo51210a((TextView) findViewById2.findViewById(C0126R.C0129id.header), c2);
            int a2 = avgy.m78500a(c2 - i, this.f93156c.doubleValue(), this.f93155b.getWidth());
            ImageView imageView2 = (ImageView) findViewById2.findViewById(C0126R.C0129id.illustration);
            if (imageView2 == null) {
                bnsl bnsl4 = (bnsl) f93154a.mo68387b();
                bnsl4.mo68432a("avgt", "a", 82, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Cannot find illustrationView.");
            } else if (a2 != 0) {
                imageView2.setMaxHeight(a2);
                if (imageView2.getVisibility() != 0) {
                    imageView2.setVisibility(0);
                }
            } else if (imageView2.getVisibility() != 8) {
                imageView2.setVisibility(8);
            }
            i3 = a2;
        } else {
            i = 0;
        }
        if (i3 > 0) {
            c2 = i3 + i;
        }
        ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
        if (layoutParams2.height != c2) {
            findViewById2.setMinimumHeight(c2);
            layoutParams2.height = c2;
            findViewById2.setLayoutParams(layoutParams2);
        }
    }
}
