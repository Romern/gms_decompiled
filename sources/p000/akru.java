package p000;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.ocr.base.Boundaries;
import com.google.android.gms.ocr.base.OcrImage;
import com.google.android.gms.ocr.view.CardHintBoundingBox;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: akru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akru extends akpv implements View.OnClickListener, akvb, akve {

    /* renamed from: l */
    static final long f72518l = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: m */
    static final long f72519m = TimeUnit.SECONDS.toMillis(50);

    /* renamed from: A */
    private View f72520A;

    /* renamed from: B */
    private ImageView f72521B;

    /* renamed from: C */
    private View f72522C;

    /* renamed from: D */
    private View f72523D;

    /* renamed from: E */
    private View f72524E;

    /* renamed from: F */
    private boolean f72525F;

    /* renamed from: n */
    aksa f72526n;

    /* renamed from: o */
    akur f72527o;

    /* renamed from: p */
    Vibrator f72528p;

    /* renamed from: q */
    Handler f72529q;

    /* renamed from: r */
    public Runnable f72530r;

    /* renamed from: s */
    FloatingActionButton f72531s;

    /* renamed from: t */
    FloatingActionButton f72532t;

    /* renamed from: u */
    FloatingActionButton f72533u;

    /* renamed from: v */
    public OcrImage f72534v;

    /* renamed from: w */
    public boolean f72535w;

    /* renamed from: x */
    public boolean f72536x;

    /* renamed from: y */
    private CardHintBoundingBox f72537y;

    /* renamed from: z */
    private View f72538z;

    /* renamed from: c */
    private final void m60282c(boolean z) {
        this.f72525F = z;
        aksa aksa = this.f72526n;
        akru akru = null;
        aksa.f72548e.f72941a = !z ? null : this;
        akuy akuy = aksa.f72545b;
        if (z) {
            akru = this;
        }
        akuy.f72930d = akru;
    }

    /* renamed from: a */
    public final void mo39736a(Boundaries boundaries) {
        boolean z = false;
        if (boundaries != null) {
            mo39743g();
            mo39742f();
            CardHintBoundingBox cardHintBoundingBox = this.f72537y;
            boolean z2 = boundaries.f81263c != null;
            boolean z3 = boundaries.f81262b != null;
            boolean z4 = boundaries.f81264d != null;
            if (boundaries.f81265e != null) {
                z = true;
            }
            cardHintBoundingBox.mo44756a(z2, z3, z4, z);
            return;
        }
        this.f72537y.mo44756a(false, false, false, false);
    }

    /* renamed from: b */
    public final void mo39741b(boolean z) {
        this.f72531s.setEnabled(z);
        this.f72532t.setEnabled(z);
        this.f72533u.setEnabled(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bC */
    public final void mo39684bC() {
        super.mo39684bC();
        this.f72537y.mo44750a();
    }

    /* renamed from: f */
    public final void mo39742f() {
        Runnable runnable = this.f72530r;
        if (runnable != null) {
            this.f72529q.postDelayed(runnable, f72519m);
        }
    }

    /* renamed from: g */
    public final void mo39743g() {
        this.f72529q.removeCallbacks(this.f72530r);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akru.a(boolean, boolean):void
     arg types: [int, boolean]
     candidates:
      akru.a(com.google.android.gms.ocr.base.OcrImage, boolean):void
      akru.a(boolean, boolean):void */
    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.card_capture_camera_button) {
            mo39741b(false);
            this.f72526n.f72544a.mo39894b();
            akrj akrj = this.f72402a;
            akrj.m60269d();
            Handler handler = akrj.f72488d;
            if (handler != null) {
                handler.post(new akqw(akrj));
            }
            this.f72528p.vibrate(50);
        } else if (view.getId() == C0126R.C0129id.card_capture_redo_button) {
            this.f72534v = null;
            this.f72402a.mo39719a();
            mo39740a(false, this.f72535w);
            this.f72526n.f72544a.mo39893a();
        } else if (view.getId() == C0126R.C0129id.card_capture_done_button) {
            mo39741b(false);
            mo39683a(false);
            this.f72402a.mo39727c();
            this.f72405d.mo39751A();
            this.f72411j.mo39695a(Collections.singletonList(this.f72534v));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f72526n.f72546c.f72539a = this;
        this.f72402a.mo39722a(new akro(this));
        akrj akrj = this.f72402a;
        akrq akrq = new akrq(this);
        akrj.m60269d();
        akrj.f72503s = akrq;
        adzt adzt = new adzt(Looper.getMainLooper());
        this.f72529q = adzt;
        adzt.postDelayed(new akrr(this), f72518l);
        String string = getArguments().getString("com.google.android.gms.ocr.INSTRUCTIONS_MESSAGE");
        if (!TextUtils.isEmpty(string)) {
            this.f72530r = new akrs(this, string);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        layoutInflater.inflate((int) C0126R.C0128layout.ocr_credit_bounding_box, this.f72409h);
        this.f72537y = (CardHintBoundingBox) this.f72409h.findViewById(C0126R.C0129id.ocrCardWindow);
        int i = getArguments().getInt("com.google.android.gms.ocr.ACCENT_COLOR", getResources().getColor(C0126R.color.card_capture_payments_default_accent));
        FloatingActionButton floatingActionButton = (FloatingActionButton) onCreateView.findViewById(C0126R.C0129id.card_capture_camera_button);
        this.f72531s = floatingActionButton;
        floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(i));
        this.f72531s.setOnClickListener(this);
        FloatingActionButton floatingActionButton2 = (FloatingActionButton) onCreateView.findViewById(C0126R.C0129id.card_capture_redo_button);
        this.f72532t = floatingActionButton2;
        floatingActionButton2.setColorFilter(i);
        this.f72532t.setBackgroundTintList(ColorStateList.valueOf(-1));
        this.f72532t.setOnClickListener(this);
        FloatingActionButton floatingActionButton3 = (FloatingActionButton) onCreateView.findViewById(C0126R.C0129id.card_capture_done_button);
        this.f72533u = floatingActionButton3;
        floatingActionButton3.setColorFilter(i);
        this.f72533u.setBackgroundTintList(ColorStateList.valueOf(-1));
        this.f72533u.setOnClickListener(this);
        this.f72520A = onCreateView.findViewById(C0126R.C0129id.card_capture_message_text);
        this.f72521B = (ImageView) onCreateView.findViewById(C0126R.C0129id.card_capture_image_preview);
        this.f72522C = onCreateView.findViewById(C0126R.C0129id.card_capture_preview_overlay);
        this.f72523D = onCreateView.findViewById(C0126R.C0129id.card_capture_preview_text);
        this.f72524E = onCreateView.findViewById(C0126R.C0129id.card_capture_skip_scan_button_container);
        this.f72538z = onCreateView.findViewById(C0126R.C0129id.card_capture_buttons_wrapper);
        return onCreateView;
    }

    public final void onDestroy() {
        this.f72526n.f72547d.mo39868a();
        this.f72527o.mo39874a();
        super.onDestroy();
    }

    public final void onPause() {
        this.f72526n.f72544a.mo39894b();
        mo39743g();
        super.onPause();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akru.a(boolean, boolean):void
     arg types: [int, boolean]
     candidates:
      akru.a(com.google.android.gms.ocr.base.OcrImage, boolean):void
      akru.a(boolean, boolean):void */
    public final void onResume() {
        super.onResume();
        if (this.f72525F) {
            this.f72526n.f72544a.mo39893a();
        }
        if (this.f72534v != null) {
            this.f72534v = null;
            mo39740a(false, this.f72535w);
            mo39741b(true);
        }
        mo39742f();
    }

    public final void onStart() {
        super.onStart();
        m60282c(true);
    }

    public final void onStop() {
        m60282c(false);
        super.onStop();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akru.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      akru.a(com.google.android.gms.ocr.base.OcrImage, boolean):void
      akru.a(boolean, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo39737a(OcrImage ocrImage, boolean z) {
        if (z) {
            this.f72526n.f72544a.mo39894b();
            this.f72521B.setImageBitmap(akvi.m60556a(ocrImage.getData()));
            mo39740a(true, false);
        } else {
            mo39740a(true, true);
        }
        this.f72534v = ocrImage;
        this.f72537y.mo44756a(false, false, false, false);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo39738a(Object obj) {
        mo39739a((Runnable) new akrt(this, (OcrImage) obj));
    }

    /* renamed from: a */
    public final void mo39739a(Runnable runnable) {
        Activity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(runnable);
        }
    }

    /* renamed from: a */
    public final void mo39740a(boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        this.f72536x = z;
        View view = this.f72520A;
        int i6 = 8;
        int i7 = 0;
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        View view2 = this.f72524E;
        if (this.f72535w) {
            i2 = 8;
        } else {
            i2 = !z ? 0 : 8;
        }
        view2.setVisibility(i2);
        View view3 = this.f72538z;
        if (this.f72535w) {
            i3 = 0;
        } else {
            i3 = !z ? 8 : 0;
        }
        view3.setVisibility(i3);
        FloatingActionButton floatingActionButton = this.f72531s;
        if (!this.f72535w) {
            i4 = 8;
        } else {
            i4 = !z ? 0 : 8;
        }
        floatingActionButton.setVisibility(i4);
        FloatingActionButton floatingActionButton2 = this.f72532t;
        if (!z) {
            i5 = 8;
        } else {
            i5 = 0;
        }
        floatingActionButton2.setVisibility(i5);
        this.f72533u.setVisibility(i5);
        if (z2) {
            z3 = false;
        } else {
            z3 = z;
        }
        ImageView imageView = this.f72521B;
        if (z3) {
            i6 = 0;
        }
        imageView.setVisibility(i6);
        this.f72523D.setVisibility(i6);
        CardHintBoundingBox cardHintBoundingBox = this.f72537y;
        if (z3) {
            i7 = 4;
        }
        cardHintBoundingBox.setVisibility(i7);
        if (z3) {
            this.f72522C.setBackgroundColor(-16777216);
        } else {
            this.f72522C.setBackground(null);
        }
    }
}
