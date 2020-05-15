package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SignInPassword;
import java.util.List;

/* renamed from: hkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hkw implements hep {

    /* renamed from: a */
    public final SignInPassword f19963a;

    /* renamed from: b */
    public final String f19964b;

    /* renamed from: c */
    public final hmc f19965c;

    /* renamed from: d */
    private final List f19966d;

    public hkw(Context context, List list, SavePasswordRequest savePasswordRequest, String str) {
        this.f19966d = list;
        this.f19963a = savePasswordRequest.f10245a;
        this.f19964b = str;
        this.f19965c = hmc.m14599a(context);
    }

    /* renamed from: a */
    public final adbj mo12290a() {
        return adbj.AUTH_API_CREDENTIALS_INTERNAL_SAVE_PASSWORD;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bngx, hku]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public final bqgg mo12291a(hez hez) {
        bngs j = bngx.m109377j();
        for (Account account : this.f19966d) {
            j.mo67668c(heb.m14255a(account));
        }
        return bqga.m112785c(bngx.m109355a(bnjd.m109575a((Iterable) j.mo67664a(), (bmxj) new hku(this)))).mo69216a(hkv.f19962a, bqfb.INSTANCE);
    }
}
