package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.UUID;

/* renamed from: apzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apzc extends aaab {

    /* renamed from: a */
    private final apga f85218a;

    /* renamed from: b */
    private final String f85219b;

    static {
        apzc.class.getSimpleName();
    }

    public apzc(apga apga, String str) {
        super(45, "id");
        this.f85218a = apga;
        this.f85219b = str;
    }

    /* renamed from: b */
    public static synchronized boolean m71214b(Context context) {
        boolean z;
        synchronized (apzc.class) {
            apyk apyk = new apyk(context);
            int R = (int) cgkt.f187180a.mo6606a().mo84015R();
            if (R != apyk.f85143a.getInt("snet_shared_uuid_reset_counter", -1)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                apyk.mo47700a("snet_shared_uuid_reset_counter", R);
            }
        }
        return z;
    }

    /* renamed from: c */
    public static synchronized String m71215c(Context context) {
        String string;
        synchronized (apzc.class) {
            string = new apyk(context).f85143a.getString("snet_shared_uuid", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
        }
        return string;
    }

    /* renamed from: d */
    public static synchronized String m71216d(Context context) {
        String uuid;
        synchronized (apzc.class) {
            uuid = UUID.randomUUID().toString();
            new apyk(context).mo47702a("snet_shared_uuid", uuid);
        }
        return uuid;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        String str;
        if (apuh.m71029c(context, this.f85219b)) {
            if (!m71214b(context)) {
                str = m71215c(context);
            } else {
                str = "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa";
            }
            if (TextUtils.isEmpty(str) || "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa".equals(str)) {
                str = m71216d(context);
            }
            apga apga = this.f85218a;
            if (apga != null) {
                apga.mo47173a(str);
                return;
            }
            return;
        }
        apga apga2 = this.f85218a;
        if (apga2 != null) {
            apga2.mo47173a("aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        apga apga = this.f85218a;
        if (apga != null) {
            apga.mo47173a((String) null);
        }
    }
}
