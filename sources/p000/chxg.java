package p000;

import java.text.MessageFormat;
import java.util.Collection;
import java.util.logging.Level;

/* renamed from: chxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chxg extends chqq {

    /* renamed from: a */
    private final chxh f189447a;

    /* renamed from: b */
    private final cifd f189448b;

    public chxg(chxh chxh, cifd cifd) {
        bmxy.m108582a(chxh, "tracer");
        this.f189447a = chxh;
        bmxy.m108582a(cifd, "time");
        this.f189448b = cifd;
    }

    /* renamed from: a */
    public static Level m149747a(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return Level.FINER;
        }
        if (i2 != 3) {
            return Level.FINEST;
        }
        return Level.FINE;
    }

    /* renamed from: b */
    private final boolean m149748b(int i) {
        if (i == 1) {
            return false;
        }
        chxh chxh = this.f189447a;
        synchronized (chxh.f189450b) {
            Collection collection = chxh.f189452d;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo85552a(int i, String str) {
        chse chse = this.f189447a.f189451c;
        Level a = m149747a(i);
        if (chxh.f189449a.isLoggable(a)) {
            chxh.m149751a(chse, a, str);
        }
        m149748b(i);
    }

    /* renamed from: a */
    public final void mo85553a(int i, String str, Object... objArr) {
        String str2;
        Level a = m149747a(i);
        m149748b(i);
        if (chxh.f189449a.isLoggable(a)) {
            str2 = MessageFormat.format(str, objArr);
        } else {
            str2 = null;
        }
        mo85552a(i, str2);
    }
}
