package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Item extends AbstractItem {

    /* renamed from: a */
    private boolean f151500a;

    /* renamed from: b */
    private int f151501b;

    /* renamed from: d */
    public Drawable f151502d;

    /* renamed from: e */
    public CharSequence f151503e;

    /* renamed from: f */
    public boolean f151504f;

    /* renamed from: g */
    public int f151505g;

    /* renamed from: h */
    private CharSequence f151506h;

    /* renamed from: i */
    private int f151507i;

    public Item() {
        this.f151500a = true;
        this.f151504f = true;
        this.f151507i = 0;
        this.f151505g = 16;
        this.f151501b = mo71392j();
    }

    /* renamed from: a */
    public final void mo71394a(Drawable drawable) {
        this.f151502d = drawable;
        mo71384h();
    }

    /* renamed from: b */
    public final int mo64907b() {
        return this.f151501b;
    }

    /* renamed from: bI */
    public CharSequence mo58964bI() {
        return this.f151506h;
    }

    /* renamed from: bJ */
    public boolean mo64908bJ() {
        return this.f151500a;
    }

    /* renamed from: bK */
    public final boolean mo71397bK() {
        return this.f151504f;
    }

    /* renamed from: d */
    public final void mo71398d(int i) {
        this.f151501b = i;
        mo71384h();
    }

    /* renamed from: e */
    public CharSequence mo58962e() {
        return this.f151503e;
    }

    /* renamed from: g */
    public final int mo64923g() {
        return this.f151504f ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public int mo71392j() {
        return C0126R.C0128layout.sud_items_default;
    }

    public Item(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f151500a = true;
        this.f151504f = true;
        this.f151507i = 0;
        this.f151505g = 16;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bizg.f122378l);
        this.f151500a = obtainStyledAttributes.getBoolean(1, true);
        this.f151502d = obtainStyledAttributes.getDrawable(0);
        this.f151503e = obtainStyledAttributes.getText(4);
        this.f151506h = obtainStyledAttributes.getText(5);
        this.f151501b = obtainStyledAttributes.getResourceId(2, mo71392j());
        this.f151504f = obtainStyledAttributes.getBoolean(3, true);
        this.f151507i = obtainStyledAttributes.getColor(7, 0);
        this.f151505g = obtainStyledAttributes.getInt(6, 16);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void mo48939a(View view) {
        ((TextView) view.findViewById(C0126R.C0129id.sud_items_title)).setText(mo58962e());
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.sud_items_summary);
        CharSequence bI = mo58964bI();
        if (bI == null || bI.length() <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(bI);
            textView.setVisibility(0);
        }
        View findViewById = view.findViewById(C0126R.C0129id.sud_items_icon_container);
        Drawable drawable = this.f151502d;
        if (drawable != null) {
            ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.sud_items_icon);
            imageView.setImageDrawable(null);
            imageView.setImageState(drawable.getState(), false);
            imageView.setImageLevel(drawable.getLevel());
            imageView.setImageDrawable(drawable);
            int i = this.f151507i;
            if (i != 0) {
                imageView.setColorFilter(i);
            } else {
                imageView.clearColorFilter();
            }
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).gravity = this.f151505g;
            }
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        view.setId(this.f151489c);
    }

    /* renamed from: b */
    public final void mo71395b(CharSequence charSequence) {
        this.f151503e = charSequence;
        mo71384h();
    }

    /* renamed from: d */
    public final void mo71399d(boolean z) {
        if (this.f151504f != z) {
            this.f151504f = z;
            if (!z) {
                mo71386b(0, 1);
            } else {
                mo71385a(0, 1);
            }
        }
    }

    /* renamed from: b */
    public final void mo71396b(boolean z) {
        this.f151500a = z;
        mo71384h();
    }
}
