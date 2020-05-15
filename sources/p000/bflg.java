package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.hardware.location.ContextHubClient;
import android.hardware.location.ContextHubManager;
import android.hardware.location.NanoAppMessage;
import android.util.Log;
import com.google.android.location.contexthub.NanoAppClearcutLoggingP$1;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bflg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bflg extends bfld implements bflt {

    /* renamed from: h */
    public static final /* synthetic */ int f114332h = 0;

    /* renamed from: i */
    private static final byte[] f114333i = "WELCOME_NANO".getBytes();

    /* renamed from: a */
    public final Context f114334a;

    /* renamed from: b */
    public final snr f114335b;

    /* renamed from: c */
    public final bflv f114336c;

    /* renamed from: d */
    public final qws f114337d;

    /* renamed from: e */
    public final Set f114338e = new HashSet();

    /* renamed from: f */
    public final BroadcastReceiver f114339f = new NanoAppClearcutLoggingP$1(this, "location");

    /* renamed from: g */
    public boolean f114340g = false;

    public bflg(Context context, snr snr) {
        bflv bflv = new bflv((ContextHubManager) context.getSystemService("contexthub"), snr.f44809d);
        qws qws = new qws(context, "LE", null);
        this.f114334a = context;
        this.f114335b = snr;
        this.f114336c = bflv;
        this.f114337d = qws;
    }

    /* renamed from: b */
    public static Set m97175b() {
        if (ceyy.m138449b() == null) {
            return new HashSet();
        }
        HashSet<String> a = bnpf.m110050a(ceyy.m138449b().trim().split("\\s*,\\s*"));
        a.remove("");
        HashSet hashSet = new HashSet();
        for (String str : a) {
            try {
                hashSet.add(Long.valueOf(Long.decode(str).longValue()));
            } catch (NumberFormatException e) {
                if (Log.isLoggable("NanoAppLogging", 6)) {
                    Log.e("NanoAppLogging", "Failed to decode nanoapp ID!", e);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo61875a() {
        Set b = m97175b();
        if (!this.f114338e.containsAll(b)) {
            this.f114338e.clear();
            this.f114338e.addAll(b);
            for (Long l : this.f114338e) {
                m97176b(l.longValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo61876a(long j) {
        if (this.f114338e.contains(Long.valueOf(j))) {
            m97176b(j);
        }
    }

    /* renamed from: a */
    public final void mo61877a(boolean z) {
        if (z) {
            mo61875a();
        } else if (Log.isLoggable("NanoAppLogging", 6)) {
            Log.e("NanoAppLogging", "Failed to begin contexthub communication");
        }
    }

    /* renamed from: b */
    private final void m97176b(long j) {
        NanoAppMessage createMessageToNanoApp = NanoAppMessage.createMessageToNanoApp(j, 2147478647, f114333i);
        ContextHubClient contextHubClient = this.f114336c.f114377e;
        if (contextHubClient != null) {
            contextHubClient.sendMessageToNanoApp(createMessageToNanoApp);
        }
    }
}
