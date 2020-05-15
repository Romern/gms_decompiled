package p000;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.d2d.AdvertisingInfo;

/* renamed from: arfs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arfs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ arft f87614a;

    public arfs(arft arft) {
        this.f87614a = arft;
    }

    public final void run() {
        arfa arfa;
        int i;
        arft arft = this.f87614a;
        argg argg = arft.f87615a;
        arjf arjf = arft.f87616b;
        argg.f87654a.mo48666c(2);
        arfh arfh = argg.f87655b;
        if (arfh.f87591i && (arfa = arfh.f87589g) != null) {
            String str = ((arfd) arfa).f87570n;
            if (cgpg.m146450d() && TextUtils.isEmpty(str)) {
                arfh.m72641a(arjf, new Status(13));
                return;
            }
            Context context = arfh.f87585c;
            Uri parse = Uri.parse(cgpg.m146452f());
            sre.m36088h(context);
            sre.m36087g(context);
            if (!sre.m36081a(context.getResources())) {
                sre.m36089i(context);
                i = 6;
            } else {
                i = 7;
            }
            Uri.Builder buildUpon = parse.buildUpon();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11);
            sb.append(i - 1);
            sb.append(str);
            String builder = buildUpon.appendPath(sb.toString()).toString();
            String str2 = arfh.f87592j;
            if (str2 == null) {
                str2 = "";
            }
            try {
                arjf.mo48598a(Status.f30107a, new AdvertisingInfo(builder, str2, sqd.m35968b(((arfd) arfh.f87589g).f87572p), str));
            } catch (RemoteException e) {
                arfh.f87583a.mo25410a((Throwable) e);
            }
        } else {
            arfh.m72641a(arjf, new Status(10552));
        }
    }
}
