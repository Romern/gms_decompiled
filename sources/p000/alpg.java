package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: alpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alpg extends alov {

    /* renamed from: a */
    private final String f74008a;

    /* renamed from: b */
    private final String f74009b;

    public alpg(String str, int i, almp almp, String str2, String str3) {
        super(str, str2, i, almp, "LoadOwnerCoverPhoto");
        this.f74008a = str2;
        this.f74009b = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40608a() {
        String str = this.f74008a;
        String str2 = this.f74009b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18 + String.valueOf(str2).length());
        sb.append("[cover: account=");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append("]");
        sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final anci mo40624d(Context context) {
        String str;
        byte[] a;
        amdn a2 = amdn.m62665a(context);
        String str2 = this.f74008a;
        String str3 = this.f74009b;
        sdo.m34959a((Object) str2);
        a2.mo41125a();
        int a3 = alsh.m61646a(a2.f74750a);
        ames ames = new ames(a2.f74750a, str2, null);
        if (TextUtils.isEmpty(str3)) {
            str = ancc.m63973b(ames.mo41174c());
        } else {
            str = ancc.m63973b(ames.mo41175c(str3));
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!(a2.f74751b.mo41702a(str2, str3, amdn.m62666a(str), a3) || (a = almy.m61373a(a2.f74750a).mo40601a(ancc.m63970a(str, a3), true)) == null || a == alot.f73983c || a == alot.f73984d)) {
            a2.f74751b.mo41700a(str2, str3, amdn.m62666a(str), a, a3);
        }
        return a2.f74751b.mo41698a(str2, str3, amdn.m62666a(str));
    }
}
