package p000;

import android.accounts.Account;

/* renamed from: gqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class gqk extends gnz {

    /* renamed from: a */
    public final String f18824a;

    public gqk(String str) {
        this.f18824a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo12085a(adyd adyd, Account account) {
        String str = this.f18824a;
        bljb a = blkh.m107281a("AccountManager.getUserData");
        try {
            String userData = adyd.f62893a.getUserData(account, str);
            if (a != null) {
                a.close();
            }
            return userData == null ? mo12127b() : mo12086a(userData);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final String mo12087a() {
        return this.f18824a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo12127b() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo12089a(adyd adyd, Account account, Object obj) {
        String str;
        if (obj != null) {
            str = mo12088a(obj);
        } else {
            str = null;
        }
        String str2 = this.f18824a;
        bljb a = blkh.m107281a("AccountManager.setUserData");
        try {
            adyd.f62893a.setUserData(account, str2, str);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
