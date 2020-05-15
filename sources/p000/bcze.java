package p000;

/* renamed from: bcze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcze {

    /* renamed from: a */
    private Integer f105171a;

    /* renamed from: b */
    private Float f105172b;

    /* renamed from: a */
    public final bczf mo57778a() {
        String str = this.f105171a == null ? " lineColor" : "";
        if (this.f105172b == null) {
            str = str.concat(" lineWidth");
        }
        if (str.isEmpty()) {
            return new bcyp(this.f105171a.intValue(), this.f105172b.floatValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: a */
    public final void mo57779a(float f) {
        this.f105172b = Float.valueOf(f);
    }

    /* renamed from: a */
    public final void mo57780a(int i) {
        this.f105171a = Integer.valueOf(i);
    }
}
