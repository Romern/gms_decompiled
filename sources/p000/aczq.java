package p000;

import java.security.KeyStore;

/* renamed from: aczq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aczq {

    /* renamed from: a */
    private final KeyStore f61171a;

    public aczq() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.f61171a = instance;
            instance.load(null);
        } catch (RuntimeException e) {
            throw new aczp("Unable to access Android KeyStore", e);
        }
    }

    /* renamed from: a */
    public final boolean mo33278a(String str) {
        try {
            return this.f61171a.containsAlias(str);
        } catch (RuntimeException e) {
            throw new aczp("Error looking up Android KeyStore key", e);
        }
    }

    /* renamed from: c */
    public final KeyStore.Entry mo33280c(String str) {
        try {
            return this.f61171a.getEntry(str, null);
        } catch (RuntimeException e) {
            throw new aczp("Unable to get KeyStore Entry", e);
        }
    }

    /* renamed from: b */
    public final void mo33279b(String str) {
        try {
            this.f61171a.deleteEntry(str);
        } catch (RuntimeException e) {
            throw new aczp("Error deleting KeyStore Entry", e);
        }
    }
}
