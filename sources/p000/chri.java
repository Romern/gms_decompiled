package p000;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: chri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chri {

    /* renamed from: a */
    static final chrj f189035a;

    static {
        chrj chrj;
        AtomicReference atomicReference = new AtomicReference();
        try {
            chrj = (chrj) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(chrj.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            chrj = new chvd();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        f189035a = chrj;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            chrk.f189036a.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
