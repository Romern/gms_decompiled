package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import java.util.List;

/* renamed from: ahys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahys {

    /* renamed from: a */
    public static int f68379a = ((int) SystemClock.elapsedRealtime());

    /* renamed from: b */
    public final Context f68380b;

    public ahys(Context context) {
        this.f68380b = context;
    }

    /* renamed from: a */
    public static Intent m56884a(Context context, Integer num, ahyw ahyw) {
        String a;
        String a2;
        if (cfoj.m141573w()) {
            srn srn = ahsd.f67925a;
            aiad a3 = aiae.m56945a(context, ahyw);
            Intent intent = a3.f68556a;
            intent.putExtra("com.google.android.gms.nearby.discovery.fastpair:EXTRA_NOTIFICATION_ID", num).putExtra("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ID", num).putExtra("com.google.android.gms.nearby.discovery.EXTRA_DISCOVERY_ITEM", ahvd.m56706a(ahyw).mo73642k());
            if (!ahyw.f68399h.isEmpty() && (a2 = ahvd.m56710a(ahyw.f68399h)) != null) {
                intent.putExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP", a2);
            }
            return DiscoveryChimeraService.m67336a(context).setPackage(context.getPackageName()).setAction("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_NOTIFICATION_CLICKED").putExtra("com.google.android.gms.nearby.discovery:ACTION_FORWARDED_ACTION_URL", intent).putExtra("com.google.android.gms.nearby.discovery:ACTION_FORWARDED_ACTION_URL_TYPE", a3.f68557b).putExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID", ahyw.f68393b).putExtra("com.google.android.gms.nearby.discovery:EXTRA_PRIVATE_BLE_ADDRESS", ahyw.f68400i).putExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP", a3.f68558c);
        }
        srn srn2 = ahsd.f67925a;
        Intent putExtra = DiscoveryChimeraService.m67336a(context).setAction("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR").putExtra("com.google.android.gms.nearby.discovery.fastpair:EXTRA_NOTIFICATION_ID", num).putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", Long.valueOf(ahyw.f68393b, 16)).putExtra("com.google.android.gms.nearby.discovery:EXTRA_NOTIFICATION_ID", num).putExtra("com.google.android.gms.nearby.discovery.EXTRA_DISCOVERY_ITEM", ahvd.m56706a(ahyw).mo73642k()).putExtra("com.google.android.gms.nearby.discovery.fastpair.MODEL_ID", ahyw.f68393b).putExtra("com.google.android.gms.nearby.discovery:EXTRA_PRIVATE_BLE_ADDRESS", ahyw.f68400i);
        if (!ahyw.f68399h.isEmpty() && (a = ahvd.m56710a(ahyw.f68399h)) != null) {
            putExtra.putExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP", a);
        }
        return putExtra;
    }

    /* renamed from: b */
    public static String m56886b(Context context, ahyw ahyw) {
        List d = soz.m35801d(context, context.getPackageName());
        if (d.isEmpty()) {
            ahyt ahyt = ahyw.f68404m;
            if (ahyt == null) {
                ahyt = ahyt.f68381d;
            }
            return ahyt.f68385c;
        }
        ahyt ahyt2 = ahyw.f68404m;
        if (ahyt2 == null) {
            ahyt2 = ahyt.f68381d;
        }
        if (!ahyt2.f68384b.contains("%s")) {
            ahyt ahyt3 = ahyw.f68404m;
            if (ahyt3 == null) {
                ahyt3 = ahyt.f68381d;
            }
            return ahyt3.f68384b;
        }
        ahyt ahyt4 = ahyw.f68404m;
        if (ahyt4 == null) {
            ahyt4 = ahyt.f68381d;
        }
        return String.format(ahyt4.f68384b, ((Account) d.get(0)).name);
    }

    /* renamed from: a */
    public static Bitmap m56885a(Context context, ahyw ahyw) {
        if ((ahyw.f68392a & 8) != 0) {
            try {
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(ahyw.f68396e.mo73780k(), 0, ahyw.f68396e.mo73744a());
                if (bush.m120379a(decodeByteArray)) {
                    return bush.m120378a(context, decodeByteArray);
                }
            } catch (OutOfMemoryError e) {
                bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68405a("Failed to decode icon, returning null.");
            }
        }
        return null;
    }
}
