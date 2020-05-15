package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import java.util.ArrayList;

/* renamed from: avit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avit extends View.AccessibilityDelegate {

    /* renamed from: a */
    final /* synthetic */ aviv f93247a;

    /* renamed from: b */
    private final CheckBox f93248b;

    public avit(aviv aviv, CheckBox checkBox) {
        this.f93247a = aviv;
        this.f93248b = checkBox;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        ArrayList arrayList = new ArrayList();
        view.addChildrenForAccessibility(arrayList);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) arrayList.get(i2);
            if (view2 instanceof TextView) {
                sb.append(((TextView) view2).getText());
                sb.append(" ");
            }
        }
        Fragment fragment = this.f93247a.f93255c;
        if (!this.f93248b.isChecked()) {
            i = C0126R.string.udc_expand_content_description;
        } else {
            i = C0126R.string.udc_collapse_content_description;
        }
        sb.append(fragment.getString(i));
        accessibilityNodeInfo.setContentDescription(sb.toString());
    }
}
