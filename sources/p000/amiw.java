package p000;

import com.google.android.gms.people.profile.AvatarView;

/* renamed from: amiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amiw implements Runnable {

    /* renamed from: a */
    public final AvatarView f74968a;

    /* renamed from: b */
    public float f74969b;

    /* renamed from: c */
    public float f74970c;

    /* renamed from: d */
    public long f74971d = -1;

    /* renamed from: e */
    public boolean f74972e;

    /* renamed from: f */
    public boolean f74973f;

    public amiw(AvatarView avatarView) {
        this.f74968a = avatarView;
    }

    /* renamed from: a */
    public final void mo41205a() {
        this.f74972e = false;
        this.f74973f = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r0 > 0.0f) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r1 >= 0.0f) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r1 > 0.0f) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r0 >= 0.0f) goto L_0x0043;
     */
    public final void run() {
        float f;
        float f2;
        float f3;
        if (!this.f74973f) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f74971d;
            if (j != -1) {
                f = ((float) (currentTimeMillis - j)) / 1000.0f;
            } else {
                f = 0.0f;
            }
            boolean a = this.f74968a.mo46376a(this.f74969b * f, this.f74970c * f);
            this.f74971d = currentTimeMillis;
            float f4 = f * 1000.0f;
            float f5 = this.f74969b;
            if (f5 > 0.0f) {
                f2 = f5 - f4;
                this.f74969b = f2;
            } else {
                f2 = f5 + f4;
                this.f74969b = f2;
            }
            this.f74969b = 0.0f;
            f2 = 0.0f;
            float f6 = this.f74970c;
            if (f6 > 0.0f) {
                f3 = f6 - f4;
                this.f74970c = f3;
            } else {
                f3 = f6 + f4;
                this.f74970c = f3;
            }
            this.f74970c = 0.0f;
            f3 = 0.0f;
            if ((f2 == 0.0f && f3 == 0.0f) || !a) {
                mo41205a();
                this.f74968a.mo46377b();
            }
            if (!this.f74973f) {
                this.f74968a.post(this);
            }
        }
    }
}
