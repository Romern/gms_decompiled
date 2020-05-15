package p000;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cbar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbar {

    /* renamed from: a */
    private static final Logger f176483a = Logger.getLogger(cbar.class.getName());

    private cbar() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.RuntimeException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: a */
    public static cbak m127678a(cijl cijl, cijl cijl2) {
        cbaj cbaj;
        try {
            Collection collection = (Collection) ((cayz) cijl2).f176439a;
            if (!collection.isEmpty()) {
                cbaj = collection.size() == 1 ? new cbap((cbaj) bnjd.m109587b(collection)) : new cbam(collection);
            } else {
                cbaj = cbaj.f176475a;
            }
            return cbaj.mo75223a(((cayz) cijl).f176439a);
        } catch (RuntimeException e) {
            f176483a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "createMonitorForComponent", "RuntimeException while constructing monitor factories.", (Throwable) e);
            return cbak.f176476a;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.RuntimeException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: a */
    public static void m127679a(RuntimeException runtimeException, cbaf cbaf, String str) {
        Logger logger = f176483a;
        Level level = Level.SEVERE;
        String valueOf = String.valueOf(cbaf);
        StringBuilder sb = new StringBuilder(str.length() + 59 + String.valueOf(valueOf).length());
        sb.append("RuntimeException while calling ProducerMonitor.");
        sb.append(str);
        sb.append(" on monitor ");
        sb.append(valueOf);
        logger.logp(level, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorMethodException", sb.toString(), (Throwable) runtimeException);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.RuntimeException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: a */
    public static void m127680a(RuntimeException runtimeException, cbaf cbaf, String str, Object obj) {
        Logger logger = f176483a;
        Level level = Level.SEVERE;
        String valueOf = String.valueOf(cbaf);
        String valueOf2 = String.valueOf(obj);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 65 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("RuntimeException while calling ProducerMonitor.");
        sb.append(str);
        sb.append(" on monitor ");
        sb.append(valueOf);
        sb.append(" with ");
        sb.append(valueOf2);
        logger.logp(level, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorArgMethodException", sb.toString(), (Throwable) runtimeException);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.RuntimeException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: a */
    public static void m127681a(RuntimeException runtimeException, cbaj cbaj, Object obj) {
        Logger logger = f176483a;
        Level level = Level.SEVERE;
        String valueOf = String.valueOf(cbaj);
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 100 + String.valueOf(valueOf2).length());
        sb.append("RuntimeException while calling ProductionComponentMonitor.Factory.create on factory ");
        sb.append(valueOf);
        sb.append(" with component ");
        sb.append(valueOf2);
        logger.logp(level, "dagger.producers.monitoring.internal.Monitors", "logCreateException", sb.toString(), (Throwable) runtimeException);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.RuntimeException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: a */
    public static void m127682a(RuntimeException runtimeException, cbak cbak, cbag cbag) {
        Logger logger = f176483a;
        Level level = Level.SEVERE;
        String valueOf = String.valueOf(cbak);
        String valueOf2 = String.valueOf(cbag);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 100 + String.valueOf(valueOf2).length());
        sb.append("RuntimeException while calling ProductionComponentMonitor.producerMonitorFor on monitor ");
        sb.append(valueOf);
        sb.append(" with token ");
        sb.append(valueOf2);
        logger.logp(level, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorForException", sb.toString(), (Throwable) runtimeException);
    }
}
