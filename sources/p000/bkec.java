package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;

/* renamed from: bkec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkec extends FrameLayout implements View.OnFocusChangeListener, bkdd {

    /* renamed from: a */
    public View f124075a;

    /* renamed from: b */
    final LinearLayout f124076b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, bkec, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public bkec(Context context) {
        super(context);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate((int) C0126R.C0128layout.view_inline_image_container, (ViewGroup) this, false);
        this.f124076b = linearLayout;
        super.addView(linearLayout);
    }

    /* renamed from: a */
    private final void m105425a(boolean z) {
        int i;
        boolean hasFocus = this.f124075a.hasFocus();
        if (!hasFocus) {
            i = 4;
        } else {
            i = 0;
        }
        if (this.f124076b.getVisibility() == i) {
            return;
        }
        if (!z) {
            this.f124076b.setVisibility(i);
        } else if (!hasFocus) {
            bkfr.m105564a(this.f124076b, 0, 0);
        } else {
            bkcd.m105304a(this.f124076b, 0);
        }
    }

    public final void addView(View view) {
        throw new UnsupportedOperationException("Do not directly add views to InlineImageUiFieldView.");
    }

    /* renamed from: b */
    public final View mo65860b() {
        return this.f124075a;
    }

    public final void onFocusChange(View view, boolean z) {
        if (view == this.f124075a) {
            m105425a(true);
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        View view = this.f124075a;
        if (view != null) {
            view.setEnabled(z);
        }
        int childCount = this.f124076b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.f124076b.getChildAt(i).setEnabled(z);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo65885a(View view, bmqf bmqf, ImageLoader imageLoader) {
        bmqe bmqe;
        this.f124075a = view;
        super.addView(view);
        this.f124075a.setOnFocusChangeListener(this);
        LayoutInflater from = LayoutInflater.from(getContext());
        bxwc bxwc = bmqf.f130383l;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) from.inflate((int) C0126R.C0128layout.view_inline_image, (ViewGroup) this.f124076b, false);
            this.f124076b.addView(imageWithCaptionView);
            imageWithCaptionView.mo71992a((bmno) bxwc.get(i), imageLoader, ((Boolean) bjwd.f123461a.mo54082a()).booleanValue());
        }
        m105425a(false);
        if (bmqf.f130373b == 6) {
            bmqe = (bmqe) bmqf.f130374c;
        } else {
            bmqe = bmqe.f130351s;
        }
        if (bkft.m105639a(bmqe)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f124076b.getLayoutParams();
            layoutParams.gravity = 5;
            this.f124076b.setLayoutParams(layoutParams);
        }
    }
}
