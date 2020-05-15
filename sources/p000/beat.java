package p000;

import java.io.Serializable;

/* renamed from: beat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beat implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    public int f106841a = 0;

    /* renamed from: b */
    public long f106842b = 0;

    /* renamed from: c */
    public boolean f106843c;

    /* renamed from: d */
    public String f106844d = "";

    /* renamed from: e */
    public boolean f106845e = false;

    /* renamed from: f */
    public int f106846f = 1;

    /* renamed from: g */
    public boolean f106847g;

    /* renamed from: h */
    public final String f106848h = "";

    /* renamed from: i */
    public final String f106849i = "";

    /* renamed from: j */
    private boolean f106850j;

    /* renamed from: k */
    private boolean f106851k;

    /* renamed from: a */
    public final void mo58503a() {
        this.f106850j = true;
        this.f106845e = true;
    }

    /* renamed from: a */
    public final void mo58504a(int i) {
        this.f106851k = true;
        this.f106846f = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof beat) && mo58506a((beat) obj);
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f106841a + 2173) * 53) + Long.valueOf(this.f106842b).hashCode()) * 53) + this.f106844d.hashCode()) * 53;
        if (!this.f106845e) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((((((((hashCode + i) * 53) + this.f106846f) * 53) + this.f106848h.hashCode()) * 53) + 5) * 53) + this.f106849i.hashCode()) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Country Code: ");
        sb.append(this.f106841a);
        sb.append(" National Number: ");
        sb.append(this.f106842b);
        if (this.f106850j && this.f106845e) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.f106851k) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.f106846f);
        }
        if (this.f106843c) {
            sb.append(" Extension: ");
            sb.append(this.f106844d);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo58505a(String str) {
        if (str != null) {
            this.f106843c = true;
            this.f106844d = str;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final boolean mo58506a(beat beat) {
        if (beat == null) {
            return false;
        }
        if (this != beat) {
            return this.f106841a == beat.f106841a && this.f106842b == beat.f106842b && this.f106844d.equals(beat.f106844d) && this.f106845e == beat.f106845e && this.f106846f == beat.f106846f && this.f106848h.equals(beat.f106848h) && this.f106849i.equals(beat.f106849i);
        }
        return true;
    }
}
