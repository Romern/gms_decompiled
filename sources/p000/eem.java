package p000;

/* renamed from: eem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eem {

    /* renamed from: a */
    public final StringBuilder f14783a;

    public eem(String str) {
        StringBuilder sb = new StringBuilder();
        this.f14783a = sb;
        sb.append("DROP INDEX ");
        this.f14783a.append("IF EXISTS ");
        this.f14783a.append(str);
    }
}
