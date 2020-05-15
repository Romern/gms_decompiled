package p000;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tnz */
final /* synthetic */ class tnz implements View.OnClickListener {

    /* renamed from: a */
    private final tof f46370a;

    /* renamed from: b */
    private final toe f46371b;

    public tnz(tof tof, toe toe) {
        this.f46370a = tof;
        this.f46371b = toe;
    }

    public void onClick(View view) {
        tof tof = this.f46370a;
        toe toe = this.f46371b;
        tnx tnx = tof.f46394e;
        if (!toe.f46391y) {
            toe.f46391y = true;
            toe.f46385s.setTransformationMethod(null);
            toe.f46386t.setImageResource(C0126R.C0127drawable.quantum_gm_ic_visibility_vd_theme_24);
            ImageView imageView = toe.f46386t;
            imageView.setContentDescription(imageView.getContext().getString(C0126R.string.pwm_credential_group_hide_password));
            tnx.f46366b.getActivity().getWindow().setFlags(8192, 8192);
            tnx.f46367c.mo26715a(47002);
            return;
        }
        toe.f46391y = false;
        toe.f46385s.setTransformationMethod(PasswordTransformationMethod.getInstance());
        toe.f46386t.setImageResource(C0126R.C0127drawable.quantum_gm_ic_visibility_off_vd_theme_24);
        ImageView imageView2 = toe.f46386t;
        imageView2.setContentDescription(imageView2.getContext().getString(C0126R.string.pwm_credential_group_view_password));
        tnx.f46367c.mo26715a(47003);
    }
}
