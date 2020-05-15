package p000;

import android.util.Pair;
import java.nio.file.Path;
import java.util.Comparator;

/* renamed from: bfbs */
public final /* synthetic */ class bfbs implements Comparator {

    /* renamed from: a */
    public static final Comparator f113340a = new bfbs();

    private bfbs() {
    }

    public final int compare(Object obj, Object obj2) {
        String str = bfbv.f113342a;
        return bfbv.m96318a((Path) ((Pair) obj).first).compareTo(bfbv.m96318a((Path) ((Pair) obj2).first));
    }
}
