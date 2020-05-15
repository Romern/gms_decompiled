package p000;

import android.content.Context;
import com.google.android.gms.leveldb.WriteBatch;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.nio.charset.Charset;

/* renamed from: zsi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zsi {

    /* renamed from: a */
    public static final srn f55787a = zvt.m46581a();

    /* renamed from: b */
    public final byte[] f55788b;

    /* renamed from: c */
    public bxuk f55789c;

    /* renamed from: d */
    public final String f55790d;

    /* renamed from: e */
    public final Context f55791e;

    /* renamed from: f */
    public final ytp f55792f;

    /* renamed from: g */
    private final byte[] f55793g;

    /* renamed from: h */
    private final WriteBatch f55794h;

    public zsi(String str, Context context, caae caae, WriteBatch writeBatch, ytp ytp) {
        String str2 = caae.f172326b;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1);
        sb.append(str2);
        sb.append(0);
        this.f55793g = sb.toString().getBytes(Charset.forName("UTF-8"));
        this.f55794h = writeBatch;
        byte[] bArr = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES];
        this.f55788b = bArr;
        this.f55789c = bxuk.m123637a(bArr);
        this.f55790d = str;
        this.f55791e = context;
        this.f55792f = ytp;
    }

    /* renamed from: a */
    static int m46164a(cadn cadn) {
        int i;
        long j = cadn.f172702b;
        if (j != 0) {
            i = bxuk.m123645d(1, j);
        } else {
            i = 0;
        }
        long j2 = cadn.f172703c;
        if (j2 != 0) {
            i += bxuk.m123645d(2, j2);
        }
        long j3 = cadn.f172707g;
        if (j3 != 0) {
            i += bxuk.m123645d(8, j3);
        }
        long j4 = cadn.f172708h;
        if (j4 != 0) {
            i += bxuk.m123645d(9, j4);
        }
        if ((8 & cadn.f172701a) != 0) {
            caae caae = cadn.f172706f;
            if (caae == null) {
                caae = caae.f172323i;
            }
            if (!caae.f172326b.isEmpty()) {
                caae caae2 = cadn.f172706f;
                if (caae2 == null) {
                    caae2 = caae.f172323i;
                }
                String str = caae2.f172326b;
                int i2 = bxuk.m123657i(7);
                int b = bxuk.m123639b(1, str);
                i = i + i2 + bxuk.m123661k(b) + b;
            }
        }
        if (cadn.f172704d.size() > 0) {
            bxwc bxwc = cadn.f172704d;
            int size = bxwc.size();
            for (int i3 = 0; i3 < size; i3++) {
                i += bxuk.m123652f((caaw) bxwc.get(i3));
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m46165a(cadn cadn, bxuk bxuk) {
        long j = cadn.f172702b;
        if (j != 0) {
            bxuk.mo73831a(1, j);
        }
        long j2 = cadn.f172703c;
        if (j2 != 0) {
            bxuk.mo73831a(2, j2);
        }
        long j3 = cadn.f172707g;
        if (j3 != 0) {
            bxuk.mo73831a(8, j3);
        }
        long j4 = cadn.f172708h;
        if (j4 != 0) {
            bxuk.mo73831a(9, j4);
        }
        if ((cadn.f172701a & 8) != 0) {
            caae caae = cadn.f172706f;
            if (caae == null) {
                caae = caae.f172323i;
            }
            if (!caae.f172326b.isEmpty()) {
                caae caae2 = cadn.f172706f;
                if (caae2 == null) {
                    caae2 = caae.f172323i;
                }
                String str = caae2.f172326b;
                bxuk.mo73845b(7, 2);
                bxuk.mo73855d(bxuk.m123639b(1, str));
                bxuk.mo73835a(1, str);
            }
        }
        bxwc bxwc = cadn.f172704d;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            caaw caaw = (caaw) bxwc.get(i);
            if (caaw != null) {
                bxuk.mo73849b(caaw);
            }
        }
    }

    /* renamed from: a */
    public final void mo31434a() {
        this.f55789c.mo73872g(0);
        this.f55794h.bufferedPut(this.f55793g, this.f55788b);
        this.f55789c = null;
    }
}
