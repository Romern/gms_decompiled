package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: aqat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqat {

    /* renamed from: a */
    public static final aqat f85474a = new aqat();

    /* renamed from: b */
    public final Object f85475b = new Object();

    /* renamed from: c */
    public final Queue f85476c = new ConcurrentLinkedQueue();

    private aqat() {
    }

    /* renamed from: a */
    public final apyq mo47722a(apyq apyq) {
        bxvd a = apyq.f85174b.mo74141a(apyq);
        apyo apyo = (apyo) this.f85476c.poll();
        while (apyo != null) {
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            apyq apyq2 = (apyq) a.f164949b;
            apyo.getClass();
            if (!apyq2.f85176a.mo73666a()) {
                apyq2.f85176a = GeneratedMessageLite.m124021a(apyq2.f85176a);
            }
            apyq2.f85176a.add(apyo);
            apyo = (apyo) this.f85476c.poll();
        }
        return (apyq) a.mo74062i();
    }

    /* renamed from: a */
    public final apyq mo47723a(byte[] bArr) {
        try {
            return (apyq) GeneratedMessageLite.m124014a(apyq.f85174b, bArr);
        } catch (bxwf e) {
            return apyq.f85174b;
        }
    }

    /* renamed from: a */
    public final byte[] mo47724a(Context context) {
        File file = new File(String.valueOf(context.getApplicationInfo().dataDir).concat("/snet"), "cachedlogs");
        if (file.exists()) {
            try {
                return srz.m36174a(file);
            } finally {
                file.delete();
            }
        } else {
            throw new IOException();
        }
    }
}
