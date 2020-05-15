package p000;

/* renamed from: een */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class een {

    /* renamed from: a */
    public final StringBuilder f14784a;

    /* renamed from: b */
    public boolean f14785b = false;

    public een(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        this.f14784a = sb;
        sb.append("CREATE INDEX ");
        this.f14784a.append("IF NOT EXISTS ");
        this.f14784a.append(str2);
        this.f14784a.append(" ON ");
        this.f14784a.append(str);
        this.f14784a.append(" (");
    }
}
