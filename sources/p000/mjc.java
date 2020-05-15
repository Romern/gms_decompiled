package p000;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: mjc */
final /* synthetic */ class mjc implements Runnable {

    /* renamed from: a */
    private final mje f33813a;

    /* renamed from: b */
    private final List f33814b;

    public mjc(mje mje, List list) {
        this.f33813a = mje;
        this.f33814b = list;
    }

    public final void run() {
        mje mje = this.f33813a;
        List list = this.f33814b;
        if (list.size() <= 0) {
            mjj.f33830d.mo25409a("No accounts found", new Object[0]);
            mht mht = mje.f33839m;
            if (mht.f33740a) {
                mhu.f33742a.mo25412b("Listener.onError called after abortRequest", new Object[0]);
            } else {
                bxvd da = mpq.f34203d.mo74144da();
                mpp mpp = mpp.ERROR;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                mpq mpq = (mpq) da.f164949b;
                mpq.f34206b = mpp.f34202g;
                mpq.f34205a = 1 | mpq.f34205a;
                mpn a = mhu.m25129a(2, 3, "No accounts found");
                mht.f33741b.mo20036a((mpq) da.mo74062i(), a);
            }
            mje.mo20087b();
            return;
        }
        try {
            ParcelFileDescriptor[] parcelFileDescriptorArr = mje.f33834h;
            if (parcelFileDescriptorArr != null) {
                parcelFileDescriptorArr[0].close();
                mje.f33834h[1].close();
            }
            ParcelFileDescriptor[] parcelFileDescriptorArr2 = mje.f33833g;
            if (parcelFileDescriptorArr2 != null) {
                parcelFileDescriptorArr2[0].close();
                mje.f33833g[1].close();
            }
            mje.f33834h = ParcelFileDescriptor.createPipe();
            mje.f33833g = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor[] parcelFileDescriptorArr3 = mje.f33833g;
            mje.f33831e = new ParcelFileDescriptor[]{mje.f33834h[0], parcelFileDescriptorArr3[1]};
            mix mix = new mix(mje, mje.f33837k, mje.f33839m, new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorArr3[0]));
            Future future = mje.f33836j;
            if (future != null) {
                future.cancel(true);
            }
            mje.f33836j = mje.f33838l.mo25813a(mix, null);
            mje.f33832f = new ParcelFileDescriptor.AutoCloseOutputStream(mje.f33834h[1]);
            mji mji = new mji(mje, mje.f33837k);
            arba arba = mje.f33819c;
            Context context = mje.f33818b;
            ArrayList arrayList = new ArrayList(list);
            aqyq aqyq = new aqyq();
            aqyq.mo48282a(arrayList);
            aqyq.mo48281a("directTransferConfirmationBodyText", context.getString(C0126R.string.copy_confirmation_description));
            aqyq.mo48281a("directTransfer3pConfirmationBodyText", context.getString(C0126R.string.copy_confirmation_description_3p));
            aqyq.mo48281a("directTransferConfirmationTitleText", context.getString(C0126R.string.copy_confirmation_title));
            BootstrapConfigurations a2 = aqyq.mo48280a();
            ParcelFileDescriptor[] parcelFileDescriptorArr4 = mje.f33831e;
            roz b = rpa.m34196b();
            b.f43472a = new arkf(arba, a2, parcelFileDescriptorArr4, mji);
            aucb b2 = arba.mo24732b(b.mo24977a());
            b2.mo50373a(new arkg(arba));
            b2.mo50372a(new arks(arba));
            b2.mo50373a(mja.f33811a);
            b2.mo50372a(mjb.f33812a);
            sdo.m34959a(mje.f33832f);
            if (mje.f33835i.size() != 0) {
                try {
                    mje.f33832f.write(mje.f33835i.toByteArray(), 0, mje.f33835i.size());
                    mje.f33835i = null;
                } catch (IOException e) {
                    mjj.f33830d.mo25418e("Could not deliver pending data to API", new Object[0]);
                    mje.mo20094b(2, e.getMessage());
                    mje.f33835i = null;
                }
            }
            mht mht2 = mje.f33839m;
            if (!mht2.f33740a) {
                bxvd da2 = mpq.f34203d.mo74144da();
                mpp mpp2 = mpp.INITIALIZED;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                mpq mpq2 = (mpq) da2.f164949b;
                mpq2.f34206b = mpp2.f34202g;
                mpq2.f34205a = 1 | mpq2.f34205a;
                mht2.f33741b.mo20036a((mpq) da2.mo74062i(), (mpn) null);
                return;
            }
            mhu.f33742a.mo25412b("Listener.onInitialized called after abortRequest", new Object[0]);
        } catch (IOException e2) {
            mje.f33817a.mo25417e("IoException in creating file descriptors", e2, new Object[0]);
            mje.mo20094b(2, e2.getMessage());
        } catch (Throwable th) {
            mje.f33835i = null;
            throw th;
        }
    }
}
