package p000;

import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

/* renamed from: aaui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aaui implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ EditText f56600a;

    /* renamed from: b */
    final /* synthetic */ LinearLayout f56601b;

    /* renamed from: c */
    final /* synthetic */ aauj f56602c;

    public aaui(aauj aauj, EditText editText, LinearLayout linearLayout) {
        this.f56602c = aauj;
        this.f56600a = editText;
        this.f56601b = linearLayout;
    }

    public void onClick(View view) {
        aauj aauj = this.f56602c;
        EditText editText = this.f56600a;
        if (editText.hasFocus()) {
            int indexOf = aauj.f56604b.indexOf(editText) - 1;
            if (indexOf >= 0) {
                ((EditText) aauj.f56604b.get(indexOf)).requestFocus();
            } else {
                aauj.f56603a.requestFocus();
            }
        }
        aauj.f56604b.remove(editText);
        aauj.mo31803a();
        this.f56602c.removeView(this.f56601b);
    }
}
