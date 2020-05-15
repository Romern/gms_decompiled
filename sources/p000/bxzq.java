package p000;

import java.util.Comparator;

/* renamed from: bxzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxzq implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        bxun bxun = (bxun) obj;
        bxun bxun2 = (bxun) obj2;
        bxzr.m124577b(bxun);
        bxzr.m124577b(bxun2);
        long j = bxun.f164863a;
        long j2 = bxun2.f164863a;
        return j == j2 ? Integer.compare(bxun.f164864b, bxun2.f164864b) : (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }
}
