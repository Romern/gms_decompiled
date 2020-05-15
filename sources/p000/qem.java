package p000;

import android.os.DropBoxManager;

/* renamed from: qem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class qem {

    /* renamed from: a */
    private final StringBuilder f41077a = new StringBuilder();

    /* renamed from: b */
    private final int f41078b;

    /* renamed from: c */
    private final DropBoxManager f41079c;

    public qem(DropBoxManager dropBoxManager, int i) {
        this.f41079c = dropBoxManager;
        this.f41078b = i;
    }

    /* renamed from: a */
    public final void mo23987a() {
        String sb = this.f41077a.toString();
        if (sb.length() > 0) {
            this.f41079c.addText("event_log", sb);
        }
        this.f41077a.setLength(0);
    }

    /* renamed from: a */
    public final void mo23988a(String str) {
        if (this.f41077a.length() + str.length() > this.f41078b) {
            mo23987a();
        }
        this.f41077a.append(str);
    }
}
