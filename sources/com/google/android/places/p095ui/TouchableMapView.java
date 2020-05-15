package com.google.android.places.p095ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;

/* renamed from: com.google.android.places.ui.TouchableMapView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TouchableMapView extends MapView {

    /* renamed from: a */
    public View.OnTouchListener f151373a = null;

    public TouchableMapView(Context context) {
        super(context);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f151373a;
        if (onTouchListener == null || !onTouchListener.onTouch(this, motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f151373a = onTouchListener;
    }

    public TouchableMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchableMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TouchableMapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
    }
}
