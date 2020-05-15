package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: iks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class iks implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Button f21240a;

    /* renamed from: b */
    final /* synthetic */ Button f21241b;

    /* renamed from: c */
    final /* synthetic */ View f21242c;

    /* renamed from: d */
    final /* synthetic */ LinearLayout f21243d;

    public iks(Button button, Button button2, View view, LinearLayout linearLayout) {
        this.f21240a = button;
        this.f21241b = button2;
        this.f21242c = view;
        this.f21243d = linearLayout;
    }

    public final void run() {
        int max = Math.max(this.f21240a.getWidth(), this.f21241b.getWidth());
        if (this.f21242c.getWidth() < max + max + 48) {
            View view = this.f21242c;
            LinearLayout linearLayout = this.f21243d;
            Button button = this.f21240a;
            Button button2 = this.f21241b;
            ikv.f21257i.mo25414c("Stack the buttons because text length is too long", new Object[0]);
            if (linearLayout.getOrientation() != 1) {
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                layoutParams.width = -2;
                linearLayout.setLayoutParams(layoutParams);
                button.setMaxLines(10);
                button2.setMaxLines(10);
                ViewGroup.LayoutParams layoutParams2 = button.getLayoutParams();
                ViewGroup.LayoutParams layoutParams3 = button2.getLayoutParams();
                layoutParams2.width = -1;
                layoutParams3.width = -1;
                button.setLayoutParams(layoutParams2);
                button2.setLayoutParams(layoutParams3);
                for (int childCount = linearLayout.getChildCount() - 1; childCount >= 0; childCount--) {
                    linearLayout.removeViewAt(childCount);
                }
                linearLayout.addView(button);
                linearLayout.addView(button2);
                View findViewById = view.findViewById(C0126R.C0129id.left_border);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
                View findViewById2 = view.findViewById(C0126R.C0129id.right_border);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                }
                linearLayout.requestLayout();
                return;
            }
            return;
        }
        Button button3 = this.f21240a;
        Button button4 = this.f21241b;
        String str = ikv.f21250a;
        int width = button3.getWidth();
        int width2 = button4.getWidth();
        if (width != 0 && width2 != 0 && width != width2) {
            int max2 = Math.max(width, width2);
            button3.setMinWidth(max2);
            button4.setMinWidth(max2);
        }
    }
}
