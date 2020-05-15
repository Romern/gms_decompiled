package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bhui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhui implements bhwo {

    /* renamed from: a */
    private final Logger f119640a = Logger.getAnonymousLogger();

    /* renamed from: a */
    public final void mo64312a(String str, String str2) {
        Logger logger = this.f119640a;
        Level level = Level.INFO;
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        logger.logp(level, "com.google.android.places.inference.logging.LoggerProvider$SimpleLogger", "i", sb.toString());
    }

    /* renamed from: b */
    public final void mo64314b(String str, String str2) {
        Logger logger = this.f119640a;
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        logger.logp(level, "com.google.android.places.inference.logging.LoggerProvider$SimpleLogger", "w", sb.toString());
    }

    /* renamed from: c */
    public final void mo64315c(String str, String str2) {
        Logger logger = this.f119640a;
        Level level = Level.SEVERE;
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        logger.logp(level, "com.google.android.places.inference.logging.LoggerProvider$SimpleLogger", "e", sb.toString());
    }

    /* renamed from: d */
    public final void mo64316d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        String sb2 = sb.toString();
        this.f119640a.logp(Level.SEVERE, "com.google.android.places.inference.logging.LoggerProvider$SimpleLogger", "wtf", sb2);
        throw new RuntimeException(sb2);
    }

    /* renamed from: a */
    public final void mo64313a(String str, String str2, Throwable th) {
        Logger logger = this.f119640a;
        Level level = Level.SEVERE;
        String valueOf = String.valueOf(th);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 5 + str2.length() + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        sb.append(" - ");
        sb.append(valueOf);
        logger.logp(level, "com.google.android.places.inference.logging.LoggerProvider$SimpleLogger", "e", sb.toString());
    }
}
