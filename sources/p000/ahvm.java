package p000;

import android.content.Context;
import android.os.Process;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: ahvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahvm {

    /* renamed from: a */
    public final ahse f68166a;

    /* renamed from: b */
    private final Context f68167b;

    public ahvm(Context context) {
        shl shl = new shl(context, cfog.f184854a.mo6606a().mo82012au(), (int) cfog.f184854a.mo6606a().mo82013av(), context.getApplicationInfo().uid, 9731, (byte[]) null);
        this.f68167b = context;
        this.f68166a = new ahse(shl);
    }

    /* renamed from: b */
    static long m56733b(String str) {
        try {
            return Long.parseLong(str, 16);
        } catch (NumberFormatException e) {
            throw new ahvl(str, e);
        }
    }

    /* renamed from: a */
    public final bvkr mo37205a(String str) {
        try {
            long b = m56733b(str);
            try {
                bxvd da = bvkq.f156454e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bvkq) da.f164949b).f156456a = b;
                String language = Locale.getDefault().getLanguage();
                String country = Locale.getDefault().getCountry();
                StringBuilder sb = new StringBuilder(String.valueOf(language).length() + 1 + String.valueOf(country).length());
                sb.append(language);
                sb.append("-");
                sb.append(country);
                String sb2 = sb.toString();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                sb2.getClass();
                ((bvkq) da.f164949b).f156458c = sb2;
                int i = !((burh) ahgz.m55754a(this.f68167b, burh.class)).mo73036a() ? 3 : 4;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((bvkq) da.f164949b).f156457b = i - 2;
                if (cfoj.m141566p()) {
                    srn srn = ahsd.f67925a;
                    long dimensionPixelSize = (long) this.f68167b.getResources().getDimensionPixelSize(!cfoj.m141525F() ? C0126R.dimen.fast_pair_notification_small_image_size : C0126R.dimen.fast_pair_halfsheet_mid_image_size);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    ((bvkq) da.f164949b).f156459d = dimensionPixelSize;
                }
                ahse ahse = this.f68166a;
                ClientContext a = mo37206a();
                bvkq bvkq = (bvkq) da.mo74062i();
                if (ahse.f67926b == null) {
                    ahse.f67926b = chtv.m149566a(chtu.UNARY, "location.nearby.v1.NearbyDevicesService/GetObservedDevice", ciie.m150370a(bvkq.f156454e), ciie.m150370a(bvkr.f156460d));
                }
                return (bvkr) ahse.f67928a.mo25553a(ahse.f67926b, a, bvkq, 10000, TimeUnit.MILLISECONDS);
            } catch (chuw | gid e) {
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68415a("FastPair: Failed to get observed device %s", b);
                return null;
            }
        } catch (ahvl e2) {
            bnsl bnsl2 = (bnsl) ahsd.f67925a.mo68388c();
            bnsl2.mo68437a(e2);
            bnsl2.mo68405a("FastPair: Failed to parse model ID.");
            return null;
        }
    }

    /* renamed from: a */
    public final ClientContext mo37206a() {
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = Process.myUid();
        clientContext.f30215e = this.f68167b.getPackageName();
        clientContext.f30216f = this.f68167b.getPackageName();
        return clientContext;
    }
}
