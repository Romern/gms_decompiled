package p000;

import com.google.android.gms.people.profile.AvatarView;

/* renamed from: amit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amit implements Runnable {

    /* renamed from: a */
    private final AvatarView f74948a;

    /* renamed from: b */
    private float f74949b;

    /* renamed from: c */
    private long f74950c;

    /* renamed from: d */
    private boolean f74951d;

    public amit(AvatarView avatarView) {
        this.f74948a = avatarView;
    }

    public final void run() {
        long j;
        if (!this.f74951d) {
            if (this.f74949b != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = this.f74950c;
                if (j2 != -1) {
                    j = currentTimeMillis - j2;
                } else {
                    j = 0;
                }
                float f = ((float) j) * 0.0f;
                float f2 = this.f74949b;
                if ((f2 < 0.0f && f2 + f > 0.0f) || (f2 > 0.0f && f2 + f < 0.0f)) {
                    f = -f2;
                }
                AvatarView avatarView = this.f74948a;
                avatarView.f81994r += f;
                avatarView.f81979c.postRotate(f, (float) (avatarView.getWidth() / 2), (float) (avatarView.getHeight() / 2));
                avatarView.invalidate();
                float f3 = this.f74949b + f;
                this.f74949b = f3;
                if (f3 == 0.0f) {
                    this.f74951d = true;
                }
                this.f74950c = currentTimeMillis;
            }
            if (!this.f74951d) {
                this.f74948a.post(this);
            }
        }
    }
}
