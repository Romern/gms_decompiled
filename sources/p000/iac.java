package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: iac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iac {

    /* renamed from: a */
    private static final srn f20622a = srn.m36124a();

    /* renamed from: b */
    private final Context f20623b;

    public iac(Context context) {
        bmxy.m108581a(context);
        this.f20623b = context;
    }

    /* renamed from: f */
    private final void m15112f() {
        ((bnsl) f20622a.mo68390d()).mo68405a("cleanPermission");
        mo12854a((String) null);
        mo12856b(null);
        mo12855a(false);
    }

    /* renamed from: g */
    private final SharedPreferences m15113g() {
        return this.f20623b.getSharedPreferences("sms_retriever_shared_pref", 4);
    }

    /* renamed from: a */
    public final int mo12853a() {
        boolean b = mo12857b();
        if (mo12860e() != null) {
            return b ? 1 : 2;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12856b(String str) {
        m15113g().edit().putString("autofill_certificate_hash", str).commit();
    }

    /* renamed from: c */
    public final void mo12858c() {
        String d = ibb.m15158d(this.f20623b);
        String c = ibb.m15157c(this.f20623b);
        if (TextUtils.isEmpty(d) || TextUtils.isEmpty(c)) {
            ((bnsl) f20622a.mo68390d()).mo68405a("Current autofill package name or hash is invalid. Clean permission istead of granting.");
            m15112f();
            return;
        }
        ((bnsl) f20622a.mo68390d()).mo68405a("grantPermission");
        mo12854a(d);
        mo12856b(c);
        mo12855a(true);
    }

    /* renamed from: d */
    public final void mo12859d() {
        String d = ibb.m15158d(this.f20623b);
        String c = ibb.m15157c(this.f20623b);
        if (TextUtils.isEmpty(d) || TextUtils.isEmpty(c)) {
            ((bnsl) f20622a.mo68390d()).mo68405a("Current autofill package name or hash is invalid. Clean permission istead of denying.");
            m15112f();
            return;
        }
        ((bnsl) f20622a.mo68390d()).mo68405a("denyPermission");
        mo12854a(d);
        mo12856b(c);
        mo12855a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final String mo12860e() {
        return m15113g().getString("autofill_certificate_hash", null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12854a(String str) {
        m15113g().edit().putString("autofill_package_name", str).commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12855a(boolean z) {
        m15113g().edit().putBoolean("autofill_permission_state", z).commit();
    }

    /* renamed from: b */
    public final boolean mo12857b() {
        String string = m15113g().getString("autofill_package_name", null);
        String d = ibb.m15158d(this.f20623b);
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(d) && bmwb.m108443a(string, d)) {
            String e = mo12860e();
            String c = ibb.m15157c(this.f20623b);
            if (!TextUtils.isEmpty(e) && !TextUtils.isEmpty(c) && bmwb.m108443a(e, c)) {
                return m15113g().getBoolean("autofill_permission_state", false);
            }
        }
        ((bnsl) f20622a.mo68390d()).mo68405a("The stored preference is not current autofill service. Clean permission.");
        m15112f();
        return false;
    }
}
