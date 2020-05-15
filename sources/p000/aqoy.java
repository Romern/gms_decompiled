package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.activity.SignInChimeraActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* renamed from: aqoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqoy extends aaab {

    /* renamed from: a */
    private final Account f86448a;

    /* renamed from: b */
    private final int f86449b;

    /* renamed from: c */
    private final GoogleSignInAccount f86450c;

    /* renamed from: d */
    private final String f86451d;

    /* renamed from: e */
    private final int f86452e;

    /* renamed from: f */
    private final Set f86453f;

    /* renamed from: g */
    private final String f86454g;

    /* renamed from: h */
    private final sct f86455h;

    /* renamed from: i */
    private final aqpc f86456i;

    /* renamed from: j */
    private final aqkt f86457j;

    public aqoy(aqpg aqpg, ResolveAccountRequest resolveAccountRequest, sct sct, aqpc aqpc) {
        super(44, "ResolveAccount");
        String str = aqpg.f86480c;
        sdo.m34977c(str);
        this.f86451d = str;
        this.f86452e = aqpg.f86481d;
        this.f86453f = aqpg.mo48022b();
        this.f86454g = aqpg.f86487j;
        this.f86457j = aqpg.f86491n;
        this.f86448a = resolveAccountRequest.f30240b;
        this.f86449b = resolveAccountRequest.f30241c;
        this.f86450c = resolveAccountRequest.f30242d;
        sdo.m34959a(sct);
        this.f86455h = sct;
        this.f86456i = aqpc;
        sdo.m34959a(aqpg.f86486i);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.Set, bmxj]
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
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018f, code lost:
        if (r12.getBoolean(r13.length() == 0 ? new java.lang.String("x-client-auth:") : "x-client-auth:".concat(r13), false) == false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0193, code lost:
        r0 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0236  */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean z;
        Account account;
        boolean z2;
        int i;
        Account account2;
        String str;
        Account account3;
        Context context2 = context;
        if (!soz.m35807f(context)) {
            aqpc aqpc = this.f86456i;
            String str2 = this.f86451d;
            int i2 = this.f86449b;
            aqon aqon = aqpc.f86468c;
            aqon.f86414a.logVerbose("getAccount(package_name=%s, session_id=%d)", str2, Integer.valueOf(i2));
            Account account4 = (Account) aqon.f86416c.get(str2);
            boolean a = soz.m35790a(this.f86448a, "com.google");
            if (!a && !TextUtils.isEmpty(this.f86454g) && (account3 = this.f86448a) != null) {
                String lowerCase = account3.name.toLowerCase(Locale.ROOT);
                String valueOf = String.valueOf(this.f86454g.toLowerCase(Locale.ROOT));
                if (!lowerCase.endsWith(valueOf.length() == 0 ? new String("@") : "@".concat(valueOf))) {
                    Log.e("ResolveAccountOperation", "The specified account doesn't belong to the specified hosted domain");
                    this.f86455h.mo25387a(new ResolveAccountResponse(5));
                    return;
                }
            }
            if (account4 == null) {
                GoogleSignInAccount googleSignInAccount = this.f86450c;
                if (!(googleSignInAccount == null || googleSignInAccount.f10317d == null) || !a) {
                    Account account5 = this.f86448a;
                    if (a) {
                        sdo.m34959a(googleSignInAccount);
                        String str3 = googleSignInAccount.f10317d;
                        sdo.m34959a((Object) str3);
                        account5 = new Account(str3, "com.google");
                    }
                    account4 = soz.m35782a(context2, account5, this.f86451d);
                }
                if (account4 == null) {
                    GoogleSignInAccount googleSignInAccount2 = this.f86450c;
                    if (googleSignInAccount2 == null || (str = googleSignInAccount2.f10322i) == null) {
                        account = soz.m35782a(context2, this.f86448a, this.f86451d);
                    } else {
                        String str4 = this.f86451d;
                        sdo.m34959a((Object) str);
                        try {
                            Iterator it = soz.m35801d(context2, str4).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    account = null;
                                    break;
                                }
                                Account account6 = (Account) it.next();
                                String c = gie.m13198c(context2, account6.name);
                                if (c != null && str.equals(aqou.m71890a(c, str4))) {
                                    account = account6;
                                    break;
                                }
                            }
                        } catch (gid | IOException | IllegalStateException e) {
                            Log.w("HashedUserIdHelper", str.length() == 0 ? new String("Could not resolve user from hashedUserId: ") : "Could not resolve user from hashedUserId: ".concat(str));
                            account = null;
                        }
                    }
                    if (account != null) {
                        z = false;
                    } else if (this.f86448a != null && !a) {
                        this.f86455h.mo25387a(new ResolveAccountResponse(5));
                        return;
                    } else {
                        if (this.f86453f.size() > 0) {
                            aqpc aqpc2 = this.f86456i;
                            String str5 = this.f86451d;
                            int i3 = this.f86452e;
                            Set set = this.f86453f;
                            String str6 = this.f86454g;
                            if (bnpf.m110055b(bnpf.m110049a(bmyx.m108640a(',').mo66917a().mo66918a((CharSequence) cglx.f187303a.mo6606a().mo84111a())), bnpf.m110049a(bnjd.m109575a((Iterable) set, aqpa.f86463a))).isEmpty()) {
                                if (!rfz.m33557a(context).mo24610b(str5)) {
                                    rtj a2 = soz.m35786a(context);
                                    String valueOf2 = String.valueOf(str5);
                                } else {
                                    account = null;
                                }
                            }
                            ArrayList a3 = soz.m35785a(soz.m35801d(context2, str5), str6);
                            if (a3 != null) {
                                i = a3.size();
                            } else {
                                i = 0;
                            }
                            int i4 = 0;
                            Account account7 = null;
                            boolean z3 = false;
                            while (true) {
                                if (i4 >= i) {
                                    account2 = account7;
                                    break;
                                }
                                Account account8 = (Account) a3.get(i4);
                                aqpl a4 = aqpl.m71926a(context);
                                adag a5 = adag.m50068a(account8, set);
                                a5.mo33283a(4);
                                a5.mo33287a(str5, i3);
                                int i5 = a4.mo48034a(a5.mo33282a()).f86511a;
                                if (i5 != 0) {
                                    if (i5 == 7 || i5 == 8) {
                                        z3 = true;
                                    }
                                } else if (account7 != null) {
                                    aqop aqop = aqpc2.f86467b;
                                    aqop.m71883a(context2, str5);
                                    break;
                                } else {
                                    account7 = account8;
                                }
                                if (z3) {
                                    account2 = null;
                                    break;
                                }
                                i4++;
                            }
                            if (!z3) {
                                aqop aqop2 = aqpc2.f86467b;
                                aqop.m71883a(context2, str5);
                            }
                            account = account2;
                        }
                        if (account != null) {
                            z = true;
                        } else {
                            String str7 = this.f86451d;
                            Set set2 = this.f86453f;
                            this.f86455h.mo25387a(new ResolveAccountResponse(new ConnectionResult(4, PendingIntent.getActivity(context2, 0, SignInChimeraActivity.m92497a(str7, (Scope[]) set2.toArray(new Scope[set2.size()]), this.f86457j.mo47943a(), this.f86449b), 134217728))));
                            return;
                        }
                    }
                    rzw rzw = new rzw(context2, account);
                    if (this.f86448a != null) {
                        z2 = true;
                    } else {
                        z2 = a;
                    }
                    sct sct = this.f86455h;
                    ResolveAccountResponse resolveAccountResponse = new ResolveAccountResponse(0);
                    resolveAccountResponse.f30244b = rzw;
                    resolveAccountResponse.f30246d = z2;
                    resolveAccountResponse.f30247e = z;
                    sct.mo25387a(resolveAccountResponse);
                    return;
                }
            }
            z = false;
            rzw rzw2 = new rzw(context2, account);
            if (this.f86448a != null) {
            }
            sct sct2 = this.f86455h;
            ResolveAccountResponse resolveAccountResponse2 = new ResolveAccountResponse(0);
            resolveAccountResponse2.f30244b = rzw2;
            resolveAccountResponse2.f30246d = z2;
            resolveAccountResponse2.f30247e = z;
            sct2.mo25387a(resolveAccountResponse2);
            return;
        }
        this.f86455h.mo25387a(new ResolveAccountResponse(20));
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f86455h.mo25387a(new ResolveAccountResponse(8));
    }
}
