package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NavigationBar extends LinearLayout implements View.OnClickListener {
    public NavigationBar(Context context) {
        super(m4745a(context));
        m4746a();
    }

    public void onClick(View view) {
    }

    public NavigationBar(Context context, AttributeSet attributeSet) {
        super(m4745a(context), attributeSet);
        m4746a();
    }

    /* renamed from: a */
    private static Context m4745a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C0126R.attr.suwNavBarTheme, 16842800, 16842801});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId == 0) {
            float[] fArr = new float[3];
            float[] fArr2 = new float[3];
            Color.colorToHSV(obtainStyledAttributes.getColor(1, 0), fArr);
            Color.colorToHSV(obtainStyledAttributes.getColor(2, 0), fArr2);
            if (fArr[2] > fArr2[2]) {
                resourceId = C0126R.style.SuwNavBarThemeDark;
            } else {
                resourceId = C0126R.style.SuwNavBarThemeLight;
            }
        }
        obtainStyledAttributes.recycle();
        return new ContextThemeWrapper(context, resourceId);
    }

    public NavigationBar(Context context, AttributeSet attributeSet, int i) {
        super(m4745a(context), attributeSet, i);
        m4746a();
    }

    /* renamed from: a */
    private final void m4746a() {
        View.inflate(getContext(), C0126R.C0128layout.suw_navbar_view, this);
        Button button = (Button) findViewById(C0126R.C0129id.suw_navbar_next);
        Button button2 = (Button) findViewById(C0126R.C0129id.suw_navbar_back);
        Button button3 = (Button) findViewById(C0126R.C0129id.suw_navbar_more);
    }
}
