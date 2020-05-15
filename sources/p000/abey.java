package p000;

import android.content.Context;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: abey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abey {

    /* renamed from: a */
    public final String f57322a;

    /* renamed from: b */
    public final Map f57323b;

    /* renamed from: c */
    public final int f57324c;

    public abey(String str, Map map, int i) {
        this.f57322a = str;
        this.f57323b = map;
        this.f57324c = i;
    }

    /* renamed from: a */
    public static abey m47588a(int i, Context context) {
        return m47589a(i, context.getString(C0126R.string.gh_network_not_connected));
    }

    /* renamed from: b */
    public static abey m47591b(int i, Context context) {
        return m47589a(i, context.getString(C0126R.string.gh_network_request_failed));
    }

    /* renamed from: c */
    public static abey m47592c(int i, Context context) {
        return m47589a(i, context.getString(C0126R.string.gh_no_results_found));
    }

    /* renamed from: d */
    public final boolean mo32060d() {
        return ((aasm) this.f57323b.get(this.f57322a)).f56502l && this.f57323b.size() == 2;
    }

    /* renamed from: e */
    public final boolean mo32061e() {
        return ((aasm) this.f57323b.get(this.f57322a)).mo31723g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List mo32058b() {
        return ((aasm) this.f57323b.get(this.f57322a)).f56511u;
    }

    /* renamed from: c */
    public final List mo32059c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f57323b.entrySet()) {
            if (((aasm) entry.getValue()).mo31720e() || ((aasm) entry.getValue()).mo31728k() || ((aasm) entry.getValue()).mo31734q()) {
                arrayList.add((String) entry.getKey());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static abey m47589a(int i, String str) {
        aasm a = aasm.m46880a("notification_root", "");
        aasm a2 = aasm.m46879a(str);
        a.mo31716a(a2);
        C1223np npVar = new C1223np();
        npVar.put(a.f56492b, a);
        npVar.put(a2.f56492b, a2);
        return new abey(a.f56492b, npVar, i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aasm.a(java.lang.String, boolean):aasm
     arg types: [java.lang.String, int]
     candidates:
      aasm.a(java.lang.String, java.lang.String):aasm
      aasm.a(org.json.JSONObject, aasm):aasm
      aasm.a(java.lang.String, com.google.android.gms.googlehelp.common.HelpConfig):java.lang.String
      aasm.a(java.lang.String, boolean):aasm */
    /* renamed from: a */
    public static abey m47590a(List list) {
        aasm a = aasm.m46890a("offline_suggestions", false);
        C1223np npVar = new C1223np();
        npVar.put(a.f56492b, a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aasm aasm = (aasm) it.next();
            a.mo31716a(aasm);
            npVar.put(aasm.f56492b, aasm);
        }
        return new abey(a.f56492b, npVar, 16);
    }

    /* renamed from: a */
    public final int mo32054a() {
        return mo32058b().size();
    }

    /* renamed from: a */
    public final aasm mo32055a(int i) {
        return (aasm) this.f57323b.get((String) mo32058b().get(i));
    }

    /* renamed from: a */
    public final List mo32056a(Context context, aasq aasq) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo32054a(); i++) {
            aasm a = mo32055a(i);
            if (a != null && aasq.mo31746a(a)) {
                arrayList.add(a);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(aasm.m46879a(context.getString(C0126R.string.gh_no_results_found)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo32057a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            aasm aasm = (aasm) this.f57323b.get(entry.getKey());
            if (aasm != null) {
                aasm aasm2 = (aasm) entry.getValue();
                if (TextUtils.equals(aasm.f56492b, aasm2.f56492b)) {
                    aasm.f56504n = aasm2.f56504n;
                    aasm.f56505o = aasm2.f56505o;
                    boolean z = true;
                    if (aasm.f56495e == 0) {
                        if (!aasm.f56511u.equals(aasm2.f56511u) || aasm.f56502l != aasm2.f56502l) {
                            z = false;
                        }
                    } else if (!TextUtils.equals(aasm.f56496f, aasm2.f56496f) || !TextUtils.equals(aasm.f56497g, aasm2.f56497g) || !TextUtils.equals(aasm.f56498h, aasm2.f56498h) || !TextUtils.equals(aasm.f56499i, aasm2.f56499i) || !sdg.m34949a(aasm.f56500j, aasm2.f56500j) || !sdg.m34949a(aasm.f56501k, aasm2.f56501k)) {
                        z = false;
                    }
                    aasm.f56510t = z;
                }
            }
        }
    }
}
