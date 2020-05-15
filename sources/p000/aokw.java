package p000;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.plus.sharebox.AddToCircleData;
import com.google.android.gms.plus.sharebox.Circle;

/* renamed from: aokw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aokw extends Fragment implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    public AddToCircleData f78370a;

    /* renamed from: b */
    public int f78371b = -1;

    /* renamed from: c */
    public boolean f78372c;

    /* renamed from: d */
    public boolean f78373d;

    /* renamed from: e */
    public CheckBox f78374e;

    /* renamed from: f */
    TextView f78375f;

    /* renamed from: g */
    public aola f78376g;

    /* renamed from: h */
    public Spinner f78377h;

    /* renamed from: i */
    public aomg f78378i;

    /* renamed from: j */
    private boolean f78379j;

    /* renamed from: a */
    public final void mo42935a(AddToCircleData addToCircleData, boolean z) {
        int i;
        this.f78370a = addToCircleData;
        TextView textView = this.f78375f;
        int size = addToCircleData.mo46777f().f30287b.size();
        String quantityString = getResources().getQuantityString(C0126R.plurals.plus_sharebox_circles_checkbox_number_of_people, size, Integer.valueOf(size));
        String string = getResources().getString(C0126R.string.plus_sharebox_circles_checkbox_label, quantityString);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        aokv aokv = new aokv(this);
        int indexOf = string.indexOf(quantityString);
        spannableStringBuilder.setSpan(aokv, indexOf, quantityString.length() + indexOf, spannableStringBuilder.getSpanFlags(aokv));
        textView.setText(spannableStringBuilder);
        this.f78375f.setMovementMethod(LinkMovementMethod.getInstance());
        if (z && this.f78379j) {
            this.f78374e.setChecked(this.f78372c);
            this.f78374e.setEnabled(this.f78373d);
        } else {
            this.f78374e.setChecked(this.f78370a.mo46775d());
        }
        this.f78374e.setEnabled(!this.f78370a.mo46777f().f30287b.isEmpty());
        aola aola = new aola(getActivity(), this.f78370a.f83436f);
        this.f78376g = aola;
        this.f78377h.setAdapter((SpinnerAdapter) aola);
        this.f78377h.setOnItemSelectedListener(this);
        if (z && (i = this.f78371b) >= 0) {
            this.f78377h.setSelection(i);
        } else if (addToCircleData.f83437g.intValue() >= 0 && addToCircleData.f83436f != null && addToCircleData.f83437g.intValue() < addToCircleData.f83436f.size()) {
            this.f78377h.setSelection(this.f78370a.mo46774c());
        } else {
            this.f78377h.setSelection(0);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof aomg)) {
            String valueOf = String.valueOf(aomg.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        } else {
            this.f78378i = (aomg) activity;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f78370a = (AddToCircleData) bundle.getParcelable("add_to_circle_data");
            this.f78371b = bundle.getInt("last_position", -1);
            this.f78372c = bundle.getBoolean("last_checked");
            this.f78373d = bundle.getBoolean("last_enabled");
        }
        this.f78379j = bundle != null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.plus_sharebox_add_to_circle_fragment, viewGroup, false);
        this.f78374e = (CheckBox) inflate.findViewById(C0126R.C0129id.circles_checkbox);
        this.f78375f = (TextView) inflate.findViewById(C0126R.C0129id.circles_checkbox_text);
        this.f78377h = (Spinner) inflate.findViewById(C0126R.C0129id.circles_spinner);
        return inflate;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Circle circle;
        if (view != null) {
            circle = (Circle) view.getTag();
        } else {
            circle = null;
        }
        if (circle == null) {
            return;
        }
        if (Circle.m69351a(circle)) {
            this.f78378i.mo43009k();
            return;
        }
        if (!this.f78374e.isChecked() && this.f78371b != i && !TextUtils.isEmpty(circle.f83446e)) {
            this.f78374e.setChecked(true);
        }
        this.f78371b = i;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("add_to_circle_data", this.f78370a);
        bundle.putInt("last_position", this.f78371b);
        CheckBox checkBox = this.f78374e;
        boolean z = false;
        bundle.putBoolean("last_checked", checkBox != null ? checkBox.isChecked() : false);
        CheckBox checkBox2 = this.f78374e;
        if (checkBox2 != null) {
            z = checkBox2.isEnabled();
        }
        bundle.putBoolean("last_enabled", z);
    }

    public final void onStart() {
        super.onStart();
        AddToCircleData addToCircleData = this.f78370a;
        if (addToCircleData != null) {
            mo42935a(addToCircleData, true);
        }
    }
}
