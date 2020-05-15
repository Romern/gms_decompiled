package p000;

import java.util.List;

/* renamed from: lsg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lsg extends lsu {

    /* renamed from: a */
    public final String f32835a;

    /* renamed from: b */
    public final int f32836b;

    /* renamed from: c */
    public final List f32837c;

    public lsg(String str, int i, List list) {
        if (str != null) {
            this.f32835a = str;
            this.f32836b = i;
            if (list != null) {
                this.f32837c = list;
                return;
            }
            throw new NullPointerException("Null value");
        }
        throw new NullPointerException("Null key");
    }

    /* renamed from: a */
    public final String mo19580a() {
        return this.f32835a;
    }

    /* renamed from: b */
    public final int mo19581b() {
        return this.f32836b;
    }

    /* renamed from: c */
    public final List mo19582c() {
        return this.f32837c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lsu) {
            lsu lsu = (lsu) obj;
            return this.f32835a.equals(lsu.mo19580a()) && this.f32836b == lsu.mo19581b() && this.f32837c.equals(lsu.mo19582c());
        }
    }

    public final int hashCode() {
        return ((((this.f32835a.hashCode() ^ 1000003) * 1000003) ^ this.f32836b) * 1000003) ^ this.f32837c.hashCode();
    }

    public final String toString() {
        String str = this.f32835a;
        int i = this.f32836b;
        String valueOf = String.valueOf(this.f32837c);
        StringBuilder sb = new StringBuilder(str.length() + 58 + String.valueOf(valueOf).length());
        sb.append("BackupKeyValueEntry{key=");
        sb.append(str);
        sb.append(", valueLength=");
        sb.append(i);
        sb.append(", value=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
