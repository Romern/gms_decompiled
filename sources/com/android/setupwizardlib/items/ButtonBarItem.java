package com.android.setupwizardlib.items;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

@Deprecated
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ButtonBarItem extends AbstractItem implements bme {

    /* renamed from: b */
    private final ArrayList f7208b = new ArrayList();

    /* renamed from: c */
    private boolean f7209c = true;

    public ButtonBarItem() {
    }

    /* renamed from: a */
    public final int mo3269a() {
        return this.f7209c ? 1 : 0;
    }

    /* renamed from: c */
    public final bmd mo3272c() {
        if (this.f7206a == C0126R.C0129id.android_auto_item) {
            return this;
        }
        ArrayList arrayList = this.f7208b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            bmd c = ((ButtonItem) arrayList.get(i)).mo3272c();
            i++;
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo3264d() {
        return false;
    }

    /* renamed from: e */
    public final int mo3265e() {
        return C0126R.C0128layout.suw_items_button_bar;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo3263a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.removeAllViews();
        ArrayList arrayList = this.f7208b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ButtonItem buttonItem = (ButtonItem) arrayList.get(i);
            Button button = buttonItem.f7213e;
            if (button == null) {
                Context context = linearLayout.getContext();
                int i2 = buttonItem.f7212d;
                if (i2 != 0) {
                    context = new ContextThemeWrapper(context, i2);
                }
                buttonItem.f7213e = (Button) LayoutInflater.from(context).inflate((int) C0126R.C0128layout.suw_button, (ViewGroup) null, false);
                buttonItem.f7213e.setOnClickListener(buttonItem);
            } else if (button.getParent() instanceof ViewGroup) {
                ((ViewGroup) buttonItem.f7213e.getParent()).removeView(buttonItem.f7213e);
            }
            buttonItem.f7213e.setEnabled(buttonItem.f7210b);
            buttonItem.f7213e.setText(buttonItem.f7211c);
            buttonItem.f7213e.setId(buttonItem.f7206a);
            linearLayout.addView(buttonItem.f7213e);
        }
        view.setId(this.f7206a);
    }

    public ButtonBarItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo3273a(bmd bmd) {
        if (bmd instanceof ButtonItem) {
            this.f7208b.add((ButtonItem) bmd);
            return;
        }
        throw new UnsupportedOperationException("Cannot add non-button item to Button Bar");
    }
}
