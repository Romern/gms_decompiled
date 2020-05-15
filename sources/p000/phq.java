package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.cast.activity.CastNearbyPinChimeraActivity;

/* renamed from: phq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class phq extends Fragment {

    /* renamed from: a */
    public static final String f39135a = ccxy.f180226a.mo6606a().mo77054p();

    /* renamed from: b */
    public Button f39136b;

    /* renamed from: c */
    public EditText[] f39137c;

    /* renamed from: d */
    public InputMethodManager f39138d;

    /* renamed from: a */
    public static phq m30341a(boolean z) {
        phq phq = new phq();
        Bundle bundle = new Bundle();
        bundle.putBoolean("connectionError", z);
        phq.setArguments(bundle);
        return phq;
    }

    /* renamed from: b */
    public final void mo23095b() {
        this.f39138d.hideSoftInputFromWindow(this.f39137c[0].getWindowToken(), 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.cast_nearby_fragment_pin, viewGroup, false);
        this.f39138d = (InputMethodManager) getActivity().getSystemService("input_method");
        this.f39136b = (Button) inflate.findViewById(C0126R.C0129id.connect_button);
        boolean z = getArguments().getBoolean("connectionError", false);
        inflate.findViewById(C0126R.C0129id.connection_error).setVisibility(!z ? 8 : 0);
        inflate.findViewById(C0126R.C0129id.listen_for_pin_button).setOnClickListener(new phk(this, z));
        this.f39136b.setOnClickListener(new phl(this));
        inflate.findViewById(C0126R.C0129id.dialog_where_is_my_pin_url).setOnClickListener(new phm(this));
        EditText[] editTextArr = new EditText[4];
        this.f39137c = editTextArr;
        editTextArr[0] = (EditText) inflate.findViewById(C0126R.C0129id.editTextPin1);
        this.f39137c[0].addTextChangedListener(new pho(this, 0));
        this.f39137c[1] = (EditText) inflate.findViewById(C0126R.C0129id.editTextPin2);
        this.f39137c[1].addTextChangedListener(new pho(this, 1));
        this.f39137c[2] = (EditText) inflate.findViewById(C0126R.C0129id.editTextPin3);
        this.f39137c[2].addTextChangedListener(new pho(this, 2));
        this.f39137c[3] = (EditText) inflate.findViewById(C0126R.C0129id.editTextPin4);
        this.f39137c[3].addTextChangedListener(new pho(this, 3));
        this.f39137c[3].setOnEditorActionListener(new php(this));
        this.f39137c[0].postDelayed(new phn(this), 200);
        if (bundle != null && bundle.containsKey("enteredDigits")) {
            String string = bundle.getString("enteredDigits");
            while (i < string.length()) {
                int length = this.f39137c.length;
                if (i >= 4) {
                    break;
                }
                int i2 = i + 1;
                String substring = string.substring(i, i2);
                if (!TextUtils.isEmpty(substring) && !substring.equals(" ")) {
                    this.f39137c[i].setText(substring);
                }
                i = i2;
            }
        }
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putString("enteredDigits", mo23093a());
    }

    /* renamed from: a */
    public final String mo23093a() {
        StringBuilder sb = new StringBuilder(4);
        EditText[] editTextArr = this.f39137c;
        int length = editTextArr.length;
        for (int i = 0; i < 4; i++) {
            CharSequence text = editTextArr[i].getText();
            if (TextUtils.isEmpty(text)) {
                text = " ";
            }
            sb.append(text);
        }
        return sb.toString();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: phj.a(java.lang.String, boolean, boolean):void
     arg types: [java.lang.String, int, int]
     candidates:
      phs.a(int, int, android.content.Intent):void
      phj.a(java.lang.String, boolean, boolean):void */
    /* renamed from: a */
    public final void mo23094a(String str) {
        CastNearbyPinChimeraActivity castNearbyPinChimeraActivity = (CastNearbyPinChimeraActivity) getActivity();
        if (castNearbyPinChimeraActivity != null) {
            mo23095b();
            phj phj = (phj) castNearbyPinChimeraActivity.f29865b;
            qav qav = phj.f39114c;
            String valueOf = String.valueOf(str);
            qav.mo23670a(valueOf.length() == 0 ? new String("onManualPinComplete: ") : "onManualPinComplete: ".concat(valueOf), new Object[0]);
            phj.mo23078a(str, true, false);
            phj.mo23083f();
            phj.mo23084g();
        }
    }
}
