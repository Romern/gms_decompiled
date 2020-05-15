package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: fki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class fki {

    /* renamed from: d */
    public final fkm f16779d;

    protected fki(fkm fkm) {
        sdo.m34959a(fkm);
        this.f16779d = fkm;
    }

    /* renamed from: a */
    private static String m11848a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return obj != Boolean.TRUE ? "false" : "true";
        }
        if (obj instanceof Throwable) {
            return ((Throwable) obj).toString();
        }
        return obj.toString();
    }

    /* renamed from: b */
    protected static String m11849b(String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String a = m11848a(obj);
        String a2 = m11848a(obj2);
        String a3 = m11848a(obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str3);
            sb.append(a3);
        }
        return sb.toString();
    }

    /* renamed from: r */
    public static final boolean m11850r() {
        String str = (String) fni.f16924b.mo11021a();
        return false;
    }

    /* renamed from: c */
    public final void mo10931c(String str, Object obj) {
        mo10925a(4, str, obj, null, null);
    }

    /* renamed from: d */
    public final void mo10933d(String str) {
        mo10925a(2, str, null, null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final sqv mo10936e() {
        return this.f16779d.f16787c;
    }

    /* renamed from: f */
    public final Context mo10939f() {
        return this.f16779d.f16785a;
    }

    /* renamed from: g */
    public final fnt mo10941g() {
        return this.f16779d.mo10957a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final flh mo10943h() {
        return this.f16779d.f16788d;
    }

    /* renamed from: i */
    public final fje mo10944i() {
        return this.f16779d.mo10958b();
    }

    /* renamed from: j */
    public final fip mo10945j() {
        return this.f16779d.mo10960d();
    }

    /* renamed from: k */
    public final fkh mo10946k() {
        return this.f16779d.mo10959c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final flm mo10947l() {
        fkm fkm = this.f16779d;
        fkm.m11884a(fkm.f16790f);
        return fkm.f16790f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final foh mo10948m() {
        return this.f16779d.mo10961e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final fny mo10949n() {
        fkm fkm = this.f16779d;
        fkm.m11884a(fkm.f16791g);
        return fkm.f16791g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final fle mo10950o() {
        return this.f16779d.mo10963g();
    }

    /* renamed from: p */
    public final fkw mo10951p() {
        return this.f16779d.mo10964h();
    }

    /* renamed from: q */
    public final fll mo10952q() {
        return this.f16779d.f16792h;
    }

    /* renamed from: c */
    public final void mo10932c(String str, Object obj, Object obj2) {
        mo10925a(5, str, obj, obj2, null);
    }

    /* renamed from: d */
    public final void mo10934d(String str, Object obj) {
        mo10925a(5, str, obj, null, null);
    }

    /* renamed from: e */
    public final void mo10937e(String str) {
        mo10925a(3, str, null, null, null);
    }

    /* renamed from: f */
    public final void mo10940f(String str) {
        mo10925a(5, str, null, null, null);
    }

    /* renamed from: g */
    public final void mo10942g(String str) {
        mo10925a(6, str, null, null, null);
    }

    /* renamed from: d */
    public final void mo10935d(String str, Object obj, Object obj2) {
        mo10925a(6, str, obj, obj2, null);
    }

    /* renamed from: e */
    public final void mo10938e(String str, Object obj) {
        mo10925a(6, str, obj, null, null);
    }

    /* renamed from: a */
    public final void mo10925a(int i, String str, Object obj, Object obj2, Object obj3) {
        fnt fnt;
        fkm fkm = this.f16779d;
        if (fkm != null) {
            fnt = fkm.f16789e;
        } else {
            fnt = null;
        }
        if (fnt == null) {
            String str2 = (String) fni.f16924b.mo11021a();
            if (Log.isLoggable(str2, i)) {
                Log.println(i, str2, m11849b(str, obj, obj2, obj3));
                return;
            }
            return;
        }
        fnt.mo11029b(i, str, obj, obj2, obj3);
    }

    /* renamed from: a */
    public final void mo10926a(String str, Object obj) {
        mo10925a(2, str, obj, null, null);
    }

    /* renamed from: b */
    public final void mo10929b(String str, Object obj) {
        mo10925a(3, str, obj, null, null);
    }

    /* renamed from: a */
    public final void mo10927a(String str, Object obj, Object obj2) {
        mo10925a(2, str, obj, obj2, null);
    }

    /* renamed from: b */
    public final void mo10930b(String str, Object obj, Object obj2) {
        mo10925a(3, str, obj, obj2, null);
    }

    /* renamed from: a */
    public final void mo10928a(String str, Object obj, Object obj2, Object obj3) {
        mo10925a(5, str, obj, obj2, obj3);
    }
}
