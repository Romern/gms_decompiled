package p000;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.beacon.BleSettings;
import com.google.android.gms.beacon.BleSighting;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bigi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bigi {

    /* renamed from: a */
    public static final long f120507a;

    /* renamed from: b */
    static final long f120508b;

    /* renamed from: c */
    public static final BleSettings f120509c;

    /* renamed from: d */
    public static final BleSettings f120510d;

    /* renamed from: o */
    private static final List f120511o;

    /* renamed from: e */
    public final Map f120512e;

    /* renamed from: f */
    public final rkb f120513f;

    /* renamed from: g */
    public final bify f120514g;

    /* renamed from: h */
    public final Handler f120515h;

    /* renamed from: i */
    final nej f120516i = new bige(this);

    /* renamed from: j */
    public final Runnable f120517j = new bigf(this);

    /* renamed from: k */
    public int f120518k = 0;

    /* renamed from: l */
    public boolean f120519l = false;

    /* renamed from: m */
    public final nfl f120520m;

    /* renamed from: n */
    public bigt f120521n;

    /* renamed from: p */
    private final nez f120522p;

    static {
        long a = cgfc.f186710a.mo6606a().mo83583a();
        f120507a = a;
        f120508b = (a * 9) / 10;
        nfa nfa = new nfa();
        nfa.mo20562g();
        f120511o = nfa.mo20561a();
        nem nem = new nem();
        nem.mo20537a(f120511o);
        nem.mo20534a(1);
        nem.mo20538b((int) cgfc.f186710a.mo6606a().mo83584b());
        nem.mo20535a(f120507a);
        nem.f35408a = 2;
        f120509c = nem.mo20533a();
        nem nem2 = new nem();
        nem2.mo20537a(f120511o);
        nem2.mo20534a(1);
        nem2.mo20538b(3);
        nem2.f35408a = 2;
        f120510d = nem2.mo20533a();
    }

    public bigi(rkb rkb, nfl nfl, Handler handler) {
        this.f120513f = rkb;
        this.f120520m = nfl;
        this.f120515h = handler;
        this.f120514g = new bify();
        this.f120522p = new nez();
        HashMap hashMap = new HashMap();
        this.f120512e = hashMap;
        hashMap.put(3, 2);
        if (cgfc.f186710a.mo6606a().mo83586d()) {
            this.f120512e.put(2, 1);
            this.f120512e.put(1, 1);
            return;
        }
        this.f120512e.put(2, 0);
        this.f120512e.put(1, 0);
    }

    /* renamed from: a */
    public static bigi m102351a(Context context, Handler handler) {
        rjy rjy = new rjy(context);
        rjy.mo24779a(nef.f35385a);
        return new bigi(rjy.mo24784b(), nef.f35386b, handler);
    }

    /* renamed from: a */
    public final bhtv mo64591a(BleSighting bleSighting) {
        ney a;
        nek nek = bleSighting.f29272b;
        if (nek == null || (a = this.f120522p.mo20560a(nek)) == null || !a.mo20557c()) {
            return null;
        }
        Integer a2 = a.mo20553a(bleSighting.f29274d);
        Integer b = a.mo20555b(nek);
        bhtt bhtt = new bhtt(a.mo20552a(), a.mo20554a(nek));
        if (bhtt.f119572b == null || bhtt.f119571a == 0) {
            return null;
        }
        return new bhtv(bhtt, a2, b, bleSighting.mo17302a());
    }

    /* renamed from: a */
    public final void mo64592a() {
        if (this.f120518k != 0) {
            if (Log.isLoggable("Places", 4)) {
                bioi.m102660b("Places", "PlacesBleScanner stop()");
            }
            this.f120513f.mo24801e();
            rkb rkb = this.f120513f;
            rkb.mo24790a((rjz) new bigh(this, rkb));
            this.f120518k = 0;
        }
    }

    /* renamed from: a */
    public final void mo64593a(List list) {
        bigt bigt = this.f120521n;
        if (bigt != null) {
            bhtu bhtu = new bhtu(list);
            bigx bigx = bigt.f120545a;
            bigx.f120567q++;
            if (bigx.m102369c()) {
                List list2 = bigx.f120555e;
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    ((bigv) list2.get(i)).mo64458a(bhtu);
                }
            }
        } else if (Log.isLoggable("Places", 6)) {
            bioi.m102658a("Places", "Missing BeaconScanCallback in PlacesBleScanner!");
        }
    }
}
