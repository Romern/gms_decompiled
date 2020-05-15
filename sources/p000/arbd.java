package p000;

import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: arbd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arbd extends arnb {

    /* renamed from: a */
    final /* synthetic */ int f87262a;

    /* renamed from: b */
    final /* synthetic */ String f87263b;

    /* renamed from: c */
    final /* synthetic */ byte f87264c;

    /* renamed from: d */
    final /* synthetic */ arbj f87265d;

    /* renamed from: f */
    private int f87266f;

    /* renamed from: g */
    private boolean f87267g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public arbd(arbj arbj, ahcp ahcp, int i, String str, byte b) {
        super(ahcp);
        this.f87265d = arbj;
        this.f87262a = i;
        this.f87263b = str;
        this.f87264c = b;
    }

    /* renamed from: a */
    public final void mo36304a(int i) {
        if (this.f87267g || this.f87266f >= this.f87262a) {
            super.mo36304a(i);
            return;
        }
        arbj.f87275a.mo25416d("Error connecting to device, trying again", new Object[0]);
        this.f87266f++;
        this.f87265d.mo48367a(this.f87263b, this.f87264c, this);
    }

    /* renamed from: b */
    public final void mo36307b() {
        super.mo36307b();
        this.f87267g = true;
    }

    /* renamed from: b */
    public final void mo36308b(String str) {
        super.mo36308b(str);
        this.f87267g = true;
    }

    /* renamed from: a */
    public final void mo36305a(Device device, byte[] bArr) {
        super.mo36305a(device, bArr);
        this.f87267g = true;
    }
}
