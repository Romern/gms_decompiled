package p000;

import java.util.concurrent.ExecutionException;

/* renamed from: apmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apmp implements acpw {

    /* renamed from: a */
    private final aucb f84733a;

    public apmp(aucb aucb) {
        this.f84733a = aucb;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ Object mo32295h() {
        try {
            aucu.m76782a(this.f84733a);
            return null;
        } catch (InterruptedException | ExecutionException e) {
            return e.toString();
        }
    }
}
