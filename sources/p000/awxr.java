package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.google.android.wallet.p097ui.common.MaterialButtonComponent;
import java.util.List;

/* renamed from: awxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awxr extends MaterialButtonComponent implements View.OnAttachStateChangeListener {

    /* renamed from: c */
    public final biyp f95244c;

    /* renamed from: r */
    private final Context f95245r;

    /* renamed from: s */
    private final awxy f95246s;

    public awxr(View.OnClickListener onClickListener, Context context, biyp biyp, awxy awxy) {
        super(context);
        ((MaterialButtonComponent) this).f152128j = onClickListener;
        this.f95245r = context;
        this.f95244c = biyp;
        this.f95246s = awxy;
        ((MaterialButtonComponent) this).f152127i = new bjsv(awxy.mo52736c(biyp));
        this.f95246s.mo52736c(biyp).addOnAttachStateChangeListener(this);
        if (C1280ps.m19871F(awxy.mo52736c(biyp))) {
            onViewAttachedToWindow(null);
        }
        this.f152134p = biyp.f122334d;
    }

    /* renamed from: a */
    public final Button mo52703a() {
        throw new UnsupportedOperationException("getButton is not supported");
    }

    /* renamed from: a */
    public final void mo52706a(bkbo bkbo) {
    }

    /* renamed from: b */
    public final View mo52710b() {
        throw new UnsupportedOperationException("getView is not supported");
    }

    public final CharSequence getText() {
        return this.f95244c.f122332b;
    }

    public final int getVisibility() {
        biyp biyp = this.f95244c;
        if (biyp != null) {
            return biyp.f122334d;
        }
        return 8;
    }

    public final boolean isEnabled() {
        return this.f95244c.f122333c;
    }

    public final void onViewAttachedToWindow(View view) {
        ((MaterialButtonComponent) this).f152131m = true;
        ((MaterialButtonComponent) this).f152127i.mo65506a();
    }

    public final void onViewDetachedFromWindow(View view) {
        ((MaterialButtonComponent) this).f152131m = false;
        this.f95246s.mo52734a(this.f95244c, this);
    }

    public final boolean postDelayed(Runnable runnable, long j) {
        return this.f95246s.mo52736c(this.f95244c).postDelayed(runnable, j);
    }

    public final boolean removeCallbacks(Runnable runnable) {
        return this.f95246s.mo52734a(this.f95244c, this);
    }

    public final void setId(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52704a(int i) {
        this.f95244c.mo64885a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo52711b(boolean z) {
        int i;
        bmdb bmdb = this.f152125g;
        if (bmdb != null && (bmdb.f128769a & 4) != 0) {
            Button c = this.f95246s.mo52736c(this.f95244c);
            Drawable[] b = C1334rs.m20108b(c);
            Drawable drawable = b[0];
            if (drawable != null) {
                if (!z) {
                    i = 77;
                } else {
                    i = 255;
                }
                drawable.setAlpha(i);
            }
            C1334rs.m20107b(c, b[0], b[1], b[2], b[3]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52705a(Drawable drawable) {
        Button c = this.f95246s.mo52736c(this.f95244c);
        Drawable[] b = C1334rs.m20108b(c);
        C1334rs.m20107b(c, drawable, b[1], b[2], b[3]);
    }

    /* renamed from: a */
    public final void mo52707a(bmdb bmdb) {
        super.mo52707a(bmdb);
        ((MaterialButtonComponent) this).f152127i.mo65506a();
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        awxy awxy;
        biyp biyp;
        super.mo51910a(bmmv, list);
        int a = bmmb.m108166a(bmmv.f130058d);
        if (a != 0 && a == 2 && (awxy = this.f95246s).f122314f != (biyp = this.f95244c)) {
            awxy.mo52733a(biyp);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52708a(CharSequence charSequence) {
        if (((MaterialButtonComponent) this).f152130l && !TextUtils.isEmpty(charSequence)) {
            charSequence = charSequence.toString().toUpperCase(this.f95245r.getResources().getConfiguration().locale);
        }
        this.f95244c.mo64887a(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52709a(boolean z) {
        super.mo52709a(z);
        this.f95244c.mo64888a(z);
    }
}
