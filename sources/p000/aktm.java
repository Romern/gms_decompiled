package p000;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.ocr.GiftCardOcrResult;
import com.google.android.gms.ocr.base.OcrImage;
import com.google.android.gms.ocr.processors.BlurDetectorImpl;
import com.google.android.gms.ocr.view.BoundingBox;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Collections;

/* renamed from: aktm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aktm extends akpv implements View.OnClickListener, akve {

    /* renamed from: A */
    private int f72747A;

    /* renamed from: B */
    private int f72748B;

    /* renamed from: C */
    private int f72749C;

    /* renamed from: D */
    private int f72750D;

    /* renamed from: E */
    private int f72751E;

    /* renamed from: F */
    private int f72752F;

    /* renamed from: G */
    private int f72753G;

    /* renamed from: H */
    private int f72754H;

    /* renamed from: I */
    private int f72755I;

    /* renamed from: l */
    aktu f72756l;

    /* renamed from: m */
    akur f72757m;

    /* renamed from: n */
    Vibrator f72758n;

    /* renamed from: o */
    BlurDetectorImpl f72759o;

    /* renamed from: p */
    public Button f72760p;

    /* renamed from: q */
    public OcrImage f72761q;

    /* renamed from: r */
    public long f72762r;

    /* renamed from: s */
    public Handler f72763s;

    /* renamed from: t */
    private ImageButton f72764t;

    /* renamed from: u */
    private FloatingActionButton f72765u;

    /* renamed from: v */
    private TextView f72766v;

    /* renamed from: w */
    private String f72767w;

    /* renamed from: x */
    private String f72768x;

    /* renamed from: y */
    private String f72769y;

    /* renamed from: z */
    private int f72770z;

    /* renamed from: a */
    public final void mo39846a(akpd akpd) {
        int i = this.f72750D;
        int i2 = this.f72751E;
        int i3 = this.f72752F;
        int i4 = this.f72753G;
        int i5 = this.f72754H;
        int i6 = this.f72755I;
        akpd.f72383c = i;
        akpd.f72384d = i2;
        akpd.f72385e = i3;
        akpd.f72386f = i4;
        akpd.f72387g = i5;
        akpd.f72388h = i6;
    }

    /* renamed from: b */
    public final void mo39847b(boolean z) {
        int i;
        String str;
        Button button = this.f72760p;
        int i2 = 4;
        if (!z) {
            i = 4;
        } else {
            i = 0;
        }
        button.setVisibility(i);
        FloatingActionButton floatingActionButton = this.f72765u;
        if (!z) {
            i2 = 0;
        }
        floatingActionButton.setVisibility(i2);
        this.f72764t.setVisibility(i2);
        this.f72764t.setEnabled(!z);
        TextView textView = this.f72766v;
        if (!z) {
            str = this.f72768x;
        } else {
            str = this.f72767w;
        }
        textView.setText(str);
        if (this.f72760p.getVisibility() == 0) {
            this.f72751E++;
        }
        if (this.f72764t.getVisibility() == 0) {
            this.f72753G++;
        }
        if (this.f72765u.getVisibility() == 0) {
            this.f72755I++;
        }
    }

    public void onClick(View view) {
        if (getActivity() != null && !getActivity().isFinishing()) {
            if (view.getId() == C0126R.C0129id.gift_card_camera_button) {
                this.f72750D++;
                mo39847b(false);
                this.f72402a.mo39725b();
                this.f72764t.setEnabled(true);
                this.f72765u.setEnabled(true);
                this.f72758n.vibrate(50);
            } else if (view.getId() == C0126R.C0129id.gift_card_redo_button) {
                this.f72752F++;
                this.f72402a.mo39719a();
                this.f72764t.setEnabled(false);
                this.f72765u.setEnabled(false);
                mo39847b(true);
            } else if (view.getId() == C0126R.C0129id.gift_card_done_button) {
                this.f72764t.setEnabled(false);
                this.f72765u.setEnabled(false);
                this.f72754H++;
                mo39683a(false);
                this.f72402a.mo39727c();
                this.f72758n.vibrate(50);
                OcrImage ocrImage = this.f72761q;
                if (ocrImage != null) {
                    this.f72756l.f72783a.mo39869a(ocrImage);
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f72763s = new adzt(Looper.getMainLooper());
        this.f72756l.f72785c.f72773a = this;
        this.f72402a.mo39722a(new aktk(this));
        Intent intent = getActivity().getIntent();
        this.f72767w = intent.getStringExtra("com.google.android.gms.ocr.INSTRUCTIONS");
        this.f72768x = intent.getStringExtra("com.google.android.gms.ocr.CONFIRMATION");
        this.f72769y = intent.getStringExtra("com.google.android.gms.ocr.CAMERA_BUTTON_LABEL");
        this.f72747A = intent.getIntExtra("com.google.android.gms.ocr.CAMERA_BUTTON_OUTER_COLOR", getResources().getColor(17170443));
        this.f72770z = intent.getIntExtra("com.google.android.gms.ocr.CAMERA_BUTTON_INNER_COLOR", getResources().getColor(17170432));
        this.f72748B = intent.getIntExtra("com.google.android.gms.ocr.CONFIRMATION_BUTTON_BACKGROUND_COLOR", getResources().getColor(C0126R.color.material_teal_500));
        this.f72749C = intent.getIntExtra("com.google.android.gms.ocr.REDO_BUTTON_BACKGROUND_COLOR", getResources().getColor(17170443));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        layoutInflater.inflate((int) C0126R.C0128layout.ocr_bounding_box, this.f72409h);
        ((BoundingBox) this.f72409h.findViewById(C0126R.C0129id.ocrCardWindow)).mo44750a();
        Button button = (Button) onCreateView.findViewById(C0126R.C0129id.gift_card_camera_button);
        this.f72760p = button;
        if (this.f72761q != null) {
            z = true;
        } else {
            z = false;
        }
        button.setEnabled(z);
        this.f72760p.setContentDescription(this.f72769y);
        this.f72760p.setOnClickListener(this);
        LayerDrawable layerDrawable = (LayerDrawable) this.f72760p.getBackground();
        ((GradientDrawable) layerDrawable.findDrawableByLayerId(C0126R.C0129id.outer_circle)).setColor(this.f72747A);
        ((GradientDrawable) layerDrawable.findDrawableByLayerId(C0126R.C0129id.inner_circle)).setColor(this.f72770z);
        ImageButton imageButton = (ImageButton) onCreateView.findViewById(C0126R.C0129id.gift_card_redo_button);
        this.f72764t = imageButton;
        ((GradientDrawable) imageButton.getBackground()).setColor(this.f72749C);
        this.f72764t.setOnClickListener(this);
        FloatingActionButton floatingActionButton = (FloatingActionButton) onCreateView.findViewById(C0126R.C0129id.gift_card_done_button);
        this.f72765u = floatingActionButton;
        floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(this.f72748B));
        this.f72765u.setOnClickListener(this);
        this.f72766v = (TextView) onCreateView.findViewById(C0126R.C0129id.giftCardInstructions);
        mo39847b(true);
        return onCreateView;
    }

    public final void onDestroy() {
        this.f72756l.f72783a.mo39868a();
        this.f72756l.f72784b.mo39838b();
        this.f72757m.mo39874a();
        super.onDestroy();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo39738a(Object obj) {
        akpd b = ((GiftCardOcrResult) obj).mo44705b();
        mo39846a(b);
        this.f72411j.mo39695a(Collections.singletonList(b.mo39640a()));
    }
}
