package p000;

import android.accounts.Account;

/* renamed from: gzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gzc implements bdci, bdeq {

    /* renamed from: a */
    final /* synthetic */ gzd f19277a;

    public gzc(gzd gzd) {
        this.f19277a = gzd;
    }

    /* renamed from: a */
    public final CharSequence mo12342a() {
        return ((Account) this.f19277a.f19278a.f19384h.mo2448b()).name;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ CharSequence mo12345b(Object obj) {
        hay hay = (hay) obj;
        return mo12342a();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ CharSequence mo12346c(Object obj) {
        hay hay = (hay) obj;
        return mo12342a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo12343a(Object obj) {
        hay hay = (hay) obj;
        hay hay2 = this.f19277a.f19278a;
        String str = hay2.f19380d;
        int hashCode = ((Account) hay2.f19384h.mo2448b()).hashCode();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
        sb.append(str);
        sb.append(hashCode);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12344a(Object obj, int i, bdep bdep) {
        bdep.mo57931a(((hay) obj).f19386j);
    }
}
