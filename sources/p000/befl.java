package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: befl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class befl {

    /* renamed from: a */
    private final befa f111504a;

    /* renamed from: b */
    private final Uri f111505b;

    /* renamed from: c */
    private final Set f111506c;

    public befl(befk befk) {
        this.f111504a = befk.f111501a;
        this.f111505b = befk.f111502b;
        this.f111506c = befk.f111503c;
    }

    /* renamed from: a */
    public static befk m94970a() {
        return new befk();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Iterable], assign insn: 0x0013: INVOKE  (r1v2 ? I:java.lang.Iterable) = (r1v1 befa), (r2v0 android.net.Uri) type: VIRTUAL call: befa.f(android.net.Uri):java.lang.Iterable */
    /* renamed from: b */
    public final void mo60669b() {
        if (this.f111504a.mo60647c(this.f111505b)) {
            ArrayList arrayList = new ArrayList();
            ? f = this.f111504a.mo60650f(this.f111505b);
            int size = f.size();
            for (int i = 0; i < size; i++) {
                Uri uri = (Uri) f.get(i);
                if (!this.f111506c.contains(befd.m94935a(uri.getPathSegments().get(2)))) {
                    try {
                        this.f111504a.mo60643a(uri, new beht(), new beer[0]);
                    } catch (IOException e) {
                        arrayList.add(e);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                throw behc.m95040a("Failed to delete one or more account files", arrayList);
            }
        }
    }
}
