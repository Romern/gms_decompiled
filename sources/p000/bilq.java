package p000;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.places.p095ui.placepicker.ConfirmView$SavedState;

/* renamed from: bilq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bilq extends FrameLayout implements bilh {

    /* renamed from: a */
    public final bilk f120846a;

    /* renamed from: b */
    private final TextView f120847b;

    /* renamed from: c */
    private final ProgressBar f120848c;

    /* renamed from: d */
    private final TextView f120849d;

    /* renamed from: e */
    private final TextView f120850e;

    /* renamed from: f */
    private final ViewGroup f120851f;

    /* renamed from: g */
    private final ImageView f120852g;

    /* renamed from: h */
    private final MapView f120853h;

    /* renamed from: i */
    private final Button f120854i;

    /* renamed from: j */
    private boolean f120855j = false;

    public bilq(Context context, bilk bilk) {
        super(context);
        setId(C0126R.C0129id.place_picker_confirm_view);
        this.f120846a = bilk;
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.place_picker_confirm, this);
        MapView mapView = (MapView) findViewById(C0126R.C0129id.map);
        this.f120853h = mapView;
        try {
            mapView.mo43845a((Bundle) null);
        } catch (NullPointerException e) {
        }
        this.f120853h.setClickable(false);
        this.f120853h.mo43844a(new biln());
        this.f120847b = (TextView) findViewById(C0126R.C0129id.card_title);
        this.f120848c = (ProgressBar) findViewById(C0126R.C0129id.place_details_loading_spinner);
        this.f120849d = (TextView) findViewById(C0126R.C0129id.place_name);
        this.f120850e = (TextView) findViewById(C0126R.C0129id.place_address);
        this.f120852g = (ImageView) findViewById(C0126R.C0129id.place_photo);
        this.f120851f = (ViewGroup) findViewById(C0126R.C0129id.place_media_container);
        Button button = (Button) findViewById(C0126R.C0129id.confirm_button);
        this.f120854i = button;
        button.setOnClickListener(new bill(this));
        findViewById(C0126R.C0129id.cancel_button).setOnClickListener(new bilm(this));
        int i = Build.VERSION.SDK_INT;
        ((ViewGroup) findViewById(C0126R.C0129id.card_container)).setLayoutTransition(new LayoutTransition());
        this.f120846a.mo64738a(this);
    }

    /* renamed from: a */
    public final void mo64731a(int i) {
        this.f120847b.setText(i);
    }

    /* renamed from: b */
    public final void mo64736b(CharSequence charSequence) {
        this.f120850e.setText(charSequence);
        this.f120850e.setVisibility(!TextUtils.isEmpty(charSequence) ? 0 : 8);
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ConfirmView$SavedState confirmView$SavedState = (ConfirmView$SavedState) parcelable;
        super.onRestoreInstanceState(confirmView$SavedState.getSuperState());
        this.f120855j = confirmView$SavedState.f151430a;
        int i = Build.VERSION.SDK_INT;
        this.f120851f.animate().cancel();
        this.f120851f.setAlpha(1.0f);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        ConfirmView$SavedState confirmView$SavedState = new ConfirmView$SavedState(super.onSaveInstanceState());
        confirmView$SavedState.f151430a = this.f120855j;
        return confirmView$SavedState;
    }

    /* renamed from: a */
    public final void mo64732a(Bitmap bitmap) {
        this.f120852g.setImageBitmap(bitmap);
        this.f120852g.setVisibility(bitmap == null ? 8 : 0);
    }

    /* renamed from: a */
    public final void mo64733a(LatLng latLng) {
        if (!this.f120855j) {
            int i = Build.VERSION.SDK_INT;
            this.f120851f.setAlpha(0.0f);
            this.f120851f.animate().setStartDelay(500).setDuration(300).alpha(1.0f);
            this.f120855j = true;
        }
        this.f120853h.mo43844a(new bilo(latLng));
    }

    /* renamed from: a */
    public final void mo64734a(CharSequence charSequence) {
        this.f120849d.setText(charSequence);
        this.f120849d.setVisibility(!TextUtils.isEmpty(charSequence) ? 0 : 8);
    }

    /* renamed from: a */
    public final void mo64735a(boolean z) {
        this.f120848c.setVisibility(!z ? 8 : 0);
    }
}
