package p000;

/* renamed from: cbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbw extends cbt {
    /* JADX WARNING: Illegal instructions before constructor call */
    public cbw(Class cls) {
        super(r1.toString());
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 227);
        sb.append("Failed to find result encoder for resource class: ");
        sb.append(valueOf);
        sb.append(", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
    }
}
