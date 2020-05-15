package p000;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: azf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azf {

    /* renamed from: a */
    private final List f2627a = new ArrayList();

    /* renamed from: a */
    public final void mo2928a(Path path) {
        for (int size = this.f2627a.size() - 1; size >= 0; size--) {
            ben.m2836a(path, (azw) this.f2627a.get(size));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2929a(azw azw) {
        this.f2627a.add(azw);
    }
}
