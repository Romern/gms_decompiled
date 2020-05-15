package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ysw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ysw extends ysa {

    /* renamed from: c */
    public static final srn f54562c = zvt.m46581a();

    /* renamed from: d */
    private static final ysq f54563d = new ysq();

    /* renamed from: e */
    private final yzo f54564e;

    public ysw(Context context, yzo yzo) {
        super(context);
        this.f54564e = yzo;
    }

    /* renamed from: a */
    public final void mo30739a(String str) {
        ysp.m44725a(this.f54525b, new ysn(str));
    }

    /* renamed from: b */
    public final String mo30740b(String str, String str2) {
        return (String) ysp.m44725a(this.f54525b, new ysm(str, str2));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sbv.a(java.lang.String, com.google.android.gms.common.api.Scope[], boolean):android.content.Intent
     arg types: [java.lang.String, com.google.android.gms.common.api.Scope[], int]
     candidates:
      sbv.a(android.content.Context, java.lang.String, java.lang.String):void
      sbv.a(android.content.Context, java.lang.String, int[]):void
      sbv.a(java.lang.String, com.google.android.gms.common.api.Scope[], boolean):android.content.Intent */
    /* renamed from: c */
    public final PendingIntent mo30742c(String str, String str2, Set set) {
        Context context = this.f54525b;
        if ("<<default account>>".equals(str)) {
            return PendingIntent.getActivity(context, 0, sbv.m34873a(str2, (Scope[]) set.toArray(new Scope[0]), true), 134217728);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo30743c() {
    }

    /* renamed from: d */
    public final void mo30744d() {
        mo30746f();
    }

    /* renamed from: e */
    public final void mo30745e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo30746f() {
        axov a = axov.m82850a("/fitness/WearableAccountManager/all_accounts");
        axos axos = a.f96224a;
        Set<String> b = mo30715b();
        axos axos2 = new axos();
        for (String str : b) {
            SharedPreferences a2 = mo30711a();
            HashSet<String> hashSet = new HashSet();
            for (String str2 : a2.getAll().keySet()) {
                String[] split = str2.split(" ");
                if (split.length == 2 && str.equals(split[0])) {
                    hashSet.add(split[1]);
                }
            }
            if (!hashSet.isEmpty()) {
                axos axos3 = new axos();
                for (String str3 : hashSet) {
                    SharedPreferences a3 = mo30711a();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str3).length());
                    sb.append(str);
                    sb.append(" ");
                    sb.append(str3);
                    axos3.mo53339c(str3, new ArrayList(ysa.m44681a(a3, sb.toString())));
                }
                axos2.mo53327a(str, axos3);
            }
        }
        axos.mo53322a(axos2);
        bqga.m112781a(yun.m44873b(this.f54564e.mo30868a().mo24691a(a.mo53349a())), new ysv(), bqfb.INSTANCE);
    }

    /* renamed from: b */
    public final ysl mo30741b(String str) {
        return new ysx(this.f54525b, new yss(this.f54525b, str));
    }

    /* renamed from: a */
    public final void mo30712a(String str, String str2, Set set) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        super.mo30714a(sb.toString(), (String[]) null, stc.m36283a(set));
        mo30746f();
    }

    /* renamed from: b */
    public final void mo30716b(String str, String str2, Set set) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        if (super.mo30714a(sb.toString(), stc.m36283a(set), (String[]) null)) {
            mo30746f();
        }
    }

    /* renamed from: a */
    public final boolean mo30713a(String str, String str2) {
        bnsl bnsl = (bnsl) ysa.f54524a.mo68390d();
        bnsl.mo68432a("ysa", "a", 97, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68424a("Removing account %s for package %s", str, str2);
        SharedPreferences a = mo30711a();
        SharedPreferences.Editor edit = a.edit();
        boolean z = false;
        for (String str3 : a.getAll().keySet()) {
            String[] split = str3.split(" ");
            if (split.length == 2 && str.equals(split[0])) {
                if (str2 == null || str2.equals(split[1])) {
                    edit.remove(str3);
                    z = true;
                }
            }
        }
        if (z) {
            edit.apply();
        }
        if (z) {
            mo30746f();
        }
        return z;
    }
}
