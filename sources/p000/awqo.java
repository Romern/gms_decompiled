package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.wallet.analytics.events.CreditCardEntryActivityClosedEvent;
import com.google.android.gms.wallet.analytics.events.DocumentUploadActivityClosedEvent;
import com.google.android.gms.wallet.analytics.events.WalletAnalyticsEvent;
import java.util.ArrayList;

/* renamed from: awqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awqo extends awqu {

    /* renamed from: a */
    public final ArrayList f94859a;

    /* renamed from: b */
    public final ArrayList f94860b;

    /* renamed from: c */
    public final ArrayList f94861c;

    /* renamed from: d */
    public final ArrayList f94862d;

    /* renamed from: e */
    public final ArrayList f94863e;

    /* renamed from: f */
    public final ArrayList f94864f;

    /* renamed from: g */
    public int f94865g;

    /* renamed from: h */
    public String f94866h;

    /* renamed from: i */
    public final bxvd f94867i;

    public awqo() {
        bxvd da = bphe.f137630n.mo74144da();
        this.f94867i = da;
        bpis bpis = bpis.FLOW_TYPE_BUYFLOW;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bphe bphe = (bphe) da.f164949b;
        bphe.f137638g = bpis.f137811u;
        bphe.f137632a |= 8;
        this.f94859a = new ArrayList();
        this.f94860b = new ArrayList();
        this.f94861c = new ArrayList();
        this.f94862d = new ArrayList();
        this.f94863e = new ArrayList();
        this.f94864f = new ArrayList();
    }

    /* renamed from: a */
    public final void mo52459a(Context context, WalletAnalyticsEvent walletAnalyticsEvent) {
        if (walletAnalyticsEvent instanceof awqn) {
            ((awqn) walletAnalyticsEvent).mo52465a(context, this, this.f94867i);
        }
    }

    /* renamed from: c */
    public final ArrayList mo52466c() {
        ArrayList c = super.mo52466c();
        int i = this.f94865g;
        String str = this.f94866h;
        Object obj = null;
        if (i > 0 && !TextUtils.isEmpty(str)) {
            int i2 = 1;
            if (i == 1) {
                int a = bphz.m111946a(((bphe) this.f94867i.f164949b).f137633b);
                if (a != 0) {
                    i2 = a;
                }
                obj = new CreditCardEntryActivityClosedEvent(i2, str);
            } else if (i == 2) {
                int a2 = bphz.m111946a(((bphe) this.f94867i.f164949b).f137633b);
                if (a2 != 0) {
                    i2 = a2;
                }
                obj = new DocumentUploadActivityClosedEvent(i2, str);
            }
        }
        if (obj != null) {
            c.add(obj);
        }
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52460a(bjwa bjwa) {
        super.mo52460a(bjwa);
        bjwa.mo65581a(this.f94867i.mo74062i());
        bjwa.f123455a.add(Integer.toString(this.f94865g));
        bjwa.mo65582a(this.f94866h);
        ArrayList arrayList = this.f94859a;
        bjwa.mo65583a((bphh[]) arrayList.toArray(new bphh[arrayList.size()]));
        ArrayList arrayList2 = this.f94860b;
        bjwa.mo65583a((bpjc[]) arrayList2.toArray(new bpjc[arrayList2.size()]));
        ArrayList arrayList3 = this.f94861c;
        bjwa.mo65583a((bpjz[]) arrayList3.toArray(new bpjz[arrayList3.size()]));
        ArrayList arrayList4 = this.f94862d;
        bjwa.mo65583a((bpiz[]) arrayList4.toArray(new bpiz[arrayList4.size()]));
        ArrayList arrayList5 = this.f94863e;
        bjwa.mo65583a((bpit[]) arrayList5.toArray(new bpit[arrayList5.size()]));
        ArrayList arrayList6 = this.f94864f;
        bjwa.mo65583a((bpio[]) arrayList6.toArray(new bpio[arrayList6.size()]));
    }

    public awqo(bjvz bjvz) {
        super(bjvz);
        int i;
        bphe bphe = (bphe) bjvz.mo65576a((bxxk) bphe.f137630n.mo74142c(7), bphe.f137630n);
        bxvd bxvd = (bxvd) bphe.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bphe);
        this.f94867i = bxvd;
        String a = bjvz.mo65577a();
        if (a != null) {
            try {
                i = Integer.parseInt(a);
            } catch (Throwable th) {
                Log.w("StringSerializer", "Unable to parse int");
                i = 0;
            }
        } else {
            i = 0;
        }
        this.f94865g = i;
        this.f94866h = bjvz.mo65579b();
        this.f94859a = sqc.m35955a((bphh[]) bjvz.mo65578a((bxxk) bphh.f137646f.mo74142c(7), new bphh[0]));
        this.f94860b = sqc.m35955a((bpjc[]) bjvz.mo65578a((bxxk) bpjc.f137833e.mo74142c(7), new bpjc[0]));
        this.f94861c = sqc.m35955a((bpjz[]) bjvz.mo65578a((bxxk) bpjz.f137929d.mo74142c(7), new bpjz[0]));
        this.f94862d = sqc.m35955a((bpiz[]) bjvz.mo65578a((bxxk) bpiz.f137826e.mo74142c(7), new bpiz[0]));
        this.f94863e = sqc.m35955a((bpit[]) bjvz.mo65578a((bxxk) bpit.f137812e.mo74142c(7), new bpit[0]));
        this.f94864f = sqc.m35955a((bpio[]) bjvz.mo65578a((bxxk) bpio.f137781f.mo74142c(7), new bpio[0]));
    }

    /* renamed from: a */
    public final void mo52461a(bxvd bxvd) {
        bxvd bxvd2 = this.f94867i;
        ArrayList arrayList = this.f94859a;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bphe bphe = (bphe) bxvd2.f164949b;
        bphe bphe2 = bphe.f137630n;
        if (!bphe.f137635d.mo73666a()) {
            bphe.f137635d = GeneratedMessageLite.m124021a(bphe.f137635d);
        }
        bxsy.m123078a(arrayList, bphe.f137635d);
        bxvd bxvd3 = this.f94867i;
        ArrayList arrayList2 = this.f94860b;
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bphe bphe3 = (bphe) bxvd3.f164949b;
        if (!bphe3.f137643l.mo73666a()) {
            bphe3.f137643l = GeneratedMessageLite.m124021a(bphe3.f137643l);
        }
        bxsy.m123078a(arrayList2, bphe3.f137643l);
        bxvd bxvd4 = this.f94867i;
        ArrayList arrayList3 = this.f94861c;
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        bphe bphe4 = (bphe) bxvd4.f164949b;
        if (!bphe4.f137636e.mo73666a()) {
            bphe4.f137636e = GeneratedMessageLite.m124021a(bphe4.f137636e);
        }
        bxsy.m123078a(arrayList3, bphe4.f137636e);
        bxvd bxvd5 = this.f94867i;
        ArrayList arrayList4 = this.f94862d;
        if (bxvd5.f164950c) {
            bxvd5.mo74035c();
            bxvd5.f164950c = false;
        }
        bphe bphe5 = (bphe) bxvd5.f164949b;
        if (!bphe5.f137642k.mo73666a()) {
            bphe5.f137642k = GeneratedMessageLite.m124021a(bphe5.f137642k);
        }
        bxsy.m123078a(arrayList4, bphe5.f137642k);
        bxvd bxvd6 = this.f94867i;
        ArrayList arrayList5 = this.f94864f;
        if (bxvd6.f164950c) {
            bxvd6.mo74035c();
            bxvd6.f164950c = false;
        }
        bphe bphe6 = (bphe) bxvd6.f164949b;
        if (!bphe6.f137644m.mo73666a()) {
            bphe6.f137644m = GeneratedMessageLite.m124021a(bphe6.f137644m);
        }
        bxsy.m123078a(arrayList5, bphe6.f137644m);
        bxvd bxvd7 = this.f94867i;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpik bpik = (bpik) bxvd.f164949b;
        bphe bphe7 = (bphe) bxvd7.mo74062i();
        bpik bpik2 = bpik.f137757s;
        bphe7.getClass();
        bpik.f137766h = bphe7;
        bpik.f137759a |= 64;
    }

    /* renamed from: a */
    public final boolean mo52462a() {
        int a = bphz.m111946a(((bphe) this.f94867i.f164949b).f137633b);
        return (a == 0 || a == 1) ? false : true;
    }
}
