package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p002v7.widget.AppCompatButton;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.wallet.ui.common.ButtonComponent */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ButtonComponent extends AppCompatButton implements Runnable, View.OnClickListener, bkbn, bjwm, bjwg {

    /* renamed from: c */
    public bmdb f151904c;

    /* renamed from: d */
    public LogContext f151905d;

    /* renamed from: e */
    bjsv f151906e = new bjsv(this);

    /* renamed from: f */
    public View.OnClickListener f151907f;

    /* renamed from: g */
    final bjwf f151908g = new bjwf();

    /* renamed from: h */
    boolean f151909h = true;

    /* renamed from: i */
    boolean f151910i = true;

    /* renamed from: j */
    int f151911j;

    /* renamed from: k */
    boolean f151912k;

    /* renamed from: l */
    private bkbo f151913l;

    /* renamed from: m */
    private boolean f151914m;

    /* renamed from: n */
    private long f151915n = -1;

    /* renamed from: o */
    private boolean f151916o;

    /* renamed from: p */
    private boolean f151917p;

    public ButtonComponent(Context context) {
        super(context);
        m118404a((AttributeSet) null);
    }

    /* renamed from: a */
    private static long m118402a(long j) {
        return ((j + 500) / 1000) * 1000;
    }

    /* renamed from: b */
    private final void m118405b(boolean z) {
        if (isEnabled() != z) {
            m118407d(z);
        }
        super.setEnabled(z);
    }

    /* renamed from: c */
    private final void m118406c(boolean z) {
        this.f151912k = z;
        super.setVisibility(!z ? this.f151911j : 8);
    }

    /* renamed from: d */
    private final void m118407d(boolean z) {
        int i;
        bmdb bmdb = this.f151904c;
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

    /* renamed from: e */
    private final void m118408e() {
        bmdb bmdb = this.f151904c;
        if (bmdb != null && (bmdb.f128769a & 4) != 0) {
            bmno bmno = bmdb.f128772d;
            if (bmno == null) {
                bmno = bmno.f130138m;
            }
            if (bjvn.m104718a(bmno.f130142c)) {
                Context context = getContext();
                Context context2 = getContext();
                bmno bmno2 = this.f151904c.f128772d;
                if (bmno2 == null) {
                    bmno2 = bmno.f130138m;
                }
                m118403a(C1391tv.m20459b(context, bkfr.m105586b(context2, bmno2.f130142c)));
                m118407d(isEnabled());
            }
        }
    }

    /* renamed from: a */
    public final Button mo52703a() {
        return this;
    }

    /* renamed from: a */
    public final void mo52706a(bkbo bkbo) {
        this.f151913l = bkbo;
    }

    /* renamed from: a */
    public final void mo65787a(LogContext logContext) {
        this.f151905d = logContext;
        this.f151906e.f123258a = logContext;
    }

    /* renamed from: b */
    public final View mo52710b() {
        return this;
    }

    /* renamed from: c */
    public final bmdb mo65788c() {
        return this.f151904c;
    }

    /* renamed from: ch */
    public final bjwp mo60054ch() {
        return this.f151908g;
    }

    /* renamed from: ci */
    public final bjwm mo60055ci() {
        return null;
    }

    public final boolean hasOnClickListeners() {
        return super.hasOnClickListeners() && !(this.f151907f == null && this.f151913l == null);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        this.f151916o = true;
        super.onAttachedToWindow();
        this.f151906e.mo65506a();
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
        bjst.m104533b(this.f151905d, this.f151904c.f128770b);
        if (!this.f151908g.mo65585a() || !this.f151908g.f123506a) {
            bmdb bmdb = this.f151904c;
            int i = bmdb.f128769a;
            String str = "";
            int i2 = 1;
            if ((i & 64) != 0 && bmdb.f128776h > 0) {
                m118405b(false);
                this.f151915n = SystemClock.elapsedRealtime();
                this.f151917p = true;
                long a = m118402a((long) this.f151904c.f128776h);
                Locale locale = getResources().getConfiguration().locale;
                bmdb bmdb2 = this.f151904c;
                if ((bmdb2.f128769a & 16) != 0) {
                    str = bmdb2.f128774f;
                }
                setText(String.format(locale, str, Long.valueOf(a / 1000)));
                postDelayed(this, Math.min(a, 1000L));
            } else if ((i & 32) != 0 && !bmdb.f128775g.isEmpty()) {
                setText(this.f151904c.f128775g);
            } else {
                bmdb bmdb3 = this.f151904c;
                if ((bmdb3.f128769a & 8) != 0) {
                    str = bmdb3.f128773e;
                }
                setText(str);
            }
            View.OnClickListener onClickListener = this.f151907f;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            bkbo bkbo = this.f151913l;
            if (bkbo != null) {
                int a2 = bmda.m107911a(this.f151904c.f128777i);
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
        this.f151916o = false;
        removeCallbacks(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e3, code lost:
        if (r0.f128771c == r1.f128771c) goto L_0x00e5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015e  */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(getClass().getClassLoader());
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        bmdb bmdb = (bmdb) bjvp.m104730a(bundle, "buttonSpec", (bxxk) bmdb.f128767k.mo74142c(7));
        if (this.f151904c == null) {
            this.f151904c = bmdb;
        }
        bmdb bmdb2 = this.f151904c;
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
            bmdb bmdb3 = this.f151904c;
            setText((bmdb3.f128769a & 8) != 0 ? bmdb3.f128773e : "");
            m118408e();
            this.f151909h = bundle.getBoolean("enabledByView", true);
            this.f151910i = bundle.getBoolean("enabledByDependencyGraph", true);
            this.f151911j = bundle.getInt("requestedVisibility", 0);
            this.f151912k = bundle.getBoolean("hiddenByDependencyGraph", false);
            if (this.f151915n == -1) {
                m118405b(false);
                run();
            } else {
                if (!this.f151909h || !this.f151910i) {
                    z = false;
                }
                m118405b(z);
            }
            this.f151906e.mo65507a(bundle.getBundle("impressionLoggerState"));
            if (!this.f151912k) {
                i = this.f151911j;
            }
            super.setVisibility(i);
        }
        this.f151915n = bundle.getLong("timeWhenRefreshStartedMs");
        this.f151917p = bundle.getBoolean("requestedEnabledState");
        setText(bundle.getCharSequence("text"));
        m118408e();
        this.f151909h = bundle.getBoolean("enabledByView", true);
        this.f151910i = bundle.getBoolean("enabledByDependencyGraph", true);
        this.f151911j = bundle.getInt("requestedVisibility", 0);
        this.f151912k = bundle.getBoolean("hiddenByDependencyGraph", false);
        if (this.f151915n == -1) {
        }
        this.f151906e.mo65507a(bundle.getBundle("impressionLoggerState"));
        if (!this.f151912k) {
        }
        super.setVisibility(i);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bjvp.m104736a(bundle, "buttonSpec", this.f151904c);
        bundle.putLong("timeWhenRefreshStartedMs", this.f151915n);
        bundle.putBoolean("requestedEnabledState", this.f151917p);
        bundle.putCharSequence("text", getText());
        bundle.putBoolean("enabledByView", this.f151909h);
        bundle.putBoolean("enabledByDependencyGraph", this.f151910i);
        bundle.putInt("requestedVisibility", this.f151911j);
        bundle.putBoolean("hiddenByDependencyGraph", this.f151912k);
        bundle.putBundle("impressionLoggerState", this.f151906e.mo65508b());
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
        bmdb bmdb = this.f151904c;
        if ((bmdb.f128769a & 64) == 0 || bmdb.f128776h <= 0) {
            throw new IllegalStateException("Timer based text changes not needed!");
        }
        long a = m118402a((this.f151915n + ((long) this.f151904c.f128776h)) - SystemClock.elapsedRealtime());
        if (a > 0) {
            Locale locale = getResources().getConfiguration().locale;
            bmdb bmdb2 = this.f151904c;
            setText(String.format(locale, (bmdb2.f128769a & 16) != 0 ? bmdb2.f128774f : "", Long.valueOf(a / 1000)));
            postDelayed(this, Math.min(a, 1000L));
            return;
        }
        mo71854d();
    }

    public final void setEnabled(boolean z) {
        if (this.f151915n == -1) {
            this.f151909h = z;
            boolean z2 = false;
            if (z && this.f151910i) {
                z2 = true;
            }
            m118405b(z2);
            return;
        }
        this.f151917p = z;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f151907f = onClickListener;
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (this.f151914m && !TextUtils.isEmpty(charSequence)) {
            charSequence = charSequence.toString().toUpperCase(getResources().getConfiguration().locale);
        }
        super.setText(charSequence, bufferType);
    }

    public final void setVisibility(int i) {
        this.f151911j = i;
        if (this.f151912k) {
            i = 8;
        }
        super.setVisibility(i);
    }

    /* renamed from: a */
    private final void m118403a(Drawable drawable) {
        Drawable[] b = C1334rs.m20108b(this);
        C1334rs.m20107b(this, drawable, b[1], b[2], b[3]);
    }

    /* renamed from: a */
    private final void m118404a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{C0126R.attr.uicFormButtonTextCapitalized});
        this.f151914m = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.f151911j = getVisibility();
        super.setOnClickListener(this);
    }

    /* renamed from: d */
    public final void mo71854d() {
        if (this.f151915n != -1) {
            this.f151915n = -1;
            setEnabled(this.f151917p);
            removeCallbacks(this);
            bmdb bmdb = this.f151904c;
            if ((bmdb.f128769a & 32) != 0 && !bmdb.f128775g.isEmpty()) {
                setText(this.f151904c.f128775g);
                return;
            }
            bmdb bmdb2 = this.f151904c;
            setText((bmdb2.f128769a & 8) != 0 ? bmdb2.f128773e : "");
        }
    }

    public ButtonComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118404a(attributeSet);
    }

    /* renamed from: a */
    public final void mo52707a(bmdb bmdb) {
        if (((bmdb.f128769a & 8) == 0 || bmdb.f128773e.isEmpty()) && (bmdb.f128769a & 4) == 0) {
            throw new IllegalArgumentException("Button spec without initial text or icon received.");
        }
        int i = bmdb.f128769a;
        if ((i & 64) != 0 && bmdb.f128776h > 0) {
            if ((i & 16) == 0 || bmdb.f128774f.isEmpty()) {
                throw new IllegalArgumentException("Re-send timer w/o a refresh message received.");
            } else if (bmdb.f128776h < 1000) {
                throw new IllegalArgumentException("Re-send timer less then 1 second which is the minimum displayable unit.");
            }
        }
        bmdb bmdb2 = this.f151904c;
        if (!(bmdb2 == null || (bmdb2.f128769a & 4) == 0)) {
            m118403a((Drawable) null);
        }
        this.f151904c = bmdb;
        if (this.f151916o) {
            removeCallbacks(this);
            this.f151915n = -1;
        }
        bmdb bmdb3 = this.f151904c;
        setText((bmdb3.f128769a & 8) != 0 ? bmdb3.f128773e : "");
        m118408e();
        mo71853a(this.f151904c.f128771c);
        this.f151906e.f123259b = bmdb.f128770b;
    }

    public ButtonComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118404a(attributeSet);
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        int a = bmmb.m108166a(bmmv.f130058d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            m118406c(false);
        } else if (i2 == 2) {
            mo71854d();
        } else if (i2 == 7) {
            mo71853a(false);
        } else if (i2 == 11) {
            m118406c(true);
        } else if (i2 != 16) {
            Object[] objArr = new Object[1];
            int a2 = bmmb.m108166a(bmmv.f130058d);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalArgumentException(String.format("Unsupported resulting action type: %s", objArr));
        } else {
            mo71853a(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo71853a(boolean z) {
        this.f151910i = z;
        if (this.f151915n == -1 && z != isEnabled()) {
            boolean z2 = false;
            if (this.f151909h && this.f151910i) {
                z2 = true;
            }
            m118405b(z2);
        }
    }
}
