package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import java.util.Set;

/* renamed from: avbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avbf extends avav {

    /* renamed from: a */
    private final avcc f92902a = new avcc(this.f92882c, this.f92886g);

    /* renamed from: b */
    private final bmzi f92903b;

    public avbf(Context context, avdl avdl, ClientContext clientContext, String str, bmzi bmzi) {
        super(context, avdl, clientContext, str, "GetDeviceDataUploadOptInStatusOperation");
        this.f92888i = true;
        this.f92903b = bmzi;
    }

    /* renamed from: a */
    public static DeviceDataUploadOptInFlags m78187a(Context context, Account account, avcb avcb, avjn avjn) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        for (bxrq bxrq : avcb.f92943b) {
            int i = bxrq.f164589b;
            if (i == 9) {
                int a = bxsn.m123069a(bxrq.f164591d);
                z6 = a != 0 && a == 3;
            } else if (i == 10) {
                int a2 = bxsn.m123069a(bxrq.f164591d);
                z5 = a2 != 0 && a2 == 3;
            }
        }
        auzj a3 = new avfg(avfv.m78451a(context).mo51196a(account, snp.m35702a(10)), avjn).mo51188a();
        if (a3 == null || (a3.f92829a & 1) == 0) {
            z = false;
            z2 = false;
        } else {
            bxpe bxpe = a3.f92830b;
            if (bxpe == null) {
                bxpe = bxpe.f164247d;
            }
            bxwc bxwc = bxpe.f164250b;
            int size = bxwc.size();
            z = false;
            z2 = false;
            for (int i2 = 0; i2 < size; i2++) {
                bxpd bxpd = (bxpd) bxwc.get(i2);
                int a4 = avjl.m78613a(bxpd.f164243b);
                if (a4 == 7) {
                    z2 = bxpd.f164244c;
                } else if (a4 == 8) {
                    z = bxpd.f164244c;
                }
            }
        }
        if (!z5) {
            z3 = false;
        } else {
            z3 = z;
        }
        if (z6 && z2) {
            z4 = true;
        }
        return new DeviceDataUploadOptInFlags(z3, z4);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avcc.a(boolean, java.util.Set):avcb
     arg types: [int, bnic]
     candidates:
      avcc.a(bxsd[], java.lang.String):com.google.android.gms.common.api.Status
      avcc.a(boolean, java.util.Set):avcb */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnic.a(java.lang.Object, java.lang.Object):bnic
     arg types: [int, int]
     candidates:
      bnic.a(int, java.lang.Object[]):bnic
      bnic.a(int, int):boolean
      bngm.a(java.lang.Object[], int):int
      bnic.a(java.lang.Object, java.lang.Object):bnic */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        DeviceDataUploadOptInFlags deviceDataUploadOptInFlags;
        super.mo6502a(context);
        mo51133b();
        if (chbh.m148008f()) {
            deviceDataUploadOptInFlags = avjd.m78605a((bdtq) this.f92903b.mo6606a());
        } else {
            avcb a = this.f92902a.mo51138a(true, (Set) bnic.m109490a((Object) 9, (Object) 10));
            if (a.f92942a.mo17710c()) {
                deviceDataUploadOptInFlags = m78187a(this.f92882c, this.f92886g, a, this.f92889j);
            } else {
                Status status = a.f92942a;
                throw new aaaj(status.f30115i, status.f30116j);
            }
        }
        mo51131a(0);
        this.f92883d.mo51156a(Status.f30107a, deviceDataUploadOptInFlags);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo51131a(status.f30115i);
        this.f92883d.mo51156a(status, (DeviceDataUploadOptInFlags) null);
    }
}
