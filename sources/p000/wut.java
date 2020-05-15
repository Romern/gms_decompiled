package p000;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.feedback.PreviewChimeraActivity;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: wut */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wut extends abh {

    /* renamed from: a */
    public final PreviewChimeraActivity f51390a;

    /* renamed from: d */
    boolean f51391d = false;

    /* renamed from: e */
    private final List f51392e = sqw.m36031a();

    public wut(PreviewChimeraActivity previewChimeraActivity) {
        abeq abeq;
        abep abep;
        this.f51390a = previewChimeraActivity;
        HelpConfig helpConfig = previewChimeraActivity.f31617a;
        if (helpConfig != null) {
            aash a = aash.m46863a();
            a.f56436a = this.f51390a;
            a.f56437b = helpConfig;
            abeo b = a.mo31708b();
            abet abet = null;
            if ((b.f57264a & 2) != 0) {
                abeq = b.f57266c;
                if (abeq == null) {
                    abeq = abeq.f57276g;
                }
            } else {
                abeq = null;
            }
            if (abeq != null) {
                m42315a((int) C0126R.string.gf_error_report_sdk_version, abeq.f57281d);
                String str = abeq.f57280c;
                String str2 = abeq.f57283f;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
                sb.append(str);
                sb.append(", ");
                sb.append(str2);
                m42315a((int) C0126R.string.gf_error_report_model, sb.toString());
                m42315a((int) C0126R.string.gf_network_name, abeq.f57282e);
                m42315a((int) C0126R.string.gf_locale, abeq.f57279b);
            }
            if ((b.f57264a & 1) != 0) {
                abep = b.f57265b;
                if (abep == null) {
                    abep = abep.f57271d;
                }
            } else {
                abep = null;
            }
            if (abep != null) {
                m42315a((int) C0126R.string.gf_error_report_package_name, abep.f57274b);
                m42315a((int) C0126R.string.gf_error_report_package_version, abep.f57275c);
            }
            if ((b.f57264a & 4) != 0 && (abet = b.f57267d) == null) {
                abet = abet.f57292q;
            }
            if (abet != null) {
                String str3 = abet.f57304k;
                int i = abet.f57303j;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 14);
                sb2.append(str3);
                sb2.append(" / ");
                sb2.append(i);
                m42315a((int) C0126R.string.common_app_name, sb2.toString());
                m42315a((int) C0126R.string.gf_error_report_description, abet.f57296c);
            }
            if (helpConfig.f78805E && !helpConfig.f78807G) {
                this.f51391d = true;
                mo29432c();
            } else {
                abet abet2 = b.f57267d;
                mo29431a((abet2 == null ? abet.f57292q : abet2).f57298e);
            }
            mo171aJ();
            return;
        }
        throw new IllegalStateException("HelpConfig required but not available.");
    }

    /* renamed from: a */
    private final void m42315a(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f51392e.add(Pair.create(m42316f(i), str));
        }
    }

    /* renamed from: f */
    private final String m42316f(int i) {
        return this.f51390a.getString(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo29432c() {
        new adzt(Looper.getMainLooper()).postDelayed(new wur(this), cdtr.m134943e());
    }

    /* renamed from: a */
    public final int mo161a() {
        int size = this.f51392e.size();
        return this.f51391d ? size + 1 : size;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        return new wus(LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.gf_account_and_system_info_viewer_item, viewGroup, false));
    }

    /* renamed from: a */
    public final String mo29430a(String str) {
        return TextUtils.isEmpty(str) ? m42316f(C0126R.string.common_unknown) : str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        wus wus = (wus) acm;
        if (i >= mo161a()) {
            StringBuilder sb = new StringBuilder(85);
            sb.append("Trying to bind ViewHolder for position ");
            sb.append(i);
            sb.append(", but the position is out of bound.");
            Log.w("gF_Acct&SysInfoAdapter", sb.toString());
            return;
        }
        int a = mo161a();
        if (i == a - 1 && this.f51391d) {
            wus.f51388s.setVisibility(8);
            wus.f51389t.setText(m42316f(C0126R.string.common_loading));
            wus.f51389t.setGravity(17);
        } else if (i < a) {
            wus.f51388s.setVisibility(0);
            Pair pair = (Pair) this.f51392e.get(i);
            wus.f51388s.setText(stm.m36299a((String) pair.first));
            wus.f51389t.setText(stm.m36299a((String) pair.second));
            wus.f51389t.setGravity(0);
        } else {
            StringBuilder sb2 = new StringBuilder(78);
            sb2.append("addViewGroup requested, but position >= item count: ");
            sb2.append(i);
            sb2.append(" >= ");
            sb2.append(a);
            Log.e("gF_Acct&SysInfoAdapter", sb2.toString());
        }
    }

    /* renamed from: a */
    public final void mo29431a(List list) {
        if (list != null && !list.isEmpty()) {
            if (aaya.m47229b(ceib.m136900e())) {
                ArrayList arrayList = new ArrayList(list);
                Collections.sort(arrayList, new wuq(this));
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    abes abes = (abes) arrayList.get(i);
                    this.f51392e.add(Pair.create(mo29430a(abes.f57290b), abes.f57291c));
                }
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                abes abes2 = (abes) it.next();
                this.f51392e.add(Pair.create(mo29430a(abes2.f57290b), abes2.f57291c));
            }
        }
    }
}
