package p000;

/* renamed from: blic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blic extends bqdt {

    /* renamed from: a */
    private blie f126600a;

    /* renamed from: b */
    private final int f126601b;

    public blic(blie blie, int i) {
        this.f126600a = blie;
        this.f126601b = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public final void mo19850bc() {
        long j;
        int i;
        int a;
        blid blid;
        blie blie = this.f126600a;
        this.f126600a = null;
        if (blie != null) {
            do {
                j = blie.f126604b.get();
                i = (int) j;
                a = blie.m107191a(j);
                if (i == Integer.MIN_VALUE) {
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Refcount is: ");
                    sb.append(j);
                    throw new AssertionError(sb.toString());
                } else if (i == -2147483647) {
                    a++;
                }
            } while (!blie.f126604b.compareAndSet(j, blie.m107192a(a, i - 1)));
            if (i == -2147483647) {
                do {
                    blid = (blid) blie.f126605c.get();
                    if (blid != null && blid.f126602a <= this.f126601b) {
                        blid.cancel(true);
                    } else {
                        return;
                    }
                } while (!blie.f126605c.compareAndSet(blid, null));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: bi */
    public final String mo60815bi() {
        bqeg bqeg;
        blie blie = this.f126600a;
        String str = null;
        if (!(blie == null || (bqeg = blie.f126603a.f126598a) == null)) {
            String valueOf = String.valueOf(bqeg);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
            sb.append("callable=[");
            sb.append(valueOf);
            sb.append("]");
            str = sb.toString();
            blid blid = (blid) this.f126600a.f126605c.get();
            if (blid != null) {
                String valueOf2 = String.valueOf(str);
                String valueOf3 = String.valueOf(blid);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 10 + String.valueOf(valueOf3).length());
                sb2.append(valueOf2);
                sb2.append(", trial=[");
                sb2.append(valueOf3);
                sb2.append("]");
                return sb2.toString();
            }
        }
        return str;
    }
}
