package p000;

import java.util.HashMap;
import java.util.logging.Level;

/* renamed from: bknv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bknv implements bkoa {

    /* renamed from: a */
    public boolean f124963a;

    /* renamed from: b */
    public final bkov f124964b;

    /* renamed from: c */
    public final bkod f124965c;

    /* renamed from: d */
    public String f124966d;

    /* renamed from: e */
    public long f124967e;

    /* renamed from: f */
    public bkns f124968f;

    /* renamed from: g */
    public bkns f124969g;

    /* renamed from: h */
    public bkns f124970h;

    /* renamed from: i */
    public bkns f124971i;

    public bknv() {
    }

    /* renamed from: a */
    public final void mo66148a() {
        this.f124963a = true;
        this.f124964b.mo66176b();
    }

    /* renamed from: b */
    public final bkob mo66150b() {
        String str = this.f124966d;
        if (str != null) {
            return new bkob(str, this.f124967e);
        }
        return null;
    }

    public bknv(bkoj bkoj, bkob bkob, bkox bkox, boolean z) {
        String str;
        this.f124967e = -1;
        this.f124965c = new bkod();
        HashMap hashMap = new HashMap();
        hashMap.put("VER", "8");
        String str2 = "0";
        if (bkob != null) {
            this.f124966d = bkob.f124979a;
            this.f124967e = bkob.f124980b;
            hashMap.put("SID", this.f124966d);
            hashMap.put("AID", Long.toString(this.f124967e));
            hashMap.put("RID", "rpc");
        } else {
            hashMap.put("RID", str2);
        }
        hashMap.put("CI", !z ? "1" : str2);
        bkpb bkpb = bkob == null ? bkpb.f125049b : bkpb.GET;
        if (bkpb == bkpb.f125049b) {
            str = "";
        } else {
            str = null;
        }
        bkov a = bkox.mo66134a(bkpc.m106264a(bkoj, bkoj.f125009d.mo66162a(bkog.BIND), hashMap, bkpb, str));
        this.f124964b = a;
        a.mo66175a(new bknw(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Exception]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo66149a(bknz bknz) {
        bkpk bkpk;
        bkns bkns = this.f124970h;
        if (!bkns.f124950a.mo66147c()) {
            bknu.f124952a.logp(Level.WARNING, "com.google.apps.brix.api.client.net.browserchannel.BrowserChannel$EventListener", "onError", "Error in bind request.", (Throwable) bknz.f124975a);
            int i = bknz.f124978d;
            if (i == 1) {
                bkpk = bkpk.FAILURE;
            } else if (i == 3) {
                bkpk = bkpk.BACKOFF;
            } else {
                bkns.f124950a.mo66146b();
                bkns.f124950a.f124957f.mo66128a(bknz.f124978d, bknz.f124976b);
            }
            bknu bknu = bkns.f124950a;
            bknu.f124956e.mo28476a(bkpk, new bknq(bknu, bknz.f124977c));
            bkns.f124950a.f124957f.mo66128a(bknz.f124978d, bknz.f124976b);
        }
        mo66148a();
    }
}
