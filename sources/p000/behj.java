package p000;

/* renamed from: behj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class behj implements beez {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo14941a(beey beey) {
        if (!beey.mo60640a()) {
            return new behi(beey.f111467a, beey.f111471e);
        }
        String valueOf = String.valueOf(beey.f111471e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("Transforms are not supported by this Opener: ");
        sb.append(valueOf);
        throw new begy(sb.toString());
    }
}
