package p000;

import java.io.InvalidObjectException;

/* renamed from: bhuo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhuo {
    /* renamed from: a */
    public static bhun m101566a(bvmk bvmk) {
        int i = 1;
        if (bvmk.f156747a.size() == 1) {
            bvpf bvpf = (bvpf) bvmk.f156747a.get(0);
            bhum bhum = new bhum();
            int a = bvmh.m121257a(bvmk.f156748b);
            if (a != 0) {
                i = a;
            }
            bhun bhun = new bhun(bvpf, i, bhum);
            if (bhun.f119643b != null && !bhun.f119642a.isEmpty()) {
                return bhun;
            }
            bhuj.m101555a().mo64361c("Invalid model");
            throw new InvalidObjectException("Failed to load model");
        }
        throw new InvalidObjectException("No model weights found in proto");
    }
}
