package com.google.android.gms.nearby.sharing.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RadarView extends View {

    /* renamed from: a */
    private ajwr f81153a;

    public RadarView(Context context) {
        super(context);
        m67625a(context);
    }

    /* renamed from: a */
    private final void m67625a(Context context) {
        ajwr ajwr = new ajwr();
        this.f81153a = ajwr;
        ajwr.f71454a = new int[]{context.getColor(C0126R.color.sharing_color_primary), context.getColor(C0126R.color.sharing_color_radar_gradient), context.getColor(C0126R.color.sharing_color_primary)};
        ajwr.mo39013b();
        setBackground(this.f81153a);
    }

    /* renamed from: b */
    public final void mo44660b() {
        this.f81153a.mo39014c();
    }

    public RadarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m67625a(context);
    }

    /* renamed from: a */
    public final void mo44659a() {
        ajwr ajwr = this.f81153a;
        ajwr.mo39014c();
        ajwr.f71456c = 0.0f;
        ajwr.f71455b = ValueAnimator.ofFloat(0.0f, 1.0f);
        ajwr.f71455b.setDuration(3000L);
        ajwr.f71455b.addUpdateListener(new ajwq(ajwr));
        ajwr.f71455b.setRepeatCount(-1);
        ajwr.f71455b.start();
    }

    public RadarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67625a(context);
    }
}
