package p000;

import android.content.Context;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: ytn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ytn implements ytq {

    /* renamed from: a */
    private long f54595a = 0;

    /* renamed from: b */
    private int f54596b = -1;

    /* renamed from: c */
    private int f54597c = -1;

    /* renamed from: d */
    private String f54598d;

    /* renamed from: e */
    private bpfw f54599e;

    /* renamed from: f */
    private bpgw f54600f;

    /* renamed from: g */
    private bpgz f54601g;

    /* renamed from: h */
    private bpgs f54602h;

    /* renamed from: i */
    private bpgr f54603i;

    /* renamed from: j */
    private final qws f54604j;

    /* renamed from: k */
    private int f54605k;

    /* renamed from: l */
    private int f54606l;

    public ytn(Context context, qws qws) {
        sre.m36089i(context);
        this.f54604j = qws;
    }

    /* renamed from: a */
    public final void mo30754a() {
        boolean z;
        boolean z2;
        if (this.f54598d != null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108601b(z, "Must set the account");
        if (this.f54605k != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108601b(z2, "Must set an action");
        qws qws = this.f54604j;
        bxvd da = bphb.f137617k.mo74144da();
        int i = this.f54605k;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bphb bphb = (bphb) da.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            bphb.f137620b = i2;
            int i3 = bphb.f137619a | 1;
            bphb.f137619a = i3;
            long j = this.f54595a;
            if (j > 0) {
                i3 |= 32;
                bphb.f137619a = i3;
                bphb.f137623e = j;
            }
            int i4 = this.f54606l;
            if (i4 != 0) {
                bphb.f137622d = i4 - 1;
                bphb.f137619a = i3 | 16;
            }
            if (this.f54596b >= 0) {
                bxvd da2 = bpfv.f137445d.mo74144da();
                int i5 = this.f54596b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpfv bpfv = (bpfv) da2.f164949b;
                int i6 = 1 | bpfv.f137447a;
                bpfv.f137447a = i6;
                bpfv.f137448b = i5;
                int i7 = this.f54597c;
                if (i7 >= 0) {
                    bpfv.f137447a = i6 | 2;
                    bpfv.f137449c = i7;
                }
                bpfv bpfv2 = (bpfv) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bphb bphb2 = (bphb) da.f164949b;
                bpfv2.getClass();
                bphb2.f137621c = bpfv2;
                bphb2.f137619a |= 2;
            }
            bpfw bpfw = this.f54599e;
            if (bpfw != null) {
                bphb bphb3 = (bphb) da.f164949b;
                bpfw.getClass();
                bphb3.f137624f = bpfw;
                bphb3.f137619a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            bpgw bpgw = this.f54600f;
            if (bpgw != null) {
                bphb bphb4 = (bphb) da.f164949b;
                bpgw.getClass();
                bphb4.f137625g = bpgw;
                bphb4.f137619a |= 1024;
            }
            bpgz bpgz = this.f54601g;
            if (bpgz != null) {
                bphb bphb5 = (bphb) da.f164949b;
                bpgz.getClass();
                bphb5.f137626h = bpgz;
                bphb5.f137619a |= 2048;
            }
            bpgs bpgs = this.f54602h;
            if (bpgs != null) {
                bphb bphb6 = (bphb) da.f164949b;
                bpgs.getClass();
                bphb6.f137627i = bpgs;
                bphb6.f137619a |= 8192;
            }
            bpgr bpgr = this.f54603i;
            if (bpgr != null) {
                bphb bphb7 = (bphb) da.f164949b;
                bpgr.getClass();
                bphb7.f137628j = bpgr;
                bphb7.f137619a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            }
            qwo a = qws.mo24333a((bphb) da.mo74062i());
            a.mo24330c(this.f54598d);
            a.mo24328b(49);
            a.mo24327b();
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo30755a(int i) {
        this.f54605k = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo30756a(long j) {
        this.f54595a = j;
    }

    /* renamed from: a */
    public final void mo30757a(bpfw bpfw) {
        this.f54599e = bpfw;
    }

    /* renamed from: a */
    public final void mo30758a(bpgr bpgr) {
        this.f54603i = bpgr;
    }

    /* renamed from: a */
    public final void mo30759a(bpgs bpgs) {
        this.f54602h = bpgs;
    }

    /* renamed from: a */
    public final void mo30760a(bpgw bpgw) {
        this.f54600f = bpgw;
    }

    /* renamed from: a */
    public final void mo30761a(bpgz bpgz) {
        this.f54601g = bpgz;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo30762a(String str) {
        this.f54598d = str;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo30763b(int i) {
        this.f54596b = i;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo30764c(int i) {
        this.f54597c = i;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo30765d(int i) {
        this.f54606l = i;
    }
}
