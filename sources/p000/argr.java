package p000;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: argr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class argr {

    /* renamed from: a */
    public static final Logger f87699a = ascp.m73787a("D2D", "TargetDirectTransferServiceController");

    /* renamed from: b */
    public argm f87700b;

    /* renamed from: c */
    private final arai f87701c;

    /* renamed from: a */
    static void m72739a(aney aney) {
        aucb a = aney.mo41758a("com.google.android.gms.smartdevice", 201515033, new String[]{"SMART_DEVICE"}, null, "");
        a.mo50372a(new argp());
        a.mo50373a(new argo());
        try {
            aucu.m76783a(a, cgqs.m146604j(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            f87699a.mo25415d("Failed to sync Phenotype flags.", e, new Object[0]);
        } catch (TimeoutException e2) {
            f87699a.mo25415d("Syncing Phenotype flags times out.", e2, new Object[0]);
        }
        a.mo50384b();
    }

    public argr(arai arai) {
        this.f87701c = arai;
    }

    /* renamed from: a */
    public final synchronized void mo48524a(argq argq) {
        argm argm = this.f87700b;
        if (argm == null) {
            f87699a.mo25418e("Bootstrap cannot be aborted -- no bootstrap in progress.", new Object[0]);
            argq.mo48523b(new Status(10565));
            return;
        }
        argm.mo48519f();
        this.f87700b = null;
        argq.mo48523b(new Status(0));
    }

    /* renamed from: a */
    public final synchronized void mo48525a(argq argq, BootstrapOptions bootstrapOptions, ParcelFileDescriptor[] parcelFileDescriptorArr, aqzq aqzq) {
        asci asci = new asci(parcelFileDescriptorArr[0]);
        asck asck = new asck(parcelFileDescriptorArr[1]);
        ((armn) this.f87701c.f87199c).mo48667d(3);
        if (this.f87700b != null) {
            f87699a.mo25418e("Bootstrap cannot be started -- bootstrap already in progress.", new Object[0]);
            argq.mo48522a(new Status(10561));
            return;
        }
        if (cgqs.m146604j() > 0) {
            m72739a(anef.m64089a(this.f87701c.f87197a));
        }
        argm argm = new argm(this.f87701c, bootstrapOptions, asci, asck, new argn(this, aqzq));
        this.f87700b = argm;
        argm.mo48245a(new arhq(false, argm, 9), cgqs.f187523a.mo6606a().mo84336v());
        argm.f87681l.mo49040a(argm);
        argm.f87667h.logVerbose("startEncryptionNegotiation", new Object[0]);
        argq.mo48522a(new Status(0));
    }
}
