package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;

/* renamed from: bkby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkby extends LinearLayout implements View.OnTouchListener, View.OnClickListener, bkbn, bjwg {

    /* renamed from: a */
    final bjwf f123972a = new bjwf();

    /* renamed from: b */
    public LogContext f123973b;

    /* renamed from: c */
    final TextView f123974c;

    /* renamed from: d */
    final ImageView f123975d;

    /* renamed from: e */
    private bmdb f123976e;

    /* renamed from: f */
    private bjwn f123977f;

    /* renamed from: g */
    private View.OnClickListener f123978g;

    /* renamed from: h */
    private bkbo f123979h;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, bkby, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public bkby(Context context) {
        super(context);
        int i;
        LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.layout_chip_button, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C0126R.attr.isLightTheme});
        boolean z = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (!z) {
            i = C0126R.C0127drawable.wallet_uic_chip_button_background_dark;
        } else {
            i = C0126R.C0127drawable.wallet_uic_chip_button_background_light;
        }
        setBackgroundResource(i);
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-2, (int) getResources().getDimension(C0126R.dimen.wallet_uic_chip_button_height)));
        setClickable(false);
        this.f123974c = (TextView) findViewById(C0126R.C0129id.chip_button_text);
        ImageView imageView = (ImageView) findViewById(C0126R.C0129id.remove_icon);
        this.f123975d = imageView;
        imageView.setOnClickListener(this);
        this.f123975d.setOnTouchListener(this);
    }

    /* renamed from: a */
    public final Button mo52703a() {
        return null;
    }

    /* renamed from: a */
    public final void mo52706a(bkbo bkbo) {
        this.f123979h = bkbo;
    }

    /* renamed from: a */
    public final void mo65787a(LogContext logContext) {
        this.f123973b = logContext;
    }

    /* renamed from: b */
    public final View mo52710b() {
        return this;
    }

    /* renamed from: c */
    public final bmdb mo65788c() {
        return this.f123976e;
    }

    /* renamed from: ch */
    public final bjwp mo60054ch() {
        return this.f123972a;
    }

    /* renamed from: ci */
    public final bjwm mo60055ci() {
        if (this.f123977f == null) {
            this.f123977f = new bjwn(this);
        }
        return this.f123977f;
    }

    public final CharSequence getText() {
        return this.f123974c.getText();
    }

    public final boolean hasOnClickListeners() {
        return super.hasOnClickListeners() && !(this.f123978g == null && this.f123979h == null);
    }

    public void onClick(View view) {
        bjst.m104533b(this.f123973b, this.f123976e.f128770b);
        this.f123972a.mo65585a();
        View.OnClickListener onClickListener = this.f123978g;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
        bkbo bkbo = this.f123979h;
        if (bkbo != null) {
            int a = bmda.m107911a(this.f123976e.f128777i);
            if (a == 0) {
                a = 1;
            }
            bkbo.mo51918c(a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        bmdb bmdb = (bmdb) bjvp.m104730a(bundle, "buttonSpec", (bxxk) bmdb.f128767k.mo74142c(7));
        if (this.f123976e == null) {
            this.f123976e = bmdb;
        }
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        bjvp.m104736a(bundle, "buttonSpec", this.f123976e);
        return bundle;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            setActivated(true);
        } else if (action == 1 || action == 3) {
            setActivated(false);
        }
        return false;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        bkfr.m105608d(this, z);
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f123978g = onClickListener;
    }

    /* renamed from: a */
    public final void mo52707a(bmdb bmdb) {
        this.f123976e = bmdb;
        String str = "";
        this.f123974c.setText((bmdb.f128769a & 8) != 0 ? bmdb.f128773e : str);
        ImageView imageView = this.f123975d;
        Context context = getContext();
        Object[] objArr = new Object[1];
        if ((bmdb.f128769a & 8) != 0) {
            str = bmdb.f128773e;
        }
        objArr[0] = str;
        imageView.setContentDescription(context.getString(C0126R.string.wallet_uic_chip_button_remove_content_description, objArr));
    }
}
