package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: armp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class armp {

    /* renamed from: a */
    private final List f87926a = new ArrayList(0);

    /* renamed from: b */
    private final bxvd f87927b;

    public armp(bxvd bxvd) {
        bmxy.m108581a(bxvd);
        this.f87927b = bxvd;
    }

    /* renamed from: a */
    public final boul mo48672a() {
        bxvd bxvd = this.f87927b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boul boul = boul.f134940e;
        ((boul) bxvd.f164949b).f134945d = GeneratedMessageLite.m124028dc();
        List list = this.f87926a;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boul boul2 = (boul) bxvd.f164949b;
        if (!boul2.f134945d.mo73666a()) {
            boul2.f134945d = GeneratedMessageLite.m124019a(boul2.f134945d);
        }
        bxsy.m123078a(list, boul2.f134945d);
        return (boul) this.f87927b.mo74062i();
    }

    /* renamed from: a */
    public final void mo48673a(int i) {
        this.f87926a.add(Integer.valueOf(i));
        bxvd bxvd = this.f87927b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boul boul = (boul) bxvd.f164949b;
        boul boul2 = boul.f134940e;
        boul.f134942a |= 2;
        boul.f134944c = i;
    }

    /* renamed from: a */
    public final void mo48674a(boolean z) {
        bxvd bxvd = this.f87927b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        boul boul = (boul) bxvd.f164949b;
        boul boul2 = boul.f134940e;
        boul.f134942a |= 1;
        boul.f134943b = z;
    }
}
