package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: pzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pzi {

    /* renamed from: a */
    public final pnl f40739a;

    /* renamed from: b */
    public final ScheduledExecutorService f40740b;

    /* renamed from: c */
    public final Context f40741c;

    /* renamed from: d */
    public final psy f40742d;

    public pzi(Context context, pnl pnl, psy psy, ScheduledExecutorService scheduledExecutorService) {
        this.f40741c = context;
        this.f40739a = pnl;
        this.f40740b = scheduledExecutorService;
        this.f40742d = psy;
    }

    /* renamed from: a */
    public static int m31710a(CastDevice castDevice, bshw bshw, pky pky, qav qav) {
        int a = bshx.m115820a(bshw.f144639b);
        if (a != 0 && a == 2) {
            bltz bltz = bshw.f144638a;
            if (bltz != null) {
                pky.mo23304a(bltz.f127764a, bltz.f127767d.getKey());
                String str = bltz.f127765b;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        InetAddress byName = InetAddress.getByName(str);
                        if (byName != null) {
                            try {
                                qav.mo23861b("connecting socket now");
                                ((pkk) pky).mo23303a(castDevice.f29716d, byName, bltz.f127766c);
                                return 0;
                            } catch (IOException e) {
                                qav.mo23676c(e, "failed to connect", new Object[0]);
                                return 2405;
                            }
                        } else {
                            qav.mo23677d("Failed to get the address for %s", str);
                            return 2409;
                        }
                    } catch (UnknownHostException e2) {
                        qav.mo23677d("Exception happenned when getting the address for %s", str);
                        return 2409;
                    }
                } else {
                    qav.mo23677d("response does not contain server address.", new Object[0]);
                    return 2409;
                }
            } else {
                qav.mo23677d("response does not contain a session token.", new Object[0]);
                return 2408;
            }
        } else {
            int i = bshw.f144639b;
            StringBuilder sb = new StringBuilder(59);
            sb.append("Return cast returned failure in response, error=");
            sb.append(i);
            qav.mo23677d(sb.toString(), new Object[0]);
            int a2 = bshx.m115820a(bshw.f144639b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 2;
            if (i2 == 1) {
                return 2410;
            }
            if (i2 == 2) {
                return 2411;
            }
            if (i2 == 3) {
                return 2412;
            }
            if (i2 != 4) {
                return i2 != 5 ? 2415 : 2414;
            }
            return 2413;
        }
    }
}
