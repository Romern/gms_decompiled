package p000;

import android.net.Uri;
import android.telecom.DisconnectCause;
import android.telecom.GatewayInfo;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.car.CarCall;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: nla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nla {

    /* renamed from: a */
    public static final bnsn f35936a = odk.m28481a("CAR.TEL.CarCall");

    /* renamed from: c */
    private static nla f35937c;

    /* renamed from: b */
    public final ConcurrentHashMap f35938b = new ConcurrentHashMap();

    /* renamed from: d */
    private final AtomicInteger f35939d = new AtomicInteger();

    /* renamed from: a */
    public static nla m26709a() {
        if (ccto.f179903a.mo6606a().mo76765b()) {
            bnsi d = f35936a.mo68390d();
            d.mo68432a("nla", "a", 43, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("creating a non-static CarCallMapper");
            return new nla();
        }
        if (f35937c == null) {
            bnsi d2 = f35936a.mo68390d();
            d2.mo68432a("nla", "a", 47, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d2.mo68405a("creating CarCallMapper");
            f35937c = new nla();
        }
        return f35937c;
    }

    /* renamed from: b */
    public final List mo21025b() {
        bnsi d = f35936a.mo68390d();
        d.mo68432a("nla", "b", 148, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("clearCalls");
        ArrayList arrayList = new ArrayList(this.f35938b.values());
        this.f35938b.clear();
        return arrayList;
    }

    /* renamed from: b */
    public final void mo21026b(nid nid) {
        if (((CarCall) this.f35938b.get(nid)) != null) {
            this.f35938b.remove(nid);
            return;
        }
        bnsi c = f35936a.mo68388c();
        c.mo68432a("nla", "b", (int) MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68420a("Unable to remove CarCall for %s", nid);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final CarCall mo21022a(nid nid) {
        CharSequence charSequence;
        CarCall carCall;
        String str;
        Uri uri;
        Uri uri2;
        String str2;
        Uri uri3;
        Uri uri4;
        nid nid2 = nid;
        if (nid2 == null) {
            return null;
        }
        CarCall carCall2 = (CarCall) this.f35938b.get(nid2);
        if (carCall2 != null) {
            return carCall2;
        }
        int andIncrement = this.f35939d.getAndIncrement();
        DisconnectCause a = nid.mo20724a();
        if (a != null) {
            charSequence = a.getLabel();
        } else {
            charSequence = null;
        }
        GatewayInfo b = nid.mo20726b();
        if (!ccwj.m131930b()) {
            Uri c = nid.mo20728c();
            String e = nid.mo20730e();
            if (charSequence != null) {
                str2 = charSequence.toString();
            } else {
                str2 = null;
            }
            long d = nid.mo20729d();
            if (b != null) {
                uri3 = b.getOriginalAddress();
            } else {
                uri3 = null;
            }
            if (b != null) {
                uri4 = b.getGatewayAddress();
            } else {
                uri4 = null;
            }
            carCall = new CarCall(andIncrement, mo21022a(nid.mo20743p()), nid.mo20739l(), nid.mo20740m(), nid.mo20741n(), new CarCall.Details(c, e, str2, d, uri3, uri4, 0, null, 0, null, null, 0, null), nid.mo20742o(), null, null);
        } else {
            List a2 = mo21023a(nid.m26369a(nid2.f35688a.getChildren()));
            List a3 = mo21023a(nid.m26369a(nid2.f35688a.getConferenceableCalls()));
            Uri c2 = nid.mo20728c();
            String e2 = nid.mo20730e();
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            long d2 = nid.mo20729d();
            if (b != null) {
                uri = b.getOriginalAddress();
            } else {
                uri = null;
            }
            if (b != null) {
                uri2 = b.getGatewayAddress();
            } else {
                uri2 = null;
            }
            carCall = new CarCall(andIncrement, mo21022a(nid.mo20743p()), nid.mo20739l(), nid.mo20740m(), nid.mo20741n(), new CarCall.Details(c2, e2, str, d2, uri, uri2, nid.mo20732f(), nid.mo20733g(), nid.mo20734h(), nid.mo20736i(), nid.mo20737j(), nid.mo20738k(), nid.mo20726b()), nid.mo20742o(), a2, a3);
        }
        this.f35938b.putIfAbsent(nid2, carCall);
        return carCall;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo21023a(List list) {
        bngs j = bngx.m109377j();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j.mo67668c(mo21022a((nid) it.next()));
            }
        }
        return j.mo67664a();
    }

    /* renamed from: a */
    public final nid mo21024a(CarCall carCall) {
        if (carCall != null) {
            for (nid nid : this.f35938b.keySet()) {
                if (((CarCall) this.f35938b.get(nid)).equals(carCall)) {
                    return nid;
                }
            }
        }
        return null;
    }
}
