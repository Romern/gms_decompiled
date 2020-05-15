package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.api.Status;

/* renamed from: aopc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aopc extends aaab {

    /* renamed from: a */
    private final rnt f78633a;

    /* renamed from: b */
    private final String f78634b;

    /* renamed from: c */
    private final boolean f78635c;

    /* renamed from: d */
    private final String f78636d;

    /* renamed from: e */
    private final String f78637e;

    public aopc(rnt rnt, String str, boolean z, String str2, String str3) {
        super(189, "RcsBindingRequestOperation");
        this.f78633a = rnt;
        this.f78634b = str;
        this.f78635c = z;
        this.f78636d = str2;
        this.f78637e = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        String str;
        rnt rnt = this.f78633a;
        aoov a = aoov.m66238a();
        String str2 = this.f78634b;
        boolean z = this.f78635c;
        String str3 = this.f78636d;
        String str4 = this.f78637e;
        Status a2 = a.mo43134a(str2, z, str3, str4);
        aopb aopb = a.f78620b;
        try {
            str = rpr.m34216b().getPackageManager().getPackageInfo(str2, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            str = null;
        }
        int i = a2.f30115i;
        bxvd da = byby.f165608c.mo74144da();
        bxvd da2 = bybz.f165612h.mo74144da();
        String a3 = stm.m36299a(str2);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bybz bybz = (bybz) da2.f164949b;
        a3.getClass();
        bybz.f165614a |= 1;
        bybz.f165615b = a3;
        String a4 = stm.m36299a(str);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bybz bybz2 = (bybz) da2.f164949b;
        a4.getClass();
        bybz2.f165614a |= 2;
        bybz2.f165616c = a4;
        String a5 = stm.m36299a(str3);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bybz bybz3 = (bybz) da2.f164949b;
        a5.getClass();
        int i2 = bybz3.f165614a | 4;
        bybz3.f165614a = i2;
        bybz3.f165617d = a5;
        int i3 = i2 | 8;
        bybz3.f165614a = i3;
        bybz3.f165618e = z;
        int i4 = i3 | 16;
        bybz3.f165614a = i4;
        bybz3.f165619f = i;
        str4.getClass();
        bybz3.f165614a = i4 | 32;
        bybz3.f165620g = str4;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byby byby = (byby) da.f164949b;
        bybz bybz4 = (bybz) da2.mo74062i();
        bybz4.getClass();
        byby.f165611b = bybz4;
        byby.f165610a = 1;
        aopb.mo43143a((byby) da.mo74062i());
        rnt.mo11797a(a2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f78633a.mo11797a(status);
    }
}
