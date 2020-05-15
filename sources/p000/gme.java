package p000;

/* renamed from: gme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gme implements gmd, gmt {

    /* renamed from: a */
    private final String f18625a;

    public gme(String str) {
        sdo.m34977c(str);
        this.f18625a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12048a(gmg gmg) {
        try {
            return Long.valueOf((String) gmg.f18627r.get(this.f18625a));
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
