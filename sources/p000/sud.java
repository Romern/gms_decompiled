package p000;

/* renamed from: sud */
public final /* synthetic */ class sud {
    /* renamed from: a */
    public static int m36341a(sue sue, sue sue2) {
        if (sue == sue2) {
            return 0;
        }
        int compare = Integer.compare(sue.mo26089e(), sue2.mo26089e());
        if (compare != 0) {
            return compare;
        }
        CharSequence d = sue.mo26088d();
        CharSequence d2 = sue2.mo26088d();
        if (d != null && d2 != null) {
            return d.toString().compareToIgnoreCase(d2.toString());
        }
        if (d != d2) {
            return d != null ? 1 : -1;
        }
        return 0;
    }
}
