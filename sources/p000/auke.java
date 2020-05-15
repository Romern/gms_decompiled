package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: auke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class auke {

    /* renamed from: b */
    protected int f91962b;

    /* renamed from: c */
    protected int f91963c;

    /* renamed from: d */
    protected int f91964d;

    /* renamed from: a */
    public abstract int mo50597a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo50598a(auji auji, long j, Object[] objArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50602a(bxvd bxvd) {
        int i = this.f91962b;
        if (i != 0) {
            long j = (long) i;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bzzx bzzx = (bzzx) bxvd.f164949b;
            bzzx bzzx2 = bzzx.f172237al;
            bzzx.f172265a |= 64;
            bzzx.f172279h = j;
        }
        int i2 = this.f91963c;
        if (i2 != 0) {
            long j2 = (long) i2;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bzzx bzzx3 = (bzzx) bxvd.f164949b;
            bzzx bzzx4 = bzzx.f172237al;
            bzzx3.f172265a |= 128;
            bzzx3.f172280i = j2;
        }
        int i3 = this.f91964d;
        if (i3 != 0) {
            long j3 = (long) i3;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bzzx bzzx5 = (bzzx) bxvd.f164949b;
            bzzx bzzx6 = bzzx.f172237al;
            bzzx5.f172265a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            bzzx5.f172281j = j3;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo50603a(Object[] objArr, int i) {
        this.f91962b = 0;
        this.f91963c = 0;
        this.f91964d = 0;
        int length = objArr.length;
        if (length > i) {
            Object obj = objArr[i];
            if (obj instanceof Integer) {
                this.f91962b = ((Integer) obj).intValue();
            }
        }
        int i2 = i + 1;
        if (length > i2) {
            Object obj2 = objArr[i2];
            if (obj2 instanceof Integer) {
                this.f91963c = ((Integer) obj2).intValue();
            }
        }
        int i3 = i2 + 1;
        if (length > i3) {
            Object obj3 = objArr[i3];
            if (obj3 instanceof Integer) {
                this.f91964d = ((Integer) obj3).intValue();
            }
        }
    }
}
