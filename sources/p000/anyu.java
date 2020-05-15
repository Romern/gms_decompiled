package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: anyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anyu extends ArrayAdapter {

    /* renamed from: a */
    private int f77895a = 2;

    /* renamed from: b */
    private String f77896b = null;

    /* renamed from: c */
    private final CharSequence[] f77897c;

    public anyu(Context context, Object[] objArr) {
        super(context, (int) C0126R.C0128layout.plus_oob_gender_spinner_item, objArr);
        this.f77897c = (CharSequence[]) objArr;
    }

    /* renamed from: a */
    public final void mo42466a() {
        this.f77895a = 1;
    }

    /* renamed from: b */
    public final boolean mo42468b() {
        return this.f77895a == 0;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        TextView textView = (TextView) view2;
        int i2 = this.f77895a;
        if (i2 == 0) {
            textView.setText(this.f77896b);
            textView.setContentDescription(this.f77896b);
        } else if (i2 != 1) {
            textView.setText(this.f77897c[i]);
            textView.setContentDescription(this.f77897c[i]);
        } else {
            textView.setText(this.f77897c[i]);
            textView.setContentDescription(this.f77897c[i]);
            notifyDataSetChanged();
            this.f77895a = 2;
        }
        return view2;
    }

    /* renamed from: a */
    public final void mo42467a(CharSequence charSequence) {
        this.f77896b = (String) charSequence;
        this.f77895a = 0;
    }
}
