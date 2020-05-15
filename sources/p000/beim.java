package p000;

import android.content.Intent;
import android.net.Uri;

/* renamed from: beim */
final /* synthetic */ class beim implements bqeh {

    /* renamed from: a */
    private final beiq f111590a;

    public beim(beiq beiq) {
        this.f111590a = beiq;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        beiq beiq = this.f111590a;
        Intent intent = new Intent();
        intent.setAction("com.google.android.libraries.storage.protostore.SIGNAL_ACTION");
        intent.setData((Uri) obj);
        intent.setPackage(beiq.f111597c);
        intent.setFlags(268435456);
        beip beip = new beip();
        beiq.f111596b.sendOrderedBroadcast(intent, null, beip, beiq.f111599e, -1, null, null);
        return bqga.m112773a(beip.f111594a, 10, beiq.f111595a, beiq.f111600f);
    }
}
