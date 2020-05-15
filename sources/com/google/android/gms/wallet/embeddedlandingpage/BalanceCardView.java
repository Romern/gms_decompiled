package com.google.android.gms.wallet.embeddedlandingpage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BalanceCardView extends CardView {

    /* renamed from: g */
    public ViewGroup f110136g;

    /* renamed from: h */
    public InfoMessageView f110137h;

    /* renamed from: i */
    public TextView f110138i;

    /* renamed from: j */
    public ViewGroup f110139j;

    /* renamed from: k */
    public ProgressBar f110140k;

    /* renamed from: l */
    public InfoMessageView f110141l;

    /* renamed from: m */
    public InfoMessageView f110142m;

    /* renamed from: n */
    public ViewGroup f110143n;

    /* renamed from: o */
    public Button f110144o;

    /* renamed from: p */
    public final ArrayList f110145p = new ArrayList();

    /* renamed from: q */
    public final ArrayList f110146q = new ArrayList();

    /* renamed from: r */
    public bwhu f110147r;

    /* renamed from: s */
    public bjxv f110148s;

    /* renamed from: t */
    public bkdb f110149t;

    /* renamed from: u */
    public int f110150u;

    public BalanceCardView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo59900a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f110136g.removeView((View) arrayList.get(i));
        }
        arrayList.clear();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f110136g = (ViewGroup) findViewById(C0126R.C0129id.content_view);
        this.f110137h = (InfoMessageView) findViewById(C0126R.C0129id.title);
        this.f110139j = (ViewGroup) findViewById(C0126R.C0129id.progress_bar_container);
        this.f110138i = (TextView) findViewById(C0126R.C0129id.balance);
        this.f110140k = (ProgressBar) findViewById(C0126R.C0129id.progress_bar);
        this.f110141l = (InfoMessageView) findViewById(C0126R.C0129id.progress_bar_completion_condition);
        this.f110142m = (InfoMessageView) findViewById(C0126R.C0129id.progress_bar_status_description);
        this.f110143n = (ViewGroup) findViewById(C0126R.C0129id.sub_title_container);
        this.f110150u = (int) getResources().getDimension(C0126R.dimen.wallet_elp_balance_card_content_margin_large);
        Drawable progressDrawable = this.f110140k.getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                drawableArr[i] = layerDrawable.getDrawable(i);
                if (i == 1) {
                    Drawable mutate = drawableArr[1].mutate();
                    int i2 = Build.VERSION.SDK_INT;
                    drawableArr[1] = mutate;
                    C1173lt.m19601a(mutate, bkfr.m105606d(getContext(), (int) C0126R.attr.uicColorMaterialAccent));
                    Drawable drawable = drawableArr[1];
                }
            }
            this.f110140k.setProgressDrawable(new LayerDrawable(drawableArr));
        }
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        bkfr.m105608d(this, z);
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    public BalanceCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BalanceCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
