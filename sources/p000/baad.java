package p000;

import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: baad */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class baad implements Callable {

    /* renamed from: a */
    private final azzy f100360a;

    /* renamed from: b */
    private final baab f100361b;

    /* renamed from: c */
    private final baac f100362c;

    public baad(azzy azzy, baab baab, baac baac) {
        this.f100360a = azzy;
        this.f100361b = baab;
        this.f100362c = baac;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        mo55542a();
        return null;
    }

    /* renamed from: a */
    public final void mo55542a() {
        try {
            this.f100360a.mo55540a(this.f100361b, this.f100362c);
        } catch (IOException e) {
            throw new azzp(3, "Exception occurred while adding Broadcast subscription", e);
        }
    }
}
