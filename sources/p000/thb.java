package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: thb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class thb {

    /* renamed from: a */
    public String f45998a;

    /* renamed from: b */
    public String f45999b;

    /* renamed from: c */
    public String f46000c;

    /* renamed from: d */
    public Drawable f46001d;

    /* renamed from: e */
    public Drawable f46002e;

    /* renamed from: f */
    public String f46003f;

    /* renamed from: g */
    public String f46004g;

    /* renamed from: h */
    public String f46005h;

    /* renamed from: i */
    public View.OnClickListener f46006i;

    /* renamed from: j */
    public View.OnClickListener f46007j;

    /* renamed from: k */
    public View.OnClickListener f46008k;

    /* renamed from: l */
    private boolean f46009l;

    private thb() {
    }

    /* renamed from: a */
    public static thb m36953a() {
        return new thb();
    }

    /* renamed from: b */
    public final void mo26507b() {
        this.f46009l = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final View mo26505a(Context context, ViewGroup viewGroup) {
        if (!cgne.m146261c()) {
            View inflate = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.gm_card_entry, viewGroup, false);
            mo26506a(inflate);
            return inflate;
        } else if (cgnh.m146280b()) {
            View inflate2 = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.gm_card_entry_bugfix, viewGroup, false);
            mo26506a(inflate2);
            RelativeLayout relativeLayout = (RelativeLayout) inflate2;
            int dimensionPixelSize = relativeLayout.getResources().getDimensionPixelSize(C0126R.dimen.gm_card_entry_padding);
            relativeLayout.getChildAt(1).setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
            return relativeLayout;
        } else {
            View inflate3 = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.gm_card_entry_bugfix, viewGroup, false);
            mo26506a(inflate3);
            return inflate3;
        }
    }

    /* renamed from: a */
    public final void mo26506a(View view) {
        if (!TextUtils.isEmpty(this.f45998a)) {
            TextView textView = (TextView) view.findViewById(C0126R.C0129id.text);
            textView.setText(this.f45998a);
            textView.setVisibility(0);
            view.setOnLongClickListener(new tha(this, view));
        }
        if (!TextUtils.isEmpty(this.f45999b)) {
            TextView textView2 = (TextView) view.findViewById(C0126R.C0129id.subtext);
            textView2.setText(this.f45999b);
            textView2.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.f46000c)) {
            TextView textView3 = (TextView) view.findViewById(C0126R.C0129id.secondary_subtext);
            textView3.setText(this.f46000c);
            textView3.setVisibility(0);
        }
        if (this.f46009l) {
            view.findViewById(C0126R.C0129id.icon).setVisibility(4);
        }
        ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.icon);
        Drawable drawable = this.f46001d;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
        }
        ImageView imageView2 = (ImageView) view.findViewById(C0126R.C0129id.alt_icon);
        Drawable drawable2 = this.f46002e;
        if (drawable2 != null) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.f46003f)) {
            view.setContentDescription(this.f46003f);
        }
        if (!TextUtils.isEmpty(this.f46004g)) {
            imageView.setContentDescription(this.f46004g);
        }
        if (!TextUtils.isEmpty(this.f46005h)) {
            imageView2.setContentDescription(this.f46005h);
        }
        View.OnClickListener onClickListener = this.f46006i;
        if (onClickListener != null) {
            view.setOnClickListener(onClickListener);
            view.setBackgroundResource(thh.m36971g(view.getContext()));
        }
        View.OnClickListener onClickListener2 = this.f46007j;
        if (onClickListener2 != null) {
            imageView.setOnClickListener(onClickListener2);
        }
        View.OnClickListener onClickListener3 = this.f46008k;
        if (onClickListener3 != null) {
            imageView2.setOnClickListener(onClickListener3);
        }
    }
}
