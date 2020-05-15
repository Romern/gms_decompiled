package p000;

import android.os.StrictMode;
import android.os.strictmode.CustomViolation;
import android.os.strictmode.DiskReadViolation;
import android.os.strictmode.DiskWriteViolation;
import android.os.strictmode.Violation;
import java.util.concurrent.Executor;

/* renamed from: bdot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdot implements bdkj {

    /* renamed from: a */
    private final bdkg f106162a;

    /* renamed from: b */
    private final cijl f106163b;

    /* renamed from: c */
    private final StrictMode.OnVmViolationListener f106164c = bdop.f106158a;

    /* renamed from: d */
    private final bdpz f106165d = bdpz.m91271a();

    public bdot(bdkh bdkh, cijl cijl, bdif bdif) {
        this.f106162a = bdkh.mo58105a((Executor) cijl.mo6445a(), this.f106165d);
        this.f106163b = cijl;
        bdif.mo58069b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo58246a(Violation violation) {
        if (!this.f106165d.mo58288b()) {
            bxvd da = cior.f191109c.mo74144da();
            if (violation instanceof DiskReadViolation) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cior cior = (cior) da.f164949b;
                cior.f191112b = 1;
                cior.f191111a |= 1;
            } else if (violation instanceof DiskWriteViolation) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cior cior2 = (cior) da.f164949b;
                cior2.f191112b = 2;
                cior2.f191111a |= 1;
            } else if (violation instanceof CustomViolation) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                cior cior3 = (cior) da.f164949b;
                cior3.f191112b = 3;
                cior3.f191111a |= 1;
            } else {
                return;
            }
            bxvd da2 = cios.f191113s.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            cios cios = (cios) da2.f164949b;
            cior cior4 = (cior) da.mo74062i();
            cior4.getClass();
            cios.f191132r = cior4;
            cios.f191115a |= 33554432;
            this.f106162a.mo58102a((cios) da2.mo74062i());
        }
    }

    /* renamed from: c */
    public void mo58086c() {
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyListener((Executor) this.f106163b.mo6445a(), this.f106164c).build());
        beel.m91852a(new bdoq(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo58247d() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyListener((Executor) this.f106163b.mo6445a(), new bdos(this)).build());
    }

    /* renamed from: b */
    public void mo58031b() {
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        beel.m91852a(bdor.f106160a);
    }
}
