package com.google.android.gms.wallet.p088ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import java.security.Signature;

/* renamed from: com.google.android.gms.wallet.ui.common.FingerprintButton */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FingerprintButton extends LinearLayout implements awgb {

    /* renamed from: a */
    ImageWithCaptionView f110435a;

    /* renamed from: b */
    TextView f110436b;

    /* renamed from: c */
    FingerprintManager f110437c;

    /* renamed from: d */
    public CancellationSignal f110438d;

    /* renamed from: e */
    public awzd f110439e;

    /* renamed from: f */
    public int f110440f;

    /* renamed from: g */
    public bmck f110441g;

    /* renamed from: h */
    public LogContext f110442h;

    /* renamed from: i */
    public String f110443i;

    /* renamed from: j */
    public boolean f110444j = true;

    /* renamed from: k */
    FingerprintManager.AuthenticationCallback f110445k;

    /* renamed from: l */
    public FingerprintManager.CryptoObject f110446l;

    /* renamed from: m */
    private Runnable f110447m;

    /* renamed from: n */
    private boolean f110448n = false;

    public FingerprintButton(Context context) {
        super(context);
        m94191a(context);
    }

    /* renamed from: a */
    private final void m94191a(Context context) {
        if (bjyw.m104942c(getContext())) {
            this.f110445k = new awzc(this);
            inflate(context, C0126R.C0128layout.wallet_view_fingerprint_button, this);
            this.f110436b = (TextView) findViewById(C0126R.C0129id.help_text);
            this.f110435a = (ImageWithCaptionView) findViewById(C0126R.C0129id.fingerprint_icon);
            this.f110437c = (FingerprintManager) context.getSystemService(FingerprintManager.class);
            mo60058a();
        }
    }

    /* renamed from: c */
    private final boolean m94192c() {
        return this.f110441g != null;
    }

    /* renamed from: b */
    public final void mo60063b() {
        if (m94192c()) {
            boolean z = false;
            if (this.f110439e != null && this.f110444j && isEnabled() && getVisibility() == 0) {
                z = true;
            }
            CancellationSignal cancellationSignal = this.f110438d;
            if (cancellationSignal == null || cancellationSignal.isCanceled()) {
                if (z) {
                    if (this.f110437c != null) {
                        CancellationSignal cancellationSignal2 = new CancellationSignal();
                        this.f110438d = cancellationSignal2;
                        this.f110437c.authenticate(this.f110446l, cancellationSignal2, 0, this.f110445k, null);
                        return;
                    }
                    return;
                }
            } else if (z) {
                return;
            }
            CancellationSignal cancellationSignal3 = this.f110438d;
            if (cancellationSignal3 != null) {
                cancellationSignal3.cancel();
                this.f110438d = null;
            }
        }
    }

    /* renamed from: h */
    public final void mo52066h(Bundle bundle) {
        Signature signature;
        if ("completeFingerprintAuthentication".equals(awgc.m79889a(bundle)) && this.f110439e != null && getContext() != null && getVisibility() == 0) {
            awzd awzd = this.f110439e;
            FingerprintManager.CryptoObject cryptoObject = this.f110446l;
            if (cryptoObject != null) {
                signature = cryptoObject.getSignature();
            } else {
                signature = null;
            }
            ((awyq) awzd).mo52769a(1, signature);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f110447m);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("superInstance"));
            this.f110443i = bundle.getString("error");
            mo60059a(bundle.getInt("state"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        removeCallbacks(this.f110447m);
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstance", super.onSaveInstanceState());
        bundle.putInt("state", this.f110440f);
        bundle.putString("error", this.f110443i);
        return bundle;
    }

    public final void setEnabled(boolean z) {
        boolean isEnabled = isEnabled();
        super.setEnabled(z);
        if (!isEnabled && z) {
            mo60058a();
        } else {
            mo60063b();
        }
        this.f110435a.setEnabled(z);
        this.f110436b.setEnabled(z);
        this.f110436b.setAlpha(!z ? 0.3f : 1.0f);
    }

    public final void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (visibility != 0 && i == 0) {
            mo60058a();
        } else {
            mo60063b();
        }
    }

    public FingerprintButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m94191a(context);
    }

    public FingerprintButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m94191a(context);
    }

    public FingerprintButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m94191a(context);
    }

    /* renamed from: a */
    public final void mo60058a() {
        this.f110443i = null;
        mo60059a(0);
        mo60063b();
    }

    /* renamed from: a */
    public final void mo60059a(int i) {
        String str;
        String str2;
        String str3;
        this.f110440f = i;
        if (!m94192c()) {
            return;
        }
        if (bjyw.m104942c(getContext())) {
            this.f110435a.clearColorFilter();
            this.f110436b.setTextAppearance(C0126R.style.WalletInfoMessageText);
            int i2 = this.f110440f;
            bmno bmno = null;
            if (i2 == 0) {
                TextView textView = this.f110436b;
                bmck bmck = this.f110441g;
                if (bmck == null || (2 & bmck.f128700a) == 0) {
                    str = null;
                } else {
                    str = bmck.f128702c;
                }
                textView.setText(str);
                ImageWithCaptionView imageWithCaptionView = this.f110435a;
                bmck bmck2 = this.f110441g;
                if (bmck2 != null && (bmno = bmck2.f128703d) == null) {
                    bmno = bmno.f130138m;
                }
                imageWithCaptionView.mo71992a(bmno, awia.m79973a(), ((Boolean) awir.f94488a.mo58455c()).booleanValue());
            } else if (i2 == 1) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C0126R.attr.colorAccent});
                int color = obtainStyledAttributes.getColor(0, -16777216);
                obtainStyledAttributes.recycle();
                this.f110436b.setTextColor(color);
                TextView textView2 = this.f110436b;
                bmck bmck3 = this.f110441g;
                if (bmck3 == null || (bmck3.f128700a & 8) == 0) {
                    str2 = null;
                } else {
                    str2 = bmck3.f128704e;
                }
                textView2.setText(str2);
                ImageWithCaptionView imageWithCaptionView2 = this.f110435a;
                bmck bmck4 = this.f110441g;
                if (bmck4 != null && (bmno = bmck4.f128705f) == null) {
                    bmno = bmno.f130138m;
                }
                imageWithCaptionView2.mo71992a(bmno, awia.m79973a(), ((Boolean) awir.f94488a.mo58455c()).booleanValue());
                this.f110435a.setColorFilter(color);
                removeCallbacks(this.f110447m);
                awgc a = awgc.m79888a(this, "completeFingerprintAuthentication");
                this.f110447m = a;
                postDelayed(a, ((Long) awih.f94444e.mo58455c()).longValue());
            } else if (i2 == 2) {
                this.f110436b.setTextColor(getResources().getColor(C0126R.color.wallet_uic_error_text_color_light));
                TextView textView3 = this.f110436b;
                bmck bmck5 = this.f110441g;
                if (bmck5 == null || (bmck5.f128700a & 32) == 0) {
                    str3 = null;
                } else {
                    str3 = bmck5.f128706g;
                }
                textView3.setText(str3);
                ImageWithCaptionView imageWithCaptionView3 = this.f110435a;
                bmck bmck6 = this.f110441g;
                if (bmck6 != null && (bmno = bmck6.f128707h) == null) {
                    bmno = bmno.f130138m;
                }
                imageWithCaptionView3.mo71992a(bmno, awia.m79973a(), ((Boolean) awir.f94488a.mo58455c()).booleanValue());
            } else if (i2 == 3) {
                this.f110436b.setTextColor(getResources().getColor(C0126R.color.wallet_uic_error_text_color_light));
                this.f110436b.setText(this.f110443i);
                ImageWithCaptionView imageWithCaptionView4 = this.f110435a;
                bmck bmck7 = this.f110441g;
                if (bmck7 != null && (bmno = bmck7.f128707h) == null) {
                    bmno = bmno.f130138m;
                }
                imageWithCaptionView4.mo71992a(bmno, awia.m79973a(), ((Boolean) awir.f94488a.mo58455c()).booleanValue());
            } else {
                throw new IllegalStateException("Invalid state for FingerprintButton");
            }
        } else {
            throw new IllegalStateException("Fingerprint auth not supported on this device.");
        }
    }

    /* renamed from: a */
    public final void mo60060a(awzd awzd) {
        this.f110439e = awzd;
        mo60063b();
    }

    /* renamed from: a */
    public final void mo60061a(String str) {
        requestFocus();
        this.f110443i = str;
        mo60059a(3);
    }

    /* renamed from: a */
    public final void mo60062a(boolean z) {
        if (this.f110448n != z) {
            this.f110448n = z;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
            if (this.f110448n) {
                setOrientation(1);
                this.f110436b.setPadding(0, C1280ps.m19925i(this.f110436b), 0, 0);
                layoutParams.gravity = 1;
            } else {
                setOrientation(0);
                this.f110436b.setPadding(this.f110436b.getPaddingTop(), 0, 0, 0);
                layoutParams.gravity = 8388611;
            }
            setLayoutParams(layoutParams);
        }
    }
}
