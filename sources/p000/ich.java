package p000;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: ich */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ich {

    /* renamed from: a */
    public Set f20725a = new HashSet();

    /* renamed from: b */
    public String f20726b;

    /* renamed from: c */
    private boolean f20727c;

    /* renamed from: d */
    private boolean f20728d;

    /* renamed from: e */
    private boolean f20729e;

    /* renamed from: f */
    private String f20730f;

    /* renamed from: g */
    private Account f20731g;

    /* renamed from: h */
    private String f20732h;

    /* renamed from: i */
    private Map f20733i = new HashMap();

    public ich() {
    }

    /* renamed from: a */
    public final GoogleSignInOptions mo12912a() {
        if (this.f20725a.contains(GoogleSignInOptions.f10331e) && this.f20725a.contains(GoogleSignInOptions.f10330d)) {
            this.f20725a.remove(GoogleSignInOptions.f10330d);
        }
        if (this.f20729e && (this.f20731g == null || !this.f20725a.isEmpty())) {
            mo12914b();
        }
        return new GoogleSignInOptions(3, new ArrayList(this.f20725a), this.f20731g, this.f20729e, this.f20727c, this.f20728d, this.f20730f, this.f20732h, this.f20733i, this.f20726b);
    }

    /* renamed from: b */
    public final void mo12914b() {
        this.f20725a.add(GoogleSignInOptions.f10329c);
    }

    public ich(GoogleSignInOptions googleSignInOptions) {
        sdo.m34959a(googleSignInOptions);
        Scope scope = GoogleSignInOptions.f10327a;
        this.f20725a = new HashSet(googleSignInOptions.f10335h);
        this.f20727c = googleSignInOptions.f10338k;
        this.f20728d = googleSignInOptions.f10339l;
        this.f20729e = googleSignInOptions.f10337j;
        this.f20730f = googleSignInOptions.f10340m;
        this.f20731g = googleSignInOptions.f10336i;
        this.f20732h = googleSignInOptions.f10341n;
        this.f20733i = GoogleSignInOptions.m6416a(googleSignInOptions.f10342o);
        this.f20726b = googleSignInOptions.f10343p;
    }

    /* renamed from: a */
    public final void mo12913a(Scope scope, Scope... scopeArr) {
        this.f20725a.add(scope);
        this.f20725a.addAll(Arrays.asList(scopeArr));
    }
}
