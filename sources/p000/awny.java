package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.wallet.paymentmethods.InstrumentRankSpinner;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import java.util.ArrayList;

/* renamed from: awny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awny extends acm implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    /* renamed from: F */
    public static final /* synthetic */ int f94679F = 0;

    /* renamed from: A */
    final LinearLayout f94680A;

    /* renamed from: B */
    final ViewGroup f94681B;

    /* renamed from: C */
    final InstrumentRankSpinner f94682C;

    /* renamed from: D */
    final InfoMessageView f94683D;

    /* renamed from: E */
    public bmfq f94684E;

    /* renamed from: G */
    private final awob f94685G;

    /* renamed from: s */
    public final CardView f94686s;

    /* renamed from: t */
    public final RelativeLayout f94687t;

    /* renamed from: u */
    final TextView f94688u;

    /* renamed from: v */
    final ArrayList f94689v = new ArrayList();

    /* renamed from: w */
    final ArrayList f94690w = new ArrayList();

    /* renamed from: x */
    final ImageView f94691x;

    /* renamed from: y */
    final ImageWithCaptionView f94692y;

    /* renamed from: z */
    final View f94693z;

    public awny(CardView cardView, awob awob) {
        super(cardView);
        this.f94686s = cardView;
        this.f94685G = awob;
        this.f94687t = (RelativeLayout) cardView.findViewById(C0126R.C0129id.upper_section);
        this.f94688u = (TextView) this.f94686s.findViewById(C0126R.C0129id.title);
        this.f94691x = (ImageView) this.f94686s.findViewById(C0126R.C0129id.alert_icon);
        this.f94692y = (ImageWithCaptionView) this.f94686s.findViewById(C0126R.C0129id.image);
        this.f94693z = this.f94686s.findViewById(C0126R.C0129id.divider);
        this.f94680A = (LinearLayout) this.f94686s.findViewById(C0126R.C0129id.action_groups);
        this.f94681B = (ViewGroup) this.f94686s.findViewById(C0126R.C0129id.default_actions_container);
        this.f94682C = (InstrumentRankSpinner) this.f94686s.findViewById(C0126R.C0129id.instrument_rank_spinner);
        this.f94683D = (InfoMessageView) this.f94686s.findViewById(C0126R.C0129id.instrument_rank_text);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo52350b(boolean z) {
        this.f94688u.setEnabled(z);
        int size = this.f94689v.size();
        for (int i = 0; i < size; i++) {
            ((InfoMessageView) this.f94689v.get(i)).setEnabled(z);
        }
        int size2 = this.f94690w.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((TextView) this.f94690w.get(i2)).setEnabled(z);
        }
        if (this.f94691x.getVisibility() == 0) {
            this.f94691x.setEnabled(z);
        }
        this.f94692y.setEnabled(z);
        if (this.f94681B.getVisibility() == 0) {
            int childCount = this.f94681B.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                bmfp bmfp = this.f94684E.f129148f;
                if (bmfp == null) {
                    bmfp = bmfp.f129133e;
                }
                if (!bmfp.f129138d) {
                    bmfp bmfp2 = this.f94684E.f129148f;
                    if (bmfp2 == null) {
                        bmfp2 = bmfp.f129133e;
                    }
                    if (!((bmfl) bmfp2.f129137c.get(i3)).f129125h) {
                        this.f94681B.getChildAt(i3).setEnabled(z);
                    }
                }
            }
        }
        if (this.f94682C.getVisibility() == 0) {
            bmfp bmfp3 = this.f94684E.f129149g;
            if (bmfp3 == null) {
                bmfp3 = bmfp.f129133e;
            }
            if (!bmfp3.f129138d) {
                this.f94682C.setEnabled(z);
            }
        }
        if (this.f94683D.getVisibility() == 0) {
            this.f94683D.setEnabled(z);
        }
    }

    public void onClick(View view) {
        if (view instanceof Button) {
            awob awob = this.f94685G;
            int d = mo323d();
            int indexOfChild = this.f94681B.indexOfChild(view);
            awoa awoa = (awoa) awob;
            if (awoa.f94695d != null) {
                bmfp bmfp = ((bmfq) awoa.f94694a.get(d)).f129148f;
                if (bmfp == null) {
                    bmfp = bmfp.f129133e;
                }
                awoa.f94695d.mo52354a((bmfl) bmfp.f129137c.get(indexOfChild));
            }
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (view != null && this.f94682C.f110306a != i) {
            awob awob = this.f94685G;
            int d = mo323d();
            awoa awoa = (awoa) awob;
            if (awoa.f94695d != null) {
                bmfp bmfp = ((bmfq) awoa.f94694a.get(d)).f129149g;
                if (bmfp == null) {
                    bmfp = bmfp.f129133e;
                }
                awoa.f94695d.mo52354a((bmfl) bmfp.f129137c.get(i));
                awoa.f94697f = this;
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
