package p000;

/* renamed from: gqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gqb {
    /* renamed from: a */
    public static final gnz m13700a(String str) {
        String valueOf = String.valueOf(str);
        return new gqe(valueOf.length() == 0 ? new String("perm.") : "perm.".concat(valueOf));
    }

    /* renamed from: b */
    public static final gnz m13701b(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
        sb.append("perm.");
        sb.append(str);
        sb.append(".all_circles_visible");
        return new gqe(sb.toString());
    }

    /* renamed from: c */
    public static final gnz m13702c(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("perm.");
        sb.append(str);
        sb.append(".all_contacts_visible");
        return new gqe(sb.toString());
    }

    /* renamed from: d */
    public static final gnz m13703d(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("perm.");
        sb.append(str);
        sb.append(".has_show_circles");
        return new gqe(sb.toString());
    }

    /* renamed from: e */
    public static final gnz m13704e(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18);
        sb.append("perm.");
        sb.append(str);
        sb.append(".show_circles");
        return new gqe(sb.toString());
    }

    /* renamed from: f */
    public static final gnz m13705f(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19);
        sb.append("perm.");
        sb.append(str);
        sb.append(".show_contacts");
        return new gqe(sb.toString());
    }

    /* renamed from: g */
    public static final gnz m13706g(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 19);
        sb.append("perm.");
        sb.append(str);
        sb.append(".visible_graph");
        return new gqi(sb.toString());
    }

    /* renamed from: h */
    public static final gnz m13707h(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 15);
        sb.append("perm.");
        sb.append(str);
        sb.append(".pacl.data");
        return new gqi(sb.toString());
    }

    /* renamed from: i */
    public static final gnz m13708i(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("perm.");
        sb.append(str);
        sb.append(".pacl.visible_actions");
        return new gqi(sb.toString());
    }
}
