package com.google.android.setupdesign.items;

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

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ButtonBarItem extends AbstractItem implements bizq {

    /* renamed from: a */
    private final ArrayList f151490a = new ArrayList();

    /* renamed from: b */
    private boolean f151491b = true;

    public ButtonBarItem() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo48939a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.removeAllViews();
        ArrayList arrayList = this.f151490a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ButtonItem buttonItem = (ButtonItem) arrayList.get(i);
            Button button = buttonItem.f151495e;
            if (button == null) {
                Context context = linearLayout.getContext();
                int i2 = buttonItem.f151494d;
                if (i2 != 0) {
                    context = new ContextThemeWrapper(context, i2);
                }
                buttonItem.f151495e = (Button) LayoutInflater.from(context).inflate((int) C0126R.C0128layout.sud_button, (ViewGroup) null, false);
                buttonItem.f151495e.setOnClickListener(buttonItem);
            } else if (button.getParent() instanceof ViewGroup) {
                ((ViewGroup) buttonItem.f151495e.getParent()).removeView(buttonItem.f151495e);
            }
            buttonItem.f151495e.setEnabled(buttonItem.f151492a);
            buttonItem.f151495e.setText(buttonItem.f151493b);
            buttonItem.f151495e.setId(buttonItem.f151489c);
            linearLayout.addView(buttonItem.f151495e);
        }
        view.setId(this.f151489c);
    }

    /* renamed from: b */
    public final int mo64907b() {
        return C0126R.C0128layout.sud_items_button_bar;
    }

    /* renamed from: bJ */
    public final boolean mo64908bJ() {
        return false;
    }

    /* renamed from: g */
    public final int mo64923g() {
        return this.f151491b ? 1 : 0;
    }

    /* renamed from: b */
    public final bizp mo64921b(int i) {
        if (this.f151489c == i) {
            return this;
        }
        ArrayList arrayList = this.f151490a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            bizp b = ((ButtonItem) arrayList.get(i2)).mo64921b(i);
            i2++;
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    public ButtonBarItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo58966a(bizp bizp) {
        if (bizp instanceof ButtonItem) {
            this.f151490a.add((ButtonItem) bizp);
            return;
        }
        throw new UnsupportedOperationException("Cannot add non-button item to Button Bar");
    }
}
