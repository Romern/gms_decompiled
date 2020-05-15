package p000;

import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: baaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baaf implements Callable {

    /* renamed from: a */
    private final azzy f100364a;

    /* renamed from: b */
    private final baab f100365b;

    public baaf(azzy azzy, baab baab) {
        this.f100364a = azzy;
        this.f100365b = baab;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        mo55544a();
        return null;
    }

    /* renamed from: a */
    public final void mo55544a() {
        try {
            this.f100364a.mo55539a(this.f100365b);
        } catch (IOException e) {
            throw new azzp(3, "Exception occurred while removing Broadcast subscription", e);
        }
    }
}
