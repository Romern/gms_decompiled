package p000;

import java.util.EnumMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cigk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cigk {

    /* renamed from: a */
    public final Logger f190140a;

    /* renamed from: b */
    public final Level f190141b;

    public cigk(Level level, Class cls) {
        Logger logger = Logger.getLogger(cls.getName());
        bmxy.m108582a(level, "level");
        this.f190141b = level;
        bmxy.m108582a(logger, "logger");
        this.f190140a = logger;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: a */
    private static String m150240a(cipu cipu) {
        long j = cipu.f191213b;
        if (j > 64) {
            return String.valueOf(cipu.mo86290b((int) Math.min(j, 64L)).mo86342c()).concat("...");
        }
        return cipu.mo86329o().mo86342c();
    }

    /* renamed from: a */
    public final void mo86067a(int i, int i2, long j) {
        if (mo86073a()) {
            Logger logger = this.f190140a;
            Level level = this.f190141b;
            String a = cigi.m150239a(i);
            StringBuilder sb = new StringBuilder(a.length() + 77);
            sb.append(a);
            sb.append(" WINDOW_UPDATE: streamId=");
            sb.append(i2);
            sb.append(" windowSizeIncrement=");
            sb.append(j);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo86068a(int i, int i2, cihm cihm) {
        if (mo86073a()) {
            Logger logger = this.f190140a;
            Level level = this.f190141b;
            String a = cigi.m150239a(i);
            String valueOf = String.valueOf(cihm);
            StringBuilder sb = new StringBuilder(a.length() + 44 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(" RST_STREAM: streamId=");
            sb.append(i2);
            sb.append(" errorCode=");
            sb.append(valueOf);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo86069a(int i, int i2, cihm cihm, cipx cipx) {
        if (mo86073a()) {
            Logger logger = this.f190140a;
            Level level = this.f190141b;
            String a = cigi.m150239a(i);
            String valueOf = String.valueOf(cihm);
            int e = cipx.mo86345e();
            cipu cipu = new cipu();
            cipu.mo86292b(cipx);
            String a2 = m150240a(cipu);
            int length = a.length();
            StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(valueOf).length() + String.valueOf(a2).length());
            sb.append(a);
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i2);
            sb.append(" errorCode=");
            sb.append(valueOf);
            sb.append(" length=");
            sb.append(e);
            sb.append(" bytes=");
            sb.append(a2);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo86070a(int i, int i2, cipu cipu, int i3, boolean z) {
        if (mo86073a()) {
            Logger logger = this.f190140a;
            Level level = this.f190141b;
            String a = cigi.m150239a(i);
            String a2 = m150240a(cipu);
            StringBuilder sb = new StringBuilder(a.length() + 69 + String.valueOf(a2).length());
            sb.append(a);
            sb.append(" DATA: streamId=");
            sb.append(i2);
            sb.append(" endStream=");
            sb.append(z);
            sb.append(" length=");
            sb.append(i3);
            sb.append(" bytes=");
            sb.append(a2);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logData", sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo86071a(int i, long j) {
        if (mo86073a()) {
            Logger logger = this.f190140a;
            Level level = this.f190141b;
            String a = cigi.m150239a(i);
            StringBuilder sb = new StringBuilder(a.length() + 43);
            sb.append(a);
            sb.append(" PING: ack=false bytes=");
            sb.append(j);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", sb.toString());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [cigj, java.lang.Integer]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* renamed from: a */
    public final void mo86072a(int i, ciia ciia) {
        if (mo86073a()) {
            Logger logger = this.f190140a;
            Level level = this.f190141b;
            String a = cigi.m150239a(i);
            EnumMap enumMap = new EnumMap(cigj.class);
            cigj[] values = cigj.values();
            for (cigj cigj : values) {
                if (ciia.mo86132a(cigj.f190139g)) {
                    enumMap.put((Enum) cigj, (Object) Integer.valueOf(ciia.mo86133b(cigj.f190139g)));
                }
            }
            String enumMap2 = enumMap.toString();
            StringBuilder sb = new StringBuilder(a.length() + 30 + String.valueOf(enumMap2).length());
            sb.append(a);
            sb.append(" SETTINGS: ack=false settings=");
            sb.append(enumMap2);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", sb.toString());
        }
    }

    /* renamed from: a */
    public final boolean mo86073a() {
        return this.f190140a.isLoggable(this.f190141b);
    }
}
