package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aqot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqot extends aaab {

    /* renamed from: a */
    private final aqpg f86430a;

    /* renamed from: b */
    private final aqoc f86431b;

    /* renamed from: c */
    private final aqpl f86432c;

    /* renamed from: d */
    private final rkb f86433d;

    /* renamed from: e */
    private final aqpk f86434e;

    /* renamed from: f */
    private final rjx f86435f;

    public aqot(aqpg aqpg, aqoc aqoc) {
        super(44, "GetCurrentAccount");
        sdo.m34959a(aqpg);
        this.f86430a = aqpg;
        sdo.m34959a(aqoc);
        this.f86431b = aqoc;
        this.f86432c = aqpl.m71926a(aqpg.f86479b);
        if (cgmm.m146206b()) {
            rjx rjx = aqpg.f86492o;
            sdo.m34959a(rjx);
            this.f86435f = rjx;
            this.f86433d = null;
        } else {
            rkb rkb = aqpg.f86490m;
            sdo.m34959a(rkb);
            this.f86433d = rkb;
            this.f86435f = null;
        }
        sdo.m34959a(aqpg.f86486i);
        if (cgmj.m146201b()) {
            this.f86434e = aqpk.f86504a;
        } else {
            this.f86434e = null;
        }
    }

    /* renamed from: a */
    private final void m71887a(Status status, GoogleSignInAccount googleSignInAccount) {
        this.f86431b.mo47987a(status, googleSignInAccount);
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.String], assign insn: PHI: (r17v0 ?) = (r17v1 ?), (r17v2 ?), (r17v3 ?) binds: [B:135:0x0353, B:134:0x0347, B:95:0x027a] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.String], assign insn: PHI: (r16v0 ?) = (r16v2 ?), (r16v3 ?), (r16v9 ?) binds: [B:134:0x0347, B:95:0x027a, B:135:0x0353] */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.lang.String], assign insn: PHI: (r21v0 ?) = (r21v1 ?), (r21v2 java.lang.String) binds: [B:138:0x0368, B:137:0x035d] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.String], assign insn: PHI: (r13v2 ?) = (r13v3 ?), (r13v4 java.lang.String) binds: [B:143:0x0372, B:142:0x0370] */
    /* JADX WARN: Type inference failed for: r19v0, types: [android.net.Uri], assign insn: PHI: (r19v0 ?) = (r19v1 ?), (r19v2 android.net.Uri) binds: [B:146:0x037c, B:145:0x0375] */
    /* JADX WARN: Type inference failed for: r19v1, assign insn: 0x037c: MOVE  (r19v1 ? I:?[OBJECT, ARRAY]) = (r14v3 com.google.android.gms.auth.api.signin.GoogleSignInAccount) */
    /* JADX WARN: Type inference failed for: r13v3, assign insn: 0x0372: MOVE  (r13v3 ? I:?[OBJECT, ARRAY]) = (r14v3 com.google.android.gms.auth.api.signin.GoogleSignInAccount) */
    /* JADX WARN: Type inference failed for: r21v1, assign insn: 0x0368: MOVE  (r21v1 ? I:?[OBJECT, ARRAY]) = (r14v3 com.google.android.gms.auth.api.signin.GoogleSignInAccount) */
    /* JADX WARN: Type inference failed for: r0v31, types: [rtm, java.lang.Iterable], assign insn: PHI: (r0v31 ?) = (r0v33 ?), (r0v36 ?), (r0v40 ?), (r0v92 amey), (r0v93 amey) binds: [B:126:0x031b, B:124:0x0315, B:114:0x02e1, B:121:0x0309, B:106:0x02cc] */
    /* JADX WARN: Type inference failed for: r17v1, assign insn: 0x0355: MOVE  (r17v1 ? I:?[OBJECT, ARRAY]) = (r16v1 com.google.android.gms.auth.api.signin.GoogleSignInAccount) */
    /* JADX WARN: Type inference failed for: r16v2, assign insn: 0x034a: MOVE  (r16v2 ? I:?[OBJECT, ARRAY]) = (r5v5 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r17v2, assign insn: 0x034c: MOVE  (r17v2 ? I:?[OBJECT, ARRAY]) = (r6v1 java.lang.Object) */
    /* JADX WARN: Type inference failed for: r0v33, assign insn: 0x031b: MOVE  (r0v33 ? I:?[OBJECT, ARRAY]) = (r14v7 com.google.android.gms.auth.api.signin.GoogleSignInAccount) */
    /* JADX WARN: Type inference failed for: r0v36, assign insn: 0x0318: MOVE  (r0v36 ? I:?[OBJECT, ARRAY]) = (0 ?[OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r0v40, assign insn: 0x02e1: CONST  (r0v40 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r16v3, assign insn: 0x027b: CONST  (r16v3 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r17v3, assign insn: 0x027d: CONST  (r17v3 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (null java.lang.String) */
    /* JADX WARN: Type inference failed for: r16v9, assign insn: ?: MOVE  (r16v9 ?) = (r16v1 com.google.android.gms.auth.api.signin.GoogleSignInAccount) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x046e  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        aqpm aqpm;
        GoogleSignInAccount googleSignInAccount;
        GoogleSignInAccount googleSignInAccount2;
        GoogleSignInAccount googleSignInAccount3;
        aqpk aqpk;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ? r17;
        ? r16;
        String str6;
        String str7;
        Uri uri;
        Long l;
        amey amey;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        amey amey2;
        GoogleSignInAccount googleSignInAccount4;
        String str8;
        String str9;
        String str10;
        String str11;
        Uri uri2;
        Long l2;
        adac adac;
        String str12;
        String a;
        Status status;
        Account h = this.f86430a.mo48027h();
        if (h == null) {
            Log.e("GetCurrentAccountOpr", "SignInService has no stored account");
            m71887a(Status.f30109c, null);
            return;
        }
        Set d = this.f86430a.mo48023d();
        if (d == null) {
            d = new HashSet();
        }
        aqpk aqpk2 = this.f86434e;
        if (aqpk2 != null && aqpk2.mo48032b(this.f86430a.f86480c, h)) {
            aqpk aqpk3 = this.f86434e;
            aqpg aqpg = this.f86430a;
            d = aqpk3.mo48031a(aqpg.f86480c, aqpg.mo48027h());
            sdo.m34959a(d);
        }
        if (!d.isEmpty()) {
            aqpl aqpl = this.f86432c;
            adag a2 = adag.m50068a(h, d);
            a2.mo33283a(4);
            aqpg aqpg2 = this.f86430a;
            a2.mo33287a(aqpg2.f86480c, aqpg2.f86481d);
            a2.mo33289b(this.f86430a.f86489l);
            aqpm = aqpl.mo48034a(a2.mo33282a());
            if (!aqpm.mo48035a()) {
                int i = aqpm.f86511a;
                if (i == 4 || i == 10) {
                    status = new Status(10);
                } else {
                    status = Status.f30109c;
                }
                m71887a(status, null);
                return;
            } else if (((TokenData) aqpm.f86513c.mo66814b()).f9947e) {
                List list = ((TokenData) aqpm.f86513c.mo66814b()).f9948f;
                sdo.m34959a(list);
                d = stc.m36281a(list);
            }
        } else {
            aqpm = null;
        }
        boolean contains = d.contains(GoogleSignInOptions.f10327a);
        boolean contains2 = d.contains(GoogleSignInOptions.f10328b);
        boolean contains3 = d.contains(GoogleSignInOptions.f10329c);
        if (this.f86430a.f86484g) {
            Log.v("GetCurrentAccountOpr", "id token required, issuing request");
            adag a3 = adag.m50069a(h, this.f86430a.f86485h);
            a3.mo33283a(4);
            aqpg aqpg3 = this.f86430a;
            a3.mo33287a(aqpg3.f86480c, aqpg3.f86481d);
            a3.mo33289b(this.f86430a.f86489l);
            aqpg aqpg4 = this.f86430a;
            Account account = aqpg4.f86482e;
            if (account == null || !aqpg4.mo48027h().equals(account)) {
                a3.mo33288a(this.f86430a.mo48026g());
                a3.mo33290b(this.f86430a.mo48025f());
            }
            aqpm a4 = this.f86432c.mo48034a(a3.mo33282a());
            if (a4.mo48035a()) {
                String str13 = ((TokenData) a4.f86513c.mo66814b()).f9944b;
                if (cgms.f187325a.mo6606a().mo84126a()) {
                    String str14 = this.f86430a.f86480c;
                    bmxv a5 = adad.m50067a(str13);
                    googleSignInAccount4 = (!a5.mo66813a() || (a = aqou.m71890a((str12 = (adac = (adac) a5.mo66814b()).f61190a), str14)) == null) ? null : GoogleSignInAccount.m6413a(str12, str13, (String) adac.f61194e.mo66815c(), (String) adac.f61191b.mo66815c(), (String) adac.f61192c.mo66815c(), (String) adac.f61193d.mo66815c(), (Uri) adac.f61195f.mo66815c(), (Long) adac.f61196g.mo66815c(), a, d);
                } else {
                    String str15 = this.f86430a.f86480c;
                    String[] split = str13.split("\\.");
                    if (split.length < 3) {
                        Log.w("GetCurrentAccountOpr", "Malformed id token - incorrect number of parts");
                        googleSignInAccount4 = null;
                    } else {
                        try {
                            try {
                                JSONObject jSONObject = new JSONObject(new String(sqd.m35971c(split[1]), "UTF-8"));
                                String string = jSONObject.getString("sub");
                                if (jSONObject.has("name")) {
                                    str8 = jSONObject.getString("name");
                                } else {
                                    str8 = null;
                                }
                                if (jSONObject.has("given_name")) {
                                    str9 = jSONObject.getString("given_name");
                                } else {
                                    str9 = null;
                                }
                                if (jSONObject.has("family_name")) {
                                    str10 = jSONObject.getString("family_name");
                                } else {
                                    str10 = null;
                                }
                                if (jSONObject.has("email")) {
                                    str11 = jSONObject.getString("email");
                                } else {
                                    str11 = null;
                                }
                                if (jSONObject.has("picture")) {
                                    uri2 = Uri.parse(jSONObject.getString("picture"));
                                } else {
                                    uri2 = null;
                                }
                                if (jSONObject.has("exp")) {
                                    l2 = Long.valueOf(Long.parseLong(jSONObject.getString("exp")));
                                } else {
                                    l2 = null;
                                }
                                String a6 = aqou.m71890a(string, str15);
                                googleSignInAccount4 = a6 != null ? GoogleSignInAccount.m6413a(string, str13, str11, str8, str9, str10, uri2, l2, a6, d) : null;
                            } catch (JSONException e) {
                                Log.w("GetCurrentAccountOpr", "Malformed id token - could not json decode claims");
                                googleSignInAccount4 = null;
                            }
                        } catch (UnsupportedEncodingException e2) {
                            Log.w("GetCurrentAccountOpr", "Malformed id token - UTF-8 encoding is not supported");
                            googleSignInAccount4 = null;
                        }
                    }
                }
                if (googleSignInAccount4 == null) {
                    Log.w("GetCurrentAccountOpr", "Can't get a valid id token");
                }
                googleSignInAccount = googleSignInAccount4;
                googleSignInAccount2 = null;
            } else {
                googleSignInAccount2 = null;
                googleSignInAccount = null;
            }
        } else {
            try {
                str2 = gie.m13198c(context, h.name);
            } catch (gid | IOException | IllegalStateException e3) {
                Log.w("GetCurrentAccountOpr", "Can't get user id");
                str2 = null;
            }
            if (contains2) {
                str3 = h.name;
            } else {
                str3 = null;
            }
            if (!contains) {
                googleSignInAccount = null;
                r16 = 0;
                r17 = null;
                str5 = null;
                str4 = null;
            } else {
                if (!cgmm.m146206b()) {
                    rkb rkb = this.f86433d;
                    if (rkb == null || !rkb.mo24802f().mo17671b()) {
                        amey = 0;
                        googleSignInAccount = null;
                    } else {
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        AtomicReference atomicReference = new AtomicReference();
                        rjo rjo = allr.f73629a;
                        amcf.m62587a(this.f86433d, h.name, null).mo9458a(new aqos(atomicReference, countDownLatch));
                        try {
                            countDownLatch.await(1, TimeUnit.SECONDS);
                            amey amey3 = (amey) atomicReference.get();
                            this.f86433d.mo24803g();
                            amey2 = amey3;
                        } catch (InterruptedException e4) {
                            Log.w("GetCurrentAccountOpr", "Interrupted while waiting for account info");
                            this.f86433d.mo24803g();
                            amey2 = null;
                        } catch (Throwable th) {
                            this.f86433d.mo24803g();
                            throw th;
                        }
                        googleSignInAccount = null;
                        amey = amey2;
                    }
                } else {
                    if (this.f86435f != null) {
                        CountDownLatch countDownLatch2 = new CountDownLatch(1);
                        AtomicReference atomicReference2 = new AtomicReference();
                        googleSignInAccount = null;
                        googleSignInAccount = null;
                        googleSignInAccount = null;
                        this.f86435f.mo24710a((alkx) null).mo9458a(new aqor(atomicReference2, countDownLatch2));
                        try {
                            if (countDownLatch2.await(1, TimeUnit.SECONDS)) {
                                amey = (amey) atomicReference2.get();
                            } else {
                                countDownLatch2.countDown();
                            }
                        } catch (InterruptedException e5) {
                            Log.w("GetCurrentAccountOpr", "Interrupted while waiting for account info");
                            amey = 0;
                        }
                    } else {
                        googleSignInAccount = null;
                    }
                    amey = googleSignInAccount;
                }
                if (amey != 0) {
                    alzr alzr = (alzr) bnjd.m109602h(amey, new aqoq(h));
                    if (alzr != null) {
                        Object d2 = alzr.mo41064d();
                        obj3 = alzr.mo41066g();
                        obj2 = alzr.mo41067h();
                        obj = alzr.mo41069j();
                        obj4 = d2;
                        if (str2 == null) {
                            str2 = alzr.mo41068i();
                            obj4 = d2;
                        }
                    } else {
                        Object obj5 = googleSignInAccount;
                        obj3 = obj5;
                        obj2 = obj3;
                        obj = obj2;
                        obj4 = obj5;
                    }
                    amey.mo12460c();
                    r16 = obj4;
                    r17 = obj3;
                    str5 = obj2;
                    str4 = obj;
                } else {
                    GoogleSignInAccount googleSignInAccount5 = googleSignInAccount;
                    r17 = googleSignInAccount5;
                    str5 = r17;
                    str4 = str5;
                    r16 = googleSignInAccount5;
                }
            }
            if (str2 != null) {
                str6 = aqou.m71890a(str2, this.f86430a.f86480c);
            } else {
                str6 = googleSignInAccount;
            }
            if (str6 == 0) {
                googleSignInAccount2 = googleSignInAccount;
            } else {
                if (contains3) {
                    str7 = str2;
                } else {
                    str7 = googleSignInAccount;
                }
                if (str4 != null) {
                    uri = Uri.parse(str4);
                } else {
                    uri = googleSignInAccount;
                }
                if (aqpm != null) {
                    l = ((TokenData) aqpm.f86513c.mo66814b()).f9945c;
                } else {
                    l = Long.valueOf(System.currentTimeMillis() / 1000);
                }
                googleSignInAccount2 = googleSignInAccount;
                googleSignInAccount = GoogleSignInAccount.m6413a(str7, null, str3, r16, r17, str5, uri, l, str6, d);
            }
        }
        if (googleSignInAccount != null) {
            aqpg aqpg5 = this.f86430a;
            if (aqpg5.f86483f) {
                Set e6 = aqpg5.mo48024e();
                aqpk aqpk4 = this.f86434e;
                if (aqpk4 != null && aqpk4.mo48032b(this.f86430a.f86480c, h)) {
                    aqpk aqpk5 = this.f86434e;
                    aqpg aqpg6 = this.f86430a;
                    e6 = aqpk5.mo48031a(aqpg6.f86480c, aqpg6.mo48027h());
                    sdo.m34959a(e6);
                }
                if (!this.f86430a.mo48028i()) {
                    str = "consent";
                } else {
                    str = "auto";
                }
                adag a7 = adag.m50070a(this.f86430a.mo48027h(), this.f86430a.f86485h, e6);
                a7.mo33283a(4);
                aqpg aqpg7 = this.f86430a;
                a7.mo33287a(aqpg7.f86480c, aqpg7.f86481d);
                a7.mo33288a(this.f86430a.mo48026g());
                a7.mo33290b(this.f86430a.mo48025f());
                a7.mo33286a(str);
                a7.mo33289b(this.f86430a.f86489l);
                aqpm a8 = this.f86432c.mo48034a(a7.mo33282a());
                if (a8.mo48035a()) {
                    googleSignInAccount.f10320g = ((TokenData) a8.f86513c.mo66814b()).f9944b;
                    try {
                        gie.m13196b(this.f86432c.f86508b, ((TokenData) a8.f86513c.mo66814b()).f9944b);
                    } catch (gid | IOException e7) {
                        aqpl.f86506a.mo25415d("Error clearing cached token.", e7, new Object[0]);
                    }
                } else {
                    Log.e("GetCurrentAccountOpr", "Unexpected failure retrieving server auth code.");
                    googleSignInAccount3 = googleSignInAccount2;
                    aqpk = this.f86434e;
                    if (aqpk != null) {
                        aqpg aqpg8 = this.f86430a;
                        aqpk.mo48033c(aqpg8.f86480c, aqpg8.mo48027h());
                    }
                    m71887a(googleSignInAccount3 != null ? Status.f30109c : Status.f30107a, googleSignInAccount3);
                }
            }
        }
        googleSignInAccount3 = googleSignInAccount;
        aqpk = this.f86434e;
        if (aqpk != null) {
        }
        m71887a(googleSignInAccount3 != null ? Status.f30109c : Status.f30107a, googleSignInAccount3);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f86431b.mo47987a(status, (GoogleSignInAccount) null);
    }
}
