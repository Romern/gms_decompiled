package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: fvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fvy extends aons {

    /* renamed from: a */
    final /* synthetic */ fwd f17399a;

    public fvy(fwd fwd) {
        this.f17399a = fwd;
    }

    /* renamed from: a */
    public final int mo11414a() {
        return this.f17399a.f17409c;
    }

    /* renamed from: b */
    public final Object mo11416b(int i) {
        return this;
    }

    /* renamed from: a */
    public final View mo11415a(View view, ViewGroup viewGroup, boolean z) {
        TextView textView = (TextView) this.f17399a.mo43102a(view, C0126R.C0128layout.appinvite_contextual_selection_header_text);
        textView.setText((int) C0126R.string.appinvite_public_search_results);
        return textView;
    }
}
