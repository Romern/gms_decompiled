package p000;

import java.nio.ByteBuffer;

/* renamed from: oki */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oki extends ojh {

    /* renamed from: a */
    public static final bnsn f37850a = odk.m28481a("CAR.GAL.WIFI_PROJ");

    /* renamed from: c */
    private static final int[] f37851c = new int[0];

    /* renamed from: b */
    public volatile boolean f37852b = false;

    /* renamed from: d */
    private final okh f37853d;

    public oki(okh okh, ojm ojm) {
        super(17, okh, ojm, 0);
        this.f37853d = okh;
    }

    /* renamed from: a */
    public final void mo22084a(int i) {
        this.f37852b = false;
    }

    /* renamed from: b */
    public final void mo22087b(int i) {
    }

    /* renamed from: c */
    public final void mo22246c() {
        if (!this.f37852b) {
            bnsi d = f37850a.mo68390d();
            d.mo68432a("oki", "c", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("sendWifiCredentialsRequest on closed channel");
            return;
        }
        mo22206a(32769, biws.f122120a);
    }

    /* renamed from: i */
    public final void mo22088i() {
        this.f37852b = true;
        super.mo22088i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22085a(int i, ByteBuffer byteBuffer) {
        if (i == 32770) {
            biwt biwt = (biwt) GeneratedMessageLite.m124013a(biwt.f122122e, byteBuffer, bxus.m123744c());
            if (biwt != null) {
                String a = okb.m28991a(biwt.f122126c);
                String a2 = okb.m28991a(biwt.f122124a);
                biww a3 = biww.m102916a(biwt.f122125b);
                if (a3 == null) {
                    a3 = biww.UNKNOWN_SECURITY_MODE;
                }
                int[] iArr = f37851c;
                if (ccst.f179870a.mo6606a().mo76739b() && biwt.f122127d.size() != 0) {
                    iArr = bqcn.m112584a(biwt.f122127d);
                }
                this.f37853d.mo21421a(a, a2, a3, iArr);
                return;
            }
            bnsi b = f37850a.mo68387b();
            b.mo68432a("oki", "a", 74, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            b.mo68405a("Wrong WifiCredentialsResponse message");
            return;
        }
        bnsi b2 = f37850a.mo68387b();
        b2.mo68432a("oki", "a", 77, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        b2.mo68409a("Wrong Wifi projection message type %d", i);
    }
}
