package p000;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.DialogFragment;

/* renamed from: vrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vrv extends DialogFragment {

    /* renamed from: a */
    public vsi f49879a;

    /* renamed from: b */
    public vqy f49880b;

    /* renamed from: c */
    public LinearLayout f49881c;

    /* renamed from: d */
    C1350sh f49882d;

    /* renamed from: e */
    private final vsh f49883e = new vru(this);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo28771a(LayoutInflater layoutInflater, CharSequence charSequence, CharSequence charSequence2, boolean z, String str) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.car_driving_mode_behavior_radio, (ViewGroup) this.f49881c, false);
        inflate.setTag(C0126R.C0129id.car_driving_mode_behavior_option_tag_id, str);
        ((Checkable) inflate).setChecked(z);
        ((TextView) inflate.findViewById(16908310)).setText(charSequence);
        TextView textView = (TextView) inflate.findViewById(16908304);
        if (TextUtils.isEmpty(charSequence2)) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence2);
        }
        inflate.setOnClickListener(new vrt(this, str));
        this.f49881c.addView(inflate);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        vuk.m41322a();
        vsi f = vuk.m41327f(getContext());
        this.f49879a = f;
        f.mo28795k();
        vuk.m41322a();
        this.f49880b = vuk.m41325d(getContext());
        vuk.m41322a();
        vuk.m41326e(getContext()).mo28759a(bpeb.DRIVING_MODE, bpea.DRIVING_MODE_BEHAVIOR_SETTINGS);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        C1350sh b = new C1349sg(getContext()).mo15904b();
        this.f49882d = b;
        b.setTitle((int) C0126R.string.car_driving_mode_behavior_title);
        View inflate = LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.car_driving_mode_behavior_dialog_container, (ViewGroup) null);
        this.f49882d.f27024a.mo15888b(inflate);
        this.f49881c = (LinearLayout) inflate.findViewById(C0126R.C0129id.container);
        return this.f49882d;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f49879a.mo28798n();
    }

    public final void onPause() {
        super.onPause();
        this.f49879a.mo28778a((vsh) null);
    }

    public final void onResume() {
        super.onResume();
        Log.i("CAR.DRIVINGMODE", "DrivingModeBehaviorDialogFragment#onResume");
        this.f49879a.mo28778a(this.f49883e);
    }

    /* renamed from: a */
    public final void mo28772a(String str) {
        Intent makeMainActivity = Intent.makeMainActivity(vqx.m41082c());
        makeMainActivity.putExtra("FRX_START_FRAGMENT", str);
        startActivity(makeMainActivity);
    }
}
