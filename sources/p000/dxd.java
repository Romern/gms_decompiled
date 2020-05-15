package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.internal.ClientContext;
import java.util.HashMap;

/* renamed from: dxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dxd extends drx implements Response.Listener, Response.ErrorListener {

    /* renamed from: c */
    public final Context f14340c;

    /* renamed from: d */
    public final doh f14341d;

    /* renamed from: e */
    public final long f14342e;

    /* renamed from: f */
    private final int f14343f = ((int) cdgp.f180782a.mo6606a().mo77601u());

    /* renamed from: g */
    private final String f14344g;

    /* renamed from: h */
    private final String f14345h;

    /* renamed from: i */
    private final int f14346i;

    /* renamed from: j */
    private final bxxc f14347j;

    /* renamed from: k */
    private final egi f14348k;

    /* renamed from: l */
    private final String f14349l;

    /* renamed from: o */
    private long f14350o;

    /* renamed from: p */
    private long f14351p;

    /* renamed from: q */
    private int f14352q;

    /* renamed from: r */
    private final int f14353r;

    protected dxd(Context context, String str, doh doh, String str2, int i, int i2, bxxc bxxc, long j, dwu dwu, dqb dqb, String str3) {
        super(str);
        this.f14340c = context;
        sdo.m34959a((Object) str);
        this.f14344g = str;
        sdo.m34959a(doh);
        this.f14341d = doh;
        sdo.m34959a((Object) str2);
        this.f14345h = str2;
        this.f14346i = i;
        this.f14353r = i2;
        sdo.m34959a(bxxc);
        this.f14347j = bxxc;
        this.f14348k = dwu != null ? new egi(dwu, dqb) : null;
        this.f14352q = this.f14343f;
        this.f14349l = str3;
        this.f14342e = j;
    }

    /* renamed from: a */
    private final void m9728a(int i, int i2) {
        m9732b(i, i2);
        egi egi = this.f14348k;
        if (egi != null) {
            egi.mo10086a((egg) new dxb(i2));
        }
    }

    /* renamed from: b */
    private final dwr m9731b(String str) {
        return new dwr(this.f14340c, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bxjd mo9827a(bxxc bxxc);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract bxxc mo9830c();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    public final void onErrorResponse(VolleyError volleyError) {
        int i;
        int i2;
        int i3;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse != null) {
            i = networkResponse.statusCode;
        } else {
            i = -1;
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
        bnsl.mo68437a(volleyError);
        bnsl.mo68432a("dxd", "onErrorResponse", 328, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68422a("[BaseServerTask] Server task (%s) got error statusCode=%s.", (Object) this.f14344g, i);
        NetworkResponse networkResponse2 = volleyError.networkResponse;
        if (networkResponse2 != null) {
            int i4 = networkResponse2.statusCode;
            i2 = i4 != 401 ? i4 != 403 ? i4 >= 500 ? 5 : 6 : 12 : 4;
        } else {
            i2 = -1;
        }
        if (i2 != 4 || (i3 = this.f14352q) <= 0) {
            m9729a(1, i2, (bxxc) null);
            return;
        }
        this.f14352q = i3 - 1;
        bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
        bnsl2.mo68432a("dxd", "a", 350, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68422a("[BaseServerTask] Task(%s) invalid auth token - retrying (num retries remaining=%s)", (Object) this.f14344g, this.f14352q);
        mo9516a(mo9513a((String) null));
    }

    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
        bxxc bxxc = (bxxc) obj;
        int i = 1;
        int i2 = 0;
        new Object[1][0] = this.f14344g;
        new Object[1][0] = bxxc;
        bxjd a = mo9827a(bxxc);
        if (a == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dxd", "b", 308, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[BaseServerTask] FATAL: No header received from server for task: %s", this.f14344g);
            m9729a(1, 2, bxxc);
            return;
        }
        bxjl bxjl = a.f163618a;
        if (bxjl == null) {
            bxjl = bxjl.f163652b;
        }
        int a2 = bxjn.m122776a(bxjl.f163654a);
        if (a2 == 0) {
            a2 = 1;
        }
        bxjl bxjl2 = a.f163618a;
        if (bxjl2 == null) {
            bxjl2 = bxjl.f163652b;
        }
        if (bxjl2 != null) {
            int a3 = bxjn.m122776a(bxjl2.f163654a);
            if (a3 != 0) {
                i = a3;
            }
            int i3 = i - 2;
            if (i3 == -1) {
                i2 = 2;
            } else if (i3 != 0) {
                i2 = i3 != 201 ? i3 != 402 ? -1 : 11 : 3;
            }
        } else {
            i2 = -1;
        }
        m9729a(a2, i2, bxxc);
    }

    /* renamed from: b */
    private final void m9732b(int i, int i2) {
        int i3;
        long b = dwq.m9665i().mo20506b();
        dpf G = dwq.m9650G();
        int i4 = this.f14353r;
        if (!this.f14341d.mo9338b()) {
            i3 = 2;
        } else {
            i3 = 3;
        }
        int i5 = i - 2;
        long j = this.f14351p;
        long j2 = -1;
        if (j != -1) {
            j2 = this.f14350o - j;
        }
        long j3 = b - this.f14350o;
        int i6 = this.f14343f - this.f14352q;
        bxvd da = bxip.f163543i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxip bxip = (bxip) da.f164949b;
        int i7 = i4 - 1;
        if (i4 != 0) {
            bxip.f163546b = i7;
            int i8 = bxip.f163545a | 1;
            bxip.f163545a = i8;
            bxip.f163547c = i3 - 1;
            int i9 = i8 | 2;
            bxip.f163545a = i9;
            int i10 = i9 | 4;
            bxip.f163545a = i10;
            bxip.f163548d = i5;
            int i11 = i10 | 8;
            bxip.f163545a = i11;
            bxip.f163549e = i2;
            int i12 = i11 | 16;
            bxip.f163545a = i12;
            bxip.f163550f = j2;
            int i13 = i12 | 32;
            bxip.f163545a = i13;
            bxip.f163551g = j3;
            bxip.f163545a = i13 | 64;
            bxip.f163552h = i6;
            bxip bxip2 = (bxip) da.mo74062i();
            bxvd b2 = dpf.m9019b();
            if (b2.f164950c) {
                b2.mo74035c();
                b2.f164950c = false;
            }
            tjk tjk = (tjk) b2.f164949b;
            tjk tjk2 = tjk.f46190i;
            bxip2.getClass();
            tjk.f46197f = bxip2;
            tjk.f46192a |= 16;
            G.mo9376a((tjk) b2.mo74062i(), 5);
            return;
        }
        throw null;
    }

    /* renamed from: a */
    private final void m9729a(int i, int i2, bxxc bxxc) {
        if (i2 == 0) {
            m9732b(i, 0);
            egi egi = this.f14348k;
            if (egi != null) {
                egi.mo10086a((egg) new dxc(bxxc));
                return;
            }
            return;
        }
        m9728a(i, i2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    private final boolean m9730a(int i) {
        int i2;
        if (i != 4 || (i2 = this.f14352q) <= 0) {
            return false;
        }
        this.f14352q = i2 - 1;
        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
        bnsl.mo68432a("dxd", "a", 350, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68422a("[BaseServerTask] Task(%s) invalid auth token - retrying (num retries remaining=%s)", (Object) this.f14344g, this.f14352q);
        mo9516a(mo9513a((String) null));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        long j;
        String str;
        ClientContext clientContext;
        String str2;
        new Object[1][0] = this.f14344g;
        this.f14350o = dwq.m9665i().mo20506b();
        dwt w = dwq.m9679w();
        int i = this.f14353r;
        int i2 = i - 1;
        if (i != 0) {
            Long l = (Long) w.f14315c.get(i2);
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            this.f14351p = j;
            dwt w2 = dwq.m9679w();
            int i3 = this.f14353r;
            int i4 = i3 - 1;
            if (i3 != 0) {
                w2.f14315c.put(i4, Long.valueOf(dwq.m9665i().mo20506b()));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f14340c.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    bxxc c = mo9830c();
                    new Object[1][0] = c;
                    String str3 = this.f14349l;
                    if (str3 == null) {
                        str = this.f14340c.getPackageName();
                    } else {
                        str = str3;
                    }
                    if (this.f14341d.mo9338b()) {
                        Account account = null;
                        clientContext = new ClientContext(Process.myUid(), account, account, str, str);
                    } else {
                        int myUid = Process.myUid();
                        String str4 = this.f14341d.f13690b;
                        clientContext = new ClientContext(myUid, str4, str4, str, str);
                        clientContext.mo17799a(new String[]{cdgp.f180782a.mo6606a().mo77544aI()});
                    }
                    if (!this.f14341d.mo9338b()) {
                        dwr b = m9731b((String) null);
                        String str5 = this.f14345h;
                        byte[] k = c.mo73642k();
                        bxxc bxxc = this.f14347j;
                        int i5 = this.f14346i;
                        String b2 = b.mo25527b(clientContext);
                        String c2 = b.mo25528c(clientContext);
                        if (b2 != null) {
                            HashMap a = b.mo25519a(b.f44453i, clientContext);
                            int a2 = sgv.m35239a(1, a);
                            String a3 = b.mo25518a(b.f44444d, str5);
                            int i6 = clientContext.f30212b;
                            b.f44448h = i6;
                            b.mo25525b(b.mo25520a(a2, a3, k, bxxc, b2, c2, this, this, a, i5, i6), b2);
                            return;
                        }
                        onErrorResponse(new VolleyError("Unable to obtain auth token - is the device online?"));
                        return;
                    }
                    String str6 = this.f14349l;
                    if (str6 != null) {
                        str2 = spn.m35849a(this.f14340c, str6, "com.google.android.awareness.API_KEY");
                    } else {
                        str2 = "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk";
                    }
                    m9731b(str2).mo25522a(clientContext, this.f14345h, c.mo73642k(), this.f14347j, this, this);
                    return;
                }
                long j2 = this.f14342e;
                if (j2 > 0) {
                    Object[] objArr = {this.f14344g, Long.valueOf(j2)};
                    dxa dxa = dwq.m9679w().f14314b;
                    if (!dxa.f14337c) {
                        dxa.f14335a.add(new dwz(dxa, this, dwq.m9665i().mo20506b() + this.f14342e));
                        return;
                    }
                    new Object[1][0] = this;
                    mo9828b();
                    return;
                }
                mo9828b();
                return;
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: b */
    public final void mo9828b() {
        String str;
        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
        bnsl.mo68432a("dxd", "b", (int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        if (this.f14342e <= 0) {
            str = "";
        } else {
            str = "expired";
        }
        bnsl.mo68420a("[BaseServerTask] Failed network request due to no network connectivity: %s", str);
        m9728a(1, 1);
    }

    /* renamed from: b */
    public final void mo9829b(bxxc bxxc) {
        int i = 1;
        int i2 = 0;
        new Object[1][0] = this.f14344g;
        new Object[1][0] = bxxc;
        bxjd a = mo9827a(bxxc);
        if (a == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dxd", "b", 308, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[BaseServerTask] FATAL: No header received from server for task: %s", this.f14344g);
            m9729a(1, 2, bxxc);
            return;
        }
        bxjl bxjl = a.f163618a;
        if (bxjl == null) {
            bxjl = bxjl.f163652b;
        }
        int a2 = bxjn.m122776a(bxjl.f163654a);
        if (a2 == 0) {
            a2 = 1;
        }
        bxjl bxjl2 = a.f163618a;
        if (bxjl2 == null) {
            bxjl2 = bxjl.f163652b;
        }
        if (bxjl2 != null) {
            int a3 = bxjn.m122776a(bxjl2.f163654a);
            if (a3 != 0) {
                i = a3;
            }
            int i3 = i - 2;
            if (i3 == -1) {
                i2 = 2;
            } else if (i3 != 0) {
                i2 = i3 != 201 ? i3 != 402 ? -1 : 11 : 3;
            }
        } else {
            i2 = -1;
        }
        m9729a(a2, i2, bxxc);
    }
}
