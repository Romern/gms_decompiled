package p000;

import java.io.PrintWriter;

/* renamed from: bbbh */
public final /* synthetic */ class bbbh implements bqeh {

    /* renamed from: a */
    private final bbch f102275a;

    /* renamed from: b */
    private final PrintWriter f102276b;

    public bbbh(bbch bbch, PrintWriter printWriter) {
        this.f102275a = bbch;
        this.f102276b = printWriter;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbch bbch = this.f102275a;
        PrintWriter printWriter = this.f102276b;
        Void voidR = (Void) obj;
        bbav bbav = bbch.f102317d;
        printWriter.println("==== MDD_FILE_GROUP_MANAGER ====");
        printWriter.println("MDD_FRESH_FILE_GROUPS:");
        return bqdx.m112674a(bqdx.m112673a(bqdx.m112673a(bbav.f102247d.mo56055b(), new baza(printWriter), bbav.f102251h), new bazb(bbav, printWriter), bbav.f102251h), new bbbr(bbch, printWriter), bbch.f102327n);
    }
}
