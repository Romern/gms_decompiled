package com.google.android.gms.people.p062ui.widget;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.android.gms.people.model.AvatarReference;

/* renamed from: com.google.android.gms.people.ui.widget.AvatarReferenceImageView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AvatarReferenceImageView extends FrameLayout {

    /* renamed from: h */
    public static final /* synthetic */ int f82057h = 0;

    /* renamed from: i */
    private static final int[] f82058i = {C0126R.color.material_google_red_500, C0126R.color.material_pink_500, C0126R.color.material_purple_500, C0126R.color.material_deep_purple_500, C0126R.color.material_indigo_500, C0126R.color.material_google_blue_500, C0126R.color.material_light_blue_500, C0126R.color.material_cyan_500, C0126R.color.material_teal_500, C0126R.color.material_google_green_500, C0126R.color.material_light_green_500, C0126R.color.material_lime_500, C0126R.color.material_yellow_500, C0126R.color.material_google_yellow_500, C0126R.color.material_orange_500, C0126R.color.material_deep_orange_500, C0126R.color.material_brown_500, C0126R.color.material_grey_500, C0126R.color.material_blue_grey_500};

    /* renamed from: a */
    public ImageView f82059a;

    /* renamed from: b */
    public AvatarReference f82060b;

    /* renamed from: c */
    public Long f82061c;

    /* renamed from: d */
    public BitmapDrawable f82062d;

    /* renamed from: e */
    public anbq f82063e;

    /* renamed from: f */
    public anbr f82064f;

    /* renamed from: g */
    public boolean f82065g;

    /* renamed from: j */
    private TextView f82066j;

    /* renamed from: k */
    private ImageView f82067k;

    /* renamed from: l */
    private GradientDrawable f82068l;

    /* renamed from: m */
    private float f82069m = 0.6666667f;

    public AvatarReferenceImageView(Context context) {
        super(context);
        m68209e();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [android.widget.TextView, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    /* renamed from: e */
    private final void m68209e() {
        if (this.f82066j == null) {
            TextView textView = new TextView(getContext());
            this.f82066j = textView;
            textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f82066j.setGravity(17);
            this.f82066j.setTextColor(-1);
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.f82068l = gradientDrawable;
            this.f82066j.setBackgroundDrawable(gradientDrawable);
            C1280ps.m19906b((View) this.f82066j, 2);
            addView(this.f82066j);
        }
        if (this.f82067k == null) {
            ImageView imageView = new ImageView(getContext());
            this.f82067k = imageView;
            imageView.setImageResource(C0126R.C0127drawable.quantum_ic_person_white_48);
            this.f82067k.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f82067k.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f82067k.setVisibility(8);
            this.f82067k.setBackgroundDrawable(this.f82068l);
            addView(this.f82067k);
        }
        if (this.f82059a == null) {
            ImageView imageView2 = new ImageView(getContext());
            this.f82059a = imageView2;
            imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f82059a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f82059a.setVisibility(8);
            addView(this.f82059a);
        }
    }

    /* renamed from: a */
    public final void mo46475a() {
        anbq anbq = this.f82063e;
        if (anbq != null) {
            anbq.f76583a.mo9460b();
            anbq.cancel(true);
            this.f82063e = null;
        }
        if (this.f82064f != null) {
            this.f82064f = null;
        }
    }

    /* renamed from: b */
    public final void mo46479b() {
        int i;
        TextView textView = this.f82066j;
        if (textView != null) {
            int length = textView.getText().length();
            TextView textView2 = this.f82066j;
            int i2 = 0;
            if (length > 0) {
                i = 0;
            } else {
                i = 4;
            }
            textView2.setVisibility(i);
            ImageView imageView = this.f82067k;
            if (imageView != null) {
                if (length > 0) {
                    i2 = 4;
                }
                imageView.setVisibility(i2);
            }
        }
        ImageView imageView2 = this.f82059a;
        if (imageView2 != null) {
            imageView2.setVisibility(4);
        }
    }

    /* renamed from: c */
    public final void mo46480c() {
        TextView textView = this.f82066j;
        if (textView != null) {
            textView.setVisibility(4);
        }
        ImageView imageView = this.f82067k;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        ImageView imageView2 = this.f82059a;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
    }

    /* renamed from: d */
    public final void mo46481d() {
        if (!this.f82065g) {
            mo46475a();
            this.f82062d = null;
            this.f82065g = true;
            this.f82068l.setShape(1);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        TextView textView = this.f82066j;
        if (textView != null) {
            textView.setTextSize(0, ((float) size) * this.f82069m);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, JGCastService.FLAG_PRIVATE_DISPLAY));
        ImageView imageView = this.f82067k;
        if (imageView != null) {
            int measuredWidth = (int) ((((float) imageView.getMeasuredWidth()) * (1.0f - this.f82069m)) / 2.0f);
            int measuredHeight = (int) ((((float) this.f82067k.getMeasuredHeight()) * (1.0f - this.f82069m)) / 2.0f);
            this.f82067k.setPadding(measuredWidth, measuredHeight, measuredWidth, measuredHeight);
        }
    }

    public AvatarReferenceImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m68209e();
    }

    public AvatarReferenceImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m68209e();
    }

    /* renamed from: a */
    public final void mo46476a(int i) {
        this.f82059a.setPadding(i, i, i, i);
    }

    /* renamed from: a */
    public final void mo46477a(String str) {
        String str2;
        String str3 = null;
        if (str != null) {
            str2 = str.trim();
        } else {
            str2 = null;
        }
        int i = 0;
        if (!TextUtils.isEmpty(str2) && Character.isLetter(str2.codePointAt(0))) {
            str3 = str2.substring(0, 1).toUpperCase();
        }
        this.f82066j.setText(str3);
        if (str != null) {
            i = str.hashCode();
        }
        int[] iArr = f82058i;
        int length = i % iArr.length;
        if (length < 0) {
            length += iArr.length;
        }
        this.f82068l.setColor(getResources().getColor(f82058i[length]));
    }

    /* renamed from: a */
    public final void mo46478a(rkb rkb, allg allg, AvatarReference avatarReference) {
        this.f82061c = null;
        if (!sdg.m34949a(this.f82060b, avatarReference)) {
            mo46475a();
            mo46479b();
            this.f82060b = avatarReference;
            this.f82062d = null;
            if (avatarReference != null) {
                anbq anbq = new anbq(this, rkb, this.f82060b, allg, this.f82065g);
                this.f82063e = anbq;
                anbq.execute(new Void[0]);
                return;
            }
            this.f82063e = null;
        } else if (avatarReference != null) {
            BitmapDrawable bitmapDrawable = this.f82062d;
            if (bitmapDrawable != null) {
                this.f82059a.setImageDrawable(bitmapDrawable);
                mo46480c();
            } else if (this.f82063e == null) {
                mo46479b();
                anbq anbq2 = new anbq(this, rkb, this.f82060b, allg, this.f82065g);
                this.f82063e = anbq2;
                anbq2.execute(new Void[0]);
            }
        } else {
            mo46479b();
        }
    }
}
