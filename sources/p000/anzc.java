package p000;

import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.widget.phone.ScrollViewWithEvents;
import com.google.android.gms.plus.service.v1whitelisted.models.UpgradeAccountEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: anzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class anzc extends Fragment implements View.OnClickListener, sur, suq {

    /* renamed from: a */
    protected anxy f77904a;

    /* renamed from: b */
    protected LinearLayout f77905b;

    /* renamed from: c */
    public ScrollViewWithEvents f77906c;

    /* renamed from: d */
    protected Button f77907d;

    /* renamed from: e */
    protected Button f77908e;

    /* renamed from: f */
    public int f77909f;

    /* renamed from: g */
    private anzb f77910g;

    /* renamed from: h */
    private TextView f77911h;

    /* renamed from: i */
    private View f77912i;

    /* renamed from: j */
    private UpgradeAccountEntity f77913j;

    /* renamed from: k */
    private boolean f77914k;

    /* renamed from: l */
    private String f77915l;

    /* renamed from: m */
    private boolean f77916m;

    /* renamed from: a */
    private final List m65620a(LinearLayout linearLayout) {
        ArrayList arrayList = new ArrayList();
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof anxz) {
                arrayList.add((anxz) childAt);
            } else if (childAt instanceof LinearLayout) {
                arrayList.addAll(m65620a((LinearLayout) childAt));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo26131a(int i) {
        this.f77909f = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo42474b() {
        if (!this.f77914k) {
            this.f77908e.setVisibility(0);
        }
    }

    /* renamed from: c */
    public final void mo42482c() {
        if (this.f77905b != null) {
            boolean z = true;
            if (!this.f77906c.mo17935a()) {
                this.f77907d.setEnabled(true);
            } else {
                Button button = this.f77907d;
                List a = m65620a(this.f77905b);
                int size = a.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    int i2 = i + 1;
                    if (!((anxz) a.get(i)).mo42416b()) {
                        z = false;
                        break;
                    }
                    i = i2;
                }
                button.setEnabled(z);
            }
            mo42471a();
        } else if (Log.isLoggable("UpgradeAccount", 5)) {
            Log.w("UpgradeAccount", "Next button update requested but form view has not yet been created");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        UpgradeAccountEntity upgradeAccountEntity = this.f77913j;
        if (upgradeAccountEntity != null) {
            mo42473a(upgradeAccountEntity);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof anzb)) {
            String valueOf = String.valueOf(anzb.class.getSimpleName());
            throw new IllegalStateException(valueOf.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf));
        }
        this.f77910g = (anzb) activity;
        if (!(activity instanceof anxy)) {
            String valueOf2 = String.valueOf(anxy.class.getSimpleName());
            throw new IllegalStateException(valueOf2.length() == 0 ? new String("Host must implement ") : "Host must implement ".concat(valueOf2));
        } else {
            this.f77904a = (anxy) activity;
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C0126R.C0129id.next_button) {
            ssc.m36197a(getActivity(), view);
            if (this.f77906c.mo17935a()) {
                this.f77907d.setEnabled(false);
                UpgradeAccountEntity upgradeAccountEntity = null;
                if (this.f77905b != null) {
                    ArrayList arrayList = new ArrayList();
                    List a = m65620a(this.f77905b);
                    int size = a.size();
                    aoed aoed = null;
                    aoed aoed2 = null;
                    for (int i = 0; i < size; i++) {
                        anxz anxz = (anxz) a.get(i);
                        aoed c = anxz.mo42417c();
                        if (c != null) {
                            if (anxz instanceof anyq) {
                                if (aoed2 != null) {
                                    arrayList.add(aoed2);
                                }
                                arrayList.add(c);
                                if (aoed != null) {
                                    arrayList.add(aoed);
                                }
                                aoed = null;
                                aoed2 = null;
                            } else if (anxz instanceof anye) {
                                aoed2 = c;
                            } else if (anxz instanceof anyg) {
                                aoed = c;
                            } else {
                                if (aoed != null) {
                                    arrayList.add(aoed);
                                    aoed = null;
                                }
                                arrayList.add(c);
                            }
                        }
                    }
                    if (aoed != null) {
                        arrayList.add(aoed);
                    }
                    aoih aoih = new aoih();
                    aoih.f78348b = "upgrade";
                    aoih.f78349c.add(6);
                    aoij aoij = new aoij();
                    aoij.f78350a = arrayList;
                    aoij.f78351b.add(2);
                    aoih.f78347a = new UpgradeAccountEntity.FormEntity(aoij.f78351b, aoij.f78350a);
                    aoih.f78349c.add(4);
                    upgradeAccountEntity = new UpgradeAccountEntity(aoih.f78349c, aoih.f78347a, aoih.f78348b);
                } else if (Log.isLoggable("UpgradeAccount", 5)) {
                    Log.w("UpgradeAccount", "FieldView values requested but form view has not yet been created");
                }
                if (anzh.m65642c(upgradeAccountEntity)) {
                    this.f77904a.mo42410a(rim.f43062d, rin.f43078c);
                }
                this.f77910g.mo42480a(upgradeAccountEntity);
                return;
            }
            this.f77906c.pageScroll(130);
            this.f77904a.mo42409a(rim.f43069k);
        } else if (id == C0126R.C0129id.back_button) {
            this.f77904a.mo42409a(rim.f43075q);
            this.f77910g.mo42481f();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f77913j = (UpgradeAccountEntity) getArguments().getParcelable("upgrade_account");
            this.f77909f = 0;
            return;
        }
        this.f77913j = (UpgradeAccountEntity) bundle.getParcelable("state_upgrade_account");
        this.f77909f = bundle.getInt("state_scroll_y");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f77914k = getArguments().getBoolean("is_setup_wizard_theme");
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.plus_oob_wide_ux_max_width);
        Activity activity = getActivity();
        int i = activity.getWindow().getAttributes().width;
        int i2 = activity.getWindow().getAttributes().height;
        if (dimensionPixelSize <= 0 || i != -2 || this.f77914k) {
            this.f77916m = false;
        } else {
            this.f77916m = true;
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            int i3 = Build.VERSION.SDK_INT;
            defaultDisplay.getSize(point);
            activity.getWindow().setLayout(Math.min(dimensionPixelSize, point.x), i2);
        }
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.plus_oob_upgrade_account_form_fragment, viewGroup, false);
        this.f77905b = (LinearLayout) inflate.findViewById(C0126R.C0129id.form_layout);
        ScrollViewWithEvents scrollViewWithEvents = (ScrollViewWithEvents) inflate.findViewById(C0126R.C0129id.scroll_view);
        this.f77906c = scrollViewWithEvents;
        scrollViewWithEvents.f30408a = this;
        scrollViewWithEvents.f30409b = this;
        scrollViewWithEvents.getViewTreeObserver().addOnGlobalLayoutListener(new anza(this));
        anzg.m65632a(layoutInflater, inflate, this.f77914k);
        this.f77911h = (TextView) inflate.findViewById(C0126R.C0129id.title);
        if (!this.f77914k) {
            String string = getArguments().getString("promo_app_package");
            if (!TextUtils.isEmpty(string)) {
                try {
                    ((ImageView) inflate.findViewById(C0126R.C0129id.title_icon)).setImageDrawable(getActivity().getPackageManager().getApplicationIcon(string));
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
        }
        View findViewById = inflate.findViewById(C0126R.C0129id.promo_layout);
        this.f77912i = findViewById;
        if (this.f77914k) {
            findViewById.setVisibility(8);
        } else {
            String string2 = getArguments().getString("promo_app_text");
            String string3 = getArguments().getString("com.google.android.gms.plus.intent.extra.CLIENT_CALLING_PACKAGE");
            TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.promo_text_view);
            if (!TextUtils.isEmpty(string2)) {
                textView.setText(string2);
            } else if (!TextUtils.isEmpty(string3)) {
                String str = null;
                try {
                    PackageManager packageManager = getActivity().getPackageManager();
                    str = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(string3, 0));
                } catch (PackageManager.NameNotFoundException e2) {
                    if (Log.isLoggable("UpgradeAccount", 5)) {
                        String valueOf = String.valueOf(string3);
                        Log.w("UpgradeAccount", valueOf.length() == 0 ? new String("getAppName can't find a package: ") : "getAppName can't find a package: ".concat(valueOf));
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    textView.setText(String.format(getResources().getString(C0126R.string.plus_oob_3p_promo, str), new Object[0]));
                }
            }
        }
        mo42472a(layoutInflater, inflate);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.next_button);
        this.f77907d = button;
        button.setOnClickListener(this);
        this.f77907d.setEnabled(false);
        Button button2 = (Button) inflate.findViewById(C0126R.C0129id.back_button);
        this.f77908e = button2;
        button2.setOnClickListener(this);
        String string4 = getArguments().getString("back_button_name");
        this.f77915l = string4;
        if (TextUtils.isEmpty(string4)) {
            this.f77915l = getResources().getString(17039360);
        }
        if (!this.f77914k) {
            if (!TextUtils.isEmpty(this.f77915l)) {
                this.f77908e.setText(this.f77915l);
                this.f77908e.setVisibility(0);
            } else {
                this.f77908e.setVisibility(8);
            }
        }
        return inflate;
    }

    public final void onDetach() {
        super.onDetach();
        this.f77910g = null;
        this.f77904a = null;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("state_upgrade_account", this.f77913j);
        bundle.putInt("state_scroll_y", this.f77909f);
    }

    /* renamed from: a */
    private final List m65621a(List list) {
        anxz anxz;
        ArrayList arrayList = new ArrayList();
        anyq anyq = null;
        anye anye = null;
        for (int i = 0; i < list.size(); i++) {
            aoed aoed = (aoed) list.get(i);
            try {
                Activity activity = getActivity();
                boolean z = this.f77914k;
                sdo.m34959a(activity);
                sdo.m34959a(aoed);
                String o = aoed.mo42608o();
                if (aoed == null || !"pronoun".equals(aoed.mo42600g())) {
                    if (aoed != null) {
                        if ("customGender".equals(aoed.mo42600g())) {
                            anxz = new anye(activity, z);
                        }
                    }
                    if ("button".equals(o)) {
                        anxz = new anyj(activity, z);
                    } else if ("check".equals(o)) {
                        anxz = new anyb(activity, z);
                    } else if (aoed == null || !"birthday".equals(aoed.mo42600g())) {
                        if (aoed != null) {
                            if ("date".equals(aoed.mo42608o()) || "dayInYear".equals(aoed.mo42608o())) {
                                if (aoed.mo42604k()) {
                                    throw new UnsupportedOperationException("Mandatory non-birthday date fields are not supported");
                                }
                            }
                        }
                        if ("info".equals(o)) {
                            anxz = new anyk(activity, z);
                        } else if (anzh.m65637a(aoed)) {
                            anxz = new anyo(activity, z);
                        } else if (!"option".equals(o)) {
                            anxz = "string".equals(o) ? new anyt(activity, z) : null;
                        } else if ("gender".equals(aoed.mo42600g())) {
                            anxz = new anyg(activity, z);
                        } else if (!aoed.mo42604k()) {
                            anxz = null;
                        } else {
                            throw new UnsupportedOperationException("Mandatory non-gender option fields are not supported");
                        }
                    } else {
                        anxz = new anyi(activity, z);
                    }
                } else {
                    anxz = new anyq(activity, z);
                }
                if (anxz != null) {
                    anxz.setId(i + 5000);
                } else if (Log.isLoggable("FieldView", 5)) {
                    String g = aoed.mo42600g();
                    StringBuilder sb = new StringBuilder(String.valueOf(o).length() + 28 + String.valueOf(g).length());
                    sb.append("Unsupported field: type=");
                    sb.append(o);
                    sb.append(" id=");
                    sb.append(g);
                    Log.w("FieldView", sb.toString());
                }
                ((Boolean) ansx.f77660J.mo25081c()).booleanValue();
                if (anxz != null) {
                    anxz.mo42415a(aoed, this.f77904a);
                    if (anxz instanceof anyg) {
                        anyg anyg = (anyg) anxz;
                        arrayList.add(anyg);
                        if (anye != null) {
                            arrayList.add(anye);
                        }
                        if (anyq != null) {
                            arrayList.add(anyq);
                        }
                        anyg.f77861d = anye;
                        anyg.f77862e = anyq;
                        anyg.mo42439j();
                    } else if (anxz instanceof anye) {
                        anye = anxz;
                    } else if (!(anxz instanceof anyq)) {
                        arrayList.add(anxz);
                    } else {
                        anyq = anxz;
                    }
                }
            } catch (UnsupportedOperationException e) {
                if (Log.isLoggable("UpgradeAccount", 5)) {
                    String o2 = aoed.mo42608o();
                    String g2 = aoed.mo42600g();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(o2).length() + 30 + String.valueOf(g2).length());
                    sb2.append("Failed to add field: type=");
                    sb2.append(o2);
                    sb2.append(" id=");
                    sb2.append(g2);
                    Log.w("UpgradeAccount", sb2.toString(), e);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final void m65622a(anxz anxz) {
        if (anxz.mo42419e()) {
            anxz.setVisibility(8);
        }
        if (anxz.mo42421g() != null) {
            this.f77904a.mo42409a(anxz.mo42421g());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42471a() {
        if (this.f77914k) {
            return;
        }
        if (!this.f77906c.mo17935a()) {
            this.f77907d.setText((int) C0126R.string.common_next);
        } else if (anzh.m65642c(this.f77913j)) {
            this.f77907d.setText((int) C0126R.string.common_accept);
        } else {
            this.f77907d.setText((int) C0126R.string.plus_oob_join);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42472a(LayoutInflater layoutInflater, View view) {
        int i;
        if (!getArguments().getBoolean("is_setup_wizard_theme")) {
            i = C0126R.C0128layout.plus_oob_buttons;
        } else {
            i = C0126R.C0128layout.plus_oob_buttons_setup_wizard;
        }
        layoutInflater.inflate(i, (ViewGroup) view.findViewById(C0126R.C0129id.buttons_layout), true);
    }

    /* renamed from: a */
    public final void mo26132a(ScrollView scrollView, boolean z) {
        mo42474b();
        mo42482c();
    }

    /* renamed from: a */
    public void mo42473a(UpgradeAccountEntity upgradeAccountEntity) {
        int i;
        LinearLayout linearLayout = this.f77905b;
        if (linearLayout != null) {
            this.f77913j = upgradeAccountEntity;
            linearLayout.removeAllViews();
            if (upgradeAccountEntity.mo42813b() && upgradeAccountEntity.f83068d.mo42812b()) {
                List a = m65621a(upgradeAccountEntity.f83068d.f83085c);
                int i2 = 0;
                while (i2 < a.size()) {
                    anxz anxz = (anxz) a.get(i2);
                    if (!this.f77916m || !(anxz instanceof anyo) || (i = i2 + 1) >= a.size() || !(a.get(i) instanceof anyg)) {
                        this.f77905b.addView(anxz);
                        m65622a(anxz);
                    } else {
                        anxz anxz2 = (anxz) a.get(i);
                        LinearLayout linearLayout2 = this.f77905b;
                        anyo anyo = (anyo) anxz;
                        anyg anyg = (anyg) anxz2;
                        LinearLayout linearLayout3 = new LinearLayout(getActivity());
                        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                        linearLayout3.setOrientation(0);
                        linearLayout3.setLayoutParams(layoutParams);
                        linearLayout3.setGravity(80);
                        linearLayout3.addView(anyo);
                        ((LinearLayout.LayoutParams) anyo.getLayoutParams()).weight = 1.0f;
                        linearLayout3.addView(anyg);
                        ((LinearLayout.LayoutParams) anyg.getLayoutParams()).weight = 0.0f;
                        linearLayout2.addView(linearLayout3);
                        m65622a(anxz);
                        m65622a(anxz2);
                        i2 = i;
                    }
                    i2++;
                }
            }
            if (anzh.m65642c(upgradeAccountEntity)) {
                this.f77911h.setText((int) C0126R.string.plus_oob_title_tos);
                this.f77912i.setVisibility(8);
            }
            mo42482c();
        } else if (Log.isLoggable("UpgradeAccount", 5)) {
            Log.w("UpgradeAccount", "Form build requested but view has not yet been created");
        }
    }
}
