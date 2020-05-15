package p000;

import android.content.Context;
import java.security.SecureRandom;

/* renamed from: aijz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aijz extends airo {

    /* renamed from: a */
    public final Context f69004a;

    /* renamed from: b */
    public final String f69005b;

    /* renamed from: c */
    public final airj f69006c;

    /* renamed from: d */
    public int f69007d = 0;

    /* renamed from: e */
    public aiqp f69008e;

    /* renamed from: f */
    private final SecureRandom f69009f;

    /* renamed from: i */
    private final ahfk f69010i;

    public aijz(Context context, String str, airj airj, SecureRandom secureRandom, ahfk ahfk, int i) {
        super(37, ahfk);
        this.f69004a = context;
        this.f69005b = str;
        this.f69006c = airj;
        this.f69009f = secureRandom;
        this.f69010i = ahfk;
        if (aikx.m57354f()) {
            this.f69007d = i;
        }
    }

    /* renamed from: b */
    public final int mo37568b() {
        aijy aijy = new aijy(this);
        butj butj = new butj(cfnv.f184625a.mo6606a().mo81720F() + ((long) this.f69009f.nextInt((int) cfnv.f184625a.mo6606a().mo81719E())));
        butj.f154849a = this.f69010i.mo36402c();
        aiqp aiqp = (aiqp) butl.m120433a(aijy, "ConnectBleSocket", butj.mo73110a());
        this.f69008e = aiqp;
        if (aiqp != null) {
            return mo37899a(38);
        }
        return 3;
    }
}
