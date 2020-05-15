package p000;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.plus.model.posts.PlusPage;

/* renamed from: aomy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aomy extends Fragment implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    protected String[] f78549a;

    /* renamed from: b */
    protected int f78550b;

    /* renamed from: c */
    private aomx f78551c;

    /* renamed from: d */
    private aomw f78552d;

    /* renamed from: e */
    private Spinner f78553e;

    /* renamed from: f */
    private Button f78554f;

    /* renamed from: g */
    private TextView f78555g;

    /* renamed from: h */
    private View f78556h;

    /* renamed from: i */
    private View f78557i;

    /* renamed from: j */
    private View f78558j;

    /* renamed from: k */
    private int f78559k = 0;

    /* renamed from: a */
    private final void m66112a() {
        boolean z;
        boolean z2;
        int i;
        int i2;
        CharSequence charSequence;
        boolean z3;
        String str;
        int i3;
        aomv j = this.f78551c.mo43003j();
        boolean a = aomi.m66054a(getActivity(), j.f78534f);
        int i4 = this.f78559k;
        if (i4 == 0) {
            charSequence = null;
            i2 = 0;
            i = 4;
            z2 = false;
            z = false;
        } else if (i4 == 2) {
            charSequence = getText(C0126R.string.plus_sharebox_next);
            i2 = !sse.m36204a() ? C0126R.C0127drawable.plus_iconic_ic_next_black_32 : C0126R.C0127drawable.plus_iconic_ic_previous_black_32;
            i = 0;
            z2 = false;
            z = true;
        } else if (i4 != 3) {
            if (TextUtils.isEmpty(j.f78533e)) {
                charSequence = getText(C0126R.string.plus_sharebox_share);
            } else {
                charSequence = j.f78533e;
            }
            i2 = C0126R.C0127drawable.plus_iconic_ic_send_32;
            i = 0;
            z2 = false;
            z = false;
        } else {
            charSequence = null;
            i2 = 0;
            i = 4;
            z2 = true;
            z = true;
        }
        this.f78554f.setVisibility(i);
        this.f78554f.setText(charSequence);
        if (sse.m36204a()) {
            this.f78554f.setCompoundDrawablesWithIntrinsicBounds(0, 0, i2, 0);
        } else {
            this.f78554f.setCompoundDrawablesWithIntrinsicBounds(i2, 0, 0, 0);
        }
        if (!z2) {
            this.f78556h.setClickable(false);
            this.f78557i.setVisibility(4);
        } else {
            this.f78556h.setOnClickListener(this);
            this.f78557i.setVisibility(0);
        }
        if (z && a) {
            str = getString(C0126R.string.plus_sharebox_audience_selection_activity_title);
            z3 = false;
        } else {
            z3 = !j.mo43051c();
            if (TextUtils.isEmpty(j.f78531c)) {
                str = getString(C0126R.string.plus_app_label);
            } else {
                str = j.f78531c;
            }
        }
        Spinner spinner = this.f78553e;
        if (!z3) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        spinner.setVisibility(i3);
        this.f78555g.setText(str);
        String[] strArr = this.f78549a;
        if (strArr == null || strArr.length == 1 || !z3) {
            this.f78558j.setClickable(false);
            this.f78558j.setBackgroundDrawable(null);
            return;
        }
        this.f78558j.setOnClickListener(this);
        this.f78558j.setBackgroundResource(C0126R.C0127drawable.common_settings_spinner_bg);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof aomx)) {
            String valueOf = String.valueOf(aomx.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        } else {
            this.f78551c = (aomx) activity;
        }
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.share_button) {
            int i = this.f78559k;
            if (i == 2) {
                this.f78551c.mo43060r();
            } else if (i != 3) {
                mo43063a(false);
                this.f78551c.mo43059q();
            } else {
                this.f78551c.mo43061s();
            }
        } else if (view.getId() == C0126R.C0129id.up_button) {
            this.f78551c.mo43061s();
        }
        if (view.getId() == C0126R.C0129id.title_container) {
            this.f78553e.performClick();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f78549a = bundle.getStringArray("account_names");
            this.f78550b = bundle.getInt("selected_position", 0);
            this.f78559k = bundle.getInt("button_action", 0);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.plus_sharebox_title_fragment, viewGroup, false);
        this.f78553e = (Spinner) inflate.findViewById(C0126R.C0129id.account_spinner);
        this.f78555g = (TextView) inflate.findViewById(C0126R.C0129id.title_text);
        this.f78558j = inflate.findViewById(C0126R.C0129id.title_container);
        this.f78556h = inflate.findViewById(C0126R.C0129id.up_button);
        this.f78557i = inflate.findViewById(C0126R.C0129id.up_button_icon);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.share_button);
        this.f78554f = button;
        button.setOnClickListener(this);
        Button button2 = this.f78554f;
        if (bundle == null || !bundle.getBoolean("button_enabled")) {
            z = false;
        } else {
            z = true;
        }
        button2.setEnabled(z);
        if (this.f78551c.mo43003j().f78532d > 0) {
            try {
                Resources resourcesForApplication = getActivity().getPackageManager().getResourcesForApplication(this.f78551c.getCallingPackage());
                if (resourcesForApplication != null) {
                    ((ImageView) inflate.findViewById(C0126R.C0129id.titlebar_icon_layout)).setImageDrawable(resourcesForApplication.getDrawable(this.f78551c.mo43003j().f78532d));
                }
            } catch (Resources.NotFoundException e) {
                Log.e("ShareBox", "Unable to override the app icon.", e);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("ShareBox", "Unable to override the app icon.", e2);
            }
        }
        if (this.f78551c.mo43003j().mo43051c()) {
            PlusPage plusPage = this.f78551c.mo43003j().f78530b;
            if (!TextUtils.isEmpty(plusPage.f82549c)) {
                TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.plus_page_name);
                textView.setText(plusPage.f82549c);
                textView.setVisibility(0);
            }
        }
        m66112a();
        return inflate;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.f78550b != i) {
            this.f78550b = i;
            this.f78551c.mo43058b((String) this.f78552d.getItem(i));
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArray("account_names", this.f78549a);
        bundle.putInt("selected_position", this.f78550b);
        bundle.putInt("button_action", this.f78559k);
        bundle.putBoolean("button_enabled", this.f78554f.isEnabled());
    }

    public final void onStart() {
        int i;
        super.onStart();
        String[] strArr = this.f78549a;
        if (strArr != null && (i = this.f78550b) >= 0) {
            mo43064a(strArr, i);
        } else if (this.f78551c.mo42999g().mo43045a()) {
            mo43064a(this.f78551c.mo42999g().f78511i, this.f78551c.mo42999g().f78513k);
        }
    }

    /* renamed from: a */
    public final void mo43062a(int i) {
        this.f78559k = i;
        m66112a();
    }

    /* renamed from: a */
    public final void mo43063a(boolean z) {
        this.f78554f.setVisibility(!z ? 4 : 0);
        this.f78554f.setEnabled(z);
    }

    /* renamed from: a */
    public final void mo43064a(String[] strArr, int i) {
        this.f78549a = strArr;
        this.f78550b = i;
        aomw aomw = new aomw(getActivity(), this.f78549a);
        this.f78552d = aomw;
        this.f78553e.setAdapter((SpinnerAdapter) aomw);
        if (!this.f78551c.mo43003j().mo43051c()) {
            this.f78553e.setSelection(this.f78550b);
            this.f78553e.setOnItemSelectedListener(this);
        }
        m66112a();
    }
}
