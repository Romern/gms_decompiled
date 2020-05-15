package p000;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: svj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class svj extends sva {

    /* renamed from: t */
    final View f45226t;

    /* renamed from: u */
    final ImageView f45227u;

    /* renamed from: v */
    final TextView f45228v;

    /* renamed from: w */
    final TextView f45229w;

    /* renamed from: x */
    final ViewGroup f45230x;

    public svj(View view) {
        super(view);
        this.f45226t = view.findViewById(C0126R.C0129id.icon_frame);
        this.f45227u = (ImageView) view.findViewById(16908294);
        this.f45228v = (TextView) view.findViewById(16908310);
        this.f45229w = (TextView) view.findViewById(16908304);
        this.f45230x = (ViewGroup) view.findViewById(16908312);
        view.setFocusable(true);
    }

    /* renamed from: a */
    protected static void m36444a(View view, ImageView imageView, Drawable drawable) {
        int i;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            if (view != null) {
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    protected static void m36445a(TextView textView, CharSequence charSequence) {
        if (textView == null) {
            return;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    /* renamed from: a */
    public void mo23819a(svc svc) {
        if (svc instanceof svk) {
            svk svk = (svk) svc;
            boolean h = svk.mo26162h();
            this.f45227u.setEnabled(h);
            m36444a(this.f45226t, this.f45227u, svk.f45234h);
            this.f45228v.setEnabled(h);
            m36445a(this.f45228v, svk.mo26088d());
            this.f45229w.setEnabled(h);
            m36445a(this.f45229w, svk.mo26161g());
            this.f201a.setEnabled(svk.mo26162h());
            View view = this.f201a;
            if (svk.f45236j == null && svk.f45235i == null) {
                svk = null;
            }
            view.setOnClickListener(svk);
            return;
        }
        throw new IllegalArgumentException("settingItem must be DefaultSimpleSettingItem");
    }
}
