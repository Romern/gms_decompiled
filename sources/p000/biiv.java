package p000;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: biiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biiv extends Fragment implements AdapterView.OnItemClickListener, TextView.OnEditorActionListener, View.OnKeyListener, TextWatcher, biig, biid, biia {

    /* renamed from: a */
    public ProgressBar f120685a;

    /* renamed from: b */
    public ListView f120686b;

    /* renamed from: c */
    public List f120687c;

    /* renamed from: d */
    public ListAdapter f120688d;

    /* renamed from: e */
    public biis f120689e;

    /* renamed from: f */
    public bihb f120690f;

    /* renamed from: g */
    public biij f120691g;

    /* renamed from: h */
    public biir f120692h;

    /* renamed from: i */
    public int f120693i = 3;

    /* renamed from: j */
    private ViewGroup f120694j;

    /* renamed from: k */
    private View f120695k;

    /* renamed from: l */
    private EditText f120696l;

    /* renamed from: m */
    private ImageButton f120697m;

    /* renamed from: n */
    private String f120698n;

    /* renamed from: o */
    private boolean f120699o;

    /* renamed from: p */
    private int f120700p;

    /* renamed from: q */
    private int f120701q;

    /* renamed from: r */
    private boolean f120702r = false;

    /* renamed from: s */
    private final AdapterView.OnItemClickListener f120703s = new biip(this);

    /* renamed from: t */
    private final View.OnTouchListener f120704t = new biiq(this);

    /* renamed from: a */
    public static biiv m102449a(int i, int i2, String str) {
        biiv biiv = new biiv();
        Bundle bundle = new Bundle();
        bundle.putInt("primary_color", i);
        bundle.putInt("primary_color_dark", i2);
        bundle.putString("search_term_key", str);
        biiv.setArguments(bundle);
        return biiv;
    }

    /* renamed from: a */
    public final void mo64644a(Map map) {
        throw null;
    }

    public final void afterTextChanged(Editable editable) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo64662b() {
        this.f120686b.setVisibility(8);
        mo64667g();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: c */
    public final void mo64664c() {
        if (this.f120688d != null) {
            this.f120686b.setOnItemClickListener(this.f120703s);
            this.f120686b.setAdapter(this.f120688d);
            if (this.f120688d instanceof aepm) {
                this.f120686b.setVisibility(0);
            } else {
                this.f120686b.setVisibility(8);
            }
        }
    }

    /* renamed from: d */
    public final void mo64645d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo64665e() {
        this.f120696l.requestFocus();
        Activity activity = getActivity();
        ((InputMethodManager) activity.getSystemService("input_method")).showSoftInput(this.f120696l, 0);
    }

    /* renamed from: f */
    public final void mo64666f() {
        this.f120696l.clearFocus();
        biix.m102463a(getActivity(), this.f120696l);
    }

    /* renamed from: g */
    public final void mo64667g() {
        View view = this.f120695k;
        if (view != null) {
            this.f120694j.removeView(view);
            this.f120695k = null;
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f120699o = true;
        C1341rz aW = ((deu) getActivity()).mo8628aW();
        aW.mo15860d(20);
        aW.mo15840a((int) C0126R.C0128layout.places_ui_search_plate);
        View a = aW.mo15837a();
        this.f120696l = (EditText) a.findViewById(C0126R.C0129id.input);
        this.f120685a = (ProgressBar) a.findViewById(C0126R.C0129id.progress_bar);
        this.f120697m = (ImageButton) a.findViewById(C0126R.C0129id.clear);
        if (cggj.f186839a.mo6606a().mo83708h()) {
            this.f120688d = new aepm(this.f120691g.f120654a);
        } else {
            this.f120687c = new ArrayList();
            this.f120688d = new biiu(this, getActivity(), this.f120687c);
        }
        ListView listView = (ListView) getView().findViewById(C0126R.C0129id.list);
        this.f120686b = listView;
        listView.setDivider(null);
        this.f120686b.setVerticalScrollBarEnabled(false);
        this.f120686b.setOnTouchListener(this.f120704t);
        this.f120696l.setOnEditorActionListener(this);
        this.f120696l.setOnKeyListener(this);
        this.f120696l.addTextChangedListener(this);
        this.f120697m.setOnClickListener(new biil(this));
        mo64665e();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof deu)) {
            throw new RuntimeException(String.valueOf(activity.toString()).concat(" must be an instance of AppCompatActivity."));
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (bundle != null) {
            this.f120698n = bundle.getString("search_term_key");
            this.f120693i = bundle.getInt("ime_action_key");
            this.f120700p = bundle.getInt("primary_color");
            this.f120701q = bundle.getInt("primary_color_dark");
            this.f120702r = bundle.getBoolean("input_received_key");
        } else if (getArguments() != null) {
            this.f120698n = getArguments().getString("search_term_key");
            this.f120700p = getArguments().getInt("primary_color");
            this.f120701q = getArguments().getInt("primary_color_dark");
        }
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C0126R.C0130menu.places_ui_menu_main, menu);
        MenuItem findItem = menu.findItem(C0126R.C0129id.places_ui_menu_main_search);
        if (findItem != null) {
            findItem.setVisible(false);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.places_ui_search, viewGroup, false);
        this.f120694j = (ViewGroup) inflate.findViewById(C0126R.C0129id.container);
        bigz.m102378a(getActivity(), getResources().getColor(C0126R.color.places_ui_search_primary), getResources().getColor(C0126R.color.places_ui_search_primary_dark), getResources().getColor(C0126R.color.places_ui_search_text));
        return inflate;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != this.f120693i) {
            return false;
        }
        mo64659a(textView.getText().toString());
        return true;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str = (String) adapterView.getItemAtPosition(i);
        if (str != null) {
            mo64660a(str, true);
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        String obj = this.f120696l.getText().toString();
        if (keyEvent.getAction() != 1 || i != 66) {
            return false;
        }
        view.cancelLongPress();
        mo64659a(obj);
        return true;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        EditText editText = this.f120696l;
        if (editText != null && !editText.getText().toString().isEmpty()) {
            bundle.putString("search_term_key", this.f120696l.getText().toString());
        }
        bundle.putInt("ime_action_key", this.f120693i);
        bundle.putInt("primary_color", this.f120700p);
        bundle.putInt("primary_color_dark", this.f120701q);
        bundle.putBoolean("input_received_key", this.f120702r);
    }

    public final void onStart() {
        super.onStart();
        this.f120691g.f120657d = this;
        if (this.f120699o) {
            if (this.f120698n != null) {
                mo64664c();
                this.f120696l.setText(this.f120698n);
            } else {
                mo64664c();
            }
            this.f120696l.setImeOptions(this.f120693i | 268435456);
            this.f120699o = false;
        }
    }

    public final void onStop() {
        biij biij = this.f120691g;
        biij.f120657d = null;
        biij.f120661h = null;
        biij.mo64646a();
        super.onStop();
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f120702r = true;
        String charSequence2 = charSequence.toString();
        if (charSequence2.isEmpty()) {
            this.f120685a.setVisibility(8);
            this.f120697m.setVisibility(8);
            ListAdapter listAdapter = this.f120688d;
            if (listAdapter instanceof aepm) {
                ((aepm) listAdapter).f63596a.filter(null);
                return;
            }
            this.f120686b.setVisibility(8);
            rke rke = this.f120691g.f120662i;
            if (rke != null) {
                rke.mo9460b();
                return;
            }
            return;
        }
        biij biij = this.f120691g;
        rke rke2 = biij.f120667n;
        if (rke2 != null) {
            rke2.mo9460b();
        }
        rke rke3 = biij.f120668o;
        if (rke3 != null) {
            rke3.mo9460b();
        }
        this.f120697m.setVisibility(0);
        if (this.f120691g != null && this.f120696l.hasFocus()) {
            ListAdapter listAdapter2 = this.f120688d;
            if (listAdapter2 instanceof aepm) {
                ((aepm) listAdapter2).f63596a.filter(charSequence2);
            } else {
                biij biij2 = this.f120691g;
                LatLngBounds d = this.f120692h.mo64621d();
                rke rke4 = biij2.f120663j;
                if (rke4 != null) {
                    rke4.mo9460b();
                }
                rke rke5 = biij2.f120662i;
                if (rke5 != null) {
                    rke5.mo9460b();
                }
                rke rke6 = biij2.f120664k;
                if (rke6 != null) {
                    rke6.mo9460b();
                }
                rjo rjo = aema.f63501a;
                biij2.f120662i = aenc.m52184a(biij2.f120654a, charSequence2, d, biij2.f120656c);
                biij2.f120662i.mo9459a(new bihx(biij2), cggj.m145237d(), TimeUnit.MILLISECONDS);
            }
        }
        mo64664c();
    }

    /* renamed from: a */
    public final void mo64638a() {
        mo64659a(this.f120696l.getText().toString());
    }

    public final void onDestroyView() {
        Activity activity = getActivity();
        bigz.m102378a(activity, this.f120700p, this.f120701q, activity.getResources().getColor(C0126R.color.places_ui_default_text));
        mo64666f();
        super.onDestroyView();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo64658a(int i, String str, Runnable runnable) {
        if (isVisible()) {
            View inflate = getActivity().getLayoutInflater().inflate(i, this.f120694j, false);
            this.f120695k = inflate;
            if (runnable != null) {
                ((Button) inflate.findViewById(C0126R.C0129id.action)).setText(str);
                this.f120695k.findViewById(C0126R.C0129id.action).setOnClickListener(new biio(runnable));
            } else {
                inflate.findViewById(C0126R.C0129id.action).setVisibility(8);
            }
            ViewGroup viewGroup = this.f120694j;
            viewGroup.addView(this.f120695k, viewGroup.getChildCount() - 1);
            this.f120695k.sendAccessibilityEvent(32);
        }
    }

    /* renamed from: a */
    public final void mo64659a(String str) {
        mo64666f();
        if (!(this.f120688d instanceof aepm)) {
            mo64662b();
            if (!str.isEmpty() && this.f120691g != null) {
                this.f120685a.setVisibility(0);
                biij biij = this.f120691g;
                LatLngBounds d = this.f120692h.mo64621d();
                rke rke = biij.f120663j;
                if (rke != null) {
                    rke.mo9460b();
                }
                rke rke2 = biij.f120662i;
                if (rke2 != null) {
                    rke2.mo9460b();
                }
                rke rke3 = biij.f120664k;
                if (rke3 != null) {
                    rke3.mo9460b();
                }
                rjo rjo = aema.f63501a;
                biij.f120663j = aenc.m52183a(biij.f120654a, d, (int) cggj.m145236c(), str, biij.f120655b);
                biij.f120663j.mo9459a(new biih(biij, str), cggj.m145237d(), TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: a */
    public final void mo64660a(String str, boolean z) {
        this.f120696l.setText(str);
        if (z) {
            mo64659a(str);
        }
    }

    /* renamed from: a */
    public final void mo64639a(aelh[] aelhArr) {
        if (aelhArr.length <= 0) {
            mo64638a();
        } else if (isVisible()) {
            this.f120685a.setVisibility(8);
            biis biis = this.f120689e;
            if (biis != null) {
                this.f120696l.getText().toString();
                biis.mo64656b(aelhArr);
            }
        }
    }
}
