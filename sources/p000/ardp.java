package p000;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import java.util.List;

/* renamed from: ardp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ardp {

    /* renamed from: a */
    public static final Logger f87465a = ascp.m73787a("D2D", "SourceDirectTransferServiceController");

    /* renamed from: b */
    public ardn f87466b;

    /* renamed from: c */
    private final arai f87467c;

    public ardp(arai arai) {
        this.f87467c = arai;
    }

    /* renamed from: a */
    public final void mo48443a() {
        f87465a.logVerbose("cleanup()", new Object[0]);
        ardn ardn = this.f87466b;
        if (ardn != null) {
            ardn.mo48242a();
            this.f87466b = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo48444a(ardo ardo) {
        ardn ardn = this.f87466b;
        if (ardn == null) {
            f87465a.mo25418e("Bootstrap cannot be aborted -- no bootstrap in progress.", new Object[0]);
            ardo.mo48442b(new Status(10565));
            return;
        }
        ardn.mo48439g();
        mo48443a();
        ardo.mo48442b(new Status(0));
    }

    /* renamed from: a */
    public final synchronized void mo48445a(ardo ardo, BootstrapConfigurations bootstrapConfigurations, ParcelFileDescriptor[] parcelFileDescriptorArr, aqzq aqzq) {
        asci asci = new asci(parcelFileDescriptorArr[0]);
        asck asck = new asck(parcelFileDescriptorArr[1]);
        ((armh) this.f87467c.f87199c).mo48653f(3);
        if (this.f87466b != null) {
            f87465a.mo25418e("Bootstrap cannot be started -- bootstrap already in progress.", new Object[0]);
            ardo.mo48441a(new Status(10561));
            return;
        }
        ardn ardn = new ardn(this.f87467c, bootstrapConfigurations, asci, asck, aqzq);
        this.f87466b = ardn;
        ardn.mo48438f();
        ardo.mo48441a(new Status(0));
    }

    /* renamed from: a */
    public final synchronized void mo48446a(arit arit) {
        List a = ardn.m72536a(this.f87467c.f87197a);
        Logger Logger = f87465a;
        int size = a.size();
        StringBuilder sb = new StringBuilder(59);
        sb.append("getBootstrappableAccounts returning ");
        sb.append(size);
        sb.append(" account(s).");
        Logger.logVerbose(sb.toString(), new Object[0]);
        try {
            arit.mo48575a(new Status(0), a);
        } catch (RemoteException e) {
            f87465a.mo25417e("Error calling ISourceDevice.onBootstrappableAccountsResult(callbacks, Status, List<BootstrapAccount>)", e, new Object[0]);
        }
    }
}
