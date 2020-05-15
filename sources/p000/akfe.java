package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: akfe */
final /* synthetic */ class akfe implements Runnable {

    /* renamed from: a */
    private final akgy f71780a;

    /* renamed from: b */
    private final akbw f71781b;

    /* renamed from: c */
    private final String f71782c;

    /* renamed from: d */
    private final ajud f71783d;

    public akfe(akgy akgy, akbw akbw, String str, ajud ajud) {
        this.f71780a = akgy;
        this.f71781b = akbw;
        this.f71782c = str;
        this.f71783d = ajud;
    }

    public final void run() {
        int i;
        String str;
        akgy akgy = this.f71780a;
        akbw akbw = this.f71781b;
        String str2 = this.f71782c;
        ajud ajud = this.f71783d;
        akcc akcc = akbw.f71567a;
        int i2 = akbw.f71568b;
        akgy.f71952s = (long) ajvg.m59094a();
        akgy.f71940g.mo39299d();
        int a = akgy.f71940g.mo39278a(akgy.mo39405e(str2), akgy, akbw);
        int i3 = 3;
        if (a == 0) {
            akgy.f71942i = ajud;
            akgy.f71943j = akcc;
            bnsl bnsl = (bnsl) ajvp.f71371a.mo68390d();
            bnsl.mo68432a("akgy", "a", 473, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            int i4 = akgy.f71927A;
            String str3 = "UNKNOWN";
            if (i4 != 0) {
                str = i4 != 1 ? i4 != 2 ? str3 : "SELECTED_CONTACTS" : "ALL_CONTACTS";
            } else {
                str = "NO_ONE";
            }
            if (i2 == 1) {
                str3 = "OFFLINE";
            } else if (i2 == 2) {
                str3 = "ONLINE";
            } else if (i2 == 3) {
                str3 = "WIFI_ONLY";
            }
            bnsl.mo68425a("Successfully started advertising over Nearby Connections: %s, %s, %s", akcc, str, str3);
            i = 2;
        } else {
            bnsl bnsl2 = (bnsl) ajvp.f71371a.mo68388c();
            bnsl2.mo68432a("akgy", "a", 478, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Failed to advertise over Nearby Connections: %s", ahih.m55828a(a));
            i = 3;
        }
        if (akcc.HIGH_POWER.equals(akcc) || akcc.MEDIUM_POWER.equals(akcc)) {
            akgy.mo38796g();
        }
        if (str2 == null) {
            int i5 = akgy.f71927A;
            i3 = i5 != 1 ? i5 != 2 ? 1 : 4 : 2;
        }
        akgy.f71948o.f71351b = ajvg.m59094a();
        ajvg ajvg = akgy.f71948o;
        long j = akgy.f71952s;
        bxvd d = ajvh.m59107d(8);
        bxvd da = bvfd.f155845e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvfd bvfd = (bvfd) da.f164949b;
        int i6 = 1 | bvfd.f155847a;
        bvfd.f155847a = i6;
        bvfd.f155848b = j;
        bvfd.f155849c = i3 - 1;
        int i7 = i6 | 2;
        bvfd.f155847a = i7;
        bvfd.f155850d = i - 1;
        bvfd.f155847a = i7 | 4;
        bvfd bvfd2 = (bvfd) da.mo74062i();
        if (d.f164950c) {
            d.mo74035c();
            d.f164950c = false;
        }
        bvgd bvgd = (bvgd) d.f164949b;
        bvgd bvgd2 = bvgd.f155960B;
        bvfd2.getClass();
        bvgd.f155972i = bvfd2;
        bvgd.f155964a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        ajvg.mo38956a(new ajuz((bvgd) d.mo74062i()));
    }
}
