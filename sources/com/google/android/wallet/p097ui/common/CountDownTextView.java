package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.wallet.ui.common.CountDownTextView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CountDownTextView extends TextView {

    /* renamed from: a */
    public long f151928a = -1;

    /* renamed from: b */
    boolean f151929b;

    /* renamed from: c */
    public bmoz f151930c;

    /* renamed from: d */
    CountDownTimer f151931d;

    public CountDownTextView(Context context) {
        super(context);
    }

    /* renamed from: b */
    private final void m118433b() {
        CountDownTimer countDownTimer = this.f151931d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f151931d = null;
        }
        bkci bkci = new bkci(this, mo71873a());
        this.f151931d = bkci;
        bkci.start();
    }

    /* renamed from: a */
    public final long mo71873a() {
        if (this.f151928a > -1) {
            return (this.f151928a + this.f151930c.f130274a) - SystemClock.elapsedRealtime();
        } else if (!this.f151929b) {
            return this.f151930c.f130274a;
        } else {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bmoz bmoz = this.f151930c;
        if (bmoz == null) {
            throw new IllegalArgumentException("CountDownTextField needs to be set before starting count down.");
        } else if (!this.f151929b && bmoz.f130274a > 0 && this.f151928a == -1) {
            this.f151928a = SystemClock.elapsedRealtime();
            this.f151929b = true;
            m118433b();
        } else if (this.f151928a > -1) {
            m118433b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CountDownTimer countDownTimer = this.f151931d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f151931d = null;
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        this.f151928a = bundle.getLong("timeWhenRefreshStartedMs");
        this.f151929b = bundle.getBoolean("timeCountDownStarted");
        this.f151930c = (bmoz) bjvp.m104730a(bundle, "countDownProto", (bxxk) bmoz.f130272c.mo74142c(7));
        mo71875a(mo71873a());
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bundle.putLong("timeWhenRefreshStartedMs", this.f151928a);
        bundle.putBoolean("timeCountDownStarted", this.f151929b);
        bjvp.m104736a(bundle, "countDownProto", this.f151930c);
        return bundle;
    }

    public CountDownTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo71874a(long j, long j2) {
        int a = bmoy.m108244a(this.f151930c.f130275b);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 1) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bmoy.m108244a(this.f151930c.f130275b);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.toString(i - 1);
            throw new IllegalArgumentException(String.format(locale, "Not supported format type: %s", objArr));
        }
        return String.format(getResources().getConfiguration().locale, "%01d:%02d", Long.valueOf(j), Long.valueOf(j2));
    }

    public CountDownTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo71875a(long j) {
        long j2 = ((j + 500) / 1000) * 1000;
        if (j2 > 0) {
            long minutes = TimeUnit.MILLISECONDS.toMinutes(j2);
            setText(mo71874a(minutes, TimeUnit.MILLISECONDS.toSeconds(j2) - TimeUnit.MINUTES.toSeconds(minutes)));
        } else {
            setText(mo71874a(0, 0));
        }
        requestLayout();
    }
}
