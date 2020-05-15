package p000;

import java.io.PrintWriter;

/* renamed from: bazb */
final /* synthetic */ class bazb implements bmxj {

    /* renamed from: a */
    private final bbav f102140a;

    /* renamed from: b */
    private final PrintWriter f102141b;

    public bazb(bbav bbav, PrintWriter printWriter) {
        this.f102140a = bbav;
        this.f102141b = printWriter;
    }

    public final Object apply(Object obj) {
        bbav bbav = this.f102140a;
        PrintWriter printWriter = this.f102141b;
        Void voidR = (Void) obj;
        printWriter.println("MDD_STALE_FILE_GROUPS:");
        for (bavd bavd : bbav.f102247d.mo56058c()) {
            printWriter.format("GroupName: %s\nDataFileGroup:\n%s\n", bavd.f101873c, bavd.toString());
        }
        return null;
    }
}
