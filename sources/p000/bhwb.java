package p000;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: bhwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhwb implements bhvs, bati {

    /* renamed from: a */
    public boolean f119723a = true;

    /* renamed from: b */
    private final basb f119724b;

    /* renamed from: c */
    private final batl f119725c;

    /* renamed from: d */
    private final bhuk f119726d;

    /* renamed from: e */
    private volatile boolean f119727e;

    /* renamed from: f */
    private bhss f119728f = null;

    public bhwb(baso baso, Executor executor, String str, bhuk bhuk) {
        this.f119726d = bhuk;
        this.f119724b = baso.mo55937a(new Account(str, "com.google"), 333, 108026902, bxlu.f163893e);
        this.f119725c = new batl(this, this.f119724b, "MdhBroadcastPersonalPlaceInfoSource", executor);
    }

    /* renamed from: a */
    public final void mo64343a() {
        batl batl = this.f119725c;
        basb basb = batl.f101705b;
        String str = batl.f101707d;
        synchronized (((bass) basb).f101675e) {
            batd a = ((bass) basb).mo55939a(str);
            if (((bass) basb).f101675e.containsKey(a)) {
                ((bass) basb).f101672b.unregisterReceiver((BroadcastReceiver) ((bass) basb).f101675e.get(a));
                ((bass) basb).f101675e.remove(a);
            }
            batc batc = ((bass) basb).f101673c;
            batd a2 = ((bass) basb).mo55939a(str);
            synchronized (((basl) batc).f101661b) {
                ((basl) batc).f101661b.remove(a2);
                Executor executor = ((basl) batc).f101660a;
                afln afln = ((basl) batc).f101662c;
                MdhBroadcastListenerKey a3 = basi.m87489a(a2);
                afno afno = afln.f64328a;
                roz b = rpa.m34196b();
                b.f43472a = new aflk(a3);
                b.f43473b = new Feature[]{abpq.f57885c};
                basw.m87505a(executor, afno.mo24701a(b.mo24977a()));
            }
        }
        this.f119728f = null;
        this.f119727e = false;
    }

    /* renamed from: a */
    public final void mo64344a(bhss bhss) {
        bqgg a;
        if (!this.f119727e) {
            this.f119728f = bhss;
            this.f119723a = true;
            if (!cgfx.f186796a.mo6606a().mo83667f()) {
                this.f119724b.mo55929a(azzs.f100343i, basa.f101652c);
            } else {
                basb basb = this.f119724b;
                azzr i = azzs.m86408i();
                azzu c = azzv.m86422c();
                c.mo55526a((int) cgfx.f186796a.mo6606a().mo83665d(), TimeUnit.SECONDS);
                i.mo55520a(c.mo55525a());
                i.mo55521a(Integer.valueOf((int) cgfx.f186796a.mo6606a().mo83664c()));
                i.mo55522a(!cgfx.f186796a.mo6606a().mo83662a());
                i.mo55524b(!cgfx.f186796a.mo6606a().mo83663b());
                basb.mo55929a(i.mo55519a(), basa.f101652c);
            }
            this.f119727e = true;
            batl batl = this.f119725c;
            basb basb2 = batl.f101705b;
            basa basa = batl.f101706c;
            String str = batl.f101707d;
            synchronized (((bass) basb2).f101675e) {
                batd a2 = ((bass) basb2).mo55939a(str);
                if (((bass) basb2).f101675e.containsKey(a2)) {
                    ((bass) basb2).f101672b.unregisterReceiver((BroadcastReceiver) ((bass) basb2).f101675e.get(a2));
                    ((bass) basb2).f101675e.remove(a2);
                }
                bate bate = new bate();
                bate.f101694a = basa;
                batb batb = new batb(bate.f101694a);
                bath bath = new bath(((bass) basb2).f101673c, batl, a2, batb, ((bass) basb2).f101671a);
                ((bass) basb2).f101672b.registerReceiver(bath, bath.f101697b);
                ((bass) basb2).f101675e.put(a2, bath);
                batc batc = ((bass) basb2).f101673c;
                synchronized (((basl) batc).f101661b) {
                    ((basl) batc).f101661b.add(a2);
                    a = ((basl) batc).mo55936a(a2, batb);
                }
            }
            bqga.m112781a(a, new batj(batl), batl.f101708e);
        }
    }

    /* renamed from: a */
    public final void mo64350a(bxlu bxlu, int i, int i2) {
        bhss bhss = this.f119728f;
        if (bhss != null) {
            bxwc bxwc = bxlu.f163896b;
            bvoa[] bvoaArr = (bvoa[]) bxwc.toArray(new bvoa[bxwc.size()]);
            bxwc bxwc2 = bxlu.f163895a;
            bvnw[] bvnwArr = (bvnw[]) bxwc2.toArray(new bvnw[bxwc2.size()]);
            bhuj.m101555a();
            int length = bvnwArr.length;
            StringBuilder sb = new StringBuilder(45);
            sb.append("Got ");
            sb.append(length);
            sb.append(" personalized places from MDH.");
            sb.toString();
            mo64352a(bvnwArr, bvoaArr, i, i2, this.f119723a, 1);
            this.f119723a = false;
            bhss.mo64224a(bvnwArr, bvoaArr);
            return;
        }
        bhuj.m101555a().mo64360b("Got ContextData but callback null");
    }

    /* renamed from: a */
    public final void mo55951a(Throwable th) {
        mo64343a();
        bhuj.m101555a().mo64359a("Failure registering MDH broadcast listener.", th);
        mo64351a(this.f119723a);
    }

    /* renamed from: a */
    public final void mo64351a(boolean z) {
        this.f119726d.mo64319a(0, 0, 0, 0, 0, z, 3, 2);
    }

    /* renamed from: a */
    public final void mo64352a(bvnw[] bvnwArr, bvoa[] bvoaArr, int i, int i2, boolean z, int i3) {
        int seconds;
        bvnw[] bvnwArr2 = bvnwArr;
        int i4 = 0;
        for (bvnw bvnw : bvnwArr2) {
            bxwc bxwc = bvnw.f156976d;
            int size = bxwc.size();
            for (int i5 = 0; i5 < size; i5++) {
                bvnn bvnn = (bvnn) bxwc.get(i5);
                if (bvnn.f156952d.size() > 0 && (seconds = (int) TimeUnit.MICROSECONDS.toSeconds(bvnn.f156952d.mo74160a(0))) > i4) {
                    i4 = seconds;
                }
            }
        }
        this.f119726d.mo64319a(bvnwArr2.length, bvoaArr.length, i2, i, i4, z, i3, 2);
    }
}
