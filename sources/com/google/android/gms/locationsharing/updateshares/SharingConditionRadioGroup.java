package com.google.android.gms.locationsharing.updateshares;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.locationsharing.common.model.SharingCondition;
import com.google.android.gms.locationsharing.common.p052ui.DisableableFrameLayout;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SharingConditionRadioGroup extends RadioGroup {

    /* renamed from: a */
    public static final String[] f79724a = cfaz.m138554c().split(",");

    /* renamed from: b */
    public final RadioButton f79725b;

    /* renamed from: c */
    public final RadioButton f79726c;

    /* renamed from: d */
    public final RadioButton f79727d;

    /* renamed from: e */
    public final RadioButton f79728e;

    /* renamed from: f */
    public int f79729f;

    /* renamed from: g */
    public RadioGroup.OnCheckedChangeListener f79730g;

    /* renamed from: h */
    public SharingCondition f79731h;

    /* renamed from: i */
    private final ImageView f79732i;

    /* renamed from: j */
    private final DisableableFrameLayout f79733j;

    /* renamed from: k */
    private final ImageView f79734k;

    /* renamed from: l */
    private final DisableableFrameLayout f79735l;

    /* renamed from: m */
    private final TextView f79736m;

    /* renamed from: n */
    private final TextView f79737n;

    /* renamed from: o */
    private int f79738o;

    /* renamed from: p */
    private final int f79739p;

    public SharingConditionRadioGroup(Context context) {
        this(context, null);
    }

    /* renamed from: f */
    private final long m67076f() {
        return TimeUnit.MINUTES.toMillis(Long.parseLong(f79724a[this.f79729f]));
    }

    /* renamed from: a */
    public final void mo43812a() {
        View findViewById = findViewById(C0126R.C0129id.temporary_share_time_info_view);
        findViewById.setFocusable(true);
        findViewById.sendAccessibilityEvent(32);
        findViewById.setFocusable(false);
    }

    /* renamed from: b */
    public final SharingCondition mo43814b() {
        int checkedRadioButtonId = getCheckedRadioButtonId();
        if (checkedRadioButtonId == mo43816c()) {
            return SharingCondition.m67019a(m67076f());
        }
        if (checkedRadioButtonId == mo43818e()) {
            return SharingCondition.m67018a();
        }
        if (checkedRadioButtonId == mo43817d()) {
            return this.f79731h;
        }
        return null;
    }

    /* renamed from: c */
    public final int mo43816c() {
        return this.f79725b.getId();
    }

    /* renamed from: d */
    public final int mo43817d() {
        return this.f79726c.getId();
    }

    /* renamed from: e */
    public final int mo43818e() {
        return this.f79727d.getId();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            mo43815b(bundle.getInt("state_duration_index"));
            check(bundle.getInt("state_checked_id"));
            mo43813a(bundle.getInt("state_checked_color"));
            SharingCondition sharingCondition = (SharingCondition) bundle.getParcelable("state_destination_sharing_condition");
            this.f79731h = sharingCondition;
            if (sharingCondition != null) {
                findViewById(C0126R.C0129id.destination_share_container).setVisibility(0);
            }
            parcelable = bundle.getParcelable("state_instance_state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance_state", super.onSaveInstanceState());
        bundle.putInt("state_duration_index", this.f79729f);
        bundle.putInt("state_checked_color", this.f79738o);
        bundle.putInt("state_checked_id", getCheckedRadioButtonId());
        bundle.putParcelable("state_destination_sharing_condition", this.f79731h);
        return bundle;
    }

    public final void setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener != null) {
            aewk aewk = new aewk(this, onCheckedChangeListener);
            super.setOnCheckedChangeListener(aewk);
            this.f79730g = aewk;
        }
    }

    public SharingConditionRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.location_sharing_sharing_condition_radio_group, this);
        this.f79725b = (RadioButton) findViewById(C0126R.C0129id.temporary_share_radio_button);
        this.f79726c = (RadioButton) findViewById(C0126R.C0129id.destination_share_radio_button);
        this.f79727d = (RadioButton) findViewById(C0126R.C0129id.persistent_share_radio_button);
        this.f79728e = (RadioButton) findViewById(C0126R.C0129id.stop_sharing_radio_button);
        this.f79732i = (ImageView) findViewById(C0126R.C0129id.increment_time_icon);
        this.f79733j = (DisableableFrameLayout) findViewById(C0126R.C0129id.increment_time_icon_container);
        this.f79734k = (ImageView) findViewById(C0126R.C0129id.decrement_time_icon);
        this.f79735l = (DisableableFrameLayout) findViewById(C0126R.C0129id.decrement_time_icon_container);
        this.f79736m = (TextView) findViewById(C0126R.C0129id.duration_text);
        this.f79737n = (TextView) findViewById(C0126R.C0129id.end_time_text);
        findViewById(C0126R.C0129id.temporary_share_container).setOnClickListener(new aewe(this));
        findViewById(C0126R.C0129id.destination_share_container).setOnClickListener(new aewf(this));
        findViewById(C0126R.C0129id.persistent_share_container).setOnClickListener(new aewg(this));
        findViewById(C0126R.C0129id.stop_sharing_container).setOnClickListener(new aewh(this));
        this.f79732i.setOnClickListener(new aewi(this));
        this.f79734k.setOnClickListener(new aewj(this));
        mo43815b((int) cfaz.f183554a.mo6606a().mo80784g());
        this.f79739p = context.getResources().getColor(C0126R.color.material_grey_600);
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{C0126R.attr.colorAccent});
            this.f79738o = obtainStyledAttributes.getColor(0, -1);
            obtainStyledAttributes.recycle();
            int i = this.f79738o;
            if (i != -1) {
                mo43813a(i);
            }
        } catch (Exception e) {
        }
        if (getCheckedRadioButtonId() == -1) {
            check(mo43816c());
        }
    }

    /* renamed from: a */
    public final void mo43813a(int i) {
        this.f79738o = i;
        this.f79732i.clearColorFilter();
        this.f79732i.setColorFilter(this.f79738o, PorterDuff.Mode.SRC_ATOP);
        this.f79734k.clearColorFilter();
        this.f79734k.setColorFilter(this.f79738o, PorterDuff.Mode.SRC_ATOP);
        int i2 = Build.VERSION.SDK_INT;
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{16842912}, new int[]{-16842912}}, new int[]{i, this.f79739p});
        this.f79725b.setButtonTintList(colorStateList);
        this.f79726c.setButtonTintList(colorStateList);
        this.f79727d.setButtonTintList(colorStateList);
        this.f79728e.setButtonTintList(colorStateList);
    }

    /* renamed from: b */
    public final void mo43815b(int i) {
        boolean z;
        boolean z2;
        this.f79729f = i;
        DisableableFrameLayout disableableFrameLayout = this.f79735l;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        disableableFrameLayout.mo43791a(z);
        DisableableFrameLayout disableableFrameLayout2 = this.f79733j;
        if (i == f79724a.length - 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        disableableFrameLayout2.mo43791a(z2);
        long f = m67076f();
        this.f79736m.setText(aeya.m52676b(getContext(), f));
        this.f79737n.setText(getContext().getString(C0126R.string.location_sharing_temporary_end_time, aeya.m52672a(getContext(), f)));
    }
}
