package p000;

/* renamed from: bubh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bubh extends bumn {

    /* renamed from: e */
    private bubg f153224e;

    /* renamed from: a */
    public final bubg entrySet() {
        if (this.f153224e == null) {
            this.f153224e = new bubg(this);
        }
        return this.f153224e;
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return mo72615a(((Long) obj).longValue(), 0, (byte[]) obj2);
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        int c;
        if (!(obj instanceof Long) || (c = ((btzl) this.f153157d).mo72496c(((Long) obj).longValue())) == -1) {
            return null;
        }
        byte[][] bArr = this.f154251b;
        byte[] bArr2 = bArr[c];
        bArr[c] = null;
        return bArr2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo72511a(Object obj, boolean z) {
        if (obj instanceof Long) {
            return mo72616a(((Long) obj).longValue(), z);
        }
        return null;
    }

    /* renamed from: a */
    public final byte[] mo72615a(long j, long j2, byte[] bArr) {
        byte[] bArr2;
        if (bArr != null) {
            int b = ((btzl) this.f153157d).mo72492b(j);
            if (b >= 0) {
                bArr2 = this.f154251b[b];
            } else {
                b ^= -1;
                bArr2 = null;
            }
            ((bumn) this).f154250a[b] = j2;
            this.f154251b[b] = bArr;
            return bArr2;
        }
        throw new NullPointerException("The value must not be null.");
    }

    /* renamed from: a */
    public final byte[] mo72616a(long j, boolean z) {
        int b = ((btzl) this.f153157d).mo72493b(j, z);
        if (b >= 0) {
            return this.f154251b[b];
        }
        return null;
    }
}
