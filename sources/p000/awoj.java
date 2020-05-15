package p000;

/* renamed from: awoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awoj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ awom f94724a;

    public awoj(awom awom) {
        this.f94724a = awom;
    }

    public final void run() {
        awom awom = this.f94724a;
        awom.mo52808n(false);
        awom.f94740m = false;
        bxvd da = bwjw.f159882e.mo74144da();
        bmaj a = awfx.m79878a((byte[]) null);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwjw bwjw = (bwjw) da.f164949b;
        a.getClass();
        bwjw.f159885b = a;
        bwjw.f159884a |= 1;
        byte[] bArr = awom.f94735h;
        if (bArr != null) {
            ByteString a2 = ByteString.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwjw bwjw2 = (bwjw) da.f164949b;
            a2.getClass();
            bwjw2.f159884a |= 2;
            bwjw2.f159886c = a2;
        } else {
            byte[] bArr2 = awom.f94736i;
            if (bArr2 != null) {
                ByteString a3 = ByteString.m123261a(bArr2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwjw bwjw3 = (bwjw) da.f164949b;
                a3.getClass();
                bwjw3.f159884a |= 4;
                bwjw3.f159887d = a3;
            }
        }
        bwjw bwjw4 = (bwjw) da.mo74062i();
        awom.mo52864a(bwjw4, 2);
        awom.mo52900j(2);
        awom.mo52839Y().f94357a.mo52416a(bwjw4);
    }
}
