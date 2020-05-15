package com.google.android.gms.maps;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MapView extends FrameLayout {

    /* renamed from: a */
    private final vzm f79848a;

    public MapView(Context context) {
        super(context);
        this.f79848a = new vzm(this, context, null);
        m67155e();
    }

    /* renamed from: e */
    private final void m67155e() {
        setClickable(true);
    }

    /* renamed from: a */
    public final void mo43843a() {
        vzm vzm = this.f79848a;
        vzm.mo28999a(null, new vzk(vzm));
    }

    /* renamed from: b */
    public final void mo43846b() {
        vzm vzm = this.f79848a;
        afcq afcq = vzm.f50290c;
        if (afcq == null) {
            vzm.mo28998a(5);
            return;
        }
        try {
            afcq.f64184b.mo34820c();
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: c */
    public final void mo43848c() {
        vzm vzm = this.f79848a;
        afcq afcq = vzm.f50290c;
        if (afcq == null) {
            vzm.mo28998a(1);
            return;
        }
        try {
            afcq.f64184b.mo34821d();
        } catch (RemoteException e) {
            throw new afhl(e);
        }
    }

    /* renamed from: d */
    public final void mo43849d() {
        afcq afcq = this.f79848a.f50290c;
        if (afcq != null) {
            try {
                afcq.f64184b.mo34822e();
            } catch (RemoteException e) {
                throw new afhl(e);
            }
        }
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f79848a = new vzm(this, context, GoogleMapOptions.m67154a(context, attributeSet));
        m67155e();
    }

    /* renamed from: a */
    public final void mo43844a(afcs afcs) {
        sdo.m34967a("getMapAsync() must be called on the main thread");
        vzm vzm = this.f79848a;
        afcq afcq = vzm.f50290c;
        if (afcq == null) {
            vzm.f50291d.add(afcs);
        } else {
            afcq.mo34762a(afcs);
        }
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f79848a = new vzm(this, context, GoogleMapOptions.m67154a(context, attributeSet));
        m67155e();
    }

    /* renamed from: b */
    public final void mo43847b(Bundle bundle) {
        vzm vzm = this.f79848a;
        afcq afcq = vzm.f50290c;
        if (afcq != null) {
            try {
                Bundle bundle2 = new Bundle();
                afgt.m53061a(bundle, bundle2);
                afcq.f64184b.mo34819b(bundle2);
                afgt.m53061a(bundle2, bundle);
            } catch (RemoteException e) {
                throw new afhl(e);
            }
        } else {
            Bundle bundle3 = vzm.f50288a;
            if (bundle3 != null) {
                bundle.putAll(bundle3);
            }
        }
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f79848a = new vzm(this, context, googleMapOptions);
        m67155e();
    }

    /* renamed from: a */
    public final void mo43845a(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            vzm vzm = this.f79848a;
            vzm.mo28999a(bundle, new vzi(vzm, bundle));
            if (this.f79848a.f50290c == null) {
                rfi rfi = rfi.f42868a;
                Context context = getContext();
                int b = rfi.mo24590b(context);
                String c = sau.m34809c(context, b);
                String e = sau.m34811e(context, b);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                addView(linearLayout);
                TextView textView = new TextView(getContext());
                textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                textView.setText(c);
                linearLayout.addView(textView);
                Intent b2 = rfi.mo24591b(context, b, null);
                if (b2 != null) {
                    Button button = new Button(context);
                    button.setId(16908313);
                    button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                    button.setText(e);
                    linearLayout.addView(button);
                    button.setOnClickListener(new vzj(context, b2));
                }
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
