package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

/* renamed from: bkak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkak extends bkfz {

    /* renamed from: e */
    private TextView f123805e;

    public bkak(Context context, List list, Object obj) {
        super(context, list);
        insert(obj, 0);
    }

    /* renamed from: a */
    public final int mo65737a() {
        if (this.f124180c != null) {
            return super.mo65737a();
        }
        if (getCount() != 0) {
            return getCount() - 1;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo65738a(int i) {
        return i - 1;
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!isEnabled(i)) {
            if (this.f124179b == null) {
                this.f124179b = mo65975b();
            }
            return this.f124179b;
        }
        if (view == this.f124179b) {
            view = null;
        }
        return super.getDropDownView(i, view, viewGroup);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (!isEnabled(i)) {
            if (this.f123805e == null) {
                TextView textView = (TextView) super.getView(0, null, viewGroup);
                this.f123805e = textView;
                textView.setHint(textView.getText());
                this.f123805e.setText((CharSequence) null);
            }
            return this.f123805e;
        }
        if (view == this.f123805e) {
            view = null;
        }
        return super.getView(i, view, viewGroup);
    }

    public final boolean isEnabled(int i) {
        return i != 0;
    }
}
