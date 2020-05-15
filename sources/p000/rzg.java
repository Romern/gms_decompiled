package p000;

/* renamed from: rzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rzg {

    /* renamed from: a */
    public boolean f43886a = true;

    /* renamed from: b */
    public boolean f43887b = false;

    /* renamed from: c */
    public int f43888c = -1;

    /* renamed from: d */
    private int f43889d = -1;

    /* renamed from: e */
    private int f43890e = -1;

    /* renamed from: f */
    private boolean f43891f = false;

    /* renamed from: a */
    public final String mo25262a(String str) {
        if (str == null || !ryx.m34690b(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = this.f43889d;
        int i2 = this.f43890e;
        if (i == i2 && i != -1) {
            sb.append("s");
            sb.append(this.f43889d);
        } else if (!(i == i2 || i == -1 || i2 == -1)) {
            sb.append("w");
            sb.append(this.f43889d);
            sb.append("-h");
            sb.append(this.f43890e);
        }
        sb.append("-d-no");
        if (!this.f43886a) {
            sb.append("-ns");
        }
        if (this.f43887b) {
            sb.append("-k");
        }
        if (this.f43891f) {
            sb.append("-pf");
        }
        if (this.f43888c != -1) {
            sb.append("-rw-v");
            sb.append(this.f43888c);
        }
        return ryx.m34687a(ryx.m34684a(sb.toString(), str));
    }

    /* renamed from: a */
    public final void mo25263a() {
        this.f43891f = true;
    }

    /* renamed from: a */
    public final void mo25264a(int i) {
        this.f43890e = i;
        this.f43889d = i;
    }
}
