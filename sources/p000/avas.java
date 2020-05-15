package p000;

import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: avas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class avas extends aaab {

    /* renamed from: k */
    private static final bnsn f92861k = avex.m78396b();

    /* renamed from: a */
    protected final wfs f92862a;

    /* renamed from: b */
    protected final ClientContext f92863b;

    /* renamed from: c */
    protected final avgm f92864c;

    /* renamed from: d */
    protected final bbjm f92865d;

    /* renamed from: e */
    protected final Executor f92866e;

    /* renamed from: f */
    protected final FacsCacheCallOptions f92867f;

    /* renamed from: g */
    protected final aveu f92868g;

    /* renamed from: h */
    protected final bdro f92869h;

    /* renamed from: i */
    protected final wfh f92870i;

    /* renamed from: j */
    protected final int f92871j;

    public avas(String str, wfs wfs, ClientContext clientContext, avgm avgm, bbjm bbjm, Executor executor, FacsCacheCallOptions facsCacheCallOptions, aveu aveu, bdro bdro, int i, wfh wfh) {
        super(202, str);
        this.f92862a = wfs;
        this.f92863b = clientContext;
        this.f92864c = avgm;
        this.f92865d = bbjm;
        this.f92866e = executor;
        this.f92867f = facsCacheCallOptions;
        this.f92868g = aveu;
        this.f92869h = bdro;
        this.f92871j = i;
        this.f92870i = wfh;
    }

    /* renamed from: a */
    static final Object m78148a(aucb aucb) {
        try {
            return aucu.m76782a(aucb);
        } catch (InterruptedException e) {
            throw new aaaj(14, "Upload thread interrupted!", null, e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof rjp) {
                throw new aaaj(((rjp) cause).mo24655a(), "Internal sync API failure!", null, cause);
            }
            bmzo.m108686a(cause);
            throw new IllegalStateException(cause);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo51125b() {
        String str = this.f92863b.f30215e;
        String str2 = this.f92867f.f31268a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("#");
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo51126c() {
        return this.f92867f.f31269b;
    }

    /* renamed from: a */
    static final Object m78149a(bqgg bqgg) {
        try {
            return bqgg.get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw new IllegalStateException("ExecutionException without cause", e);
            }
            bmzo.m108687a(cause, gid.class);
            bmzo.m108687a(cause, chuw.class);
            bmzo.m108687a(cause, chux.class);
            bmzo.m108686a(cause);
            throw new IllegalStateException(cause);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bxpe mo51121a(avgl avgl) {
        bnsi d = f92861k.mo68390d();
        d.mo68432a("avas", "a", 120, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68424a("Operation '%s' performing sync (type: '%s')...", this.f27820m, avgl);
        try {
            return (bxpe) m78149a(this.f92865d.mo34085d(aval.SYNC_ID_CUSTOM_CACHE, this.f92863b.f30213c).mo34066a(new avar(this, avgl), 1, this.f92866e));
        } catch (gid e) {
            throw new aaaj(35001, "Auth error when downloading settings!", null, e);
        } catch (chuw | chux e2) {
            throw new aaaj(7, "Downloading settings failed!", null, e2);
        } catch (InterruptedException e3) {
            throw new aaaj(14, "Download thread interrupted!", null, e3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51122a() {
        if (this.f92863b.f30213c == null) {
            throw new aaaj(5, "Provided client context doesn't have a resolved account!");
        }
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
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51123a(int i, long j) {
        aveu aveu = this.f92868g;
        int i2 = this.f92871j;
        String b = mo51125b();
        long c = mo51126c();
        long longValue = ((Long) aveu.f93039c.mo6606a()).longValue();
        if (aveu.f93040d.mo35048a(longValue)) {
            qws qws = (qws) aveu.f93038b.mo6606a();
            bxvd da = bxpw.f164324h.mo74144da();
            int i3 = (int) longValue;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpw bxpw = (bxpw) da.f164949b;
            bxpw.f164326a |= 64;
            bxpw.f164329d = i3;
            bxvd da2 = bxot.f164207c.mo74144da();
            bxvd da3 = bxoq.f164193g.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bxoq bxoq = (bxoq) da3.f164949b;
            int i4 = bxoq.f164195a | 1;
            bxoq.f164195a = i4;
            bxoq.f164196b = i;
            bxoq.f164195a = i4 | 2;
            bxoq.f164197c = j;
            bxvd da4 = bxoo.f164182d.mo74144da();
            if (da4.f164950c) {
                da4.mo74035c();
                da4.f164950c = false;
            }
            bxoo bxoo = (bxoo) da4.f164949b;
            b.getClass();
            int i5 = bxoo.f164184a | 1;
            bxoo.f164184a = i5;
            bxoo.f164185b = b;
            bxoo.f164184a = i5 | 2;
            bxoo.f164186c = c;
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bxoq bxoq2 = (bxoq) da3.f164949b;
            bxoo bxoo2 = (bxoo) da4.mo74062i();
            bxoo2.getClass();
            bxoq2.f164198d = bxoo2;
            bxoq2.f164195a |= 4;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxot bxot = (bxot) da2.f164949b;
            bxoq bxoq3 = (bxoq) da3.mo74062i();
            bxoq3.getClass();
            bxot.f164210b = bxoq3;
            bxot.f164209a = 3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpw bxpw2 = (bxpw) da.f164949b;
            bxot bxot2 = (bxot) da2.mo74062i();
            bxot2.getClass();
            bxpw2.f164328c = bxot2;
            bxpw2.f164327b = 3;
            bxvd da5 = bxpp.f164297d.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bxpp bxpp = (bxpp) da5.f164949b;
            "com.google.android.gms#udc-facs".getClass();
            bxpp.f164299a |= 1;
            bxpp.f164300b = "com.google.android.gms#udc-facs";
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxpw bxpw3 = (bxpw) da.f164949b;
            bxpp bxpp2 = (bxpp) da5.mo74062i();
            bxpp2.getClass();
            bxpw3.f164330e = bxpp2;
            bxpw3.f164326a |= 128;
            qwo a = qws.mo24333a(da.mo74062i());
            int i6 = i2 - 1;
            if (i2 != 0) {
                a.mo24328b(i6);
                a.mo24327b();
            } else {
                throw null;
            }
        }
        if (i == Status.f30107a.f30115i) {
            bnsi d = f92861k.mo68390d();
            d.mo68432a("avas", "a", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68420a("Operation '%s' successful!", this.f27820m);
            return;
        }
        bnsi c2 = f92861k.mo68388c();
        c2.mo68432a("avas", "a", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c2.mo68422a("Operation '%s' failed with status '%d'!", (Object) this.f27820m, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51124a(String str) {
        if (bmyx.m108640a(',').mo66917a().mo66925c((CharSequence) str).contains(this.f92863b.f30215e)) {
            throw new aaaj(35000, "The calling package is blacklisted!");
        }
    }
}
