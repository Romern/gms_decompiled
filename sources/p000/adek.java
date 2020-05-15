package p000;

import android.accounts.Account;
import java.util.Collection;
import java.util.List;

/* renamed from: adek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adek implements adeo {

    /* renamed from: a */
    private static final adfs f61491a = new adfs("CompositeRouter");

    /* renamed from: b */
    private final adem f61492b;

    /* renamed from: c */
    private final adeo f61493c;

    /* renamed from: d */
    private final adeo f61494d;

    /* renamed from: e */
    private final adeo f61495e;

    public adek(adem adem, adeo adeo, adeo adeo2, adeo adeo3) {
        this.f61492b = adem;
        this.f61493c = adeo;
        this.f61494d = adeo2;
        this.f61495e = adeo3;
    }

    /* renamed from: a */
    private final adeo m50258a() {
        if (cepl.f183185a.mo6606a().mo79551v()) {
            f61491a.mo33423a("Using fake backend", new Object[0]);
            return this.f61495e;
        } else if (!this.f61492b.mo33394a()) {
            return this.f61493c;
        } else {
            f61491a.mo33423a("Using development backend", new Object[0]);
            return this.f61494d;
        }
    }

    /* renamed from: a */
    public final bqgg mo33390a(Account account, Collection collection) {
        return m50258a().mo33390a(account, collection);
    }

    /* renamed from: a */
    public final bqgg mo33391a(camj camj, Account account) {
        return m50258a().mo33391a(camj, account);
    }

    /* renamed from: a */
    public final bqgg mo33392a(String str, int i, int i2, List list) {
        return m50258a().mo33392a(str, i, i2, list);
    }

    /* renamed from: a */
    public final bqgg mo33393a(byte[] bArr, Account account, camh camh, Collection collection) {
        return m50258a().mo33393a(bArr, account, camh, collection);
    }
}
