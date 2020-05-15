package p000;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: acrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acrb extends acra {

    /* renamed from: b */
    private final acxo f60571b;

    public acrb(ftl ftl, acxo acxo) {
        super(ftl, "GetFileDescriptorAndDelete");
        this.f60571b = acxo;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        ParcelFileDescriptor a = this.f60571b.mo33212a();
        try {
            this.f60570a.mo11305a(Status.f30107a, a);
            if (a != null) {
                try {
                    a.close();
                } catch (IOException e) {
                    e = e;
                    absg.m48189a(e, "Couldn't close ParcelFileDescriptor");
                }
            }
        } catch (RemoteException e2) {
            absg.m48200c(e2, "Client died during getFileDescriptorAndDelete", new Object[0]);
            if (a != null) {
                try {
                    a.close();
                } catch (IOException e3) {
                    e = e3;
                    absg.m48189a(e, "Couldn't close ParcelFileDescriptor");
                }
            }
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (IOException e4) {
                    absg.m48189a(e4, "Couldn't close ParcelFileDescriptor");
                }
            }
            throw th;
        }
    }
}
