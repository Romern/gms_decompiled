package p000;

import android.content.Intent;
import android.os.Bundle;
import android.support.p002v7.widget.SearchView;
import android.support.p002v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.auth.CallingAppInfo;
import com.google.android.gms.drive.p039ui.select.SelectFilePreferences;
import com.google.android.gms.drive.p039ui.select.Selection;
import com.google.android.gms.drive.p039ui.select.path.DriveIdPathElement;
import com.google.android.gms.drive.p039ui.select.path.PathElement;
import com.google.android.gms.drive.p039ui.select.path.PathStack;
import com.google.android.gms.drive.p039ui.select.path.SearchPathElement;
import com.google.android.gms.drive.p039ui.select.path.ViewPathElement;
import com.google.android.gms.drive.p039ui.select.view.FileListView;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.internal.FilterHolder;

/* renamed from: vmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vmy extends vlh implements vlw, vne, vnn, vnc {

    /* renamed from: a */
    public static final sbw f49539a = new sbw("SelectFileFragment", "");

    /* renamed from: A */
    private MenuItem f49540A;

    /* renamed from: B */
    private MenuItem f49541B;

    /* renamed from: C */
    private MenuItem f49542C;

    /* renamed from: D */
    private final vmp f49543D = new vmp(this);

    /* renamed from: E */
    private final vmq f49544E = new vmq(this);

    /* renamed from: F */
    private final vmt f49545F = new vmt(this);

    /* renamed from: b */
    public final Runnable f49546b = new vms(this);

    /* renamed from: c */
    public final Runnable f49547c = new vmm(this);

    /* renamed from: d */
    public final rkl f49548d = new vmu(this);

    /* renamed from: e */
    public String f49549e;

    /* renamed from: f */
    public boolean f49550f;

    /* renamed from: g */
    public rkb f49551g;

    /* renamed from: h */
    public PathStack f49552h;

    /* renamed from: i */
    public Selection f49553i;

    /* renamed from: j */
    public vme f49554j;

    /* renamed from: k */
    public vcy f49555k;

    /* renamed from: l */
    public C1341rz f49556l;

    /* renamed from: m */
    public SwipeRefreshLayout f49557m;

    /* renamed from: n */
    public FileListView f49558n;

    /* renamed from: o */
    private final abz f49559o = new vmr(this);

    /* renamed from: p */
    private final rkl f49560p = new vmv(this);

    /* renamed from: q */
    private SelectFilePreferences f49561q;

    /* renamed from: r */
    private aah f49562r;

    /* renamed from: s */
    private vni f49563s;

    /* renamed from: t */
    private Bundle f49564t;

    /* renamed from: u */
    private vda f49565u;

    /* renamed from: v */
    private TextView f49566v;

    /* renamed from: w */
    private TextView f49567w;

    /* renamed from: x */
    private Button f49568x;

    /* renamed from: y */
    private MenuItem f49569y;

    /* renamed from: z */
    private SearchView f49570z;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.SearchView.a(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      android.support.v7.widget.LinearLayoutCompat.a(android.graphics.Canvas, int):void
      android.support.v7.widget.SearchView.a(java.lang.CharSequence, boolean):void */
    /* renamed from: a */
    private final void m40870a(String str) {
        MenuItem menuItem = this.f49569y;
        if (menuItem != null) {
            if (!menuItem.isActionViewExpanded()) {
                this.f49569y.expandActionView();
            }
            if (!str.equals(this.f49570z.mo1625d().toString())) {
                this.f49570z.mo1616a((CharSequence) str, false);
            }
        }
    }

    /* renamed from: e */
    private final void m40873e() {
        MenuItem menuItem = this.f49569y;
        if (menuItem != null && menuItem.isActionViewExpanded()) {
            this.f49569y.collapseActionView();
        }
    }

    /* renamed from: f */
    private final void m40874f() {
        MenuItem menuItem = this.f49540A;
        if (menuItem != null) {
            menuItem.setVisible(this.f49552h.mo18351b() instanceof DriveIdPathElement);
        }
    }

    /* renamed from: g */
    private final void m40875g() {
        if (this.f49541B != null) {
            PathElement b = this.f49552h.mo18351b();
            boolean booleanValue = ((Boolean) twy.f46806Q.mo58455c()).booleanValue();
            PathElement pathElement = PathStack.f31210b;
            boolean z = false;
            if (!(!booleanValue || b == null || b == pathElement)) {
                z = true;
            }
            this.f49541B.setVisible(z);
        }
    }

    /* renamed from: b */
    public final void mo28652b() {
        MenuItem menuItem = this.f49569y;
        rkb rkb = this.f49551g;
        boolean z = false;
        if (rkb != null && rkb.mo24805i()) {
            z = true;
        }
        if (menuItem != null) {
            menuItem.setEnabled(z);
            menuItem.getIcon().setAlpha((int) ((!z ? 0.6f : 1.0f) * 255.0f));
        }
    }

    /* renamed from: c */
    public final void mo28630c() {
        this.f49568x.setEnabled(this.f49553i.f31201d != null);
    }

    /* renamed from: d */
    public final void mo28653d() {
        rkb rkb = this.f49551g;
        boolean z = false;
        if (!(rkb == null || !rkb.mo24805i() || this.f49552h.mo18351b() == PathStack.f31210b)) {
            z = true;
        }
        MenuItem menuItem = this.f49542C;
        if (menuItem != null) {
            menuItem.setVisible(z);
        }
        this.f49557m.setEnabled(z);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        rkb rkb = ((vlf) getActivity()).f49436b;
        this.f49551g = rkb;
        vme vme = this.f49554j;
        sdo.m34959a(rkb);
        vme.f49496i = rkb;
        vme.f49498k.mo18350a(vme);
        vme.f49499l.mo18333a(vme);
        this.f49552h.mo18350a(this);
        this.f49553i.mo18333a(this);
    }

    public final void onCreate(Bundle bundle) {
        PathStack pathStack;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f49549e = arguments.getString("callerSdkAppId");
        DriveId driveId = (DriveId) arguments.getParcelable("initialFolderId");
        this.f49550f = arguments.getBoolean("authorizeResource", false);
        if (bundle != null) {
            this.f49552h = (PathStack) bundle.getParcelable("pathStack");
            this.f49553i = (Selection) bundle.getParcelable("selection");
            this.f49561q = (SelectFilePreferences) bundle.getParcelable("preferences");
            this.f49564t = bundle.getBundle("logSessionState");
            return;
        }
        if (driveId == null) {
            pathStack = new PathStack(PathStack.m23106a(vnr.f49586a));
        } else {
            pathStack = new PathStack(driveId);
        }
        this.f49552h = pathStack;
        this.f49553i = new Selection(((FilterHolder) arguments.getParcelable("filterHolder")).f31112j, driveId);
        this.f49561q = new SelectFilePreferences();
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C0126R.C0130menu.drive_select_file_dialog, menu);
        this.f49569y = menu.findItem(C0126R.C0129id.drive_menu_search);
        this.f49540A = menu.findItem(C0126R.C0129id.drive_menu_create_folder);
        this.f49541B = menu.findItem(C0126R.C0129id.drive_menu_sort);
        this.f49542C = menu.findItem(C0126R.C0129id.drive_menu_refresh);
        this.f49569y.setVisible(((Boolean) twy.f46805P.mo58455c()).booleanValue());
        SearchView searchView = (SearchView) C1264pc.m19826a(this.f49569y);
        this.f49570z = searchView;
        ((TextView) searchView.findViewById(C0126R.C0129id.search_src_text)).setHint(getString(C0126R.string.common_search_settings_title));
        this.f49569y.setOnActionExpandListener(new vmw(this));
        this.f49570z.f1260m = new vmx(this);
        PathElement b = this.f49552h.mo18351b();
        if (b instanceof SearchPathElement) {
            m40870a(((SearchPathElement) b).f31215a);
        }
        mo28652b();
        m40874f();
        m40875g();
        mo28653d();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.drive_select_file_dialog, viewGroup, false);
        ((vlf) getActivity()).mo8626a((Toolbar) inflate.findViewById(C0126R.C0129id.drive_select_file_dialog_toolbar));
        C1341rz aW = ((vlf) getActivity()).mo8628aW();
        this.f49556l = aW;
        aW.mo15840a((int) C0126R.C0128layout.drive_action_bar_view);
        this.f49556l.mo15876o();
        this.f49556l.mo15858c(false);
        this.f49556l.mo15846a(false);
        View a = this.f49556l.mo15837a();
        TextView textView = (TextView) a.findViewById(C0126R.C0129id.action_bar_title);
        this.f49566v = textView;
        textView.setText(getArguments().getString("dialogTitle"));
        this.f49567w = (TextView) a.findViewById(C0126R.C0129id.action_bar_folder);
        m40872a(true);
        vmo vmo = new vmo(this);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.drive_button_bar_button_right);
        this.f49568x = button;
        button.setOnClickListener(vmo);
        this.f49568x.setText(getString(C0126R.string.common_select));
        this.f49568x.setEnabled(false);
        Button button2 = (Button) inflate.findViewById(C0126R.C0129id.drive_button_bar_button_left);
        button2.setOnClickListener(vmo);
        button2.setText(17039360);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(C0126R.C0129id.drive_select_file_dialog_swipe_refresh);
        this.f49557m = swipeRefreshLayout;
        swipeRefreshLayout.setEnabled(false);
        this.f49557m.mo2092a(C0126R.color.drive_Blue, C0126R.color.drive_Green, C0126R.color.drive_Yellow);
        this.f49557m.f1697a = new vmn(this);
        this.f49558n = (FileListView) inflate.findViewById(C0126R.C0129id.drive_select_file_dialog_file_list_view);
        getActivity();
        vol vol = new vol();
        this.f49562r = vol;
        this.f49558n.setLayoutManager(vol);
        this.f49558n.f31224c = this.f49559o;
        vme vme = new vme(this.f49552h, this.f49553i, this.f49561q, getActivity());
        this.f49554j = vme;
        vme.f49502o = this.f49543D;
        vme.f49503p = this.f49545F;
        this.f49558n.setAdapter(vme);
        vni vni = new vni();
        this.f49563s = vni;
        vni.f49580a = this.f49544E;
        this.f49558n.setHasFixedSize(true);
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        vme vme = this.f49554j;
        vme.mo28632e();
        vme.f49498k.mo18352b(vme);
        vme.f49499l.mo18336b(vme);
        this.f49552h.mo18352b(this);
        this.f49553i.mo18336b(this);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C0126R.C0129id.drive_menu_search) {
            if (this.f49551g.mo24805i()) {
                this.f49552h.mo18347a(new SearchPathElement(""));
            }
            return true;
        } else if (itemId == C0126R.C0129id.drive_menu_create_folder) {
            if (this.f49558n.isEnabled()) {
                PathElement b = this.f49552h.mo18351b();
                sdo.m34970a(b instanceof DriveIdPathElement);
                DriveId a = ((DriveIdPathElement) b).mo18340a();
                vlx vlx = new vlx();
                Bundle bundle = new Bundle();
                bundle.putParcelable("parentDriveId", a);
                vlx.setArguments(bundle);
                vlx.show(getActivity().getSupportFragmentManager(), "SelectFileFragment");
            }
            return true;
        } else if (itemId == C0126R.C0129id.drive_menu_refresh) {
            this.f49557m.mo2090a(true);
            this.f49554j.mo28631d();
            return true;
        } else if (itemId == C0126R.C0129id.drive_menu_sort) {
            voc c = this.f49552h.mo18351b().mo18343c();
            voa a2 = this.f49561q.mo18327a(c);
            vnf vnf = new vnf();
            Bundle bundle2 = new Bundle();
            bundle2.putString("sortType", c.f49627f);
            bundle2.putString("currentSortOption", a2.mo28672a());
            vnf.setArguments(bundle2);
            vnf.show(getFragmentManager(), "SortOptionDialogFragment");
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (this.f49551g.mo24805i()) {
                this.f49555k = null;
                this.f49552h.mo18348a(this.f49551g);
                if (this.f49552h.mo18351b() == PathStack.f31210b) {
                    this.f49557m.mo2090a(false);
                }
            }
            return true;
        }
    }

    public final void onPause() {
        super.onPause();
        this.f49555k = null;
        if (getActivity() != null && !getActivity().isFinishing()) {
            this.f49564t = this.f49565u.mo28313e();
        }
    }

    public final void onResume() {
        super.onResume();
        vdm vdm = new vdm(vpu.m41033a(getActivity()), getActivity());
        Bundle bundle = this.f49564t;
        if (bundle == null) {
            Bundle arguments = getArguments();
            String string = arguments.getString("callerPackageName");
            vda a = vdm.mo28332a(new CallingAppInfo(this.f49549e, string, 0), arguments.getString("accountName"));
            this.f49565u = a;
            a.mo28310a();
            vdk d = ((vdv) this.f49565u).mo28316d();
            d.mo28309j();
            d.mo28300c(3, 31);
            d.mo28274a();
            vdk d2 = ((vdv) this.f49565u).mo28316d();
            d2.mo28308i();
            d2.mo28300c(3, 55);
            this.f49555k = d2;
            return;
        }
        this.f49565u = vdm.mo28331a(bundle);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("pathStack", this.f49552h);
        bundle.putParcelable("selection", this.f49553i);
        bundle.putParcelable("preferences", this.f49561q);
        bundle.putBundle("logSessionState", this.f49564t);
    }

    public final void onStop() {
        super.onStop();
        mo28653d();
        mo28652b();
    }

    /* renamed from: a */
    private final void m40872a(boolean z) {
        int i;
        int i2;
        if (!z) {
            i = C0126R.dimen.drive_ActionBar_SecondaryTextSize;
        } else {
            i = C0126R.dimen.drive_ActionBar_PrimaryTextSize;
        }
        this.f49556l.mo15853b(!z);
        View a = this.f49556l.mo15837a();
        int i3 = 0;
        if (!z) {
            i2 = getResources().getDimensionPixelOffset(C0126R.dimen.drive_Space_2);
        } else {
            i2 = 0;
        }
        a.setPaddingRelative(i2, 0, 0, 0);
        this.f49566v.setTextSize(0, (float) getResources().getDimensionPixelSize(i));
        if (z) {
            this.f49566v.requestFocus();
        }
        TextView textView = this.f49567w;
        if (z) {
            i3 = 8;
        }
        textView.setVisibility(i3);
    }

    /* renamed from: a */
    public final void mo28649a() {
        if (this.f49552h.mo18351b() != PathStack.f31210b && this.f49554j.f49494g && this.f49562r.mo84q() == this.f49554j.mo161a() - 1) {
            vme vme = this.f49554j;
            if (vme.f49501n.mo28636a()) {
                vme.f49489a.mo25371b("A sync more is already in progress; not requesting another one");
            } else if (vgo.m40400a(vme.f49493f)) {
                vme.f49489a.mo25371b("Query is full text search, aborting sync more");
            } else {
                vme.f49489a.mo25371b("Requesting sync more");
                vmk vmk = vme.f49501n;
                Query query = vme.f49493f;
                rkb rkb = vme.f49496i;
                usn usn = (usn) rkb.mo24786a(twn.f46760f);
                sdo.m34975b(!vgo.m40400a(query), "Cannot sync more with full text search");
                vmk.mo28635a(rkb.mo24795b(new usi(rkb, query)), new vmd(vme));
            }
        }
    }

    /* renamed from: a */
    public final void mo28650a(int i) {
        vda vda = this.f49565u;
        if (vda != null) {
            vdv vdv = (vdv) vda;
            if (!vdv.f49095c) {
                vdk d = vdv.mo28316d();
                d.mo28300c(3, 29);
                d.mo28304e(i);
                d.mo28309j();
                if (i == 0) {
                    d.mo28285a(this.f49553i.f31201d);
                }
                d.mo28274a();
                this.f49565u.mo28311b();
                this.f49565u = null;
                return;
            }
        }
        f49539a.mo25372b("SelectFileFragment", "Log session has ended or is paused in finalizeLogging()");
    }

    /* renamed from: a */
    public final void mo18325a(int i, DriveId driveId) {
        if (i == 0 && driveId != null) {
            driveId.mo18113b().mo27953a(this.f49551g).mo9458a(this.f49560p);
        }
    }

    /* renamed from: a */
    public final void mo28651a(DriveId driveId) {
        Activity activity = getActivity();
        Intent intent = new Intent("android.intent.action.PICK");
        intent.putExtra("response_drive_id", driveId);
        activity.setResult(-1, intent);
        mo28650a(0);
        activity.finish();
    }

    /* renamed from: a */
    public final void mo28628a(PathElement pathElement) {
        if (pathElement == PathStack.f31210b) {
            m40872a(true);
            this.f49554j.mo28632e();
            m40873e();
            this.f49558n.setAdapter(this.f49563s);
        } else {
            this.f49558n.setEnabled(false);
            this.f49556l.mo15877p();
            m40872a(false);
            if (pathElement instanceof SearchPathElement) {
                m40870a(((SearchPathElement) pathElement).f31215a);
            } else {
                m40873e();
                String a = pathElement.mo18341a(getActivity());
                boolean z = pathElement instanceof ViewPathElement;
                this.f49567w.setText(a);
                if (!z) {
                    String valueOf = String.valueOf(a);
                    String string = getString(C0126R.string.drive_folder);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(string).length());
                    sb.append(valueOf);
                    sb.append(" ");
                    sb.append(string);
                    a = sb.toString();
                }
                this.f49567w.setContentDescription(getString(C0126R.string.drive_doclist_title_description, a));
                this.f49567w.clearFocus();
                this.f49567w.requestFocus();
            }
            this.f49557m.postDelayed(this.f49546b, 300);
        }
        Selection selection = this.f49553i;
        selection.f31200c = null;
        selection.f31201d = null;
        selection.mo18331a();
        m40874f();
        m40875g();
        mo28653d();
    }

    /* renamed from: a */
    public final void mo18326a(voc voc, voa voa) {
        this.f49561q.mo18328a(voc, voa);
        this.f49554j.mo18326a(voc, voa);
    }
}
