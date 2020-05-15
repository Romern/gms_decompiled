package p000;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ciqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciqg extends cipr {

    /* renamed from: a */
    final /* synthetic */ Socket f191238a;

    public ciqg(Socket socket) {
        this.f191238a = socket;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final IOException mo74998a(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.AssertionError]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Exception]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo74999a() {
        try {
            this.f191238a.close();
        } catch (Exception e) {
            Logger logger = ciqh.f191239a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(this.f191238a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Failed to close timed out socket ");
            sb.append(valueOf);
            logger.logp(level, "okio.Okio$4", "timedOut", sb.toString(), (Throwable) e);
        } catch (AssertionError e2) {
            AssertionError assertionError = e2;
            if (ciqh.m150835a(assertionError)) {
                Logger logger2 = ciqh.f191239a;
                Level level2 = Level.WARNING;
                String valueOf2 = String.valueOf(this.f191238a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
                sb2.append("Failed to close timed out socket ");
                sb2.append(valueOf2);
                logger2.logp(level2, "okio.Okio$4", "timedOut", sb2.toString(), (Throwable) assertionError);
                return;
            }
            throw assertionError;
        }
    }
}
