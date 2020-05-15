package com.google.android.gms.walletp2p.feature.widgets.alertpage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AlertPage extends LinearLayout {

    /* renamed from: a */
    private final Button f110739a;

    /* renamed from: b */
    private final TextView f110740b;

    /* renamed from: c */
    private final ImageView f110741c;

    /* renamed from: d */
    private final TextView f110742d;

    /* renamed from: e */
    private final Button f110743e;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.walletp2p.feature.widgets.alertpage.AlertPage, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public AlertPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (chlq.m148935b()) {
            LayoutInflater.from(context).inflate((int) C0126R.C0128layout.walletp2p_alert_page, (ViewGroup) this, true);
        } else {
            LayoutInflater.from(context).inflate((int) C0126R.C0128layout.walletp2p_alert_page_m1_deprecated, (ViewGroup) this, true);
        }
        setOrientation(1);
        this.f110739a = (Button) findViewById(C0126R.C0129id.action_button);
        this.f110740b = (TextView) findViewById(C0126R.C0129id.alert_content);
        this.f110741c = (ImageView) findViewById(C0126R.C0129id.alert_icon);
        this.f110742d = (TextView) findViewById(C0126R.C0129id.alert_title);
        this.f110743e = (Button) findViewById(C0126R.C0129id.cancel_button);
    }

    /* renamed from: a */
    public final void mo60203a(Drawable drawable, String str, String str2, String str3, View.OnClickListener onClickListener, String str4, View.OnClickListener onClickListener2) {
        this.f110741c.setImageDrawable(drawable);
        this.f110742d.setText(str);
        axmq.m82730a(this.f110740b, str2);
        this.f110743e.setText(str3);
        this.f110743e.setOnClickListener(onClickListener);
        if (!stm.m36302d(str4) && onClickListener2 != null) {
            this.f110739a.setText(str4);
            this.f110739a.setOnClickListener(onClickListener2);
            this.f110739a.setVisibility(0);
            return;
        }
        this.f110739a.setVisibility(8);
    }

    public final void sendAccessibilityEvent(int i) {
        super.sendAccessibilityEvent(i);
        this.f110742d.sendAccessibilityEvent(i);
    }
}
