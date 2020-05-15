package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: bety */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bety {

    /* renamed from: a */
    public final Map f112443a = new HashMap();

    /* renamed from: b */
    public String f112444b = null;

    /* renamed from: c */
    public long f112445c = -1;

    /* renamed from: d */
    final /* synthetic */ beua f112446d;

    public bety(beua beua) {
        this.f112446d = beua;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61144a(betv betv, long j) {
        String str = this.f112444b;
        if (str != null) {
            betw betw = (betw) this.f112443a.get(str);
            betw.f112441a += j - this.f112445c;
            betw.f112442b++;
        }
        if (!this.f112443a.containsKey(betv.mo61140b())) {
            this.f112443a.put(betv.mo61140b(), new betw());
        }
        this.f112444b = betv.mo61140b();
        this.f112445c = j;
    }
}
