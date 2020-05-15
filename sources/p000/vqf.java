package p000;

/* renamed from: vqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vqf {

    /* renamed from: a */
    public final boolean f49789a;

    /* renamed from: b */
    public final int f49790b;

    private vqf(int i, boolean z) {
        this.f49790b = i;
        this.f49789a = z;
    }

    /* renamed from: a */
    public static vqf m41045a(int i) {
        return new vqf(i, false);
    }

    /* renamed from: b */
    public static vqf m41046b(int i) {
        return new vqf(i, true);
    }

    public final String toString() {
        String a = vqg.m41047a(this.f49790b);
        boolean z = this.f49789a;
        StringBuilder sb = new StringBuilder(a.length() + 35);
        sb.append("Transition{type=");
        sb.append(a);
        sb.append(", audioBased=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }
}
