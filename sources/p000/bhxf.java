package p000;

/* renamed from: bhxf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhxf {

    /* renamed from: a */
    public float f119798a;

    /* renamed from: b */
    public long f119799b = 0;

    /* renamed from: c */
    public bhuh f119800c = new bhuh(0.0d, 0.0d, 0.0d);

    /* renamed from: d */
    public bhts f119801d;

    /* renamed from: e */
    public bhuh f119802e = new bhuh(0.0d, 0.0d, 0.0d);

    /* renamed from: f */
    private bhuh f119803f;

    /* renamed from: g */
    private long f119804g = 0;

    /* renamed from: h */
    private final int[] f119805h = {0, 0, 0, 0};

    /* renamed from: i */
    private int f119806i = 0;

    /* renamed from: j */
    private int f119807j = 0;

    /* renamed from: a */
    public final long mo64383a() {
        return this.f119804g - this.f119799b;
    }

    /* renamed from: b */
    public final boolean mo64385b() {
        return this.f119798a == 0.0f;
    }

    /* renamed from: c */
    public final long mo64386c() {
        if (this.f119803f != null) {
            return this.f119804g;
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c4  */
    /* renamed from: a */
    public final void mo64384a(bhtx bhtx) {
        String str;
        bhwr bhwr;
        String str2;
        bhtx bhtx2 = bhtx;
        if (this.f119801d == null) {
            this.f119801d = new bhts();
        }
        bhuh a = bhuh.m101543a(bhtx2.f119580a);
        bhub bhub = bhtx2.f119580a;
        int i = bhub.f119609e;
        long j = bhub.f119610f;
        if (mo64385b()) {
            this.f119799b = j;
        }
        float a2 = bhxd.m101691a(i);
        this.f119798a += a2;
        int[] iArr = this.f119805h;
        boolean z = true;
        iArr[i] = iArr[i] + 1;
        bhuh a3 = bhuh.m101544a(bhuh.m101547b(a, this.f119800c), (double) a2);
        bhuh a4 = bhuh.m101545a(this.f119800c, bhuh.m101546b(a3, (double) this.f119798a));
        this.f119800c = a4;
        this.f119802e = bhuh.m101545a(this.f119802e, bhuh.m101548c(a3, bhuh.m101547b(a, a4)));
        this.f119803f = a;
        this.f119804g = j;
        int i2 = this.f119806i + 1;
        this.f119806i = i2;
        int i3 = this.f119807j;
        this.f119807j = i3 + ((bhtx2.f119580a.f119607c - i3) / i2);
        bhts bhts = this.f119801d;
        int i4 = 1;
        int i5 = 0;
        while (true) {
            int[] iArr2 = this.f119805h;
            if (i4 >= iArr2.length) {
                break;
            }
            if (iArr2[i4] > iArr2[i5]) {
                i5 = i4;
            }
            i4++;
        }
        if (i5 == 1) {
            str2 = "gps";
        } else if (i5 == 2) {
            str2 = "cell";
        } else if (i5 != 3) {
            str = "unknown";
            bhub bhub2 = new bhub(this.f119800c.mo64309a().f119605a, this.f119800c.mo64309a().f119606b, this.f119807j, Float.NaN, str, this.f119804g, -1.0f);
            bhud bhud = bhts.f119567a;
            bhwr = bhtx2.f119581b;
            if (bhwr != null) {
                bhud.f119617d = null;
                C1225nr nrVar = new C1225nr();
                bhud.f119615b++;
                int i6 = 0;
                while (true) {
                    float f = -120.0f;
                    if (i6 >= bhwr.mo64366a()) {
                        break;
                    }
                    bhwq a5 = bhwr.mo64367a(i6);
                    nrVar.add(a5);
                    if (bhud.f119614a.containsKey(a5)) {
                        f = ((Float) bhud.f119614a.get(a5)).floatValue();
                    }
                    bhud.f119614a.put(a5, Float.valueOf(f + ((((float) ((byte) bhwr.mo64367a(i6).f119746d)) - f) / ((float) bhud.f119615b))));
                    i6++;
                }
                bhud.f119616c = bhwr.f119748a;
                int i7 = 0;
                while (true) {
                    C1245ok okVar = bhud.f119614a;
                    if (i7 >= okVar.f26809h) {
                        break;
                    }
                    bhwq bhwq = (bhwq) okVar.mo15620b(i7);
                    if (!nrVar.contains(bhwq)) {
                        float floatValue = ((Float) bhud.f119614a.mo15621c(i7)).floatValue();
                        bhud.f119614a.put(bhwq, Float.valueOf(floatValue + ((-120.0f - floatValue) / ((float) bhud.f119615b))));
                    }
                    i7++;
                }
            }
            bhts.f119568b = bhub2;
            bhts.f119569c = bhtx2.f119582c;
            if (!bhts.f119570d && !bhtx2.f119585f) {
                z = false;
            }
            bhts.f119570d = z;
        } else {
            str2 = "wifi";
        }
        str = str2;
        bhub bhub22 = new bhub(this.f119800c.mo64309a().f119605a, this.f119800c.mo64309a().f119606b, this.f119807j, Float.NaN, str, this.f119804g, -1.0f);
        bhud bhud2 = bhts.f119567a;
        bhwr = bhtx2.f119581b;
        if (bhwr != null) {
        }
        bhts.f119568b = bhub22;
        bhts.f119569c = bhtx2.f119582c;
        z = false;
        bhts.f119570d = z;
    }
}
