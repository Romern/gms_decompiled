package p000;

import android.util.Pair;
import java.io.PrintWriter;
import java.util.List;

/* renamed from: baza */
final /* synthetic */ class baza implements bmxj {

    /* renamed from: a */
    private final PrintWriter f102139a;

    public baza(PrintWriter printWriter) {
        this.f102139a = printWriter;
    }

    public final Object apply(Object obj) {
        PrintWriter printWriter = this.f102139a;
        for (Pair pair : (List) obj) {
            printWriter.format("GroupName: %s\nDataFileGroup:\n %s\n\n", ((bavr) pair.first).f101919b, ((bavd) pair.second).toString());
        }
        return null;
    }
}
