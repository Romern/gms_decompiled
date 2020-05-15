package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import com.google.android.location.geofencer.data.PendingIntentCacheItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: bfwg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfwg implements PendingIntent.OnFinished {

    /* renamed from: a */
    public final String f115495a;

    /* renamed from: b */
    public volatile rsk f115496b;

    /* renamed from: c */
    public bfkw f115497c;

    /* renamed from: d */
    public final Context f115498d;

    /* renamed from: e */
    public final bfwj f115499e;

    /* renamed from: f */
    private final asfb f115500f;

    public bfwg(ayte ayte, Context context, Handler handler, asfb asfb, bfwi bfwi, String str, bfwh bfwh, bfww bfww) {
        this.f115498d = context;
        this.f115500f = asfb;
        this.f115495a = str;
        int i = spn.f44932a;
        this.f115499e = new bfwj(context, handler, bfwi, bfwh, bfww);
        boolean z = bfxc.f115575a;
    }

    /* renamed from: a */
    public final List mo62360a(double d, int i) {
        bfwj bfwj = this.f115499e;
        return bfwj.f115503g.mo62338a(bfwj.mo25992c(), d, i);
    }

    /* renamed from: b */
    public final List mo62363b(int i) {
        bfwj bfwj = this.f115499e;
        return bfwj.f115503g.mo62344c(bfwj.mo25992c(), i);
    }

    /* renamed from: c */
    public final int mo62365c() {
        return this.f115499e.mo62374j();
    }

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        if (this.f115500f.mo49124e()) {
            this.f115500f.mo49120c();
        }
    }

    /* renamed from: a */
    public final void mo62361a() {
        mo62362a(1003);
    }

    /* renamed from: b */
    public final void mo62364b() {
        boolean z = bfxc.f115575a;
        if (this.f115496b != null) {
            bfwj bfwj = this.f115499e;
            String b = this.f115496b.mo25066b();
            C1223np npVar = new C1223np();
            bfyi bfyi = (bfyi) bfyj.f115690d.mo74144da();
            if (bfyi.f164950c) {
                bfyi.mo74035c();
                bfyi.f164950c = false;
            }
            bfyj bfyj = (bfyj) bfyi.f164949b;
            b.getClass();
            bfyj.f115692a |= 1;
            bfyj.f115693b = b;
            for (bfwn bfwn : bfwj.mo25992c()) {
                ArrayList arrayList = bfwn.f115519c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    bfwf bfwf = (bfwf) arrayList.get(i);
                    PendingIntentCacheItem pendingIntentCacheItem = (PendingIntentCacheItem) npVar.get(bfwf.f115484b);
                    if (pendingIntentCacheItem == null) {
                        if (cews.f183481a.mo6606a().doNotStoreTagsInSystemMemoryCache()) {
                            pendingIntentCacheItem = new PendingIntentCacheItem(bfwf.f115484b, UUID.randomUUID().toString(), new ArrayList(), null);
                        } else {
                            pendingIntentCacheItem = new PendingIntentCacheItem(bfwf.f115484b, UUID.randomUUID().toString(), new ArrayList(), bfwn.f115518b.f115511b);
                        }
                        npVar.put(bfwf.f115484b, pendingIntentCacheItem);
                    }
                    String str = bfwf.f115483a.f79438a;
                    int binarySearch = Collections.binarySearch(pendingIntentCacheItem.f150776c, str);
                    if (binarySearch < 0) {
                        pendingIntentCacheItem.f150776c.add((-binarySearch) - 1, str);
                    }
                    String str2 = pendingIntentCacheItem.f150775b;
                    bxvd f = bfwf.mo62358f();
                    if (f.f164950c) {
                        f.mo74035c();
                        f.f164950c = false;
                    }
                    bfyf bfyf = (bfyf) f.f164949b;
                    bfyf bfyf2 = bfyf.f115676l;
                    str2.getClass();
                    bfyf.f115678a |= 2;
                    bfyf.f115680c = str2;
                    bfyi.mo62421a((bfyf) f.mo74062i());
                }
            }
            Pair create = Pair.create(bfyi, npVar.values());
            try {
                this.f115497c.mo61863a((bfyj) ((bfyi) create.first).mo74062i());
                boolean z2 = bfxc.f115575a;
                this.f115496b.mo25064a((Collection) create.second);
            } catch (IOException e) {
                if (Log.isLoggable("GeofenceStateCache", 6)) {
                    bfxc.m98133b("GeofenceStateCache", "Unable to save geofence states on disk, PendingIntent memory cache was not changed");
                }
                throw e;
            }
        }
    }

    /* renamed from: a */
    public final void mo62362a(int i) {
        if (this.f115496b != null) {
            List e = this.f115496b.mo25074e();
            int size = e.size();
            for (int i2 = 0; i2 < size; i2++) {
                PendingIntent pendingIntent = ((PendingIntentCacheItem) e.get(i2)).f150774a;
                if (i != 1003 || bhcb.m100621a(pendingIntent).equals("com.google.android.gms")) {
                    boolean z = bfxc.f115575a;
                    Intent intent = new Intent();
                    intent.putExtra("gms_error_code", i);
                    this.f115500f.mo49111a(10000);
                    try {
                        sse.m36201a(pendingIntent, this.f115498d, 0, intent, this);
                    } catch (PendingIntent.CanceledException e2) {
                        if (this.f115500f.mo49124e()) {
                            this.f115500f.mo49120c();
                        }
                    }
                }
            }
        }
    }
}
