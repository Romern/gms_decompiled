package p000;

import android.content.Context;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: alcd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alcd extends ImageButton {

    /* renamed from: a */
    public final AlphaAnimation f73388a = new AlphaAnimation(1.0f, 0.0f);

    /* renamed from: b */
    public boolean f73389b = true;

    /* renamed from: c */
    private final AlphaAnimation f73390c = new AlphaAnimation(0.0f, 1.0f);

    /* renamed from: d */
    private final Handler f73391d = new adzt();

    /* renamed from: e */
    private final Runnable f73392e = new alcb(this);

    public alcd(Context context) {
        super(context);
        setImageResource(C0126R.C0127drawable.ic_compass);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        setLayoutParams(layoutParams);
        setBackgroundResource(C0126R.C0127drawable.transparent_button_background);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0126R.dimen.panorama_compass_icon_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setContentDescription(getResources().getString(C0126R.string.panorama_toggle_compass_mode));
        this.f73388a.setDuration(400);
        this.f73388a.setFillAfter(true);
        this.f73388a.setFillBefore(false);
        this.f73388a.setAnimationListener(new alcc(this));
        this.f73390c.setDuration(400);
        this.f73390c.setFillAfter(true);
        this.f73390c.setFillBefore(false);
    }

    /* renamed from: a */
    public final synchronized void mo40110a() {
        if (!this.f73389b) {
            setVisibility(0);
            setClickable(true);
            this.f73390c.reset();
            this.f73390c.setStartTime(0);
            startAnimation(this.f73390c);
            this.f73389b = true;
        }
        this.f73391d.removeCallbacks(this.f73392e);
        this.f73391d.postDelayed(this.f73392e, 1900);
    }
}
