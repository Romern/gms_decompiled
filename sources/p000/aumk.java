package p000;

import android.content.ContentValues;

/* renamed from: aumk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aumk extends auml {

    /* renamed from: a */
    public static final aumy[] f92082a;

    /* renamed from: b */
    public static final aumm f92083b = new aumj();

    /* renamed from: c */
    public static final aumy f92084c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aumy.<init>(java.lang.String, java.lang.Boolean):void
     arg types: [java.lang.String, int]
     candidates:
      aumy.<init>(java.lang.String, java.lang.String):void
      aumy.<init>(java.lang.String, java.lang.Boolean):void */
    static {
        aumy aumy = new aumy("is_enabled", (Boolean) false);
        f92084c = aumy;
        f92082a = new aumy[]{aumy};
    }

    public aumk(ContentValues contentValues) {
        super("model_id", contentValues);
    }

    public aumk() {
        super("model_id");
    }
}
