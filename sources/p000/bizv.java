package p000;

import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.setupdesign.items.AbstractItem;

/* renamed from: bizv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bizv extends abh implements bizo {

    /* renamed from: a */
    public final bizp f122395a;

    /* renamed from: d */
    public final boolean f122396d;

    /* renamed from: e */
    public bizt f122397e;

    public bizv(bizp bizp, boolean z) {
        this.f122396d = z;
        this.f122395a = bizp;
        bizp.mo64920a(this);
    }

    /* renamed from: L */
    public final long mo157L(int i) {
        int i2;
        bizl f = mo64926f(i);
        if (!(f instanceof AbstractItem) || (i2 = ((AbstractItem) f).f151489c) <= 0) {
            return -1;
        }
        return (long) i2;
    }

    /* renamed from: a */
    public final int mo161a() {
        return this.f122395a.mo64923g();
    }

    /* renamed from: b */
    public final void mo58968b(bizp bizp, int i, int i2) {
        mo177c(i, i2);
    }

    /* renamed from: cB */
    public final void mo64911cB() {
        mo171aJ();
    }

    /* renamed from: f */
    public final bizl mo64926f(int i) {
        return this.f122395a.mo64919a(i);
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        return mo64926f(i).mo64907b();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        Drawable drawable;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        bizr bizr = new bizr(inflate);
        if (!"noBackground".equals(inflate.getTag())) {
            TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(bizg.f122380n);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
            if (drawable2 == null) {
                drawable2 = obtainStyledAttributes.getDrawable(2);
                drawable = null;
            } else {
                drawable = inflate.getBackground();
                if (drawable == null) {
                    if (this.f122396d) {
                        drawable = new ColorDrawable(biyk.m102977a(inflate.getContext()).mo64868a(inflate.getContext(), biyj.CONFIG_LAYOUT_BACKGROUND_COLOR));
                    } else {
                        drawable = obtainStyledAttributes.getDrawable(0);
                    }
                }
            }
            if (drawable2 == null || drawable == null) {
                String valueOf = String.valueOf(drawable2);
                String valueOf2 = String.valueOf(drawable);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73 + String.valueOf(valueOf2).length());
                sb.append("Cannot resolve required attributes. selectableItemBackground=");
                sb.append(valueOf);
                sb.append(" background=");
                sb.append(valueOf2);
                Log.e("RecyclerItemAdapter", sb.toString());
            } else {
                inflate.setBackgroundDrawable(new bizu(new Drawable[]{drawable, drawable2}));
            }
            obtainStyledAttributes.recycle();
        }
        inflate.setOnClickListener(new bizs(this, bizr));
        return bizr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        bizr bizr = (bizr) acm;
        bizl f = mo64926f(i);
        boolean bJ = f.mo64908bJ();
        bizr.f122391s = bJ;
        bizr.f201a.setClickable(bJ);
        bizr.f201a.setEnabled(bJ);
        bizr.f201a.setFocusable(bJ);
        bizr.f122392t = f;
        f.mo48939a(bizr.f201a);
    }

    /* renamed from: a */
    public final void mo64910a(bizp bizp, int i) {
        mo180h(i, 1);
    }

    /* renamed from: a */
    public final void mo58967a(bizp bizp, int i, int i2) {
        mo178d(i, i2);
    }
}
