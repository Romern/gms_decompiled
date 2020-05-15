package p000;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.setupwizardlib.items.AbstractItem;

@Deprecated
/* renamed from: bmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmi extends abh implements bmc {

    /* renamed from: a */
    public final bmd f5159a;

    /* renamed from: d */
    public vtn f5160d;

    public bmi(bmd bmd) {
        this.f5159a = bmd;
        bmd.mo3271a(this);
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        int i2;
        bmb f = mo3276f(i);
        if (!(f instanceof AbstractItem) || (i2 = ((AbstractItem) f).f7206a) <= 0) {
            return -1;
        }
        return (long) i2;
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f5159a.mo3269a();
    }

    /* renamed from: b */
    public final void mo3268b(bmd bmd, int i) {
        mo178d(i, 1);
    }

    /* renamed from: f */
    public final bmb mo3276f(int i) {
        return this.f5159a.mo3270a(i);
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        return mo3276f(i).mo3265e();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        bmf bmf = new bmf(inflate);
        if (!"noBackground".equals(inflate.getTag())) {
            TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(blz.f5147n);
            Drawable drawable = obtainStyledAttributes.getDrawable(1);
            if (drawable == null) {
                drawable = obtainStyledAttributes.getDrawable(2);
            }
            Drawable background = inflate.getBackground();
            if (background == null) {
                background = obtainStyledAttributes.getDrawable(0);
            }
            if (drawable == null || background == null) {
                String valueOf = String.valueOf(drawable);
                String valueOf2 = String.valueOf(background);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73 + String.valueOf(valueOf2).length());
                sb.append("Cannot resolve required attributes. selectableItemBackground=");
                sb.append(valueOf);
                sb.append(" background=");
                sb.append(valueOf2);
                Log.e("RecyclerItemAdapter", sb.toString());
            } else {
                inflate.setBackgroundDrawable(new bmh(new Drawable[]{background, drawable}));
            }
            obtainStyledAttributes.recycle();
        }
        inflate.setOnClickListener(new bmg(this, bmf));
        return bmf;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        bmf bmf = (bmf) acm;
        bmb f = mo3276f(i);
        boolean d = f.mo3264d();
        bmf.f5155s = d;
        bmf.f201a.setClickable(d);
        bmf.f201a.setEnabled(d);
        bmf.f201a.setFocusable(d);
        bmf.f5156t = f;
        f.mo3263a(bmf.f201a);
    }

    /* renamed from: a */
    public final void mo3266a(bmd bmd, int i) {
        mo180h(i, 1);
    }

    /* renamed from: a */
    public final void mo3267a(bmd bmd, int i, int i2) {
        mo177c(i, i2);
    }
}
