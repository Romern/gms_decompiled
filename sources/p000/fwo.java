package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.Loader;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.model.SourcedContactPerson;
import com.google.android.gms.appinvite.p015ui.context.section.LoaderSectionInfo;
import com.google.android.gms.appinvite.p015ui.context.section.SectionInfo;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: fwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fwo extends Fragment implements TextView.OnEditorActionListener, View.OnFocusChangeListener, FragmentManager.OnBackStackChangedListener, rka, fxo, fxv {

    /* renamed from: A */
    public int f17443A;

    /* renamed from: B */
    public int f17444B;

    /* renamed from: C */
    public aap f17445C;

    /* renamed from: D */
    public fvw f17446D;

    /* renamed from: E */
    public fwd f17447E;

    /* renamed from: F */
    public AdapterView.OnItemClickListener f17448F;

    /* renamed from: G */
    public int f17449G;

    /* renamed from: H */
    public int f17450H;

    /* renamed from: I */
    private int f17451I;

    /* renamed from: J */
    private String f17452J;

    /* renamed from: K */
    private boolean f17453K;

    /* renamed from: L */
    private String[] f17454L;

    /* renamed from: M */
    private boolean f17455M;

    /* renamed from: N */
    private boolean f17456N;

    /* renamed from: O */
    private final fzl f17457O = new fzl();

    /* renamed from: P */
    private boolean f17458P;

    /* renamed from: Q */
    private boolean f17459Q;

    /* renamed from: R */
    private boolean f17460R;

    /* renamed from: S */
    private boolean f17461S = false;

    /* renamed from: a */
    public Context f17462a;

    /* renamed from: b */
    public rkb f17463b;

    /* renamed from: c */
    public String f17464c;

    /* renamed from: d */
    public int f17465d;

    /* renamed from: e */
    public fwz f17466e;

    /* renamed from: f */
    public fxb f17467f;

    /* renamed from: g */
    public fxa f17468g;

    /* renamed from: h */
    public boolean f17469h;

    /* renamed from: i */
    public SparseIntArray f17470i;

    /* renamed from: j */
    public SparseIntArray f17471j;

    /* renamed from: k */
    public View f17472k;

    /* renamed from: l */
    public boolean f17473l;

    /* renamed from: m */
    public ArrayList f17474m;

    /* renamed from: n */
    public ArrayList f17475n;

    /* renamed from: o */
    public ArrayList f17476o;

    /* renamed from: p */
    public String f17477p;

    /* renamed from: q */
    public View f17478q;

    /* renamed from: r */
    public ArrayList f17479r = new ArrayList();

    /* renamed from: s */
    public fyt f17480s;

    /* renamed from: t */
    public fxj f17481t;

    /* renamed from: u */
    public fxg f17482u;

    /* renamed from: v */
    public List f17483v;

    /* renamed from: w */
    public final SparseBooleanArray f17484w = new SparseBooleanArray();

    /* renamed from: x */
    public fwm f17485x;

    /* renamed from: y */
    public CharSequence f17486y;

    /* renamed from: z */
    public boolean f17487z;

    /* renamed from: a */
    public static fwo m12510a(String str, int i, ArrayList arrayList, boolean z, Bundle bundle, boolean z2, String[] strArr, boolean z3, int i2, int i3, ArrayList arrayList2, String str2, boolean z4, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, String str3, boolean z5) {
        fwo fwo = new fwo();
        Bundle bundle2 = new Bundle();
        bundle2.putString("accountName", str);
        bundle2.putInt("maxSelected", i);
        bundle2.putParcelableArrayList("initialSelection", arrayList);
        bundle2.putBoolean("allowContactMethodSelection", z);
        bundle2.putBundle("methodData", bundle);
        bundle2.putBoolean("hideMethodIcon", z2);
        bundle2.putStringArray("searchMethodOrder", strArr);
        bundle2.putBoolean("excludeNonGaiaContacts", z3);
        bundle2.putInt("numPortraitColumns", i2);
        bundle2.putInt("numLandscapeColumns", i3);
        bundle2.putParcelableArrayList("sections", arrayList2);
        bundle2.putString("callingPackageName", str2);
        bundle2.putBoolean("includePublicSearch", z4);
        bundle2.putStringArrayList("disabledGaiaIds", arrayList3);
        bundle2.putStringArrayList("disabledEmailAddresses", arrayList4);
        bundle2.putStringArrayList("disabledPhoneNumbers", arrayList5);
        bundle2.putString("disabledMessage", str3);
        bundle2.putBoolean("enableSmsWarning", z5);
        fwo.setArguments(bundle2);
        return fwo;
    }

    /* renamed from: c */
    public static boolean m12515c(ContactPerson contactPerson) {
        ContactPerson.ContactMethod a = contactPerson.mo7263a();
        return a != null && a.f9755a == 2;
    }

    /* renamed from: f */
    private final boolean m12516f() {
        FragmentManager fragmentManager = getFragmentManager();
        for (int i = 0; i < fragmentManager.getBackStackEntryCount(); i++) {
            FragmentManager.BackStackEntry backStackEntryAt = fragmentManager.getBackStackEntryAt(i);
            if (backStackEntryAt != null && "searchMode".equals(backStackEntryAt.getName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private final void m12517g() {
        fyt fyt = this.f17480s;
        if (fyt != null) {
            fyt.post(new fwi(this));
        }
    }

    /* renamed from: b */
    public final List mo11435b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f17479r;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((SourcedContactPerson) arrayList2.get(i)).f9758a);
        }
        return arrayList;
    }

    /* renamed from: d */
    public final int mo11441d(ContactPerson contactPerson) {
        for (int i = 0; i < this.f17479r.size(); i++) {
            if (((SourcedContactPerson) this.f17479r.get(i)).f9758a.equals(contactPerson)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public final void mo11443e() {
        if (this.f17456N && !this.f17473l && this.f17472k == null) {
            View a = fzq.m12806a(getActivity(), this.f17462a.getString(C0126R.string.appinvite_contextual_selection_sms_warning), true, false, 0, new fwl(this));
            this.f17472k = a;
            if (a == null) {
                this.f17473l = true;
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f17463b == null) {
            allp a = allq.m61232a();
            a.f73626a = 80;
            allq a2 = a.mo40491a();
            rjy rjy = new rjy(getActivity().getApplicationContext());
            rjy.mo24778a(this.f17464c);
            rjy.mo24782a(this);
            rjy.mo24780a(allr.f73629a, a2);
            this.f17463b = rjy.mo24784b();
            allf allf = new allf();
            allf.f73618a = 0;
            allf.mo40485b();
            allf.mo40484a();
        }
        fwd fwd = new fwd(this.f17462a, this.f17460R, this.f17469h, this.f17464c, this.f17454L, getLoaderManager());
        this.f17447E = fwd;
        fwd.f17419m = this.f17487z;
        fwd.f17410d = this.f17463b;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!m12514a(activity)) {
            rpr b = rpr.m34216b();
            if (m12514a(b)) {
                b.setTheme(2132018573);
                this.f17462a = b;
                return;
            }
            Log.e("CPSelectionFragment", "Couldn't find Context with AppInvite resources mapped correctly. Using Activity that doesn't have resources mapped, which may fail.");
        }
        this.f17462a = activity;
    }

    public final void onBackStackChanged() {
        if (this.f17459Q && !m12516f()) {
            mo11437b(false);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: fwo.a(boolean, boolean):void
     arg types: [boolean, int]
     candidates:
      fwo.a(com.google.android.gms.appinvite.model.ContactPerson, boolean):void
      fwo.a(int, java.util.List):java.util.List
      fwo.a(boolean, boolean):void */
    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayList;
        String str;
        super.onCreate(bundle);
        if (this.f17443A == 0) {
            this.f17443A = this.f17462a.getResources().getColor(C0126R.color.material_google_blue_500);
        }
        if (this.f17444B == 0) {
            this.f17444B = this.f17462a.getResources().getColor(C0126R.color.material_teal_500);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f17464c = arguments.getString("accountName");
            this.f17465d = arguments.getInt("maxSelected");
            this.f17469h = arguments.getBoolean("allowContactMethodSelection");
            this.f17453K = arguments.getBoolean("hideMethodIcon");
            this.f17454L = arguments.getStringArray("searchMethodOrder");
            this.f17455M = arguments.getBoolean("excludeNonGaiaContacts");
            if (getResources().getConfiguration().orientation != 2) {
                str = "numPortraitColumns";
            } else {
                str = "numLandscapeColumns";
            }
            this.f17451I = arguments.getInt(str);
            this.f17483v = arguments.getParcelableArrayList("sections");
            this.f17452J = arguments.getString("callingPackageName");
            this.f17460R = arguments.getBoolean("includePublicSearch");
            this.f17474m = arguments.getStringArrayList("disabledGaiaIds");
            this.f17475n = arguments.getStringArrayList("disabledEmailAddresses");
            this.f17476o = arguments.getStringArrayList("disabledPhoneNumbers");
            this.f17477p = arguments.getString("disabledMessage");
            this.f17456N = arguments.getBoolean("enableSmsWarning");
            Bundle bundle2 = arguments.getBundle("methodData");
            if (bundle2 != null && bundle2.containsKey("methodIcons")) {
                this.f17470i = new SparseIntArray();
                Bundle bundle3 = bundle2.getBundle("methodIcons");
                for (String str2 : bundle3.keySet()) {
                    this.f17470i.put(Integer.parseInt(str2), bundle3.getInt(str2));
                }
            }
            if (bundle2 != null && bundle2.containsKey("croppedMethodIcons")) {
                this.f17471j = new SparseIntArray();
                Bundle bundle4 = bundle2.getBundle("croppedMethodIcons");
                for (String str3 : bundle4.keySet()) {
                    this.f17471j.put(Integer.parseInt(str3), bundle4.getInt(str3));
                }
            }
        }
        this.f17481t = new fxj();
        for (int i = 0; i < this.f17483v.size(); i++) {
            SectionInfo sectionInfo = (SectionInfo) this.f17483v.get(i);
            fxj fxj = this.f17481t;
            fxg a = sectionInfo.mo7291a(this, this.f17451I);
            a.mo166a(new fxi(fxj, a));
            fxj.f17514e.add(a);
            if (sectionInfo.f9803p) {
                this.f17481t.f17515f = i;
                fxg b = sectionInfo.mo7296b(this, this.f17451I);
                this.f17482u = b;
                b.mo11463c(this.f17487z);
                this.f17482u.mo11465d(this.f17469h);
                this.f17482u.mo11467e(this.f17453K);
            }
        }
        this.f17481t.mo11463c(this.f17487z);
        this.f17481t.mo11465d(this.f17469h);
        this.f17481t.mo11467e(this.f17453K);
        if (bundle != null) {
            this.f17479r = bundle.getParcelableArrayList("selectedPeople");
            this.f17473l = bundle.getBoolean("smsWarningAcknowledged");
            this.f17459Q = bundle.getBoolean("searchMode");
            this.f17486y = bundle.getCharSequence("searchText");
            m12513a(bundle.getBoolean("editMode"), true);
        } else if (!(arguments == null || !arguments.containsKey("initialSelection") || (parcelableArrayList = arguments.getParcelableArrayList("initialSelection")) == null)) {
            this.f17479r = new ArrayList();
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f17479r.add(new SourcedContactPerson((ContactPerson) parcelableArrayList.get(i2), 0));
            }
        }
        m12512a(mo11435b());
    }

    public final void onDetach() {
        super.onDetach();
        this.f17462a = null;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        if (this.f17447E.getCount() == 1) {
            mo11430a(0);
        } else {
            ssc.m36197a(getActivity(), textView);
        }
        return true;
    }

    public final void onFocusChange(View view, boolean z) {
        fxa fxa;
        if (!z && !this.f17461S && (fxa = this.f17468g) != null) {
            fxa.mo7250a(false);
        }
    }

    public final void onPause() {
        super.onPause();
        if (this.f17472k != null) {
            fzq.m12809b(getActivity(), this.f17472k);
        }
        if (this.f17478q != null) {
            fzq.m12809b(getActivity(), this.f17478q);
            this.f17478q = null;
        }
        if (this.f17459Q) {
            this.f17486y = this.f17481t.mo11466e();
        }
        getFragmentManager().removeOnBackStackChangedListener(this);
    }

    public final void onResume() {
        super.onResume();
        if (this.f17472k != null) {
            fzq.m12807a(getActivity(), this.f17472k);
        }
        if (this.f17459Q) {
            m12517g();
        }
        getFragmentManager().addOnBackStackChangedListener(this);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("selectedPeople", new ArrayList(this.f17479r));
        bundle.putBoolean("smsWarningAcknowledged", this.f17473l);
        bundle.putBoolean("editMode", this.f17458P);
        bundle.putBoolean("searchMode", this.f17459Q);
        fxj fxj = this.f17481t;
        if (fxj != null) {
            bundle.putCharSequence("searchText", fxj.mo11466e());
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void onStart() {
        int i;
        Loader loader;
        char c;
        super.onStart();
        rkb rkb = this.f17463b;
        if (rkb == null || rkb.mo24805i() || this.f17463b.mo24806j()) {
            i = 0;
        } else {
            this.f17463b.mo24801e();
            i = 0;
        }
        while (true) {
            if (i < this.f17483v.size()) {
                if (!this.f17484w.get(i, false)) {
                    if (this.f17483v.get(i) instanceof LoaderSectionInfo) {
                        LoaderSectionInfo loaderSectionInfo = (LoaderSectionInfo) this.f17483v.get(i);
                        String str = loaderSectionInfo.f9788a;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -991808881:
                                    if (str.equals("people")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -184842003:
                                    if (str.equals("identityPeople")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 315730723:
                                    if (str.equals("suggested")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 782949795:
                                    if (str.equals("circles")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c == 0) {
                                loader = new fye(getActivity(), this.f17464c, loaderSectionInfo);
                            } else if (c == 1) {
                                loader = new fyd(getActivity(), this.f17464c, loaderSectionInfo, this.f17468g, this.f17455M);
                            } else if (c != 2) {
                                loader = c != 3 ? null : new fxw(getActivity(), this.f17464c, loaderSectionInfo);
                            } else {
                                Activity activity = getActivity();
                                loader = new fya(activity, this.f17464c, this.f17452J, loaderSectionInfo, fva.m12456a(activity), this.f17468g);
                            }
                        } else {
                            loader = null;
                        }
                        if (loader != null) {
                            getLoaderManager().initLoader(i, null, new fwn(this, loader));
                        } else if ("supplied".equals(loaderSectionInfo.f9788a)) {
                            mo11429a(i, loaderSectionInfo.f9799l);
                            this.f17484w.put(i, true);
                        } else {
                            fwz fwz = this.f17466e;
                            if (fwz != null) {
                                fwz.mo7255e();
                            }
                        }
                    } else {
                        this.f17484w.put(i, true);
                    }
                }
                i++;
            } else {
                mo11440c(false);
            }
        }
        fwd fwd = this.f17447E;
        if (fwd.f17412f) {
            fwd.f17424r = (fyg) fwd.f17423q.initLoader(-1, null, fwd.f17425s);
        }
    }

    public final void onStop() {
        super.onStop();
        rkb rkb = this.f17463b;
        if (rkb != null) {
            rkb.mo24803g();
        }
        aap aap = this.f17445C;
        if (aap != null) {
            aap.mo105d();
            this.f17445C = null;
        }
        fwd fwd = this.f17447E;
        if (fwd.f17412f) {
            fwd.f17423q.destroyLoader(-1);
        }
    }

    /* renamed from: a */
    private final void m12511a(ContactPerson contactPerson, boolean z) {
        int i;
        String a = fzm.m12789a(this.f17462a, contactPerson);
        Context context = this.f17462a;
        if (!z) {
            i = C0126R.string.appinvite_recipient_not_selected;
        } else {
            i = C0126R.string.appinvite_recipient_selected;
        }
        String string = context.getString(i);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(string).length());
        sb.append(a);
        sb.append(" ");
        sb.append(string);
        String sb2 = sb.toString();
        getActivity();
        fzq.m12808a(this.f17480s, sb2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: fwo.a(com.google.android.gms.appinvite.model.ContactPerson, boolean):void
     arg types: [com.google.android.gms.appinvite.model.ContactPerson, int]
     candidates:
      fwo.a(boolean, boolean):void
      fwo.a(int, java.util.List):java.util.List
      fwo.a(com.google.android.gms.appinvite.model.ContactPerson, boolean):void */
    /* renamed from: b */
    public final void mo11436b(ContactPerson contactPerson, int i, int i2) {
        int i3 = 5;
        if (i == 1) {
            i3 = 2;
        } else if (i == 2) {
            i3 = 3;
        } else if (i == 3) {
            i3 = 4;
        } else if (i != 5) {
            i3 = 1;
        }
        SourcedContactPerson sourcedContactPerson = new SourcedContactPerson(contactPerson, i3 - 1);
        int d = mo11441d(contactPerson);
        if (this.f17479r.size() < this.f17465d) {
            if (d < 0) {
                this.f17479r.add(sourcedContactPerson);
                this.f17481t.mo11455a(contactPerson);
                fxg fxg = this.f17482u;
                if (fxg != null) {
                    fxg.mo11455a(contactPerson);
                }
                m12511a(contactPerson, true);
            } else {
                this.f17479r.set(d, sourcedContactPerson);
                this.f17481t.mo11458b(contactPerson);
                fxg fxg2 = this.f17482u;
                if (fxg2 != null) {
                    fxg2.mo11458b(contactPerson);
                }
            }
            if (m12515c(contactPerson)) {
                mo11443e();
            }
            fxb fxb = this.f17467f;
            if (fxb != null) {
                fxb.mo7248a(contactPerson, true);
            }
        } else if (d < 0) {
            Toast.makeText(getActivity(), this.f17462a.getString(C0126R.string.appinvite_contextual_selection_limit), 0).show();
        }
        fxa fxa = this.f17468g;
        if (fxa != null) {
            fxa.mo7247a(contactPerson, i, i2, true);
        }
    }

    /* renamed from: c */
    public final int mo11439c() {
        return this.f17479r.size();
    }

    /* renamed from: d */
    public final void mo11442d() {
        aap aap = new aap(this.f17462a);
        this.f17445C = aap;
        aap.f61f = -2;
        aap.mo114m();
        this.f17445C.f68m = new fwj(this);
        fvw fvw = new fvw(this.f17462a, this.f17470i, new fwk(this));
        this.f17446D = fvw;
        fvw.notifyDataSetChanged();
        fvw fvw2 = this.f17446D;
        fvw2.f17391b = this.f17469h;
        fvw2.f17392c = this.f17443A;
        this.f17445C.mo99a(fvw2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        fyt fyt = new fyt(this.f17462a);
        this.f17480s = fyt;
        fyt.f17664g = this;
        fyt.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        fzf fzf = (fzf) this.f17480s.f17658a;
        if (!fzf.f17731d) {
            fzf.f17731d = true;
            if (fzf.f17730c != Thread.currentThread()) {
                fzf.post(new fzd(fzf));
            } else {
                fzf.mo11554a();
            }
        }
        this.f17480s.f17658a.setHasFixedSize(true);
        this.f17480s.setFocusableInTouchMode(true);
        this.f17480s.mo11526a(this.f17444B);
        aab aab = new aab(this.f17451I, null);
        fwe fwe = new fwe(this);
        fwe.f2c = true;
        aab.f9g = fwe;
        this.f17480s.f17658a.setLayoutManager(aab);
        this.f17480s.f17658a.f17727b = new fwf(this);
        mo11437b(this.f17459Q);
        if (!TextUtils.isEmpty(this.f17486y)) {
            m12517g();
        }
        return this.f17480s;
    }

    /* renamed from: c */
    public final void mo11440c(boolean z) {
        if (mo11433a()) {
            this.f17481t.mo11463c(this.f17487z);
            this.f17481t.mo11469f(this.f17443A);
            fxg fxg = this.f17482u;
            if (fxg != null) {
                fxg.mo11463c(this.f17487z);
                this.f17482u.mo11469f(this.f17443A);
            }
            fyt fyt = this.f17480s;
            fxj fxj = this.f17481t;
            fyt.f17659b = fxj;
            fyt.f17658a.setAdapter(fxj);
            fyt fyt2 = this.f17480s;
            fxg fxg2 = this.f17482u;
            fyt2.f17660c = fxg2;
            int i = 0;
            if (fxg2 == null) {
                fyt2.f17662e = false;
            } else {
                if (fyt2.f17661d == null) {
                    fyt2.f17661d = new fys(fyt2.getContext());
                    int i2 = 0;
                    while (i2 < fyt2.getChildCount()) {
                        boolean equals = fyt2.getChildAt(i2).equals(fyt2.f17658a);
                        i2++;
                        if (equals) {
                            break;
                        }
                    }
                    fyt2.addView(fyt2.f17661d, i2, new FrameLayout.LayoutParams(-1, -2));
                }
                fys fys = fyt2.f17661d;
                abh abh = fys.f17650a;
                if (abh != fxg2) {
                    if (abh != null) {
                        abh.mo174b(fys.f17653d);
                    }
                    fys.f17650a = fxg2;
                    fxg2.mo166a(fys.f17653d);
                    fys.mo11520a();
                }
                fyt2.f17662e = true;
            }
            while (true) {
                if (i < this.f17479r.size()) {
                    if (m12515c(((SourcedContactPerson) this.f17479r.get(i)).f9758a)) {
                        mo11443e();
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            fwz fwz = this.f17466e;
            if (fwz == null) {
                return;
            }
            if (!z) {
                fwz.mo7245a(this.f17449G, this.f17450H);
            } else {
                fwz.mo7252b(this.f17449G, this.f17450H);
            }
        }
    }

    /* renamed from: a */
    private final void m12512a(List list) {
        for (int i = 0; i < list.size(); i++) {
            ContactPerson contactPerson = (ContactPerson) list.get(i);
            ContactPerson a = this.f17457O.mo11561a(contactPerson);
            if (a != contactPerson) {
                list.set(i, a);
            }
        }
    }

    /* renamed from: a */
    private final void m12513a(boolean z, boolean z2) {
        if (z2 || this.f17458P != z) {
            this.f17458P = z;
            fxg fxg = this.f17482u;
            if (fxg != null) {
                fxg.mo11460b(z);
            }
            this.f17481t.mo11460b(this.f17458P);
            if (!this.f17458P) {
                mo11437b(false);
            } else if (!z2 && this.f17479r.size() == 0) {
                mo11437b(true);
            }
        }
    }

    /* renamed from: a */
    private static boolean m12514a(Context context) {
        if (context != null) {
            try {
                Resources resources = context.getResources();
                String resourceEntryName = resources.getResourceEntryName(C0126R.string.common_choose_account);
                String resourceTypeName = resources.getResourceTypeName(C0126R.string.common_choose_account);
                if (!"common_choose_account".equals(resourceEntryName) || !"string".equals(resourceTypeName)) {
                    return false;
                }
                return true;
            } catch (Resources.NotFoundException e) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List mo11429a(int i, List list) {
        int i2;
        String str;
        String str2;
        String str3;
        fxn fxn = (fxn) ((fxg) this.f17481t.f17514e.get(i));
        LoaderSectionInfo loaderSectionInfo = (LoaderSectionInfo) this.f17483v.get(i);
        if (!(loaderSectionInfo.f9800m == null && loaderSectionInfo.f9801n == null && loaderSectionInfo.f9802o == null)) {
            ArrayList arrayList = new ArrayList(list);
            fzm.m12793a(arrayList, loaderSectionInfo.f9800m, loaderSectionInfo.f9801n, loaderSectionInfo.f9802o);
            list = arrayList;
        }
        if (getResources().getConfiguration().orientation == 2) {
            i2 = loaderSectionInfo.f9798k;
        } else {
            i2 = loaderSectionInfo.f9797j;
        }
        List subList = list.subList(0, Math.min(i2, list.size()));
        m12512a(subList);
        fxn.f17528l.clear();
        fxn.f17528l.addAll(subList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (!TextUtils.isEmpty(fxn.f17525i)) {
            if (!fxn.f17524h) {
                str2 = "";
            } else {
                str2 = fxn.f17525i;
            }
            arrayList2.add(str2);
            arrayList3.add(0);
        } else if (!TextUtils.isEmpty(fxn.f17526j)) {
            if (!fxn.f17524h) {
                str3 = "";
            } else {
                str3 = fxn.f17526j;
            }
            arrayList2.add(str3);
            arrayList3.add(0);
        }
        if (fxn.f17523g) {
            String str4 = "";
            for (int i3 = 0; i3 < fxn.f17528l.size(); i3++) {
                if (((ContactPerson) fxn.f17528l.get(i3)).f9749a == null || ((ContactPerson) fxn.f17528l.get(i3)).f9749a.length() <= 0) {
                    str = "";
                } else {
                    str = ((ContactPerson) fxn.f17528l.get(i3)).f9749a.substring(0, 1).toUpperCase();
                }
                if (!str.equals(str4)) {
                    arrayList2.add(str);
                    arrayList3.add(Integer.valueOf(fxn.f17527k + i3));
                    str4 = str;
                }
            }
        }
        arrayList3.add(Integer.valueOf(fxn.mo161a()));
        fxn.f17529m = arrayList2.toArray();
        fxn.f17530n = new int[arrayList3.size()];
        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
            fxn.f17530n[i4] = ((Integer) arrayList3.get(i4)).intValue();
        }
        fxn.mo171aJ();
        return subList;
    }

    /* renamed from: b */
    public final void mo11437b(boolean z) {
        this.f17459Q = z;
        fyt fyt = this.f17480s;
        if (fyt != null) {
            boolean z2 = !z;
            if (fyt.f17663f != z2) {
                fyt.f17663f = z2;
                fyt.mo11525a();
            }
            this.f17481t.mo11470f(z);
            if (z) {
                this.f17461S = false;
                this.f17480s.post(new fwh(this));
                if (isResumed() && !m12516f()) {
                    getFragmentManager().beginTransaction().addToBackStack("searchMode").commit();
                    return;
                }
                return;
            }
            this.f17481t.mo11457a((CharSequence) null);
            fxg fxg = this.f17482u;
            if (fxg != null) {
                fxg.mo11457a((CharSequence) null);
            }
            ssc.m36197a(getActivity(), this.f17480s);
            if (isResumed()) {
                getFragmentManager().popBackStack("searchMode", 1);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo11438b(ContactPerson contactPerson) {
        return fzm.m12794a(contactPerson, this.f17474m, this.f17475n, this.f17476o);
    }

    /* renamed from: a */
    public final void mo11430a(int i) {
        int itemViewType = this.f17447E.getItemViewType(i);
        fwd fwd = this.f17447E;
        if (itemViewType == fwd.f17407a) {
            this.f17461S = true;
            fwc fwc = (fwc) fwd.getItem(i);
            ContactPerson.ContactMethod contactMethod = fwc.f17405b;
            if (contactMethod != null) {
                fwc.f17404a.mo7264a(contactMethod);
            }
            mo11436b(this.f17457O.mo11561a(fwc.f17404a), fwc.f17406c, i);
            mo11437b(false);
            fxa fxa = this.f17468g;
            if (fxa != null) {
                fxa.mo7250a(true);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: fwo.a(com.google.android.gms.appinvite.model.ContactPerson, boolean):void
     arg types: [com.google.android.gms.appinvite.model.ContactPerson, int]
     candidates:
      fwo.a(boolean, boolean):void
      fwo.a(int, java.util.List):java.util.List
      fwo.a(com.google.android.gms.appinvite.model.ContactPerson, boolean):void */
    /* renamed from: a */
    public final void mo11431a(ContactPerson contactPerson, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f17479r.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (fzm.m12800d(contactPerson, ((SourcedContactPerson) it.next()).f9758a)) {
                it.remove();
                arrayList.add(Integer.valueOf(i3));
            }
            i3++;
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            Integer num = (Integer) arrayList.get(i4);
            this.f17481t.mo11456a(contactPerson, num.intValue());
            fxg fxg = this.f17482u;
            if (fxg != null) {
                fxg.mo11456a(contactPerson, num.intValue());
            }
        }
        m12511a(contactPerson, false);
        fxb fxb = this.f17467f;
        if (fxb != null) {
            fxb.mo7248a(contactPerson, false);
        }
        fxa fxa = this.f17468g;
        if (fxa != null) {
            fxa.mo7247a(contactPerson, i, i2, false);
        }
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        this.f17463b.mo24804h();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: fwo.a(boolean, boolean):void
     arg types: [boolean, int]
     candidates:
      fwo.a(com.google.android.gms.appinvite.model.ContactPerson, boolean):void
      fwo.a(int, java.util.List):java.util.List
      fwo.a(boolean, boolean):void */
    /* renamed from: a */
    public final void mo11432a(boolean z) {
        m12513a(z, false);
    }

    /* renamed from: a */
    public final boolean mo11433a() {
        for (int i = 0; i < this.f17483v.size(); i++) {
            if (!this.f17484w.get(i, false)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo11434a(ContactPerson contactPerson) {
        ArrayList arrayList = this.f17479r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (fzm.m12800d(((SourcedContactPerson) arrayList.get(i)).f9758a, contactPerson)) {
                return true;
            }
            i = i2;
        }
        return false;
    }
}
