package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aqte */
final /* synthetic */ class aqte implements View.OnClickListener {

    /* renamed from: a */
    private final aqtg f86745a;

    /* renamed from: b */
    private final String f86746b;

    /* renamed from: c */
    private final View f86747c;

    public aqte(aqtg aqtg, String str, View view) {
        this.f86745a = aqtg;
        this.f86746b = str;
        this.f86747c = view;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rr.a(android.widget.PopupWindow, boolean):void
     arg types: [android.widget.PopupWindow, int]
     candidates:
      rr.a(android.widget.PopupWindow, int):void
      rr.a(android.widget.PopupWindow, boolean):void */
    public void onClick(View view) {
        aqtg aqtg = this.f86745a;
        String str = this.f86746b;
        View view2 = this.f86747c;
        PopupWindow popupWindow = new PopupWindow(LayoutInflater.from(aqtg.f86751a).inflate((int) C0126R.C0128layout.custom_tooltip, (ViewGroup) null), -2, -2);
        ((TextView) popupWindow.getContentView().findViewById(C0126R.C0129id.source_context)).setText(str);
        popupWindow.getContentView().measure(0, 0);
        C1333rr.m20101a(popupWindow, true);
        int dimensionPixelOffset = aqtg.f86751a.getResources().getDimensionPixelOffset(C0126R.dimen.entry_icon_size) + aqtg.f86751a.getResources().getDimensionPixelOffset(C0126R.dimen.communicate_card_entry_padding) + aqtg.f86751a.getResources().getDimensionPixelOffset(C0126R.dimen.custom_tooltip_padding);
        int measuredWidth = dimensionPixelOffset - popupWindow.getContentView().getMeasuredWidth();
        if (((AccessibilityManager) aqtg.f86752b.getContext().getSystemService("accessibility")).isEnabled()) {
            popupWindow.setFocusable(true);
        } else {
            popupWindow.setOutsideTouchable(true);
        }
        popupWindow.showAsDropDown(view2, measuredWidth, dimensionPixelOffset);
    }
}
