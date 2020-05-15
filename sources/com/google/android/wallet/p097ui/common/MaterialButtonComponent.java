package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.button.MaterialButton;
import com.google.android.wallet.clientlog.LogContext;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.wallet.ui.common.MaterialButtonComponent */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MaterialButtonComponent extends MaterialButton implements Runnable, View.OnClickListener, bkbn, bjwm, bjwg {

    /* renamed from: c */
    private bkbo f152124c;

    /* renamed from: g */
    public bmdb f152125g;

    /* renamed from: h */
    public LogContext f152126h;

    /* renamed from: i */
    public bjsv f152127i = new bjsv(this);

    /* renamed from: j */
    public View.OnClickListener f152128j;

    /* renamed from: k */
    public final bjwf f152129k = new bjwf();

    /* renamed from: l */
    protected boolean f152130l;

    /* renamed from: m */
    protected boolean f152131m;

    /* renamed from: n */
    public boolean f152132n = true;

    /* renamed from: o */
    public boolean f152133o = true;

    /* renamed from: p */
    public int f152134p;

    /* renamed from: q */
    public boolean f152135q;

    /* renamed from: r */
    private long f152136r = -1;

    /* renamed from: s */
    private boolean f152137s;

    public MaterialButtonComponent(Context context) {
        super(context);
        m118648a((AttributeSet) null);
    }

    /* renamed from: a */
    private static long m118647a(long j) {
        return ((j + 500) / 1000) * 1000;
    }

    /* renamed from: e */
    private final void m118649e(boolean z) {
        this.f152135q = z;
        mo52704a(!z ? this.f152134p : 8);
    }

    /* renamed from: a */
    public Button mo52703a() {
        return this;
    }

    /* renamed from: a */
    public void mo52706a(bkbo bkbo) {
        this.f152124c = bkbo;
    }

    /* renamed from: a */
    public final void mo65787a(LogContext logContext) {
        this.f152126h = logContext;
        this.f152127i.f123258a = logContext;
    }

    /* renamed from: b */
    public View mo52710b() {
        return this;
    }

    /* renamed from: c */
    public final bmdb mo65788c() {
        return this.f152125g;
    }

    /* renamed from: ch */
    public final bjwp mo60054ch() {
        return this.f152129k;
    }

    /* renamed from: ci */
    public final bjwm mo60055ci() {
        return null;
    }

    /* renamed from: d */
    public final void mo72033d(boolean z) {
        this.f152133o = z;
        if (this.f152136r == -1 && z != isEnabled()) {
            boolean z2 = false;
            if (this.f152132n && this.f152133o) {
                z2 = true;
            }
            mo52709a(z2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo72034f() {
        bmdb bmdb = this.f152125g;
        if (bmdb != null && (bmdb.f128769a & 4) != 0) {
            bmno bmno = bmdb.f128772d;
            if (bmno == null) {
                bmno = bmno.f130138m;
            }
            if (bjvn.m104718a(bmno.f130142c)) {
                Context context = getContext();
                Context context2 = getContext();
                bmno bmno2 = this.f152125g.f128772d;
                if (bmno2 == null) {
                    bmno2 = bmno.f130138m;
                }
                mo52705a(C1391tv.m20459b(context, bkfr.m105586b(context2, bmno2.f130142c)));
                mo52711b(isEnabled());
            }
        }
    }

    /* renamed from: g */
    public final void mo72035g() {
        if (this.f152136r != -1) {
            this.f152136r = -1;
            setEnabled(this.f152137s);
            removeCallbacks(this);
            bmdb bmdb = this.f152125g;
            if ((bmdb.f128769a & 32) != 0 && !bmdb.f128775g.isEmpty()) {
                mo52708a(this.f152125g.f128775g);
                return;
            }
            bmdb bmdb2 = this.f152125g;
            mo52708a((bmdb2.f128769a & 8) != 0 ? bmdb2.f128773e : "");
        }
    }

    public final boolean hasOnClickListeners() {
        return super.hasOnClickListeners() && !(this.f152128j == null && this.f152124c == null);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        this.f152131m = true;
        super.onAttachedToWindow();
        this.f152127i.mo65506a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    public void onClick(View view) {
        bjst.m104533b(this.f152126h, this.f152125g.f128770b);
        if (!this.f152129k.mo65585a() || !this.f152129k.f123506a) {
            bmdb bmdb = this.f152125g;
            int i = bmdb.f128769a;
            String str = "";
            int i2 = 1;
            if ((i & 64) != 0 && bmdb.f128776h > 0) {
                mo52709a(false);
                this.f152136r = SystemClock.elapsedRealtime();
                this.f152137s = true;
                long a = m118647a((long) this.f152125g.f128776h);
                Locale locale = getResources().getConfiguration().locale;
                bmdb bmdb2 = this.f152125g;
                if ((bmdb2.f128769a & 16) != 0) {
                    str = bmdb2.f128774f;
                }
                mo52708a(String.format(locale, str, Long.valueOf(a / 1000)));
                postDelayed(this, Math.min(a, 1000L));
            } else if ((i & 32) != 0 && !bmdb.f128775g.isEmpty()) {
                mo52708a(this.f152125g.f128775g);
            } else {
                bmdb bmdb3 = this.f152125g;
                if ((bmdb3.f128769a & 8) != 0) {
                    str = bmdb3.f128773e;
                }
                mo52708a(str);
            }
            View.OnClickListener onClickListener = this.f152128j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            bkbo bkbo = this.f152124c;
            if (bkbo != null) {
                int a2 = bmda.m107911a(this.f152125g.f128777i);
                if (a2 != 0) {
                    i2 = a2;
                }
                bkbo.mo51918c(i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f152131m = false;
        removeCallbacks(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d8, code lost:
        if (r0.f128771c == r1.f128771c) goto L_0x00da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0153  */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        bmdb bmdb = (bmdb) bjvp.m104730a(bundle, "buttonSpec", (bxxk) bmdb.f128767k.mo74142c(7));
        if (this.f152125g == null) {
            this.f152125g = bmdb;
        }
        bmdb bmdb2 = this.f152125g;
        int i = 8;
        boolean z = true;
        if (!bmxi.m108538a(bmdb, bmdb2)) {
            if (!(bmdb == null || bmdb2 == null || ((((bmdb.f128769a & 32) == 0 || (bmdb2.f128769a & 32) == 0 || !bmdb.f128775g.equals(bmdb2.f128775g)) && ((bmdb.f128769a & 32) != 0 || (bmdb2.f128769a & 32) != 0)) || ((((bmdb.f128769a & 8) == 0 || (bmdb2.f128769a & 8) == 0 || !bmdb.f128773e.equals(bmdb2.f128773e)) && ((bmdb.f128769a & 8) != 0 || (bmdb2.f128769a & 8) != 0)) || (((bmdb.f128769a & 16) == 0 || (bmdb2.f128769a & 16) == 0 || !bmdb.f128774f.equals(bmdb2.f128774f)) && ((bmdb.f128769a & 16) != 0 || (bmdb2.f128769a & 16) != 0)))))) {
                int i2 = bmdb.f128769a;
                if ((i2 & 64) != 0 ? !((bmdb2.f128769a & 64) == 0 || bmdb.f128776h != bmdb2.f128776h) : (bmdb2.f128769a & 64) == 0) {
                    if ((i2 & 1) != 0 ? !((bmdb2.f128769a & 1) == 0 || bmdb.f128770b != bmdb2.f128770b) : (bmdb2.f128769a & 1) == 0) {
                    }
                }
            }
            bmdb bmdb3 = this.f152125g;
            mo52708a((bmdb3.f128769a & 8) != 0 ? bmdb3.f128773e : "");
            mo72034f();
            this.f152132n = bundle.getBoolean("enabledByView", true);
            this.f152133o = bundle.getBoolean("enabledByDependencyGraph", true);
            this.f152134p = bundle.getInt("requestedVisibility", 0);
            this.f152135q = bundle.getBoolean("hiddenByDependencyGraph", false);
            if (this.f152136r == -1) {
                mo52709a(false);
                run();
            } else {
                if (!this.f152132n || !this.f152133o) {
                    z = false;
                }
                mo52709a(z);
            }
            this.f152127i.mo65507a(bundle.getBundle("impressionLoggerState"));
            if (!this.f152135q) {
                i = this.f152134p;
            }
            mo52704a(i);
        }
        this.f152136r = bundle.getLong("timeWhenRefreshStartedMs");
        this.f152137s = bundle.getBoolean("requestedEnabledState");
        mo52708a(bundle.getCharSequence("text"));
        mo72034f();
        this.f152132n = bundle.getBoolean("enabledByView", true);
        this.f152133o = bundle.getBoolean("enabledByDependencyGraph", true);
        this.f152134p = bundle.getInt("requestedVisibility", 0);
        this.f152135q = bundle.getBoolean("hiddenByDependencyGraph", false);
        if (this.f152136r == -1) {
        }
        this.f152127i.mo65507a(bundle.getBundle("impressionLoggerState"));
        if (!this.f152135q) {
        }
        mo52704a(i);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bjvp.m104736a(bundle, "buttonSpec", this.f152125g);
        bundle.putLong("timeWhenRefreshStartedMs", this.f152136r);
        bundle.putBoolean("requestedEnabledState", this.f152137s);
        bundle.putCharSequence("text", getText());
        bundle.putBoolean("enabledByView", this.f152132n);
        bundle.putBoolean("enabledByDependencyGraph", this.f152133o);
        bundle.putInt("requestedVisibility", this.f152134p);
        bundle.putBoolean("hiddenByDependencyGraph", this.f152135q);
        bundle.putBundle("impressionLoggerState", this.f152127i.mo65508b());
        return bundle;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    public final void run() {
        bmdb bmdb = this.f152125g;
        if ((bmdb.f128769a & 64) == 0 || bmdb.f128776h <= 0) {
            throw new IllegalStateException("Timer based text changes not needed!");
        }
        long a = m118647a((this.f152136r + ((long) this.f152125g.f128776h)) - SystemClock.elapsedRealtime());
        if (a > 0) {
            Locale locale = getResources().getConfiguration().locale;
            bmdb bmdb2 = this.f152125g;
            mo52708a(String.format(locale, (bmdb2.f128769a & 16) != 0 ? bmdb2.f128774f : "", Long.valueOf(a / 1000)));
            postDelayed(this, Math.min(a, 1000L));
            return;
        }
        mo72035g();
    }

    public final void setEnabled(boolean z) {
        if (this.f152136r == -1) {
            this.f152132n = z;
            boolean z2 = false;
            if (z && this.f152133o) {
                z2 = true;
            }
            mo52709a(z2);
            return;
        }
        this.f152137s = z;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f152128j = onClickListener;
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f152130l && !TextUtils.isEmpty(charSequence)) {
            charSequence = charSequence.toString().toUpperCase(getResources().getConfiguration().locale);
        }
        super.setText(charSequence, bufferType);
    }

    public final void setVisibility(int i) {
        this.f152134p = i;
        if (this.f152135q) {
            i = 8;
        }
        mo52704a(i);
    }

    /* renamed from: a */
    private final void m118648a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{C0126R.attr.uicFormButtonTextCapitalized});
        this.f152130l = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.f152134p = getVisibility();
        super.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo52711b(boolean z) {
        int i;
        bmdb bmdb = this.f152125g;
        if (bmdb != null && (bmdb.f128769a & 4) != 0) {
            Drawable[] b = C1334rs.m20108b(this);
            Drawable drawable = b[0];
            if (drawable != null) {
                if (!z) {
                    i = 77;
                } else {
                    i = 255;
                }
                drawable.setAlpha(i);
            }
            C1334rs.m20107b(this, b[0], b[1], b[2], b[3]);
        }
    }

    public MaterialButtonComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118648a(attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52704a(int i) {
        super.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52705a(Drawable drawable) {
        Drawable[] b = C1334rs.m20108b(this);
        C1334rs.m20107b(this, drawable, b[1], b[2], b[3]);
    }

    public MaterialButtonComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118648a(attributeSet);
    }

    /* renamed from: a */
    public void mo52707a(bmdb bmdb) {
        if (((bmdb.f128769a & 8) == 0 || bmdb.f128773e.isEmpty()) && (bmdb.f128769a & 4) == 0) {
            throw new IllegalArgumentException("Button spec without initial text or icon received.");
        }
        int i = bmdb.f128769a;
        if ((i & 64) != 0 && bmdb.f128776h > 0) {
            if ((i & 16) == 0 || bmdb.f128774f.isEmpty()) {
                throw new IllegalArgumentException("Re-send timer w/o a refresh message received.");
            } else if (bmdb.f128776h < 1000) {
                throw new IllegalArgumentException("Re-send timer less than 1 second which is the minimum displayable unit.");
            }
        }
        bmdb bmdb2 = this.f152125g;
        if (!(bmdb2 == null || (bmdb2.f128769a & 4) == 0)) {
            mo52705a((Drawable) null);
        }
        this.f152125g = bmdb;
        if (this.f152131m) {
            removeCallbacks(this);
            this.f152136r = -1;
        }
        bmdb bmdb3 = this.f152125g;
        mo52708a((bmdb3.f128769a & 8) != 0 ? bmdb3.f128773e : "");
        mo72034f();
        mo72033d(this.f152125g.f128771c);
        this.f152127i.f123259b = bmdb.f128770b;
    }

    /* renamed from: a */
    public void mo51910a(bmmv bmmv, List list) {
        int a = bmmb.m108166a(bmmv.f130058d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            m118649e(false);
        } else if (i2 == 2) {
            mo72035g();
        } else if (i2 == 7) {
            mo72033d(false);
        } else if (i2 == 11) {
            m118649e(true);
        } else if (i2 != 16) {
            Object[] objArr = new Object[1];
            int a2 = bmmb.m108166a(bmmv.f130058d);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalArgumentException(String.format("Unsupported resulting action type: %s", objArr));
        } else {
            mo72033d(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52708a(CharSequence charSequence) {
        setText(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo52709a(boolean z) {
        if (isEnabled() != z) {
            mo52711b(z);
        }
        super.setEnabled(z);
    }
}
