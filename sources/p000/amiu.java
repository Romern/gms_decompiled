package p000;

import com.google.android.gms.people.profile.AvatarView;

/* renamed from: amiu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amiu implements Runnable {

    /* renamed from: a */
    public final AvatarView f74952a;

    /* renamed from: b */
    public float f74953b;

    /* renamed from: c */
    public float f74954c;

    /* renamed from: d */
    public boolean f74955d;

    /* renamed from: e */
    public float f74956e;

    /* renamed from: f */
    public float f74957f;

    /* renamed from: g */
    public float f74958g;

    /* renamed from: h */
    public long f74959h;

    /* renamed from: i */
    public boolean f74960i;

    /* renamed from: j */
    public boolean f74961j;

    public amiu(AvatarView avatarView) {
        this.f74952a = avatarView;
    }

    /* renamed from: a */
    public final void mo41201a() {
        this.f74960i = false;
        this.f74961j = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r6.f74955d == (r4 > r0)) goto L_0x002e;
     */
    public final void run() {
        if (!this.f74961j) {
            float currentTimeMillis = this.f74957f + (this.f74958g * ((float) (System.currentTimeMillis() - this.f74959h)));
            this.f74952a.mo46374a(currentTimeMillis, this.f74953b, this.f74954c);
            float f = this.f74956e;
            if (currentTimeMillis != f) {
            }
            this.f74952a.mo46374a(f, this.f74953b, this.f74954c);
            mo41201a();
            if (!this.f74961j) {
                this.f74952a.post(this);
            }
        }
    }
}
