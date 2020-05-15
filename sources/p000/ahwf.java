package p000;

import android.content.Context;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;

/* renamed from: ahwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahwf {

    /* renamed from: a */
    private static final bnic f68217a = bnic.m109490a(chuv.f189225l, chuv.f189228o);

    /* renamed from: b */
    private final ahsg f68218b;

    /* renamed from: c */
    private final ahst f68219c;

    /* renamed from: d */
    private final ahsi f68220d;

    public ahwf(Context context, ahsg ahsg) {
        this.f68218b = ahsg;
        this.f68219c = (ahst) ahgz.m55754a(context, ahst.class);
        this.f68220d = (ahsi) ahgz.m55754a(context, ahsi.class);
    }

    /* renamed from: a */
    private final void m56779a(cakp cakp, int i) {
        if (cakp.f175030a.size() > 0) {
            bxwc bxwc = cakp.f175030a;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                ahyz a = this.f68219c.mo37032a((ByteString) bxwc.get(i2));
                if (a != null) {
                    this.f68220d.mo37017a(bvin.FIND_MY_ACCESSORY_UPLOADED, a.f68437k, bzau.ENTRY_POINT_UNKNOWN, i);
                } else {
                    this.f68220d.mo37017a(bvin.FIND_MY_ACCESSORY_UPLOADED, "0", bzau.ENTRY_POINT_UNKNOWN, i);
                }
            }
            return;
        }
        this.f68220d.mo37017a(bvin.FIND_MY_ACCESSORY_UPLOADED, "0", bzau.ENTRY_POINT_UNKNOWN, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ahwe mo37223a(Context context, ClientContext clientContext, cakp cakp, boolean z) {
        int i;
        boolean z2 = false;
        if (!z) {
            try {
                srn srn = ahsd.f67925a;
                if (cfom.m141867b() && cfoj.m141530K()) {
                    m56779a(cakp, ErrorInfo.TYPE_SDU_FAILED);
                }
                ahwd c = ahwe.m56776c();
                c.mo37221a(cakq.FAILURE);
                c.mo37222a(false);
                return c.mo37220a();
            } catch (chuw e) {
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("FastPair: Failed to send device to FMA");
                if (cfom.m141867b() && cfoj.m141530K()) {
                    m56779a(cakp, e.f189236a.f189233s.f189211r);
                }
                ahwd c2 = ahwe.m56776c();
                c2.mo37221a(cakq.FAILURE);
                c2.mo37222a(!f68217a.contains(e.f189236a));
                return c2.mo37220a();
            } catch (gid e2) {
                bnsl bnsl2 = (bnsl) ahsd.f67925a.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68405a("FastPair: Failed to send device to FMA");
                if (cfom.m141867b() && cfoj.m141530K()) {
                    m56779a(cakp, ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
                }
                ahwd c3 = ahwe.m56776c();
                c3.mo37221a(cakq.FAILURE);
                c3.mo37222a(true);
                return c3.mo37220a();
            }
        } else {
            ahsg ahsg = this.f68218b;
            if (ahsg.f67929b == null) {
                ahsg.f67929b = chtv.m149566a(chtu.UNARY, "security.fma.WirelessAndroidSecurityFmaService/StoreAccessory", ciie.m150370a(cakp.f175028g), ciie.m150370a(cakr.f175042b));
            }
            cakq a = cakq.m126732a(((cakr) ahsg.f67930a.mo25553a(ahsg.f67929b, clientContext, cakp, 10000, TimeUnit.MILLISECONDS)).f175044a);
            if (a == null) {
                a = cakq.UNRECOGNIZED;
            }
            if (cfom.m141867b() && cfoj.m141530K()) {
                if (a == cakq.SUCCESS) {
                    i = chus.OK.f189211r;
                } else {
                    i = 102;
                }
                m56779a(cakp, i);
            } else {
                ((ahsi) ahgz.m55754a(context, ahsi.class)).mo37011a(bvin.FIND_MY_ACCESSORY_UPLOADED);
            }
            ahwd c4 = ahwe.m56776c();
            c4.mo37221a(a);
            if (a != cakq.SUCCESS) {
                z2 = true;
            }
            c4.mo37222a(z2);
            return c4.mo37220a();
        }
    }
}
