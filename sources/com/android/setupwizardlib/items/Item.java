package com.android.setupwizardlib.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Item extends AbstractItem {

    /* renamed from: b */
    public boolean f7217b;

    /* renamed from: c */
    public Drawable f7218c;

    /* renamed from: d */
    public boolean f7219d;

    /* renamed from: e */
    private int f7220e;

    /* renamed from: f */
    private CharSequence f7221f;

    /* renamed from: g */
    private CharSequence f7222g;

    public Item() {
        this.f7217b = true;
        this.f7219d = true;
        this.f7220e = mo4094f();
    }

    /* renamed from: a */
    public final int mo3269a() {
        return this.f7219d ? 1 : 0;
    }

    /* renamed from: b */
    public final void mo4098b(CharSequence charSequence) {
        this.f7222g = charSequence;
        mo4089b();
    }

    /* renamed from: d */
    public final void mo4099d(int i) {
        this.f7220e = i;
        mo4089b();
    }

    /* renamed from: d */
    public final boolean mo3264d() {
        return this.f7217b;
    }

    /* renamed from: e */
    public final int mo3265e() {
        return this.f7220e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo4094f() {
        return C0126R.C0128layout.suw_items_default;
    }

    /* renamed from: g */
    public CharSequence mo4095g() {
        return this.f7221f;
    }

    /* renamed from: h */
    public final void mo4100h() {
        this.f7217b = false;
        mo4089b();
    }

    public Item(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7217b = true;
        this.f7219d = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, blz.f5146m);
        this.f7217b = obtainStyledAttributes.getBoolean(1, true);
        this.f7218c = obtainStyledAttributes.getDrawable(0);
        this.f7222g = obtainStyledAttributes.getText(4);
        this.f7221f = obtainStyledAttributes.getText(5);
        this.f7220e = obtainStyledAttributes.getResourceId(2, mo4094f());
        this.f7219d = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void mo3263a(View view) {
        ((TextView) view.findViewById(C0126R.C0129id.suw_items_title)).setText(this.f7222g);
        TextView textView = (TextView) view.findViewById(C0126R.C0129id.suw_items_summary);
        CharSequence g = mo4095g();
        if (g == null || g.length() <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(g);
            textView.setVisibility(0);
        }
        View findViewById = view.findViewById(C0126R.C0129id.suw_items_icon_container);
        Drawable drawable = this.f7218c;
        if (drawable != null) {
            ImageView imageView = (ImageView) view.findViewById(C0126R.C0129id.suw_items_icon);
            imageView.setImageDrawable(null);
            imageView.setImageState(drawable.getState(), false);
            imageView.setImageLevel(drawable.getLevel());
            imageView.setImageDrawable(drawable);
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        view.setId(this.f7206a);
    }

    /* renamed from: a */
    public final void mo4097a(CharSequence charSequence) {
        this.f7221f = charSequence;
        mo4089b();
    }
}
