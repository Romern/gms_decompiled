package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: assj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class assj implements asqs {

    /* renamed from: d */
    private static final Set f89564d;

    /* renamed from: a */
    public final String f89565a;

    /* renamed from: b */
    public final String f89566b;

    /* renamed from: c */
    public assf f89567c;

    /* renamed from: e */
    private final assh f89568e;

    /* renamed from: f */
    private final asrx f89569f;

    /* renamed from: g */
    private final byte[] f89570g;

    /* renamed from: h */
    private final asqq f89571h;

    /* renamed from: i */
    private final String f89572i;

    /* renamed from: j */
    private final JSONObject f89573j;

    /* renamed from: k */
    private final asqu f89574k = new asqu();

    /* renamed from: l */
    private asry f89575l;

    static {
        HashSet hashSet = new HashSet();
        f89564d = hashSet;
        hashSet.add(new assa(40725, 2));
        f89564d.add(new assa(40782, 32));
        f89564d.add(new assa(40706, 6));
    }

    public assj(assh assh, asrx asrx, String str, byte[] bArr, String str2, asqq asqq, String str3) {
        this.f89568e = assh;
        this.f89569f = asrx;
        this.f89565a = str;
        this.f89573j = new JSONObject(str);
        this.f89570g = bArr;
        this.f89566b = str2;
        this.f89571h = asqq;
        this.f89567c = new asru(3);
        this.f89572i = str3;
        this.f89574k.f89416l = bozu.OPEN_APPLET;
    }

    /* renamed from: a */
    public final astf mo49385a(byte[] bArr) {
        if (this.f89575l == null) {
            try {
                this.f89575l = this.f89568e.mo3415a(this.f89569f, this.f89573j, this.f89570g, new assi(this.f89571h), f89564d);
                this.f89567c = new asru(6);
            } catch (assg e) {
                throw new RuntimeException("Velocity failures should be handled by CanonicalBundleAdapter.", e);
            }
        }
        return astf.m74755a(this.f89575l.mo3393a(bArr));
    }

    /* renamed from: b */
    public final asqu mo49387b() {
        return this.f89574k;
    }

    /* renamed from: c */
    public final void mo49388c() {
        asry asry = this.f89575l;
        if (asry != null) {
            this.f89567c = asry.mo3391a();
        }
        this.f89574k.f89414j = stm.m36299a(this.f89567c.mo3404c());
    }

    /* renamed from: d */
    public final List mo49389d() {
        return asso.m74698a(this.f89569f.mo3395a());
    }

    /* renamed from: e */
    public final int mo49390e() {
        int a = this.f89567c.mo3399a();
        if (a == 1) {
            return -1;
        }
        if (a == 3) {
            return 11;
        }
        if (a == 4) {
            return 29;
        }
        if (a == 5) {
            return 19;
        }
        if (a != 6) {
            return a != 7 ? 0 : 26;
        }
        return 11;
    }

    /* renamed from: f */
    public final asqq mo49391f() {
        return this.f89571h;
    }

    /* renamed from: g */
    public final String mo49392g() {
        return this.f89572i;
    }

    /* renamed from: h */
    public final int mo49393h() {
        return 0;
    }

    /* renamed from: a */
    public final astc[] mo49386a() {
        try {
            ArrayList arrayList = new ArrayList(2);
            for (assu assu : assu.m74713a(this.f89569f.mo3395a()).mo49448c().mo49438a(165, 48908).mo49448c().mo49440b()) {
                if (assu.f89619b == 97) {
                    arrayList.add(astc.m74747a(assu.mo49448c().mo49438a(79).mo49442h()));
                }
            }
            return (astc[]) arrayList.toArray(new astc[0]);
        } catch (assv e) {
            bqye.m113758a(e);
            return new astc[0];
        }
    }
}
