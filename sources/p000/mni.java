package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: mni */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mni extends mnj {

    /* renamed from: a */
    public boolean f34036a;

    /* renamed from: c */
    private GlifLayout f34037c;

    /* renamed from: d */
    private TextView f34038d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20177a() {
        if (!this.f34036a) {
            this.f34038d.setText(getString(C0126R.string.source_unplugged_description, this.f34039b));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate((int) C0126R.C0128layout.source_disconnected_fragment, (ViewGroup) null);
        this.f34037c = glifLayout;
        if (!this.f34036a) {
            i = C0126R.string.source_unplugged_title;
        } else {
            i = C0126R.string.source_wifi_d2d_disconnected_title;
        }
        mo20181a(glifLayout, i);
        TextView textView = (TextView) this.f34037c.findViewById(C0126R.C0129id.disconnected_description_text);
        this.f34038d = textView;
        if (this.f34036a) {
            textView.setText((int) C0126R.string.source_wifi_d2d_disconnected_description);
        } else {
            mo20183a(getArguments().getString("target_device_model"));
        }
        if (!ccoa.f179599a.mo6606a().mo76519j()) {
            GlifLayout glifLayout2 = this.f34037c;
            ((bjad) glifLayout2.mo71342a(bjad.class)).mo64936a(ColorStateList.valueOf(C1133kh.m17843b(getContext(), C0126R.color.quantum_googred)));
        } else {
            int b = C1133kh.m17843b(getContext(), C0126R.color.error_color);
            this.f34037c.mo71362a(C1133kh.m17836a(getContext(), (int) C0126R.C0127drawable.quantum_gm_ic_warning_amber_black_48));
            this.f34037c.mo71368g().setColorFilter(b, PorterDuff.Mode.SRC_IN);
            if (!ccog.f179619a.mo6606a().mo76532e()) {
                ((TextView) this.f34037c.findViewById(C0126R.C0129id.disconnected_description_text)).setTextColor(b);
            }
        }
        return this.f34037c;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f34037c = null;
        this.f34038d = null;
    }
}
