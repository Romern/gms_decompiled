package p000;

import android.content.Context;
import com.google.android.gms.audit.LogAuditRecordsRequest;
import java.util.Arrays;
import java.util.List;

/* renamed from: ggi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ggi {

    /* renamed from: a */
    private final qws f18132a;

    /* renamed from: b */
    private final boolean f18133b = cbws.f178484a.mo6606a().mo75557e();

    /* renamed from: c */
    private final boolean f18134c = cbws.f178484a.mo6606a().mo75553a();

    /* renamed from: d */
    private final boolean f18135d = cbws.f178484a.mo6606a().mo75558f();

    /* renamed from: e */
    private final boolean f18136e = cbws.f178484a.mo6606a().mo75556d();

    public ggi(Context context) {
        this.f18132a = qws.m33019a(context, "AUDIT");
    }

    /* renamed from: a */
    public final void mo11792a(int i) {
        if (this.f18136e) {
            bxvd da = gha.f18210f.mo74144da();
            bxvd da2 = ghc.f18218c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ghc ghc = (ghc) da2.f164949b;
            ghc.f18221b = i - 1;
            ghc.f18220a |= 1;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            gha gha = (gha) da.f164949b;
            ghc ghc2 = (ghc) da2.mo74062i();
            ghc2.getClass();
            gha.f18216e = ghc2;
            gha.f18212a |= 8;
            this.f18132a.mo24333a((gha) da.mo74062i()).mo24327b();
        }
    }

    /* renamed from: a */
    public final void mo11793a(LogAuditRecordsRequest logAuditRecordsRequest, bssp bssp, long j, int i) {
        if (this.f18134c) {
            bxvd da = ghf.f18232h.mo74144da();
            int length = logAuditRecordsRequest.f9901d.length;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ghf ghf = (ghf) da.f164949b;
            int i2 = ghf.f18234a | 1;
            ghf.f18234a = i2;
            ghf.f18235b = length;
            int i3 = logAuditRecordsRequest.f9899b;
            int i4 = i2 | 2;
            ghf.f18234a = i4;
            ghf.f18236c = i3;
            String str = bssp.f146900f;
            str.getClass();
            int i5 = i4 | 4;
            ghf.f18234a = i5;
            ghf.f18237d = str;
            int i6 = bssp.f146899e;
            int i7 = i5 | 8;
            ghf.f18234a = i7;
            ghf.f18238e = i6;
            int i8 = i7 | 16;
            ghf.f18234a = i8;
            ghf.f18239f = j;
            ghf.f18234a = i8 | 32;
            ghf.f18240g = i;
            ghf ghf2 = (ghf) da.mo74062i();
            bxvd da2 = gha.f18210f.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            gha gha = (gha) da2.f164949b;
            ghf2.getClass();
            gha.f18214c = ghf2;
            gha.f18212a |= 2;
            this.f18132a.mo24333a((gha) da2.mo74062i()).mo24327b();
        }
    }

    /* renamed from: a */
    public final void mo11794a(ggr ggr) {
        if (this.f18133b) {
            bxvd da = gha.f18210f.mo74144da();
            bxvd da2 = ghe.f18229b.mo74144da();
            List asList = Arrays.asList(ggr.mo11807c());
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ghe ghe = (ghe) da2.f164949b;
            if (!ghe.f18231a.mo73666a()) {
                ghe.f18231a = GeneratedMessageLite.m124021a(ghe.f18231a);
            }
            bxsy.m123078a(asList, ghe.f18231a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            gha gha = (gha) da.f164949b;
            ghe ghe2 = (ghe) da2.mo74062i();
            ghe2.getClass();
            gha.f18213b = ghe2;
            gha.f18212a |= 1;
            this.f18132a.mo24333a((gha) da.mo74062i()).mo24327b();
        }
    }

    /* renamed from: a */
    public final void mo11795a(boolean z, boolean z2, boolean z3, bssn bssn) {
        bssp bssp;
        int i;
        int i2;
        if (this.f18135d) {
            bsst bsst = bssn.f146887d;
            if (bsst == null) {
                bsst = bsst.f146912c;
            }
            if (bsst.f146914a == 1) {
                bssp = (bssp) bsst.f146915b;
            } else {
                bssp = bssp.f146893l;
            }
            bxvd da = gha.f18210f.mo74144da();
            bxvd da2 = ghj.f18244h.mo74144da();
            int i3 = bssn.f146886c;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ghj ghj = (ghj) da2.f164949b;
            int i4 = ghj.f18246a | 32;
            ghj.f18246a = i4;
            ghj.f18252g = i3;
            String str = bssp.f146900f;
            str.getClass();
            int i5 = i4 | 8;
            ghj.f18246a = i5;
            ghj.f18250e = str;
            int i6 = bssp.f146899e;
            int i7 = i5 | 16;
            ghj.f18246a = i7;
            ghj.f18251f = i6;
            int i8 = 3;
            if (!z) {
                i = 3;
            } else {
                i = 2;
            }
            ghj.f18247b = i - 1;
            int i9 = i7 | 1;
            ghj.f18246a = i9;
            if (!z2) {
                i2 = 2;
            } else {
                i2 = 3;
            }
            ghj.f18248c = i2 - 1;
            int i10 = i9 | 2;
            ghj.f18246a = i10;
            if (!z3) {
                i8 = 2;
            }
            ghj.f18249d = i8 - 1;
            ghj.f18246a = i10 | 4;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            gha gha = (gha) da.f164949b;
            ghj ghj2 = (ghj) da2.mo74062i();
            ghj2.getClass();
            gha.f18215d = ghj2;
            gha.f18212a |= 4;
            this.f18132a.mo24333a((gha) da.mo74062i()).mo24327b();
        }
    }
}
