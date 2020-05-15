package p000;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* renamed from: asuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asuy implements alih {

    /* renamed from: a */
    public final alim f89780a;

    /* renamed from: b */
    public final alif f89781b;

    /* renamed from: c */
    private final asvd f89782c;

    public asuy(alim alim, asvd asvd, alif alif) {
        this.f89780a = alim;
        this.f89782c = asvd;
        this.f89781b = alif;
    }

    /* renamed from: a */
    public final asvh mo49517a() {
        Activity containerActivity = this.f89780a.f73559a.getActivity().getContainerActivity();
        cazf.m127593a(containerActivity, "Cannot return null from a non-@Nullable @Provides method");
        rjx e = mo49521e();
        aswe aswe = this.f89782c.f89803a;
        cazf.m127593a(aswe, "Cannot return null from a non-@Nullable @Provides method");
        return new asvh(containerActivity, e, aswe);
    }

    /* renamed from: b */
    public final atlz mo49518b() {
        return new atlz(mo49521e());
    }

    /* renamed from: c */
    public final auak mo49519c() {
        return new auak(alio.m60905a(this.f89780a), alip.m60907a(this.f89780a));
    }

    /* renamed from: d */
    public final atam mo49520d() {
        Context b = alii.m60897b();
        String b2 = this.f89781b.mo40364b();
        cazf.m127593a(b2, "Cannot return null from a non-@Nullable component method");
        String a = this.f89781b.mo40363a();
        cazf.m127593a(a, "Cannot return null from a non-@Nullable component method");
        AccountInfo accountInfo = new AccountInfo(a, b2);
        cazf.m127593a(accountInfo, "Cannot return null from a non-@Nullable @Provides method");
        return new atam(b, accountInfo);
    }

    /* renamed from: e */
    public final rjx mo49521e() {
        return aton.m76233a(alin.m60903a(this.f89780a));
    }
}
