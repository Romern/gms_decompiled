package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NavigationBar extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    public Button f151533a;

    /* renamed from: b */
    public Button f151534b;

    /* renamed from: c */
    public Button f151535c;

    /* renamed from: d */
    private bjbh f151536d;

    public NavigationBar(Context context) {
        super(m117917a(context));
        m117918a();
    }

    public void onClick(View view) {
        bjbh bjbh = this.f151536d;
        if (bjbh == null) {
            return;
        }
        if (view == this.f151534b) {
            bjbh.mo7769bd();
        } else if (view == this.f151533a) {
            bjbh.mo7768a();
        }
    }

    public NavigationBar(Context context, AttributeSet attributeSet) {
        super(m117917a(context), attributeSet);
        m117918a();
    }

    /* renamed from: a */
    private static Context m117917a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C0126R.attr.sudNavBarTheme, 16842800, 16842801});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId == 0) {
            float[] fArr = new float[3];
            float[] fArr2 = new float[3];
            Color.colorToHSV(obtainStyledAttributes.getColor(1, 0), fArr);
            Color.colorToHSV(obtainStyledAttributes.getColor(2, 0), fArr2);
            if (fArr[2] > fArr2[2]) {
                resourceId = C0126R.style.SudNavBarThemeDark;
            } else {
                resourceId = C0126R.style.SudNavBarThemeLight;
            }
        }
        obtainStyledAttributes.recycle();
        return new ContextThemeWrapper(context, resourceId);
    }

    public NavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(m117917a(context), attributeSet, i);
        m117918a();
    }

    /* renamed from: a */
    private final void m117918a() {
        View.inflate(getContext(), C0126R.C0128layout.sud_navbar_view, this);
        this.f151533a = (Button) findViewById(C0126R.C0129id.sud_navbar_next);
        this.f151534b = (Button) findViewById(C0126R.C0129id.sud_navbar_back);
        this.f151535c = (Button) findViewById(C0126R.C0129id.sud_navbar_more);
    }

    /* renamed from: a */
    public final void mo71422a(bjbh bjbh) {
        this.f151536d = bjbh;
        if (bjbh != null) {
            this.f151534b.setOnClickListener(this);
            this.f151533a.setOnClickListener(this);
        }
    }
}
