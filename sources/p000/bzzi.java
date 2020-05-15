package p000;

/* renamed from: bzzi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzzi {
    DEFAULT,
    DETAILED;
    

    /* renamed from: c */
    public final String f171976c;

    private bzzi() {
        String valueOf = String.valueOf(name());
        this.f171976c = valueOf.length() == 0 ? new String("com.google.fitness.activity.") : "com.google.fitness.activity.".concat(valueOf);
    }
}
