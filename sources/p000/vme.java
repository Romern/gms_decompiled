package p000;

import android.content.Context;
import android.graphics.Color;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.drive.p039ui.select.SelectFilePreferences;
import com.google.android.gms.drive.p039ui.select.Selection;
import com.google.android.gms.drive.p039ui.select.path.PathElement;
import com.google.android.gms.drive.p039ui.select.path.PathStack;
import com.google.android.gms.drive.query.Filter;
import com.google.android.gms.drive.query.Query;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

/* renamed from: vme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vme extends abh implements vnn, vne, vnc {

    /* renamed from: a */
    public static final sbw f49489a = new sbw("FileListAdapter", "");

    /* renamed from: d */
    public static final SectionIndexer f49490d = new vlz();

    /* renamed from: q */
    private static final bnic f49491q = bnic.m109494a(uzm.f48742a, uzm.f48748g, uzm.f48737M, uzm.f48758q, uzm.f48738N, uzm.f48740P, uzm.f48741Q, uzp.f48770b, uzp.f48771c, uzp.f48772d, uzp.f48773e);

    /* renamed from: e */
    public vnz f49492e;

    /* renamed from: f */
    public Query f49493f;

    /* renamed from: g */
    public boolean f49494g;

    /* renamed from: h */
    public boolean f49495h = true;

    /* renamed from: i */
    public rkb f49496i;

    /* renamed from: j */
    public vmc f49497j;

    /* renamed from: k */
    public final PathStack f49498k;

    /* renamed from: l */
    public final Selection f49499l;

    /* renamed from: m */
    public final Context f49500m;

    /* renamed from: n */
    public final vmk f49501n;

    /* renamed from: o */
    public vmp f49502o;

    /* renamed from: p */
    public vmt f49503p;

    /* renamed from: r */
    private Filter f49504r;

    /* renamed from: s */
    private voa f49505s;

    /* renamed from: t */
    private voe f49506t;

    /* renamed from: u */
    private final SelectFilePreferences f49507u;

    /* renamed from: v */
    private final vmk f49508v;

    /* renamed from: w */
    private final vmk f49509w;

    /* renamed from: x */
    private final Set f49510x;

    /* renamed from: y */
    private final boolean f49511y;

    public vme(PathStack pathStack, Selection selection, SelectFilePreferences selectFilePreferences, Context context) {
        sdo.m34959a(pathStack);
        this.f49498k = pathStack;
        sdo.m34959a(selection);
        this.f49499l = selection;
        sdo.m34959a(selectFilePreferences);
        this.f49507u = selectFilePreferences;
        sdo.m34959a(context);
        this.f49500m = context;
        this.f49508v = new vmk();
        this.f49501n = new vmk();
        this.f49509w = new vmk();
        this.f49497j = null;
        Set set = (Set) selection.f31199b.mo18284a(new vga());
        this.f49510x = rsr.m34360a(f49491q, set);
        this.f49511y = set.contains(uzm.f48767z);
    }

    /* renamed from: g */
    private final void m40842g() {
        if (this.f49497j != null && this.f49496i.mo24805i()) {
            Scope scope = twn.f46755a;
            rkb rkb = this.f49496i;
            vmc vmc = this.f49497j;
            if (vmc != null) {
                rkb.mo24795b(new usk(rkb, usf.m39302a((usn) rkb.mo24786a(twn.f46760f), vmc)));
            } else {
                throw new IllegalArgumentException("Query result listener must be specified to stop a live query.");
            }
        }
        this.f49497j = null;
    }

    /* renamed from: c */
    public final void mo28630c() {
        mo180h(0, mo161a());
    }

    /* renamed from: d */
    public final void mo28631d() {
        if (this.f49509w.mo28636a()) {
            f49489a.mo25371b("A sync is already in progress; not requesting another one");
            return;
        }
        f49489a.mo25371b("Requesting sync");
        vmk vmk = this.f49509w;
        Scope scope = twn.f46755a;
        rkb rkb = this.f49496i;
        vmk.mo28635a(rkb.mo24795b(new urw(rkb)), new vmb(this));
    }

    /* renamed from: e */
    public final void mo28632e() {
        mo28633f();
        this.f49508v.mo28637b();
        this.f49501n.mo28637b();
        this.f49509w.mo28637b();
        m40842g();
    }

    /* renamed from: f */
    public final void mo28633f() {
        vnz vnz = this.f49492e;
        if (vnz != null) {
            vnz.mo12460c();
            this.f49492e = null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vfu.a(uwb, java.lang.Object):com.google.android.gms.drive.query.Filter
     arg types: [uwb, boolean]
     candidates:
      vfu.a(uwa, java.lang.Object):com.google.android.gms.drive.query.Filter
      vfu.a(uwb, java.lang.Object):com.google.android.gms.drive.query.Filter */
    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m40841a(boolean z, boolean z2) {
        this.f49506t = this.f49505s.mo28677a(this.f49500m);
        vfy vfy = new vfy();
        vfy.mo28408a(this.f49504r);
        vfy.mo28408a(vfu.m40352a(vgc.f49219c, (Object) false));
        Set<uvy> set = this.f49510x;
        vfy.f49210b = new ArrayList();
        for (uvy uvy : set) {
            vfy.f49210b.add(uvy.mo28084a());
        }
        vfy.f49209a = this.f49505s.mo28675c();
        vfy.f49211c = this.f49511y;
        this.f49493f = vfy.mo28407a();
        if (z) {
            this.f49501n.mo28637b();
            this.f49509w.mo28637b();
            m40842g();
        }
        if (cdqd.m134662b() && !this.f49496i.mo24805i()) {
            return;
        }
        if (!vgo.m40399a(this.f49504r)) {
            vmk vmk = this.f49508v;
            Scope scope = twn.f46755a;
            rkb rkb = this.f49496i;
            Query query = this.f49493f;
            if (query != null) {
                vmk.mo28635a(rkb.mo24787a((rle) new urv(rkb, query)), new vma(this, z, z2));
                return;
            }
            throw new IllegalArgumentException("Query must be provided.");
        }
        m40842g();
        this.f49497j = new vmc(this);
        Scope scope2 = twn.f46755a;
        rkb rkb2 = this.f49496i;
        Query query2 = this.f49493f;
        vmc vmc = this.f49497j;
        if (query2 == null) {
            throw new IllegalArgumentException("Query must be provided.");
        } else if (vmc != null) {
            rkb2.mo24795b(new usj(rkb2, query2, usf.m39302a((usn) rkb2.mo24786a(twn.f46760f), vmc))).mo9458a((rkl) new vly(this));
        } else {
            throw new IllegalArgumentException("Query result listener must be specified to start a live query.");
        }
    }

    /* renamed from: a */
    public final int mo161a() {
        vnz vnz = this.f49492e;
        if (vnz == null) {
            return 1;
        }
        int a = vnz.mo28682a();
        if (a == 0 && !this.f49494g) {
            return 1;
        }
        return a + (this.f49494g ? 1 : 0);
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        vnz vnz = this.f49492e;
        if (vnz == null) {
            return this.f49495h ? C0126R.C0128layout.drive_file_list_loading_spinner : C0126R.C0128layout.drive_file_list_failure_message;
        }
        int a = vnz.mo28682a();
        if (a == 0 && !this.f49494g) {
            return C0126R.C0128layout.drive_file_list_empty_message;
        }
        if (i != a) {
            return !this.f49492e.mo28683a(i).mo28681a() ? C0126R.C0128layout.drive_file_list_item : C0126R.C0128layout.drive_file_list_group_header;
        }
        return C0126R.C0128layout.drive_file_list_load_more_spinner;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        if (i == C0126R.C0128layout.drive_file_list_item) {
            return new vmh(inflate);
        }
        if (i == C0126R.C0128layout.drive_file_list_group_header) {
            return new vmf(inflate);
        }
        if (i == C0126R.C0128layout.drive_file_list_empty_message || i == C0126R.C0128layout.drive_file_list_failure_message || i == C0126R.C0128layout.drive_file_list_load_more_spinner || i == C0126R.C0128layout.drive_file_list_loading_spinner) {
            return new acm(inflate);
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Unrecognized viewType: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        boolean z;
        vmp vmp;
        PathElement pathElement;
        String str;
        float f;
        String str2;
        boolean z2;
        int i2;
        int i3;
        int i4;
        acm acm2 = acm;
        int i5 = i;
        if (acm2 instanceof vmf) {
            vny a = this.f49492e.mo28683a(i5);
            sdo.m34971a(a.mo28681a(), (Object) "Cannot use as group header");
            ((vmf) acm2).f49512s.setText(a.f49608a.f49606a);
        } else if (acm2 instanceof vmh) {
            vmh vmh = (vmh) acm2;
            vny a2 = this.f49492e.mo28683a(i5);
            sdo.m34971a(!a2.mo28681a(), (Object) "Cannot use as metadata");
            twz twz = a2.f49609b;
            Selection selection = this.f49499l;
            voe voe = this.f49506t;
            PathElement b = this.f49498k.mo18351b();
            vmp vmp2 = this.f49502o;
            if (!twz.mo26857c().equals("application/vnd.google-apps.folder")) {
                z = selection.mo18334a(twz);
            } else {
                z = true;
            }
            boolean equals = twz.mo26854a().equals(selection.f31200c);
            vmh.f201a.setEnabled(z);
            vmh.f201a.setSelected(equals);
            vmh.f49515s.setText(twz.mo26858d());
            TextView textView = vmh.f49516t;
            Date date = (Date) twz.mo26855a(voe.f49638c);
            if (date == null) {
                date = new Date(0);
            }
            Context context = voe.f49636a;
            int i6 = voe.f49639d;
            Object[] objArr = new Object[1];
            vpt vpt = voe.f49637b;
            TextView textView2 = textView;
            long time = date.getTime();
            vpt.f49739d.set(time);
            if (!Time.isEpoch(vpt.f49739d)) {
                pathElement = b;
                vmp = vmp2;
                if (time <= vpt.f49736a - vpt.f49735f) {
                    if (vpt.f49739d.year != vpt.f49737b.year) {
                        i4 = 68116;
                    } else if (vpt.f49739d.yearDay != vpt.f49737b.yearDay) {
                        i4 = 68120;
                    }
                    str = DateUtils.formatDateTime(vpt.f49738c, time, i4);
                }
                i4 = 68097;
                str = DateUtils.formatDateTime(vpt.f49738c, time, i4);
            } else {
                pathElement = b;
                vmp = vmp2;
                str = vpt.f49740e;
            }
            objArr[0] = str;
            textView2.setText(context.getString(i6, objArr));
            if (equals) {
                TextView textView3 = vmh.f49515s;
                String valueOf = String.valueOf(textView3.getText());
                String string = vmh.f201a.getContext().getString(C0126R.string.drive_file_list_selected_item);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(string).length());
                sb.append(valueOf);
                sb.append(",");
                sb.append(string);
                textView3.setContentDescription(sb.toString());
            }
            String c = twz.mo26857c();
            vll a3 = vlm.m40828a(c);
            vmh.f49517u.setImageResource(a3.mo28615a(twz.mo26860g()));
            ImageView imageView = vmh.f49517u;
            if (!z) {
                f = 0.6f;
            } else {
                f = 1.0f;
            }
            imageView.setAlpha(f);
            vmg vmg = null;
            if ("application/vnd.google-apps.folder".equals(c)) {
                if (((Boolean) twy.f46803N.mo58455c()).booleanValue()) {
                    if (((Boolean) twy.f46802M.mo58455c()).booleanValue()) {
                        if (twz.mo26856b() != null) {
                            String b2 = twz.mo26856b();
                            int parseColor = Color.parseColor(b2);
                            vmh.f49517u.setColorFilter(parseColor);
                            str2 = !b2.equals(twy.f46811V.mo58455c()) ? vmh.f201a.getContext().getString(C0126R.string.drive_document_type_folder_with_color, vmh.f201a.getContext().getString(vmi.f49521a.get(parseColor, C0126R.string.drive_folder_color_unknown))) : null;
                        }
                    }
                }
                vmh.f49517u.setColorFilter(Color.parseColor((String) twy.f46811V.mo58455c()));
                str2 = null;
            } else {
                vmh.f49517u.clearColorFilter();
                str2 = null;
            }
            ImageView imageView2 = vmh.f49517u;
            if (str2 == null) {
                str2 = vmh.f201a.getContext().getString(a3.f49441a);
            }
            imageView2.setContentDescription(str2);
            ImageView imageView3 = vmh.f49518v;
            Boolean bool = (Boolean) twz.mo26855a(uzm.f48737M);
            if (bool != null) {
                z2 = bool.booleanValue();
            } else {
                z2 = false;
            }
            if (!z2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            imageView3.setVisibility(i2);
            ImageView imageView4 = vmh.f49519w;
            if (!twz.mo26860g() || pathElement == vnr.f49587b) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            imageView4.setVisibility(i3);
            vmh.f49520x.setVisibility((!twz.mo26861h() || pathElement == vnr.f49588c) ? 8 : 0);
            int color = vmh.f201a.getContext().getResources().getColor(!z ? C0126R.color.drive_DisabledText : C0126R.color.drive_SecondaryText);
            vmh.f49518v.setColorFilter(color);
            vmh.f49519w.setColorFilter(color);
            vmh.f49520x.setColorFilter(color);
            View view = vmh.f201a;
            if (vmp != null) {
                vmg = new vmg(vmp, twz);
            }
            view.setOnClickListener(vmg);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vme.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      vme.a(android.view.ViewGroup, int):acm
      vme.a(acm, int):void
      vme.a(txb, boolean):void
      vme.a(voc, voa):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      vne.a(voc, voa):void
      vme.a(boolean, boolean):void */
    /* renamed from: a */
    public final void mo28628a(PathElement pathElement) {
        if (pathElement != PathStack.f31210b) {
            this.f49504r = pathElement.mo18342b();
            this.f49505s = this.f49507u.mo18327a(pathElement.mo18343c());
            m40841a(true, false);
        }
    }

    /* renamed from: a */
    public final void mo28629a(txb txb, boolean z) {
        mo28633f();
        this.f49492e = this.f49505s.mo28676a(txb, this.f49500m);
        mo171aJ();
        vmt vmt = this.f49503p;
        if (vmt != null) {
            vmt.mo28646a(z);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vme.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      vme.a(android.view.ViewGroup, int):acm
      vme.a(acm, int):void
      vme.a(txb, boolean):void
      vme.a(voc, voa):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      vne.a(voc, voa):void
      vme.a(boolean, boolean):void */
    /* renamed from: a */
    public final void mo18326a(voc voc, voa voa) {
        this.f49505s = voa;
        m40841a(false, false);
    }
}
