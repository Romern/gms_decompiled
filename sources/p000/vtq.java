package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.android.setupwizardlib.GlifRecyclerLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: vtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class vtq extends vsw {

    /* renamed from: h */
    public bmi f49959h;

    /* renamed from: a */
    public abstract bmd mo28804a();

    /* renamed from: a */
    public abstract void mo28805a(bmb bmb);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        vuk.m41322a();
        this.f49930g = vuk.m41326e(getContext());
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.car_driving_mode_frx_recycler, viewGroup, false);
        mo28815a(inflate);
        bmi bmi = new bmi(mo28804a());
        this.f49959h = bmi;
        bmi.f5160d = new vtn(this);
        ((GlifRecyclerLayout) inflate.findViewById(C0126R.C0129id.setup_wizard_layout)).f7201a.mo3291a(this.f49959h);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.next_button);
        if (mo28809e() == null) {
            button.setVisibility(8);
        } else {
            button.setVisibility(0);
            button.setText(mo28809e());
            button.setOnClickListener(new vto(this));
        }
        Button button2 = (Button) inflate.findViewById(C0126R.C0129id.back_button);
        if (mo28819j() == null) {
            button2.setVisibility(8);
        } else {
            button2.setVisibility(0);
            button2.setText(mo28819j());
            button2.setOnClickListener(new vtp(this));
        }
        return inflate;
    }
}
