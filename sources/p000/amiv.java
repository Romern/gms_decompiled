package p000;

import com.google.android.gms.people.profile.AvatarView;

/* renamed from: amiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amiv implements Runnable {

    /* renamed from: a */
    public final AvatarView f74962a;

    /* renamed from: b */
    public float f74963b;

    /* renamed from: c */
    public float f74964c;

    /* renamed from: d */
    public long f74965d = -1;

    /* renamed from: e */
    public boolean f74966e;

    /* renamed from: f */
    public boolean f74967f;

    public amiv(AvatarView avatarView) {
        this.f74962a = avatarView;
    }

    /* renamed from: a */
    public final void mo41203a() {
        this.f74966e = false;
        this.f74967f = true;
    }

    public final void run() {
        float f;
        float f2;
        float f3;
        if (!this.f74967f) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f74965d;
            if (j != -1) {
                f = (float) (currentTimeMillis - j);
            } else {
                f = 0.0f;
            }
            if (j == -1) {
                this.f74965d = currentTimeMillis;
            }
            if (f < 100.0f) {
                float f4 = 100.0f - f;
                f3 = (this.f74963b / f4) * 10.0f;
                f2 = (this.f74964c / f4) * 10.0f;
                if (Math.abs(f3) > Math.abs(this.f74963b) || Float.isNaN(f3)) {
                    f3 = this.f74963b;
                }
                if (Math.abs(f2) > Math.abs(this.f74964c) || Float.isNaN(f2)) {
                    f2 = this.f74964c;
                }
            } else {
                f3 = this.f74963b;
                f2 = this.f74964c;
            }
            this.f74962a.mo46376a(f3, f2);
            float f5 = this.f74963b - f3;
            this.f74963b = f5;
            float f6 = this.f74964c - f2;
            this.f74964c = f6;
            if (f5 == 0.0f && f6 == 0.0f) {
                mo41203a();
            }
            if (!this.f74967f) {
                this.f74962a.post(this);
            }
        }
    }
}
