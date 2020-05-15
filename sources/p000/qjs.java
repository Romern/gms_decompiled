package p000;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.security.MessageDigest;
import java.util.HashMap;

/* renamed from: qjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qjs {

    /* renamed from: a */
    private static final sek f41505a = qgn.m32143a("DroidGuardResultModule");

    /* renamed from: a */
    static bmxv m32263a(Context context, bmxv bmxv, bmxv bmxv2, bmxv bmxv3, bmxv bmxv4, bnic bnic, vvp vvp, qdu qdu) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(qdn.m31947b(context));
        sb.append(':');
        if (bmxv2.mo66813a()) {
            sb.append((String) bmxv2.mo66814b());
            sb.append(':');
        }
        if (bmxv3.mo66813a()) {
            sb.append((String) bmxv3.mo66814b());
            sb.append(':');
        }
        if (bmxv.mo66813a()) {
            sb.append((String) bmxv.mo66814b());
            sb.append(':');
        }
        if (bmxv4.mo66813a()) {
            sb.append((String) bmxv4.mo66814b());
            sb.append(':');
        }
        bnrd a = bnic.iterator();
        while (a.hasNext()) {
            qhv qhv = (qhv) a.next();
            sb.append(qhv.f41431b);
            sb.append(':');
            sb.append(qhv.f41432c);
            sb.append(':');
        }
        byte[] bytes = sb.toString().getBytes(bmwy.f131158c);
        MessageDigest a2 = spo.m35903a("SHA-1");
        if (a2 == null) {
            f41505a.mo25418e("no support for SHA-1", new Object[0]);
        } else {
            a2.update(bytes);
            hashMap.put("CONTENT_BINDER", Base64.encodeToString(a2.digest(), 2));
        }
        bmxv bmxv5 = qdu.f41042l;
        return bmxv.m108567c(vvp.mo28903a("checkin", hashMap, (DroidGuardResultsRequest) null));
    }
}
