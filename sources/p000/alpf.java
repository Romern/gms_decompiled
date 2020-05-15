package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: alpf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alpf extends alov {

    /* renamed from: a */
    private final String f74004a;

    /* renamed from: b */
    private final String f74005b;

    /* renamed from: s */
    private final int f74006s;

    /* renamed from: t */
    private final boolean f74007t;

    public alpf(String str, int i, almp almp, String str2, String str3, int i2, int i3) {
        super(str, str2, i, almp, "LoadOwnerAvatar");
        this.f74004a = str2;
        this.f74005b = str3;
        this.f74006s = i2;
        this.f74007t = ((i3 & 1) ^ 1) == 0 ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40608a() {
        String str = this.f74004a;
        String str2 = this.f74005b;
        int i = this.f74006s;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length());
        sb.append("[owner: account=");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(", size=");
        sb.append(i);
        sb.append("]");
        sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final anci mo40624d(Context context) {
        String str;
        amdm a = amdm.m62661a(context);
        String str2 = this.f74004a;
        String str3 = this.f74005b;
        int i = this.f74006s;
        boolean z = this.f74007t;
        sdo.m34959a((Object) str2);
        allt.m61239a(i, "avatarSize");
        anci anci = null;
        ames ames = new ames(a.f74747a, str2, null);
        if (TextUtils.isEmpty(str3)) {
            str = ancc.m63973b(ames.f74836c.mo40751c("SELECT avatar FROM owners WHERE account_name=? AND page_gaia_id IS NULL", new String[]{ames.f74838e}));
        } else {
            sdo.m34970a(ames.f74839f == null);
            sdo.m34959a((Object) str3);
            str = ancc.m63973b(ames.f74836c.mo40751c("SELECT avatar FROM owners WHERE account_name=? AND page_gaia_id=?", new String[]{ames.f74838e, str3}));
        }
        if (!TextUtils.isEmpty(str)) {
            a.mo41124a(str2, str3, str, false);
            anci = a.f74748b.mo41667a(str2, str3, ancc.m63969a(str), i);
            if (anci == null && z) {
                return a.mo41123a(i, !TextUtils.isEmpty(str3));
            }
        } else if (z) {
            return a.mo41123a(i, !TextUtils.isEmpty(str3));
        }
        return anci;
    }
}
