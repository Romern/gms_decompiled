package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* renamed from: aakz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aakz {

    /* renamed from: a */
    public static aakz f28396a;

    /* renamed from: d */
    public static final AtomicInteger f28397d = new AtomicInteger(1);

    /* renamed from: b */
    public Context f28398b;

    /* renamed from: c */
    public final Map f28399c = Collections.synchronizedMap(new C1223np());

    /* renamed from: e */
    public final BlockingQueue f28400e = new LinkedBlockingQueue();

    /* renamed from: f */
    public final Messenger f28401f = new Messenger(new aaky(this, Looper.getMainLooper()));

    /* renamed from: g */
    private PendingIntent f28402g;

    @Deprecated
    /* renamed from: a */
    public static synchronized aakz m21424a(Context context) {
        aakz aakz;
        synchronized (aakz.class) {
            if (f28396a == null) {
                aakz aakz2 = new aakz();
                f28396a = aakz2;
                aakz2.f28398b = context.getApplicationContext();
            }
            aakz = f28396a;
        }
        return aakz;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo16963b(Intent intent) {
        if (this.f28402g == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f28402g = PendingIntent.getBroadcast(this.f28398b, 0, intent2, 0);
        }
        intent.putExtra("app", this.f28402g);
    }

    @Deprecated
    /* renamed from: a */
    public final String mo16960a(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return null;
        }
        String stringExtra = intent.getStringExtra("message_type");
        return stringExtra == null ? "gcm" : stringExtra;
    }

    @Deprecated
    /* renamed from: a */
    public final void mo16961a(String str, String str2, long j, Bundle bundle) {
        String str3;
        if (str != null) {
            String a = addz.m50235a(this.f28398b);
            if (a != null) {
                Intent intent = new Intent("com.google.android.gcm.intent.SEND");
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                mo16963b(intent);
                intent.setPackage(a);
                intent.putExtra("google.to", str);
                intent.putExtra("google.message_id", str2);
                intent.putExtra("google.ttl", Long.toString(j));
                int indexOf = str.indexOf(64);
                if (indexOf > 0) {
                    str3 = str.substring(0, indexOf);
                } else {
                    str3 = str;
                }
                addi.m50206a(this.f28398b);
                intent.putExtra("google.from", addi.f61433a.mo33378a("", str3, "GCM"));
                if (a.contains(".gsf")) {
                    Bundle bundle2 = new Bundle();
                    for (String str4 : bundle.keySet()) {
                        Object obj = bundle.get(str4);
                        if (obj instanceof String) {
                            String valueOf = String.valueOf(str4);
                            bundle2.putString(valueOf.length() == 0 ? new String("gcm.") : "gcm.".concat(valueOf), (String) obj);
                        }
                    }
                    bundle2.putString("google.to", str);
                    bundle2.putString("google.message_id", str2);
                    addi.m50206a(this.f28398b).mo33347b("GCM", "upstream", bundle2);
                    return;
                }
                this.f28398b.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
                return;
            }
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    @Deprecated
    /* renamed from: a */
    public final void mo16962a(String str, String str2, Bundle bundle) {
        mo16961a(str, str2, -1, bundle);
    }
}
