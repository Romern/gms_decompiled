package p000;

import android.os.AsyncTask;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.photos.autobackup.model.AutoBackupSettings;
import java.util.Iterator;
import java.util.List;

/* renamed from: udn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class udn extends AsyncTask {

    /* renamed from: a */
    private final rkb f47299a;

    /* renamed from: b */
    private final String f47300b;

    /* renamed from: c */
    private final uto f47301c;

    public udn(rkb rkb, String str, uto uto) {
        this.f47299a = rkb;
        this.f47300b = str;
        this.f47301c = uto;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r2 = false;
     */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        rkb rkb;
        boolean z;
        Void[] voidArr = (Void[]) objArr;
        ConnectionResult f = this.f47299a.mo24802f();
        try {
            if (f.mo17671b()) {
                rjo rjo = anjk.f77000a;
                rkb rkb2 = this.f47299a;
                anjl anjl = (anjl) rkb2.mo24787a((rle) new anjn(rkb2)).mo9455a();
                Status bo = anjl.mo7183bo();
                if (bo.mo17710c()) {
                    List b = anjl.mo41871b();
                    String str = this.f47300b;
                    sbw sbw = udo.f47302f;
                    Iterator it = b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AutoBackupSettings autoBackupSettings = (AutoBackupSettings) it.next();
                        String str2 = autoBackupSettings.f82165b;
                        z = autoBackupSettings.f82166c;
                        if (str2 != null) {
                            if (str.equals(str2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    this.f47301c.mo27982a(z);
                } else {
                    this.f47301c.mo27107a(bo);
                }
                rkb = this.f47299a;
            } else {
                this.f47301c.mo27107a(new Status(f.f30065c));
                rkb = this.f47299a;
            }
        } catch (RemoteException e) {
            udo.f47302f.mo25378c("IsAutobackupEnabledOper", String.format("Autobackup connection failed for %s", this.f47300b), e);
            rkb = this.f47299a;
        } catch (Throwable th) {
            this.f47299a.mo24803g();
            throw th;
        }
        rkb.mo24803g();
        return null;
    }
}
