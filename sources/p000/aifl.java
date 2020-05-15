package p000;

import android.content.Context;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

/* renamed from: aifl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aifl extends ahie {

    /* renamed from: b */
    public static final /* synthetic */ int f68872b = 0;

    /* renamed from: c */
    private static final rjo f68873c = new rjo("Nearby.CONNECTIONS_API", f68875e, f68874d);

    /* renamed from: d */
    private static final rje f68874d = new rje();

    /* renamed from: e */
    private static final rjl f68875e = new aifa();

    /* renamed from: a */
    public final aidf f68876a;

    public aifl(Context context, ahig ahig) {
        super(context, f68873c, ahig, rjw.f43159a);
        this.f68876a = aidf.m57030a(this, ahig);
    }

    /* renamed from: a */
    private final aucb m57120a(aifk aifk) {
        return mo24732b(new aiez(aifk));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aidf.a(rjx, java.lang.String):aucb
     arg types: [aifl, java.lang.String]
     candidates:
      aidf.a(rjx, rjk):aidf
      aidf.a(rjx, rob):aucb
      aidf.a(java.lang.Object, java.lang.String):rob
      aidf.a(java.lang.String, java.lang.String):rob
      aidf.a(rjx, java.lang.String):aucb */
    /* renamed from: b */
    public final void mo36527b() {
        this.f68876a.mo37435a((rjx) this, "discovery").mo50373a(new aiep());
    }

    /* renamed from: c */
    public final void mo36528c() {
        mo36524a();
        mo36527b();
        m57120a(aiek.f68837a).mo50371a(new aiel(this));
    }

    /* renamed from: n */
    public final void mo36529n(String str) {
        m57120a((aifk) new aiej(str));
        mo37462p(str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aidf.a(rjx, java.lang.String, java.lang.String):rod
     arg types: [aifl, java.lang.String, java.lang.String]
     candidates:
      aidf.a(rjx, roh, rpf):aucb
      aidf.a(rjx, java.lang.Object, java.lang.String):rod
      aidf.a(rjx, java.lang.String, java.lang.String):rod */
    /* renamed from: o */
    public final void mo37461o(String str) {
        rod a = this.f68876a.mo37441a((rjx) this, str, "connection");
        rob rob = a.f43429b;
        sdo.checkIfNull(rob, "Key must not be null");
        this.f68876a.mo37437a(this, new aiew(a), new aiex(rob));
    }

    /* renamed from: p */
    public final void mo37462p(String str) {
        aidf aidf = this.f68876a;
        aidf.mo37436a(this, aidf.mo37439a(str, "connection"));
    }

    /* renamed from: a */
    public final aucb mo37460a(aifh aifh) {
        return mo24732b(new aiey(aifh));
    }

    /* renamed from: a */
    public final aucb mo36519a(String str) {
        return mo37460a((aifh) new aies(str));
    }

    /* renamed from: a */
    public final aucb mo36520a(String str, ahin ahin, DiscoveryOptions discoveryOptions) {
        rod a = this.f68876a.mo37440a(this, ahin, "discovery");
        rob rob = a.f43429b;
        sdo.checkIfNull(rob, "Key must not be null");
        aucb a2 = this.f68876a.mo37437a(this, new aifg(a, str, a, discoveryOptions), new aieu(rob));
        a2.mo50373a(new aieo());
        return a2;
    }

    /* renamed from: a */
    public final aucb mo36521a(String str, ahir ahir) {
        rod a = mo24714a(ahir, ahir.class.getName());
        roz b = rpa.m34196b();
        b.f43472a = new aier(str, a);
        return mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final aucb mo36522a(String str, String str2, ahia ahia) {
        rod a = mo24714a(new aifi(this, ahia), ahia.class.getName());
        mo37461o(str2);
        roz b = rpa.m34196b();
        b.f43472a = new aieq(str, str2, a);
        aucb b2 = mo24732b(b.mo24977a());
        b2.mo50372a(new aiev(this, str2));
        return b2;
    }

    /* renamed from: a */
    public final aucb mo36523a(String str, String str2, ahia ahia, AdvertisingOptions advertisingOptions) {
        rod a = mo24714a(new aifi(this, ahia), ahia.class.getName());
        rod a2 = this.f68876a.mo37440a(this, new Object(), "advertising");
        rob rob = a2.f43429b;
        sdo.checkIfNull(rob, "Key must not be null");
        return this.f68876a.mo37437a(this, new aife(a2, str, str2, a, advertisingOptions), new aiff(rob));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aidf.a(rjx, java.lang.String):aucb
     arg types: [aifl, java.lang.String]
     candidates:
      aidf.a(rjx, rjk):aidf
      aidf.a(rjx, rob):aucb
      aidf.a(java.lang.Object, java.lang.String):rob
      aidf.a(java.lang.String, java.lang.String):rob
      aidf.a(rjx, java.lang.String):aucb */
    /* renamed from: a */
    public final void mo36524a() {
        this.f68876a.mo37435a((rjx) this, "advertising");
    }

    /* renamed from: a */
    public final void mo36525a(long j) {
        mo37460a((aifh) new aiei(j));
    }

    /* renamed from: a */
    public final void mo36526a(String str, ahiq ahiq) {
        roz b = rpa.m34196b();
        b.f43472a = new aiet(str, ahiq);
        mo24732b(b.mo24977a());
    }
}
