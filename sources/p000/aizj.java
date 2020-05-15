package p000;

import android.content.Context;
import com.google.android.gms.audiomodem.TokenBroadcaster$Params;
import com.google.android.gms.audiomodem.TokenReceiver$Params;

/* renamed from: aizj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aizj {

    /* renamed from: a */
    public final String f70135a;

    /* renamed from: b */
    public int f70136b = 0;

    /* renamed from: c */
    public int f70137c = 0;

    /* renamed from: d */
    public final boolean f70138d;

    /* renamed from: e */
    public final buqh f70139e;

    /* renamed from: f */
    public TokenReceiver$Params f70140f;

    /* renamed from: g */
    public TokenBroadcaster$Params f70141g;

    /* renamed from: h */
    public aizl f70142h;

    /* renamed from: i */
    private final ger f70143i = new aizh(this);

    /* renamed from: j */
    private final geh f70144j = new aizi();

    /* renamed from: k */
    private final aizp f70145k;

    /* renamed from: l */
    private final aizr f70146l;

    /* renamed from: m */
    private final aizq f70147m;

    public aizj(Context context, boolean z, String str) {
        this.f70139e = (buqh) ahgz.m55754a(context, buqh.class);
        aizf aizf = new aizf(context);
        this.f70138d = z;
        this.f70135a = str;
        this.f70145k = new aizp(context, aizf, this.f70143i, this.f70144j);
        this.f70147m = new aizq(aizf, this.f70144j);
        this.f70146l = new aizr(aizf, this.f70143i);
    }

    /* renamed from: a */
    private final void m58278a() {
        if (this.f70138d) {
            aizp aizp = this.f70145k;
            if (aizp.f70173g) {
                aizp.f70173g = false;
                aizp.mo38339b();
                aizp.mo38335a();
                synchronized (aizp) {
                    aizp.f70167a.mo72989e(aizp.f70174h);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo38330a(int i) {
        srn srn = ahfq.f67120a;
        if (i == 0) {
            m58278a();
            this.f70147m.mo38340a();
            this.f70146l.mo38341a();
        } else if (i == 1) {
            this.f70146l.mo38342b();
            this.f70147m.mo38340a();
            aizp aizp = this.f70145k;
            TokenReceiver$Params tokenReceiver$Params = this.f70140f;
            TokenBroadcaster$Params tokenBroadcaster$Params = this.f70141g;
            aizp.f70170d = tokenReceiver$Params;
            aizp.f70169c = tokenBroadcaster$Params;
            if (!aizp.f70173g) {
                aizp.f70173g = true;
                aizp.mo38336a(1);
            }
        } else if (i != 2) {
            m58278a();
            this.f70147m.mo38340a();
            aizr aizr = this.f70146l;
            TokenReceiver$Params tokenReceiver$Params2 = this.f70140f;
            int i2 = this.f70136b;
            aizr.f70182c = tokenReceiver$Params2;
            aizr.f70180a = i2;
            aizr.f70183d.mo38328a(aizr.f70181b, aizr.f70182c, false, -1, null);
        } else {
            m58278a();
            this.f70146l.mo38341a();
            aizq aizq = this.f70147m;
            aizq.f70179c.mo38326a(aizq.f70177a, this.f70141g);
            aizq.f70178b = true;
        }
    }
}
