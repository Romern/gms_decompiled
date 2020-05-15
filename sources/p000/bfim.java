package p000;

/* renamed from: bfim */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfim {

    /* renamed from: a */
    public final short[] f114017a;

    /* renamed from: b */
    public final float[] f114018b;

    /* renamed from: c */
    public int f114019c = 0;

    /* renamed from: d */
    public int f114020d = 0;

    /* renamed from: e */
    private final int f114021e;

    public bfim(int i, Class cls) {
        if (cls == Float.class) {
            this.f114018b = new float[i];
            this.f114017a = new short[0];
        } else if (cls == Short.class) {
            this.f114018b = new float[0];
            this.f114017a = new short[i];
        } else {
            String valueOf = String.valueOf(cls);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Does not support ");
            sb.append(valueOf);
            sb.append(" class.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f114021e = i;
    }

    /* renamed from: a */
    public final int mo61729a(int i) {
        return (this.f114019c + i) % this.f114021e;
    }

    /* renamed from: b */
    public final void mo61731b(int i) {
        int i2 = this.f114020d + i;
        this.f114020d = i2;
        int i3 = this.f114021e;
        if (i2 > i3) {
            this.f114019c = mo61729a(i2 % i3);
            this.f114020d = this.f114021e;
        }
    }

    /* renamed from: c */
    public final void mo61732c(int i) {
        this.f114019c = mo61729a(i);
        this.f114020d -= i;
    }

    /* renamed from: a */
    public final void mo61730a(int i, int i2, int i3) {
        boolean z = true;
        bmxy.m108588a(i2 >= 0 && i2 <= this.f114021e);
        bmxy.m108588a(i >= 0);
        if (i + i2 > i3) {
            z = false;
        }
        bmxy.m108588a(z);
    }
}
