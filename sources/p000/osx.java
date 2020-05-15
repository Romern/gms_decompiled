package p000;

import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: osx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class osx extends ouw {

    /* renamed from: a */
    private final Closeable f38371a;

    public osx(Closeable closeable) {
        this.f38371a = closeable;
    }

    /* renamed from: a */
    public final void mo22595a() {
        try {
            this.f38371a.close();
        } catch (IOException e) {
            bnsi c = CarSetupServiceImpl.f29560a.mo68388c();
            c.mo68437a(e);
            c.mo68432a("osx", "a", 1833, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Failed to close connection.");
        }
    }
}
