package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.signin.activity.SignInChimeraActivity;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aqoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqoo extends aaab {

    /* renamed from: a */
    private static final Logger f86417a = aqom.m71875b("AuthAccountOperation");

    /* renamed from: b */
    private static final bnic f86418b = bnic.m109490a((Object) 8, (Object) 7);

    /* renamed from: c */
    private final aqpl f86419c;

    /* renamed from: d */
    private final aqpg f86420d;

    /* renamed from: e */
    private final AuthAccountRequest f86421e;

    /* renamed from: f */
    private final aqoc f86422f;

    /* renamed from: g */
    private final aqpk f86423g;

    public aqoo(aqpg aqpg, AuthAccountRequest authAccountRequest, aqoc aqoc) {
        super(44, "AuthAccount");
        this.f86419c = aqpl.m71926a(aqpg.f86479b);
        this.f86420d = aqpg;
        this.f86421e = authAccountRequest;
        this.f86422f = aqoc;
        this.f86423g = cgmj.m146201b() ? aqpk.f86504a : null;
    }

    /* renamed from: a */
    private final aqpm m71878a() {
        Set d = this.f86420d.mo48023d();
        aqpk aqpk = this.f86423g;
        if (aqpk != null) {
            aqpg aqpg = this.f86420d;
            if (aqpk.mo48032b(aqpg.f86480c, aqpg.mo48027h())) {
                aqpk aqpk2 = this.f86423g;
                aqpg aqpg2 = this.f86420d;
                Set a = aqpk2.mo48031a(aqpg2.f86480c, aqpg2.mo48027h());
                bmxy.m108581a(a);
                d = new HashSet(a);
                d.retainAll(this.f86420d.mo48023d());
            }
        }
        adag a2 = adag.m50068a(this.f86420d.mo48027h(), d);
        a2.mo33283a(4);
        aqpg aqpg3 = this.f86420d;
        a2.mo33287a(aqpg3.f86480c, aqpg3.f86481d);
        a2.mo33289b(this.f86420d.f86489l);
        AuthAccountRequest authAccountRequest = this.f86421e;
        if (authAccountRequest != null) {
            Integer num = authAccountRequest.f30207d;
            Integer num2 = authAccountRequest.f30208e;
            if (!(num == null || num2 == null)) {
                a2.mo33284a(num.intValue(), num2.intValue());
            }
        }
        aqpm a3 = this.f86419c.mo48034a(a2.mo33282a());
        f86417a.logVerbose("Access token request result: %d.", Integer.valueOf(a3.f86511a));
        if (a3.mo48035a()) {
            if (((TokenData) a3.f86513c.mo66814b()).f9947e) {
                ClientContext b = m71880b();
                if (a3.f86513c.mo66813a()) {
                    List list = ((TokenData) a3.f86513c.mo66814b()).f9948f;
                    bmxy.m108581a(list);
                    b.mo17799a((String[]) list.toArray(new String[0]));
                }
                b.mo17796a(this.f86420d.f86479b);
            }
        } else if (!f86418b.contains(Integer.valueOf(a3.f86511a))) {
            m71880b().mo17804b(this.f86420d.f86479b);
        }
        return a3;
    }

    /* renamed from: b */
    private final ClientContext m71880b() {
        aqpg aqpg = this.f86420d;
        int i = aqpg.f86481d;
        Account h = aqpg.mo48027h();
        Account h2 = this.f86420d.mo48027h();
        String str = this.f86420d.f86480c;
        return new ClientContext(i, h, h2, str, str);
    }

    /* renamed from: a */
    private final void m71879a(int i, bmxv bmxv) {
        aqpg aqpg = this.f86420d;
        zzx zzx = aqpg.f86479b;
        PendingIntent activity = PendingIntent.getActivity(zzx, 0, SignInChimeraActivity.m92496a(zzx, aqpg.f86480c, (Scope[]) aqpg.mo48023d().toArray(new Scope[0]), (Intent) bmxv.mo66815c(), this.f86420d.f86491n.mo47943a()), 0);
        if (!bmxv.mo66813a()) {
            activity = null;
        }
        this.f86422f.mo47990a(new ConnectionResult(i, activity), new AuthAccountResult(i, (Intent) bmxv.mo66815c()));
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean z;
        String str;
        aqpg aqpg = this.f86420d;
        if (aqpg.f86483f) {
            Set e = aqpg.mo48024e();
            aqpk aqpk = this.f86423g;
            if (aqpk != null) {
                aqpg aqpg2 = this.f86420d;
                if (aqpk.mo48032b(aqpg2.f86480c, aqpg2.mo48027h())) {
                    aqpk aqpk2 = this.f86423g;
                    aqpg aqpg3 = this.f86420d;
                    Set a = aqpk2.mo48031a(aqpg3.f86480c, aqpg3.mo48027h());
                    bmxy.m108581a(a);
                    e = new HashSet(a);
                    e.retainAll(this.f86420d.mo48024e());
                }
            }
            if (!this.f86420d.mo48028i()) {
                str = "consent";
            } else {
                str = "auto";
            }
            adag a2 = adag.m50070a(this.f86420d.mo48027h(), this.f86420d.f86485h, e);
            a2.mo33283a(4);
            aqpg aqpg4 = this.f86420d;
            a2.mo33287a(aqpg4.f86480c, aqpg4.f86481d);
            a2.mo33288a(this.f86420d.mo48026g());
            a2.mo33290b(this.f86420d.mo48025f());
            a2.mo33286a(str);
            a2.mo33289b(this.f86420d.f86489l);
            AuthAccountRequest authAccountRequest = this.f86421e;
            if (authAccountRequest != null) {
                Integer num = authAccountRequest.f30207d;
                Integer num2 = authAccountRequest.f30208e;
                if (!(num == null || num2 == null)) {
                    a2.mo33284a(num.intValue(), num2.intValue());
                }
            }
            aqpm a3 = this.f86419c.mo48034a(a2.mo33282a());
            f86417a.logVerbose("Server auth code request (prompt=%s) result: %d.", str, Integer.valueOf(a3.f86511a));
            if (!a3.mo48035a()) {
                m71879a(a3.f86511a, a3.f86512b);
                return;
            }
        }
        if (this.f86420d.mo48023d().isEmpty()) {
            f86417a.mo25416d("No scopes specified, skipping fetching access token.", new Object[0]);
            z = true;
        } else {
            aqpg aqpg5 = this.f86420d;
            ClientContext a4 = ClientContext.m22584a(aqpg5.f86479b, aqpg5.f86481d, aqpg5.mo48027h(), this.f86420d.f86480c);
            if (a4 == null || !stc.m36282a(a4.mo17809e()).containsAll(this.f86420d.mo48024e()) || this.f86420d.f86488k) {
                aqpm a5 = m71878a();
                if (a5.mo48035a()) {
                    z = true;
                } else {
                    m71879a(a5.f86511a, a5.f86512b);
                    return;
                }
            } else {
                z = false;
            }
        }
        aqpg aqpg6 = this.f86420d;
        if (aqpg6.f86484g) {
            adag a6 = adag.m50069a(aqpg6.mo48027h(), this.f86420d.f86485h);
            a6.mo33283a(4);
            aqpg aqpg7 = this.f86420d;
            a6.mo33287a(aqpg7.f86480c, aqpg7.f86481d);
            a6.mo33289b(this.f86420d.f86489l);
            aqpg aqpg8 = this.f86420d;
            Account account = aqpg8.f86482e;
            if (account == null || !aqpg8.mo48027h().equals(account)) {
                a6.mo33288a(this.f86420d.mo48026g());
                a6.mo33290b(this.f86420d.mo48025f());
            }
            aqpm a7 = this.f86419c.mo48034a(a6.mo33282a());
            f86417a.logVerbose("ID token request result: %d.", Integer.valueOf(a7.f86511a));
            if (!a7.mo48035a()) {
                m71879a(a7.f86511a, a7.f86512b);
                return;
            }
        }
        m71879a(0, bmvz.f131120a);
        if (!z) {
            m71878a();
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        m71879a(8, bmvz.f131120a);
    }
}
