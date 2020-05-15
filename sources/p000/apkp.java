package p000;

import java.io.PrintWriter;

/* renamed from: apkp */
public final /* synthetic */ class apkp {
    /* renamed from: a */
    public static void m70538a(PrintWriter printWriter, int i) {
        boolean z;
        printWriter.append((CharSequence) "Waiting for: ");
        if (i != 0) {
            if ((i & 2) == 2) {
                printWriter.append((CharSequence) "ANY_DATA");
                z = false;
            } else {
                z = true;
            }
            if ((i & 1) == 1) {
                if (!z) {
                    printWriter.append((CharSequence) " | ");
                }
                printWriter.append((CharSequence) "UNMETERED_DATA");
            }
            printWriter.append((CharSequence) "\n");
            return;
        }
        printWriter.append((CharSequence) "nothing\n");
    }
}
