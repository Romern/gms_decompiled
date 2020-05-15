package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: pup */
final /* synthetic */ class pup implements Runnable {

    /* renamed from: a */
    private final puu f40283a;

    /* renamed from: b */
    private final Object f40284b;

    /* renamed from: c */
    private final long f40285c;

    /* renamed from: d */
    private final int f40286d;

    public pup(puu puu, Object obj, long j, int i) {
        this.f40283a = puu;
        this.f40284b = obj;
        this.f40285c = j;
        this.f40286d = i;
    }

    public final void run() {
        pwj pwj;
        pwj pwj2;
        puu puu = this.f40283a;
        Object obj = this.f40284b;
        long j = this.f40285c;
        int i = this.f40286d;
        JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        List list = puu.f40309i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                pwj = null;
                break;
            }
            pwj = (pwj) list.get(i2);
            i2++;
            if (pwj.f40479b == j) {
                break;
            }
        }
        qav qav = puu.f40379n;
        Long valueOf = Long.valueOf(j);
        qav.mo23670a("onRequestCompleted(); requestId=%d, status=%s, trackedMediaItem=%s", valueOf, pew.m30274a(i), pwj);
        if (pwj == null) {
            if (j == puu.f40308h) {
                puu.f40379n.mo23670a("initial status request has completed", new Object[0]);
                puu.f40308h = -1;
                try {
                    long f = puu.f40307g.mo23686f();
                    Iterator it = puu.f40309i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            pwj2 = null;
                            break;
                        }
                        pwj2 = (pwj) it.next();
                        if (pwj2.f40480c == f) {
                            break;
                        }
                    }
                    pwj pwj3 = puu.f40310j;
                    if (pwj3 != null) {
                        if (pwj3 != pwj2) {
                            puu.mo23714a(pwj3, 4, (Bundle) null);
                            puu.mo23713a(puu.f40310j);
                        }
                    }
                    if (puu.f40302b != null) {
                        pwj pwj4 = new pwj(pwj.m31514a(), -1);
                        pwj4.f40480c = f;
                        pwj4.f40481d = (PendingIntent) puu.f40302b.f40290a.getParcelableExtra("android.media.intent.extra.ITEM_STATUS_UPDATE_RECEIVER");
                        puu.f40309i.add(pwj4);
                        puu.f40310j = pwj4;
                    }
                    Iterator it2 = puu.f40309i.iterator();
                    while (it2.hasNext()) {
                        pwj pwj5 = (pwj) it2.next();
                        long j2 = pwj5.f40480c;
                        if (j2 != -1) {
                            pwj pwj6 = puu.f40310j;
                            if (pwj6 != null) {
                                if (j2 >= pwj6.f40480c) {
                                }
                            }
                            puu.mo23714a(pwj5, 4, (Bundle) null);
                            puu.f40379n.mo23670a("untrackAllItemsOlderThanCurrent() for item ID %s, load request %d, media session ID %d", pwj5.f40478a, Long.valueOf(pwj5.f40479b), Long.valueOf(pwj5.f40480c));
                            it2.remove();
                        }
                    }
                } catch (pua e) {
                    puu.mo23715e(4);
                    puu.f40310j = null;
                }
                puu.f40379n.mo23670a("mSyncStatusRequest = %s, status=%s", puu.f40302b, pew.m30274a(i));
                put put = puu.f40302b;
                if (put != null) {
                    if (i == 0) {
                        puu.f40379n.mo23670a("requestStatus completed; sending response", new Object[0]);
                        Bundle bundle = new Bundle();
                        pwj pwj7 = puu.f40310j;
                        if (pwj7 != null) {
                            MediaStatus mediaStatus = puu.f40307g.f40231c;
                            bundle.putString("android.media.intent.extra.ITEM_ID", pwj7.f40478a);
                            bundle.putParcelable("android.media.intent.extra.ITEM_STATUS", puu.mo23716f());
                            MediaInfo mediaInfo = mediaStatus.f29809a;
                            if (mediaInfo != null) {
                                Bundle a = pwc.m31494a(mediaInfo);
                                puu.f40379n.mo23670a("adding metadata bundle: %s", a);
                                bundle.putParcelable("android.media.intent.extra.ITEM_METADATA", a);
                            }
                        }
                        puu.f40302b.mo23711a(bundle);
                    } else {
                        put.mo23710a(1, puu.f40293a);
                    }
                    puu.f40302b = null;
                    return;
                }
                return;
            }
            put put2 = puu.f40303c;
            if (put2 == null || put2.f40292c != j) {
                put put3 = puu.f40304d;
                if (put3 == null || put3.f40292c != j) {
                    put put4 = puu.f40305e;
                    if (put4 == null || put4.f40292c != j) {
                        put put5 = puu.f40306f;
                        if (put5 != null && put5.f40292c == j) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("android.media.intent.extra.SESSION_STATUS", puu.mo23717f(0));
                            puu.f40306f.mo23711a(bundle2);
                            puu.f40306f = null;
                            return;
                        }
                        puu.f40379n.mo23675c("Unknown request ID: %d", valueOf);
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("android.media.intent.extra.SESSION_STATUS", puu.mo23717f(0));
                    bundle3.putParcelable("android.media.intent.extra.ITEM_STATUS", puu.mo23716f());
                    puu.f40305e.mo23711a(bundle3);
                    puu.f40305e = null;
                    return;
                }
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("android.media.intent.extra.SESSION_STATUS", puu.mo23717f(0));
                bundle4.putParcelable("android.media.intent.extra.ITEM_STATUS", puu.mo23716f());
                puu.f40304d.mo23711a(bundle4);
                puu.f40304d = null;
                return;
            }
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable("android.media.intent.extra.SESSION_STATUS", puu.mo23717f(0));
            bundle5.putParcelable("android.media.intent.extra.ITEM_STATUS", puu.mo23716f());
            puu.f40303c.mo23711a(bundle5);
            puu.f40303c = null;
        } else if (i == 0) {
            try {
                long f2 = puu.f40307g.mo23686f();
                puu.f40379n.mo23670a("Load completed; mediaSessionId=%d", Long.valueOf(f2));
                pwj.f40479b = -1;
                pwj.f40480c = f2;
                puu.f40310j = pwj;
                puu.mo23718g();
            } catch (pua e2) {
                puu.f40379n.mo23675c("request completed, but no media session ID is available!", new Object[0]);
                puu.mo23714a(pwj, 7, (Bundle) null);
                puu.mo23713a(pwj);
            }
        } else if (i == 2101) {
            puu.f40379n.mo23670a("STATUS_CANCELED; sending error state", new Object[0]);
            puu.mo23714a(pwj, 5, (Bundle) null);
            puu.mo23713a(pwj);
        } else if (i != 2102) {
            puu.f40379n.mo23670a("unknown status %d; sending error state", Integer.valueOf(i));
            puu.mo23714a(pwj, 7, puu.m31405a(jSONObject));
            puu.mo23713a(pwj);
        } else {
            puu.f40379n.mo23670a("STATUS_TIMED_OUT; sending error state", new Object[0]);
            puu.mo23714a(pwj, 7, (Bundle) null);
            puu.mo23713a(pwj);
        }
    }
}
