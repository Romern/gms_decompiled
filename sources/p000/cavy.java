package p000;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cavy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cavy extends cavc {

    /* renamed from: b */
    final /* synthetic */ cawg f176189b;

    /* renamed from: c */
    final /* synthetic */ cawb f176190c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cavy(cawb cawb, String str, Object[] objArr, cawg cawg) {
        super(str, objArr);
        this.f176190c = cawb;
        this.f176189b = cawg;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.io.IOException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: a */
    public final void mo74949a() {
        try {
            this.f176189b.mo75002a(cavl.REFUSED_STREAM);
        } catch (IOException e) {
            IOException iOException = e;
            Logger logger = cavb.f176115a;
            Level level = Level.INFO;
            String valueOf = String.valueOf(this.f176190c.f176194c.f176199e);
            logger.logp(level, "com.squareup.okhttp.internal.framed.FramedConnection$Reader$1", "execute", valueOf.length() == 0 ? new String("FramedConnection.Listener failure for ") : "FramedConnection.Listener failure for ".concat(valueOf), (Throwable) iOException);
            try {
                this.f176189b.mo75002a(cavl.PROTOCOL_ERROR);
            } catch (IOException e2) {
            }
        }
    }
}
