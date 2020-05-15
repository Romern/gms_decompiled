package p000;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: aceq */
final /* synthetic */ class aceq implements bqeh {

    /* renamed from: a */
    private final acev f59678a;

    /* renamed from: b */
    private final bonk f59679b;

    /* renamed from: c */
    private final Bundle f59680c;

    public aceq(acev acev, bonk bonk, Bundle bundle) {
        this.f59678a = acev;
        this.f59679b = bonk;
        this.f59680c = bundle;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqgg a;
        boolean z;
        bqgy bqgy;
        acev acev = this.f59678a;
        bonk bonk = this.f59679b;
        Bundle bundle = this.f59680c;
        Void voidR = (Void) obj;
        synchronized (acev.f59690e) {
            int size = bonk.f133819b.size();
            int size2 = acev.f59690e.size();
            StringBuilder sb = new StringBuilder(61);
            sb.append("Uploading list of ");
            sb.append(size);
            sb.append(" apps for ");
            sb.append(size2);
            sb.append(" account(s)");
            Log.i("AppsUpload", sb.toString());
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : acev.f59690e.entrySet()) {
                acen acen = (acen) entry.getValue();
                boolean z2 = false;
                if (bundle == null || bundle.getBoolean("skip_upload_for_unchanged", true)) {
                    z = true;
                } else {
                    z = false;
                }
                bxvd bxvd = (bxvd) bonk.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) bonk);
                bonj bonj = (bonj) bxvd;
                ByteString a2 = ByteString.m123261a(acen.f59660e);
                if (bonj.f164950c) {
                    bonj.mo74035c();
                    bonj.f164950c = false;
                }
                bonk bonk2 = (bonk) bonj.f164949b;
                bonk bonk3 = bonk.f133815e;
                bonk2.f133820c = a2.mo73781l();
                bonk2.f133818a |= 1;
                bonk bonk4 = (bonk) bonj.mo74062i();
                try {
                    synchronized (acen.f59661f) {
                        if (acen.f59664i == null) {
                            acen.f59664i = bqgy.m112818c();
                        }
                        if (acen.f59663h == null) {
                            z2 = z;
                        } else if (acen.f59665j && z) {
                            z2 = true;
                        }
                        acen.f59665j = z2;
                        acen.f59663h = bonk4;
                        bqgy = acen.f59664i;
                    }
                    acen.mo32710a();
                    arrayList.add(bqgy);
                } catch (Throwable th) {
                    acen.mo32710a();
                    throw th;
                }
            }
            a = bqga.m112782b(arrayList).mo69216a(aces.f59682a, acev.f59688c);
        }
        return a;
    }
}
