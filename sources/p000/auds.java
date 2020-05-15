package p000;

/* renamed from: auds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auds extends auej {

    /* renamed from: a */
    public final int f91426a;

    public auds(String str) {
        super(str);
        str.contains("dtmf");
        str.contains("3gpp-ims");
        this.f91426a = (str.length() - str.replace(",", "").length()) + 1;
        if (!str.contains("application")) {
            mo50487b();
        }
    }
}
